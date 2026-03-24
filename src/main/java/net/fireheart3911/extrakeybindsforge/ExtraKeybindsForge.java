package net.fireheart3911.extrakeybindsforge;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Mod(ExtraKeybindsForge.MOD_ID)
public class ExtraKeybindsForge {
    public static final String MOD_ID = "extrakeybindsforge";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    public ExtraKeybindsForge(IEventBus modEventBus) {
        LOGGER.info("Extra Keybinds Forge initialized!");
    }
}
