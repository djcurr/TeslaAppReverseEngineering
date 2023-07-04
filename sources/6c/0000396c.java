package com.google.firebase.perf.config;

/* loaded from: classes2.dex */
public final class f extends t<Long> {

    /* renamed from: a  reason: collision with root package name */
    private static f f16924a;

    private f() {
    }

    public static synchronized f e() {
        f fVar;
        synchronized (f.class) {
            if (f16924a == null) {
                f16924a = new f();
            }
            fVar = f16924a;
        }
        return fVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.t
    public String a() {
        return "com.google.firebase.perf.NetworkEventCountForeground";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.t
    public String c() {
        return "fpr_rl_network_event_count_fg";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Long d() {
        return 700L;
    }
}