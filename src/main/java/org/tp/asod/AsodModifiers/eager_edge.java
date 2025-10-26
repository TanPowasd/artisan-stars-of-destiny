package org.tp.asod.AsodModifiers;

import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.LivingEntity;
import org.tp.AsodF.FromST.BaseHooks;
import org.tp.AsodF.MixinExtra.HittedDamageSourceAPI;
import org.tp.AsodF.NameUUID;
import org.tp.asod.AsodRegistries.AsodDamageType;
import slimeknights.tconstruct.library.modifiers.Modifier;
import slimeknights.tconstruct.library.modifiers.ModifierEntry;
import slimeknights.tconstruct.library.modifiers.ModifierHooks;
import slimeknights.tconstruct.library.modifiers.hook.combat.MeleeDamageModifierHook;
import slimeknights.tconstruct.library.modifiers.hook.combat.MeleeHitModifierHook;
import slimeknights.tconstruct.library.module.ModuleHookMap;
import slimeknights.tconstruct.library.tools.context.ToolAttackContext;
import slimeknights.tconstruct.library.tools.nbt.IToolStackView;

import java.util.UUID;


/*
* 命运2词条 急切刀锋
* */
public class eager_edge extends Modifier implements MeleeHitModifierHook,MeleeDamageModifierHook{
    UUID uuid= NameUUID.GetUUID_fromName("eager_edge");
    @Override
    protected void registerHooks(ModuleHookMap.Builder builder) {
        super.registerHooks(builder);
        builder.addHook(this, ModifierHooks.MELEE_HIT,ModifierHooks.MELEE_DAMAGE);

    }

    /**
     * @param tool       Tool used to attack
     * @param modifier   Modifier level
     * @param context    Attack context
     * @param baseDamage Base damage dealt before modifiers
     * @param damage     Computed damage from all prior modifiers
     * @return
     */
    @Override
    public float getMeleeDamage(IToolStackView tool, ModifierEntry modifier, ToolAttackContext context, float baseDamage, float damage) {
        LivingEntity entity=context.getLivingTarget();
        entity.getEntityData();
        return damage;
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
