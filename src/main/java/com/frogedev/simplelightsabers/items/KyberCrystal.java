package com.frogedev.simplelightsabers.items;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class KyberCrystal extends Item{
	
	public KyberCrystal(Properties properties) {
		super(properties);
	}
	
	@Override
	public boolean isFoil(ItemStack itemstack) {
		// TODO Auto-generated method stub
		return true;
	}

}
