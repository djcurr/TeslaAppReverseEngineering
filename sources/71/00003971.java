package com.google.firebase.perf.config;

/* loaded from: classes2.dex */
public final class k extends t<Long> {

    /* renamed from: a  reason: collision with root package name */
    private static k f16929a;

    private k() {
    }

    public static synchronized k e() {
        k kVar;
        synchronized (k.class) {
            if (f16929a == null) {
                f16929a = new k();
            }
            kVar = f16929a;
        }
        return kVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.t
    public String a() {
        return "com.google.firebase.perf.SessionsCpuCaptureFrequencyBackgroundMs";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.t
    public String b() {
        return "sessions_cpu_capture_frequency_bg_ms";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.t
    public String c() {
        return "fpr_session_gauge_cpu_capture_frequency_bg_ms";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Long d() {
        return 0L;
    }
}