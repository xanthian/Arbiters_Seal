package net.xanthian.arbiters_seal.items.tools.swords;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolMaterial;
import net.minecraft.util.Rarity;
import net.xanthian.arbiters_seal.items.tools.ModSwordItem;

public class Eternias extends ModSwordItem {
    public Eternias(ToolMaterial toolMaterial, int attackDamage, float attackSpeed) {
        super(toolMaterial, attackDamage, attackSpeed);
    }
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
}
