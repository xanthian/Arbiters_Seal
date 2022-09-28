package net.xanthian.arbiters_seal.material;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.xanthian.arbiters_seal.items.ModItems;

import java.util.function.Supplier;

public enum ModArmorMaterial implements ArmorMaterial {

    BRONZE("bronze", 11, new int[]{1, 4, 6, 1}, 9,
            SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0f, 0.0f, () -> Ingredient.ofItems(ModItems.BRONZE_INGOT)),

    SILVER("silver", 9, new int[]{2, 4, 6, 2}, 23,
            SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 0.0f, 0.0f, () -> Ingredient.ofItems(ModItems.SILVER_INGOT)),

    STEEL("bronze", 16, new int[]{2, 5, 7, 2}, 5,
            SoundEvents.ITEM_ARMOR_EQUIP_IRON, 1.0f, 0.5f, () -> Ingredient.ofItems(ModItems.STEEL_INGOT)),

    TEORITE("bronze", 20, new int[]{3, 6, 8, 3}, 15,
            SoundEvents.ITEM_ARMOR_EQUIP_IRON, 1.5f, 0.1f, () -> Ingredient.ofItems(ModItems.TEORITE_INGOT)),

    DENDRITE("dendrite", 35, new int[]{3, 6, 8, 3}, 20,
            SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0f, 0.1f, () -> Ingredient.ofItems(ModItems.DENDRITE_CRYSTAL));

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