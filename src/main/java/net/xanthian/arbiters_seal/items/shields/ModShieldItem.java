package net.xanthian.arbiters_seal.items.shields;

import com.github.crimsondawn45.fabricshieldlib.lib.object.FabricShieldItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.client.resource.language.I18n;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;
import net.xanthian.arbiters_seal.Init;
import net.xanthian.arbiters_seal.material.ModShieldTiers;

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