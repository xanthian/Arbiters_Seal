package net.xanthian.arbiters_seal.items.shields;

import com.github.crimsondawn45.fabricshieldlib.lib.object.FabricShieldItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.client.resource.language.I18n;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;
import net.xanthian.arbiters_seal.Init;
import net.xanthian.arbiters_seal.material.ModShieldTiers;
import net.xanthian.arbiters_seal.status_effects.ModStatusEffects;

import java.util.List;

public class ModShieldItem extends FabricShieldItem {
    private final ModShieldTiers tier;

    public ModShieldItem(ModShieldTiers tier) {
        super(new FabricItemSettings().maxDamage(tier.getItemDurability()).group(Init.ARBITERS_SEAL_WEAPONS), tier.getCooldownTicks(), tier.getEnchantabilty());
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
                // AEGIS
                if (player.getEquippedStack(EquipmentSlot.MAINHAND).isOf(Shields.AEGIS_SHIELD) ||
                        player.getEquippedStack(EquipmentSlot.OFFHAND).isOf(Shields.AEGIS_SHIELD)) {
                    if (player.age % 180 == 0) {
                        player.addStatusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 200, 0));
                    }
                }
                // ARBITER
                if (player.getEquippedStack(EquipmentSlot.MAINHAND).isOf(Shields.ARBITER_SHIELD) ||
                        player.getEquippedStack(EquipmentSlot.OFFHAND).isOf(Shields.ARBITER_SHIELD)) {
                    if (player.getStatusEffect(ModStatusEffects.MUTE) != null) {
                        player.removeStatusEffect(ModStatusEffects.MUTE);
                    }
                    if (player.getStatusEffect(StatusEffects.BLINDNESS) != null) {
                        player.removeStatusEffect(StatusEffects.BLINDNESS);
                    }
                    if (player.getStatusEffect(StatusEffects.SLOWNESS) != null) {
                        player.removeStatusEffect(StatusEffects.SLOWNESS);
                    }
                }
                //CURSED
                if (player.getEquippedStack(EquipmentSlot.MAINHAND).isOf(Shields.CURSED_SHIELD) ||
                        player.getEquippedStack(EquipmentSlot.OFFHAND).isOf(Shields.CURSED_SHIELD)) {
                    if (player.age % 180 == 0) {
                        player.addStatusEffect(new StatusEffectInstance(StatusEffects.UNLUCK, 200, 0,false,false,true));
                        player.addStatusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 200, 0,false,false,true));
                        player.addStatusEffect(new StatusEffectInstance(StatusEffects.WEAKNESS, 200, 0,false,false,true));
                    }
                }
                //BEHEMOTH
                if (player.getEquippedStack(EquipmentSlot.MAINHAND).isOf(Shields.BEHEMOTH_GUARD) ||
                        player.getEquippedStack(EquipmentSlot.OFFHAND).isOf(Shields.BEHEMOTH_GUARD)) {
                    if (player.age % 180 == 0) {
                        player.addStatusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 200, 1,false,false,true));
                    }
                }
            }
        }
    }
    @Override
    public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
        String key = (stack.getTranslationKey() + ".tooltip");
        if (I18n.hasTranslation(key)) {
            String info = I18n.translate(key);
            String[] infoLines = info.split("\\r?\\n");

            for (String infoLine : infoLines) {
                tooltip.add(1, Text.literal(infoLine).formatted(Formatting.ITALIC, Formatting.GRAY));
            }
        } else {
            tooltip.add(Text.literal(I18n.translate(key).formatted(Formatting.ITALIC, Formatting.GRAY)));
        }
        super.appendTooltip(stack, world, tooltip, context);
    }
}
