package com.mookid47.obsidianupdate.item;

import com.mookid47.obsidianupdate.ObsidianUpdate;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(ObsidianUpdate.MOD_ID);

    public static final DeferredItem<Item> OBSIDIAN_INGOT = ITEMS.registerItem("obsidian_ingot", Item::new, new Item.Properties());

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

}
