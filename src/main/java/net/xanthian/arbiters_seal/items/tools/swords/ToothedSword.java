package net.xanthian.arbiters_seal.items.tools.swords;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolMaterial;
import net.xanthian.arbiters_seal.items.tools.ModSwordItem;
import net.xanthian.arbiters_seal.status_effects.ModStatusEffects;

import java.util.Random;

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
        }
        return super.postHit(stack, target, attacker);
    }
}