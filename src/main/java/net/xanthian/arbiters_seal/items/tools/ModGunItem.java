package net.xanthian.arbiters_seal.items.tools;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.BowItem;
import net.xanthian.arbiters_seal.Init;

public class ModGunItem extends BowItem {
    public ModGunItem() {
        super(new FabricItemSettings().group(Init.ARBITERS_SEAL_WEAPONS));
    }
}
