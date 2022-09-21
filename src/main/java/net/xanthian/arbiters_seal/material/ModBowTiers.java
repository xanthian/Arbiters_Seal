package net.xanthian.arbiters_seal.material;

import net.minecraft.recipe.Ingredient;

public interface ModBowTiers {

        int getItemDurability();
        float getAttackDamageBonus();
        int getEnchantabilty();
        Ingredient getRepairIngredient();
}