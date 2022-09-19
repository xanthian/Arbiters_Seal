package net.xanthian.arbiters_seal.status_effects;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;

public class RootStatusEffect extends StatusEffect {
    public RootStatusEffect() {
        super(StatusEffectCategory.NEUTRAL, 9126145);
    }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        int i;
            i = 15 >> amplifier;
            if (i > 0) {
                return duration % i == 0;
            }
            else {
                return true;
            }
    }

    @Override
    public void applyUpdateEffect(LivingEntity entity, int amplifier) {
        if (!entity.world.isClient()) {
            entity.teleport(entity.getX(), entity.getY(), entity.getZ());
            entity.setVelocityClient(0, 0, 0);
            entity.setVelocity(0, 0, 0);
        }
        super.applyUpdateEffect(entity, amplifier);
    }
}
