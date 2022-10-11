package net.xanthian.arbiters_seal.util;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.xanthian.arbiters_seal.blocks.ModBlocks;
import net.xanthian.arbiters_seal.items.ModItems;
import net.xanthian.arbiters_seal.items.shields.Shields;
import net.xanthian.arbiters_seal.items.tools.Daggers;
import net.xanthian.arbiters_seal.items.tools.Rods;
import net.xanthian.arbiters_seal.items.tools.Staffs;
import net.xanthian.arbiters_seal.items.tools.Swords;

public class ModFuelItems {
    public static void  registerFuelItems(){
        registerFuels();
    }

    private static void registerFuels(){
        FuelRegistry registry = FuelRegistry.INSTANCE;

        registry.add(ModBlocks.EBONY_BARREL, 300);
        registry.add(ModBlocks.EBONY_BOOKSHELF, 300);
        registry.add(ModBlocks.EBONY_BUTTON, 100);
        registry.add(ModBlocks.EBONY_COMPOSTER, 300);
        registry.add(ModBlocks.EBONY_CRAFTING_TABLE, 300);
        registry.add(ModBlocks.EBONY_DOOR, 200);
        registry.add(ModBlocks.EBONY_FENCE, 300);
        registry.add(ModBlocks.EBONY_FENCE_GATE, 300);
        registry.add(ModBlocks.EBONY_LADDER, 300);
        registry.add(ModBlocks.EBONY_LOG, 300);
        registry.add(ModBlocks.EBONY_PLANKS, 300);
        registry.add(ModBlocks.EBONY_PRESSURE_PLATE, 300);
        registry.add(ModBlocks.EBONY_SAPLING, 100);
        registry.add(ModItems.EBONY_SIGN, 100);
        registry.add(ModBlocks.EBONY_SLAB, 150);
        registry.add(ModBlocks.EBONY_STAIRS, 300);
        registry.add(ModBlocks.EBONY_TRAPDOOR, 300);
        registry.add(ModBlocks.EBONY_WOOD, 300);
        registry.add(ModBlocks.STRIPPED_EBONY_LOG, 300);
        registry.add(ModBlocks.STRIPPED_EBONY_WOOD, 300);

        registry.add(Daggers.EBONY_DAGGER, 200);
        registry.add(Rods.EBONY_ROD, 200);
        registry.add(Staffs.BLACK_STAFF, 200);
        registry.add(Staffs.WOOD_STAFF, 100);
        registry.add(Swords.EBONY_SWORD, 200);
        registry.add(Shields.BUCKLER, 100);
    }
}
