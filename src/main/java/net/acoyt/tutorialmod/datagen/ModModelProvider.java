package net.acoyt.tutorialmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.acoyt.tutorialmod.block.ModBlocks;
import net.acoyt.tutorialmod.item.ModItems;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        BlockStateModelGenerator.BlockTexturePool rubyPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.RUBY_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RUBY_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_RUBY_ORE);



    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        //ingredients
        itemModelGenerator.register(ModItems.RUBY, Models.GENERATED);
        itemModelGenerator.register(ModItems.FRACTURED_INGOT, Models.GENERATED);
        //food
        itemModelGenerator.register(ModItems.TOAST, Models.GENERATED);
        itemModelGenerator.register(ModItems.METAL_DETECTOR, Models.GENERATED);
        //tools
        itemModelGenerator.register(ModItems.FRACTURED_SCYTHE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.CORAL_BOW, Models.GENERATED);

    }
}