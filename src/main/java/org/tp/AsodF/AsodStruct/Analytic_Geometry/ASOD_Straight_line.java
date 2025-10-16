package org.tp.AsodF.AsodStruct.Analytic_Geometry;

import org.tp.AsodF.AsodStruct.PAIR;

public class ASOD_Straight_line {
    double pA,pB, pC,pD;//三维空间直线解析式 ax+by+cz+d=0
    ASOD_Vector3 Ver = new ASOD_Vector3();
    public static void InitLineWithPoints(double x1, double y1, double z1, double x2, double y2, double z2){
        float dx = (float) (x2 - x1);
        float dy = (float) (y2 - y1);
        float dz = (float) (z2 - z1);
        //TODO: 计算直线解析式
    }
    public static void InitLineWithPAIR3(PAIR.Pair3<Double, Double, Double> p1, PAIR.Pair3<Double, Double, Double> p2){

    }
}
