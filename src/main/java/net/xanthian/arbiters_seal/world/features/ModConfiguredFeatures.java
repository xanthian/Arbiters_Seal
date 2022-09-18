package net.xanthian.arbiters_seal.world.features;

import net.minecraft.block.Blocks;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
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
            PlacedFeatures.register("ebony_checked", EBONY_TREE,
                    PlacedFeatures.wouldSurvive(ModBlocks.EBONY_SAPLING));

    public static final RegistryEntry<ConfiguredFeature<RandomFeatureConfig, ?>>EBONY_SPAWN =
            ConfiguredFeatures.register("ebony_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfig(List.of(new RandomFeatureEntry(EBONY_CHECKED, 0.1f)), EBONY_CHECKED));

    // TEORITE ORE GEN
    public static final List<OreFeatureConfig.Target> OVERWORLD_TEORITE_ORES = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlocks.TEORITE_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_TEORITE_ORE.getDefaultState()));

    public static final List<OreFeatureConfig.Target> NETHER_TEORITE_ORES = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.BASE_STONE_NETHER, ModBlocks.NETHER_TEORITE_ORE.getDefaultState()));

    public static final List<OreFeatureConfig.Target> END_TEORITE_ORES = List.of(
            OreFeatureConfig.createTarget(new BlockMatchRuleTest(Blocks.END_STONE), ModBlocks.END_TEORITE_ORE.getDefaultState()));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> TEORITE_ORE =
            ConfiguredFeatures.register("teorite_ore", Feature.ORE, new OreFeatureConfig(OVERWORLD_TEORITE_ORES, 3));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> NETHER_TEORITE_ORE =
            ConfiguredFeatures.register("nether_teorite_ore",Feature.ORE, new OreFeatureConfig(NETHER_TEORITE_ORES, 3));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> END_TEORITE_ORE =
            ConfiguredFeatures.register("end_teorite_ore",Feature.ORE, new OreFeatureConfig(END_TEORITE_ORES, 3));

// SILVER ORE GEN
    public static final List<OreFeatureConfig.Target> OVERWORLD_SILVER_ORES = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlocks.SILVER_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_SILVER_ORE.getDefaultState()));

    public static final List<OreFeatureConfig.Target> NETHER_SILVER_ORES = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.BASE_STONE_NETHER, ModBlocks.NETHER_SILVER_ORE.getDefaultState()));

    public static final List<OreFeatureConfig.Target> END_SILVER_ORES = List.of(
            OreFeatureConfig.createTarget(new BlockMatchRuleTest(Blocks.END_STONE), ModBlocks.END_SILVER_ORE.getDefaultState()));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> SILVER_ORE =
            ConfiguredFeatures.register("silver_ore", Feature.ORE, new OreFeatureConfig(OVERWORLD_SILVER_ORES, 5));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> NETHER_SILVER_ORE =
            ConfiguredFeatures.register("nether_silver_ore",Feature.ORE, new OreFeatureConfig(NETHER_SILVER_ORES, 5));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> END_SILVER_ORE =
            ConfiguredFeatures.register("end_silver_ore",Feature.ORE, new OreFeatureConfig(END_SILVER_ORES, 5));

    public static void registerConfiguredFeatures() {
    }
}