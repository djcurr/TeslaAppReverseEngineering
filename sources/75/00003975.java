package com.google.firebase.perf.config;

/* loaded from: classes2.dex */
public final class o extends t<Long> {

    /* renamed from: a  reason: collision with root package name */
    private static o f16933a;

    private o() {
    }

    public static synchronized o e() {
        o oVar;
        synchronized (o.class) {
            if (f16933a == null) {
                f16933a = new o();
            }
            oVar = f16933a;
        }
        return oVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.t
    public String a() {
        return "com.google.firebase.perf.SessionsMemoryCaptureFrequencyForegroundMs";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.t
    public String b() {
        return "sessions_memory_capture_frequency_fg_ms";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.t
    public String c() {
        return "fpr_session_gauge_memory_capture_frequency_fg_ms";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Long d() {
        return 100L;
    }
}