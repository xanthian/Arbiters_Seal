package net.xanthian.arbiters_seal.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.xanthian.arbiters_seal.Init;
import net.xanthian.arbiters_seal.entity.item.ModBoatEntity;
import net.xanthian.arbiters_seal.entity.item.ModChestBoatEntity;
import net.xanthian.arbiters_seal.entity.mob.AeothEntity;

import java.util.function.Supplier;

public class ModEntities {

    public static <T extends Entity> Supplier<EntityType<T>>
    registerEntity(String name, EntityType.EntityFactory<T> entityFactory, SpawnGroup category, float width, float height, int clientTrackingRange) {
        EntityType<T> registry = Registry.register(Registry.ENTITY_TYPE, new Identifier(Init.MOD_ID, name),
                FabricEntityTypeBuilder.create(category, entityFactory).dimensions(EntityDimensions.fixed(width, height)).trackRangeChunks(clientTrackingRange).build());
        return () -> registry;
    }

    public static final Supplier<EntityType<ModBoatEntity>> BOAT = ModEntities.registerEntity("boat",
            ModBoatEntity::new, SpawnGroup.MISC, 1.375F, 0.5625F, 10);

    public static final Supplier<EntityType<ModChestBoatEntity>> CHEST_BOAT = ModEntities.registerEntity("chest_boat",
            ModChestBoatEntity::new, SpawnGroup.MISC, 1.375F, 0.5625F, 10);

    public static final Supplier<EntityType<AeothEntity>> AEOTH = ModEntities.registerEntity("aeoth",
            AeothEntity::new, SpawnGroup.MISC,2f, 2f, 10);

    public static void registerEntities() {

    }
}
