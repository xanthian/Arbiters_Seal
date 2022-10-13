package net.xanthian.arbiters_seal.items.trinkets.rings;

import net.minecraft.item.ItemStack;
import net.minecraft.util.Rarity;
import net.xanthian.arbiters_seal.items.trinkets.ModTrinketItem;

public class PhoenixBand extends ModTrinketItem {

    @Override
    public Rarity getRarity(ItemStack stack) {
        return Rarity.RARE;
    }
}