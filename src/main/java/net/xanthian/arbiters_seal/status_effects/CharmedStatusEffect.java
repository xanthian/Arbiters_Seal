package net.xanthian.arbiters_seal.status_effects;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.AttributeContainer;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.mob.MobEntity;

public class CharmedStatusEffect extends StatusEffect {
    public CharmedStatusEffect() {
        super(StatusEffectCategory.NEUTRAL, 24835229);
    }

    @Override
    public void onApplied(LivingEntity entity, AttributeContainer attributes, int amplifier) {
        if (entity instanceof MobEntity) {
            ((MobEntity) entity).setAiDisabled(true);
            super.onApplied(entity, attributes, amplifier);
        }
    }
}