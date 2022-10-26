package net.xanthian.arbiters_seal.items.armor;

import net.minecraft.item.ArmorMaterials;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.xanthian.arbiters_seal.Init;
import net.xanthian.arbiters_seal.items.armor.helmets.*;
import net.xanthian.arbiters_seal.material.ModArmorMaterial;

public class Helmets {

    // CLOTH
    public static final Item CIRCLET = registerItem("helmets/circlet",
            new ModHelmetItem(ModArmorMaterial.BRONZE));

    public static final Item PHYRGIAN_CAP = registerItem("helmets/phrygian_cap",
            new ModHelmetItem(ArmorMaterials.NETHERITE));

    public static final Item SILVER_CIRCLET = registerItem("helmets/silver_circlet",
            new ModHelmetItem(ModArmorMaterial.SILVER));

    public static final Item BATTLEMAGE_HAT = registerItem("helmets/battlemage_hat",
            new ModHelmetItem(ArmorMaterials.NETHERITE));

    public static final Item SAGE_HAT = registerItem("helmets/sage_hat",
            new SageHat(ArmorMaterials.NETHERITE));

    public static final Item TEORITE_CIRCLET = registerItem("helmets/teorite_circlet",
            new ModHelmetItem(ModArmorMaterial.TEORITE));

    public static final Item WIZARD_CONE = registerItem("helmets/wizard_cone",
            new ModHelmetItem(ArmorMaterials.NETHERITE));

    public static final Item MITER = registerItem("helmets/miter",
            new ModHelmetItem(ArmorMaterials.NETHERITE));

    public static final Item WHITE_HAT = registerItem("helmets/white_hat",
            new ModHelmetItem(ArmorMaterials.NETHERITE));

    public static final Item BLACK_HAT = registerItem("helmets/black_hat",
            new ModHelmetItem(ArmorMaterials.NETHERITE));

    public static final Item ROYAL_CROWN = registerItem("helmets/royal_crown",
            new ModHelmetItem(ArmorMaterials.NETHERITE));

    public static final Item WITCH_CROWN = registerItem("helmets/witch_crown",
            new WitchCrown(ArmorMaterials.NETHERITE));

    // LIGHT
    public static final Item FUR_CAP = registerItem("helmets/fur_cap",
            new ModHelmetItem(ArmorMaterials.NETHERITE));

    public static final Item FEATHERED_CAP = registerItem("helmets/feathered_cap",
            new ModHelmetItem(ArmorMaterials.NETHERITE));

    //public static final Item LEATHER_HELMET = registerItem("helmets/leather_helmet",
            //new ModHelmetItem(ArmorMaterials.NETHERITE));

    public static final Item GREEN_BERET = registerItem("helmets/green_beret",
            new ModHelmetItem(ArmorMaterials.NETHERITE));

    public static final Item POSEURS_CAP = registerItem("helmets/poseurs_cap",
            new ModHelmetItem(ArmorMaterials.NETHERITE));

    public static final Item RED_BERET = registerItem("helmets/red_beret",
            new ModHelmetItem(ModArmorMaterial.BRONZE));

    public static final Item STUDDED_HELM = registerItem("helmets/studded_helm",
            new ModHelmetItem(ArmorMaterials.NETHERITE));

    //public static final Item CHAIN_COIF = registerItem("helmets/chain_coif",
            //new ModHelmetItem(ArmorMaterials.NETHERITE));

    public static final Item SPIDERSILK_CAP = registerItem("helmets/spidersilk_cap",
            new ModHelmetItem(ArmorMaterials.NETHERITE));

    public static final Item BLACK_COWL = registerItem("helmets/black_cowl",
            new ModHelmetItem(ArmorMaterials.NETHERITE));

    public static final Item ARBITER_CAP = registerItem("helmets/arbiter_cap",
            new ArbiterCap(ArmorMaterials.NETHERITE));

    public static final Item NINJA_COWL = registerItem("helmets/ninja_cowl",
            new ModHelmetItem(ModArmorMaterial.NINJA));

    public static final Item FLASH_CAP = registerItem("helmets/flash_cap",
            new ModHelmetItem(ArmorMaterials.NETHERITE));

    public static final Item CAP_OF_AGES = registerItem("helmets/cap_of_ages",
            new CapOfAges(ArmorMaterials.NETHERITE));

    // HEAVY
    public static final Item BRONZE_HELM = registerItem("helmets/bronze_helm",
            new ModHelmetItem(ModArmorMaterial.BRONZE));

    public static final Item STEEL_HELM = registerItem("helmets/steel_helm",
            new ModHelmetItem(ModArmorMaterial.STEEL));

    public static final Item SILVER_HELM = registerItem("helmets/silver_helm",
            new ModHelmetItem(ModArmorMaterial.SILVER));

    public static final Item GOLD_HELM = registerItem("helmets/gold_helm",
            new ModHelmetItem(ArmorMaterials.GOLD));

    public static final Item TEORITE_HELM = registerItem("helmets/teorite_helm",
            new ModHelmetItem(ModArmorMaterial.TEORITE));

    public static final Item MALCUBUS_HELM = registerItem("helmets/malcubus_helm",
            new MalcubusHelm(ArmorMaterials.NETHERITE));

    public static final Item MORION = registerItem("helmets/morion",
            new ModHelmetItem(ArmorMaterials.NETHERITE));

    public static final Item DENDRITE_HELM = registerItem("helmets/dendrite_helm",
            new ModHelmetItem(ModArmorMaterial.DENDRITE));

    public static final Item ARBITER_HELM = registerItem("helmets/arbiter_helm",
            new ArbiterHelm(ArmorMaterials.NETHERITE));

    public static final Item ROYAL_HELM = registerItem("helmets/royal_helm",
            new ModHelmetItem(ArmorMaterials.NETHERITE));

    public static final Item VALIANT_HELM = registerItem("helmets/valiant_helm",
            new ValiantHelm(ArmorMaterials.NETHERITE));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Init.MOD_ID, name), item);
    }
    public static void registerHelmetItems() {}
}