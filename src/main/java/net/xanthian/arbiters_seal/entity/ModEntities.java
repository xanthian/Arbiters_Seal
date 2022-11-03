package net.xanthian.arbiters_seal.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.xanthian.arbiters_seal.Init;
import net.xanthian.arbiters_seal.entity.item.ModBoatEntity;
import net.xanthian.arbiters_seal.entity.item.ModChestBoatEntity;
import net.xanthian.arbiters_seal.entity.mob.AeothEntity;

public class ModEntities {



    public static final EntityType<ModBoatEntity> BOAT = Registry.register(
            Registry.ENTITY_TYPE, new Identifier(Init.MOD_ID, "ebony_boat"),
            FabricEntityTypeBuilder.create(SpawnGroup.MISC, ModBoatEntity::new)
                    .dimensions(EntityDimensions.fixed(1.3754f, 0.5625f)).build());

    public static final EntityType<ModChestBoatEntity> CHEST_BOAT = Registry.register(
            Registry.ENTITY_TYPE, new Identifier(Init.MOD_ID, "ebony_chest_boat"),
            FabricEntityTypeBuilder.create(SpawnGroup.MISC, ModChestBoatEntity::new)
                    .dimensions(EntityDimensions.fixed(1.3754f, 0.5625f)).build());

    public static final EntityType<AeothEntity> AEOTH = Registry.register(
            Registry.ENTITY_TYPE, new Identifier(Init.MOD_ID, "aeoth"),
            FabricEntityTypeBuilder.create(SpawnGroup.MISC, AeothEntity::new)
                    .dimensions(EntityDimensions.fixed(1f, 2f)).build());

    }