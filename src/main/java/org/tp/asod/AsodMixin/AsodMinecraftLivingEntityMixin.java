package org.tp.asod.AsodMixin;

import net.minecraft.world.entity.Attackable;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.Level;
import net.minecraftforge.common.extensions.IForgeLivingEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.tp.AsodF.AsodStruct.PAIR;

@Mixin(LivingEntity.class)
public abstract class AsodMinecraftLivingEntityMixin extends Entity implements Attackable, IForgeLivingEntity {
    public AsodMinecraftLivingEntityMixin(EntityType<?> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
    }

    /*
     * Todo 向 LivingEntity 类中添加一些变量和tick函数
     */
    @Unique
    private PAIR.Pair2<Float, Integer> HittedFire = new PAIR.Pair2<>(0f, 0);//火焰强度-时间
    @Unique
    private PAIR.Pair2<Float, Integer> HittedIce = new PAIR.Pair2<>(0f, 0);//冰冻强度-时间
    @Unique
    private PAIR.Pair2<Float, Integer> HittedMagic = new PAIR.Pair2<>(0f, 0);//魔法强度-时间-同时作为虚空
    @Unique
    private PAIR.Pair2<Float, Integer> HittedThunder = new PAIR.Pair2<>(0f, 0);//雷电强度-时间
    @Unique
    private PAIR.Pair2<Float, Integer> HittedWater = new PAIR.Pair2<>(0f, 0);//水强度-时间
    @Unique
    private PAIR.Pair2<Float, Integer> HittedPhysical = new PAIR.Pair2<>(0f, 0);//物理强度-时间
    @Unique
    private PAIR.Pair2<Float, Integer> HittedLight = new PAIR.Pair2<>(0f, 0);//光强度-时间
    @Unique
    private PAIR.Pair2<Float, Integer> HittedDark = new PAIR.Pair2<>(0f, 0);//暗影强度-时间
    @Unique
    private PAIR.Pair2<Float, Integer> HittedGrass = new PAIR.Pair2<>(0f, 0);//草强度-时间


}
