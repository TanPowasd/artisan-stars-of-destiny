package org.tp.AsodF.AsodStruct.Analytic_Geometry;

import org.tp.AsodF.AsodMaths.ASOD_Constant;
import org.tp.AsodF.AsodMaths.VECTOR;
import org.tp.AsodF.AsodStruct.PAIR;

public class ASOD_Vector3 {
    private final double PI = ASOD_Constant.PI;
    public static PAIR.Pair3<Double, Double, Double>pVec3 = new PAIR.Pair3<Double, Double, Double>(0.0, 0.0, 0.0);
    public static double pX, pY, pZ;
    public static void setpX(double pX) {
        ASOD_Vector3.pX = pX;
    }
    public static void setpY(double pY) {
        ASOD_Vector3.pY = pY;
    }
    public static void setpZ(double pZ) {
        ASOD_Vector3.pZ = pZ;
    }
    public static void InitVec3(double x, double y, double z) {
        pX=x;
        pY=y;
        pZ=z;
        pVec3=new PAIR.Pair3<Double, Double, Double>(x,y,z);
    }
    public  static void InitVec3(PAIR.Pair3<Double, Double, Double> pGet) {
        pVec3=pGet;
        pX=pGet.getFirst();
        pY=pGet.getSecond();
        pZ=pGet.getThird();
    }

}
