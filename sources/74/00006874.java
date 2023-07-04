package expo.modules.adapters.react.views;

import android.util.Log;
import android.view.View;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import expo.modules.adapters.react.ArgumentsHelper;
import expo.modules.core.ViewManager;
import java.util.HashMap;
import java.util.Map;
import yf.c;

/* loaded from: classes6.dex */
public class ViewManagerAdapterUtils {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static Map<String, Object> getConstants(ViewManager viewManager) {
        HashMap hashMap = new HashMap();
        hashMap.put("eventNames", viewManager.getExportedEventNames());
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Map<String, Object> getExportedCustomDirectEventTypeConstants(ViewManager viewManager) {
        c.b a11 = c.a();
        for (String str : viewManager.getExportedEventNames()) {
            if (str instanceof String) {
                a11.b(str, c.d("registrationName", str));
            }
        }
        return a11.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String getViewManagerAdapterName(ViewManager viewManager) {
        return "ViewManagerAdapter_" + viewManager.getName();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <V extends View> void setProxiedProperties(String str, ViewManager<V> viewManager, V v11, ReadableMap readableMap) {
        ViewManager<V>.PropSetterInfo propSetterInfo;
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            try {
                propSetterInfo = viewManager.getPropSetterInfos().get(nextKey);
            } catch (Exception e11) {
                Log.e(str, "Error when setting prop " + nextKey + ". " + e11.getMessage());
            }
            if (propSetterInfo != null) {
                viewManager.updateProp(v11, nextKey, ArgumentsHelper.getNativeArgumentForExpectedClass(readableMap.getDynamic(nextKey), propSetterInfo.getExpectedValueClass()));
            } else {
                throw new IllegalArgumentException("No setter found for prop " + nextKey + " in " + str);
                break;
            }
        }
    }
}