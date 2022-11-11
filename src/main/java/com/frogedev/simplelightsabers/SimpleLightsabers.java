package com.frogedev.simplelightsabers;

import com.frogedev.simplelightsabers.common.registry.CommonInit;
import com.frogedev.simplelightsabers.common.registry.ItemInit;
import com.frogedev.simplelightsabers.common.registry.SoundInit;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("simplelightsabers")
public class SimpleLightsabers {
	
	public static final String MOD_ID = "simplelightsabers";
	
	public static final CreativeModeTab LIGHTSABERS_TAB = new CreativeModeTab(MOD_ID) {
		
		@Override
		@OnlyIn(Dist.CLIENT)
		public ItemStack makeIcon() {
			return new ItemStack(ItemInit.KYBER_CRYSTAL.get());
		}
	};
	
	public SimpleLightsabers()
	{
		IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
		
		modEventBus.addListener(CommonInit::init);
		modEventBus.addListener(CommonInit::registerWeaponCapabilities);
		
		ItemInit.ITEMS.register(modEventBus);
		SoundInit.SOUND_EVENTS.register(modEventBus);
		
		MinecraftForge.EVENT_BUS.register(this);
		
	}
}
