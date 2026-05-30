package ca.modmonster.playerupgrades.neoforge.client;

import ca.modmonster.playerupgrades.PlayerUpgrades;
import ca.modmonster.playerupgrades.client.PlayerUpgradesClient;
import net.blay09.mods.balm.client.BalmClient;
import net.blay09.mods.balm.neoforge.platform.runtime.NeoForgeLoadContext;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;

@Mod(value = PlayerUpgrades.MOD_ID, dist = Dist.CLIENT)
public class NeoForgePlayerUpgradesClient {

    public NeoForgePlayerUpgradesClient(ModContainer modContainer, IEventBus modEventBus) {
        final var context = new NeoForgeLoadContext(modContainer, modEventBus);
        BalmClient.initializeMod(PlayerUpgrades.MOD_ID, context, PlayerUpgradesClient::initialize);
    }
}
