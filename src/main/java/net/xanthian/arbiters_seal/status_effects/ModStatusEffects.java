package net.xanthian.arbiters_seal.status_effects;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.xanthian.arbiters_seal.Init;

public class ModStatusEffects {

    public static final StatusEffect BLEED = new BleedStatusEffect();
    public static final StatusEffect BERSERK = new BerserkStatusEffect();
    public static final StatusEffect ROOT = new RootStatusEffect();
    public static final StatusEffect CHARM = new CharmedStatusEffect();
    public static final StatusEffect SILENCE = new SilenceStatusEffect();
    public static final StatusEffect SLEEP = new SleepStatusEffect();
    public static final StatusEffect REBIRTH = new RebirthStatusEffect();
    public static final StatusEffect DEF_DOWN = new DefenceDownEffect();


    public static void registerStatusEffects() {
        Registry.register(Registry.STATUS_EFFECT, new Identifier(Init.MOD_ID, "bleed"), BLEED);
        Registry.register(Registry.STATUS_EFFECT, new Identifier(Init.MOD_ID, "berserk"), BERSERK);
        Registry.register(Registry.STATUS_EFFECT, new Identifier(Init.MOD_ID, "root"), ROOT);
        Registry.register(Registry.STATUS_EFFECT, new Identifier(Init.MOD_ID, "charm"), CHARM);
        Registry.register(Registry.STATUS_EFFECT, new Identifier(Init.MOD_ID, "silence"), SILENCE);
        Registry.register(Registry.STATUS_EFFECT, new Identifier(Init.MOD_ID, "sleep"), SLEEP);
        Registry.register(Registry.STATUS_EFFECT, new Identifier(Init.MOD_ID, "rebirth"), REBIRTH);
        Registry.register(Registry.STATUS_EFFECT, new Identifier(Init.MOD_ID, "def_down"), DEF_DOWN);
    }
}
