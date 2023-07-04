package com.wix.reactnativenotifications;

import android.os.Bundle;
import java.util.List;

/* loaded from: classes6.dex */
public class a {
    public static Bundle a(Bundle bundle) {
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj != null && !obj.getClass().isArray() && !(obj instanceof String) && !(obj instanceof Number) && !(obj instanceof Boolean) && !(obj instanceof Bundle) && !(obj instanceof List)) {
                bundle.remove(str);
            }
        }
        return bundle;
    }
}