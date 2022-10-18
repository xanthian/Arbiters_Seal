package net.xanthian.arbiters_seal.items.potions;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.xanthian.arbiters_seal.Init;

public class ModPotions extends Item {
    public ModPotions() {
        super(new FabricItemSettings().group(Init.ARBITERS_SEAL_ITEMS));
    }

    @Override
    public boolean hasGlint(ItemStack stack) {
        return false;
    }
}