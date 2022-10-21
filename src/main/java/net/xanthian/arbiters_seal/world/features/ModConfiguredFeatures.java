package net.xanthian.arbiters_seal.world.features;

import net.minecraft.block.Blocks;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.tag.BlockTags;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;
import net.xanthian.arbiters_seal.blocks.ModBlocks;

import java.util.List;

public class ModConfiguredFeatures {
    
    // SAPLING GEN
    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> EBONY_TREE =
            ConfiguredFeatures.register("ebony_tree", Feature.TREE, new TreeFeatureConfig.Builder(
                    BlockStateProvider.of(ModBlocks.EBONY_LOG),
                    new StraightTrunkPlacer(5, 6, 3),
                    BlockStateProvider.of(ModBlocks.EBONY_LEAVES),
                    new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 3),
                    new TwoLayersFeatureSize(1, 0, 2)).build());

    public static final RegistryEntry<PlacedFeature> EBONY_CHECKED =
            PlacedFeatures.register("ebony_checked", ModConfiguredFeatures.EBONY_TREE,
                    PlacedFeatures.wouldSurvive(ModBlocks.EBONY_SAPLING));

    public static final RegistryEntry<ConfiguredFeature<RandomFeatureConfig, ?>>EBONY_SPAWN =
            ConfiguredFeatures.register("ebony_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfig(List.of(new RandomFeatureEntry(EBONY_CHECKED, 0.1f)), EBONY_CHECKED));

    // TEORITE ORE GEN
    public static final List<OreFeatureConfig.Target> OVERWORLD_TEORITE_ORES = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlocks.TEORITE_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_TEORITE_ORE.getDefaultState()));

    public static final List<OreFeatureConfig.Target> NETHER_TEORITE_ORES = List.of(
            OreFeatureConfig.createTarget(new BlockMatchRuleTest(Blocks.NETHERRACK), ModBlocks.NETHER_TEORITE_ORE.getDefaultState()));

    public static final List<OreFeatureConfig.Target> END_TEORITE_ORES = List.of(
            OreFeatureConfig.createTarget(new BlockMatchRuleTest(Blocks.END_STONE), ModBlocks.END_TEORITE_ORE.getDefaultState()));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> TEORITE_ORE =
            ConfiguredFeatures.register("teorite_ore", Feature.ORE, new OreFeatureConfig(OVERWORLD_TEORITE_ORES, 7));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> NETHER_TEORITE_ORE =
            ConfiguredFeatures.register("nether_teorite_ore",Feature.ORE, new OreFeatureConfig(NETHER_TEORITE_ORES, 9));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> END_TEORITE_ORE =
            ConfiguredFeatures.register("end_teorite_ore",Feature.ORE, new OreFeatureConfig(END_TEORITE_ORES, 5, 0.2F));

    // SILVER ORE GEN
    public static final List<OreFeatureConfig.Target> OVERWORLD_SILVER_ORES = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlocks.SILVER_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_SILVER_ORE.getDefaultState()));

    public static final List<OreFeatureConfig.Target> NETHER_SILVER_ORES = List.of(
            OreFeatureConfig.createTarget(new BlockMatchRuleTest(Blocks.NETHERRACK), ModBlocks.NETHER_SILVER_ORE.getDefaultState()));

    public static final List<OreFeatureConfig.Target> END_SILVER_ORES = List.of(
            OreFeatureConfig.createTarget(new BlockMatchRuleTest(Blocks.END_STONE), ModBlocks.END_SILVER_ORE.getDefaultState()));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> SILVER_ORE =
            ConfiguredFeatures.register("silver_ore", Feature.ORE, new OreFeatureConfig(OVERWORLD_SILVER_ORES, 9));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> NETHER_SILVER_ORE =
            ConfiguredFeatures.register("nether_silver_ore",Feature.ORE, new OreFeatureConfig(NETHER_SILVER_ORES, 11));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> END_SILVER_ORE =
            ConfiguredFeatures.register("end_silver_ore",Feature.ORE, new OreFeatureConfig(END_SILVER_ORES, 7, 0.2F));

    // COLD IRON ORE GEN
    public static final List<OreFeatureConfig.Target> OVERWORLD_COLD_IRON_ORES = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_COLD_IRON_ORE.getDefaultState()));
    
    public static final List<OreFeatureConfig.Target> END_COLD_IRON_ORES = List.of(
            OreFeatureConfig.createTarget(new BlockMatchRuleTest(Blocks.END_STONE), ModBlocks.END_COLD_IRON_ORE.getDefaultState()));
    
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> COLD_IRON_ORE =
            ConfiguredFeatures.register("cold_iron_ore", Feature.ORE, new OreFeatureConfig(OVERWORLD_COLD_IRON_ORES, 5));
    
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> END_COLD_IRON_ORE =
            ConfiguredFeatures.register("end_cold_iron_ore",Feature.ORE, new OreFeatureConfig(END_COLD_IRON_ORES, 4, 0.2F));

    // DENDRITE GEODE
    public static final RegistryEntry<ConfiguredFeature<GeodeFeatureConfig, ?>> DENDRITE_GEODE =
            ConfiguredFeatures.register("dendrite_geode", Feature.GEODE,
                new GeodeFeatureConfig(
                        new GeodeLayerConfig(BlockStateProvider.of(Blocks.AIR), //inside geode
                                BlockStateProvider.of(ModBlocks.DENDRITE_BLOCK), //inner block
                                BlockStateProvider.of(ModBlocks.BUDDING_DENDRITE), //geode block
                                BlockStateProvider.of(Blocks.END_STONE), //middle block
                                BlockStateProvider.of(Blocks.END_STONE), //outer block
                                List.of(ModBlocks.SMALL_DENDRITE_BUD.getDefaultState(),
                                        ModBlocks.MEDIUM_DENDRITE_BUD.getDefaultState(),
                                        ModBlocks.LARGE_DENDRITE_BUD.getDefaultState(),
                                        ModBlocks.DENDRITE_CLUSTER.getDefaultState()),
                                        BlockTags.FEATURES_CANNOT_REPLACE, BlockTags.GEODE_INVALID_BLOCKS),
                                new GeodeLayerThicknessConfig(1.7D, 2.2D, 3.2D, 4.2D),
                                new GeodeCrackConfig(0.5D, 2.0D, 2),0.35D, 0.083D, true,
                                UniformIntProvider.create(4, 6),
                                UniformIntProvider.create(3, 4),
                                UniformIntProvider.create(1, 2),
                        -16, 16, 0.05D, 1));

    // ALOE PLANT
    public static final RegistryEntry<ConfiguredFeature<RandomPatchFeatureConfig, ?>> ALOE_VERA_PLANT =
            ConfiguredFeatures.register("aloe_vera_plant", Feature.FLOWER,
                    ConfiguredFeatures.createRandomPatchFeatureConfig(1, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                            new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.ALOE_VERA)))));

    // ANGEL TEARS PLANT
    public static final RegistryEntry<ConfiguredFeature<RandomPatchFeatureConfig, ?>> ANGEL_TEARS_PLANT =
            ConfiguredFeatures.register("angel_tears_plant", Feature.FLOWER,
                    ConfiguredFeatures.createRandomPatchFeatureConfig(3, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                            new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.ANGEL_TEARS)))));



    public static void registerConfiguredFeatures() {
    }
}