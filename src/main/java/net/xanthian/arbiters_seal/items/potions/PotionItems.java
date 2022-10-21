package net.xanthian.arbiters_seal.items.potions;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.potion.Potion;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.xanthian.arbiters_seal.Init;
import net.xanthian.arbiters_seal.status_effects.ModStatusEffects;

public class PotionItems {

    //public static final Item FULL_POTION = registerItem("potions/full_potion",


   // public static final Item REMEDY = registerItem("potions/remedy",


    //public static final Item NOXIOUS_BOMB = registerItem("potions/noxious_bomb",


    //public static final Item CORROSIVE_BOMB = registerItem("potions/corrosive_bomb",


    public static Potion PHOENIX_ASHES;
    public static Potion registerPotion(String name) {
        return Registry.register(Registry.POTION, new Identifier(Init.MOD_ID, name),
                new Potion(new StatusEffectInstance(ModStatusEffects.REBIRTH, 2000, 0)));
    }

    public static void registerPotions() {
        PHOENIX_ASHES = registerPotion("phoenix_ashes_potion");
    }

}