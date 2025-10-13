package org.tp.asod.AsodRegistries;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.tp.asod.Asod;

public class Asoditems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Asod.MODID);

    //作者
    public static final RegistryObject<Item> TANPOWASD=ITEMS.register("tanpowasd",
            ()->new Item(new Item.Properties()));

    //创造物品栏图标
    public static final RegistryObject<Item> ARTISAN_STARS_OF_DESTINY=ITEMS.register("artisan_stars_of_destiny",
            ()->new Item(new Item.Properties()));

    //致敬蓝钢
    public static final RegistryObject<Item> INOTC_BLUE_STEEL=ITEMS.register("inotc_blue_steel",
            ()->new Item(new Item.Properties()));


    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
