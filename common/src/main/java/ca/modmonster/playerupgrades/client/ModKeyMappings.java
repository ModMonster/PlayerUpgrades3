package ca.modmonster.playerupgrades.client;

import ca.modmonster.playerupgrades.PlayerUpgrades;
import com.mojang.blaze3d.platform.InputConstants;
import net.blay09.mods.kuma.api.InputBinding;
import net.blay09.mods.kuma.api.Kuma;
import net.blay09.mods.kuma.api.ManagedKeyMapping;

public class ModKeyMappings {

    public static ManagedKeyMapping yourKey;

    public static void initialize() {
        yourKey = Kuma.createKeyMapping(PlayerUpgrades.id("your_key"))
                .withDefault(InputBinding.key(InputConstants.KEY_B))
                .handleScreenInput(event -> {
                    PlayerUpgrades.LOGGER.info("B was pressed - " + PlayerUpgrades.MOD_ID);
                    return true;
                })
                .build();
    }
}
