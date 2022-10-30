package net.xanthian.arbiters_seal.items.tools.maces;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolMaterial;
import net.minecraft.util.Rarity;
import net.xanthian.arbiters_seal.items.tools.ModMaceItem;

public class GodsMessenger extends ModMaceItem {
    public GodsMessenger(ToolMaterial toolMaterial, int attackDamage, float attackSpeed) {
        super(toolMaterial, attackDamage, attackSpeed);
    }
    @Override
    public Rarity getRarity(ItemStack stack) {
        return Rarity.RARE;
    }
    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        ItemStack mainHand = attacker.getEquippedStack(EquipmentSlot.MAINHAND);
        if (mainHand.getItem() == this) {
            if (attacker.getStatusEffect(StatusEffects.HASTE) == null || attacker.getStatusEffect(StatusEffects.HASTE).getDuration() < 20) {
                attacker.addStatusEffect(new StatusEffectInstance(StatusEffects.HASTE,200,0,true, true, true));
            }
        }
        return super.postHit(stack, target, attacker);
    }
    @Override
    public float getCrit() {
        return 0.05F;
    }
}