package com.coffeemugtwo.testmod0;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    
    public static final DeferredRegister<Item> ITEMS = 
        DeferredRegister.create(ForgeRegistries.ITEMS, TestMod0.MODID);

    public static final RegistryObject<Item> MY_BLOCK_ITEM = 
        ITEMS.register(
            "my_block", 
            () -> new BlockItem(ModBlocks.MY_BLOCK.get(), new Item.Properties())
        );

}
