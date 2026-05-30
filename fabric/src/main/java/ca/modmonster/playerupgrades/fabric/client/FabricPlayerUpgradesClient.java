package ca.modmonster.playerupgrades.fabric.client;

import ca.modmonster.playerupgrades.PlayerUpgrades;
import ca.modmonster.playerupgrades.client.PlayerUpgradesClient;
import net.blay09.mods.balm.client.BalmClient;
import net.blay09.mods.balm.fabric.platform.runtime.FabricLoadContext;
import net.fabricmc.api.ClientModInitializer;

public class FabricPlayerUpgradesClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BalmClient.initializeMod(PlayerUpgrades.MOD_ID, FabricLoadContext.INSTANCE, PlayerUpgradesClient::initialize);
    }
}
