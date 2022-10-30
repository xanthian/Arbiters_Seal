package net.xanthian.arbiters_seal.items.tools.swords;

import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolMaterial;
import net.minecraft.util.Rarity;
import net.xanthian.arbiters_seal.items.tools.ModSwordItem;
import net.xanthian.arbiters_seal.util.ModAttributes;

import java.util.UUID;

public class Eternias extends ModSwordItem {
    public Eternias(ToolMaterial toolMaterial, int attackDamage, float attackSpeed) {
        super(toolMaterial, attackDamage, attackSpeed);
    }
    private static final UUID CRIT_MODIFIER = UUID.fromString("12f66cd8-9883-42f9-b38d-11e5c8c9362d");

    @Override
    public Rarity getRarity(ItemStack stack) {
        return Rarity.UNCOMMON;
    }
    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        ItemStack mainHand = attacker.getEquippedStack(EquipmentSlot.MAINHAND);
        if ((mainHand.getItem() == this)) {
            if (attacker.getStatusEffect(StatusEffects.STRENGTH) == null || attacker.getStatusEffect(StatusEffects.STRENGTH).getDuration() < 180)  {
                attacker.addStatusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 200, 0, true, false, true), target);
            }
        }
        return super.postHit(stack, target, attacker);
    }
    @Override
    public Multimap<EntityAttribute, EntityAttributeModifier> getAttributeModifiers(ItemStack stack, EquipmentSlot slot) {
        ImmutableMultimap.Builder<EntityAttribute, EntityAttributeModifier> builder = ImmutableMultimap.builder();
        Multimap<EntityAttribute, EntityAttributeModifier> modifiers = super.getAttributeModifiers(slot);
        builder.putAll(modifiers);
        if (slot == EquipmentSlot.MAINHAND) {
            builder.put(ModAttributes.GENERIC_CRIT_BOOST,
                    new EntityAttributeModifier(CRIT_MODIFIER, "crit Increase", 0.1F,
                            EntityAttributeModifier.Operation.MULTIPLY_TOTAL));
        }
        return builder.build();
    }
}