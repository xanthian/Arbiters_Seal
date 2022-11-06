package net.xanthian.arbiters_seal.items.trinkets.rings;

import dev.emi.trinkets.api.SlotReference;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.xanthian.arbiters_seal.items.trinkets.ModTrinketItem;
import net.xanthian.arbiters_seal.status_effects.ModStatusEffects;

public class OathBand extends ModTrinketItem {

    @Override
    public void tick(ItemStack stack, SlotReference slot, LivingEntity entity) {
        if (entity instanceof PlayerEntity player) {
            if (player.getStatusEffect(ModStatusEffects.CHARM) != null) {
                player.removeStatusEffect(ModStatusEffects.CHARM);
            }
            super.tick(stack, slot, entity);
        }
    }
}