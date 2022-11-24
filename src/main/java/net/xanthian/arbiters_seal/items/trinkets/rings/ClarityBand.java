package net.xanthian.arbiters_seal.items.trinkets.rings;

import dev.emi.trinkets.api.SlotReference;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraft.world.WorldProperties;
import net.xanthian.arbiters_seal.items.trinkets.ModTrinketItem;
import net.xanthian.arbiters_seal.status_effects.ModStatusEffects;

public class ClarityBand extends ModTrinketItem {

    @Override
    public void tick(ItemStack stack, SlotReference slot, LivingEntity entity) {
        World world = entity.getWorld();
        WorldProperties worldProperties = world.getLevelProperties();
        worldProperties.setRaining(true);

        if (entity instanceof PlayerEntity player) {

            if (player.getStatusEffect(ModStatusEffects.BERSERK) != null) {
                player.removeStatusEffect(ModStatusEffects.BERSERK);
            }
            super.tick(stack, slot, entity);
        }
    }
}