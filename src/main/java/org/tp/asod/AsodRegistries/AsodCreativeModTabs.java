package org.tp.asod.AsodRegistries;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import org.tp.asod.Asod;

public class AsodCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS=
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Asod.MODID);

    public  static final RegistryObject<CreativeModeTab> AsodTab_1= CREATIVE_MODE_TABS.register("asod",
            ()->CreativeModeTab.builder().icon(()->new ItemStack(Asoditems.ARTISAN_STARS_OF_DESTINY.get()))
                    .title(Component.translatable("creativetab.asod_tab_1"))
                    .withSearchBar()
                    .displayItems((pParameters, pOutput) -> {
                        //ModItem
                       // pOutput.accept(ModItems.LRIRON.get());
                        pOutput.accept(Asoditems.TANPOWASD.get());
                        //pOutput.accept(Moditems.ARTISAN_STARS_OF_DESTINY.get());
                    })
                    .build()

    );
    public static void  register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }

}
