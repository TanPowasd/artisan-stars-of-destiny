package org.tp.AsodF.AsodMaths;

import net.minecraft.world.phys.Vec3;
import org.tp.AsodF.AsodStruct.PAIR;

//向量计算
public class VECTOR {
    //计算两个三维向量的点乘
    public static double VertorDot(Vec3 v1, Vec3 v2) {
        double pReturn;
        PAIR.Pair3<Double, Double, Double> Vp1=new PAIR.Pair3<>(v1.x,v1.y,v1.z);
        PAIR.Pair3<Double, Double, Double> Vp2=new PAIR.Pair3<>(v2.x,v2.y,v2.z);
        pReturn=Vp1.first*Vp2.first+Vp1.second*Vp2.second+Vp1.third*Vp2.third;
        return pReturn;
    }
    //计算两个三维向量的叉乘
    public static Vec3 VertorCross(Vec3 v1, Vec3 v2) {
        Vec3 pReturn=new Vec3(0,0,0);
        PAIR.Pair3<Double, Double, Double> C= new PAIR.Pair3<Double, Double, Double>((double) 0, (double) 0, (double) 0);
        C.pInit(v1.y*v2.z-v1.z*v2.y,(v1.z*v2.x-v1.x*v2.z),(v1.x*v2.y-v1.y*v2.x));
        pReturn.add(C.first,C.second,C.third);
        return pReturn;
    }
    //计算两个三维向量的角度
    public static double VertorAngle(Vec3 v1, Vec3 v2) {
        double pReturn;
        pReturn=Math.toDegrees(Math.acos(VertorDot(v1,v2)/(v1.length()*v2.length())));
        return pReturn;
    }
}
