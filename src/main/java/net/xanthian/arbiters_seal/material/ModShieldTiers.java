package net.xanthian.arbiters_seal.material;

import net.minecraft.recipe.Ingredient;

public interface ModShieldTiers {

        int getItemDurability();
        int getEnchantabilty();
        int getCooldownTicks();
        Ingredient getRepairIngredient();
}