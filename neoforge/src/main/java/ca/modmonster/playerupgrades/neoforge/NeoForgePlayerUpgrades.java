package ca.modmonster.playerupgrades.neoforge;

import ca.modmonster.playerupgrades.PlayerUpgrades;
import net.blay09.mods.balm.Balm;
import net.blay09.mods.balm.neoforge.platform.runtime.NeoForgeLoadContext;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;

@Mod(PlayerUpgrades.MOD_ID)
public class NeoForgePlayerUpgrades {

    public NeoForgePlayerUpgrades(ModContainer modContainer, IEventBus modEventBus) {
        final var context = new NeoForgeLoadContext(modContainer, modEventBus);
        Balm.initializeMod(PlayerUpgrades.MOD_ID, context, PlayerUpgrades::initialize);
    }
}
