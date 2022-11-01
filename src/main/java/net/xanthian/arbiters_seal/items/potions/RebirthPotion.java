package net.xanthian.arbiters_seal.items.potions;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.xanthian.arbiters_seal.status_effects.ModStatusEffects;

public class RebirthPotion extends ModPotions{

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        user.addStatusEffect(new StatusEffectInstance(ModStatusEffects.REBIRTH, 6000, 0, false, false, true));
        return ItemStack.EMPTY;
    }

    @Override
    public int getMaxUseTime(ItemStack stack) {
        return 80;
    }
}