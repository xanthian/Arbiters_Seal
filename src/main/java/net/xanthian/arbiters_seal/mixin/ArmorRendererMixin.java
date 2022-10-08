package net.xanthian.arbiters_seal.mixin;

import net.minecraft.client.render.entity.feature.ArmorFeatureRenderer;
import net.minecraft.item.ArmorItem;
import net.minecraft.util.Identifier;
import net.xanthian.arbiters_seal.Init;
import net.xanthian.arbiters_seal.items.armor.ModChestItem;
import net.xanthian.arbiters_seal.items.armor.ModFeetItem;
import net.xanthian.arbiters_seal.items.armor.ModHelmetItem;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.Map;

@Mixin(ArmorFeatureRenderer.class)
public abstract class ArmorRendererMixin
{
    @Shadow
    @Final
    private static Map<String, Identifier> ARMOR_TEXTURE_CACHE;

    @Inject(method = "getArmorTexture",
            at = @At(value = "HEAD"), cancellable = true)
    private void getArmorTextureEvent(ArmorItem armorItem, boolean bl, String string, CallbackInfoReturnable<Identifier> callbackIn)
    {
        if (armorItem instanceof ModChestItem || armorItem instanceof ModFeetItem || armorItem instanceof ModHelmetItem)
        {
            String string2 = Init.MOD_ID + ":textures/models/armor/" + armorItem.toString() + "_layer_1.png";
            callbackIn.setReturnValue(ARMOR_TEXTURE_CACHE.computeIfAbsent(string2, Identifier::new));
        }
    }
}