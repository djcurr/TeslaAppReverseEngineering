package l0;

import kotlin.jvm.internal.DefaultConstructorMarker;
import l0.d;
import l0.p;

/* loaded from: classes.dex */
public final class z0<T, V extends p> implements d<T, V> {

    /* renamed from: a  reason: collision with root package name */
    private final g1<V> f36325a;

    /* renamed from: b  reason: collision with root package name */
    private final d1<T, V> f36326b;

    /* renamed from: c  reason: collision with root package name */
    private final T f36327c;

    /* renamed from: d  reason: collision with root package name */
    private final T f36328d;

    /* renamed from: e  reason: collision with root package name */
    private final V f36329e;

    /* renamed from: f  reason: collision with root package name */
    private final V f36330f;

    /* renamed from: g  reason: collision with root package name */
    private final V f36331g;

    /* renamed from: h  reason: collision with root package name */
    private final long f36332h;

    /* renamed from: i  reason: collision with root package name */
    private final V f36333i;

    /* JADX WARN: Multi-variable type inference failed */
    public z0(g1<V> animationSpec, d1<T, V> typeConverter, T t11, T t12, V v11) {
        kotlin.jvm.internal.s.g(animationSpec, "animationSpec");
        kotlin.jvm.internal.s.g(typeConverter, "typeConverter");
        this.f36325a = animationSpec;
        this.f36326b = typeConverter;
        this.f36327c = t11;
        this.f36328d = t12;
        V invoke = e().a().invoke(t11);
        this.f36329e = invoke;
        V invoke2 = e().a().invoke(g());
        this.f36330f = invoke2;
        p b11 = v11 == null ? (V) null : q.b(v11);
        b11 = b11 == null ? (V) q.d(e().a().invoke(t11)) : b11;
        this.f36331g = (V) b11;
        this.f36332h = animationSpec.f(invoke, invoke2, b11);
        this.f36333i = (V) animationSpec.d(invoke, invoke2, b11);
    }

    @Override // l0.d
    public boolean a() {
        return this.f36325a.a();
    }

    @Override // l0.d
    public V b(long j11) {
        if (!c(j11)) {
            return this.f36325a.g(j11, this.f36329e, this.f36330f, this.f36331g);
        }
        return this.f36333i;
    }

    @Override // l0.d
    public boolean c(long j11) {
        return d.a.a(this, j11);
    }

    @Override // l0.d
    public long d() {
        return this.f36332h;
    }

    @Override // l0.d
    public d1<T, V> e() {
        return this.f36326b;
    }

    @Override // l0.d
    public T f(long j11) {
        if (!c(j11)) {
            return e().b().invoke(this.f36325a.b(j11, this.f36329e, this.f36330f, this.f36331g));
        }
        return g();
    }

    @Override // l0.d
    public T g() {
        return this.f36328d;
    }

    public final T h() {
        return this.f36327c;
    }

    public String toString() {
        return "TargetBasedAnimation: " + this.f36327c + " -> " + g() + ",initial velocity: " + this.f36331g + ", duration: " + f.b(this) + " ms";
    }

    public /* synthetic */ z0(i iVar, d1 d1Var, Object obj, Object obj2, p pVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(iVar, d1Var, obj, obj2, (i11 & 16) != 0 ? null : pVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public z0(i<T> animationSpec, d1<T, V> typeConverter, T t11, T t12, V v11) {
        this(animationSpec.a(typeConverter), typeConverter, t11, t12, v11);
        kotlin.jvm.internal.s.g(animationSpec, "animationSpec");
        kotlin.jvm.internal.s.g(typeConverter, "typeConverter");
    }
}