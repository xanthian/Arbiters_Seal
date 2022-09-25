package net.xanthian.arbiters_seal.items.shields;

import com.github.crimsondawn45.fabricshieldlib.lib.object.FabricShieldItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import net.xanthian.arbiters_seal.Init;
import net.xanthian.arbiters_seal.material.ModShieldTiers;
import net.xanthian.arbiters_seal.status_effects.ModStatusEffects;

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
    public int getCooldownTicks() {
        return this.tier.getCooldownTicks();
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        ItemStack offHand = user.getEquippedStack(EquipmentSlot.OFFHAND);
        if (offHand.getItem() == ShieldItems.ARBITER_SHIELD) {
            if (user.getStatusEffect(ModStatusEffects.MUTE) !=null) {
                user.removeStatusEffect(ModStatusEffects.MUTE);
            }
            if (user.getStatusEffect(StatusEffects.BLINDNESS) !=null) {
                user.removeStatusEffect(StatusEffects.BLINDNESS);
        }
            if (user.getStatusEffect(StatusEffects.SLOWNESS) !=null) {
                user.removeStatusEffect(StatusEffects.SLOWNESS);
            }
        }
        return super.use(world, user, hand);
    }
}
