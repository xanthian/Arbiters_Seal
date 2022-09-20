package net.xanthian.arbiters_seal.status_effects;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

import java.util.Objects;

public class LifeRecoveryCooldownEffect extends StatusEffect {
    public LifeRecoveryCooldownEffect() {
        super(StatusEffectCategory.NEUTRAL, 0);
    }


    @Override
    public void applyUpdateEffect(LivingEntity entity, int amplifier) {
        if(entity.getStatusEffect(StatusEffects.INSTANT_HEALTH) !=null) {
            int currentDuration = Objects.requireNonNull(entity.getStatusEffect(ModStatusEffects.LIFERECOVERY_COOLDOWN)).getDuration();
            entity.addStatusEffect(new StatusEffectInstance(ModStatusEffects.LIFERECOVERY_COOLDOWN, currentDuration + 30));
        }
        super.applyUpdateEffect(entity, amplifier);
    }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return duration % 30 == 0;
    }
}