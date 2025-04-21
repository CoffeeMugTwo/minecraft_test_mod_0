package com.coffeemugtwo.testmod0;

import com.coffeemugtwo.testmod0.ModBlocks;
import com.coffeemugtwo.testmod0.ModItems;

import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;

@Mod(TestMod0.MODID)
@EventBusSubscriber
public class TestMod0 {
    
    public static final String MODID = "testmod0";

    public TestMod0() {
        System.out.println("Hello TestMod0!");
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModBlocks.BLOCKS.register(modEventBus);
        ModItems.ITEMS.register(modEventBus);

        modEventBus.addListener(this::addCreative);

    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
            event.accept(ModItems.MY_BLOCK_ITEM);
        }
    }

    @SubscribeEvent
    public static void onServerStarting(ServerStartingEvent event){
        System.out.println("TestMod0: Server is starting!");
    }

}
