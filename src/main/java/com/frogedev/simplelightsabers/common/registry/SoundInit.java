package com.frogedev.simplelightsabers.common.registry;

import com.frogedev.simplelightsabers.SimpleLightsabers;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class SoundInit {
	
	public static final DeferredRegister<SoundEvent> SOUND_EVENTS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, SimpleLightsabers.MOD_ID);
	
	public static final RegistryObject<SoundEvent> LIGHTSABER_SWING = SOUND_EVENTS.register("lightsaber_swing",
			() -> new SoundEvent(new ResourceLocation(SimpleLightsabers.MOD_ID, "lightsaber_swing")));
}
