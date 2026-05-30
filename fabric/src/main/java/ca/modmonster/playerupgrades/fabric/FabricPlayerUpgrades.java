package ca.modmonster.playerupgrades.fabric;

import ca.modmonster.playerupgrades.PlayerUpgrades;
import net.blay09.mods.balm.Balm;
import net.blay09.mods.balm.fabric.platform.runtime.FabricLoadContext;
import net.fabricmc.api.ModInitializer;

public class FabricPlayerUpgrades implements ModInitializer {
    @Override
    public void onInitialize() {
        Balm.initializeMod(PlayerUpgrades.MOD_ID, FabricLoadContext.INSTANCE, PlayerUpgrades::initialize);
    }
}
