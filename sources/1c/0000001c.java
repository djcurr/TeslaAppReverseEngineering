package a0;

import ch.qos.logback.core.spi.AbstractComponentTracker;

/* loaded from: classes.dex */
final class h {

    /* renamed from: a  reason: collision with root package name */
    private final long f95a;

    /* renamed from: b  reason: collision with root package name */
    private final long f96b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(long j11, long j12) {
        this.f95a = j11;
        this.f96b = j12;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public long a() {
        return this.f96b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public long b() {
        return this.f95a;
    }

    public String toString() {
        return this.f95a + "/" + this.f96b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(double d11) {
        this((long) (d11 * 10000.0d), AbstractComponentTracker.LINGERING_TIMEOUT);
    }
}