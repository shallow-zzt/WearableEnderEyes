package blue.amquora.wearableendereyes.item;

import com.google.common.collect.Multimap;
import dev.emi.trinkets.api.SlotAttributes;
import dev.emi.trinkets.api.SlotReference;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.item.ItemStack;
import net.puffish.attributesmod.AttributesMod;

import java.util.UUID;

public class UndeadEyeNecklace extends EnderEyeNecklace {
    public UndeadEyeNecklace(Settings settings) {
        super(settings);
    }

    @Override
    public Multimap<EntityAttribute, EntityAttributeModifier> getModifiers(ItemStack stack, SlotReference slot, LivingEntity entity, UUID uuid) {
        var modifiers = super.getModifiers(stack, slot, entity, uuid);
        modifiers.put(EntityAttributes.GENERIC_MAX_HEALTH, new EntityAttributeModifier(uuid, "", 4, EntityAttributeModifier.Operation.ADDITION));
        modifiers.put(AttributesMod.RESISTANCE, new EntityAttributeModifier(uuid, "", 0.05, EntityAttributeModifier.Operation.MULTIPLY_TOTAL));
        modifiers.put(AttributesMod.ARMOR_SHRED, new EntityAttributeModifier(uuid, "", 0.25, EntityAttributeModifier.Operation.MULTIPLY_TOTAL));

        return modifiers;
    }
}
