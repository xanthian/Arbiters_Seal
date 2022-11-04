package net.xanthian.arbiters_seal.entity.item;

import net.minecraft.util.SignType;
import net.xanthian.arbiters_seal.mixin.SignTypeAccessor;

public class ModSignTypes {

    public static final SignType EBONY =
            SignTypeAccessor.registerNew(SignTypeAccessor.newSignType("ebony"));
}