package com.google.firebase.perf.metrics;

import com.google.firebase.perf.v1.PerfSession;
import com.google.firebase.perf.v1.TraceMetric;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private final Trace f16976a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(Trace trace) {
        this.f16976a = trace;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public TraceMetric a() {
        TraceMetric.b j11 = TraceMetric.newBuilder().k(this.f16976a.f()).i(this.f16976a.h().d()).j(this.f16976a.h().c(this.f16976a.e()));
        for (a aVar : this.f16976a.d().values()) {
            j11.h(aVar.b(), aVar.a());
        }
        List<Trace> i11 = this.f16976a.i();
        if (!i11.isEmpty()) {
            for (Trace trace : i11) {
                j11.e(new b(trace).a());
            }
        }
        j11.g(this.f16976a.getAttributes());
        PerfSession[] b11 = jn.a.b(this.f16976a.g());
        if (b11 != null) {
            j11.b(Arrays.asList(b11));
        }
        return j11.build();
    }
}