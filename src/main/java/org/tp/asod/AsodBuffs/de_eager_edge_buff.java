package org.tp.asod.AsodBuffs;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.AttributeMap;

public class de_eager_edge_buff extends MobEffect {
    //急切刀锋的冷却
    public de_eager_edge_buff(){
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
