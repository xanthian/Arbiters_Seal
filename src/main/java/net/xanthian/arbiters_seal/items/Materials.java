package net.xanthian.arbiters_seal.items;

import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.xanthian.arbiters_seal.Init;

public class Materials {

    public static final Item BRONZE_INGOT = registerItem("materials/bronze_ingot", new ModMaterialsItem());
    public static final Item SILVER_INGOT = registerItem("materials/silver_ingot", new ModMaterialsItem());
    public static final Item STEEL_INGOT = registerItem("materials/steel_ingot", new ModMaterialsItem());
    public static final Item TEORITE_INGOT = registerItem("materials/teorite_ingot", new ModMaterialsItem());

    public static final Item DENDRITE_CRYSTAL = registerItem("materials/dendrite_crystal", new ModMaterialsItem());

    public static final Item EBONY_PLANKS = registerItem("materials/ebony_planks", new ModMaterialsItem());


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Init.MOD_ID, name), item);
    }
    public static void registerMaterialItems() {}
}
