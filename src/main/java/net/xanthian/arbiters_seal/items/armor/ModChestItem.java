package net.xanthian.arbiters_seal.items.armor;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.xanthian.arbiters_seal.Init;

public class ModChestItem extends ArmorItem {
    public ModChestItem(ArmorMaterial material) {
        super(material, EquipmentSlot.HEAD, new FabricItemSettings().group(Init.ARBITERS_SEAL_ARMOR));
    }
}