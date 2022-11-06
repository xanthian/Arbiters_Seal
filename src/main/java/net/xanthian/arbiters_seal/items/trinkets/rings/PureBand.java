package net.xanthian.arbiters_seal.items.trinkets.rings;

import dev.emi.trinkets.api.SlotReference;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.xanthian.arbiters_seal.items.trinkets.ModTrinketItem;

public class PureBand extends ModTrinketItem {

    @Override
    public void tick(ItemStack stack, SlotReference slot, LivingEntity entity) {
        if (entity instanceof PlayerEntity player) {
            if (player.getStatusEffect(StatusEffects.POISON) != null) {
                player.removeStatusEffect(StatusEffects.POISON);
            }
            super.tick(stack, slot, entity);
        }
    }
}