package l0;

import l0.d;
import l0.p;

/* loaded from: classes.dex */
public final class v<T, V extends p> implements d<T, V> {

    /* renamed from: a  reason: collision with root package name */
    private final i1<V> f36287a;

    /* renamed from: b  reason: collision with root package name */
    private final d1<T, V> f36288b;

    /* renamed from: c  reason: collision with root package name */
    private final T f36289c;

    /* renamed from: d  reason: collision with root package name */
    private final V f36290d;

    /* renamed from: e  reason: collision with root package name */
    private final V f36291e;

    /* renamed from: f  reason: collision with root package name */
    private final V f36292f;

    /* renamed from: g  reason: collision with root package name */
    private final T f36293g;

    /* renamed from: h  reason: collision with root package name */
    private final long f36294h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f36295i;

    public v(i1<V> animationSpec, d1<T, V> typeConverter, T t11, V initialVelocityVector) {
        float l11;
        kotlin.jvm.internal.s.g(animationSpec, "animationSpec");
        kotlin.jvm.internal.s.g(typeConverter, "typeConverter");
        kotlin.jvm.internal.s.g(initialVelocityVector, "initialVelocityVector");
        this.f36287a = animationSpec;
        this.f36288b = typeConverter;
        this.f36289c = t11;
        V invoke = e().a().invoke(t11);
        this.f36290d = invoke;
        this.f36291e = (V) q.b(initialVelocityVector);
        this.f36293g = e().b().invoke(animationSpec.d(invoke, initialVelocityVector));
        this.f36294h = animationSpec.e(invoke, initialVelocityVector);
        V v11 = (V) q.b(animationSpec.b(d(), invoke, initialVelocityVector));
        this.f36292f = v11;
        int b11 = v11.b();
        for (int i11 = 0; i11 < b11; i11++) {
            V v12 = this.f36292f;
            l11 = m00.l.l(v12.a(i11), -this.f36287a.a(), this.f36287a.a());
            v12.e(i11, l11);
        }
    }

    @Override // l0.d
    public boolean a() {
        return this.f36295i;
    }

    @Override // l0.d
    public V b(long j11) {
        if (!c(j11)) {
            return this.f36287a.b(j11, this.f36290d, this.f36291e);
        }
        return this.f36292f;
    }

    @Override // l0.d
    public boolean c(long j11) {
        return d.a.a(this, j11);
    }

    @Override // l0.d
    public long d() {
        return this.f36294h;
    }

    @Override // l0.d
    public d1<T, V> e() {
        return this.f36288b;
    }

    @Override // l0.d
    public T f(long j11) {
        if (!c(j11)) {
            return e().b().invoke(this.f36287a.c(j11, this.f36290d, this.f36291e));
        }
        return g();
    }

    @Override // l0.d
    public T g() {
        return this.f36293g;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public v(w<T> animationSpec, d1<T, V> typeConverter, T t11, V initialVelocityVector) {
        this(animationSpec.a(typeConverter), typeConverter, t11, initialVelocityVector);
        kotlin.jvm.internal.s.g(animationSpec, "animationSpec");
        kotlin.jvm.internal.s.g(typeConverter, "typeConverter");
        kotlin.jvm.internal.s.g(initialVelocityVector, "initialVelocityVector");
    }
}