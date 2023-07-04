package l0;

import c1.v1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l0.p;

/* loaded from: classes.dex */
public final class k<T, V extends p> implements v1<T> {

    /* renamed from: a  reason: collision with root package name */
    private final d1<T, V> f36183a;

    /* renamed from: b  reason: collision with root package name */
    private final c1.o0 f36184b;

    /* renamed from: c  reason: collision with root package name */
    private V f36185c;

    /* renamed from: d  reason: collision with root package name */
    private long f36186d;

    /* renamed from: e  reason: collision with root package name */
    private long f36187e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f36188f;

    public k(d1<T, V> typeConverter, T t11, V v11, long j11, long j12, boolean z11) {
        c1.o0 d11;
        kotlin.jvm.internal.s.g(typeConverter, "typeConverter");
        this.f36183a = typeConverter;
        d11 = c1.s1.d(t11, null, 2, null);
        this.f36184b = d11;
        V v12 = v11 != null ? (V) q.b(v11) : null;
        this.f36185c = v12 == null ? (V) l.e(typeConverter, t11) : v12;
        this.f36186d = j11;
        this.f36187e = j12;
        this.f36188f = z11;
    }

    public final long b() {
        return this.f36187e;
    }

    public final long c() {
        return this.f36186d;
    }

    public final d1<T, V> e() {
        return this.f36183a;
    }

    public final V g() {
        return this.f36185c;
    }

    @Override // c1.v1
    public T getValue() {
        return this.f36184b.getValue();
    }

    public final boolean h() {
        return this.f36188f;
    }

    public final void i(long j11) {
        this.f36187e = j11;
    }

    public final void j(long j11) {
        this.f36186d = j11;
    }

    public final void k(boolean z11) {
        this.f36188f = z11;
    }

    public void l(T t11) {
        this.f36184b.setValue(t11);
    }

    public final void m(V v11) {
        kotlin.jvm.internal.s.g(v11, "<set-?>");
        this.f36185c = v11;
    }

    public /* synthetic */ k(d1 d1Var, Object obj, p pVar, long j11, long j12, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(d1Var, obj, (i11 & 4) != 0 ? null : pVar, (i11 & 8) != 0 ? Long.MIN_VALUE : j11, (i11 & 16) != 0 ? Long.MIN_VALUE : j12, (i11 & 32) != 0 ? false : z11);
    }
}