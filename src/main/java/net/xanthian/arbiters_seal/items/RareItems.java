package net.xanthian.arbiters_seal.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.ChorusPlantBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.xanthian.arbiters_seal.Init;

public class RareItems {


    public static final Item ADAMANT_INGOT = registerItem("materials/adamant_ingot",
            new ModRareItem());

    public static final Item AEGISITE_INGOT = registerItem("materials/aegisite_ingot",
            new ModRareItem());

    public static final Item ALOE_LEAF = registerItem("materials/aloe_leaf",
            new ModRareItem());

    public static final Item AMMONIAC_GUM = registerItem("materials/ammoniac_gum",
            new ModRareItem());

    public static final Block ANGEL_TEARS = registerBlock("materials/angel_tears",
            new ChorusPlantBlock(FabricBlockSettings.copyOf(Blocks.CHORUS_PLANT).luminance(7)));

    public static final Item CATALYST = registerItem("materials/catalyst",
            new ModRareItem());

    public static final Item COBBLEWEED_POD = registerItem("materials/cobbleweed_pod",
            new ModRareItem());

    public static final Item COLD_IRON_INGOT = registerItem("materials/cold_iron_ingot",
            new ModRareItem());

    public static final Item CORONAL_PLUME = registerItem("materials/coronal_plume",
            new ModRareItem());

    public static final Item DARK_CORE = registerItem("materials/dark_core",
            new ModRareItem());

    public static final Item DEMON_LEATHER = registerItem("materials/demon_leather",
            new ModRareItem());

    public static final Item DIAMOND_THREAD = registerItem("materials/diamond_thread",
            new ModRareItem());

    public static final Item DISTILLED_WATER = registerItem("materials/distilled_water",
            new ModRareItem());

    public static final Item DORMANT_CRYSTAL = registerItem("materials/dormant_crystal",
            new ModRareItem());

    public static final Item DRAGONSBLOOD_SAP = registerItem("materials/dragonsblood_sap",
            new ModRareItem());

    public static final Item ENERGIZED_CRYSTAL = registerItem("materials/energized_crystal",
            new ModRareItem());

    public static final Item GODWOOD = registerItem("materials/godwood",
            new ModRareItem());

    public static final Item GOLD_THREAD = registerItem("materials/gold_thread",
            new ModRareItem());

    public static final Item JAMMY_FRUIT = registerItem("materials/jammy_fruit",
            new ModRareItem());

    public static final Item METEORITE = registerItem("materials/meteorite",
            new ModRareItem());

    public static final Item MYCOLEATHER = registerItem("materials/mycoleather",
            new ModRareItem());

    public static final Item MYTHICAL_LEATHER = registerItem("materials/mythical_leather",
            new ModRareItem());

    public static final Item PLATINUM_THREAD = registerItem("materials/platinum_thread",
            new ModRareItem());

    public static final Item QUALITY_THREAD = registerItem("materials/quality_thread",
            new ModRareItem());

    public static final Item SHELLAC_POWDER = registerItem("materials/shellac_powder",
            new ModRareItem());

    public static final Item SINEWDLE_FRUIT = registerItem("materials/sinewdle_fruit",
            new ModRareItem());

    public static final Item SNAKEBITE_OIL = registerItem("materials/snakebite_oil",
            new ModRareItem());

    public static final Item TARNISHED_LOCKET = registerItem("materials/tarnished_locket",
            new ModRareItem());

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Init.MOD_ID, name), item);
    }
    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registry.BLOCK, new Identifier(Init.MOD_ID, name), block);
    }
    private static Item registerBlockItem(String name, Block block){
        return Registry.register(Registry.ITEM, new Identifier(Init.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(Init.ARBITERS_SEAL_ITEMS)));
    }

    public static void registerRareItems() {}
}