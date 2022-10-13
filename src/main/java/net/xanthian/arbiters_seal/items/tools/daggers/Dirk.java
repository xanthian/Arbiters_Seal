package net.xanthian.arbiters_seal.items.tools.daggers;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolMaterial;
import net.xanthian.arbiters_seal.items.tools.ModDaggerItem;

import java.util.Random;

public class Dirk extends ModDaggerItem {
    public Dirk(ToolMaterial toolMaterial, int attackDamage, float attackSpeed) {
        super(toolMaterial, attackDamage, attackSpeed);
    }
    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        ItemStack mainHand = attacker.getEquippedStack(EquipmentSlot.MAINHAND);
        ItemStack offHand = attacker.getEquippedStack(EquipmentSlot.OFFHAND);
        if (mainHand.getItem() == this || offHand.getItem() == this) {
            Random random = new Random();
            if (random.nextFloat() <= 0.62f) {
                if (target.getStatusEffect(StatusEffects.BLINDNESS) == null || target.getStatusEffect(StatusEffects.BLINDNESS).getDuration() < 20) {
                    target.addStatusEffect(new StatusEffectInstance(StatusEffects.BLINDNESS, 200, 0, true, true, true), target);
                }
            }
        }
        return super.postHit(stack, target, attacker);
    }
}
