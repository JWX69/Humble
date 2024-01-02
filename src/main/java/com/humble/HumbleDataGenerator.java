package com.humble;

import com.humble.datagen.*;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class HumbleDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(HumbleBlockTagProvider::new);
//		pack.addProvider(HumbleItemTagProvider::new);
		pack.addProvider(HumbleLootTableProvider::new);
		pack.addProvider(HumbleModelProvider::new);
		pack.addProvider(HumbleRecipeProvider::new);
	}
}
