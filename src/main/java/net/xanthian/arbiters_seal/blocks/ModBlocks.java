package net.xanthian.arbiters_seal.blocks;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.registry.Registry;
import net.xanthian.arbiters_seal.Init;
import net.xanthian.arbiters_seal.entity.ModSignTypes;
import net.xanthian.arbiters_seal.world.features.tree.EbonySaplingGenerator;

public class ModBlocks {

    // TEORITE
    public static final Block TEORITE_ORE = registerBlock("materials/teorite_ore",
            new OreBlock(FabricBlockSettings.copyOf(Blocks.IRON_ORE),
                    UniformIntProvider.create(3, 7)));
    public static final Block DEEPSLATE_TEORITE_ORE = registerBlock("materials/deepslate_teorite_ore",
            new OreBlock(FabricBlockSettings.copyOf(Blocks.GOLD_ORE),
                    UniformIntProvider.create(3, 7)));
    public static final Block NETHER_TEORITE_ORE = registerBlock("materials/nether_teorite_ore",
            new OreBlock(FabricBlockSettings.copyOf(Blocks.GOLD_ORE),
                    UniformIntProvider.create(3, 7)));
    public static final Block END_TEORITE_ORE = registerBlock("materials/end_teorite_ore",
            new OreBlock(FabricBlockSettings.copyOf(Blocks.GOLD_ORE),
                    UniformIntProvider.create(3, 7)));
    public static final Block TEORITE_BLOCK = registerBlock("materials/teorite_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block RAW_TEORITE_BLOCK = registerBlock("materials/raw_teorite_block",
            new Block(FabricBlockSettings.copyOf(Blocks.RAW_IRON_BLOCK)));

    // SILVER
    public static final Block SILVER_ORE = registerBlock("materials/silver_ore",
            new OreBlock(FabricBlockSettings.copyOf(Blocks.GOLD_ORE),
                    UniformIntProvider.create(3, 7)));
    public static final Block DEEPSLATE_SILVER_ORE = registerBlock("materials/deepslate_silver_ore",
            new OreBlock(FabricBlockSettings.copyOf(Blocks.GOLD_ORE),
                    UniformIntProvider.create(3, 7)));
    public static final Block NETHER_SILVER_ORE = registerBlock("materials/nether_silver_ore",
            new OreBlock(FabricBlockSettings.copyOf(Blocks.GOLD_ORE),
                    UniformIntProvider.create(3, 7)));
    public static final Block END_SILVER_ORE = registerBlock("materials/end_silver_ore",
            new OreBlock(FabricBlockSettings.copyOf(Blocks.GOLD_ORE),
                    UniformIntProvider.create(3, 7)));
    public static final Block SILVER_BLOCK = registerBlock("materials/silver_block",
            new Block(FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block RAW_SILVER_BLOCK = registerBlock("materials/raw_silver_block",
            new Block(FabricBlockSettings.copyOf(Blocks.RAW_GOLD_BLOCK)));

    // RANDOM
    public static final Block ADAMANT_BLOCK = registerBlock("materials/adamant_block",
            new Block(FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK)));
    public static final Block AEGISITE_BLOCK = registerBlock("materials/aegisite_block",
            new Block(FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK)));
    public static final Block COLD_IRON_BLOCK = registerBlock("materials/cold_iron_block",
            new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK)));
    public static final Block ALOE_VERA = registerBlock("materials/aloe_vera",
            new DeadBushBlock(FabricBlockSettings.copyOf(Blocks.DEAD_BUSH)));


    // DENDRITE
    public static final Block DENDRITE_BLOCK = registerBlock("materials/dendrite_block",
            new AmethystBlock(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK)));
    public static final Block DENDRITE_CLUSTER = registerBlock("materials/dendrite_cluster",
            new AmethystClusterBlock(7,3,FabricBlockSettings.copyOf(Blocks.AMETHYST_CLUSTER)));
    public static final Block BUDDING_DENDRITE = registerBlock("materials/budding_dendrite",
            new BuddingAmethystBlock(FabricBlockSettings.copyOf(Blocks.BUDDING_AMETHYST)));
    public static final Block SMALL_DENDRITE_BUD = registerBlock("materials/small_dendrite_bud",
            new AmethystClusterBlock(3,4, FabricBlockSettings.copyOf(Blocks.SMALL_AMETHYST_BUD)));
    public static final Block MEDIUM_DENDRITE_BUD = registerBlock("materials/medium_dendrite_bud",
            new AmethystClusterBlock(4, 3, FabricBlockSettings.copyOf(Blocks.MEDIUM_AMETHYST_BUD)));
    public static final Block LARGE_DENDRITE_BUD = registerBlock("materials/large_dendrite_bud",
            new AmethystClusterBlock(5, 3, FabricBlockSettings.copyOf(Blocks.LARGE_AMETHYST_BUD)));

    // EBONY
    public static final Block EBONY_PLANKS = registerBlock("materials/ebony_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.DARK_OAK_PLANKS)));

    //logs
    public static final Block EBONY_LOG = registerBlock("materials/ebony_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.DARK_OAK_LOG)));

    public static final Block EBONY_WOOD = registerBlock("materials/ebony_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.DARK_OAK_WOOD)));

    public static final Block STRIPPED_EBONY_LOG = registerBlock("materials/stripped_ebony_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_DARK_OAK_LOG)));

    public static final Block STRIPPED_EBONY_WOOD = registerBlock("materials/stripped_ebony_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_DARK_OAK_WOOD)));


    //stair
    public static final Block EBONY_STAIRS = registerBlock("objects/ebony_stairs",
            new StairsBlock(ModBlocks.EBONY_PLANKS.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.DARK_OAK_STAIRS)));

    //slab
    public static final Block EBONY_SLAB = registerBlock("objects/ebony_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.DARK_OAK_SLAB)));

    //fences
    public static final Block EBONY_FENCE = registerBlock("objects/ebony_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.DARK_OAK_FENCE)));
    public static final Block EBONY_FENCE_GATE = registerBlock("objects/ebony_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.DARK_OAK_FENCE_GATE)));

    //button
    public static final Block EBONY_BUTTON = registerBlock("objects/ebony_button",
            new WoodenButtonBlock(FabricBlockSettings.copyOf(Blocks.DARK_OAK_BUTTON)));

    //pressure_plate
    public static final Block EBONY_PRESSURE_PLATE = registerBlock("objects/ebony_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copyOf(Blocks.DARK_OAK_PRESSURE_PLATE)));

    //door
    public static final Block EBONY_DOOR = registerBlock("objects/ebony_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.DARK_OAK_DOOR)));

    //trapdoor
    public static final Block EBONY_TRAPDOOR = registerBlock("objects/ebony_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.DARK_OAK_TRAPDOOR)));
    // sign
    public static final Block EBONY_WALL_SIGN_BLOCK = registerBlockWithoutBlockItem("objects/ebony_wall_sign",
            new WallSignBlock(FabricBlockSettings.copyOf(Blocks.DARK_OAK_WALL_SIGN), ModSignTypes.EBONY));
    public static final Block EBONY_SIGN_BLOCK = registerBlockWithoutBlockItem("objects/ebony_sign",
            new SignBlock(FabricBlockSettings.copyOf(Blocks.DARK_OAK_SIGN), ModSignTypes.EBONY));


    //leaves
    public static final Block EBONY_LEAVES = registerBlock("objects/ebony_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.DARK_OAK_LEAVES).nonOpaque()));

    //sapling
    public static final Block EBONY_SAPLING = registerBlock("objects/ebony_sapling",
            new SaplingBlock(new EbonySaplingGenerator(),
                    FabricBlockSettings.copyOf(Blocks.DARK_OAK_SAPLING)));

    //jobsites
    public static final Block EBONY_BARREL = registerBlock("jobsites/ebony_barrel",
            new BarrelBlock(FabricBlockSettings.copyOf(Blocks.BARREL)));
    public static final Block EBONY_BOOKSHELF = registerBlock("jobsites/ebony_bookshelf",
            new Block(FabricBlockSettings.copyOf(Blocks.BOOKSHELF)));
    public static final Block EBONY_COMPOSTER = registerBlock("jobsites/ebony_composter",
            new ComposterBlock(FabricBlockSettings.copyOf(Blocks.COMPOSTER)));
    public static final Block EBONY_CRAFTING_TABLE = registerBlock("jobsites/ebony_crafting_table",
            new CraftingTableBlock(FabricBlockSettings.copyOf(Blocks.CRAFTING_TABLE)));



    private static Block registerBlockWithoutBlockItem(String name, Block block) {
        return Registry.register(Registry.BLOCK, new Identifier(Init.MOD_ID, name), block);
    }

    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registry.BLOCK, new Identifier(Init.MOD_ID, name), block);
    }
    private static Item registerBlockItem(String name, Block block){
        return Registry.register(Registry.ITEM, new Identifier(Init.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(Init.ARBITERS_SEAL_ITEMS)));
    }
    public static void registerModBlocks(){
    }
}