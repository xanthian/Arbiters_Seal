package net.xanthian.arbiters_seal.items.tools;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.client.resource.language.I18n;
import net.minecraft.entity.projectile.PersistentProjectileEntity;
import net.minecraft.item.CrossbowItem;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;
import net.xanthian.arbiters_seal.Init;
import net.xanthian.arbiters_seal.material.ModBowTiers;

import java.util.List;

public class ModCrossbowItem extends CrossbowItem {
    private final ModBowTiers tier;

    public ModCrossbowItem(ModBowTiers tier) {

        super(new FabricItemSettings().maxDamage(tier.getDurability()).group(Init.ARBITERS_SEAL_WEAPONS));
        this.tier = tier;
    }

    private PersistentProjectileEntity customArrow(PersistentProjectileEntity arrow) {
        arrow.setDamage(arrow.getDamage() + this.tier.getDamageBonus());
        return arrow;
    }

    @Override
    public int getRange() {
        return this.tier.getRangeBonus();
    }

    @Override
    public int getEnchantability() {
        return this.tier.getEnchantability();
    }

    @Override
    public boolean canRepair(ItemStack item, ItemStack repairItem) {
        return this.tier.getRepairIngredient().test(repairItem);
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