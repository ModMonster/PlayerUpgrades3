package ca.modmonster.playerupgrades.tag;

import ca.modmonster.playerupgrades.PlayerUpgrades;
import net.minecraft.core.registries.Registries;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class ModItemTags {
    public static final TagKey<Item> YOUR_TAG = TagKey.create(Registries.ITEM, PlayerUpgrades.id("your_tag"));
}
