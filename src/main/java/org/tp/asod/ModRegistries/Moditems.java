package org.tp.asod.ModRegistries;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.tp.asod.Asod;

public class Moditems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Asod.MODID);
    public static final RegistryObject<Item> TANPOWASD=ITEMS.register("tanpowasd",
            ()->new Item(new Item.Properties()));
    public static final RegistryObject<Item> ARTISAN_STARS_OF_DESTINY=ITEMS.register("artisan_stars_of_destiny",
            ()->new Item(new Item.Properties()));




    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
