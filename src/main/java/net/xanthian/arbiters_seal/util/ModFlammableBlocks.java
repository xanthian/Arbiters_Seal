package net.xanthian.arbiters_seal.util;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.xanthian.arbiters_seal.blocks.ModBlocks;

public class ModFlammableBlocks {
    public static void registerFlammableBlocks() {
        FlammableBlockRegistry registry = FlammableBlockRegistry.getDefaultInstance();

        registry.add(ModBlocks.EBONY_PLANKS, 5, 20);
        registry.add(ModBlocks.EBONY_SLAB, 5, 20);
        registry.add(ModBlocks.EBONY_FENCE_GATE, 5, 20);
        registry.add(ModBlocks.EBONY_FENCE, 5, 20);
        registry.add(ModBlocks.EBONY_STAIRS, 5, 20);
        registry.add(ModBlocks.EBONY_LOG, 5, 5);
        registry.add(ModBlocks.EBONY_WOOD, 5, 5);
        registry.add(ModBlocks.EBONY_LEAVES, 30, 60);
        registry.add(ModBlocks.EBONY_COMPOSTER, 5, 20);
        registry.add(ModBlocks.EBONY_BOOKSHELF, 30, 20);
        registry.add(ModBlocks.ALOE_VERA, 60, 100);
        registry.add(ModBlocks.ANGEL_TEARS, 60, 100);
    }
}
