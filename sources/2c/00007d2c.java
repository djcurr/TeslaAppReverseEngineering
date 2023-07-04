package k20;

import ch.qos.logback.classic.spi.CallerData;

/* loaded from: classes5.dex */
public final class r0 extends e {

    /* renamed from: e  reason: collision with root package name */
    private final w0 f34316e;

    /* renamed from: f  reason: collision with root package name */
    private final d20.h f34317f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(w0 originalTypeVariable, boolean z11, w0 constructor) {
        super(originalTypeVariable, z11);
        kotlin.jvm.internal.s.g(originalTypeVariable, "originalTypeVariable");
        kotlin.jvm.internal.s.g(constructor, "constructor");
        this.f34316e = constructor;
        this.f34317f = originalTypeVariable.l().i().m();
    }

    @Override // k20.d0
    public w0 H0() {
        return this.f34316e;
    }

    @Override // k20.e
    public e R0(boolean z11) {
        return new r0(Q0(), z11, H0());
    }

    @Override // k20.e, k20.d0
    public d20.h m() {
        return this.f34317f;
    }

    @Override // k20.k0
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Stub (BI): ");
        sb2.append(Q0());
        sb2.append(I0() ? CallerData.NA : "");
        return sb2.toString();
    }
}