package net.xanthian.arbiters_seal.items.armor;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.client.resource.language.I18n;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;
import net.xanthian.arbiters_seal.Init;
import net.xanthian.arbiters_seal.util.EquippedArmors;

import java.util.List;
import java.util.Random;

public class ModFeetItem extends ArmorItem {
    public ModFeetItem(ArmorMaterial material) {
        super(material, EquipmentSlot.FEET, new FabricItemSettings().group(Init.ARBITERS_SEAL_ARMOR));
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

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        if (!world.isClient && (entity instanceof PlayerEntity player)) {

            // Flippers = Swim speed
            if (EquippedArmors.isWearingFlippers(player) && player.isTouchingWater()) {
                //if (player.age % 60 == 0) {
                    player.addStatusEffect(new StatusEffectInstance(StatusEffects.DOLPHINS_GRACE, 1, 0, false, false, true));
                //}
            }

            //Hover Boots = Hover on land
            if (EquippedArmors.isWearingHoverBoots(player) && !player.isTouchingWater() && player.isSprinting()) {
                if (player.age % 60 == 0) {
                    player.addStatusEffect(new StatusEffectInstance(StatusEffects.LEVITATION, 100, 0, false, false, true));
                }
            }

            //Jet Boots = Jump Boost on land with small chance of levitation to fit the description
            if (EquippedArmors.isWearingJetBoots(player) && !player.isTouchingWater()) {
                if (player.age % 60 == 0) {
                    player.addStatusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST, 100, 3, false, false, true));
                    Random random = new Random();
                    if (random.nextFloat() <= 0.025f) {
                        if (!player.isOnGround()) {
                            player.addStatusEffect(new StatusEffectInstance(StatusEffects.LEVITATION, 100, 3, false, false, true));
                        }
                    }
                }
            }

            //Running treads = speed boost
            if (EquippedArmors.isWearingRunningTreads(player) && !player.isTouchingWater()) {
                //if (player.age % 60 == 0) {
                    player.addStatusEffect(new StatusEffectInstance(StatusEffects.SPEED, 1, 0, false, false, true));
                //}
            }

            //Gremlin treads = faster speed boost
            if (EquippedArmors.isWearingGremlinTreads(player) && !player.isTouchingWater()) {
                //if (player.age % 60 == 0) {
                    player.addStatusEffect(new StatusEffectInstance(StatusEffects.SPEED, 1, 1, false, false, true));
               //}
            }
        }
    }
}