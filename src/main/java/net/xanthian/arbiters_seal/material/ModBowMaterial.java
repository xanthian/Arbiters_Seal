package net.xanthian.arbiters_seal.material;

import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.xanthian.arbiters_seal.blocks.ModBlocks;
import net.xanthian.arbiters_seal.items.ModItems;

import java.util.function.Supplier;

public enum ModBowMaterial implements ModBowTiers {

    //Vanilla
    IRON(250, 2.0F, 14, () -> Ingredient.ofItems(Items.IRON_INGOT)),
    DIAMOND(1561, 3.0F, 10, () -> Ingredient.ofItems(Items.DIAMOND)),
    GOLD(32, 0.0F, 22, () -> Ingredient.ofItems(Items.GOLD_INGOT)),
    NETHERITE(2031, 4.0F, 15, () -> Ingredient.ofItems(Items.NETHERITE_INGOT)),

    //Mod
    BRONZE(250, 1.0F, 14, () -> Ingredient.ofItems(ModItems.BRONZE_INGOT)),
    SILVER(50, 0.5F, 20, () -> Ingredient.ofItems(ModItems.SILVER_INGOT)),
    TEORITE(500, 2.0F, 12, () -> Ingredient.ofItems(ModItems.TEORITE_INGOT)),
    EBONY(500, 2.0F, 6, () -> Ingredient.ofItems(ModBlocks.EBONY_PLANKS)),
    STEEL(350, 1.5F, 10, () -> Ingredient.ofItems(ModItems.STEEL_INGOT)),
    DENDRITE(1250, 2.5F, 16, () -> Ingredient.ofItems(ModItems.DENDRITE_CRYSTAL));


    private final int itemDurability;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairIngredient;

    private ModBowMaterial(int itemDurability, float attackDamage, int enchantability, Supplier<Ingredient> repairIngredient) {
        this.itemDurability = itemDurability;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = repairIngredient;
    }


    public int getItemDurability() {
        return this.itemDurability;
    }

    public float getAttackDamageBonus() {
        return this.attackDamage;
    }

    public int getEnchantabilty() {
        return this.enchantability;
    }

    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}