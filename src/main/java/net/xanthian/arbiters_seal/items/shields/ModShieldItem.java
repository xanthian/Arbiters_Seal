package net.xanthian.arbiters_seal.items.shields;

import com.github.crimsondawn45.fabricshieldlib.lib.object.FabricShieldItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.xanthian.arbiters_seal.Init;
import net.xanthian.arbiters_seal.material.ModShieldTiers;
import net.xanthian.arbiters_seal.status_effects.ModStatusEffects;

public class ModShieldItem extends FabricShieldItem {
    private final ModShieldTiers tier;

    public ModShieldItem(int cooldownTicks, ModShieldTiers tier) {
        super(new FabricItemSettings().maxDamage(tier.getItemDurability()).group(Init.ARBITERS_SEAL_WEAPONS), cooldownTicks, tier.getEnchantabilty());
        this.tier = tier;
    }

    @Override
    public boolean canRepair(ItemStack item, ItemStack repairItem) {
        return this.tier.getRepairIngredient().test(repairItem);
    }

    @Override
    public int getCooldownTicks() {
        return this.tier.getCooldownTicks();
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int itemSlot, boolean isSelected) {
        if (!world.isClient) {
            if (entity instanceof LivingEntity player) {
                if (player.getEquippedStack(EquipmentSlot.MAINHAND).isOf(Shields.AEGIS_SHIELD) || player.getEquippedStack(EquipmentSlot.OFFHAND).isOf(Shields.AEGIS_SHIELD)) {
                    ((LivingEntity) entity).addStatusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 1, 0));
                }
                if (player.getEquippedStack(EquipmentSlot.MAINHAND).isOf(Shields.ARBITER_SHIELD) || player.getEquippedStack(EquipmentSlot.OFFHAND).isOf(Shields.ARBITER_SHIELD)) {
                    if (player.getStatusEffect(ModStatusEffects.MUTE) != null) {
                        player.removeStatusEffect(ModStatusEffects.MUTE);}
                    if (player.getStatusEffect(StatusEffects.BLINDNESS) != null) {
                         player.removeStatusEffect(StatusEffects.BLINDNESS);}
                    if (player.getStatusEffect(StatusEffects.SLOWNESS) != null) {
                        player.removeStatusEffect(StatusEffects.SLOWNESS);}
                }
            }
        }
    }
}
