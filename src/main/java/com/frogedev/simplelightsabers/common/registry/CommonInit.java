package com.frogedev.simplelightsabers.common.registry;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import yesman.epicfight.api.forgeevent.WeaponCapabilityPresetRegistryEvent;

public class CommonInit {
	
	public static void init(final FMLCommonSetupEvent event) {
		
	}
	
	public static void registerWeaponCapabilities(WeaponCapabilityPresetRegistryEvent event) {
		event.getTypeEntry().put("lightsaber", WeaponCapabilityInit.LIGHTSABER);
	}
}
