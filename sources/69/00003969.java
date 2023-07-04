package com.google.firebase.perf.config;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class d extends t<String> {

    /* renamed from: a  reason: collision with root package name */
    private static d f16921a;

    /* renamed from: b  reason: collision with root package name */
    private static final Map<Long, String> f16922b = Collections.unmodifiableMap(new a());

    /* loaded from: classes2.dex */
    class a extends HashMap<Long, String> {
        a() {
            put(461L, "FIREPERF_AUTOPUSH");
            put(462L, "FIREPERF");
            put(675L, "FIREPERF_INTERNAL_LOW");
            put(676L, "FIREPERF_INTERNAL_HIGH");
        }
    }

    private d() {
    }

    public static synchronized d e() {
        d dVar;
        synchronized (d.class) {
            if (f16921a == null) {
                f16921a = new d();
            }
            dVar = f16921a;
        }
        return dVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static String f(long j11) {
        return f16922b.get(Long.valueOf(j11));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static boolean g(long j11) {
        return f16922b.containsKey(Long.valueOf(j11));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.t
    public String a() {
        return "com.google.firebase.perf.LogSourceName";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.t
    public String c() {
        return "fpr_log_source";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String d() {
        return cn.a.f9284c;
    }
}