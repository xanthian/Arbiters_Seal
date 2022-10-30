package net.xanthian.arbiters_seal.items.tools.axes;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolMaterial;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.util.Rarity;
import net.xanthian.arbiters_seal.items.tools.ModAxeItem;

public class BloodAxe extends ModAxeItem {
    public BloodAxe(ToolMaterial toolMaterial, int attackDamage, float attackSpeed) {
        super(toolMaterial, attackDamage, attackSpeed);
    }

    @Override
    public Rarity getRarity(ItemStack stack) {
        return Rarity.UNCOMMON;
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        ItemStack mainHand = attacker.getEquippedStack(EquipmentSlot.MAINHAND);
        if (!target.world.isClient() && (mainHand.getItem() == this)) {
            if (attacker instanceof PlayerEntity player) {
                if ((player.getItemCooldownManager().isCoolingDown(this) == false) && player.getHealth() < player.getMaxHealth()/2) {
                    player.heal(8);
                    player.getItemCooldownManager().set(this, 1200);
                    target.world.addParticle(ParticleTypes.HEART, target.getX() + 0.5, target.getY() + 1D, target.getZ() + 1, 0d, 0.05D, 0d);
                }
            }
        }
        return super.postHit(stack, target, attacker);
    }
}