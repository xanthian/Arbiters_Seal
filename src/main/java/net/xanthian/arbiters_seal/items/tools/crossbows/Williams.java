package net.xanthian.arbiters_seal.items.tools.crossbows;

import net.xanthian.arbiters_seal.items.tools.ModCrossbowItem;
import net.xanthian.arbiters_seal.material.ModBowTiers;

public class Williams extends ModCrossbowItem {
    public Williams(ModBowTiers tier) {
        super(tier);
    }

    @Override
    public float getCrit() {
        return 0.05F;
    }
}
