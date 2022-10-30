package net.xanthian.arbiters_seal.status_effects;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.xanthian.arbiters_seal.util.ModDamageSource;

public class BleedStatusEffect extends StatusEffect {
    public BleedStatusEffect() {
        super(StatusEffectCategory.HARMFUL, 16266787);
    }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        int i;
        i = 25 >> amplifier;
        if (i > 0) {
            return duration % i == 0;
        } else {
            return true;
        }
    }

    @Override
    public void applyUpdateEffect(LivingEntity entity, int amplifier) {
        if (entity.getHealth() > 1.5F) {
            entity.damage(ModDamageSource.BLEEDING, 1.5f * (amplifier + 1));
        }
    }
}