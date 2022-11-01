package net.xanthian.arbiters_seal.items.potions;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class RemedyPotion extends ModPotions {

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        user.getStatusEffects().clear();
        return ItemStack.EMPTY;
    }

    @Override
    public int getMaxUseTime(ItemStack stack) {
        return 60;
    }
}