package com.google.firebase.perf.config;

/* loaded from: classes2.dex */
public final class i extends t<String> {

    /* renamed from: a  reason: collision with root package name */
    private static i f16927a;

    protected i() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static synchronized i e() {
        i iVar;
        synchronized (i.class) {
            if (f16927a == null) {
                f16927a = new i();
            }
            iVar = f16927a;
        }
        return iVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.t
    public String a() {
        return "com.google.firebase.perf.SdkDisabledVersions";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.t
    public String c() {
        return "fpr_disabled_android_versions";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String d() {
        return "";
    }
}