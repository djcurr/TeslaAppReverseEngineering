package hn;

import com.google.firebase.perf.v1.GaugeMetric;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class b extends e {

    /* renamed from: a  reason: collision with root package name */
    private final GaugeMetric f29345a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(GaugeMetric gaugeMetric) {
        this.f29345a = gaugeMetric;
    }

    @Override // hn.e
    public boolean c() {
        return this.f29345a.hasSessionId() && (this.f29345a.getCpuMetricReadingsCount() > 0 || this.f29345a.getAndroidMemoryReadingsCount() > 0 || (this.f29345a.hasGaugeMetadata() && this.f29345a.getGaugeMetadata().hasMaxAppJavaHeapMemoryKb()));
    }
}