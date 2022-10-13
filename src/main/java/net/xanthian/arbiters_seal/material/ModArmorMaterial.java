package net.xanthian.arbiters_seal.material;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.xanthian.arbiters_seal.items.OtherItems;

import java.util.function.Supplier;

public enum ModArmorMaterial implements ArmorMaterial {

    // VANILLA
    LEATHER("leather", 5, new int[]{1, 2, 3, 1}, 15,
            SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F, 0.0F, () -> Ingredient.ofItems(Items.LEATHER)),

    CHAIN("chainmail", 15, new int[]{1, 4, 5, 2}, 12,
            SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0F, 0.0F, () -> Ingredient.ofItems(Items.IRON_INGOT)),

    IRON("iron", 15, new int[]{2, 5, 6, 2}, 9,
            SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F, 0.0F, () ->  Ingredient.ofItems(Items.IRON_INGOT)),

    GOLD("gold", 7, new int[]{1, 3, 5, 2}, 25,
            SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 0.0F, 0.0F, () -> Ingredient.ofItems(Items.GOLD_INGOT)),

    DIAMOND("diamond", 33, new int[]{3, 6, 8, 3}, 10,
            SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F, 0.0F, () -> Ingredient.ofItems(Items.DIAMOND)),

    TURTLE("turtle", 25, new int[]{2, 5, 6, 2}, 9,
            SoundEvents.ITEM_ARMOR_EQUIP_TURTLE, 0.0F, 0.0F, () -> Ingredient.ofItems(Items.SCUTE)),

    NETHERITE("netherite", 37, new int[]{3, 6, 8, 3}, 15,
            SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 3.0F, 0.1F, () -> Ingredient.ofItems(Items.NETHERITE_INGOT)),


    // MODDED
    BRONZE("bronze", 11, new int[]{1, 4, 6, 1}, 9,
            SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0f, 0.0f, () -> Ingredient.ofItems(OtherItems.BRONZE_INGOT)),

    SILVER("silver", 9, new int[]{2, 4, 6, 2}, 23,
            SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 0.0f, 0.0f, () -> Ingredient.ofItems(OtherItems.SILVER_INGOT)),

    STEEL("steel", 16, new int[]{2, 5, 7, 2}, 5,
            SoundEvents.ITEM_ARMOR_EQUIP_IRON, 1.0f, 0.5f, () -> Ingredient.ofItems(OtherItems.STEEL_INGOT)),

    TEORITE("teorite", 20, new int[]{3, 6, 8, 3}, 15,
            SoundEvents.ITEM_ARMOR_EQUIP_IRON, 1.5f, 0.1f, () -> Ingredient.ofItems(OtherItems.TEORITE_INGOT)),

    DENDRITE("dendrite", 35, new int[]{3, 6, 8, 3}, 20,
            SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0f, 0.1f, () -> Ingredient.ofItems(OtherItems.DENDRITE_CRYSTAL)),

    // MODDED VANILLA
    CLOTH("cloth", 5, new int[]{1, 2, 3, 1}, 15,
            SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F, 0.0F, () -> Ingredient.ofItems(Items.LEATHER)),

    NINJA("ninja", 15, new int[]{2, 5, 6, 2}, 9,
            SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F, 0.0F, () ->  Ingredient.ofItems(Items.IRON_INGOT)),

    GOLDEN("golden", 7, new int[]{1, 3, 5, 2}, 25,
            SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 0.0F, 0.0F, () -> Ingredient.ofItems(Items.GOLD_INGOT)),

    DARKSILK("darksilk", 33, new int[]{3, 6, 8, 3}, 10,
            SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F, 0.0F, () -> Ingredient.ofItems(Items.DIAMOND)),

    ROYAL("royal", 37, new int[]{3, 6, 8, 3}, 15,
            SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 3.0F, 0.1F, () -> Ingredient.ofItems(Items.NETHERITE_INGOT));



        private static final int[] BASE_DURABILITY;
        private final String name;
        private final int durabilityMultiplier;
        private final int[] protectionAmounts;
        private final int enchantability;
        private final SoundEvent equipSound;
        private final float toughness;
        private final float knockbackResistance;
        private final Supplier<Ingredient> repairIngredient;


    private ModArmorMaterial(String name, int durabilityMultiplier, int[] protectionAmounts,
                                    int enchantability, SoundEvent equipSound, float toughness,
                                    float knockbackResistance, Supplier<Ingredient> repairIngredient) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.protectionAmounts = protectionAmounts;
        this.enchantability = enchantability;
        this.equipSound = equipSound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredient = repairIngredient;
    }

    public int getDurability(EquipmentSlot slot) {
        return BASE_DURABILITY[slot.getEntitySlotId()] * this.durabilityMultiplier;
    }

    public int getProtectionAmount(EquipmentSlot slot) {
        return this.protectionAmounts[slot.getEntitySlotId()];
    }

    public int getEnchantability() {
        return this.enchantability;
    }

    public SoundEvent getEquipSound() {
        return this.equipSound;
    }

    public Ingredient getRepairIngredient() {
        return (Ingredient)this.repairIngredient.get();
    }

    public String getName() {
        return this.name;
    }

    public float getToughness() {
        return this.toughness;
    }

    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }

    static {
        BASE_DURABILITY = new int[]{13, 15, 16, 11};
    }
}