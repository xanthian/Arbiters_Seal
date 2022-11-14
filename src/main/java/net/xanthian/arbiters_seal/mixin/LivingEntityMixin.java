package net.xanthian.arbiters_seal.mixin;

import dev.emi.trinkets.api.SlotReference;
import dev.emi.trinkets.api.TrinketsApi;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributeInstance;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Pair;
import net.minecraft.world.World;
import net.xanthian.arbiters_seal.items.trinkets.Trinkets;
import net.xanthian.arbiters_seal.sounds.ModSounds;
import net.xanthian.arbiters_seal.status_effects.ModStatusEffects;
import net.xanthian.arbiters_seal.util.ModAttributes;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import org.spongepowered.asm.mixin.injection.callback.LocalCapture;

import java.util.List;

@Mixin(LivingEntity.class)
public abstract class LivingEntityMixin extends Entity {

    // Double XP Trinket
    @Shadow public abstract int getXpToDrop();
    public LivingEntityMixin(EntityType<?> type, World world) {
        super(type, world);
    }
    @Inject(at = @At("HEAD"), method = "onDeath")
    private void experienceKill(DamageSource source, CallbackInfo ci) {
        if (source.getAttacker() instanceof PlayerEntity player && this.getXpToDrop() > 0) {
            if (TrinketsApi.getTrinketComponent(player).isPresent()) {
                List<Pair<SlotReference, ItemStack>> list = TrinketsApi.getTrinketComponent(player).get().getEquipped(Trinkets.ENERGY_LOCKET);
                if (list.size() > 0) {
                    ItemStack itemStack = list.get(0).getRight();
                    if (itemStack != null) {
                        player.addExperience(2 * this.getXpToDrop());
                    }
                }
            }
        }
    }

    // Jump Modifier Access
    @Shadow
    @Nullable
    public abstract EntityAttributeInstance getAttributeInstance(EntityAttribute attribute);

    @Inject(method = "createLivingAttributes", at = @At(value = "RETURN"), locals = LocalCapture.CAPTURE_FAILHARD)
    private static void addCustomAttributes(CallbackInfoReturnable<DefaultAttributeContainer.Builder> cir) {
        cir.getReturnValue()
                .add(ModAttributes.GENERIC_JUMP_BOOST);
    }
    @Inject(method = "getJumpVelocity", at = @At(value = "RETURN"), locals = LocalCapture.CAPTURE_FAILHARD, cancellable = true)
    private void applyJumpBoost(CallbackInfoReturnable<Float> cir) {
        EntityAttributeInstance instance = getAttributeInstance(ModAttributes.GENERIC_JUMP_BOOST);
        if (instance != null) {
            cir.setReturnValue(cir.getReturnValue() * (float) (instance.getValue()));
        }
    }

    // Silence Status effect
    @Inject(at = @At("HEAD"), method = "canTarget(Lnet/minecraft/entity/LivingEntity;)Z", cancellable = true)
    private void pacifyMob(LivingEntity target, CallbackInfoReturnable<Boolean> cir) {
        LivingEntity thisEntity = ((LivingEntity) (Object) this);
        if (thisEntity.hasStatusEffect(ModStatusEffects.SILENCE)) {
            cir.setReturnValue(false);
        }
    }

    // Rebirth status totem
    @Inject(at = @At("HEAD"), method = "tryUseTotem", cancellable = true)
    private void useRebirthStatusEffect(DamageSource source, CallbackInfoReturnable<Boolean> ci) {
        LivingEntity livingEntity = (LivingEntity) (Object) this;
        if (source.isOutOfWorld()) {
            ci.setReturnValue(false);
        } else {
            if (livingEntity.getStatusEffect(ModStatusEffects.REBIRTH) != null) {
                livingEntity.removeStatusEffect(ModStatusEffects.REBIRTH);
                livingEntity.setHealth(10.0F);
                livingEntity.clearStatusEffects();
                livingEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 400, 1));
                livingEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 220, 0));
                livingEntity.setOnFireFor(10);
                livingEntity.world.playSound(null, livingEntity.getX(), livingEntity.getY(), livingEntity.getZ(), ModSounds.REBIRTH, SoundCategory.NEUTRAL, 2.0F, 1.0F);
                livingEntity.world.playSound(null, livingEntity.getX(), livingEntity.getY(), livingEntity.getZ(), SoundEvents.ITEM_TOTEM_USE, SoundCategory.NEUTRAL, 0.3F, 1.2F);
                //livingEntity.world.sendEntityStatus(livingEntity, (byte) 35);
                ci.setReturnValue(true);
                if (TrinketsApi.getTrinketComponent(livingEntity).isPresent()) {
                    List<Pair<SlotReference, ItemStack>> list = TrinketsApi.getTrinketComponent(livingEntity).get().getEquipped(Trinkets.PHOENIX_BAND);
                    if (list.size() > 0) {
                        ItemStack itemStack = list.get(0).getRight();
                        if (itemStack != null) {
                            itemStack.decrement(1);
                        }
                    }
                }
            }
        }
    }
}