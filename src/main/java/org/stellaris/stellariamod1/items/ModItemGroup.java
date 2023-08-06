package org.stellaris.stellariamod1.items;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import org.stellaris.stellariamod1.StellariaMain;

public class ModItemGroup {
    public static final ItemGroup ELEMENTS = FabricItemGroupBuilder.build(
            new Identifier(StellariaMain.MOD_ID, "elements"), () -> new ItemStack(ModItems.HYDROGEN));

    public static final ItemGroup MARS = FabricItemGroupBuilder.build(
            new Identifier(StellariaMain.MOD_ID, "mars"), () -> new ItemStack(ModItems.HYDROGEN));

    public static final ItemGroup COMPONENTS = FabricItemGroupBuilder.build(
            new Identifier(StellariaMain.MOD_ID, "components"), () -> new ItemStack(ModItems.HYDROGEN));
}
