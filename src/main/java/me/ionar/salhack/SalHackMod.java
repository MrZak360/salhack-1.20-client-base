package me.ionar.salhack;

import me.ionar.salhack.main.SalHack;
import me.zero.alpine.fork.bus.EventManager;
import net.fabricmc.api.ModInitializer;
import me.zero.alpine.fork.bus.EventBus;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SalHackMod implements ModInitializer {
    public static final Logger log = LoggerFactory.getLogger("sal");
	public static final String NAME = "SalHack";
	public static final String VERSION = "1.0.0";

	public static final EventBus EVENT_BUS = new EventManager();

	@Override
	public void onInitialize() {
		log.info("init "+NAME+" v: " + VERSION);
		SalHack.Init();
		//MinecraftForge.EVENT_BUS.register(new ForgeEventProcessor());
	}
}