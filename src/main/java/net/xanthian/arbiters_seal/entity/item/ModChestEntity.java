package net.xanthian.arbiters_seal.entity.item;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.*;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.text.MutableText;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableTextContent;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.BlockPos;
import net.xanthian.arbiters_seal.entity.ModBlockEntities;

public class ModChestEntity extends ChestBlockEntity implements LidOpenable{

    public ModChestEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.CHEST_BLOCK_ENTITY, pos, state);
        this.setInvStackList(DefaultedList.ofSize(27, ItemStack.EMPTY));
    }

    @Override
    public boolean canPlayerUse(PlayerEntity player) {
        return true;
    }

    @Override
    protected Text getContainerName() {
        return MutableText.of(new TranslatableTextContent("container.arbiters_seal.ebony_chest"));
    }

    @Override
    public int size() {
        return 27;
    }

}
