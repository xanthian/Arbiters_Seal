package net.xanthian.arbiters_seal.items.tools;

import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.xanthian.arbiters_seal.Init;
import net.xanthian.arbiters_seal.items.tools.bows.Dominance;
import net.xanthian.arbiters_seal.material.ModBowMaterial;

public class Bows {

    public static final Item SHORTBOW = registerItem("bows/shortbow",
            new ModBowItem(ModBowMaterial.IRON));

    public static final Item LONGBOW = registerItem("bows/longbow",
            new ModBowItem(ModBowMaterial.IRON));

    public static final Item SILVER_BOW = registerItem("bows/silver_bow",
            new ModBowItem(ModBowMaterial.SILVER));

    public static final Item COMPOSITE_BOW = registerItem("bows/composite_bow",
            new ModBowItem(ModBowMaterial.IRON));

    public static final Item TEORITE_BOW = registerItem("bows/teorite_bow",
            new ModBowItem(ModBowMaterial.TEORITE));

    public static final Item MACH_BOW = registerItem("bows/mach_bow",
            new ModBowItem(ModBowMaterial.IRON));

    public static final Item TRUE_FLIGHT = registerItem("bows/true_flight",
            new ModBowItem(ModBowMaterial.IRON));

    public static final Item WARBOW = registerItem("bows/warbow",
            new ModBowItem(ModBowMaterial.DIAMOND));

    public static final Item YOICHI_BOW = registerItem("bows/yoichi_bow",
            new ModBowItem(ModBowMaterial.DIAMOND));

    public static final Item DOMINANCE = registerItem("bows/dominance",
            new Dominance(ModBowMaterial.NETHERITE));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Init.MOD_ID, name), item);
    }
    public static void registerBowItems() {}
}