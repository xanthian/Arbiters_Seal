package net.xanthian.arbiters_seal.items.tools;

import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterials;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.xanthian.arbiters_seal.Init;
import net.xanthian.arbiters_seal.items.tools.staffs.Godsleg;
import net.xanthian.arbiters_seal.material.ModToolMaterial;

public class Staffs {

    public static final Item WOOD_STAFF = registerItem("staffs/wood_staff",
            new ModStaffItem(ToolMaterials.WOOD, 3, -2.9F));

    public static final Item WHITE_STAFF = registerItem("staffs/white_staff",
            new ModStaffItem(ToolMaterials.IRON, 1, -2.9F));

    public static final Item SILVER_STAFF = registerItem("staffs/silver_staff",
            new ModStaffItem(ModToolMaterial.SILVER, 3, -2.9F));

    public static final Item HEALING_STAFF = registerItem("staffs/healing_staff",
            new ModStaffItem(ToolMaterials.IRON, 2, -2.9F));

    public static final Item HEAVY_STAFF = registerItem("staffs/heavy_staff",
            new ModStaffItem(ToolMaterials.IRON, 3, -3.1F));

    public static final Item TEORITE_STAFF = registerItem("staffs/teorite_staff",
            new ModStaffItem(ModToolMaterial.TEORITE, 2, -2.9F));

    public static final Item GOLD_STAFF = registerItem("staffs/gold_staff",
            new ModStaffItem(ToolMaterials.GOLD, 4, -2.9F));

    public static final Item BLACK_STAFF = registerItem("staffs/black_staff",
            new ModStaffItem(ModToolMaterial.EBONY, 2, -2.9F));

    public static final Item GATEKEEPER = registerItem("staffs/gatekeeper",
            new ModStaffItem(ToolMaterials.IRON, 3, -2.9F));

    public static final Item MALIGENII = registerItem("staffs/maligenii",
            new ModStaffItem(ToolMaterials.IRON, 3, -2.9F));

    public static final Item GODSLEG = registerItem("staffs/godsleg",
            new Godsleg(ToolMaterials.DIAMOND, 3, -2.9F));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Init.MOD_ID, name), item);
    }
    public static void registerStaffItems() {}
}