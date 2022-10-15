package net.xanthian.arbiters_seal.items.tools;

import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterials;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.xanthian.arbiters_seal.Init;
import net.xanthian.arbiters_seal.items.tools.swords.*;
import net.xanthian.arbiters_seal.material.ModToolMaterial;

public class Swords {

    //public static final Item SHORTSWORD = registerItem("swords/shortsword",
            //new ModSwordItem(ToolMaterials.IRON, 1, -2.4F));

    //public static final Item LONGSWORD = registerItem("swords/longsword",
            //new ModSwordItem(ToolMaterials.IRON, 2, -2.4F) );

    public static final Item SILVER_SWORD = registerItem("swords/silver_sword",
            new ModSwordItem(ModToolMaterial.SILVER, 4, -2.4F) );

    public static final Item TOOTHED_SWORD = registerItem("swords/toothed_sword",
            new ToothedSword(ToolMaterials.IRON, 2, -2.4F) );

    public static final Item TEORITE_SWORD = registerItem("swords/teorite_sword",
            new ModSwordItem(ModToolMaterial.TEORITE, 3, -2.4F));

    public static final Item ICEBRAND = registerItem("swords/icebrand",
            new ModSwordItem(ToolMaterials.IRON, 3, -2.4F) );

    public static final Item FLAMEBRAND = registerItem("swords/flamebrand",
            new ModSwordItem(ToolMaterials.IRON, 3, -2.4F) );

    public static final Item STONEBRAND = registerItem("swords/stonebrand",
            new ModSwordItem(ToolMaterials.IRON, 3, -2.4F));

    public static final Item BOLTBRAND = registerItem("swords/boltbrand",
            new ModSwordItem(ToolMaterials.IRON, 3, -2.4F) );

    public static final Item ENHANCER = registerItem("swords/enhancer",
            new ModSwordItem(ToolMaterials.IRON, 4, -2.4F) );

    public static final Item EBONY_SWORD = registerItem("swords/ebony_sword",
            new ModSwordItem(ModToolMaterial.EBONY, 3, -2.4F));

    public static final Item GUARDIAN_SWORD = registerItem("swords/guardian_sword",
            new GuardianSword(ToolMaterials.DIAMOND, 3, -2.4F));

    public static final Item DENDRITE_SWORD = registerItem("swords/dendrite_sword",
            new ModSwordItem(ModToolMaterial.DENDRITE, 3, -2.4F));

    public static final Item SINGING_SWORD = registerItem("swords/singing_sword",
            new SingingSword(ToolMaterials.DIAMOND, 4, -2.3F));

    public static final Item EXCALIBUR = registerItem("swords/excalibur",
            new Excalibur(ToolMaterials.DIAMOND, 4, -2.4F));

    public static final Item ETERNIAS = registerItem("swords/eternias",
            new Eternias(ToolMaterials.NETHERITE, 3, -2.2F) );

    public static final Item SOUL_EATER = registerItem("swords/soul_eater",
            new SoulEater(ToolMaterials.NETHERITE, 4, -2.4F));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Init.MOD_ID, name), item);
    }
    public static void registerSwordItems() {}
}