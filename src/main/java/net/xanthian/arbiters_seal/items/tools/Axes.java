package net.xanthian.arbiters_seal.items.tools;

import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterials;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.xanthian.arbiters_seal.Init;
import net.xanthian.arbiters_seal.items.tools.axes.BloodAxe;
import net.xanthian.arbiters_seal.items.tools.axes.CryHavoc;
import net.xanthian.arbiters_seal.material.ModToolMaterial;

public class Axes {

   // public static final Item AXE = registerItem("axes/axe",
           // new ModAxeItem(ToolMaterials.IRON, 2, -3.2F));

    public static final Item BATTLEAXE = registerItem("axes/battleaxe",
            new ModAxeItem(ToolMaterials.IRON, 2, -3.2F));

    public static final Item SILVER_AXE = registerItem("axes/silver_axe",
            new ModAxeItem(ModToolMaterial.SILVER, 5, -3.2F));

    public static final Item CHOPPER = registerItem("axes/chopper",
            new ModAxeItem(ToolMaterials.IRON, 3, -3.2F));

    public static final Item TEORITE_AXE = registerItem("axes/teorite_axe",
            new ModAxeItem(ModToolMaterial.TEORITE, 3, -3.2F));

    public static final Item BLOOD_AXE = registerItem("axes/blood_axe",
            new BloodAxe(ToolMaterials.IRON, 3, -3.2F));

    public static final Item MARAUDER_AXE = registerItem("axes/marauder_axe",
            new ModAxeItem(ToolMaterials.DIAMOND, 4, -3.2F));

    public static final Item ORNATE_AXE = registerItem("axes/ornate_axe",
            new ModAxeItem(ToolMaterials.GOLD, 6, -3.2F));

    public static final Item DARK_REIGN = registerItem("axes/dark_reign",
            new ModAxeItem(ToolMaterials.DIAMOND, 5, -3.2F));

    public static final Item EXECUTIONER = registerItem("axes/executioner",
            new ModAxeItem(ToolMaterials.DIAMOND, 5, -3.2F));

    public static final Item CRY_HAVOC = registerItem("axes/cry_havoc",
            new CryHavoc(ToolMaterials.NETHERITE, 6, -3.2F));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Init.MOD_ID, name), item);
    }
    public static void registerAxeItems() {}
}