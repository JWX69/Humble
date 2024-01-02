package com.humble;

import com.humble.block.HumbleBlocks;
import com.humble.item.HumbleItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Humble implements ModInitializer {
	public static final String MOD_ID = "humble";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		HumbleItems.registerHumbleItems();
		HumbleBlocks.registerHumbleBlocks();
	}
}