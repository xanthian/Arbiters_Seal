package net.xanthian.arbiters_seal.items.tools.maces;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolMaterial;
import net.xanthian.arbiters_seal.items.tools.ModMaceItem;

public class SilverMace extends ModMaceItem {
    public SilverMace(ToolMaterial toolMaterial, int attackDamage, float attackSpeed) {
        super(toolMaterial, attackDamage, attackSpeed);
    }
    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        ItemStack mainHand = attacker.getEquippedStack(EquipmentSlot.MAINHAND);
        if (mainHand.getItem() == this) {
            if (attacker.getStatusEffect(StatusEffects.POISON) != null) {
                attacker.removeStatusEffect(StatusEffects.POISON);
            }
        }
        return super.postHit(stack, target, attacker);
    }
    @Override
    public float getCrit() {
        return 0.03F;
    }
}