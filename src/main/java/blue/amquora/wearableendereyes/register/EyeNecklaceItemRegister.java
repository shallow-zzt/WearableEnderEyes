package blue.amquora.wearableendereyes.register;

import blue.amquora.wearableendereyes.WearableEnderEyes;
import blue.amquora.wearableendereyes.item.*;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class EyeNecklaceItemRegister {

    public static Item ENDER_EYE_NECKLACE = register(new Identifier(WearableEnderEyes.MOD_ID, "ender_eye_necklace"), new VanillaEnderEyeNecklace(new Item.Settings().maxCount(1)));
    public static Item BLACK_EYE_NECKLACE = register(new Identifier(WearableEnderEyes.MOD_ID, "black_eye_necklace"), new BlackEyeNecklace(new Item.Settings().maxCount(1)));
    public static Item COLD_EYE_NECKLACE = register(new Identifier(WearableEnderEyes.MOD_ID, "cold_eye_necklace"), new ColdEyeNecklace(new Item.Settings().maxCount(1)));
    public static Item CORRUPTED_EYE_NECKLACE = register(new Identifier(WearableEnderEyes.MOD_ID, "corrupted_eye_necklace"), new CorruptedEyeNecklace(new Item.Settings().maxCount(1)));
    public static Item CRYPTIC_EYE_NECKLACE = register(new Identifier(WearableEnderEyes.MOD_ID, "cryptic_eye_necklace"), new CrypticEyeNecklace(new Item.Settings().maxCount(1)));
    public static Item CURSED_EYE_NECKLACE = register(new Identifier(WearableEnderEyes.MOD_ID, "cursed_eye_necklace"), new CursedEyeNecklace(new Item.Settings().maxCount(1)));
    public static Item EVIL_EYE_NECKLACE = register(new Identifier(WearableEnderEyes.MOD_ID, "evil_eye_necklace"), new EvilEyeNecklace(new Item.Settings().maxCount(1)));
    public static Item EXOTIC_EYE_NECKLACE = register(new Identifier(WearableEnderEyes.MOD_ID, "exotic_eye_necklace"), new ExoticEyeNecklace(new Item.Settings().maxCount(1)));
    public static Item GUARDIAN_EYE_NECKLACE = register(new Identifier(WearableEnderEyes.MOD_ID, "guardian_eye_necklace"), new GuardianEyeNecklace(new Item.Settings().maxCount(1)));
    public static Item LOST_EYE_NECKLACE = register(new Identifier(WearableEnderEyes.MOD_ID, "lost_eye_necklace"), new LostEyeNecklace(new Item.Settings().maxCount(1)));
    public static Item MAGICAL_EYE_NECKLACE = register(new Identifier(WearableEnderEyes.MOD_ID, "magical_eye_necklace"), new MagicalEyeNecklace(new Item.Settings().maxCount(1)));
    public static Item NETHER_EYE_NECKLACE = register(new Identifier(WearableEnderEyes.MOD_ID, "nether_eye_necklace"), new NetherEyeNecklace(new Item.Settings().maxCount(1)));
    public static Item OLD_EYE_NECKLACE = register(new Identifier(WearableEnderEyes.MOD_ID, "old_eye_necklace"), new OldEyeNecklace(new Item.Settings().maxCount(1)));
    public static Item ROUGE_EYE_NECKLACE = register(new Identifier(WearableEnderEyes.MOD_ID, "rogue_eye_necklace"), new RogueEyeNecklace(new Item.Settings().maxCount(1)));
    public static Item UNDEAD_EYE_NECKLACE = register(new Identifier(WearableEnderEyes.MOD_ID, "undead_eye_necklace"), new UndeadEyeNecklace(new Item.Settings().maxCount(1)));
    public static Item WITCH_EYE_NECKLACE = register(new Identifier(WearableEnderEyes.MOD_ID, "witch_eye_necklace"), new WitchEyeNecklace(new Item.Settings().maxCount(1)));
    public static Item WITHER_EYE_NECKLACE = register(new Identifier(WearableEnderEyes.MOD_ID, "wither_eye_necklace"), new WitherEyeNecklace(new Item.Settings().maxCount(1)));

    private static Item register(Identifier id, Item item) {
        return Registry.register(Registries.ITEM, id, item);
    }

    public static void init() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(ENDER_EYE_NECKLACE);
            if(FabricLoader.getInstance().isModLoaded("endrem")){
                entries.add(BLACK_EYE_NECKLACE);
                entries.add(COLD_EYE_NECKLACE);
                entries.add(CORRUPTED_EYE_NECKLACE);
                entries.add(CRYPTIC_EYE_NECKLACE);
                entries.add(CURSED_EYE_NECKLACE);
                entries.add(EVIL_EYE_NECKLACE);
                entries.add(EXOTIC_EYE_NECKLACE);
                entries.add(GUARDIAN_EYE_NECKLACE);
                entries.add(LOST_EYE_NECKLACE);
                entries.add(MAGICAL_EYE_NECKLACE);
                entries.add(NETHER_EYE_NECKLACE);
                entries.add(OLD_EYE_NECKLACE);
                entries.add(ROUGE_EYE_NECKLACE);
                entries.add(UNDEAD_EYE_NECKLACE);
                entries.add(WITCH_EYE_NECKLACE);
                entries.add(WITHER_EYE_NECKLACE);
            }
        });
    }
}
