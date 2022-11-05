package net.xanthian.arbiters_seal.items.tools.bows;

import net.xanthian.arbiters_seal.items.tools.ModBowItem;
import net.xanthian.arbiters_seal.material.ModBowTiers;

public class YoichiBow extends ModBowItem {
    public YoichiBow(ModBowTiers tier) {
        super(tier);
    }

    @Override
    public float getCrit() {
        return 0.05F;
    }
}
