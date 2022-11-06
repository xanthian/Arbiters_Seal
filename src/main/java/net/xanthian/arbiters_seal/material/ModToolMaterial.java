package net.xanthian.arbiters_seal.material;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.xanthian.arbiters_seal.blocks.ModBlocks;
import net.xanthian.arbiters_seal.items.NormalItems;


import java.util.function.Supplier;

public enum ModToolMaterial implements ToolMaterial {

    BRONZE(1, 250, 6.0F, 2.0F, 14,() -> Ingredient.ofItems(NormalItems.BRONZE_INGOT)),
    SILVER(1, 50, 8.0F, 0.0F, 20,() -> Ingredient.ofItems(NormalItems.SILVER_INGOT)),
    TEORITE(2, 500, 5.0F, 2.0F, 12,() -> Ingredient.ofItems(NormalItems.TEORITE_INGOT)),
    EBONY(3, 500, 8.0F, 3.0F, 6,() -> Ingredient.ofItems(ModBlocks.EBONY_PLANKS)),
    STEEL(3, 350, 8.0F, 3.0F, 10,() -> Ingredient.ofItems(NormalItems.STEEL_INGOT)),
    DENDRITE(3, 1250, 8.0F, 3.0F, 16,() -> Ingredient.ofItems(NormalItems.DENDRITE_CRYSTAL));


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