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

public class CursedEyeNecklace extends EnderEyeNecklace {
    public CursedEyeNecklace(Settings settings) {
        super(settings);
    }

    @Override
    public Multimap<EntityAttribute, EntityAttributeModifier> getModifiers(ItemStack stack, SlotReference slot, LivingEntity entity, UUID uuid) {
        var modifiers = super.getModifiers(stack, slot, entity, uuid);
        modifiers.put(AdditionalEntityAttributes.LAVA_SPEED, new EntityAttributeModifier(uuid, "", 0.25, EntityAttributeModifier.Operation.MULTIPLY_TOTAL));
        modifiers.put(AdditionalEntityAttributes.LAVA_VISIBILITY, new EntityAttributeModifier(uuid, "", 0.5, EntityAttributeModifier.Operation.MULTIPLY_TOTAL));
        modifiers.put(AdditionalEntityAttributes.BONUS_RARE_LOOT_ROLLS,new EntityAttributeModifier(uuid, "", 2, EntityAttributeModifier.Operation.ADDITION));
        return modifiers;
    }
}
