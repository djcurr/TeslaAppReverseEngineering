package com.google.firebase.perf.config;

/* loaded from: classes2.dex */
public final class l extends t<Long> {

    /* renamed from: a  reason: collision with root package name */
    private static l f16930a;

    private l() {
    }

    public static synchronized l e() {
        l lVar;
        synchronized (l.class) {
            if (f16930a == null) {
                f16930a = new l();
            }
            lVar = f16930a;
        }
        return lVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.t
    public String a() {
        return "com.google.firebase.perf.SessionsCpuCaptureFrequencyForegroundMs";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.t
    public String b() {
        return "sessions_cpu_capture_frequency_fg_ms";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.t
    public String c() {
        return "fpr_session_gauge_cpu_capture_frequency_fg_ms";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Long d() {
        return 100L;
    }
}