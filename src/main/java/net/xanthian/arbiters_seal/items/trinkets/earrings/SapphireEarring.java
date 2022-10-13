package net.xanthian.arbiters_seal.items.trinkets.earrings;

import dev.emi.trinkets.api.SlotReference;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.xanthian.arbiters_seal.items.trinkets.ModTrinketItem;
import net.xanthian.arbiters_seal.status_effects.ModStatusEffects;

public class SapphireEarring extends ModTrinketItem {

    @Override
    public void tick(ItemStack stack, SlotReference slot, LivingEntity entity) {
        if (entity instanceof PlayerEntity player) {
            if (player.getStatusEffect(StatusEffects.BLINDNESS) != null) {
                player.removeStatusEffect(StatusEffects.BLINDNESS);
            }
            if (player.getStatusEffect(ModStatusEffects.BLEED) != null) {
                player.removeStatusEffect(ModStatusEffects.BLEED);
            }
            if (player.getStatusEffect(StatusEffects.SLOWNESS) != null) {
                player.removeStatusEffect(StatusEffects.SLOWNESS);
            }
            if (player.getStatusEffect(ModStatusEffects.ROOT) != null) {
                player.removeStatusEffect(ModStatusEffects.ROOT);
            }
            super.tick(stack, slot, entity);
        }
    }
}