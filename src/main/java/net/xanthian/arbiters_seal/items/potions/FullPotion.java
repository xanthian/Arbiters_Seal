package net.xanthian.arbiters_seal.items.potions;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class FullPotion extends ModPotions {

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        user.heal(user.getMaxHealth()-user.getHealth());
        return ItemStack.EMPTY;
    }

    @Override
    public int getMaxUseTime(ItemStack stack) {
        return 60;
    }
}