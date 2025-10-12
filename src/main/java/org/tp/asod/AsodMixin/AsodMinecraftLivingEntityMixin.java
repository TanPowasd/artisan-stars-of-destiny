package org.tp.asod.AsodMixin;

import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.Level;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import org.tp.AsodF.DeBug;
import org.tp.AsodF.MixinExtra.HittedDamageSource;
import org.tp.AsodF.MixinExtra.HittedDamageSourceAPI;
import org.tp.asod.AsodRegistries.AsodDamageType;

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

    @Inject(method = "hurt", at = @At("HEAD"))
    public void onHurt(DamageSource pDamageSource, float pAmount, CallbackInfoReturnable<Boolean> cir){
        /* TODO 为后面打元素反应划大饼  */
        DeBug.Logger.log("damgeSource: "+pDamageSource.toString());
        if(pDamageSource.is(AsodDamageType.ASOD_FIRE_DAMAGE_TYPE)){
            if(HITtedDamageSource.GetHittedFireStrength() == 0){
                HITtedDamageSource.SetHittedFireStrength(1f);
                HITtedDamageSource.SetHittedFireTime(3*20);
            }
            else{
                HITtedDamageSource.AddHittedFireStrength(0.5f);
                HITtedDamageSource.AddHittedFireTime((int) (0.5*20));
            }
        }
        else if (pDamageSource.is(AsodDamageType.ASOD_ICE_DAMAGE_TYPE)) {
            if (HITtedDamageSource.GetHittedIceStrength() == 0) {
                HITtedDamageSource.SetHittedIceStrength(1f);
                HITtedDamageSource.SetHittedIceTime(3 * 20);
            } else {
                HITtedDamageSource.AddHittedIceStrength(0.5f);
                HITtedDamageSource.AddHittedIceTime((int) (0.5 * 20));
            }
        }
        else if (pDamageSource.is(AsodDamageType.ASOD_THUNDER_DAMAGE_TYPE)) {
            if (HITtedDamageSource.GetHittedThunderStrength() == 0) {
                HITtedDamageSource.SetHittedThunderStrength(1f);
                HITtedDamageSource.SetHittedThunderTime(3 * 20);
            } else {
                HITtedDamageSource.AddHittedThunderStrength(0.5f);
                HITtedDamageSource.AddHittedThunderTime((int) (0.5 * 20));
            }
        }
        else if (pDamageSource.is(AsodDamageType.ASOD_MAGIC_DAMAGE_TYPE)) {
            if (HITtedDamageSource.GetHittedMagicStrength() == 0) {
                HITtedDamageSource.SetHittedMagicStrength(1f);
                HITtedDamageSource.SetHittedMagicTime(3 * 20);
            } else {
                HITtedDamageSource.AddHittedMagicStrength(0.5f);
                HITtedDamageSource.AddHittedMagicTime((int) (0.5 * 20));
            }
        }
        else if (pDamageSource.is(AsodDamageType.ASOD_PHYSICAL_DAMAGE_TYPE)) {
            if (HITtedDamageSource.GetHittedPhysicalStrength() == 0) {
                HITtedDamageSource.SetHittedPhysicalStrength(1f);
                HITtedDamageSource.SetHittedPhysicalTime(3 * 20);
            } else {
                HITtedDamageSource.AddHittedPhysicalStrength(0.5f);
                HITtedDamageSource.AddHittedPhysicalTime((int) (0.5 * 20));
            }
        }
        else if (pDamageSource.is(AsodDamageType.ASOD_DARK_DAMAGE_TYPE)) {
            if (HITtedDamageSource.GetHittedDarkStrength() == 0) {
                HITtedDamageSource.SetHittedDarkStrength(1f);
                HITtedDamageSource.SetHittedDarkTime(3 * 20);
            } else {
                HITtedDamageSource.AddHittedDarkStrength(0.5f);
                HITtedDamageSource.AddHittedDarkTime((int) (0.5 * 20));
            }
        }
        else if (pDamageSource.is(AsodDamageType.ASOD_LIGHT_DAMAGE_TYPE)) {
            if (HITtedDamageSource.GetHittedLightStrength() == 0) {
                HITtedDamageSource.SetHittedLightStrength(1f);
                HITtedDamageSource.SetHittedLightTime(3 * 20);
            } else {
                HITtedDamageSource.AddHittedLightStrength(0.5f);
                HITtedDamageSource.AddHittedLightTime((int) (0.5 * 20));
            }
        }
        else if (pDamageSource.is(AsodDamageType.ASOD_WATER_DAMAGE_TYPE)) {
            if (HITtedDamageSource.GetHittedWaterStrength() == 0) {
                HITtedDamageSource.SetHittedWaterStrength(1f);
                HITtedDamageSource.SetHittedWaterTime(3 * 20);
            } else {
                HITtedDamageSource.AddHittedWaterStrength(0.5f);
                HITtedDamageSource.AddHittedWaterTime((int) (0.5 * 20));
            }
        }
        else if (pDamageSource.is(AsodDamageType.ASOD_GRASS_DAMAGE_TYPE)) {
            if (HITtedDamageSource.GetHittedGrassStrength() == 0) {
                HITtedDamageSource.SetHittedGrassStrength(1f);
                HITtedDamageSource.SetHittedGrassTime(3 * 20);
            } else {
                HITtedDamageSource.AddHittedGrassStrength(0.5f);
                HITtedDamageSource.AddHittedGrassTime((int) (0.5 * 20));
            }
        }
    }

}
