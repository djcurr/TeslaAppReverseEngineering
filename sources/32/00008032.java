package kotlinx.coroutines.scheduling;

import java.util.concurrent.Executor;
import v20.q1;

/* loaded from: classes5.dex */
public class f extends q1 {

    /* renamed from: b  reason: collision with root package name */
    private final int f35555b;

    /* renamed from: c  reason: collision with root package name */
    private final int f35556c;

    /* renamed from: d  reason: collision with root package name */
    private final long f35557d;

    /* renamed from: e  reason: collision with root package name */
    private final String f35558e;

    /* renamed from: f  reason: collision with root package name */
    private a f35559f = S0();

    public f(int i11, int i12, long j11, String str) {
        this.f35555b = i11;
        this.f35556c = i12;
        this.f35557d = j11;
        this.f35558e = str;
    }

    private final a S0() {
        return new a(this.f35555b, this.f35556c, this.f35557d, this.f35558e);
    }

    @Override // v20.j0
    public void I0(zz.g gVar, Runnable runnable) {
        a.p(this.f35559f, runnable, null, false, 6, null);
    }

    @Override // v20.j0
    public void J0(zz.g gVar, Runnable runnable) {
        a.p(this.f35559f, runnable, null, true, 2, null);
    }

    @Override // v20.q1
    public Executor R0() {
        return this.f35559f;
    }

    public final void X0(Runnable runnable, i iVar, boolean z11) {
        this.f35559f.m(runnable, iVar, z11);
    }
}