package io.github.Tors_0.finite_water;

import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FiniteWater implements ModInitializer {
	public static final Logger LOGGER = LoggerFactory.getLogger("Finite Water");
	@Override
	public void onInitialize(ModContainer mod) {
		LOGGER.info("Mod {} version {} initializing!", mod.metadata().name(), mod.metadata().version());
	}
}
