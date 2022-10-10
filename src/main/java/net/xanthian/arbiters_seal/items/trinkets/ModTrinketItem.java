package net.xanthian.arbiters_seal.items.trinkets;

import dev.emi.trinkets.api.TrinketItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.client.resource.language.I18n;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;
import net.xanthian.arbiters_seal.Init;

import java.util.List;

public class ModTrinketItem extends TrinketItem {
    public ModTrinketItem() {
        super(new FabricItemSettings().group(Init.ARBITERS_SEAL_ARMOR));
    }
    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int itemSlot, boolean isSelected) {
        if (!world.isClient) {
            if (entity instanceof LivingEntity player) {
                //if (player.getEquippedStack(TrinketSlot.canInsert(Trinkets.PURE_BAND))) ;
                {
                    if (player.getStatusEffect(StatusEffects.POISON) != null) {
                        player.removeStatusEffect(StatusEffects.POISON);
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
