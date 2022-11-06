package net.xanthian.arbiters_seal.items.trinkets.rings;

import dev.emi.trinkets.api.SlotReference;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Rarity;
import net.xanthian.arbiters_seal.items.trinkets.ModTrinketItem;
import net.xanthian.arbiters_seal.status_effects.ModStatusEffects;

public class PhoenixBand extends ModTrinketItem {

    @Override
    public Rarity getRarity(ItemStack stack) {
        return Rarity.RARE;
    }

    @Override
    public void onEquip(ItemStack stack, SlotReference slot, LivingEntity entity) {
        if (entity instanceof PlayerEntity player) {
            player.addStatusEffect(new StatusEffectInstance(ModStatusEffects.REBIRTH,999999999,0,false, false,true));
        }
        super.onEquip(stack, slot, entity);
    }

    @Override
    public void onUnequip(ItemStack stack, SlotReference slot, LivingEntity entity) {
        if (entity instanceof PlayerEntity player) {
            if (player.getStatusEffect(ModStatusEffects.REBIRTH) != null)
                player.removeStatusEffect(ModStatusEffects.REBIRTH);
        }
        super.onUnequip(stack, slot, entity);
    }

}