package net.xanthian.arbiters_seal.items.tools.bows;

import net.minecraft.item.ItemStack;
import net.minecraft.util.Rarity;
import net.xanthian.arbiters_seal.items.tools.ModBowItem;
import net.xanthian.arbiters_seal.material.ModBowTiers;

public class Dominance extends ModBowItem {
    public Dominance(ModBowTiers tier) {
        super(tier);
    }

    @Override
    public float getCrit() {
        return 0.15F;
    }

        @Override
        public Rarity getRarity(ItemStack stack) {
        return Rarity.UNCOMMON;
    }
}
