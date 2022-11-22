package net.xanthian.arbiters_seal.entity.mob;

import net.minecraft.block.BlockState;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityPose;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.ai.pathing.PathNodeType;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.data.DataTracker;
import net.minecraft.entity.data.TrackedData;
import net.minecraft.entity.data.TrackedDataHandlerRegistry;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.FireballEntity;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.builder.AnimationBuilder;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;

public class AeothEntity extends HostileEntity implements IAnimatable {
    private static final TrackedData<Boolean> SHOOTING;
    private int fireballStrength = 1;
    private AnimationFactory factory = new AnimationFactory(this);

    public AeothEntity(EntityType<? extends HostileEntity> entityType, World world) {
        super(entityType, world);
        this.setPathfindingPenalty(PathNodeType.LAVA, 8.0F);
        this.setPathfindingPenalty(PathNodeType.DANGER_FIRE, 0.0F);
        this.setPathfindingPenalty(PathNodeType.DAMAGE_FIRE, 0.0F);
        this.experiencePoints = 20;
    }

    @Override
    public boolean isFireImmune() {
        return true;
    }

    @Override
    public float getBrightnessAtEyes() {
        return 1.0F;
    }

    public static DefaultAttributeContainer.Builder setAttributes() {
        return HostileEntity.createMobAttributes()
                .add(EntityAttributes.GENERIC_MAX_HEALTH, 20.0D)
                .add(EntityAttributes.GENERIC_ATTACK_DAMAGE, 4.0f)
                .add(EntityAttributes.GENERIC_ATTACK_SPEED, 2.0f)
                .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.4f)
                .add(EntityAttributes.GENERIC_FOLLOW_RANGE, 40.0D);
    }

    protected float getActiveEyeHeight(EntityPose pose, EntityDimensions dimensions) {
        return 1.55F;
    }

    @Override
    protected void initGoals() {
        this.goalSelector.add(1, new MeleeAttackGoal(this,1,false));
        this.goalSelector.add(4, new ShootFireballGoal(this));
        this.goalSelector.add(5, new GoToWalkTargetGoal(this, 1.0));
        this.goalSelector.add(7, new WanderAroundFarGoal(this, 1.0, 0.0F));
        this.goalSelector.add(8, new LookAtEntityGoal(this, PlayerEntity.class, 8.0F));
        this.goalSelector.add(8, new LookAroundGoal(this));
        this.goalSelector.add(9, new SwimGoal(this));


        this.targetSelector.add(2, new ActiveTargetGoal(this, PlayerEntity.class, true));
    }

    private <E extends IAnimatable> PlayState predicate(AnimationEvent<E> event) {
        if (event.isMoving()) {
            event.getController().setAnimation(new AnimationBuilder().addAnimation("aeoth.animation.move", true));
            return PlayState.CONTINUE;
        }

        event.getController().setAnimation(new AnimationBuilder().addAnimation("aeoth.animation.idle", true));
        return PlayState.CONTINUE;
    }

    @Override
    public void registerControllers(AnimationData animationData) {
        animationData.addAnimationController(new AnimationController(this, "controller",
                0, this::predicate));
    }

    @Override
    public AnimationFactory getFactory() {
        return factory;
    }

    @Override
    protected SoundEvent getHurtSound(DamageSource source) {
        return SoundEvents.ENTITY_ELDER_GUARDIAN_HURT;
    }

    @Override
    protected void playStepSound(BlockPos pos, BlockState state) {
        this.playSound(this.getStepSound(), 0.15F, 1.0F);
    }

    protected SoundEvent getStepSound() {
        return SoundEvents.ENTITY_SPIDER_STEP;
    }

    static {
        SHOOTING = DataTracker.registerData(AeothEntity.class, TrackedDataHandlerRegistry.BOOLEAN);
    }

    public boolean isShooting() {
        return (Boolean)this.dataTracker.get(SHOOTING);
    }

    public void setShooting(boolean shooting) {
        this.dataTracker.set(SHOOTING, shooting);
    }

    @Override
    protected void initDataTracker() {
        super.initDataTracker();
        this.dataTracker.startTracking(SHOOTING, false);
    }

    public int getFireballStrength() {
        return this.fireballStrength;
    }

    @Override
    protected boolean isDisallowedInPeaceful() {
        return true;
    }

    private static boolean isFireballFromPlayer(DamageSource damageSource) {
        return damageSource.getSource() instanceof FireballEntity && damageSource.getAttacker() instanceof PlayerEntity;
    }
    @Override
    public boolean isInvulnerableTo(DamageSource damageSource) {
        return !isFireballFromPlayer(damageSource) && super.isInvulnerableTo(damageSource);
    }
    @Override
    public boolean damage(DamageSource source, float amount) {
        if (isFireballFromPlayer(source)) {
            super.damage(source, 1000.0F);
            return true;
        } else {
            return this.isInvulnerableTo(source) ? true : super.damage(source, amount);
        }
    }

    private static class ShootFireballGoal extends Goal {
        private final AeothEntity aeoth;
        public int cooldown;

        public ShootFireballGoal(AeothEntity aeoth) {
            this.aeoth = aeoth;
        }
        @Override
        public boolean canStart() {
            return this.aeoth.getTarget() != null;
        }
        @Override
        public void start() {
            this.cooldown = 0;
        }
        @Override
        public void stop() {
            this.aeoth.setShooting(false);
        }
        @Override
        public boolean shouldRunEveryTick() {
            return true;
        }
        @Override
        public void tick() {
            LivingEntity livingEntity = this.aeoth.getTarget();
            if (livingEntity != null) {
                double d = 64.0;
                if (livingEntity.squaredDistanceTo(this.aeoth) < 4096.0 && this.aeoth.canSee(livingEntity)) {
                    World world = this.aeoth.world;
                    ++this.cooldown;
                    if (this.cooldown == 10 && !this.aeoth.isSilent()) {
                        world.syncWorldEvent((PlayerEntity)null, 1015, this.aeoth.getBlockPos(), 0);
                    }

                    if (this.cooldown == 20) {
                        double e = 4.0;
                        Vec3d vec3d = this.aeoth.getRotationVec(1.0F);
                        double f = livingEntity.getX() - (this.aeoth.getX() + vec3d.x * 4.0);
                        double g = livingEntity.getBodyY(0.5) - (0.5 + this.aeoth.getBodyY(0.5));
                        double h = livingEntity.getZ() - (this.aeoth.getZ() + vec3d.z * 4.0);
                        if (!this.aeoth.isSilent()) {
                            world.syncWorldEvent((PlayerEntity)null, 1016, this.aeoth.getBlockPos(), 0);
                        }

                        FireballEntity fireballEntity = new FireballEntity(world, this.aeoth, f, g, h, this.aeoth.getFireballStrength());
                        fireballEntity.setPosition(this.aeoth.getX(), this.aeoth.getBodyY(0.5) + 0.5, fireballEntity.getZ());
                        world.spawnEntity(fireballEntity);
                        this.cooldown = -40;
                    }
                } else if (this.cooldown > 0) {
                    --this.cooldown;
                }

                this.aeoth.setShooting(this.cooldown > 10);
            }
        }
    }
}