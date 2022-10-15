package net.xanthian.arbiters_seal.mixin;

import dev.emi.trinkets.api.SlotReference;
import dev.emi.trinkets.api.TrinketsApi;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Pair;
import net.xanthian.arbiters_seal.items.trinkets.Trinkets;
import net.xanthian.arbiters_seal.status_effects.ModStatusEffects;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.List;

@Mixin(LivingEntity.class)
public class LivingEntityMixin {

    @Inject(at = @At("HEAD"), method = "canTarget(Lnet/minecraft/entity/LivingEntity;)Z", cancellable = true)
    private void pacifyMob(LivingEntity target, CallbackInfoReturnable<Boolean> cir) {
        LivingEntity thisEntity = ((LivingEntity) (Object) this);
        if (thisEntity.hasStatusEffect(ModStatusEffects.MUTE)) {
            cir.setReturnValue(false);
        }
    }

    @Inject(at = @At("HEAD"), method = "tryUseTotem", cancellable = true)
    private void usePhoenixBand(DamageSource source, CallbackInfoReturnable<Boolean> ci) {
        LivingEntity livingEntity = (LivingEntity) (Object) this;
        if (source.isOutOfWorld()) {
            ci.setReturnValue(false);
        } else {
            if (TrinketsApi.getTrinketComponent(livingEntity).isPresent()) {
                List<Pair<SlotReference, ItemStack>> list = TrinketsApi.getTrinketComponent(livingEntity).get().getEquipped(Trinkets.PHOENIX_BAND);
                if (list.size() > 0) {
                    ItemStack itemStack = list.get(0).getRight();
                    if (itemStack != null) {
                        itemStack.decrement(1);
                        livingEntity.setHealth(1.0F);
                        livingEntity.clearStatusEffects();
                        livingEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 900, 1));
                        livingEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 100, 1));
                        livingEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 800, 0));
                        livingEntity.world.sendEntityStatus(livingEntity, (byte) 35);
                        ci.setReturnValue(true);
                    }
                }
            }
        }
    }
}