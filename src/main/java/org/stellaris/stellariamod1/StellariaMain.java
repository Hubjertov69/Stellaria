package org.stellaris.stellariamod1;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.stellaris.stellariamod1.enchantments.Enchantment;
import org.stellaris.stellariamod1.items.ModItems;

public class StellariaMain implements ModInitializer {
    public static final String MOD_ID = "stellariamod1";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {

        ModItems.registerModItems();
        ModBlocks.registerModBLocks();


    }
}
