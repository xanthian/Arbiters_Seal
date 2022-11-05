package net.xanthian.arbiters_seal.items.tools.rapiers;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolMaterial;
import net.minecraft.world.World;
import net.xanthian.arbiters_seal.items.tools.ModRapierItem;
import net.xanthian.arbiters_seal.status_effects.ModStatusEffects;

public class TeoriteRapier extends ModRapierItem {
    public TeoriteRapier(ToolMaterial toolMaterial, int attackDamage, float attackSpeed) {
        super(toolMaterial, attackDamage, attackSpeed);
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int itemSlot, boolean isSelected) {
        if (!world.isClient && (entity instanceof PlayerEntity player)) {
            if (player.getEquippedStack(EquipmentSlot.MAINHAND).isOf(this)) {
                    if (player.getStatusEffect(ModStatusEffects.SILENCE) != null) {
                        player.removeStatusEffect(ModStatusEffects.SILENCE);
                    }
                }
            }
        }
    }
