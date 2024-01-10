package com.humble;

import com.humble.registry.HumbleBlocks;
import com.humble.registry.HumbleItems;
import net.fabricmc.api.ModInitializer;

import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Humble implements ModInitializer {
	public static final String MOD_ID = "humble";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	public static Identifier path(String path){
		return new Identifier(MOD_ID, path);
	}
	@Override
	public void onInitialize() {

		HumbleItems.registerHumbleItems();
		HumbleBlocks.registerHumbleBlocks();
	}
}