package net.xanthian.arbiters_seal.mixin;

import net.minecraft.client.network.ClientPlayNetworkHandler;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.xanthian.arbiters_seal.items.trinkets.Trinkets;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(ClientPlayNetworkHandler.class)
    public abstract class ClientPlayNetworkHandlerMixin {

    @Inject(method = "getActiveTotemOfUndying", at = @At("HEAD"), cancellable = true)
    private static void getActivePhoenixBand(PlayerEntity player, CallbackInfoReturnable<ItemStack> cir) {
        for (ItemStack stack : player.getItemsEquipped()) {
            Item item = stack.getItem();
            if (item.equals(Trinkets.PHOENIX_BAND)) {
                cir.setReturnValue(stack);
            }
        }
    }
}
