package expo.modules.apploader;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class AppLoaderProvider {
    private static Map<String, HeadlessAppLoader> loaders = new HashMap();

    /* loaded from: classes3.dex */
    public static abstract class Callback {
        public void onComplete(boolean z11, Exception exc) {
        }
    }

    private static void createLoader(String str, Context context) {
        try {
            Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
            String string = bundle.getString("org.unimodules.core.AppLoader#" + str);
            if (string != null) {
                loaders.put(str, (HeadlessAppLoader) Class.forName(string).getDeclaredConstructor(Context.class).newInstance(context));
                return;
            }
            throw new IllegalStateException("Unable to instantiate AppLoader!");
        } catch (PackageManager.NameNotFoundException e11) {
            throw new IllegalStateException("Unable to instantiate AppLoader!", e11);
        }
    }

    public static HeadlessAppLoader getLoader(String str, Context context) {
        if (!loaders.containsKey(str)) {
            try {
                createLoader(str, context);
            } catch (Exception e11) {
                Log.e("Expo", "Cannot initialize app loader. " + e11.getMessage());
                e11.printStackTrace();
                return null;
            }
        }
        return loaders.get(str);
    }
}