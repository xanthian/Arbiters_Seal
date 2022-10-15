package net.xanthian.arbiters_seal.items.tools.swords;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolMaterial;
import net.minecraft.world.World;
import net.xanthian.arbiters_seal.items.tools.ModSwordItem;
import net.xanthian.arbiters_seal.status_effects.ModStatusEffects;

public class SingingSword extends ModSwordItem {
    public SingingSword(ToolMaterial toolMaterial, int attackDamage, float attackSpeed) {
        super(toolMaterial, attackDamage, attackSpeed);
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        if (entity instanceof PlayerEntity player) {
            ItemStack mainHand = player.getEquippedStack(EquipmentSlot.MAINHAND);
            if ((mainHand.getItem() == this)) {
                if (player.getStatusEffect(ModStatusEffects.SLEEP) != null) {
                    player.removeStatusEffect(ModStatusEffects.SLEEP);
                }
            }
        }
        super.inventoryTick(stack, world, entity, slot, selected);
    }
}
