package com.google.firebase.perf.config;

/* loaded from: classes2.dex */
public final class e extends t<Long> {

    /* renamed from: a  reason: collision with root package name */
    private static e f16923a;

    private e() {
    }

    public static synchronized e e() {
        e eVar;
        synchronized (e.class) {
            if (f16923a == null) {
                f16923a = new e();
            }
            eVar = f16923a;
        }
        return eVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.t
    public String a() {
        return "com.google.firebase.perf.NetworkEventCountBackground";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.t
    public String c() {
        return "fpr_rl_network_event_count_bg";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Long d() {
        return 70L;
    }
}