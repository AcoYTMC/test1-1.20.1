package net.acoyt.tutorialmod.item;

import net.acoyt.tutorialmod.Tutorialmod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.BowItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.SwordItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item RUBY = registerItem("ruby", new Item(new FabricItemSettings()));

    public static final Item FRACTURED_INGOT = registerItem("fractured_ingot", new Item(new FabricItemSettings()));

    public static final Item METAL_DETECTOR = registerItem("metal_detector", new Item(new FabricItemSettings().food(ModFoodComponents.METAL_DETECTOR)));

    public static final Item FRACTURED_SCYTHE = registerItem("fractured_scythe",
            new SwordItem(ModToolMaterial.FRACTURED_INGOT, -1, -2f, new FabricItemSettings().maxCount(1)));

    public static final Item TOAST = registerItem("toast",
            new Item(new FabricItemSettings().food(ModFoodComponents.TOAST)));

    public static final Item CORAL_BOW = registerItem("coral_bow",
            new BowItem(new FabricItemSettings().maxDamage(700)));

    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(RUBY);
    }
    private static void addItemsToNATURALItemGroup(FabricItemGroupEntries entries) {

    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Tutorialmod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Tutorialmod.LOGGER.info("Registering Mod Items for " + Tutorialmod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(ModItems::addItemsToNATURALItemGroup);
    }
}
