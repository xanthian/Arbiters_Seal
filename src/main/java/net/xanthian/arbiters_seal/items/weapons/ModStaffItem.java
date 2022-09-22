package net.xanthian.arbiters_seal.items.weapons;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.xanthian.arbiters_seal.Init;

public class ModStaffItem extends SwordItem {
    public ModStaffItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed) {
        super(toolMaterial, attackDamage, attackSpeed, new FabricItemSettings().group(Init.ARBITERS_SEAL_WEAPONS));
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        ItemStack mainHand = attacker.getEquippedStack(EquipmentSlot.MAINHAND);

        if ((mainHand.getItem() == Staffs.HEALING_STAFF)) {
            if (attacker.getStatusEffect(StatusEffects.REGENERATION) == null || attacker.getStatusEffect(StatusEffects.REGENERATION).getDuration() < 180) {
                attacker.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 200, 0, true, false, true), target);
            }
        }
        return super.postHit(stack, target, attacker);
    }
}
