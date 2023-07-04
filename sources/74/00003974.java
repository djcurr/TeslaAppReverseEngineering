package com.google.firebase.perf.config;

/* loaded from: classes2.dex */
public final class n extends t<Long> {

    /* renamed from: a  reason: collision with root package name */
    private static n f16932a;

    private n() {
    }

    public static synchronized n e() {
        n nVar;
        synchronized (n.class) {
            if (f16932a == null) {
                f16932a = new n();
            }
            nVar = f16932a;
        }
        return nVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.t
    public String a() {
        return "com.google.firebase.perf.SessionsMemoryCaptureFrequencyBackgroundMs";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.t
    public String b() {
        return "sessions_memory_capture_frequency_bg_ms";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.t
    public String c() {
        return "fpr_session_gauge_memory_capture_frequency_bg_ms";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Long d() {
        return 0L;
    }
}