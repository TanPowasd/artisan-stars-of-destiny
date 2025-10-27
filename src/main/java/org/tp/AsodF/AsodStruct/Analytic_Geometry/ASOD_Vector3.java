package org.tp.AsodF.AsodStruct.Analytic_Geometry;

import net.minecraft.util.Mth;
import net.minecraft.world.phys.Vec3;
import org.openjdk.nashorn.internal.ir.SplitReturn;
import org.tp.AsodF.AsodMaths.ASOD_Constant;
import org.tp.AsodF.AsodMaths.VECTOR;
import org.tp.AsodF.AsodStruct.PAIR;

public class ASOD_Vector3 {
    private final double PI = ASOD_Constant.PI;
    public PAIR.Pair3<Double, Double, Double>pVpair = new PAIR.Pair3<Double, Double, Double>(0.0, 0.0, 0.0);
    public double pX, pY, pZ;
    public void setpX(double pX) {
        this.pX = pX;
    }
    public void setpY(double pY) {
        this.pY = pY;
    }
    public void setpZ(double pZ) {
        this.pZ = pZ;
    }
    public void InitVec3(double x, double y, double z) {
        pX=x;
        pY=y;
        pZ=z;
        pVpair=new PAIR.Pair3<Double, Double, Double>(x,y,z);
    }
    public  void InitVpair(PAIR.Pair3<Double, Double, Double> pGet) {
        pVpair=pGet;
        pX=pGet.getFirst();
        pY=pGet.getSecond();
        pZ=pGet.getThird();
    }
    public Vec3 ToVec3(){
        Vec3 pReturn=null;
        pReturn=new Vec3(pX,pY,pZ);
        return pReturn;
    }
    public float Dist(){
        return Mth.sqrt((float) (this.pX*this.pX+this.pY*this.pY+this.pZ*this.pZ));
    }
}
