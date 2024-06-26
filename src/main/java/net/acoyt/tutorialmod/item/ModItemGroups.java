package net.acoyt.tutorialmod.item;

import net.acoyt.tutorialmod.Tutorialmod;
import net.acoyt.tutorialmod.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup RUBY_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Tutorialmod.MOD_ID, "ruby"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.ruby"))
                    .icon(() -> new ItemStack(ModItems.RUBY)).entries((displayContext, entries) -> {
                        entries.add(ModItems.RUBY);
                        entries.add(ModItems.FRACTURED_INGOT);
                        entries.add(ModItems.FRACTURED_SCYTHE);
                        entries.add(ModItems.CORAL_BOW);
                        entries.add(ModItems.METAL_DETECTOR);
                        entries.add((ModItems.TOAST));

                        entries.add(ModBlocks.RUBY_ORE);
                        entries.add(ModBlocks.RUBY_BLOCK);
                        entries.add(ModBlocks.DEEPSLATE_RUBY_ORE);




                    }).build());

    public static void RegisterItemGroups() {
        Tutorialmod.LOGGER.info("Registering Item Groups for " + Tutorialmod.MOD_ID);
    }
}
