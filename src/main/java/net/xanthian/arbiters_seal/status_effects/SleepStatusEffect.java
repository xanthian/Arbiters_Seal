package net.xanthian.arbiters_seal.status_effects;

import net.minecraft.entity.EntityPose;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.AttributeContainer;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.mob.MobEntity;

public class SleepStatusEffect extends StatusEffect {
    public SleepStatusEffect() {
        super(StatusEffectCategory.HARMFUL, 8100544);
    }

    @Override
    public void onApplied(LivingEntity entity, AttributeContainer attributes, int amplifier) {
        if (entity instanceof MobEntity) {
            ((MobEntity) entity).setAiDisabled(true);
            (entity).setPose(EntityPose.SLEEPING);
        }
        super.onApplied(entity, attributes, amplifier);
    }

        @Override
        public void onRemoved (LivingEntity entity, AttributeContainer attributes,int amplifier){
            if (entity instanceof MobEntity) {
                ((MobEntity) entity).setAiDisabled(false);
                (entity).setPose(EntityPose.STANDING);
                super.onApplied(entity, attributes, amplifier);

        }
    }
    @Override
    public void applyUpdateEffect(LivingEntity entity, int amplifier) {
        if (!entity.world.isClient()) {
            double x = entity.getX();
            double y = entity.getY();
            double z = entity.getZ();
            entity.teleport(x, y, z);
            entity.setVelocity(0, 0, 0);
        }

        super.applyUpdateEffect(entity, amplifier);
    }

    @Override
    public boolean canApplyUpdateEffect(int pDuration, int amplifier) {
        return true;
    }
}