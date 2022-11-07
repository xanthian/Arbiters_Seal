package net.xanthian.arbiters_seal.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.SignItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.xanthian.arbiters_seal.Init;
import net.xanthian.arbiters_seal.blocks.ModBlocks;
import net.xanthian.arbiters_seal.entity.item.ModBoatEntity;
import net.xanthian.arbiters_seal.entity.item.ModChestBoatEntity;

import java.util.function.Supplier;

public class NormalItems {

    //EBONY
    public static final Item EBONY_SIGN = registerItem("objects/ebony_sign",
            new SignItem(new FabricItemSettings().group(Init.ARBITERS_SEAL_ITEMS).maxCount(16), ModBlocks.EBONY_SIGN_BLOCK, ModBlocks.EBONY_WALL_SIGN_BLOCK));

    public static final Supplier<Item> EBONY_BOAT = registerBoatItem("boats/ebony_boat", () ->
            new ModBoatItem(false, ModBoatEntity.Type.EBONY, new FabricItemSettings().group(Init.ARBITERS_SEAL_ITEMS)));

    public static final Supplier<Item> EBONY_CHEST_BOAT = registerBoatItem("boats/ebony_chest_boat", () ->
            new ModBoatItem(true, ModChestBoatEntity.Type.EBONY, new FabricItemSettings().group(Init.ARBITERS_SEAL_ITEMS)));

    // BRONZE
    public static final Item BRONZE_INGOT = registerItem("materials/bronze_ingot", 
        new ModItem());
    // STEEL
    public static final Item STEEL_INGOT = registerItem("materials/steel_ingot",
            new ModItem());

    // SILVER
    public static final Item RAW_SILVER = registerItem("materials/raw_silver", 
        new ModItem());
    public static final Item SILVER_INGOT = registerItem("materials/silver_ingot", 
            new ModItem());

    // TEORITE
    public static final Item RAW_TEORITE = registerItem("materials/raw_teorite", 
        new ModItem());
    public static final Item TEORITE_INGOT = registerItem("materials/teorite_ingot", 
            new ModItem());

    // DENDRITE
    public static final Item DENDRITE_CRYSTAL = registerItem("materials/dendrite_crystal",
        new ModItem());

    public static final Item RAW_COLD_IRON = registerItem("materials/raw_cold_iron",
            new ModItem());

    public static final Item JAMMY_FRUIT_SEEDS = registerItem("materials/jammy_fruit_seeds",
            (Item)(new AliasedBlockItem(ModBlocks.JAMMY_FRUIT_STEM, (new FabricItemSettings().group(Init.ARBITERS_SEAL_ITEMS)))));

    public static final Item BULLETS = registerItem("objects/bullets",
            new ModItem());

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Init.MOD_ID, name), item);
    }
    public static <T extends Item> Supplier<T> registerBoatItem(String name, Supplier<T> item) {
        var register = Registry.register(Registry.ITEM, new Identifier(Init.MOD_ID, name), item.get());
        return () -> register;
    }

    public static void registerModItems() {}
}
