package org.tp.asod.AsodRegistries;

import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import org.tp.asod.Asod;

public class Asodblocks {
    public static final DeferredRegister<Block> BLOCKS=DeferredRegister.create(ForgeRegistries.BLOCKS,Asod.MODID);

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Asod.MODID);

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
        BLOCKS.register(eventBus);
    }
}
