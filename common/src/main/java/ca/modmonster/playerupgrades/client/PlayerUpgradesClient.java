package ca.modmonster.playerupgrades.client;

import net.blay09.mods.balm.client.BalmClientRegistrars;

public class PlayerUpgradesClient {

    public static void initialize(BalmClientRegistrars registrars) {
        ModKeyMappings.initialize();
    }

}
