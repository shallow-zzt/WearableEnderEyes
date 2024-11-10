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

public class RogueEyeNecklace extends EnderEyeNecklace {
    public RogueEyeNecklace(Settings settings) {
        super(settings);
    }

    @Override
    public Multimap<EntityAttribute, EntityAttributeModifier> getModifiers(ItemStack stack, SlotReference slot, LivingEntity entity, UUID uuid) {
        var modifiers = super.getModifiers(stack, slot, entity, uuid);
        modifiers.put(EntityAttributes.GENERIC_MAX_HEALTH, new EntityAttributeModifier(uuid, "", 6, EntityAttributeModifier.Operation.ADDITION));
        modifiers.put(AttributesMod.HEALING, new EntityAttributeModifier(uuid, "", 0.5, EntityAttributeModifier.Operation.MULTIPLY_TOTAL));
        modifiers.put(AttributesMod.JUMP, new EntityAttributeModifier(uuid, "", 0.5, EntityAttributeModifier.Operation.MULTIPLY_TOTAL));

        return modifiers;
    }
}
