package com.google.firebase.perf.config;

/* loaded from: classes2.dex */
public final class q extends t<Long> {

    /* renamed from: a  reason: collision with root package name */
    private static q f16935a;

    private q() {
    }

    public static synchronized q e() {
        q qVar;
        synchronized (q.class) {
            if (f16935a == null) {
                f16935a = new q();
            }
            qVar = f16935a;
        }
        return qVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.t
    public String a() {
        return "com.google.firebase.perf.TraceEventCountBackground";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.t
    public String c() {
        return "fpr_rl_trace_event_count_bg";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Long d() {
        return 30L;
    }
}