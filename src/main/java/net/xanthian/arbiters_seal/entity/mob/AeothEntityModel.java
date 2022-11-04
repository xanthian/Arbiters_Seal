package net.xanthian.arbiters_seal.entity.mob;

import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.entity.Entity;

public class AeothEntityModel <T extends Entity> extends SinglePartEntityModel<T> {
    private final ModelPart root;

    public AeothEntityModel(ModelPart root) {
        this.root = root;
    }

        @Override
        public ModelPart getPart () {
            return this.root;
        }

        @Override
        public void setAngles (T entity,float limbAngle, float limbDistance, float animationProgress, float headYaw,
        float headPitch){
    }
}