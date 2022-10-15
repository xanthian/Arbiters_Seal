package net.xanthian.arbiters_seal.status_effects;

import dev.emi.trinkets.api.TrinketsApi;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.xanthian.arbiters_seal.items.trinkets.Trinkets;

public class RebirthStatusEffect extends StatusEffect {
    public RebirthStatusEffect() {
        super(StatusEffectCategory.BENEFICIAL, 16737294);
    }

    @Override
    public void applyUpdateEffect(LivingEntity entity, int amplifier) {
        if (!entity.world.isClient && entity instanceof PlayerEntity player) {
            player.onDeath(DamageSource.FALL);
            player.heal(4.0F);
            player.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 100, 0, false, false, false));
            System.out.println("Player Died");
            boolean slot = TrinketsApi.getTrinketComponent(player).get().isEquipped(Trinkets.PHOENIX_BAND);

        }
        super.applyUpdateEffect(entity, amplifier);
    }

}
