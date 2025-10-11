package org.tp.asod.AsodModifiers;

import org.tp.AsodF.FromST.BaseHooks;

/*
* 命运2词条 急切刀锋
* */
public class eager_edge extends BaseHooks {
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
