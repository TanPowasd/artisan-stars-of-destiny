package org.tp.asod.AsodMixin;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.tp.AsodF.MixinExtra.MinecraftPlayerTranscendentState;

@Mixin(Player.class)
public class AsodMinecraftPlayerEntityMixin {


    @Unique
    protected MinecraftPlayerTranscendentState asod_transcendentState = new MinecraftPlayerTranscendentState();

}
