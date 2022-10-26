package net.xanthian.arbiters_seal.items.tools;

import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterials;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.xanthian.arbiters_seal.Init;
import net.xanthian.arbiters_seal.items.tools.spears.Godray;
import net.xanthian.arbiters_seal.material.ModToolMaterial;

public class Spears {

    public static final Item SPEAR = registerItem("spears/spear",
            new ModSpearItem(ToolMaterials.IRON, 1, -3.0F));

    public static final Item BOAR_SPEAR = registerItem("spears/boar_spear",
            new ModSpearItem(ToolMaterials.IRON, 2, -3.0F));

    public static final Item SILVER_SPEAR = registerItem("spears/silver_spear",
            new ModSpearItem(ModToolMaterial.SILVER, 4, -3.0F));

    public static final Item ICESPIKE = registerItem("spears/icespike",
            new ModSpearItem(ToolMaterials.IRON, 3, -3.0F));

    public static final Item FLAMESPIKE = registerItem("spears/flamespike",
            new ModSpearItem(ModToolMaterial.TEORITE, 3, -3.0F));

    public static final Item STONESPIKE = registerItem("spears/stonespike",
            new ModSpearItem(ToolMaterials.IRON, 3, -3.0F));

    public static final Item BOLTSPIKE = registerItem("spears/boltspike",
            new ModSpearItem(ToolMaterials.IRON, 3, -3.0F));

    public static final Item TEORITE_SPEAR = registerItem("spears/teorite_spear",
            new ModSpearItem(ModToolMaterial.TEORITE, 4, -3.0F));

    public static final Item LANCE = registerItem("spears/lance",
            new ModSpearItem(ToolMaterials.IRON, 3, -3.0F));

    public static final Item PARTISAN = registerItem("spears/partisan",
            new ModSpearItem(ToolMaterials.DIAMOND, 3, -3.0F));

    public static final Item HEAVY_LANCE = registerItem("spears/heavy_lance",
            new ModSpearItem(ToolMaterials.DIAMOND, 3, -3.0F));

    public static final Item GODRAY = registerItem("spears/godray",
            new Godray(ToolMaterials.NETHERITE, 3, -3.0F));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Init.MOD_ID, name), item);
    }
    public static void registerSpearItems() {}
}