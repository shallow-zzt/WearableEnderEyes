package blue.amquora.wearableendereyes.item;

import com.google.common.collect.Multimap;
import de.dafuqs.additionalentityattributes.AdditionalEntityAttributes;
import dev.emi.trinkets.api.SlotAttributes;
import dev.emi.trinkets.api.SlotReference;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.item.ItemStack;
import net.puffish.attributesmod.AttributesMod;

import java.util.UUID;

public class EvilEyeNecklace extends EnderEyeNecklace {
    public EvilEyeNecklace(Settings settings) {
        super(settings);
    }

    @Override
    public Multimap<EntityAttribute, EntityAttributeModifier> getModifiers(ItemStack stack, SlotReference slot, LivingEntity entity, UUID uuid) {
        var modifiers = super.getModifiers(stack, slot, entity, uuid);
        modifiers.put(EntityAttributes.GENERIC_LUCK, new EntityAttributeModifier(uuid, "", 1, EntityAttributeModifier.Operation.ADDITION));
        modifiers.put(AttributesMod.MAGIC_RESISTANCE,new EntityAttributeModifier(uuid, "", 0.35, EntityAttributeModifier.Operation.MULTIPLY_TOTAL));
        modifiers.put(AttributesMod.HEALING,new EntityAttributeModifier(uuid, "", 0.25, EntityAttributeModifier.Operation.MULTIPLY_TOTAL));
        return modifiers;
    }
}
