package net.xanthian.arbiters_seal.items.armor;

import net.minecraft.item.ArmorMaterials;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.xanthian.arbiters_seal.Init;

public class Gloves {

    public static final Item GAUNTLET = registerItem("gloves/gauntlet", new ModGloveItem(ArmorMaterials.NETHERITE));
    public static final Item DEMI_GAUNTLET = registerItem("gloves/demi_gauntlet", new ModGloveItem(ArmorMaterials.NETHERITE));
    public static final Item WIZARD_GLOVE = registerItem("gloves/wizard_glove", new ModGloveItem(ArmorMaterials.NETHERITE));
    public static final Item SHARP_GLOVE = registerItem("gloves/sharp_glove", new ModGloveItem(ArmorMaterials.NETHERITE));
    public static final Item PLATE_GLOVE = registerItem("gloves/plate_glove", new ModGloveItem(ArmorMaterials.NETHERITE));
    public static final Item EXO_GAUNTLET = registerItem("gloves/exo_gauntlet", new ModGloveItem(ArmorMaterials.NETHERITE));
    public static final Item BATTLE_CLAW = registerItem("gloves/battle_claw", new ModGloveItem(ArmorMaterials.NETHERITE));
    public static final Item GIGAS_FIST = registerItem("gloves/gigas_fist", new ModGloveItem(ArmorMaterials.NETHERITE));
    public static final Item ARCANE_GLOVE = registerItem("gloves/arcane_glove", new ModGloveItem(ArmorMaterials.NETHERITE));
    public static final Item DRAKE_TALON = registerItem("gloves/drake_talon", new ModGloveItem(ArmorMaterials.NETHERITE));
    public static final Item BANDITS_GLOVE = registerItem("gloves/bandits_glove", new ModGloveItem(ArmorMaterials.NETHERITE));
    public static final Item THROWING_GLOVE = registerItem("gloves/throwing_glove", new ModGloveItem(ArmorMaterials.NETHERITE));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Init.MOD_ID, name), item);
    }
    public static void registerGloveItems() {}
}