package org.tp.AsodF.AsodMaths;

//随机数
public class RANDOM {
    /* ToDo 实现真随机数 */
    public static long TimeRandom(){
        //时间做种子做随机数
        long Time= System.currentTimeMillis();//以当前时间为种子
        return Time;//尚不完善
    }
    public static long IntRandom(long l,long r){
        return TimeRandom()%(r-l+1)+l;
    }
    public static boolean RandomRT(double p){
        //随机概率是否成立
        return IntRandom(1,10000000)/10000000.0<p;
    }
}
