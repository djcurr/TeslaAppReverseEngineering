package s0;

import c1.o0;
import c1.s1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l0.f1;

/* loaded from: classes.dex */
final class z {

    /* renamed from: a  reason: collision with root package name */
    private int f49938a;

    /* renamed from: b  reason: collision with root package name */
    private final l0.a<x2.k, l0.n> f49939b;

    /* renamed from: c  reason: collision with root package name */
    private long f49940c;

    /* renamed from: d  reason: collision with root package name */
    private final o0 f49941d;

    private z(long j11, int i11) {
        o0 d11;
        this.f49938a = i11;
        this.f49939b = new l0.a<>(x2.k.b(j11), f1.i(x2.k.f56947b), null, 4, null);
        this.f49940c = j11;
        d11 = s1.d(Boolean.FALSE, null, 2, null);
        this.f49941d = d11;
    }

    public /* synthetic */ z(long j11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, i11);
    }

    public final l0.a<x2.k, l0.n> a() {
        return this.f49939b;
    }

    public final boolean b() {
        return ((Boolean) this.f49941d.getValue()).booleanValue();
    }

    public final int c() {
        return this.f49938a;
    }

    public final long d() {
        return this.f49940c;
    }

    public final void e(boolean z11) {
        this.f49941d.setValue(Boolean.valueOf(z11));
    }

    public final void f(int i11) {
        this.f49938a = i11;
    }

    public final void g(long j11) {
        this.f49940c = j11;
    }
}