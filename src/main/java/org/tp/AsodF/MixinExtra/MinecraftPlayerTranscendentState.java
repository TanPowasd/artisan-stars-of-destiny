package org.tp.AsodF.MixinExtra;

public class MinecraftPlayerTranscendentState {
    //光能条
    private static int MaxSolarEnergy=500;
    private  float SolarEnergy=0f;
    //暗影条
    private static int MaxShadowEnergy=500;
    private  float ShadowEnergy=0f;
    //超凡条
    private static int MaxTrancendentEnergy=1000;
    private  float TrancendentEnergy=0f;

    public boolean IsInTranscendent=false;//是否处于超凡状态
    public static int MaxTranscendentTick=4000;//超凡状态最大持续时间
    public int NowTranscendentTick=0;//当前超凡状态持续时间
    public int NextTickExterTick=0;//下一tick超凡增加的时间

    public boolean HasTranscendentCore=false;//是否拥有超凡核心

    public int GetNextTickTranscendentExtra(){
        return this.NextTickExterTick*5;//1tick超凡 超能条的值为5/tick
    }
    public static int GetMaxSolarEnergy() {
        return MaxSolarEnergy;
    }
    public static int GetMaxShadowEnergy() {
        return MaxShadowEnergy;
    }
    public static int GetMaxTrancendentEnergy() {
        return MaxTrancendentEnergy;
    }
    public float GetSolarEnergy() {
        return SolarEnergy;
    }
    public float GetShadowEnergy() {
        return ShadowEnergy;
    }
    public float GetTrancendentEnergy() {
        return TrancendentEnergy;
    }
    public void SetSolarEnergy(float SolarEnergy) {
        this.SolarEnergy = SolarEnergy;
    }
    public void SetShadowEnergy(float ShadowEnergy) {
        this.ShadowEnergy = ShadowEnergy;
    }
    public void SetTrancendentEnergy(float TrancendentEnergy) {
        this.TrancendentEnergy = TrancendentEnergy;
    }
    public void AddSolarEnergy(float addSolarEnergy) {
        this.SolarEnergy += addSolarEnergy;
    }
    public void AddShadowEnergy(float addShadowEnergy) {
        this.ShadowEnergy += addShadowEnergy;
    }
    public void AddTrancendentEnergy(float addTrancendentEnergy) {
        this.TrancendentEnergy += addTrancendentEnergy;
    }
}
