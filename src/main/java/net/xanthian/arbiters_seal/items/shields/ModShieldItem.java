package net.xanthian.arbiters_seal.items.shields;

import com.github.crimsondawn45.fabricshieldlib.lib.object.FabricShieldItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.ItemStack;
import net.xanthian.arbiters_seal.Init;
import net.xanthian.arbiters_seal.material.ModShieldTiers;

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
    public boolean isEnchantable(ItemStack stack) {
        return !stack.hasEnchantments();
    }

}
