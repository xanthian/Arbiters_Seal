package net.xanthian.arbiters_seal.items.armor;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.xanthian.arbiters_seal.Init;

public class ModFeetItem extends ArmorItem {
    public ModFeetItem(ArmorMaterial material) {
        super(material, EquipmentSlot.FEET, new FabricItemSettings().group(Init.ARBITERS_SEAL_ARMOR));
    }
}