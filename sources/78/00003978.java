package com.google.firebase.perf.config;

/* loaded from: classes2.dex */
public final class r extends t<Long> {

    /* renamed from: a  reason: collision with root package name */
    private static r f16936a;

    private r() {
    }

    public static synchronized r e() {
        r rVar;
        synchronized (r.class) {
            if (f16936a == null) {
                f16936a = new r();
            }
            rVar = f16936a;
        }
        return rVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.t
    public String a() {
        return "com.google.firebase.perf.TraceEventCountForeground";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.t
    public String c() {
        return "fpr_rl_trace_event_count_fg";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Long d() {
        return 300L;
    }
}