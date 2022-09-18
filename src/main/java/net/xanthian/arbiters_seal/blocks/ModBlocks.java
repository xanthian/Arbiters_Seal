package net.xanthian.arbiters_seal.blocks;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.registry.Registry;
import net.xanthian.arbiters_seal.Init;
import net.xanthian.arbiters_seal.world.features.tree.EbonySaplingGenerator;

public class ModBlocks {
// EBONY
    public static final Block EBONY_PLANKS = registerBlock("materials/ebony_planks",
                    new Block(AbstractBlock.Settings.of(Material.WOOD, MapColor.BLACK).
                            strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));

    //logs
    public static final Block EBONY_LOG = registerBlock("materials/ebony_log",
            new PillarBlock(FabricBlockSettings.of(Material.WOOD, MapColor.BLACK)
                    .strength(2.0f, 3.0f).sounds(BlockSoundGroup.WOOD)));

    public static final Block EBONY_WOOD = registerBlock("materials/ebony_wood",
            new PillarBlock(FabricBlockSettings.of(Material.WOOD, MapColor.BLACK)
                    .strength(2.0f, 3.0f).sounds(BlockSoundGroup.WOOD)));

    public static final Block STRIPPED_EBONY_LOG = registerBlock("materials/stripped_ebony_log",
            new PillarBlock(FabricBlockSettings.of(Material.WOOD, MapColor.BLACK)
                    .strength(2.0f, 3.0f).sounds(BlockSoundGroup.WOOD)));

    public static final Block STRIPPED_EBONY_WOOD = registerBlock("materials/stripped_ebony_wood",
            new PillarBlock(FabricBlockSettings.of(Material.WOOD, MapColor.BLACK)
                    .strength(2.0f, 3.0f).sounds(BlockSoundGroup.WOOD)));


    //stair
    public static final Block EBONY_STAIRS = registerBlock("materials/ebony_stairs",
            new StairsBlock(ModBlocks.EBONY_PLANKS.getDefaultState(),
                    FabricBlockSettings.of(Material.WOOD).strength(2.0f, 3.0f)
                            .sounds(BlockSoundGroup.WOOD)));

    //slab
    public static final Block EBONY_SLAB = registerBlock("materials/ebony_slab",
            new SlabBlock(FabricBlockSettings.of(Material.WOOD).strength(2.0f, 3.0f)
                    .sounds(BlockSoundGroup.WOOD)));

    //fences
    public static final Block EBONY_FENCE = registerBlock("materials/ebony_fence",
            new FenceBlock(FabricBlockSettings.of(Material.WOOD).strength(2.0f, 2.0f)
                    .sounds(BlockSoundGroup.WOOD)));
    public static final Block EBONY_FENCE_GATE = registerBlock("materials/ebony_fence_gate",
            new FenceGateBlock(FabricBlockSettings.of(Material.WOOD).strength(2.0f, 2.0f)
                    .sounds(BlockSoundGroup.WOOD)));

    //button
    public static final Block EBONY_BUTTON = registerBlock("materials/ebony_button",
            new WoodenButtonBlock(FabricBlockSettings.of(Material.WOOD).strength(1.0f, 2.0f)
                    .sounds(BlockSoundGroup.WOOD)));

    //pressure_plate
    public static final Block EBONY_PRESSURE_PLATE = registerBlock("materials/ebony_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.of(Material.WOOD).strength(2.0f, 2.0f)
                            .sounds(BlockSoundGroup.WOOD)));

    //door
    public static final Block EBONY_DOOR = registerBlock("materials/ebony_door",
            new DoorBlock(FabricBlockSettings.of(Material.WOOD).strength(2.0f,2.f)
                    .sounds(BlockSoundGroup.WOOD).nonOpaque()));

    //trapdoor
    public static final Block EBONY_TRAPDOOR = registerBlock("materials/ebony_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.of(Material.WOOD).strength(1.5f,2.f)
                    .sounds(BlockSoundGroup.WOOD).nonOpaque()));

    //leaves
    public static final Block EBONY_LEAVES = registerBlock("materials/ebony_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.DARK_OAK_LEAVES).nonOpaque()));

    //sapling
    public static final Block EBONY_SAPLING = registerBlock("materials/ebony_sapling",
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