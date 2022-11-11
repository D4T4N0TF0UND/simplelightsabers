package com.frogedev.simplelightsabers.common.registry;

import com.frogedev.simplelightsabers.SimpleLightsabers;
import com.frogedev.simplelightsabers.items.SaberTiers;
import com.frogedev.simplelightsabers.items.KyberCrystal;
import com.google.common.base.Supplier;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.SwordItem;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, SimpleLightsabers.MOD_ID);
	
	public static final RegistryObject<Item> KYBER_CRYSTAL = register("kyber_crystal",
			() -> new KyberCrystal(new Item.Properties().tab(SimpleLightsabers.LIGHTSABERS_TAB).rarity(Rarity.EPIC).fireResistant()));
	
	public static final RegistryObject<Item> LIGHTSABER = register("lightsaber", 
			() -> new SwordItem(SaberTiers.SINGLEBLADE, 9, -2.0F, new Item.Properties().tab(SimpleLightsabers.LIGHTSABERS_TAB).rarity(Rarity.EPIC).fireResistant()));
	
	private static <T extends Item> RegistryObject<T> register(final String name, final Supplier<T> item) {
		return ITEMS.register(name,  item);
	}
}
