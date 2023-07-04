package l0;

import l0.p;

/* loaded from: classes.dex */
public final class h<T, V extends p> {

    /* renamed from: a  reason: collision with root package name */
    private final d1<T, V> f36142a;

    /* renamed from: b  reason: collision with root package name */
    private final T f36143b;

    /* renamed from: c  reason: collision with root package name */
    private final long f36144c;

    /* renamed from: d  reason: collision with root package name */
    private final h00.a<vz.b0> f36145d;

    /* renamed from: e  reason: collision with root package name */
    private final c1.o0 f36146e;

    /* renamed from: f  reason: collision with root package name */
    private V f36147f;

    /* renamed from: g  reason: collision with root package name */
    private long f36148g;

    /* renamed from: h  reason: collision with root package name */
    private long f36149h;

    /* renamed from: i  reason: collision with root package name */
    private final c1.o0 f36150i;

    public h(T t11, d1<T, V> typeConverter, V initialVelocityVector, long j11, T t12, long j12, boolean z11, h00.a<vz.b0> onCancel) {
        c1.o0 d11;
        c1.o0 d12;
        kotlin.jvm.internal.s.g(typeConverter, "typeConverter");
        kotlin.jvm.internal.s.g(initialVelocityVector, "initialVelocityVector");
        kotlin.jvm.internal.s.g(onCancel, "onCancel");
        this.f36142a = typeConverter;
        this.f36143b = t12;
        this.f36144c = j12;
        this.f36145d = onCancel;
        d11 = c1.s1.d(t11, null, 2, null);
        this.f36146e = d11;
        this.f36147f = (V) q.b(initialVelocityVector);
        this.f36148g = j11;
        this.f36149h = Long.MIN_VALUE;
        d12 = c1.s1.d(Boolean.valueOf(z11), null, 2, null);
        this.f36150i = d12;
    }

    public final void a() {
        k(false);
        this.f36145d.invoke();
    }

    public final long b() {
        return this.f36149h;
    }

    public final long c() {
        return this.f36148g;
    }

    public final long d() {
        return this.f36144c;
    }

    public final T e() {
        return this.f36146e.getValue();
    }

    public final T f() {
        return this.f36142a.b().invoke(this.f36147f);
    }

    public final V g() {
        return this.f36147f;
    }

    public final boolean h() {
        return ((Boolean) this.f36150i.getValue()).booleanValue();
    }

    public final void i(long j11) {
        this.f36149h = j11;
    }

    public final void j(long j11) {
        this.f36148g = j11;
    }

    public final void k(boolean z11) {
        this.f36150i.setValue(Boolean.valueOf(z11));
    }

    public final void l(T t11) {
        this.f36146e.setValue(t11);
    }

    public final void m(V v11) {
        kotlin.jvm.internal.s.g(v11, "<set-?>");
        this.f36147f = v11;
    }
}