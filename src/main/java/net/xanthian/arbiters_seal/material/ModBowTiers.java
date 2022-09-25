package net.xanthian.arbiters_seal.material;

import net.minecraft.recipe.Ingredient;

public interface ModBowTiers {

        int getDurability();

        float getDamageBonus();

        int getRangeBonus();

        int getEnchantability();

        Ingredient getRepairIngredient();
}