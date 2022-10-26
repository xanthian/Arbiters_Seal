package net.xanthian.arbiters_seal.items.tools;

import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterials;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.xanthian.arbiters_seal.Init;
import net.xanthian.arbiters_seal.items.tools.rapiers.DelChliss;
import net.xanthian.arbiters_seal.material.ModToolMaterial;

public class Rapiers {

    public static final Item FLEURET = registerItem("rapiers/fleuret",
            new ModRapierItem(ToolMaterials.IRON, 1, -2.0F));

    public static final Item RAPIER = registerItem("rapiers/rapier",
            new ModRapierItem(ToolMaterials.IRON, 1, -2.0F));

    public static final Item SILVER_RAPIER = registerItem("rapiers/silver_rapier",
            new ModRapierItem(ModToolMaterial.SILVER, 4, -2.0F));

    public static final Item SHINING_RAPIER = registerItem("rapiers/shining_rapier",
            new ModRapierItem(ToolMaterials.GOLD, 4, -2.0F));

    public static final Item TEORITE_RAPIER = registerItem("rapiers/teorite_rapier",
            new ModRapierItem(ModToolMaterial.TEORITE, 1, -2.0F));

    public static final Item POISE = registerItem("rapiers/poise",
            new ModRapierItem(ToolMaterials.IRON, 3, -2.0F));

    public static final Item JOYEUSE = registerItem("rapiers/joyeuse",
            new ModRapierItem(ToolMaterials.IRON, 3, -2.0F));

    public static final Item MONARCH = registerItem("rapiers/monarch",
            new ModRapierItem(ToolMaterials.DIAMOND, 3, -2.0F));

    public static final Item DEL_CHLISS = registerItem("rapiers/del_chliss",
            new DelChliss(ToolMaterials.NETHERITE, 3, -2.0F));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Init.MOD_ID, name), item);
    }
    public static void registerRapierItems() {}
}