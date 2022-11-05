package net.xanthian.arbiters_seal.items.tools;

import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterials;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.xanthian.arbiters_seal.Init;
import net.xanthian.arbiters_seal.items.tools.scythes.DaysHarvest;
import net.xanthian.arbiters_seal.items.tools.scythes.Kamaitachi;
import net.xanthian.arbiters_seal.items.tools.scythes.Reaper;
import net.xanthian.arbiters_seal.material.ModToolMaterial;

public class Scythes {

    public static final Item PLOW = registerItem("scythes/plow",
            new ModScytheItem(ToolMaterials.IRON, 3, -3.3F));

    public static final Item SCYTHE = registerItem("scythes/scythe",
            new ModScytheItem(ToolMaterials.IRON, 3, -3.3F));

    public static final Item SILVER_SCYTHE = registerItem("scythes/silver_scythe",
            new ModScytheItem(ModToolMaterial.SILVER, 6, -3.3F));

    public static final Item CRIMSON_SCYTHE = registerItem("scythes/crimson_scythe",
            new ModScytheItem(ToolMaterials.IRON, 4, -3.3F));

    public static final Item TEORITE_SCYTHE = registerItem("scythes/teorite_scythe",
            new ModScytheItem(ModToolMaterial.TEORITE, 4, -3.3F));

    public static final Item FAUCHARD = registerItem("scythes/fauchard",
            new ModScytheItem(ToolMaterials.DIAMOND, 4, -3.3F));

    public static final Item ENERGY_SCYTHE = registerItem("scythes/energy_scythe",
            new ModScytheItem(ToolMaterials.DIAMOND, 3, -3.1F));

    public static final Item KAMAITACHI = registerItem("scythes/kamaitachi",
            new Kamaitachi(ToolMaterials.NETHERITE, 3, -3.3F));

    public static final Item DAYS_HARVEST = registerItem("scythes/days_harvest",
            new DaysHarvest(ToolMaterials.NETHERITE, 4, -3.3F));

    public static final Item REAPER = registerItem("scythes/reaper",
            new Reaper(ToolMaterials.NETHERITE, 5, -3.5F));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Init.MOD_ID, name), item);
    }
    public static void registerScytheItems() {}
}