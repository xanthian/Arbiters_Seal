package net.xanthian.arbiters_seal.items.tools.spears;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolMaterial;
import net.minecraft.util.Rarity;
import net.minecraft.world.World;
import net.xanthian.arbiters_seal.items.tools.ModSpearItem;
import net.xanthian.arbiters_seal.status_effects.ModStatusEffects;

public class Godray extends ModSpearItem {
    public Godray(ToolMaterial toolMaterial, int attackDamage, float attackSpeed) {
        super(toolMaterial, attackDamage, attackSpeed);
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int itemSlot, boolean isSelected) {
        if (!world.isClient && (entity instanceof PlayerEntity player)) {
            if (player.getEquippedStack(EquipmentSlot.MAINHAND).isOf(this)) {
                    if (player.getStatusEffect(ModStatusEffects.SLEEP) != null) {
                        player.removeStatusEffect(ModStatusEffects.SLEEP);
                    }
                    if (player.getStatusEffect(ModStatusEffects.BERSERK) != null) {
                        player.removeStatusEffect(ModStatusEffects.BERSERK);
                    }
                    if (player.getStatusEffect(ModStatusEffects.CHARM) != null) {
                        player.removeStatusEffect(ModStatusEffects.CHARM);
                    }
                }
            }
        }

        @Override
        public Rarity getRarity(ItemStack stack) {
            return Rarity.RARE;
        }
}
