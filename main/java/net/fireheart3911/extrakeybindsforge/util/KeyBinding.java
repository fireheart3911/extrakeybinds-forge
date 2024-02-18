package net.fireheart3911.extrakeybindsforge.util;

import com.mojang.blaze3d.platform.InputConstants;
import net.minecraft.client.KeyMapping;
import net.minecraftforge.client.settings.KeyConflictContext;
import io.github.apace100.origins.Origins;
import io.github.apace100.apoli.ApoliClient;
import io.github.apace100.origins.OriginsClient;
import org.lwjgl.glfw.GLFW;

public class KeyBinding {
    public static final String KEY_CATEGORY_EXTRAKEYBINDS = "key.category.extrakeybindsforge.extrakeybinds";
    public static final String KEY_TERTIARY = "key.origins.tertiary_active";
    public static final String KEY_QUATERNARY = "key.origins.quaternary_active";
    public static final String KEY_QUINARY = "key.origins.quinary_active";
    public static final String KEY_SENARY = "key.origins.senary_active";
    public static final String KEY_SEPTENARY = "key.origins.septenary_active";
    public static final String KEY_OCTENARY = "key.origins.octenary_active";
    public static final String KEY_NONARY = "key.origins.nonary_active";
    public static final String KEY_DENARY = "key.origins.denary_active";    

    public static final KeyMapping TERTIARY_KEY = new KeyMapping(KEY_TERTIARY, KeyConflictContext.IN_GAME,
            InputConstants.Type.KEYSYM, GLFW.GLFW_KEY_UNKNOWN, "category." + Origins.MODID);
    public static final KeyMapping QUATERNARY_KEY = new KeyMapping(KEY_QUATERNARY, KeyConflictContext.IN_GAME,
            InputConstants.Type.KEYSYM, GLFW.GLFW_KEY_UNKNOWN, "category." + Origins.MODID;
    public static final KeyMapping QUINARY_KEY = new KeyMapping(KEY_QUINARY, KeyConflictContext.IN_GAME,
            InputConstants.Type.KEYSYM, GLFW.GLFW_KEY_UNKNOWN, "category." + Origins.MODID);
    public static final KeyMapping SENARY_KEY = new KeyMapping(KEY_SENARY, KeyConflictContext.IN_GAME,
            InputConstants.Type.KEYSYM, GLFW.GLFW_KEY_UNKNOWN, "category." + Origins.MODID);
    public static final KeyMapping SEPTENARY_KEY = new KeyMapping(KEY_SEPTENARY, KeyConflictContext.IN_GAME,
            InputConstants.Type.KEYSYM, GLFW.GLFW_KEY_UNKNOWN, "category." + Origins.MODID);
    public static final KeyMapping OCTENARY_KEY = new KeyMapping(KEY_OCTENARY, KeyConflictContext.IN_GAME,
            InputConstants.Type.KEYSYM, GLFW.GLFW_KEY_UNKNOWN, "category." + Origins.MODID);
    public static final KeyMapping NONARY_KEY = new KeyMapping(KEY_NONARY, KeyConflictContext.IN_GAME,
            InputConstants.Type.KEYSYM, GLFW.GLFW_KEY_UNKNOWN, "category." + Origins.MODID);
    public static final KeyMapping DENARY_KEY = new KeyMapping(KEY_DENARY, KeyConflictContext.IN_GAME,
            InputConstants.Type.KEYSYM, GLFW.GLFW_KEY_UNKNOWN, "category." + Origins.MODID);
    
}
