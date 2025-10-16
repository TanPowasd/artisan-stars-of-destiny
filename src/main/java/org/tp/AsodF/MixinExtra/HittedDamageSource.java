package org.tp.AsodF.MixinExtra;

import org.tp.AsodF.AsodStruct.PAIR;

public class HittedDamageSource {
    //由于沟槽的mixin技术，导致巨构失败

    //元素受击 强度-时间
    private PAIR.Pair2<Float, Integer> HittedFire = new PAIR.Pair2<>(0f, 0);//火焰强度-时间
    private PAIR.Pair2<Float, Integer> HittedIce = new PAIR.Pair2<>(0f, 0);//冰冻强度-时间
    private PAIR.Pair2<Float, Integer> HittedMagic = new PAIR.Pair2<>(0f, 0);//魔法强度-时间-同时作为虚空
    private PAIR.Pair2<Float, Integer> HittedThunder = new PAIR.Pair2<>(0f, 0);//雷电强度-时间
    private PAIR.Pair2<Float, Integer> HittedWater = new PAIR.Pair2<>(0f, 0);//水强度-时间
    private PAIR.Pair2<Float, Integer> HittedPhysical = new PAIR.Pair2<>(0f, 0);//物理强度-时间
    private PAIR.Pair2<Float, Integer> HittedLight = new PAIR.Pair2<>(0f, 0);//光强度-时间
    private PAIR.Pair2<Float, Integer> HittedDark = new PAIR.Pair2<>(0f, 0);//暗影强度-时间
    private PAIR.Pair2<Float, Integer> HittedGrass = new PAIR.Pair2<>(0f, 0);//草强度-时间

    public  float GetHittedFireStrength() {
        return HittedFire.first;
    }
    public int GetHittedFireTime() {
        return HittedFire.second;
    }
    public float GetHittedIceStrength() {
        return HittedIce.first;
    }
    public int GetHittedIceTime() {
        return HittedIce.second;
    }
    public float GetHittedMagicStrength() {
        return HittedMagic.first;
    }
    public int GetHittedMagicTime() {
        return HittedMagic.second;
    }
    public float GetHittedThunderStrength() {
        return HittedThunder.first;
    }
    public int GetHittedThunderTime() {
        return HittedThunder.second;
    }
    public float GetHittedWaterStrength() {
        return HittedWater.first;
    }
    public int GetHittedWaterTime() {
        return HittedWater.second;
    }
    public float GetHittedPhysicalStrength() {
        return HittedPhysical.first;
    }
    public int GetHittedPhysicalTime() {
        return HittedPhysical.second;
    }
    public float GetHittedLightStrength() {
        return HittedLight.first;
    }
    public int GetHittedLightTime() {
        return HittedLight.second;
    }
    public float GetHittedDarkStrength() {
        return HittedDark.first;
    }
    public int GetHittedDarkTime() {
        return HittedDark.second;
    }
    public float GetHittedGrassStrength() {
        return HittedGrass.first;
    }
    public int GetHittedGrassTime() {
        return HittedGrass.second;
    }
    public void SetHittedFireStrength(float pStrength) {
        HittedFire.first = pStrength;
    }
    public void SetHittedFireTime(int pTicks) {
        HittedFire.second = pTicks;
    }
    public void SetHittedIceStrength(float pStrength) {
        HittedIce.first = pStrength;
    }
    public void SetHittedIceTime(int pTicks) {
        HittedIce.second = pTicks;
    }
    public void SetHittedMagicStrength(float pStrength) {
        HittedMagic.first = pStrength;
    }
    public void SetHittedMagicTime(int pTicks) {
        HittedMagic.second = pTicks;
    }
    public void SetHittedThunderStrength(float pStrength) {
        HittedThunder.first = pStrength;
    }
    public void SetHittedThunderTime(int pTicks) {
        HittedThunder.second = pTicks;
    }
    public void SetHittedWaterStrength(float pStrength) {
        HittedWater.first = pStrength;
    }
    public void SetHittedWaterTime(int pTicks) {
        HittedWater.second = pTicks;
    }
    public void SetHittedPhysicalStrength(float pStrength) {
        HittedPhysical.first = pStrength;
    }
    public void SetHittedPhysicalTime(int pTicks) {
        HittedPhysical.second = pTicks;
    }
    public void SetHittedLightStrength(float pStrength) {
        HittedLight.first = pStrength;
    }
    public void SetHittedLightTime(int pTicks) {
        HittedLight.second = pTicks;
    }
    public void SetHittedDarkStrength(float pStrength) {
        HittedDark.first = pStrength;
    }
    public void SetHittedDarkTime(int pTicks) {
        HittedDark.second = pTicks;
    }
    public void SetHittedGrassStrength(float pStrength) {
        HittedGrass.first = pStrength;
    }
    public void SetHittedGrassTime(int pTicks) {
        HittedGrass.second = pTicks;
    }
    public void AddHittedFireStrength(float pStrength) {
        HittedFire.first += pStrength;
    }
    public void AddHittedFireTime(int pTicks) {
        HittedFire.second += pTicks;
    }
    public void AddHittedIceStrength(float pStrength) {
        HittedIce.first += pStrength;
    }
    public void AddHittedIceTime(int pTicks) {
        HittedIce.second += pTicks;
    }
    public void AddHittedMagicStrength(float pStrength) {
        HittedMagic.first += pStrength;
    }
    public void AddHittedMagicTime(int pTicks) {
        HittedMagic.second += pTicks;
    }
    public void AddHittedThunderStrength(float pStrength) {
        HittedThunder.first += pStrength;
    }
    public void AddHittedThunderTime(int pTicks) {
        HittedThunder.second += pTicks;
    }
    public void AddHittedWaterStrength(float pStrength) {
        HittedWater.first += pStrength;
    }
    public void AddHittedWaterTime(int pTicks) {
        HittedWater.second += pTicks;
    }
    public void AddHittedPhysicalStrength(float pStrength) {
        HittedPhysical.first += pStrength;
    }
    public void AddHittedPhysicalTime(int pTicks) {
        HittedPhysical.second += pTicks;
    }
    public void AddHittedLightStrength(float pStrength) {
        HittedLight.first += pStrength;
    }
    public void AddHittedLightTime(int pTicks) {
        HittedLight.second += pTicks;
    }
    public void AddHittedDarkStrength(float pStrength) {
        HittedDark.first += pStrength;
    }
    public void AddHittedDarkTime(int pTicks) {
        HittedDark.second += pTicks;
    }
    public void AddHittedGrassStrength(float pStrength) {
        HittedGrass.first += pStrength;
    }
    public void AddHittedGrassTime(int pTicks) {
        HittedGrass.second += pTicks;
    }
}