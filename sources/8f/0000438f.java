package com.plaid.internal;

import com.plaid.internal.wa;
import java.util.Map;

/* loaded from: classes2.dex */
public final class d7 {
    public static final String a(Map<String, String> map, String key, String str) {
        kotlin.jvm.internal.s.g(map, "<this>");
        kotlin.jvm.internal.s.g(key, "key");
        kotlin.jvm.internal.s.g(str, "default");
        String str2 = map.get(key);
        if (str2 != null) {
            return str2;
        }
        wa.a.b(wa.f19678a, kotlin.jvm.internal.s.p("Missing field: ", key), false, 2);
        return str;
    }
}