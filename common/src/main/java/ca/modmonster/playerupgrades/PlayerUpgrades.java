package ca.modmonster.playerupgrades;

import ca.modmonster.playerupgrades.item.ModItems;
import net.blay09.mods.balm.core.BalmRegistrars;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PlayerUpgrades {
    public static final Logger LOGGER = LoggerFactory.getLogger(PlayerUpgrades.class);
    public static final String MOD_ID = "playerupgrades";

    public static void initialize(BalmRegistrars registrars) {
        registrars.items(ModItems::initialize);
        registrars.creativeModeTabs(ModItems::initialize);
    }
}
