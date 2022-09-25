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

import java.util.Random;

public class ModRapierItem extends SwordItem {
    public ModRapierItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed) {
        super(toolMaterial, attackDamage, attackSpeed, new FabricItemSettings().group(Init.ARBITERS_SEAL_WEAPONS));
    }
    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        ItemStack mainHand = attacker.getEquippedStack(EquipmentSlot.MAINHAND);

            if ((mainHand.getItem() == Rapiers.DEL_CHLISS)) {
                Random random = new Random();
                if (random.nextFloat() <= 0.75f) {
                    if (target.getStatusEffect(StatusEffects.WITHER) == null || target.getStatusEffect(StatusEffects.WITHER).getDuration() < 20) {
                        target.addStatusEffect(new StatusEffectInstance(StatusEffects.WITHER, 100, 0, true, true, true), target);
                    }
                }
            }
                return super.postHit(stack, target, attacker);
    }
}