package net.xanthian.arbiters_seal.material;

import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.tag.ItemTags;
import net.xanthian.arbiters_seal.blocks.ModBlocks;
import net.xanthian.arbiters_seal.items.ModItems;

import java.util.function.Supplier;

public enum ModShieldMaterial implements ModShieldTiers {

    //Vanilla
    WOOD(59, 15, () -> Ingredient.fromTag(ItemTags.PLANKS)),
    STONE( 131, 5, () -> Ingredient.fromTag(ItemTags.STONE_TOOL_MATERIALS)),
    IRON(250, 14, () -> Ingredient.ofItems(Items.IRON_INGOT)),
    DIAMOND(1561, 10, () -> Ingredient.ofItems(Items.DIAMOND)),
    GOLD(32, 22, () -> Ingredient.ofItems(Items.GOLD_INGOT)),
    NETHERITE(2031, 15, () -> Ingredient.ofItems(Items.NETHERITE_INGOT)),

    //Mod
    BRONZE(250, 14, () -> Ingredient.ofItems(ModItems.BRONZE_INGOT)),
    SILVER(50, 20, () -> Ingredient.ofItems(ModItems.SILVER_INGOT)),
    TEORITE(500, 12, () -> Ingredient.ofItems(ModItems.TEORITE_INGOT)),
    EBONY(500, 6, () -> Ingredient.ofItems(ModBlocks.EBONY_PLANKS)),
    STEEL(350, 10, () -> Ingredient.ofItems(ModItems.STEEL_INGOT)),
    DENDRITE(1250, 16, () -> Ingredient.ofItems(ModItems.DENDRITE_CRYSTAL));


    private final int itemDurability;
    private final int enchantability;
    private final Supplier<Ingredient> repairIngredient;

    ModShieldMaterial(int itemDurability, int enchantability, Supplier<Ingredient> repairIngredient) {
        this.itemDurability = itemDurability;
        this.enchantability = enchantability;
        this.repairIngredient = repairIngredient;
    }

    @Override
    public int getItemDurability() {
        return this.itemDurability;
    }

    @Override
    public int getEnchantabilty() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}
