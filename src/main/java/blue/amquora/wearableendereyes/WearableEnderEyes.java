package blue.amquora.wearableendereyes;

import blue.amquora.wearableendereyes.register.EyeNecklaceItemRegister;
import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;

public class WearableEnderEyes implements ModInitializer {
    public static final String MOD_ID = "wearableendereyes";


    @Override
    public void onInitialize() {
        EyeNecklaceItemRegister.init();
    }

}
