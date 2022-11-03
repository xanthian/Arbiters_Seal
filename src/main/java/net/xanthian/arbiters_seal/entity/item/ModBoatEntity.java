package net.xanthian.arbiters_seal.entity.item;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.data.DataTracker;
import net.minecraft.entity.data.TrackedData;
import net.minecraft.entity.data.TrackedDataHandlerRegistry;
import net.minecraft.entity.vehicle.BoatEntity;
import net.minecraft.item.Item;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.xanthian.arbiters_seal.entity.ModEntities;
import net.xanthian.arbiters_seal.items.Items;

public class ModBoatEntity extends BoatEntity {
    private static final TrackedData<Integer> WOOD_TYPE = DataTracker.registerData(ModBoatEntity.class, TrackedDataHandlerRegistry.INTEGER);

    public ModBoatEntity(EntityType<? extends BoatEntity> entityType, World world) {
        super(entityType, world);
    }

    public static ModBoatEntity create(World world, double x, double y, double z) {
        ModBoatEntity boat = ModEntities.BOAT.create(world);
        boat.setPos(x, y, z);
        boat.setVelocity(Vec3d.ZERO);
        boat.prevX = x;
        boat.prevY = y;
        boat.prevZ = z;
        return boat;
    }

    @Override
    protected void initDataTracker() {
        super.initDataTracker();
        this.dataTracker.startTracking(WOOD_TYPE, 0);
    }

    @Override
    protected void readCustomDataFromNbt(NbtCompound nbt) {
        if (nbt.contains("Type", 8)) {
            this.setWoodType(Type.byName(nbt.getString("Type")));
        }
    }

    @Override
    protected void writeCustomDataToNbt(NbtCompound nbt) {
        super.writeCustomDataToNbt(nbt);
        nbt.putString("Type", this.getWoodType().name);
    }

    public Type getWoodType() {
        return Type.getType(this.dataTracker.get(WOOD_TYPE));
    }

    public void setWoodType(Type type) {
        this.dataTracker.set(WOOD_TYPE, type.ordinal());
    }

    @Override
    public Item asItem() {
        return this.getWoodType().getItem();
    }

    public enum Type {
        EBONY("ebony", Items.EBONY_BOAT, Items.EBONY_CHEST_BOAT);

        private final String name;
        private final Item item;
        private final Item chestItem;

        Type(String name, Item boatItem, Item chestBoatItem) {
            this.name = name;
            this.item = boatItem;
            this.chestItem = chestBoatItem;
        }

        public static Type getType(int type) {
            Type[] types = values();
            if (type < 0 || type >= types.length) {
                type = 0;
            }

            return types[type];
        }

        public static Type byName(String name) {
            Type[] values = values();

            for (Type value : values) {
                if (value.getName().equals(name)) {
                    return value;
                }
            }
            return values[0];
        }

        public String getName() {
            return name;
        }

        public Item getItem() {
            return item;
        }

        public Item getChestItem() {
            return chestItem;
        }
    }
}