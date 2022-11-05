package net.xanthian.arbiters_seal.items.tools;

import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.xanthian.arbiters_seal.Init;
import net.xanthian.arbiters_seal.items.tools.crossbows.Quarreller;
import net.xanthian.arbiters_seal.items.tools.crossbows.Williams;
import net.xanthian.arbiters_seal.material.ModBowMaterial;

public class Crossbows {

    //public static final Item CROSSBOW = registerItem("crossbows/crossbow",
            //new ModCrossbowItem());

    public static final Item HEAVY_CROSSBOW = registerItem("crossbows/heavy_crossbow",
            new ModCrossbowItem(ModBowMaterial.IRON));

    public static final Item ICE_CROSSBOW = registerItem("crossbows/ice_crossbow",
            new ModCrossbowItem(ModBowMaterial.IRON));

    public static final Item SILVER_CROSSBOW = registerItem("crossbows/silver_crossbow",
            new ModCrossbowItem(ModBowMaterial.SILVER));

    public static final Item FIRE_CROSSBOW = registerItem("crossbows/fire_crossbow",
            new ModCrossbowItem(ModBowMaterial.IRON));

    public static final Item AUTO_CROSSBOW = registerItem("crossbows/auto_crossbow",
            new ModCrossbowItem(ModBowMaterial.IRON));

    public static final Item TEORITE_CROSSBOW = registerItem("crossbows/teorite_crossbow",
            new ModCrossbowItem(ModBowMaterial.TEORITE));

    public static final Item EARTH_CROSSBOW = registerItem("crossbows/earth_crossbow",
            new ModCrossbowItem(ModBowMaterial.IRON));

    public static final Item THUNDER_CROSSBOW = registerItem("crossbows/thunder_crossbow",
            new ModCrossbowItem(ModBowMaterial.IRON));

    public static final Item QUARRELLER = registerItem("crossbows/quarreller",
            new Quarreller(ModBowMaterial.DIAMOND));

    public static final Item AEROLUS = registerItem("crossbows/aerolus",
            new ModCrossbowItem(ModBowMaterial.NETHERITE));

    public static final Item WILLIAMS = registerItem("crossbows/williams",
            new Williams(ModBowMaterial.NETHERITE));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Init.MOD_ID, name), item);
    }
    public static void registerCrossbowItems() {}
}