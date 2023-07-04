package com.google.firebase.perf.config;

/* loaded from: classes2.dex */
public final class h extends t<Long> {

    /* renamed from: a  reason: collision with root package name */
    private static h f16926a;

    private h() {
    }

    public static synchronized h e() {
        h hVar;
        synchronized (h.class) {
            if (f16926a == null) {
                f16926a = new h();
            }
            hVar = f16926a;
        }
        return hVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.t
    public String a() {
        return "com.google.firebase.perf.TimeLimitSec";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.t
    public String c() {
        return "fpr_rl_time_limit_sec";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Long d() {
        return 600L;
    }
}