package org.tp.asod.ModBuffs;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.AttributeMap;

public class eager_edge_buff extends MobEffect {
    //词条急切刀锋的挂名buff，当实体存在此buff时才可以实现急切刀锋效果
    public eager_edge_buff(){
        super(MobEffectCategory.HARMFUL,0x0f1f2f);
    }
    @Override
    public boolean isDurationEffectTick(int duration,int amplifier){
        return false;
    }
    @Override
    public void addAttributeModifiers(LivingEntity entity, AttributeMap attributes, int amplifier){
        super.addAttributeModifiers(entity, attributes, amplifier);
    }

}
