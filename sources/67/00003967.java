package com.google.firebase.perf.config;

/* loaded from: classes2.dex */
public final class b extends t<Boolean> {

    /* renamed from: a  reason: collision with root package name */
    private static b f16919a;

    private b() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static synchronized b e() {
        b bVar;
        synchronized (b.class) {
            if (f16919a == null) {
                f16919a = new b();
            }
            bVar = f16919a;
        }
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.t
    public String b() {
        return "firebase_performance_collection_deactivated";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Boolean d() {
        return Boolean.FALSE;
    }
}