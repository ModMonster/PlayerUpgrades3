package ca.modmonster.playerupgrades.block;

import net.blay09.mods.balm.world.level.block.BalmBlockRegistrar;
import net.blay09.mods.balm.world.level.block.DeferredBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;

public class ModBlocks {
    public static DeferredBlock UPGRADER;
//    public static Holder<BlockEntityType<UpgraderBlockEntity>> UPGRADER_BLOCK_ENTITY;

    public static void initialize(BalmBlockRegistrar blocks) {
        UPGRADER = blocks.register("upgrader", Block::new, properties ->
                properties.sound(SoundType.METAL)
                        .strength(5f, 21f)
                        .requiresCorrectToolForDrops()).withDefaultItem().asDeferredBlock();
    }

//    public static void initialize(BalmBlockEntityTypeRegistrar blockEntities) {
//        UPGRADER_BLOCK_ENTITY = blockEntities.register("upgrader", UpgraderBlockEntity::new, ModBlocks.UPGRADER).asHolder();
//    }
}
