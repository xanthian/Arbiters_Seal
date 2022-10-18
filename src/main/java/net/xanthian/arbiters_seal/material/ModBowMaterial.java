package net.xanthian.arbiters_seal.material;

import net.minecraft.recipe.Ingredient;
import net.minecraft.tag.ItemTags;
import net.xanthian.arbiters_seal.blocks.ModBlocks;
import net.xanthian.arbiters_seal.items.Items;

import java.util.function.Supplier;

public enum ModBowMaterial implements ModBowTiers {

    //Vanilla
    WOOD(384, 0.5F,  15, 1, () -> Ingredient.fromTag(ItemTags.PLANKS)),
    STONE( 576, 1.0F, 16, 1, () -> Ingredient.fromTag(ItemTags.STONE_TOOL_MATERIALS)),
    IRON(768, 1.5F, 17,1, () -> Ingredient.ofItems(net.minecraft.item.Items.IRON_INGOT)),
    DIAMOND(1344, 2.0F, 18,2, () -> Ingredient.ofItems(net.minecraft.item.Items.DIAMOND)),
    GOLD(192, 0.0F, 16,1, () -> Ingredient.ofItems(net.minecraft.item.Items.GOLD_INGOT)),
    NETHERITE(1536, 3.0F, 20,2, () -> Ingredient.ofItems(net.minecraft.item.Items.NETHERITE_INGOT)),

    //Mod
    BRONZE(384, 1.0F, 15,1, () -> Ingredient.ofItems(Items.BRONZE_INGOT)),
    SILVER(192, 1.0F, 16,1, () -> Ingredient.ofItems(Items.SILVER_INGOT)),
    TEORITE(768, 1.5F, 17,1, () -> Ingredient.ofItems(Items.TEORITE_INGOT)),
    EBONY(960, 2.0F, 17,1, () -> Ingredient.ofItems(ModBlocks.EBONY_PLANKS)),
    STEEL(768, 1.5F, 17,1, () -> Ingredient.ofItems(Items.STEEL_INGOT)),
    DENDRITE(1152, 2.5F, 18,2, () -> Ingredient.ofItems(Items.DENDRITE_CRYSTAL));


    private final int durability;
    private final float damageBonus;
    private final int rangeBonus;
    private final int enchantability;
    private final Supplier<Ingredient> repairIngredient;

    private ModBowMaterial(int itemDurability, float attackDamage, int rangeBonus, int enchantability, Supplier<Ingredient> repairIngredient) {
        this.durability = itemDurability;
        this.damageBonus = attackDamage;
        this.rangeBonus = rangeBonus;
        this.enchantability = enchantability;
        this.repairIngredient = repairIngredient;
    }


    public int getDurability() {
        return this.durability;
    }

    public float getDamageBonus() {
        return this.damageBonus;
    }

    public int getRangeBonus() {
        return this.rangeBonus;
    }

    public int getEnchantability() {
        return this.enchantability;
    }

    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}