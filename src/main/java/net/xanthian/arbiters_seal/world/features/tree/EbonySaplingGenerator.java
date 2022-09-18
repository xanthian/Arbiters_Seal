package net.xanthian.arbiters_seal.world.features.tree;

import net.minecraft.block.sapling.SaplingGenerator;
import net.minecraft.util.math.random.Random;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.xanthian.arbiters_seal.world.features.ModConfiguredFeatures;
import org.jetbrains.annotations.Nullable;

public class EbonySaplingGenerator extends SaplingGenerator {
    @Nullable
    @Override
    protected RegistryEntry<? extends ConfiguredFeature<?, ?>> getTreeFeature(Random random, boolean bees) {
        return ModConfiguredFeatures.EBONY_TREE;
    }
}