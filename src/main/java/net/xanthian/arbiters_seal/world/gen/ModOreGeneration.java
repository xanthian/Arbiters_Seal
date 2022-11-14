package net.xanthian.arbiters_seal.world.gen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;
import net.xanthian.arbiters_seal.world.features.ModPlacedFeatures;

public class ModOreGeneration {

    public static void generateOres() {

        // Teorite
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.TEORITE_ORE_PLACED.getKey().get());

        BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.NETHER_TEORITE_ORE_PLACED.getKey().get());

        BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd().and(BiomeSelectors.excludeByKey(BiomeKeys.THE_END, BiomeKeys.SMALL_END_ISLANDS)),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.END_TEORITE_ORE_PLACED.getKey().get());

        // Silver
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.SILVER_ORE_PLACED.getKey().get());

        BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.NETHER_SILVER_ORE_PLACED.getKey().get());

        BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd().and(BiomeSelectors.excludeByKey(BiomeKeys.THE_END, BiomeKeys.SMALL_END_ISLANDS)),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.END_SILVER_ORE_PLACED.getKey().get());

        // Cold Iron
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.FROZEN_OCEAN, BiomeKeys.DEEP_FROZEN_OCEAN, BiomeKeys.FROZEN_PEAKS, BiomeKeys.FROZEN_RIVER, BiomeKeys.ICE_SPIKES),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.COLD_IRON_ORE_PLACED.getKey().get());

        BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd().and(BiomeSelectors.excludeByKey(BiomeKeys.THE_END, BiomeKeys.SMALL_END_ISLANDS)),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.END_COLD_IRON_ORE_PLACED.getKey().get());
    }
}