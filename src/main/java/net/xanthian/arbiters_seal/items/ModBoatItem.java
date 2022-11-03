package net.xanthian.arbiters_seal.items;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BoatItem;
import net.minecraft.item.ItemStack;
import net.minecraft.predicate.entity.EntityPredicates;
import net.minecraft.stat.Stats;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.RaycastContext;
import net.minecraft.world.World;
import net.minecraft.world.event.GameEvent;
import net.xanthian.arbiters_seal.entity.item.ModBoatEntity;
import net.xanthian.arbiters_seal.entity.item.ModChestBoatEntity;

import java.util.List;
import java.util.function.Predicate;

public class ModBoatItem extends BoatItem {
    private static final Predicate<Entity> ENTITY_PREDICATE = EntityPredicates.EXCEPT_SPECTATOR.and(Entity::canHit);
    private final ModBoatEntity.Type type;
    private final boolean hasChest;

    public ModBoatItem(boolean hasChest, ModBoatEntity.Type boatType, Settings prop) {
        super(hasChest, null, prop);
        this.hasChest = hasChest;
        this.type = boatType;
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity player, Hand hand) {
        ItemStack itemstack = player.getStackInHand(hand);
        HitResult hitresult = raycast(world, player, RaycastContext.FluidHandling.ANY);
        if (hitresult.getType() == HitResult.Type.MISS) {
            return TypedActionResult.pass(itemstack);
        } else {
            Vec3d vec3d = player.getRotationVec(1.0F);
            List<Entity> list = world.getOtherEntities(player, player.getBoundingBox().stretch(vec3d.multiply(5.0)).expand(1.0), ENTITY_PREDICATE);
            if (!list.isEmpty()) {
                Vec3d eyePosition = player.getEyePos();

                for (Entity entity : list) {
                    Box box = entity.getBoundingBox().expand((double)entity.getTargetingMargin());
                    if (box.contains(eyePosition)) {
                        return TypedActionResult.pass(itemstack);
                    }
                }
            }

            if (hitresult.getType() == HitResult.Type.BLOCK) {
                ModBoatEntity boat = this.getBoat(world, hitresult);
                boat.setWoodType(this.type);
                boat.setYaw(player.getYaw());
                if (!world.isSpaceEmpty(boat, boat.getBoundingBox())) {
                    return TypedActionResult.fail(itemstack);
                } else {
                    if (!world.isClient) {
                        world.spawnEntity(boat);
                        world.emitGameEvent(player, GameEvent.ENTITY_PLACE, hitresult.getPos());
                        if (!player.getAbilities().creativeMode) {
                            itemstack.decrement(1);
                        }
                    }

                    player.incrementStat(Stats.USED.getOrCreateStat(this));
                    return TypedActionResult.success(itemstack, world.isClient());
                }
            } else {
                return TypedActionResult.pass(itemstack);
            }
        }
    }

    private ModBoatEntity getBoat(World level, HitResult hitResult) {
        return this.hasChest ? ModChestBoatEntity.create(level, hitResult.getPos().x, hitResult.getPos().y, hitResult.getPos().z)
                : ModBoatEntity.create(level, hitResult.getPos().x, hitResult.getPos().y, hitResult.getPos().z);
    }
}