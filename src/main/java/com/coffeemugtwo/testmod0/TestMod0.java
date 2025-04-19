package com.coffeemugtwo.testmod0;

import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@Mod("testmod0")
@EventBusSubscriber
public class TestMod0 {
    
    public TestMod0() {
        System.out.println("Hello TestMod0!");
    }

    @SubscribeEvent
    public static void onServerStarting(ServerStartingEvent event){
        System.out.println("TestMod0: Server is starting!");
    }
}
