package net.xanthian.arbiters_seal.items.tools;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.client.resource.language.I18n;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;
import net.xanthian.arbiters_seal.Init;
import net.xanthian.arbiters_seal.status_effects.ModStatusEffects;

import java.util.List;

public class ModStaffItem extends SwordItem {
    public ModStaffItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed) {
        super(toolMaterial, attackDamage, attackSpeed, new FabricItemSettings().group(Init.ARBITERS_SEAL_WEAPONS));
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        ItemStack mainHand = attacker.getEquippedStack(EquipmentSlot.MAINHAND);

        if (mainHand.getItem() == Staffs.HEALING_STAFF) {
            target.heal(2.0F);
        }

        if (mainHand.getItem() == Staffs.WHITE_STAFF) {
            if (attacker.getStatusEffect(ModStatusEffects.MUTE) !=null) {
                attacker.removeStatusEffect(ModStatusEffects.MUTE);
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