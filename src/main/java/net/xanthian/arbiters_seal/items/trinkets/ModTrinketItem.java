package net.xanthian.arbiters_seal.items.trinkets;

import dev.emi.trinkets.api.TrinketItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.xanthian.arbiters_seal.Init;

public class ModTrinketItem extends TrinketItem {
    public ModTrinketItem() {
        super(new FabricItemSettings().group(Init.ARBITERS_SEAL_ARMOR));
    }
}
