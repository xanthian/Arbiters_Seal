package net.xanthian.arbiters_seal.status_effects;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.AttributeContainer;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;

public class CharmedStatusEffect extends StatusEffect {
    public CharmedStatusEffect() {
        super(StatusEffectCategory.NEUTRAL, 16711851);
    }

    @Override
    public void onApplied(LivingEntity entity, AttributeContainer attributes, int amplifier) {
        if (entity instanceof MobEntity) {
            ((MobEntity) entity).setAiDisabled(true);
            entity.world.playSound(null, entity.getX(), entity.getY(), entity.getZ(), SoundEvents.ENTITY_ZOMBIE_VILLAGER_CURE, SoundCategory.NEUTRAL, 1.0F, 1.0F);
        }
            super.onApplied(entity, attributes, amplifier);
    }
    @Override
    public void onRemoved(LivingEntity entity, AttributeContainer attributes, int amplifier) {
        if (entity instanceof MobEntity) {
            ((MobEntity) entity).setAiDisabled(false);
        }
            super.onApplied(entity, attributes, amplifier);
    }
}