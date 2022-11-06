package net.xanthian.arbiters_seal.items.trinkets.earrings;

import dev.emi.trinkets.api.SlotReference;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Rarity;
import net.xanthian.arbiters_seal.items.trinkets.ModTrinketItem;

import java.util.List;

public class AmethystEarring extends ModTrinketItem {

    @Override
    public void tick(ItemStack stack, SlotReference slot, LivingEntity entity) {
        if (entity instanceof PlayerEntity player) {
            List<StatusEffect> list = player.getActiveStatusEffects().keySet().stream().filter(effect ->
                    effect.getCategory() == (StatusEffectCategory.HARMFUL)).toList();
            list.forEach(player::removeStatusEffect);
            super.tick(stack, slot, entity);
        }
    }

    @Override
    public Rarity getRarity(ItemStack stack) {
        return Rarity.UNCOMMON;
    }
}