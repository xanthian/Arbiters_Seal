package net.xanthian.arbiters_seal.util;

import net.minecraft.entity.attribute.ClampedEntityAttribute;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.util.registry.Registry;
import net.xanthian.arbiters_seal.Init;

import java.util.LinkedHashMap;
import java.util.Map;

public class ModAttributes {

    public static final EntityAttribute GENERIC_JUMP_BOOST =
            new ClampedEntityAttribute("attribute.name.generic_jump_boost", 1.0, 0.0, 2.0).setTracked(true);

    public static final EntityAttribute GENERIC_EXP_BOOST =
            new ClampedEntityAttribute("attribute.name.generic_exp_boost", 1.0, 0.0, 2.0).setTracked(true);

    public static final EntityAttribute GENERIC_CRIT_BOOST =
            new ClampedEntityAttribute("attribute.name.generic_crit_boost", 1.0, 0.0, 2.0).setTracked(true);

    public static Map<String, EntityAttribute> ATTRIBUTES = new LinkedHashMap<>();

    static {
        ATTRIBUTES.put("generic.jump_boost", GENERIC_JUMP_BOOST);
        ATTRIBUTES.put("generic.exp_boost", GENERIC_EXP_BOOST);
        ATTRIBUTES.put("generic.crit_boost", GENERIC_CRIT_BOOST);
    }

    public static void register() {
        for (Map.Entry<String, EntityAttribute> pair : ATTRIBUTES.entrySet()) {
            Registry.register(Registry.ATTRIBUTE, Init.id(pair.getKey()), pair.getValue());
        }
    }
}