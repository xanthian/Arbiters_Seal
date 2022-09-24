package net.xanthian.arbiters_seal.items.armor;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.ArmorMaterials;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;
import net.xanthian.arbiters_seal.Init;

import java.util.List;

public class Chestpieces {

    // CLOTH
    public static final Item BLACK_ROBE = registerItem("chestpieces/black_robe", new ModChestItem(ArmorMaterials.NETHERITE){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("A thin bronze hair ornament.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Init.MOD_ID, name), item);
    }
    public static void registerChestpieceItems() {}
}