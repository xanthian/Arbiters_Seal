package net.xanthian.arbiters_seal.items.armor;

import net.minecraft.item.ArmorMaterials;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.xanthian.arbiters_seal.Init;
import net.xanthian.arbiters_seal.items.armor.feet.*;

public class Feet {

    public static final Item TOAD_BOOTS = registerItem("feet/toad_boots",
            new ModFeetItem(ArmorMaterials.DIAMOND));

    public static final Item RUNNING_TREADS = registerItem("feet/running_treads",
            new RunningTreads(ArmorMaterials.IRON));

    public static final Item IMPALA_BOOTS = registerItem("feet/impala_boots",
            new ModFeetItem(ArmorMaterials.NETHERITE));

    public static final Item WAYFARER_TREADS = registerItem("feet/wayfarer_treads",
            new ModFeetItem(ArmorMaterials.IRON));

    public static final Item JET_BOOTS = registerItem("feet/jet_boots",
            new JetBoots(ArmorMaterials.NETHERITE));

    public static final Item GREMLIN_TREADS = registerItem("feet/gremlin_treads",
            new GremlinTreads(ArmorMaterials.DIAMOND));

    public static final Item PLAINWALKERS = registerItem("feet/plainwalkers",
            new PlainWalkers(ArmorMaterials.NETHERITE));

    public static final Item HOVER_BOOTS = registerItem("feet/hover_boots",
            new HoverBoots(ArmorMaterials.DIAMOND));

    public static final Item RIFTWALKERS = registerItem("feet/riftwalkers",
            new Riftwalkers(ArmorMaterials.IRON));

    public static final Item FLIPPERS = registerItem("feet/flippers",
            new Flippers(ArmorMaterials.DIAMOND));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Init.MOD_ID, name), item);
    }
    public static void registerFeetItems() {}
}
