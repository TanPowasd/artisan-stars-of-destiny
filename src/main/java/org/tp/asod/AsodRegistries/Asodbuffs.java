package org.tp.asod.AsodRegistries;

import net.minecraft.world.effect.MobEffect;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.tp.asod.Asod;
import org.tp.asod.AsodBuffs.*;

public class Asodbuffs {
    public static final DeferredRegister<MobEffect> EFFECT=DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, Asod.MODID);
    public static void register(IEventBus eventBus) {
        EFFECT.register(eventBus);
    }
    public static final RegistryObject<MobEffect> EAGER_EDGE_BUFF=EFFECT.register("eager_edge_buff", eager_edge_buff::new);
}
