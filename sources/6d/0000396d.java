package com.google.firebase.perf.config;

/* loaded from: classes2.dex */
public final class g extends t<Float> {

    /* renamed from: a  reason: collision with root package name */
    private static g f16925a;

    private g() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static synchronized g e() {
        g gVar;
        synchronized (g.class) {
            if (f16925a == null) {
                f16925a = new g();
            }
            gVar = f16925a;
        }
        return gVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.t
    public String a() {
        return "com.google.firebase.perf.NetworkRequestSamplingRate";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.t
    public String c() {
        return "fpr_vc_network_request_sampling_rate";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Float d() {
        return Float.valueOf(1.0f);
    }
}