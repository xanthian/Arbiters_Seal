package net.xanthian.arbiters_seal;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.xanthian.arbiters_seal.blocks.ModBlocks;
import net.xanthian.arbiters_seal.entity.ModBlockEntities;

import net.xanthian.arbiters_seal.entity.ModBoatEntities;
import net.xanthian.arbiters_seal.entity.ModMobEntities;
import net.xanthian.arbiters_seal.entity.mob.AeothEntity;
import net.xanthian.arbiters_seal.entity.mob.VangalEntity;
import net.xanthian.arbiters_seal.entity.mob.ZotzitEntity;
import net.xanthian.arbiters_seal.loot.ModChestLoot;
import net.xanthian.arbiters_seal.loot.ModMobLoot;
import net.xanthian.arbiters_seal.loot.ModVillagerTrades;
import net.xanthian.arbiters_seal.entity.villagers.ModVillagers;
import net.xanthian.arbiters_seal.items.gadgets.Gadgets;
import net.xanthian.arbiters_seal.items.potions.PotionItems;
import net.xanthian.arbiters_seal.particle.ModParticles;
import net.xanthian.arbiters_seal.sounds.ModSounds;
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
import software.bernie.geckolib3.GeckoLib;

public class Init implements ModInitializer {

    public static final String MOD_ID = "arbiters_seal";
    public static final ItemGroup ARBITERS_SEAL_WEAPONS = FabricItemGroupBuilder.build(new Identifier(Init.MOD_ID, "arbiters_seal_weapons"),
            () -> new ItemStack(Swords.SOUL_EATER));
    public static final ItemGroup ARBITERS_SEAL_ARMOR = FabricItemGroupBuilder.build(new Identifier(Init.MOD_ID, "arbiters_seal_armor"),
            () -> new ItemStack(Helmets.MALCUBUS_HELM));
    public static final ItemGroup ARBITERS_SEAL_ITEMS = FabricItemGroupBuilder.build(new Identifier(Init.MOD_ID, "arbiters_seal_items"),
            () -> new ItemStack(RareItems.METEORITE));

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
        NormalItems.registerModItems();
        RareItems.registerRareItems();
        Gadgets.registerGadgetItems();
        PotionItems.registerPotionItems();


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
        ModBoatEntities.registerBoatEntities();
        ModBlockEntities.initialize();
        ModChestLoot.registerLootTables();
        ModMobLoot.modifyLootTables();
        ModSounds.registerModSounds();
        ModVillagerTrades.registerTrades();
        ModVillagers.registerVillagers();
        ModVillagers.registerTrades();
        ModAttributes.registerAttributes();
        ModStatusEffects.registerStatusEffects();
        ModFlammableBlocks.registerFlammableBlocks();
        ModStrippableBlocks.registerStrippables();
        ModFuelItems.registerFuelItems();
        ModPOITypes.registerPOI();
        ModParticles.registerParticles();
        GeckoLib.initialize();
        FabricDefaultAttributeRegistry.register(ModMobEntities.ZOTZIT, ZotzitEntity.setAttributes());
        FabricDefaultAttributeRegistry.register(ModMobEntities.AEOTH, AeothEntity.setAttributes());
        FabricDefaultAttributeRegistry.register(ModMobEntities.VANGAL, VangalEntity.setAttributes());
        ModWorldGen.registerWorldGen();
    }
}