package com.google.firebase.perf.config;

/* loaded from: classes2.dex */
public final class s extends t<Float> {

    /* renamed from: a  reason: collision with root package name */
    private static s f16937a;

    private s() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static synchronized s e() {
        s sVar;
        synchronized (s.class) {
            if (f16937a == null) {
                f16937a = new s();
            }
            sVar = f16937a;
        }
        return sVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.t
    public String a() {
        return "com.google.firebase.perf.TraceSamplingRate";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.t
    public String c() {
        return "fpr_vc_trace_sampling_rate";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Float d() {
        return Float.valueOf(1.0f);
    }
}