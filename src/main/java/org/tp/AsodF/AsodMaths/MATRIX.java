package org.tp.AsodF.AsodMaths;

//一些矩阵运算的算法
public class MATRIX {
    public static long[][] MatMatrix=new long[10][10];
    public static long[][] MatrixMul_2(long[][] a,long[][] b){
        long[][] ans=new long[10][10];
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                ans[i][j]=0;
            }
        }
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                for(int k=0;k<2;k++){
                    ans[i][j]+= (long) (a[i][k]*b[k][j]%(1e9+7));
                }
            }
        }
        return ans;
    }
    public static long Fibonacci(long n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        long[][] ans=new long[2][2];
        ans[0][0]=1;
        ans[0][1]=1;
        ans[1][0]=1;
        ans[1][1]=0;
        long[][] res=new long[2][2];
        res[0][0]=0;
        res[0][1]=0;
        res[1][0]=0;
        res[1][1]=0;
        n-=2;
        while(n>0){
            if((n&1)==1){
                res=MatrixMul_2(res,ans);
            }
            ans=MatrixMul_2(ans,ans);
            n>>=1;
        }
        return (long) ((res[0][1])%(1e9+7));
    }
}
