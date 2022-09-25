package net.xanthian.arbiters_seal.items.tools;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.AxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolMaterial;
import net.minecraft.particle.ParticleTypes;
import net.xanthian.arbiters_seal.Init;
import net.xanthian.arbiters_seal.status_effects.ModStatusEffects;

public class ModAxeItem extends AxeItem {
    public ModAxeItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed) {
        super(toolMaterial, attackDamage, attackSpeed, new FabricItemSettings().group(Init.ARBITERS_SEAL_WEAPONS));
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        ItemStack mainHand = attacker.getEquippedStack(EquipmentSlot.MAINHAND);
        if (!target.world.isClient() && (mainHand.getItem() == Axes.BLOOD_AXE)) {
            if (attacker.getStatusEffect(ModStatusEffects.LIFERECOVERY_COOLDOWN) == null && (attacker.getHealth() != attacker.getMaxHealth())) {
                attacker.heal(6.0F);
                attacker.addStatusEffect(new StatusEffectInstance(ModStatusEffects.LIFERECOVERY_COOLDOWN, 500, 0, true, false, true), target);
                target.world.addParticle(ParticleTypes.HEART, target.getX() + 0.5, target.getY() + 1D, target.getZ() + 1, 0d, 0.05D, 0d);
                //}
            }
        }
        return super.postHit(stack, target, attacker);
    }
}