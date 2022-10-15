package net.xanthian.arbiters_seal;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.xanthian.arbiters_seal.blocks.ModBlocks;
import net.xanthian.arbiters_seal.particle.ModParticles;
import net.xanthian.arbiters_seal.util.*;
import net.xanthian.arbiters_seal.items.*;
import net.xanthian.arbiters_seal.items.armor.Chestpieces;
import net.xanthian.arbiters_seal.items.armor.Feet;
import net.xanthian.arbiters_seal.items.armor.Gloves;
import net.xanthian.arbiters_seal.items.armor.Helmets;
import net.xanthian.arbiters_seal.items.shields.Shields;
import net.xanthian.arbiters_seal.items.tools.*;
import net.xanthian.arbiters_seal.items.trinkets.Trinkets;
import net.xanthian.arbiters_seal.status_effects.ModStatusEffects;
import net.xanthian.arbiters_seal.world.features.ModConfiguredFeatures;
import net.xanthian.arbiters_seal.world.gen.ModWorldGen;

public class Init implements ModInitializer {

    public static final String MOD_ID = "arbiters_seal";
    public static final ItemGroup ARBITERS_SEAL_WEAPONS = FabricItemGroupBuilder.build(new Identifier(Init.MOD_ID, "arbiters_seal_weapons"),
            () -> new ItemStack(Swords.EXCALIBUR));
    public static final ItemGroup ARBITERS_SEAL_ARMOR = FabricItemGroupBuilder.build(new Identifier(Init.MOD_ID, "arbiters_seal_armor"),
            () -> new ItemStack(Helmets.GREEN_BERET));
    public static final ItemGroup ARBITERS_SEAL_ITEMS = FabricItemGroupBuilder.build(new Identifier(Init.MOD_ID, "arbiters_seal_items"),
            () -> new ItemStack(OtherItems.TEORITE_INGOT));

    public static Identifier id(String key) {
        return new Identifier(MOD_ID, key);
    }

    @Override
    public void onInitialize() {

        // Sapling & Ore Gen
        ModConfiguredFeatures.registerConfiguredFeatures();
        //ArbitersSealConfig.registerConfigs();

        // Generic Item registration
        ModBlocks.registerModBlocks();
        OtherItems.registerModItems();
        RareItems.registerRareItems();

        // Weapon Registration
        Axes.registerAxeItems();
        Bows.registerBowItems();
        Crossbows.registerCrossbowItems();
        Daggers.registerDaggerItems();
        Guns.registerGunItems();
        Maces.registerMaceItems();
        Mauls.registerMaulItems();
        Rapiers.registerRapierItems();
        Rods.registerRodItems();
        Scythes.registerScytheItems();
        Spears.registerSpearItems();
        Staffs.registerStaffItems();
        Swords.registerSwordItems();

        // Armor registration
        Chestpieces.registerChestpieceItems();
        Helmets.registerHelmetItems();
        Gloves.registerGloveItems();
        Feet.registerFeetItems();
        Trinkets.registerTrinketItems();
        Shields.registerShieldItems();

        // Other stuff
        ModAttributes.register();
        ModWorldGen.generateModWorldGen();
        ModStatusEffects.registerStatusEffects();
        ModFlammableBlocks.registerFlammableBlocks();
        ModStrippableBlocks.registerStrippables();
        ModFuelItems.registerFuelItems();
        ModPOITypes.init();
        ModParticles.registerParticles();
    }
}