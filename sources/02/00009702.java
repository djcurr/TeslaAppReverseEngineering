package org.godotengine.godot.plugin;

import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.h;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;
import org.godotengine.godot.Godot;

/* loaded from: classes5.dex */
public final class GodotPluginRegistry {
    private static final String GODOT_ENABLED_PLUGINS_LABEL = "plugins";
    private static final String GODOT_PLUGIN_V1_NAME_PREFIX = "org.godotengine.plugin.v1.";
    private static final String PLUGIN_VALUE_SEPARATOR_REGEX = "\\|";
    private static final String TAG = "GodotPluginRegistry";
    private static GodotPluginRegistry instance;
    private final ConcurrentHashMap<String, GodotPlugin> registry = new ConcurrentHashMap<>();

    private GodotPluginRegistry(Godot godot) {
        loadPlugins(godot);
    }

    public static GodotPluginRegistry getPluginRegistry() {
        GodotPluginRegistry godotPluginRegistry = instance;
        if (godotPluginRegistry != null) {
            return godotPluginRegistry;
        }
        throw new IllegalStateException("Plugin registry hasn't been initialized.");
    }

    public static GodotPluginRegistry initializePluginRegistry(Godot godot) {
        if (instance == null) {
            instance = new GodotPluginRegistry(godot);
        }
        return instance;
    }

    private void loadPlugins(Godot godot) {
        HashSet hashSet;
        try {
            h activity = godot.getActivity();
            Bundle bundle = activity.getPackageManager().getApplicationInfo(activity.getPackageName(), 128).metaData;
            if (bundle != null && !bundle.isEmpty()) {
                if (bundle.containsKey(GODOT_ENABLED_PLUGINS_LABEL)) {
                    String[] split = bundle.getString(GODOT_ENABLED_PLUGINS_LABEL, "").split(PLUGIN_VALUE_SEPARATOR_REGEX);
                    if (split.length == 0) {
                        return;
                    }
                    hashSet = new HashSet();
                    for (String str : split) {
                        hashSet.add(str.trim());
                    }
                } else {
                    hashSet = null;
                }
                for (String str2 : bundle.keySet()) {
                    if (str2.startsWith(GODOT_PLUGIN_V1_NAME_PREFIX)) {
                        String trim = str2.substring(26).trim();
                        if (hashSet != null && !hashSet.contains(trim)) {
                            Log.w(TAG, "Plugin " + trim + " is listed in the dependencies but is not enabled.");
                        } else {
                            String str3 = TAG;
                            Log.i(str3, "Initializing Godot plugin " + trim);
                            String string = bundle.getString(str2);
                            if (TextUtils.isEmpty(string)) {
                                Log.w(str3, "Invalid plugin loader class for " + trim);
                            } else {
                                try {
                                    try {
                                        try {
                                            try {
                                                GodotPlugin godotPlugin = (GodotPlugin) Class.forName(string).getConstructor(Godot.class).newInstance(godot);
                                                if (!trim.equals(godotPlugin.getPluginName())) {
                                                    Log.w(str3, "Meta-data plugin name does not match the value returned by the plugin handle: " + trim + " =/= " + godotPlugin.getPluginName());
                                                }
                                                this.registry.put(trim, godotPlugin);
                                                Log.i(str3, "Completed initialization for Godot plugin " + godotPlugin.getPluginName());
                                            } catch (ClassNotFoundException e11) {
                                                Log.w(TAG, "Unable to load Godot plugin " + trim, e11);
                                            } catch (IllegalAccessException e12) {
                                                Log.w(TAG, "Unable to load Godot plugin " + trim, e12);
                                            }
                                        } catch (InstantiationException e13) {
                                            Log.w(TAG, "Unable to load Godot plugin " + trim, e13);
                                        }
                                    } catch (NoSuchMethodException e14) {
                                        Log.w(TAG, "Unable to load Godot plugin " + trim, e14);
                                    }
                                } catch (InvocationTargetException e15) {
                                    Log.w(TAG, "Unable to load Godot plugin " + trim, e15);
                                }
                            }
                        }
                    }
                }
            }
        } catch (PackageManager.NameNotFoundException e16) {
            Log.e(TAG, "Unable load Godot Android plugins from the manifest file.", e16);
        }
    }

    public Collection<GodotPlugin> getAllPlugins() {
        return this.registry.values();
    }

    public GodotPlugin getPlugin(String str) {
        return this.registry.get(str);
    }
}