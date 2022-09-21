package net.xanthian.arbiters_seal.enchantments;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.xanthian.arbiters_seal.Init;


public class ModEnchantments {
    public static Enchantment HEALTH_REGENERATION = register("health_regeneration",
            new HealthRegenEnchantment(Enchantment.Rarity.UNCOMMON, EnchantmentTarget.WEAPON, EquipmentSlot.MAINHAND));


    private static Enchantment register(String name, Enchantment enchantment){
        return Registry.register(Registry.ENCHANTMENT, new Identifier(Init.MOD_ID, name), enchantment);
    }

    public static void registerModEnchantments() {
            }
}
