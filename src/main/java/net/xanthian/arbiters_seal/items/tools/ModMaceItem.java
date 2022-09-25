package net.xanthian.arbiters_seal.items.tools;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.xanthian.arbiters_seal.Init;
import net.xanthian.arbiters_seal.status_effects.ModStatusEffects;

public class ModMaceItem extends SwordItem {
    public ModMaceItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed) {
        super(toolMaterial, attackDamage, attackSpeed, new FabricItemSettings().group(Init.ARBITERS_SEAL_WEAPONS));
    }
    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        ItemStack mainHand = attacker.getEquippedStack(EquipmentSlot.MAINHAND);

        if (mainHand.getItem() == Maces.SILVER_MACE) {
            if (attacker.getStatusEffect(StatusEffects.POISON) !=null) {
                attacker.removeStatusEffect(StatusEffects.POISON);
            }
        }

        if (mainHand.getItem() == Maces.GODS_MESSENGER) {
            if (attacker.getStatusEffect(StatusEffects.HASTE) == null || attacker.getStatusEffect(StatusEffects.HASTE).getDuration() < 20) {
                attacker.addStatusEffect(new StatusEffectInstance(StatusEffects.HASTE,200,0,true, true, true));
            }
        }
        return super.postHit(stack, target, attacker);
    }
}