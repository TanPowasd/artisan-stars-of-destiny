package org.tp.asod.AsodModifiers;
import com.github.L_Ender.cataclysm.init.ModEffect;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.LivingEntity;
import org.jetbrains.annotations.NotNull;
import org.tp.AsodF.FromST.BaseHooks;
import org.tp.AsodF.NameUUID;
import org.tp.asod.AsodRegistries.Asodbuffs;
import slimeknights.tconstruct.library.modifiers.ModifierEntry;
import slimeknights.tconstruct.library.tools.context.EquipmentChangeContext;
import slimeknights.tconstruct.library.tools.nbt.IToolStackView;


import javax.annotation.Nullable;
import java.util.UUID;


/*
* 命运2词条 急切刀锋
* */
public class eager_edge extends BaseHooks {
    UUID uuid= NameUUID.GetUUID_fromName("eager_edge");
    @Override
    public void onEquip(IToolStackView tool, ModifierEntry modifier, EquipmentChangeContext context) {
        //this.modifierOnEquip(tool, modifier, context);
        @Nullable LivingEntity Player = context.getEntity();
        @Nullable MobEffect effect_ee = Asodbuffs.EAGER_EDGE_BUFF.get();
        @Nullable MobEffect effect_dee = Asodbuffs.DE_EAGER_EDGE_BUFF.get();
        if(Player!=null&&effect_ee!=null&&effect_dee!=null){
            Player.addEffect(new MobEffectInstance(effect_ee,3*20,0));
        }
        //检测是是不是有冷却buff de_eager_edge_buff

    }

    /*
    * 类似于命运2
    * 使用挂名BUFF eager_edge_buff(切到此武器获得3*20tick的buff,内置冷却3*20tick)
    * 当Buff存在时，攻击键按下，进入内置冷却然后执行逻辑:
    * 1.当实现7格内，30°范围内有实体，则锁定实体，急切至目标前，将水平动能设为零，并造成1.5倍伤害
    * 2.当未索敌时，向视角方向的水平方向冲击，速度动能为7
    * 3.词条为非异域词条，无催化，但有金急切加强
    * 金急切:buff时间增加10tick，冷却减少 5tick,未索敌时水平动量+1
    * */

}
