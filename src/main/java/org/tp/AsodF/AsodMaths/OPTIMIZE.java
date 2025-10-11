package org.tp.AsodF.AsodMaths;

//一些优化算法
public class OPTIMIZE {
    public static long QuickPow(long a, long b, long mod) {
        //快速幂算法
        long res=1;
        while (b>0) {
            if ((b&1)==1) {
                res=(res*a)%mod;
            }
            a=(a*a)%mod;
            b>>=1;
        }
        return res;
    }
    public static int __GCD(int a, int b) {
        // 辗转相除法求最大公约数
        return b == 0 ? a : __GCD(b, a % b);
    }
    public static int Euler_phi(int n){
        //欧拉函数
        int res=n;
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                res=res/i*(i-1);
                while(n%i==0){
                    n/=i;
                }
            }
        }
        if(n>1){
            res=res/n*(n-1);
        }
        return res;
    }
}
