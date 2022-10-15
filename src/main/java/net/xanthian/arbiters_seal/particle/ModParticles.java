package net.xanthian.arbiters_seal.particle;

import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.minecraft.particle.DefaultParticleType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.xanthian.arbiters_seal.Init;

public class ModParticles {
        public static final DefaultParticleType SLEEP_PARTICLE = FabricParticleTypes.simple();

        public static void registerParticles() {
            Registry.register(Registry.PARTICLE_TYPE, new Identifier(Init.MOD_ID, "sleep_particle"),
                    SLEEP_PARTICLE);
        }
}