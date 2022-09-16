package net.xanthian.arbiters_seal.material;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.xanthian.arbiters_seal.items.Materials;


import java.util.function.Supplier;

public enum ModToolMaterial implements ToolMaterial {

    BRONZE(5, 1800, 7.0F, 7.0F, 25,() -> Ingredient.ofItems(Materials.BRONZE_INGOT)),
    SILVER(5, 1800, 7.0F, 7.0F, 25,() -> Ingredient.ofItems(Materials.SILVER_INGOT)),
    STEEL(5, 1800, 7.0F, 7.0F, 25,() -> Ingredient.ofItems(Materials.STEEL_INGOT)),
    TEORITE(5, 1800, 7.0F, 7.0F, 25,() -> Ingredient.ofItems(Materials.TEORITE_INGOT)),

    DENDRITE(5, 1800, 7.0F, 7.0F, 25,() -> Ingredient.ofItems(Materials.DENDRITE_CRYSTAL)),

    EBONY(5, 1800, 7.0F, 7.0F, 25,() -> Ingredient.ofItems(Materials.EBONY_PLANKS));

    private final int miningLevel;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairIngredient;

    ModToolMaterial(int miningLevel, int itemDurability, float miningSpeed, float attackDamage, int enchantability, Supplier<Ingredient> repairIngredient) {
        this.miningLevel = miningLevel;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = repairIngredient;
    }

    @Override
    public int getDurability() {
        return this.itemDurability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public int getMiningLevel() {
        return this.miningLevel;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}