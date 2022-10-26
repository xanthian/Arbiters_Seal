package net.xanthian.arbiters_seal.items.tools;

import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterials;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.xanthian.arbiters_seal.Init;
import net.xanthian.arbiters_seal.items.tools.mauls.Pestilence;
import net.xanthian.arbiters_seal.material.ModToolMaterial;

public class Mauls {

    public static final Item MAUL = registerItem("mauls/maul",
            new ModMaulItem(ToolMaterials.IRON, 3, -3.2F));

    public static final Item SLEDGE = registerItem("mauls/sledge",
            new ModMaulItem(ToolMaterials.IRON, 3, -3.2F));

    public static final Item SILVER_MAUL = registerItem("mauls/silver_maul",
            new ModMaulItem(ModToolMaterial.SILVER, 6, -3.2F));

    public static final Item HIGH_STRIKER = registerItem("mauls/high_striker",
            new ModMaulItem(ToolMaterials.DIAMOND, 3, -3.2F));

    public static final Item TEORITE_MAUL = registerItem("mauls/teorite_maul",
            new ModMaulItem(ModToolMaterial.TEORITE, 4, -3.2F));

    public static final Item GADA = registerItem("mauls/gada",
            new ModMaulItem(ToolMaterials.NETHERITE, 3, -3.2F));

    public static final Item PESTILENCE = registerItem("mauls/pestilence",
            new Pestilence(ToolMaterials.NETHERITE, 3, -3.2F));

    public static final Item CLOCKWORK_HAMMER = registerItem("mauls/clockwork_hammer",
            new ModMaulItem(ToolMaterials.NETHERITE, 3, -3.2F));

    public static final Item FLATTENER = registerItem("mauls/flattener",
            new ModMaulItem(ToolMaterials.GOLD, 8, -3.2F));

    public static final Item BONECRUSHER = registerItem("mauls/bonecrusher",
            new ModMaulItem(ToolMaterials.NETHERITE, 4, -3.2F));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Init.MOD_ID, name), item);
    }
    public static void registerMaulItems() {}
}