package net.xanthian.arbiters_seal.entity.block;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.EnvironmentInterface;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.*;
import net.minecraft.text.MutableText;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableTextContent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.xanthian.arbiters_seal.entity.ModBlockEntities;

@EnvironmentInterface(
        itf = LidOpenable.class,
        value = EnvType.CLIENT
)
public class ModChestEntity extends ChestBlockEntity implements LidOpenable {
    public float lidOpenness = 0f;
    public float lastLidOpenness = 0f;
    public ModChestEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.CHEST_BLOCK_ENTITY, pos, state);

    }
    @Override
    protected Text getContainerName() {
        return MutableText.of(new TranslatableTextContent("container.arbiters_seal.ebony_chest"));
    }

    @Override
    public float getAnimationProgress(float delta) {
        return MathHelper.lerp(delta, lastLidOpenness, lidOpenness);
    }
}
