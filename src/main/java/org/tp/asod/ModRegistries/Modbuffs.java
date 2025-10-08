package org.tp.asod.ModRegistries;

import net.minecraft.world.effect.MobEffect;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import org.tp.asod.Asod;

public class Modbuffs {
    public static final DeferredRegister<MobEffect> EFFECT=DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, Asod.MODID);
    public static void register(IEventBus eventBus) {
        EFFECT.register(eventBus);
    }
}
