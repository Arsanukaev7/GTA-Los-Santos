package dev.losantos;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GtaLosSantos implements ModInitializer {
    public static final String MOD_ID = "gtalosantos";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    public static final Item LOS_SANTOS_PHONE = Registry.register(
            Registries.ITEM,
            new Identifier(MOD_ID, "los_santos_phone"),
            new Item(new Item.Settings().maxCount(1))
    );

    @Override
    public void onInitialize() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS)
                .register(entries -> entries.add(LOS_SANTOS_PHONE));

        LOGGER.info("Los Santos 0.1.0 loaded. Welcome to the city!");
    }
}
