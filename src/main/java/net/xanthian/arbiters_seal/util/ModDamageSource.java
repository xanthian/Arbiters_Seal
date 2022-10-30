package net.xanthian.arbiters_seal.util;

import net.minecraft.entity.damage.DamageSource;

public class ModDamageSource extends DamageSource {
    protected ModDamageSource(String name) {
        super(name);
    }

    public static final DamageSource BLEEDING = new ModDamageSource("bleeding").setBypassesArmor().setBypassesProtection();

}