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

public class ModMaulItem extends SwordItem {
    public ModMaulItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed) {
        super(toolMaterial, attackDamage, attackSpeed, new FabricItemSettings().group(Init.ARBITERS_SEAL_WEAPONS));
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        ItemStack mainHand = attacker.getEquippedStack(EquipmentSlot.MAINHAND);
        target.takeKnockback(0.4000000059604645, 0.1, 0.1);

        if (mainHand.getItem() == Mauls.PESTILENCE) {
            Random random = new Random();
            if (random.nextFloat() <= 0.35f) {
                if (target.getStatusEffect(StatusEffects.POISON) == null || target.getStatusEffect(StatusEffects.POISON).getDuration() < 20) {
                    target.addStatusEffect(new StatusEffectInstance(StatusEffects.POISON, 100, 0, true, true, true), target);
                }
            }
            if (random.nextFloat() <= 0.35f) {
                if (target.getStatusEffect(StatusEffects.SLOWNESS) == null || target.getStatusEffect(StatusEffects.SLOWNESS).getDuration() < 20) {
                    target.addStatusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 100, 0, true, true, true), target);
                }
            }
            if (random.nextFloat() <= 0.35f) {
                if (target.getStatusEffect(StatusEffects.WEAKNESS) == null || target.getStatusEffect(StatusEffects.WEAKNESS).getDuration() < 20) {
                    target.addStatusEffect(new StatusEffectInstance(StatusEffects.WEAKNESS, 100, 0, true, true, true), target);
                }
            }
            if (random.nextFloat() <= 0.35f) {
                if (target.getStatusEffect(ModStatusEffects.ROOT) == null || target.getStatusEffect(ModStatusEffects.ROOT).getDuration() < 20) {
                    target.addStatusEffect(new StatusEffectInstance(ModStatusEffects.ROOT, 100, 0, true, true, true), target);
                }
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
                tooltip.add(Text.literal(infoLine).formatted(Formatting.ITALIC, Formatting.GRAY));
            }
        } else {
            tooltip.add(Text.literal(I18n.translate(key).formatted(Formatting.ITALIC, Formatting.GRAY)));
        }
        super.appendTooltip(stack, world, tooltip, context);
    }
}