package org.tp.asod.ModRegistries;

import net.minecraftforge.eventbus.api.IEventBus;
import org.tp.asod.Asod;
import slimeknights.tconstruct.library.modifiers.util.ModifierDeferredRegister;

public class Modmodifiers {
    private static final ModifierDeferredRegister MODIFIERS = ModifierDeferredRegister.create(Asod.MODID);
    public static void register(IEventBus eventBus) {
        MODIFIERS.register(eventBus);
    }
}
