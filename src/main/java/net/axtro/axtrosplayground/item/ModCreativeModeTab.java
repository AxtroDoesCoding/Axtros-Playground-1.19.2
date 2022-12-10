package net.axtro.axtrosplayground.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab PLAYGROUND_TAB = new CreativeModeTab("axtrosplaygroundtab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.AXTROLOGO.get());
        }
    };

}
