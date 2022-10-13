package net.xanthian.arbiters_seal.items.tools.daggers;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolMaterial;
import net.xanthian.arbiters_seal.items.tools.ModDaggerItem;
import net.xanthian.arbiters_seal.status_effects.ModStatusEffects;

import java.util.Random;

public class DendriteKnife extends ModDaggerItem {
    public DendriteKnife(ToolMaterial toolMaterial, int attackDamage, float attackSpeed) {
        super(toolMaterial, attackDamage, attackSpeed);
    }
    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        ItemStack mainHand = attacker.getEquippedStack(EquipmentSlot.MAINHAND);
        ItemStack offHand = attacker.getEquippedStack(EquipmentSlot.OFFHAND);
        if (mainHand.getItem() == this || offHand.getItem() == this) {
            Random random = new Random();
            if (random.nextFloat() <= 0.75f) {
                if (target.getStatusEffect(ModStatusEffects.BLEED) == null || target.getStatusEffect(ModStatusEffects.BLEED).getDuration() < 20) {
                    target.addStatusEffect(new StatusEffectInstance(ModStatusEffects.BLEED, 200, 0, true, true, true), target);
                }
            }
        }
        return super.postHit(stack, target, attacker);
    }
}
