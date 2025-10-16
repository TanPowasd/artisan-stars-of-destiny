package org.tp.AsodF.AsodShitThinkings;

import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.AttributeInstance;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import org.tp.AsodF.NameUUID;

import javax.annotation.Nullable;
import java.util.UUID;


//@program AsodF ShitThinkings 针对限制伤害的妙妙小方法
public class Clever_little_tricks_to_limit_harm {
    UUID uuid_REAL_damageHIT= NameUUID.GetUUID_fromName("REAL_damageHIT");
    public void REAL_damageHIT( DamageSource pDamageSource, float pDamageAmount,@Nullable LivingEntity pAttacker,@Nullable LivingEntity pEntity){
        if(pAttacker!= null && pEntity!= null){
            pEntity.setLastHurtByMob(pAttacker);
            pEntity.setLastHurtMob(pAttacker);
            double MaxEntityHealth= pEntity.getMaxHealth();
            double NowEntityHealth = pEntity.getHealth();
            AttributeInstance GetEntityMaxHealth = pEntity.getAttribute(Attributes.MAX_HEALTH);
            if(GetEntityMaxHealth!=null){
                AttributeModifier temp = GetEntityMaxHealth.getModifier(uuid_REAL_damageHIT);
                if(temp!=null){
                    MaxEntityHealth = temp.getAmount();
                }
                GetEntityMaxHealth.removeModifier(uuid_REAL_damageHIT);
                if(NowEntityHealth - pDamageAmount <= 0){
                    /*
                     * 如果伤害可以直接击杀实体
                     * 将实体的最大生命值设为0.01 再kill掉实体
                     */
                    //pEntity.setHealth(0.01F);
                    GetEntityMaxHealth.addPermanentModifier(new AttributeModifier(uuid_REAL_damageHIT, "reducemaxhp", 0.01f, AttributeModifier.Operation.ADDITION));
                    pEntity.kill();
                }
                else{
                    /*
                     * 如果实体的生命值大于伤害值
                     * 将实体的最大生命值设为当前生命值减去伤害值然后还原
                     * 模拟实体受到伤害
                     * */
                    GetEntityMaxHealth.addPermanentModifier(new AttributeModifier(uuid_REAL_damageHIT, "reducemaxhp", NowEntityHealth - pDamageAmount, AttributeModifier.Operation.ADDITION));
                    GetEntityMaxHealth.addPermanentModifier(new AttributeModifier(uuid_REAL_damageHIT, "reducemaxhp", MaxEntityHealth, AttributeModifier.Operation.ADDITION));
                }
            }

            pEntity.hurt(pDamageSource, 0);
            pEntity.invulnerableTime=0;
        }
    }
}
