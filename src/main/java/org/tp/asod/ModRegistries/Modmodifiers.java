package org.tp.asod.ModRegistries;

import net.minecraftforge.eventbus.api.IEventBus;
import org.tp.asod.Asod;
import org.tp.asod.ModModifiers.*;
import slimeknights.tconstruct.library.modifiers.util.ModifierDeferredRegister;
import slimeknights.tconstruct.library.modifiers.util.StaticModifier;

public class Modmodifiers {
    private static final ModifierDeferredRegister MODIFIERS = ModifierDeferredRegister.create(Asod.MODID);
    public static void register(IEventBus eventBus) {
        MODIFIERS.register(eventBus);
    }
    //命运2词条 急切刀锋
    public static final StaticModifier<eager_edge> EAGER_EDGE = MODIFIERS.register("eager_edge", eager_edge::new);
}
