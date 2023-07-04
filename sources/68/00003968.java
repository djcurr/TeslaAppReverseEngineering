package com.google.firebase.perf.config;

/* loaded from: classes2.dex */
public final class c extends t<Boolean> {

    /* renamed from: a  reason: collision with root package name */
    private static c f16920a;

    private c() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static synchronized c d() {
        c cVar;
        synchronized (c.class) {
            if (f16920a == null) {
                f16920a = new c();
            }
            cVar = f16920a;
        }
        return cVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.t
    public String a() {
        return "isEnabled";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.t
    public String b() {
        return "firebase_performance_collection_enabled";
    }
}