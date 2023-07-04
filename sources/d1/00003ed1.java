package com.lugg.ReactNativeConfig;

import android.content.res.Resources;
import android.util.Log;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class ReactNativeConfigModule extends ReactContextBaseJavaModule {
    public ReactNativeConfigModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        String packageName;
        Field[] declaredFields;
        HashMap hashMap = new HashMap();
        try {
            ReactApplicationContext reactApplicationContext = getReactApplicationContext();
            try {
                packageName = reactApplicationContext.getString(reactApplicationContext.getResources().getIdentifier("build_config_package", "string", reactApplicationContext.getPackageName()));
            } catch (Resources.NotFoundException unused) {
                packageName = getReactApplicationContext().getApplicationContext().getPackageName();
            }
            for (Field field : Class.forName(packageName + ".BuildConfig").getDeclaredFields()) {
                try {
                    hashMap.put(field.getName(), field.get(null));
                } catch (IllegalAccessException unused2) {
                    Log.d("ReactNative", "ReactConfig: Could not access BuildConfig field " + field.getName());
                }
            }
        } catch (ClassNotFoundException unused3) {
            Log.d("ReactNative", "ReactConfig: Could not find BuildConfig class");
        }
        return hashMap;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "ReactNativeConfigModule";
    }
}