package net.xanthian.arbiters_seal.world.gen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;
import net.xanthian.arbiters_seal.world.features.ModPlacedFeatures;

public class ModGeodeGeneration {

    public static void generateGeodes() {

        BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd().and(BiomeSelectors.excludeByKey(BiomeKeys.THE_END, BiomeKeys.SMALL_END_ISLANDS)),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.DENDRITE_GEODE_PLACED.getKey().get());
    }
}
