package net.xanthian.arbiters_seal.items.trinkets.earrings;

import net.minecraft.item.ItemStack;
import net.minecraft.util.Rarity;
import net.xanthian.arbiters_seal.items.trinkets.ModTrinketItem;

public class AmethystEarring extends ModTrinketItem {

    @Override
    public Rarity getRarity(ItemStack stack) {
        return Rarity.UNCOMMON;
    }
}
