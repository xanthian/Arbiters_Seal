package net.xanthian.arbiters_seal.items.trinkets.necklaces;

import net.minecraft.item.ItemStack;
import net.minecraft.util.Rarity;
import net.xanthian.arbiters_seal.items.trinkets.ModTrinketItem;

public class AncientLocket extends ModTrinketItem {

    @Override
    public Rarity getRarity(ItemStack stack) {
        return Rarity.UNCOMMON;
    }
}
