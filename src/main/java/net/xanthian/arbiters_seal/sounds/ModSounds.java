package net.xanthian.arbiters_seal.sounds;

import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.xanthian.arbiters_seal.Init;

public class ModSounds {

    public static SoundEvent REBIRTH = registerSoundEvent("rebirth");

    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = new Identifier(Init.MOD_ID, name);
        return Registry.register(Registry.SOUND_EVENT, id, new SoundEvent(id));
    }
    public static void registerModSounds(){
    }
}
