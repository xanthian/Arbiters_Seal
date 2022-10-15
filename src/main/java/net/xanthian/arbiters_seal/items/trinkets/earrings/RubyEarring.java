package net.xanthian.arbiters_seal.items.trinkets.earrings;

import dev.emi.trinkets.api.SlotReference;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.xanthian.arbiters_seal.items.trinkets.ModTrinketItem;
import net.xanthian.arbiters_seal.status_effects.ModStatusEffects;

public class RubyEarring extends ModTrinketItem {
    @Override
    public void tick(ItemStack stack, SlotReference slot, LivingEntity entity) {
        if (entity instanceof PlayerEntity player) {
            if (player.getStatusEffect(StatusEffects.SLOWNESS) != null) {
                player.removeStatusEffect(StatusEffects.SLOWNESS);
            }
            if (player.getStatusEffect(ModStatusEffects.MUTE) != null) {
                player.removeStatusEffect(ModStatusEffects.MUTE);
            }
            if (player.getStatusEffect(ModStatusEffects.SLEEP) != null) {
                player.removeStatusEffect(ModStatusEffects.SLEEP);
            }
            super.tick(stack, slot, entity);
        }
    }
}