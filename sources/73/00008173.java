package l0;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class i0<T> implements i<T> {

    /* renamed from: d  reason: collision with root package name */
    public static final int f36160d = 8;

    /* renamed from: a  reason: collision with root package name */
    private final z<T> f36161a;

    /* renamed from: b  reason: collision with root package name */
    private final q0 f36162b;

    /* renamed from: c  reason: collision with root package name */
    private final long f36163c;

    private i0(z<T> zVar, q0 q0Var, long j11) {
        this.f36161a = zVar;
        this.f36162b = q0Var;
        this.f36163c = j11;
    }

    public /* synthetic */ i0(z zVar, q0 q0Var, long j11, DefaultConstructorMarker defaultConstructorMarker) {
        this(zVar, q0Var, j11);
    }

    @Override // l0.i
    public <V extends p> g1<V> a(d1<T, V> converter) {
        kotlin.jvm.internal.s.g(converter, "converter");
        return new n1(this.f36161a.a((d1) converter), this.f36162b, f(), null);
    }

    public boolean equals(Object obj) {
        if (obj instanceof i0) {
            i0 i0Var = (i0) obj;
            return kotlin.jvm.internal.s.c(i0Var.f36161a, this.f36161a) && i0Var.f36162b == this.f36162b && w0.d(i0Var.f(), f());
        }
        return false;
    }

    public final long f() {
        return this.f36163c;
    }

    public int hashCode() {
        return (((this.f36161a.hashCode() * 31) + this.f36162b.hashCode()) * 31) + w0.e(f());
    }
}