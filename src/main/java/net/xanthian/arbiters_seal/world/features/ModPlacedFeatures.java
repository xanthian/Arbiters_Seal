package net.xanthian.arbiters_seal.world.features;

import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;
import net.minecraft.world.gen.feature.VegetationPlacedFeatures;
import net.minecraft.world.gen.placementmodifier.*;

import java.util.List;

public class ModPlacedFeatures {

// Ebony Gen
    public static final RegistryEntry<PlacedFeature> EBONY_PLACED = PlacedFeatures.register("ebony_placed",
            ModConfiguredFeatures.EBONY_SPAWN, VegetationPlacedFeatures.modifiers(
                    PlacedFeatures.createCountExtraModifier(1, 0.05f, 2)));

// Teorite Gen
    public static final RegistryEntry<PlacedFeature> TEORITE_ORE_PLACED = PlacedFeatures.register("teorite_ore_placed",
            ModConfiguredFeatures.TEORITE_ORE, modifiersWithCount(7, HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(40),
                YOffset.fixed(60))));

    public static final RegistryEntry<PlacedFeature> NETHER_TEORITE_ORE_PLACED = PlacedFeatures.register("nether_teorite_ore_placed",
            ModConfiguredFeatures.NETHER_TEORITE_ORE, modifiersWithCount(10, PlacedFeatures.TEN_ABOVE_AND_BELOW_RANGE));

    public static final RegistryEntry<PlacedFeature> END_TEORITE_ORE_PLACED = PlacedFeatures.register("end_teorite_ore_placed",
            ModConfiguredFeatures.END_TEORITE_ORE, modifiersWithCount(10, PlacedFeatures.TEN_ABOVE_AND_BELOW_RANGE));

// Silver Gen
    public static final RegistryEntry<PlacedFeature> SILVER_ORE_PLACED = PlacedFeatures.register("silver_ore_placed",
            ModConfiguredFeatures.SILVER_ORE, modifiersWithCount(10, HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(40),
                YOffset.fixed(60))));

    public static final RegistryEntry<PlacedFeature> NETHER_SILVER_ORE_PLACED = PlacedFeatures.register("nether_silver_ore_placed",
            ModConfiguredFeatures.NETHER_SILVER_ORE, modifiersWithCount(10, PlacedFeatures.TEN_ABOVE_AND_BELOW_RANGE));

    public static final RegistryEntry<PlacedFeature> END_SILVER_ORE_PLACED = PlacedFeatures.register("end_silver_ore_placed",
            ModConfiguredFeatures.END_SILVER_ORE, modifiersWithCount(10, PlacedFeatures.TEN_ABOVE_AND_BELOW_RANGE));

// Geode
    public static final RegistryEntry<PlacedFeature> DENDRITE_GEODE_PLACED = PlacedFeatures.register("dendrite_geode_placed",
            ModConfiguredFeatures.DENDRITE_GEODE, RarityFilterPlacementModifier.of(24), SquarePlacementModifier.of(),
                    HeightRangePlacementModifier.uniform(YOffset.aboveBottom(50),YOffset.fixed(65)));

// Aloe
    public static final RegistryEntry<PlacedFeature> ALOE_VERA_PLACED = PlacedFeatures.register("aloe_vera_placed",
        ModConfiguredFeatures.ALOE_VERA_PLANT, modifiersWithRarity(10,PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP));


    private static List<PlacementModifier> modifiers(PlacementModifier countModifier, PlacementModifier heightModifier) {
        return List.of(countModifier, SquarePlacementModifier.of(), heightModifier, BiomePlacementModifier.of());
    }
    private static List<PlacementModifier> modifiersWithCount(int count, PlacementModifier heightModifier) {
        return modifiers(CountPlacementModifier.of(count), heightModifier);
    }
    private static List<PlacementModifier> modifiersWithRarity(int chance, PlacementModifier heightModifier) {
        return modifiers(RarityFilterPlacementModifier.of(chance), heightModifier);
    }
}