package net.xanthian.arbiters_seal.items.tools.swords;

import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolMaterial;
import net.xanthian.arbiters_seal.items.tools.ModSwordItem;
import net.xanthian.arbiters_seal.status_effects.ModStatusEffects;
import net.xanthian.arbiters_seal.util.ModAttributes;

import java.util.Random;
import java.util.UUID;

public class ToothedSword extends ModSwordItem {
    public ToothedSword(ToolMaterial toolMaterial, int attackDamage, float attackSpeed) {
        super(toolMaterial, attackDamage, attackSpeed);
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        ItemStack mainHand = attacker.getEquippedStack(EquipmentSlot.MAINHAND);
        if (mainHand.getItem() == this) {
            Random random = new Random();
            if (random.nextFloat() <= 0.50f) {
                if (target.getStatusEffect(ModStatusEffects.BLEED) == null || target.getStatusEffect(ModStatusEffects.BLEED).getDuration() < 20 && !target.isUndead()) {
                    target.addStatusEffect(new StatusEffectInstance(ModStatusEffects.BLEED, 200, 0, true, true, true), attacker);
                }
            }
            if (random.nextFloat() <= 0.05F) {
                float baseDamage = (float) attacker.getAttributeValue(EntityAttributes.GENERIC_ATTACK_DAMAGE);
                float extraDamageMultiplier = 1.5F;
                target.damage(DamageSource.GENERIC,(baseDamage*extraDamageMultiplier));
            }
        }
        return super.postHit(stack, target, attacker);
    }

    private static final UUID CRIT_MODIFIER = UUID.fromString("7c9810b4-069a-436c-a1af-8a13b5ebf3af");

    @Override
    public Multimap<EntityAttribute, EntityAttributeModifier> getAttributeModifiers(ItemStack stack, EquipmentSlot slot) {
        ImmutableMultimap.Builder<EntityAttribute, EntityAttributeModifier> builder = ImmutableMultimap.builder();
        Multimap<EntityAttribute, EntityAttributeModifier> modifiers = super.getAttributeModifiers(slot);
        builder.putAll(modifiers);
        if (slot == EquipmentSlot.MAINHAND) {
            builder.put(ModAttributes.GENERIC_CRIT_BOOST,
                    new EntityAttributeModifier(CRIT_MODIFIER, "crit Increase", 0.05F,
                            EntityAttributeModifier.Operation.MULTIPLY_TOTAL));
        }
        return builder.build();
    }
}