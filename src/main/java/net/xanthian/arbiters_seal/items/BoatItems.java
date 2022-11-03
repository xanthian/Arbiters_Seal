package net.xanthian.arbiters_seal.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.xanthian.arbiters_seal.Init;
import net.xanthian.arbiters_seal.entity.item.ModBoatEntity;
import net.xanthian.arbiters_seal.entity.item.ModChestBoatEntity;

import java.util.function.Supplier;

public class BoatItems {

    public static <T extends Item> Supplier<T> registerItem(String name, Supplier<T> item) {
        var register = Registry.register(Registry.ITEM, new Identifier(Init.MOD_ID, name), item.get());
        return () -> register;
    }

    public static final Supplier<Item> EBONY_BOAT = registerItem("boats/ebony_boat", () ->
            new ModBoatItem(false, ModBoatEntity.Type.EBONY, new FabricItemSettings().group(Init.ARBITERS_SEAL_ITEMS)));

    public static final Supplier<Item> EBONY_CHEST_BOAT = registerItem("boats/ebony_chest_boat", () ->
            new ModBoatItem(true, ModChestBoatEntity.Type.EBONY, new FabricItemSettings().group(Init.ARBITERS_SEAL_ITEMS)));

    public static void registerItems() {
    }
}
