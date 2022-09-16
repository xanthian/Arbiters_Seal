package net.xanthian.arbiters_seal;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.xanthian.arbiters_seal.enchantments.ModEnchantments;
import net.xanthian.arbiters_seal.items.*;

public class Init implements ModInitializer {

    public static final String MOD_ID = "arbiters_seal";
    public static final ItemGroup ARBITERS_SEAL_WEAPONS = FabricItemGroupBuilder.build(new Identifier(Init.MOD_ID, "arbiters_seal_weapons"),
            () -> new ItemStack(Swords.EXCALIBUR));
    public static final ItemGroup ARBITERS_SEAL_ARMOR = FabricItemGroupBuilder.build(new Identifier(Init.MOD_ID, "arbiters_seal_armor"),
            () -> new ItemStack(Helmets.GREEN_BERET));
    public static final ItemGroup ARBITERS_SEAL_ITEMS = FabricItemGroupBuilder.build(new Identifier(Init.MOD_ID, "arbiters_seal_items"),
            () -> new ItemStack(Materials.TEORITE_INGOT));

    @Override
    public void onInitialize() {

        Axes.registerAxeItems();
        Bows.registerBowItems();
        Daggers.registerDaggerItems();
        Maces.registerMaceItems();
        Materials.registerMaterialItems();
        Mauls.registerMaulItems();
        Rapiers.registerRapierItems();
        Swords.registerSwordItems();
        Helmets.registerHelmetItems();

        ModEnchantments.registerModEnchantments();

    }
}
