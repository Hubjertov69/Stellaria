package org.stellaris.stellariamod1.items;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import org.stellaris.stellariamod1.StellariaMain;

public class ModItemGroup {
    public static final ItemGroup ELEMENTS = FabricItemGroupBuilder.build(
            new Identifier(StellariaMain.MOD_ID, "elements"), () -> new ItemStack(ModItems.HYDROGEN));
}
