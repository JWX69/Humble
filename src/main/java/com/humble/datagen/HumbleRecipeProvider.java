package com.humble.datagen;

import com.humble.block.HumbleBlocks;
import com.humble.item.HumbleItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.recipe.book.RecipeCategory;

import java.util.function.Consumer;

public class HumbleRecipeProvider extends FabricRecipeProvider {
    public HumbleRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, HumbleItems.ROCK, RecipeCategory.MISC,
                Blocks.COBBLESTONE);
    }
}
