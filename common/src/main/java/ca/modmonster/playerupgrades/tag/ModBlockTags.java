package ca.modmonster.playerupgrades.tag;

import ca.modmonster.playerupgrades.PlayerUpgrades;
import net.minecraft.core.registries.Registries;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class ModBlockTags {
    public static final TagKey<Block> YOUR_TAG = TagKey.create(Registries.BLOCK, PlayerUpgrades.id("your_tag"));
}
