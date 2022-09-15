package net.xanthian.arbiters_seal.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.BowItem;
import net.xanthian.arbiters_seal.Init;

public class ModBowItem extends BowItem {
    public ModBowItem() {
        super(new FabricItemSettings().group(Init.ARBITERS_SEAL_WEAPONS));
    }
}