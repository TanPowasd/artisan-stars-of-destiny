package org.tp.AsodF.AsodStruct.Analytic_Geometry;

import net.minecraft.world.phys.Vec3;
import org.tp.AsodF.AsodStruct.PAIR;

public class ASOD_Straight_line {
    //参考 https://www.luogu.com.cn/paste/w9zqr3e7
    public double pX=0,pY=0,pZ=0;
    public ASOD_Vector3 Ver = new ASOD_Vector3();
    public  void InitLineWithPoints(double x1, double y1, double z1, double x2, double y2, double z2){
        float dx = (float) (x2 - x1);
        float dy = (float) (y2 - y1);
        float dz = (float) (z2 - z1);
        this.pX=dx;
        this.pY=dy;
        this.pZ=dz;
        this.Ver.InitVec3(this.pX,this.pY,this.pZ);
    }
    public void InitLineWithPAIR3(PAIR.Pair3<Double, Double, Double> p1, PAIR.Pair3<Double, Double, Double> p2){
        this.InitLineWithPoints(p1.getFirst(),p1.getSecond(),p1.getThird(), p2.getFirst(), p2.getSecond(),p2.getThird());
    }
}
