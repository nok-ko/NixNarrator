package me.nokko.nixnarrator;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(modid = NixNarrator.MOD_ID)
public class NixNarrator {
    public static final String MOD_ID = "nixnarrator";
    public static final Logger logger = LogManager.getLogger(MOD_ID);

    @Mod.EventHandler
    public void onPreInit(FMLPreInitializationEvent event) {
        logger.info("NixNarrator present.");
    }
}
