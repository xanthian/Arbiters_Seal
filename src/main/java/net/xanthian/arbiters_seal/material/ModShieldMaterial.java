package net.xanthian.arbiters_seal.material;

import net.minecraft.recipe.Ingredient;
import net.minecraft.tag.ItemTags;
import net.xanthian.arbiters_seal.blocks.ModBlocks;
import net.xanthian.arbiters_seal.items.NormalItems;

import java.util.function.Supplier;

public enum ModShieldMaterial implements ModShieldTiers {

    //Vanilla
    WOOD(59, 15,100, () -> Ingredient.fromTag(ItemTags.PLANKS)),
    STONE( 131, 5,100, () -> Ingredient.fromTag(ItemTags.STONE_TOOL_MATERIALS)),
    IRON(250, 14, 90,() -> Ingredient.ofItems(net.minecraft.item.Items.IRON_INGOT)),
    DIAMOND(1561, 10,75, () -> Ingredient.ofItems(net.minecraft.item.Items.DIAMOND)),
    GOLD(32, 22, 110,() -> Ingredient.ofItems(net.minecraft.item.Items.GOLD_INGOT)),
    NETHERITE(2031, 15,50, () -> Ingredient.ofItems(net.minecraft.item.Items.NETHERITE_INGOT)),

    //Mod
    BRONZE(250, 14,90, () -> Ingredient.ofItems(NormalItems.BRONZE_INGOT)),
    SILVER(50, 20,110, () -> Ingredient.ofItems(NormalItems.SILVER_INGOT)),
    TEORITE(500, 12,85, () -> Ingredient.ofItems(NormalItems.TEORITE_INGOT)),
    EBONY(500, 6,80, () -> Ingredient.ofItems(ModBlocks.EBONY_PLANKS)),
    STEEL(350, 10,90, () -> Ingredient.ofItems(NormalItems.STEEL_INGOT)),
    DENDRITE(1250, 16,70, () -> Ingredient.ofItems(NormalItems.DENDRITE_CRYSTAL));


    private final int itemDurability;
    private final int enchantability;
    private final int cooldownTicks;
    private final Supplier<Ingredient> repairIngredient;

    ModShieldMaterial(int itemDurability, int enchantability,int cooldown, Supplier<Ingredient> repairIngredient) {
        this.itemDurability = itemDurability;
        this.enchantability = enchantability;
        this.cooldownTicks = cooldown;
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
    public int getCooldownTicks() {
        return this.cooldownTicks;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}
