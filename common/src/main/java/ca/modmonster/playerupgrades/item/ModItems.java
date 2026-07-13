package ca.modmonster.playerupgrades.item;

import ca.modmonster.playerupgrades.PlayerUpgrades;
import net.blay09.mods.balm.world.item.BalmCreativeModeTabRegistrar;
import net.blay09.mods.balm.world.item.BalmItemRegistrar;
import net.blay09.mods.balm.world.item.DeferredItem;
import net.minecraft.network.chat.Component;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;

public class ModItems {
    public static DeferredItem IRON_CASE;
    public static DeferredItem DIAMOND_CASE;
    public static DeferredItem STARRY_INGOT;
    public static DeferredItem STARRY_CASE;
    public static DeferredItem IRON_STRENGTH_UPGRADE;
    public static DeferredItem IRON_HASTE_UPGRADE;
    public static DeferredItem IRON_HEALTH_BOOST_UPGRADE;
    public static DeferredItem IRON_JUMP_BOOST_UPGRADE;
    public static DeferredItem IRON_SPEED_UPGRADE;
    public static DeferredItem DIAMOND_STRENGTH_UPGRADE;
    public static DeferredItem DIAMOND_HASTE_UPGRADE;
    public static DeferredItem DIAMOND_HEALTH_BOOST_UPGRADE;
    public static DeferredItem DIAMOND_JUMP_BOOST_UPGRADE;
    public static DeferredItem DIAMOND_SPEED_UPGRADE;
    public static DeferredItem FIRE_RESISTANCE_UPGRADE;
    public static DeferredItem WATER_BREATHING_UPGRADE;
    public static DeferredItem FLIGHT_UPGRADE;

    public static void initialize(BalmItemRegistrar items) {
        IRON_CASE = items.register("iron_case", Item::new).asDeferredItem();
        DIAMOND_CASE = items.register("diamond_case", Item::new).asDeferredItem();
        STARRY_INGOT = items.register("starry_ingot", GlowingItem::new).asDeferredItem();
        STARRY_CASE = items.register("starry_case", GlowingItem::new, properties -> properties.rarity(Rarity.RARE)).asDeferredItem();
        IRON_STRENGTH_UPGRADE = items.register("iron_strength_upgrade", properties -> new UpgradeItem(properties, MobEffects.STRENGTH, 0)).asDeferredItem();
        IRON_HASTE_UPGRADE = items.register("iron_haste_upgrade", properties -> new UpgradeItem(properties, MobEffects.HASTE, 0)).asDeferredItem();
        IRON_HEALTH_BOOST_UPGRADE = items.register("iron_health_boost_upgrade", properties -> new UpgradeItem(properties, MobEffects.HEALTH_BOOST, 0)).asDeferredItem();
        IRON_JUMP_BOOST_UPGRADE = items.register("iron_jump_boost_upgrade", properties -> new UpgradeItem(properties, MobEffects.JUMP_BOOST, 0)).asDeferredItem();
        IRON_SPEED_UPGRADE = items.register("iron_speed_upgrade", properties -> new UpgradeItem(properties, MobEffects.SPEED, 0)).asDeferredItem();
        DIAMOND_STRENGTH_UPGRADE = items.register("diamond_strength_upgrade", properties -> new UpgradeItem(properties, MobEffects.STRENGTH, 1)).asDeferredItem();
        DIAMOND_HASTE_UPGRADE = items.register("diamond_haste_upgrade", properties -> new UpgradeItem(properties, MobEffects.HASTE, 1)).asDeferredItem();
        DIAMOND_HEALTH_BOOST_UPGRADE = items.register("diamond_health_boost_upgrade", properties -> new UpgradeItem(properties, MobEffects.HEALTH_BOOST, 1)).asDeferredItem();
        DIAMOND_JUMP_BOOST_UPGRADE = items.register("diamond_jump_boost_upgrade", properties -> new UpgradeItem(properties, MobEffects.JUMP_BOOST, 1)).asDeferredItem();
        DIAMOND_SPEED_UPGRADE = items.register("diamond_speed_upgrade", properties -> new UpgradeItem(properties, MobEffects.SPEED, 1)).asDeferredItem();
        FIRE_RESISTANCE_UPGRADE = items.register("fire_resistance_upgrade", properties -> new StarryUpgradeItem(properties, MobEffects.FIRE_RESISTANCE, 0)).asDeferredItem();
        WATER_BREATHING_UPGRADE = items.register("water_breathing_upgrade", properties -> new StarryUpgradeItem(properties, MobEffects.WATER_BREATHING, 0)).asDeferredItem();
        FLIGHT_UPGRADE = items.register("flight_upgrade", properties -> new StarryUpgradeItem(properties, "flight")).asDeferredItem();
    }

    public static void initialize(BalmCreativeModeTabRegistrar creativeModeTabs) {
        creativeModeTabs.register(PlayerUpgrades.MOD_ID, builder ->
                builder.title(Component.translatable("itemGroup.playerupgrades"))
                        .icon(() -> ModItems.IRON_CASE.createStack())
                        .displayItems((displayParameters, output) -> {
                            output.accept(ModItems.STARRY_INGOT);
                            output.accept(ModItems.IRON_CASE);
                            output.accept(ModItems.DIAMOND_CASE);
                            output.accept(ModItems.STARRY_CASE);
                            output.accept(ModItems.IRON_STRENGTH_UPGRADE);
                            output.accept(ModItems.IRON_HASTE_UPGRADE);
                            output.accept(ModItems.IRON_HEALTH_BOOST_UPGRADE);
                            output.accept(ModItems.IRON_JUMP_BOOST_UPGRADE);
                            output.accept(ModItems.IRON_SPEED_UPGRADE);
                            output.accept(ModItems.DIAMOND_STRENGTH_UPGRADE);
                            output.accept(ModItems.DIAMOND_HASTE_UPGRADE);
                            output.accept(ModItems.DIAMOND_HEALTH_BOOST_UPGRADE);
                            output.accept(ModItems.DIAMOND_JUMP_BOOST_UPGRADE);
                            output.accept(ModItems.DIAMOND_SPEED_UPGRADE);
                            output.accept(ModItems.FIRE_RESISTANCE_UPGRADE);
                            output.accept(ModItems.WATER_BREATHING_UPGRADE);
                            output.accept(ModItems.FLIGHT_UPGRADE);
                        })
        );
    }
}
