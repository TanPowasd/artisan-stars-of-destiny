package org.tp.asod.AsodRegistries;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.DamageType;
import net.minecraftforge.eventbus.api.IEventBus;
import org.tp.asod.Asod;

public class AsodDamageType {
    private static ResourceKey<DamageType> create(String string) {
        return ResourceKey.create(Registries.DAMAGE_TYPE,new ResourceLocation(Asod.MODID,string));
    }
    public static void register(IEventBus eventBus) {
        AsodDamageType.register(eventBus);
    }
    public static final ResourceKey<DamageType> ASOD_FIRE_DAMAGE_TYPE = create("asod_fire_damage_type");
    public static final ResourceKey<DamageType> ASOD_ICE_DAMAGE_TYPE = create("asod_ice_damage_type");
    public static final ResourceKey<DamageType> ASOD_THUNDER_DAMAGE_TYPE = create("asod_thunder_damage_type");
    public static final ResourceKey<DamageType> ASOD_MAGIC_DAMAGE_TYPE = create("asod_magic_damage_type");
    public static final ResourceKey<DamageType> ASOD_PHYSICAL_DAMAGE_TYPE = create("asod_physical_damage_type");
    public static final ResourceKey<DamageType> ASOD_DARK_DAMAGE_TYPE = create("asod_dark_damage_type");
    public static final ResourceKey<DamageType> ASOD_LIGHT_DAMAGE_TYPE = create("asod_light_damage_type");
    public static final ResourceKey<DamageType> ASOD_WATER_DAMAGE_TYPE = create("asod_water_damage_type");
    public static final ResourceKey<DamageType> ASOD_GRASS_DAMAGE_TYPE = create("asod_grass_damage_type");

}
