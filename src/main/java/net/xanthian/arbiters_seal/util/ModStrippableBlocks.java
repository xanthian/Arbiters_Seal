package net.xanthian.arbiters_seal.util;

import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.xanthian.arbiters_seal.blocks.ModBlocks;

public class ModStrippableBlocks {
    public static void registerStrippables() {
        StrippableBlockRegistry.register(ModBlocks.EBONY_WOOD, ModBlocks.STRIPPED_EBONY_WOOD);
        StrippableBlockRegistry.register(ModBlocks.EBONY_LOG, ModBlocks.STRIPPED_EBONY_LOG);
    }
}
