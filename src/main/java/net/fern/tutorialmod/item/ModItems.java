package net.fern.tutorialmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fern.tutorialmod.Tutorialmod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;


public class ModItems {
    public static final Item UNCANNY_CAT = registerItem("uncanny_cat", new Item(
            new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Tutorialmod.MOD_ID, "uncanny_cat")))));
    public static final Item WHOLESOME_CAT = registerItem("wholesome_cat", new Item(
            new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Tutorialmod.MOD_ID, "wholesome_cat")))));


    private static Item registerItem(String name, Item item)
    {
        return Registry.register(Registries.ITEM, Identifier.of(Tutorialmod.MOD_ID, name), item);
    }

    public static void registerModItems()
    {
        Tutorialmod.LOGGER.info("Registrando el item de mod para: " + Tutorialmod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(UNCANNY_CAT);
            entries.add(WHOLESOME_CAT);
        });
    }
}
