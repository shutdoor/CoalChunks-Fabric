package com.shutdoor.coalchunks;

import com.shutdoor.coalchunks.reg.ModItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.registry.FuelRegistry;


public class CoalChunks implements ModInitializer {

	public static final String MODID = "coalchunks";

	@Override
	public void onInitialize() {

		ModItems.registerModItems();

		FuelRegistry.INSTANCE.add(ModItems.SMALL_COAL_CHUNK, 200);
		FuelRegistry.INSTANCE.add(ModItems.SMALL_CHARCOAL_CHUNK, 200);
		FuelRegistry.INSTANCE.add(ModItems.MEDIUM_COAL_CHUNK, 400);
		FuelRegistry.INSTANCE.add(ModItems.MEDIUM_CHARCOAL_CHUNK, 400);
		FuelRegistry.INSTANCE.add(ModItems.LARGE_COAL_CHUNK, 800);
		FuelRegistry.INSTANCE.add(ModItems.LARGE_CHARCOAL_CHUNK, 800);
	}
}
