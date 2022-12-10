package net.axtro.axtrosplayground.item;

import net.axtro.axtrosplayground.AxtrosPlayground;
import net.axtro.axtrosplayground.block.ModBlocks;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, AxtrosPlayground.MOD_ID);

    public static final RegistryObject<Item> AXTROLOGO = ITEMS.register("axtrologo",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CUCUMBER_SEEDS = ITEMS.register("cucumber_seeds",
            () -> new ItemNameBlockItem(ModBlocks.CUCUMBER_CROP.get(),
                    new Item.Properties().tab(ModCreativeModeTab.PLAYGROUND_TAB)));

    public static final RegistryObject<Item> CUCUMBER = ITEMS.register("cucumber",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PLAYGROUND_TAB)
                    .food(new FoodProperties.Builder().nutrition(4).saturationMod(3f).build())));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

