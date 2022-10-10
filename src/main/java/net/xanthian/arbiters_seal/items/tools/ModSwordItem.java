package net.xanthian.arbiters_seal.items.tools;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.client.resource.language.I18n;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;
import net.xanthian.arbiters_seal.Init;
import net.xanthian.arbiters_seal.status_effects.ModStatusEffects;

import java.util.List;
import java.util.Random;

public class ModSwordItem extends SwordItem {
    public ModSwordItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed) {
        super(toolMaterial, attackDamage, attackSpeed, new FabricItemSettings().group(Init.ARBITERS_SEAL_WEAPONS));
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        ItemStack mainHand = attacker.getEquippedStack(EquipmentSlot.MAINHAND);

        if ((mainHand.getItem() == Swords.GUARDIAN_SWORD)) {
            if (attacker.getStatusEffect(StatusEffects.RESISTANCE) == null || attacker.getStatusEffect(StatusEffects.RESISTANCE).getDuration() < 180) {
                attacker.addStatusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 200, 0, true, false, true), target);
            }
            if (attacker.getStatusEffect(StatusEffects.FIRE_RESISTANCE) == null || attacker.getStatusEffect(StatusEffects.FIRE_RESISTANCE).getDuration() < 180) {
                    attacker.addStatusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 200, 0, true, false, true), target);
                }
            }

        if ((mainHand.getItem() == Swords.EXCALIBUR)) {
            if (attacker.getStatusEffect(StatusEffects.REGENERATION) == null || attacker.getStatusEffect(StatusEffects.REGENERATION).getDuration() < 180) {
                attacker.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 200, 0, true, false, true), target);
            }
        }

        if ((mainHand.getItem() == Swords.TOOTHED_SWORD)) {
            Random random = new Random();
            if (random.nextFloat() <= 0.50f) {
                if (target.getStatusEffect(ModStatusEffects.BLEED) == null || target.getStatusEffect(ModStatusEffects.BLEED).getDuration() < 20 && !target.isUndead()) {
                    target.addStatusEffect(new StatusEffectInstance(ModStatusEffects.BLEED, 200, 0, true, true, true), target);
                }
            }
        }

        if ((mainHand.getItem() == Swords.ETERNIAS)) {
            if (attacker.getStatusEffect(StatusEffects.STRENGTH) == null || attacker.getStatusEffect(StatusEffects.STRENGTH).getDuration() < 180)  {
                attacker.addStatusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 200, 0, true, false, true), target);
            }
        }
        return super.postHit(stack, target, attacker);

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