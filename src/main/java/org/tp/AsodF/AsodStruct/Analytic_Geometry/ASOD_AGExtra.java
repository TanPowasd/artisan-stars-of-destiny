package org.tp.AsodF.AsodStruct.Analytic_Geometry;

import net.minecraft.util.Mth;
import net.minecraft.world.phys.Vec3;
import org.tp.AsodF.AsodStruct.PAIR;

public class ASOD_AGExtra {
    public float PointToASLDir(PAIR.Pair3<Float,Float,Float> pPoint,ASOD_Straight_line pLine){
        float pReturn=0;

        return pReturn;
    }
    public float DegreeWithTwoASL(ASOD_Straight_line pL1,ASOD_Straight_line pL2){
        float pReturn=0;

        return pReturn;
    }
    public float AV3_dot(ASOD_Vector3 pV1,ASOD_Vector3 pV2){
        return (float) (pV1.pX*pV2.pX+pV1.pY*pV2.pY+pV1.pZ*pV2.pZ);
    }
    public float DegreeWithTwoAV3(ASOD_Vector3 pV1,ASOD_Vector3 pV2){
        float pReturn=0;
        Vec3 vc1,vc2;
        vc1=pV1.ToVec3();
        vc2=pV2.ToVec3();


        return pReturn;
    }
}
