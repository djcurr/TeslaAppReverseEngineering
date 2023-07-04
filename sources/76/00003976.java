package com.google.firebase.perf.config;

/* loaded from: classes2.dex */
public final class p extends t<Float> {

    /* renamed from: a  reason: collision with root package name */
    private static p f16934a;

    private p() {
    }

    public static synchronized p e() {
        p pVar;
        synchronized (p.class) {
            if (f16934a == null) {
                f16934a = new p();
            }
            pVar = f16934a;
        }
        return pVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.t
    public String a() {
        return "com.google.firebase.perf.SessionSamplingRate";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.t
    public String b() {
        return "sessions_sampling_percentage";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.t
    public String c() {
        return "fpr_vc_session_sampling_rate";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Float d() {
        return Float.valueOf(0.01f);
    }
}