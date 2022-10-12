package net.xanthian.arbiters_seal.items.shields.shields;

import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Rarity;
import net.xanthian.arbiters_seal.items.shields.ModShieldItem;
import net.xanthian.arbiters_seal.material.ModShieldTiers;

import java.util.UUID;

public class ShieldOfTheSix extends ModShieldItem {

    private static final UUID TOUGH_MODIFIER = UUID.fromString("77efdd68-3c3f-4b38-b0fe-9ef00ee62eb0");
    private static final UUID ARMOR_MODIFIER = UUID.fromString("4e183ca0-7fd4-49d0-913f-afb0ffbd177c");
    private static final UUID KNOCKBACK_MODIFIER = UUID.fromString("20cd2e39-f5b8-48c8-a059-81af4872aea3");

    public ShieldOfTheSix(ModShieldTiers tier) {
        super(tier);
    }
        @Override
        public Rarity getRarity(ItemStack stack) {
            return Rarity.EPIC;
        }
    @Override
    public Multimap<EntityAttribute, EntityAttributeModifier> getAttributeModifiers(EquipmentSlot slot) {
        ImmutableMultimap.Builder<EntityAttribute, EntityAttributeModifier> builder = ImmutableMultimap.builder();
        Multimap<EntityAttribute, EntityAttributeModifier> modifiers = super.getAttributeModifiers(slot);
        builder.putAll(modifiers);

        if(slot == EquipmentSlot.OFFHAND) {
            builder.put(EntityAttributes.GENERIC_ARMOR_TOUGHNESS,
                    new EntityAttributeModifier(TOUGH_MODIFIER, "Toughness Increase", 3,
                            EntityAttributeModifier.Operation.ADDITION));
            builder.put(EntityAttributes.GENERIC_ARMOR,
                    new EntityAttributeModifier(ARMOR_MODIFIER, "Armor Increase", 3,
                            EntityAttributeModifier.Operation.ADDITION));
            builder.put(EntityAttributes.GENERIC_KNOCKBACK_RESISTANCE,
                    new EntityAttributeModifier(KNOCKBACK_MODIFIER, "Knockback Increase", 0.1,
                            EntityAttributeModifier.Operation.ADDITION));
        }
        return builder.build();
    }
}