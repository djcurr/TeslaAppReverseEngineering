package com.google.firebase.perf.config;

/* loaded from: classes2.dex */
public final class j extends t<Boolean> {

    /* renamed from: a  reason: collision with root package name */
    private static j f16928a;

    protected j() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static synchronized j e() {
        j jVar;
        synchronized (j.class) {
            if (f16928a == null) {
                f16928a = new j();
            }
            jVar = f16928a;
        }
        return jVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.t
    public String a() {
        return "com.google.firebase.perf.SdkEnabled";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.t
    public String c() {
        return "fpr_enabled";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Boolean d() {
        return Boolean.TRUE;
    }
}