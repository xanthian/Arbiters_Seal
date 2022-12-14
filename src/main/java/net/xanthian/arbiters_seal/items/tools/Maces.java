package net.xanthian.arbiters_seal.items.tools;

import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterials;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.xanthian.arbiters_seal.Init;
import net.xanthian.arbiters_seal.items.tools.maces.*;
import net.xanthian.arbiters_seal.material.ModToolMaterial;

public class Maces {

    public static final Item MACE = registerItem("maces/mace",
            new ModMaceItem(ToolMaterials.IRON, 3, -2.5F));

    public static final Item THUMPER = registerItem("maces/thumper",
            new ModMaceItem(ToolMaterials.IRON, 3, -2.5F));

    public static final Item SILVER_MACE = registerItem("maces/silver_mace",
            new SilverMace(ModToolMaterial.SILVER, 3, -2.5F));

    public static final Item BATTLEMACE = registerItem("maces/battlemace",
            new BattleMace(ToolMaterials.IRON, 3, -2.5F));

    public static final Item ENERGY_MACE = registerItem("maces/energy_mace",
            new EnergyMace(ToolMaterials.IRON, 3, -2.5F));

    public static final Item TEORITE_MACE = registerItem("maces/teorite_mace",
            new TeoriteMace(ModToolMaterial.TEORITE, 3, -2.5F));

    public static final Item HOLY_MACE = registerItem("maces/holy_mace",
            new HolyMace(ToolMaterials.GOLD, 3, -2.5F));

    public static final Item GOEDENDAG = registerItem("maces/goedendag",
            new Goedendag(ToolMaterials.DIAMOND, 3, -2.5F));

    public static final Item PERNACH = registerItem("maces/pernach",
            new Pernach(ToolMaterials.DIAMOND, 3, -2.5F));

    public static final Item SKULLCRUSHER = registerItem("maces/skullcrusher",
            new SkullCrusher(ToolMaterials.NETHERITE, 3, -2.5F));

    public static final Item GODS_MESSENGER = registerItem("maces/gods_messenger",
            new GodsMessenger(ToolMaterials.NETHERITE, 3, -2.5F));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Init.MOD_ID, name), item);
    }
    public static void registerMaceItems() {}
}