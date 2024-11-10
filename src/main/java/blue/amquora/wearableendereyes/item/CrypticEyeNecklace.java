package blue.amquora.wearableendereyes.item;

import com.google.common.collect.Multimap;
import de.dafuqs.additionalentityattributes.AdditionalEntityAttributes;
import dev.emi.trinkets.api.SlotAttributes;
import dev.emi.trinkets.api.SlotReference;
import dev.emi.trinkets.api.TrinketItem;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.item.ItemStack;
import net.puffish.attributesmod.AttributesMod;

import java.util.UUID;

public class CrypticEyeNecklace extends EnderEyeNecklace {
    public CrypticEyeNecklace(Settings settings) {
        super(settings);
    }

    @Override
    public Multimap<EntityAttribute, EntityAttributeModifier> getModifiers(ItemStack stack, SlotReference slot, LivingEntity entity, UUID uuid) {
        var modifiers = super.getModifiers(stack, slot, entity, uuid);
        modifiers.put(AttributesMod.MAGIC_RESISTANCE, new EntityAttributeModifier(uuid, "", 0.25, EntityAttributeModifier.Operation.MULTIPLY_TOTAL));
        modifiers.put(AttributesMod.MAGIC_DAMAGE, new EntityAttributeModifier(uuid, "", 0.25, EntityAttributeModifier.Operation.MULTIPLY_TOTAL));
        modifiers.put(AdditionalEntityAttributes.DROPPED_EXPERIENCE, new EntityAttributeModifier(uuid, "", 0.35, EntityAttributeModifier.Operation.MULTIPLY_TOTAL));
        return modifiers;
    }
}
