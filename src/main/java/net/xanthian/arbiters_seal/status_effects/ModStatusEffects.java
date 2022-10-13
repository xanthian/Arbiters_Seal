package net.xanthian.arbiters_seal.status_effects;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.xanthian.arbiters_seal.Init;

public class ModStatusEffects {

    public static final StatusEffect BLEED = new BleedStatusEffect();
    public static final StatusEffect ROOT = new RootStatusEffect();
    public static final StatusEffect MUTE = new MuteStatusEffect();
    public static final StatusEffect REBIRTH = new RebirthStatusEffect();


    public static void registerStatusEffects() {
        Registry.register(Registry.STATUS_EFFECT, new Identifier(Init.MOD_ID, "bleed"), BLEED);
        Registry.register(Registry.STATUS_EFFECT, new Identifier(Init.MOD_ID, "root"), ROOT);
        Registry.register(Registry.STATUS_EFFECT, new Identifier(Init.MOD_ID, "mute"), MUTE);
        Registry.register(Registry.STATUS_EFFECT, new Identifier(Init.MOD_ID, "rebirth"), REBIRTH);
    }
}
