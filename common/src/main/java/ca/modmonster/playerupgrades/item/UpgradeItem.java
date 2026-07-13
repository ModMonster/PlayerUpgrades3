package ca.modmonster.playerupgrades.item;

import net.minecraft.ChatFormatting;
import net.minecraft.core.Holder;
import net.minecraft.core.component.DataComponents;
import net.minecraft.network.chat.Component;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.alchemy.PotionContents;
import net.minecraft.world.item.component.ItemLore;

import java.util.List;
import java.util.Optional;

public class UpgradeItem extends Item {
    public UpgradeItem(Properties properties, String id) {
        // Add potion lore that is missing for custom upgrades
        List<Component> loreLines = List.of(
                Component.translatable("effect.playerupgrades." + id)
                        .withStyle(style -> style.withColor(ChatFormatting.BLUE).withItalic(false))
        );
        properties.component(DataComponents.LORE, new ItemLore(loreLines));
        super(properties);
    }

    public UpgradeItem(Properties properties, Holder<MobEffect> effect, int amplifier) {
        properties.component(DataComponents.POTION_CONTENTS, new PotionContents(
                Optional.empty(),
                Optional.empty(),
                List.of(new MobEffectInstance(effect, 0, amplifier)),
                Optional.empty()
        ));
        super(properties);
    }
}
