package net.xanthian.arbiters_seal.status_effects;

import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;

public class ThornsStatusEffect extends StatusEffect {
    public ThornsStatusEffect() {
        super(StatusEffectCategory.BENEFICIAL, 16737294);
    }

    @Override
    public void applyUpdateEffect(LivingEntity livingEntity, int amplifier) {
        if (!livingEntity.world.isClient()) {
            Entity attacker = livingEntity.getAttacker();
            int level = 2;

            // if hit
            if (livingEntity.hurtTime == 9) {
                if (attacker != null){
                    attacker.damage(DamageSource.thorns(livingEntity), amplifier + level);
                }
            }
        }
        super.applyUpdateEffect(livingEntity, amplifier);
    }

    @Override
    public boolean canApplyUpdateEffect(int pDuration, int amplifier) {
        return true;
    }
}