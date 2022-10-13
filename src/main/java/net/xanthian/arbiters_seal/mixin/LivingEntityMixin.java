package net.xanthian.arbiters_seal.mixin;

import net.minecraft.entity.LivingEntity;
import net.xanthian.arbiters_seal.status_effects.ModStatusEffects;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(LivingEntity.class)
public class LivingEntityMixin {

    @Inject(at = @At("HEAD"), method = "canTarget(Lnet/minecraft/entity/LivingEntity;)Z", cancellable = true)
    private void pacifyMob(LivingEntity target, CallbackInfoReturnable<Boolean> cir) {
        LivingEntity thisEntity = ((LivingEntity) (Object) this);
        if (thisEntity.hasStatusEffect(ModStatusEffects.MUTE)) {
            cir.setReturnValue(false);
        }
    }
}