package net.fireheart3911.extrakeybindsforge.event;

import net.fireheart3911.extrakeybindsforge.ExtraKeybindsForge;
import net.fireheart3911.extrakeybindsforge.util.KeyBinding;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

public class ClientEvents {
    @Mod.EventBusSubscriber(modid = Origins.MOD_ID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ClientModBusEvents{
        @SubscribeEvent
        public static void onKeyRegister(RegisterKeyMappingsEvent event){
            event.register(KeyBinding.TERTIARY_KEY);
            event.register(KeyBinding.NONARY_KEY);
            event.register(KeyBinding.OCTENARY_KEY);
            event.register(KeyBinding.QUATERNARY_KEY);
            event.register(KeyBinding.QUINARY_KEY);
            event.register(KeyBinding.SENARY_KEY);
            event.register(KeyBinding.SEPTENARY_KEY);
        }
    }

}
