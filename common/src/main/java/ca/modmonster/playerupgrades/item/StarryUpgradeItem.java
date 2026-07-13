package ca.modmonster.playerupgrades.item;

import net.minecraft.core.Holder;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import org.jspecify.annotations.NonNull;

public class StarryUpgradeItem extends UpgradeItem {
    public StarryUpgradeItem(Properties properties, String id) {
        properties.rarity(Rarity.RARE);
        super(properties, id);
    }

    public StarryUpgradeItem(Properties properties, Holder<MobEffect> effect, int amplifier) {
        properties.rarity(Rarity.RARE);
        super(properties, effect, amplifier);
    }

    @Override
    public boolean isFoil(@NonNull ItemStack itemStack) {
        return true;
    }
}
