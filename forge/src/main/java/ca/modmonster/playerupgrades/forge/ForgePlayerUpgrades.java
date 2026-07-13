package ca.modmonster.playerupgrades.forge;

import ca.modmonster.playerupgrades.PlayerUpgrades;
import net.blay09.mods.balm.Balm;
import net.blay09.mods.balm.forge.platform.runtime.ForgeLoadContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(PlayerUpgrades.MOD_ID)
public class ForgePlayerUpgrades {

    public ForgePlayerUpgrades(FMLJavaModLoadingContext context) {
        final var loadContext = new ForgeLoadContext(context.getModBusGroup());
        Balm.initializeMod(PlayerUpgrades.MOD_ID, loadContext, PlayerUpgrades::initialize);
//        if (FMLEnvironment.dist.isClient()) {
//            BalmClient.initializeMod(PlayerUpgrades.MOD_ID, loadContext, PlayerUpgradesClient::initialize);
//        }
    }

}
