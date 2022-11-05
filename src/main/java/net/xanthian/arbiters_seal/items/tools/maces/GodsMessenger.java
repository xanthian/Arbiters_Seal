package net.xanthian.arbiters_seal.items.tools.maces;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolMaterial;
import net.minecraft.util.Rarity;
import net.minecraft.world.World;
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
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        if (!world.isClient && (entity instanceof PlayerEntity player)) {
            if (player.getEquippedStack(EquipmentSlot.MAINHAND).isOf(this)) {
                if (player.age % 180 == 0) {
                    player.addStatusEffect(new StatusEffectInstance(StatusEffects.HASTE, 220, 0, true, false, true));
                }
            }
        }
    }

    @Override
    public float getCrit() {
        return 0.05F;
    }
}