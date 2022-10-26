package net.xanthian.arbiters_seal.items.tools;

import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterials;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.xanthian.arbiters_seal.Init;
import net.xanthian.arbiters_seal.items.tools.rods.PrismRod;
import net.xanthian.arbiters_seal.material.ModToolMaterial;

public class Rods {

    public static final Item ROD = registerItem("rods/rod",
            new ModRodItem(ToolMaterials.WOOD, 2, -1.9F));

    public static final Item ANCIENT_ROD = registerItem("rods/ancient_rod",
            new ModRodItem(ToolMaterials.IRON, 1, -1.9F));

    public static final Item SILVER_ROD = registerItem("rods/silver_rod",
            new ModRodItem(ModToolMaterial.SILVER, 3, -1.9F));

    public static final Item WATER_ROD = registerItem("rods/water_rod",
            new ModRodItem(ToolMaterials.IRON, 2, -1.9F));

    public static final Item FIRE_ROD = registerItem("rods/fire_rod",
            new ModRodItem(ToolMaterials.IRON, 2, -1.9F));

    public static final Item EARTH_ROD = registerItem("rods/earth_rod",
            new ModRodItem(ToolMaterials.IRON, 2, -1.9F));

    public static final Item THUNDER_ROD = registerItem("rods/thunder_rod",
            new ModRodItem(ToolMaterials.IRON, 2, -1.9F));

    public static final Item TEORITE_ROD = registerItem("rods/teorite_rod",
            new ModRodItem(ModToolMaterial.TEORITE, 2, -1.9F));

    public static final Item EBONY_ROD = registerItem("rods/ebony_rod",
            new ModRodItem(ModToolMaterial.EBONY, 2, -1.9F));

    public static final Item JEWELED_ROD = registerItem("rods/jeweled_rod",
            new ModRodItem(ToolMaterials.GOLD, 5, -1.9F));

    public static final Item HEAVY_ROD = registerItem("rods/heavy_rod",
            new ModRodItem(ModToolMaterial.STEEL, 3, -2.1F));

    public static final Item GLACIER_ROD = registerItem("rods/glacier_rod",
            new ModRodItem(ToolMaterials.IRON, 3, -1.9F));

    public static final Item BLAZING_ROD = registerItem("rods/blazing_rod",
            new ModRodItem(ToolMaterials.IRON, 3, -1.9F));

    public static final Item QUAKE_ROD = registerItem("rods/quake_rod",
            new ModRodItem(ToolMaterials.IRON, 3, -1.9F));

    public static final Item SURGE_ROD = registerItem("rods/surge_rod",
            new ModRodItem(ToolMaterials.IRON, 3, -1.9F));

    public static final Item VOID_ROD = registerItem("rods/void_rod",
            new ModRodItem(ToolMaterials.IRON, 3, -1.9F));

    public static final Item PRISM_ROD = registerItem("rods/prism_rod",
            new PrismRod(ToolMaterials.IRON, 3, -1.9F));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Init.MOD_ID, name), item);
    }
    public static void registerRodItems() {}
}