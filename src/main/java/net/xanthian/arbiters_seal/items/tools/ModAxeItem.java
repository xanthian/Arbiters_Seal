package net.xanthian.arbiters_seal.items.tools;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.client.resource.language.I18n;
import net.minecraft.item.AxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolMaterial;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;
import net.xanthian.arbiters_seal.Init;

import java.util.List;

public class ModAxeItem extends AxeItem {
    public ModAxeItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed) {
        super(toolMaterial, attackDamage, attackSpeed, new FabricItemSettings().group(Init.ARBITERS_SEAL_WEAPONS));
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