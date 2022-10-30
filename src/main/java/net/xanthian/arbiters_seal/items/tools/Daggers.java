package net.xanthian.arbiters_seal.items.tools;

import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterials;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.xanthian.arbiters_seal.Init;
import net.xanthian.arbiters_seal.items.tools.daggers.*;
import net.xanthian.arbiters_seal.material.ModToolMaterial;

public class Daggers {

    public static final Item DAGGER = registerItem("daggers/dagger",
            new ModDaggerItem(ToolMaterials.IRON, 1, -1.8F));
    
    public static final Item HIDDEN_KNIFE = registerItem("daggers/hidden_knife",
            new HiddenKnife(ToolMaterials.IRON, 1, -1.8F));

    public static final Item DIRK = registerItem("daggers/dirk",
            new Dirk(ToolMaterials.IRON, 2, -1.8F));

    public static final Item EBONY_DAGGER = registerItem("daggers/ebony_dagger",
            new ModDaggerItem(ModToolMaterial.EBONY, 1, -1.8F));

    public static final Item TONGUESLICER = registerItem("daggers/tongueslicer",
            new Tongueslicer(ToolMaterials.IRON, 2, -1.8F));

    public static final Item TEORITE_DAGGER = registerItem("daggers/teorite_dagger",
            new TeoriteDagger(ModToolMaterial.TEORITE, 2, -1.8F));

    public static final Item MAIN_GAUCHE = registerItem("daggers/main_gauche",
            new MainGauche(ToolMaterials.IRON, 2, -1.8F));

    public static final Item KUNAI = registerItem("daggers/kunai",
            new Kunai(ToolMaterials.IRON, 3, -1.8F));

    public static final Item JANBIYA = registerItem("daggers/janbiya",
            new Janbiya(ToolMaterials.GOLD, 5, -1.8F));

    public static final Item FLASH_KINFE = registerItem("daggers/flash_knife",
            new ModDaggerItem(ToolMaterials.IRON, 3, -1.5F));

    public static final Item WORM_TOOTH = registerItem("daggers/worm_tooth",
            new WormTooth(ToolMaterials.DIAMOND, 2, -1.8F));

    public static final Item DENDRITE_KNIFE = registerItem("daggers/dendrite_knife",
            new DendriteKnife(ModToolMaterial.DENDRITE, 3, -1.8F));

    public static final Item DRAGONS_NAIL = registerItem("daggers/dragons_nail",
            new DragonsNail(ToolMaterials.NETHERITE, 2, -1.8F));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Init.MOD_ID, name), item);
    }
    public static void registerDaggerItems() {}
}