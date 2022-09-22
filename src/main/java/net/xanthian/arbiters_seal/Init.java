package net.xanthian.arbiters_seal;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.xanthian.arbiters_seal.blocks.ModBlocks;
import net.xanthian.arbiters_seal.config.ArbitersSealConfig;
import net.xanthian.arbiters_seal.enchantments.ModEnchantments;
import net.xanthian.arbiters_seal.items.*;
import net.xanthian.arbiters_seal.items.armor.Helmets;
import net.xanthian.arbiters_seal.items.shields.ShieldItems;
import net.xanthian.arbiters_seal.items.weapons.*;
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
            () -> new ItemStack(ModItems.TEORITE_INGOT));

    @Override
    public void onInitialize() {

        // Sapling & Ore Gen
        ModConfiguredFeatures.registerConfiguredFeatures();
        ArbitersSealConfig.registerConfigs();

        // Generic Item registration
        ModBlocks.registerModBlocks();
        ModItems.registerModItems();

        // Weapon Registration
        Axes.registerAxeItems();
        Bows.registerBowItems();
        Crossbows.registerCrossbowItems();
        Daggers.registerDaggerItems();
        //Guns.registerGunItems()
        Maces.registerMaceItems();
        Mauls.registerMaulItems();
        Rapiers.registerRapierItems();
        Rods.registerRodItems();
        Scythes.registerScytheItems();
        Spears.registerSpearItems();
        Staffs.registerStaffItems();
        Swords.registerSwordItems();

        // Armor registration
        Helmets.registerHelmetItems();
        ShieldItems.registerShieldItems();

        // Other stuff
        ModEnchantments.registerModEnchantments();
        ModWorldGen.generateModWorldGen();
        ModStatusEffects.registerStatusEffects();
    }
}