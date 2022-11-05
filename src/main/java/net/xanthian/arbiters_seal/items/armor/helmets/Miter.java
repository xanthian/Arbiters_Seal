package net.xanthian.arbiters_seal.items.armor.helmets;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.xanthian.arbiters_seal.items.armor.ModHelmetItem;
import net.xanthian.arbiters_seal.status_effects.ModStatusEffects;

public class Miter extends ModHelmetItem {
    public Miter(ArmorMaterial material) {
        super(material);
    }
    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int itemSlot, boolean isSelected) {
        if (!world.isClient && (entity instanceof PlayerEntity player)) {
            if (player.getEquippedStack(EquipmentSlot.MAINHAND).isOf(this)) {
                if (player.age % 40 == 0) {
                    if (player.getStatusEffect(ModStatusEffects.SILENCE) != null) {
                        player.removeStatusEffect(ModStatusEffects.SILENCE);
                    }
                }
            }
        }
    }
}