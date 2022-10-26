package net.xanthian.arbiters_seal.items.gadgets;

import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.xanthian.arbiters_seal.Init;
import net.xanthian.arbiters_seal.items.gadgets.gadgets.*;

public class Gadgets {

    public static final Item ABSORBER_PLUS = registerItem("gadgets/absorber_plus",
            new AbsorberPlus());

    public static final Item DEMOLECULARIZER = registerItem("gadgets/demolecularizer",
            new Demolecularizer());

    public static final Item DEMORALIZER = registerItem("gadgets/demoralizer",
            new Demoralizer());

    public static final Item DISPELOTRON = registerItem("gadgets/dispelotron",
            new Dispelotron());

    public static final Item ELECTROCONSTRICTOR = registerItem("gadgets/electroconstrictor",
            new Electroconstrictor());

    public static final Item ENERGIZER = registerItem("gadgets/energizer",
            new Energizer());

    public static final Item HARMONIZER = registerItem("gadgets/harmonizer",
            new Harmonizer());

    public static final Item HEALBOT_3000 = registerItem("gadgets/healbot_3000",
            new Healbot3000());

    public static final Item IMPALOTRON = registerItem("gadgets/impalotron",
            new Impalotron());

    public static final Item MOLECULAR_INFUSER = registerItem("gadgets/molecular_infuser",
            new MolecularInfuzer());

    public static final Item REFLECTOTRON = registerItem("gadgets/reflectotron",
            new Reflectotron());

    public static final Item SHOCKEROTRON = registerItem("gadgets/shockerotron",
            new Shockerotron());

    public static final Item SPEED_GENERATOR = registerItem("gadgets/speed_generator",
            new SpeedGenerator());

    public static final Item SPRINGGER = registerItem("gadgets/springger",
            new Springger());

    public static final Item SURPRISER_PLUS = registerItem("gadgets/surpriser_plus",
            new SurpriserPlus());

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Init.MOD_ID, name), item);
    }
    public static void registerGadgetItems() {}
}