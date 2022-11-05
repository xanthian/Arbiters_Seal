package net.xanthian.arbiters_seal.items.tools.daggers;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolMaterial;
import net.xanthian.arbiters_seal.items.tools.ModDaggerItem;
import net.xanthian.arbiters_seal.status_effects.ModStatusEffects;

import java.util.Random;

public class Tongueslicer extends ModDaggerItem {
    public Tongueslicer(ToolMaterial toolMaterial, int attackDamage, float attackSpeed) {
        super(toolMaterial, attackDamage, attackSpeed);
    }
    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        ItemStack mainHand = attacker.getEquippedStack(EquipmentSlot.MAINHAND);
        ItemStack offHand = attacker.getEquippedStack(EquipmentSlot.OFFHAND);
        if (mainHand.getItem() == this || offHand.getItem() == this) {
            Random random = new Random();
            if (random.nextFloat() <= 0.62f) {
                if (target.getType() == EntityType.GHAST || target.getType() == EntityType.BLAZE || target.getType() == EntityType.GUARDIAN) {
                    if (target.getStatusEffect(ModStatusEffects.SILENCE) == null || target.getStatusEffect(ModStatusEffects.SILENCE).getDuration() < 20) {
                        target.addStatusEffect(new StatusEffectInstance(ModStatusEffects.SILENCE, 200, 0, true, true, true), target);
                    }
                }
            }
        }
        return super.postHit(stack, target, attacker);
    }
}
