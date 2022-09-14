package net.xanthian.arbiters_seal.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.CrossbowItem;
import net.xanthian.arbiters_seal.Init;

public class ModCrossbowItem extends CrossbowItem {
    public ModCrossbowItem() {
        super(new FabricItemSettings().group(Init.ARBITERS_SEAL));
    }
}