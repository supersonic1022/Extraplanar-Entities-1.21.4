package com.zoolim.extraplanarentities.item;

import com.zoolim.extraplanarentities.Extraplanarentities;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item PRINCELY_SHARD = registerItem("princely_shard", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Extraplanarentities.MOD_ID,"princely_shard")))));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(Extraplanarentities.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Extraplanarentities.LOGGER.info("Registering mod items for " + Extraplanarentities.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries -> {
           fabricItemGroupEntries.add(PRINCELY_SHARD);
        });
    }
}
