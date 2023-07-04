package com.mkuczera;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    static Map<String, b> f17916a;

    static {
        HashMap hashMap = new HashMap();
        f17916a = hashMap;
        hashMap.put("impactLight", new e(new long[]{0, 20}));
        f17916a.put("impactMedium", new e(new long[]{0, 40}));
        f17916a.put("impactHeavy", new e(new long[]{0, 60}));
        f17916a.put("notificationSuccess", new e(new long[]{0, 40, 60, 20}));
        f17916a.put("notificationWarning", new e(new long[]{0, 20, 60, 40}));
        f17916a.put("notificationError", new e(new long[]{0, 20, 40, 30, 40, 40}));
        f17916a.put("rigid", new e(new long[]{0, 30}));
        f17916a.put("soft", new e(new long[]{0, 10}));
        f17916a.put("clockTick", new f(4));
        f17916a.put("contextClick", new f(6));
        f17916a.put("keyboardPress", new f(3));
        f17916a.put("keyboardRelease", new f(7));
        f17916a.put("keyboardTap", new f(3));
        f17916a.put("longPress", new f(0));
        f17916a.put("textHandleMove", new f(9));
        f17916a.put("virtualKey", new f(1));
        f17916a.put("virtualKeyRelease", new f(8));
        f17916a.put("effectClick", new d(0));
        f17916a.put("effectDoubleClick", new d(1));
        f17916a.put("effectHeavyClick", new d(5));
        f17916a.put("effectTick", new d(2));
    }

    public static b a(String str) {
        return f17916a.get(str);
    }
}