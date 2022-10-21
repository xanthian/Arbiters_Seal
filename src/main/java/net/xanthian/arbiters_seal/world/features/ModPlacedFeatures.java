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
    
    // Teorite
    public static final RegistryEntry<PlacedFeature> TEORITE_ORE_PLACED = PlacedFeatures.register("teorite_ore_placed",
            ModConfiguredFeatures.TEORITE_ORE, modifiersWithCount(9, HeightRangePlacementModifier.trapezoid(YOffset.fixed(-24), YOffset.fixed(56))));

    public static final RegistryEntry<PlacedFeature> NETHER_TEORITE_ORE_PLACED = PlacedFeatures.register("nether_teorite_ore_placed",
            ModConfiguredFeatures.NETHER_TEORITE_ORE, modifiersWithCount(11, PlacedFeatures.TEN_ABOVE_AND_BELOW_RANGE));

    public static final RegistryEntry<PlacedFeature> END_TEORITE_ORE_PLACED = PlacedFeatures.register("end_teorite_ore_placed",
            ModConfiguredFeatures.END_TEORITE_ORE, modifiersWithCount(7, PlacedFeatures.TEN_ABOVE_AND_BELOW_RANGE));
    
    // Silver 
    public static final RegistryEntry<PlacedFeature> SILVER_ORE_PLACED = PlacedFeatures.register("silver_ore_placed",
            ModConfiguredFeatures.SILVER_ORE, modifiersWithCount(10, HeightRangePlacementModifier.uniform(YOffset.fixed(32), YOffset.fixed(256))));

    public static final RegistryEntry<PlacedFeature> NETHER_SILVER_ORE_PLACED = PlacedFeatures.register("nether_silver_ore_placed",
            ModConfiguredFeatures.NETHER_SILVER_ORE, modifiersWithCount(12, PlacedFeatures.TEN_ABOVE_AND_BELOW_RANGE));

    public static final RegistryEntry<PlacedFeature> END_SILVER_ORE_PLACED = PlacedFeatures.register("end_silver_ore_placed",
            ModConfiguredFeatures.END_SILVER_ORE, modifiersWithCount(8, PlacedFeatures.TEN_ABOVE_AND_BELOW_RANGE));

    // Cold Iron
    public static final RegistryEntry<PlacedFeature> COLD_IRON_ORE_PLACED = PlacedFeatures.register("cold_iron_ore_placed",
            ModConfiguredFeatures.COLD_IRON_ORE, modifiersWithCount(8, HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(-80), YOffset.aboveBottom(80))));

    public static final RegistryEntry<PlacedFeature> END_COLD_IRON_ORE_PLACED = PlacedFeatures.register("end_cold_iron_ore_placed",
            ModConfiguredFeatures.END_COLD_IRON_ORE, modifiersWithCount(6, PlacedFeatures.TEN_ABOVE_AND_BELOW_RANGE));

// Geode
    public static final RegistryEntry<PlacedFeature> DENDRITE_GEODE_PLACED = PlacedFeatures.register("dendrite_geode_placed",
            ModConfiguredFeatures.DENDRITE_GEODE, RarityFilterPlacementModifier.of(75), SquarePlacementModifier.of(),
                    HeightRangePlacementModifier.uniform(YOffset.aboveBottom(50),YOffset.fixed(65)));

// Aloe
    public static final RegistryEntry<PlacedFeature> ALOE_VERA_PLACED = PlacedFeatures.register("aloe_vera_placed",
        ModConfiguredFeatures.ALOE_VERA_PLANT, modifiersWithRarity(10,PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP));

// Angel Tears
    public static final RegistryEntry<PlacedFeature> ANGEL_TEARS_PLACED = PlacedFeatures.register("angel_tears_placed",
            ModConfiguredFeatures.ANGEL_TEARS_PLANT, modifiersWithRarity(100,PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP));


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