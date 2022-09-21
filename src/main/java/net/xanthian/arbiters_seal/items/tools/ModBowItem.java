package net.xanthian.arbiters_seal.items.tools;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.client.resource.language.I18n;
import net.minecraft.item.BowItem;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;
import net.xanthian.arbiters_seal.Init;
import net.xanthian.arbiters_seal.material.ModBowTiers;

import java.util.List;

public class ModBowItem extends BowItem {
    private final ModBowTiers tiers;

    private static final Formatting infoColour = Formatting.GRAY;

    public ModBowItem(ModBowTiers tier) {
        super(new FabricItemSettings().maxDamage(tier.getItemDurability()).group(Init.ARBITERS_SEAL_WEAPONS));
        this.tiers = tier;
    }


    @Override
    public int getEnchantability() {
        return this.tiers.getEnchantabilty();
    }

    @Override
    public boolean canRepair(ItemStack item, ItemStack repairItem) {
        return this.tiers.getRepairIngredient().test(repairItem);
    }

    @Override
    public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
        String key = (stack.getTranslationKey() + ".tooltip");
        if (I18n.hasTranslation(key)) {
            String info = I18n.translate(key);
            String[] infoLines = info.split("\\r?\\n");

            for (String infoLine : infoLines) {
                tooltip.add(1, Text.literal(infoColour + infoLine));
            }
        } else {
            tooltip.add(Text.literal(infoColour + I18n.translate(stack.getTranslationKey() + ".tooltip")));
        }
        //tooltip.add(Text.translatable(stack.getTranslationKey()+".tooltip").formatted(Formatting.ITALIC, Formatting.GRAY));
        tooltip.add(Text.literal("+" + Float.toString(this.tiers.getAttackDamageBonus()) + " ")
                .append(Text.literal("Attack Damage")).formatted(Formatting.DARK_GREEN));
        super.appendTooltip(stack, world, tooltip, context);
    }
}