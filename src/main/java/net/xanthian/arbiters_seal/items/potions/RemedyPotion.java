package net.xanthian.arbiters_seal.items.potions;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import java.util.List;

public class RemedyPotion extends ModPotions {

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        if (user instanceof PlayerEntity player) {
            List<StatusEffect> list = player.getActiveStatusEffects().keySet().stream().filter(effect ->
                    effect.getCategory() == (StatusEffectCategory.HARMFUL)).toList();
            list.forEach(player::removeStatusEffect);
        }
        return ItemStack.EMPTY;
    }

    @Override
    public int getMaxUseTime(ItemStack stack) {
        return 60;
    }
}