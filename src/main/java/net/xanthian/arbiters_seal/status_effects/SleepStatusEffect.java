package net.xanthian.arbiters_seal.status_effects;

import net.minecraft.entity.EntityPose;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.AttributeContainer;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.world.World;

public class SleepStatusEffect extends StatusEffect {
    public SleepStatusEffect() {
        super(StatusEffectCategory.HARMFUL, 8100544);
    }

    @Override
    public void onApplied(LivingEntity entity, AttributeContainer attributes, int amplifier) {
        World world = entity.getWorld();
        if (entity instanceof MobEntity) {
            if (!world.isClient()) {
                ((MobEntity) entity).setAiDisabled(true);
                (entity).setPose(EntityPose.SLEEPING);
                }
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
    }

    @Override
    public boolean canApplyUpdateEffect(int pDuration, int amplifier) {
        return true;
    }
}