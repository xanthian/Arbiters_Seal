package net.xanthian.arbiters_seal.items.gadgets;

import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.xanthian.arbiters_seal.Init;

public class Gadgets {

    public static final Item ABSORBER_PLUS = registerItem("gadgets/absorber_plus",
            new ModGadgetItem());

    public static final Item DEMOLECULARIZER = registerItem("gadgets/demolecularizer",
            new ModGadgetItem());

    public static final Item DEMORALIZER = registerItem("gadgets/demoralizer",
            new ModGadgetItem());

    public static final Item DISPELOTRON = registerItem("gadgets/dispelotron",
            new ModGadgetItem());

    public static final Item ELECTROCONSTRICTOR = registerItem("gadgets/electroconstrictor",
            new ModGadgetItem());

    public static final Item ENERGIZER = registerItem("gadgets/energizer",
            new ModGadgetItem());

    public static final Item HARMONIZER = registerItem("gadgets/harmonizer",
            new ModGadgetItem());

    public static final Item HEALBOT_3000 = registerItem("gadgets/healbot_3000",
            new ModGadgetItem());

    public static final Item IMPALOTRON = registerItem("gadgets/impalotron",
            new ModGadgetItem());

    public static final Item MOLECULAR_INFUSER = registerItem("gadgets/molecular_infuser",
            new ModGadgetItem());

    public static final Item REFLECTOTRON = registerItem("gadgets/reflectotron",
            new ModGadgetItem());

    public static final Item SHOCKEROTRON = registerItem("gadgets/shockerotron",
            new ModGadgetItem());

    public static final Item SPEED_GENERATOR = registerItem("gadgets/speed_generator",
            new ModGadgetItem());

    public static final Item SPRINGGER = registerItem("gadgets/springger",
            new ModGadgetItem());

    public static final Item SURPRISER_PLUS = registerItem("gadgets/surpriser_plus",
            new ModGadgetItem());

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Init.MOD_ID, name), item);
    }
    public static void registerGadgetItems() {}
}