package com.facebook.react.uimanager;

import java.util.Locale;

/* loaded from: classes3.dex */
public enum q {
    NONE,
    BOX_NONE,
    BOX_ONLY,
    AUTO;

    public static boolean canBeTouchTarget(q qVar) {
        return qVar == AUTO || qVar == BOX_ONLY;
    }

    public static boolean canChildrenBeTouchTarget(q qVar) {
        return qVar == AUTO || qVar == BOX_NONE;
    }

    public static q parsePointerEvents(String str) {
        if (str == null) {
            return AUTO;
        }
        return valueOf(str.toUpperCase(Locale.US).replace("-", "_"));
    }
}