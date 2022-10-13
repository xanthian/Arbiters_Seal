package net.xanthian.arbiters_seal.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.xanthian.arbiters_seal.Init;

public class ModItem extends Item {
    public ModItem() {
        super(new FabricItemSettings().group(Init.ARBITERS_SEAL_ITEMS));
    }
}
