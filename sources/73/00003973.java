package com.google.firebase.perf.config;

/* loaded from: classes2.dex */
public final class m extends t<Long> {

    /* renamed from: a  reason: collision with root package name */
    private static m f16931a;

    private m() {
    }

    public static synchronized m e() {
        m mVar;
        synchronized (m.class) {
            if (f16931a == null) {
                f16931a = new m();
            }
            mVar = f16931a;
        }
        return mVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.t
    public String a() {
        return "com.google.firebase.perf.SessionsMaxDurationMinutes";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.t
    public String b() {
        return "sessions_max_length_minutes";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.t
    public String c() {
        return "fpr_session_max_duration_min";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Long d() {
        return 240L;
    }
}