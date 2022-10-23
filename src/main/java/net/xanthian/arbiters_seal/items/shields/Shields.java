package net.xanthian.arbiters_seal.items.shields;

import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.xanthian.arbiters_seal.Init;
import net.xanthian.arbiters_seal.items.shields.shields.*;
import net.xanthian.arbiters_seal.material.ModShieldMaterial;
import net.minecraft.util.registry.Registry;

public class Shields {

    public static final Item BUCKLER = registerItem("shields/buckler",
            new ModShieldItem(ModShieldMaterial.WOOD));

    public static final Item BRONZE_SHIELD = registerItem("shields/bronze_shield",
            new ModShieldItem(ModShieldMaterial.BRONZE));

    public static final Item STEEL_SHIELD = registerItem("shields/steel_shield",
            new ModShieldItem(ModShieldMaterial.STEEL));

    public static final Item GOLD_SHIELD = registerItem("shields/gold_shield",
            new ModShieldItem(ModShieldMaterial.GOLD));

    public static final Item WATER_SHIELD = registerItem("shields/water_shield",
            new ModShieldItem(ModShieldMaterial.SILVER));

    public static final Item FIRE_SHIELD = registerItem("shields/fire_shield",
            new ModShieldItem(ModShieldMaterial.STEEL));

    public static final Item EARTH_SHIELD = registerItem("shields/earth_shield",
            new ModShieldItem(ModShieldMaterial.BRONZE));

    public static final Item THUNDER_SHIELD = registerItem("shields/thunder_shield",
            new ModShieldItem(ModShieldMaterial.GOLD));

    public static final Item TEORITE_SHIELD = registerItem("shields/teorite_shield",
            new ModShieldItem(ModShieldMaterial.TEORITE));

    public static final Item AEGIS_SHIELD = registerItem("shields/aegis_shield",
            new ModShieldItem(ModShieldMaterial.DIAMOND));

    public static final Item ARBITER_SHIELD = registerItem("shields/arbiter_shield",
            new ArbiterShield(ModShieldMaterial.DIAMOND));

    public static final Item MAGIC_SHIELD = registerItem("shields/magic_shield",
            new ModShieldItem(ModShieldMaterial.DIAMOND));

    public static final Item VALIANT_SHIELD = registerItem("shields/valiant_shield",
            new ValiantShield(ModShieldMaterial.DIAMOND));

    public static final Item BEHEMOTH_GUARD = registerItem("shields/behemoth_guard",
            new BehemothShield(ModShieldMaterial.NETHERITE));

    public static final Item CURSED_SHIELD = registerItem("shields/cursed_shield",
            new CursedShield(ModShieldMaterial.IRON));

    public static final Item SHIELD_OF_THE_SIX = registerItem("shields/shield_of_the_six",
            new ShieldOfTheSix(ModShieldMaterial.NETHERITE));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Init.MOD_ID, name), item);
    }
    public static void registerShieldItems() {}
}
