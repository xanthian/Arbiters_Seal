package net.xanthian.arbiters_seal.items.trinkets.rings;

import dev.emi.trinkets.api.SlotReference;
import dev.emi.trinkets.api.TrinketsApi;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Hand;
import net.minecraft.util.Rarity;
import net.xanthian.arbiters_seal.items.trinkets.ModTrinketItem;
import net.xanthian.arbiters_seal.items.trinkets.Trinkets;
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
            //TrinketsApi.getTrinketComponent(player).get().isEquipped(Trinkets.PHOENIX_BAND);
        }
        super.onEquip(stack, slot, entity);
    }

    @Override
    public void onUnequip(ItemStack stack, SlotReference slot, LivingEntity entity) {
        if (entity instanceof PlayerEntity player) {
            if (player.getStatusEffect(ModStatusEffects.REBIRTH) != null)
                player.removeStatusEffect(ModStatusEffects.REBIRTH);

            ItemStack itemStack = null;
            Hand[] var4 = Hand.values();
            int var5 = var4.length;

            for(int var6 = 0; var6 < var5; ++var6) {
                Hand hand = var4[var6];
                ItemStack itemStack2 = player.getStackInHand(hand);
                if (itemStack2.isOf(Items.TOTEM_OF_UNDYING) || TrinketsApi.getTrinketComponent(player).get().isEquipped(Trinkets.PHOENIX_BAND)){
                    itemStack = itemStack2.copy();
                    itemStack2.decrement(1);
                    break;
                }
            }
        }
        super.onUnequip(stack, slot, entity);
    }

}