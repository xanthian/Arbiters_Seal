package net.xanthian.arbiters_seal.items.trinkets.rings;

import dev.emi.trinkets.api.SlotReference;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.xanthian.arbiters_seal.items.trinkets.ModTrinketItem;

public class ShiningBand extends ModTrinketItem {

    @Override
    public void tick(ItemStack stack, SlotReference slot, LivingEntity entity) {
        if (entity instanceof PlayerEntity player) {
            if (player.getStatusEffect(StatusEffects.BLINDNESS) != null) {
                player.removeStatusEffect(StatusEffects.BLINDNESS);
            }
            super.tick(stack, slot, entity);
        }
    }
}
