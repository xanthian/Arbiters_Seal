package net.xanthian.arbiters_seal.mixin;

import net.minecraft.inventory.Inventory;
import net.minecraft.recipe.Recipe;
import net.minecraft.recipe.RecipeManager;
import net.minecraft.recipe.RecipeType;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;
import net.xanthian.arbiters_seal.Init;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;

import java.util.*;

@Mixin(value = RecipeManager.class)
public abstract class RecipeManagerMixin {
    @Shadow
    private <C extends Inventory, T extends Recipe<C>> Map<Identifier, Recipe<C>> getAllOfType(RecipeType<T> type) {
        return null;
    }
    /**
     * @author Paulevs
     * @reason mc janky crafting manager
     **/
    @Overwrite
    public <C extends Inventory, T extends Recipe<C>> Optional<T> getFirstMatch(RecipeType<T> type, C inventory, World world) {
        Collection<Recipe<C>> values = getAllOfType(type).values();
        List<Recipe<C>> recipes = new ArrayList<>(values);
        recipes.sort((first, second) -> {
            boolean isMine = first.getId().getNamespace().equals(Init.MOD_ID);
            return (isMine ^ second.getId().getNamespace().equals(Init.MOD_ID)) ? (isMine ? -1 : 1) : 0;
        });
        return (Optional<T>) recipes.stream().filter(recipe -> recipe.matches(inventory, world)).findFirst();
    }
}