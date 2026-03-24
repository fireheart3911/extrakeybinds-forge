package net.fireheart3911.extrakeybindsforge.keybind;

import com.mojang.blaze3d.platform.InputConstants;
import net.fireheart3911.extrakeybindsforge.ExtraKeybindsForge;
import net.minecraft.client.KeyMapping;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.RegisterKeyMappingsEvent;
import net.neoforged.neoforge.client.settings.KeyConflictContext;

@EventBusSubscriber(modid = ExtraKeybindsForge.MOD_ID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModKeyBindings {

    public static final String CATEGORY = "key.categories." + ExtraKeybindsForge.MOD_ID;

    public static final KeyMapping TERTIARY_ACTIVE = new KeyMapping(
            "key.extrakeybindsforge.tertiary_active",
            KeyConflictContext.IN_GAME,
            InputConstants.UNKNOWN,
            CATEGORY
    );

    public static final KeyMapping QUATERNARY_ACTIVE = new KeyMapping(
            "key.extrakeybindsforge.quaternary_active",
            KeyConflictContext.IN_GAME,
            InputConstants.UNKNOWN,
            CATEGORY
    );

    public static final KeyMapping QUINARY_ACTIVE = new KeyMapping(
            "key.extrakeybindsforge.quinary_active",
            KeyConflictContext.IN_GAME,
            InputConstants.UNKNOWN,
            CATEGORY
    );

    public static final KeyMapping SENARY_ACTIVE = new KeyMapping(
            "key.extrakeybindsforge.senary_active",
            KeyConflictContext.IN_GAME,
            InputConstants.UNKNOWN,
            CATEGORY
    );

    public static final KeyMapping SEPTENARY_ACTIVE = new KeyMapping(
            "key.extrakeybindsforge.septenary_active",
            KeyConflictContext.IN_GAME,
            InputConstants.UNKNOWN,
            CATEGORY
    );

    public static final KeyMapping OCTENARY_ACTIVE = new KeyMapping(
            "key.extrakeybindsforge.octenary_active",
            KeyConflictContext.IN_GAME,
            InputConstants.UNKNOWN,
            CATEGORY
    );

    public static final KeyMapping NONARY_ACTIVE = new KeyMapping(
            "key.extrakeybindsforge.nonary_active",
            KeyConflictContext.IN_GAME,
            InputConstants.UNKNOWN,
            CATEGORY
    );

    @SubscribeEvent
    public static void registerKeyMappings(RegisterKeyMappingsEvent event) {
        event.register(TERTIARY_ACTIVE);
        event.register(QUATERNARY_ACTIVE);
        event.register(QUINARY_ACTIVE);
        event.register(SENARY_ACTIVE);
        event.register(SEPTENARY_ACTIVE);
        event.register(OCTENARY_ACTIVE);
        event.register(NONARY_ACTIVE);

        ExtraKeybindsForge.LOGGER.info("Registered {} keybindings", 7);
    }
}
