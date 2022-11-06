package net.xanthian.arbiters_seal.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.AttachedStemBlock;
import net.minecraft.block.Blocks;
import net.minecraft.block.GourdBlock;
import net.minecraft.block.StemBlock;
import net.minecraft.item.Item;
import net.xanthian.arbiters_seal.items.RareItems;

public class JammyFruitBlock extends GourdBlock {

    public JammyFruitBlock() {
        super(FabricBlockSettings.copyOf(Blocks.PUMPKIN));
    }

    @Override
    public StemBlock getStem() {
        return (StemBlock)ModBlocks.JAMMY_FRUIT_STEM;
    }

    @Override
    public AttachedStemBlock getAttachedStem() {
        return (AttachedStemBlock) ModBlocks.ATTACHED_JAMMY_FRUIT_STEM;
    }

    @Override
    public Item asItem() {
        return RareItems.JAMMY_FRUIT;
    }
}
