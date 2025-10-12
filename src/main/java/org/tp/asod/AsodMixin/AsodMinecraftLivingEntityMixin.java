package org.tp.asod.AsodMixin;

import net.minecraft.world.entity.Attackable;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.Level;
import net.minecraftforge.common.extensions.IForgeLivingEntity;
import org.spongepowered.asm.mixin.Implements;
import org.spongepowered.asm.mixin.Interface;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.tp.AsodF.AsodStruct.PAIR;
import org.tp.AsodF.MixinExtra.HittedDamageSource;
import org.tp.AsodF.MixinExtra.HittedDamageSourceAPI;

@Mixin(LivingEntity.class)
public abstract class AsodMinecraftLivingEntityMixin extends Entity implements HittedDamageSourceAPI{
    //由于沟槽的mixin技术，导致巨构失败
    public AsodMinecraftLivingEntityMixin(EntityType<?> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
    }

    /*
     * Todo 向 LivingEntity 类中添加一些变量和tick函数
     */

    @Unique
    protected HittedDamageSource HITtedDamageSource = new HittedDamageSource();



}
