package net.xanthian.arbiters_seal.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.xanthian.arbiters_seal.Init;
import net.xanthian.arbiters_seal.entity.mob.AeothEntity;
import net.xanthian.arbiters_seal.entity.mob.VangalEntity;
import net.xanthian.arbiters_seal.entity.mob.ZotzitEntity;

public class ModMobEntities {

    public static final EntityType<ZotzitEntity> ZOTZIT = Registry.register(
            Registry.ENTITY_TYPE, new Identifier(Init.MOD_ID, "zotzit"),
            FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, ZotzitEntity::new)
                    .dimensions(EntityDimensions.fixed(1f, 2f)).build());

    public static final EntityType<AeothEntity> AEOTH = Registry.register(
            Registry.ENTITY_TYPE, new Identifier(Init.MOD_ID, "aeoth"),
                FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, AeothEntity::new)
            .dimensions(EntityDimensions.fixed(1.5f, 2f)).build());

    public static final EntityType<VangalEntity> VANGAL = Registry.register(
            Registry.ENTITY_TYPE, new Identifier(Init.MOD_ID, "vangal"),
            FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, VangalEntity::new)
                    .dimensions(EntityDimensions.fixed(2f, 2.5f)).build());

}
