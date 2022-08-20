package net.fireheart3911.extrakeybindsforge.util;

import com.mojang.blaze3d.platform.InputConstants;
import net.minecraft.client.KeyMapping;
import net.minecraftforge.client.settings.KeyConflictContext;
import org.lwjgl.glfw.GLFW;

public class KeyBinding {
    public static final String KEY_CATEGORY_EXTRAKEYBINDS = "key.category.extrakeybindsforge.extrakeybinds";
    public static final String KEY_TERTIARY = "key.extrakeybindsforge.tertiary_active";
    public static final String KEY_QUATERNARY = "key.extrakeybindsforge.quaternary_active";
    public static final String KEY_QUINARY = "key.extrakeybindsforge.quinary_active";
    public static final String KEY_SENARY = "key.extrakeybindsforge.senary_active";
    public static final String KEY_SEPTENARY = "key.extrakeybindsforge.septenary_active";
    public static final String KEY_OCTENARY = "key.extrakeybindsforge.octenary_active";
    public static final String KEY_NONARY = "key.extrakeybindsforge.nonary_active";

    public static final KeyMapping TERTIARY_KEY = new KeyMapping(KEY_TERTIARY, KeyConflictContext.IN_GAME,
            InputConstants.Type.KEYSYM, GLFW.GLFW_KEY_UNKNOWN, KEY_CATEGORY_EXTRAKEYBINDS);
    public static final KeyMapping QUATERNARY_KEY = new KeyMapping(KEY_QUATERNARY, KeyConflictContext.IN_GAME,
            InputConstants.Type.KEYSYM, GLFW.GLFW_KEY_UNKNOWN, KEY_CATEGORY_EXTRAKEYBINDS);
    public static final KeyMapping QUINARY_KEY = new KeyMapping(KEY_QUINARY, KeyConflictContext.IN_GAME,
            InputConstants.Type.KEYSYM, GLFW.GLFW_KEY_UNKNOWN, KEY_CATEGORY_EXTRAKEYBINDS);
    public static final KeyMapping SENARY_KEY = new KeyMapping(KEY_SENARY, KeyConflictContext.IN_GAME,
            InputConstants.Type.KEYSYM, GLFW.GLFW_KEY_UNKNOWN, KEY_CATEGORY_EXTRAKEYBINDS);
    public static final KeyMapping SEPTENARY_KEY = new KeyMapping(KEY_SEPTENARY, KeyConflictContext.IN_GAME,
            InputConstants.Type.KEYSYM, GLFW.GLFW_KEY_UNKNOWN, KEY_CATEGORY_EXTRAKEYBINDS);
    public static final KeyMapping OCTENARY_KEY = new KeyMapping(KEY_OCTENARY, KeyConflictContext.IN_GAME,
            InputConstants.Type.KEYSYM, GLFW.GLFW_KEY_UNKNOWN, KEY_CATEGORY_EXTRAKEYBINDS);
    public static final KeyMapping NONARY_KEY = new KeyMapping(KEY_NONARY, KeyConflictContext.IN_GAME,
            InputConstants.Type.KEYSYM, GLFW.GLFW_KEY_UNKNOWN, KEY_CATEGORY_EXTRAKEYBINDS);

}
