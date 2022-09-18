package net.xanthian.arbiters_seal.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.SignItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.xanthian.arbiters_seal.Init;
import net.xanthian.arbiters_seal.blocks.ModBlocks;

public class ModItems {

// BRONZE
    public static final Item BRONZE_INGOT = registerItem("materials/bronze_ingot", new ModMaterialsItem());

// SILVER
    public static final Item RAW_SILVER = registerItem("materials/raw_silver", new ModMaterialsItem());
    public static final Item SILVER_INGOT = registerItem("materials/silver_ingot", new ModMaterialsItem());

// STEEL
    public static final Item STEEL_INGOT = registerItem("materials/steel_ingot", new ModMaterialsItem());

// TEORITE
    public static final Item RAW_TEORITE = registerItem("materials/raw_teorite", new ModMaterialsItem());
    public static final Item TEORITE_INGOT = registerItem("materials/teorite_ingot", new ModMaterialsItem());

// DENDRITE
    public static final Item DENDRITE_CRYSTAL = registerItem("materials/dendrite_crystal", new ModMaterialsItem());

    //Random Stuff
    public static final Item EBONY_SIGN = registerItem("objects/ebony_sign",
            new SignItem(new FabricItemSettings().group(Init.ARBITERS_SEAL_ITEMS).maxCount(16), ModBlocks.EBONY_SIGN_BLOCK, ModBlocks.EBONY_WALL_SIGN_BLOCK));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Init.MOD_ID, name), item);
    }
    public static void registerModItems() {}
}
