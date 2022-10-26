package net.xanthian.arbiters_seal.items.gadgets.gadgets;

import net.minecraft.item.ItemStack;
import net.minecraft.util.Rarity;
import net.xanthian.arbiters_seal.items.gadgets.ModGadgetItem;

public class SpeedGenerator extends ModGadgetItem {

    @Override
    public Rarity getRarity(ItemStack stack) {
        return Rarity.UNCOMMON;
    }
}
