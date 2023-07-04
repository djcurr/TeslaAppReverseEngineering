package l0;

import l0.j1;
import l0.p;

/* loaded from: classes.dex */
public final class r1<V extends p> implements j1<V> {

    /* renamed from: a  reason: collision with root package name */
    private final int f36251a;

    /* renamed from: b  reason: collision with root package name */
    private final int f36252b;

    /* renamed from: c  reason: collision with root package name */
    private final a0 f36253c;

    /* renamed from: d  reason: collision with root package name */
    private final l1<V> f36254d;

    public r1(int i11, int i12, a0 easing) {
        kotlin.jvm.internal.s.g(easing, "easing");
        this.f36251a = i11;
        this.f36252b = i12;
        this.f36253c = easing;
        this.f36254d = new l1<>(new g0(e(), c(), easing));
    }

    @Override // l0.g1
    public boolean a() {
        return j1.a.c(this);
    }

    @Override // l0.g1
    public V b(long j11, V initialValue, V targetValue, V initialVelocity) {
        kotlin.jvm.internal.s.g(initialValue, "initialValue");
        kotlin.jvm.internal.s.g(targetValue, "targetValue");
        kotlin.jvm.internal.s.g(initialVelocity, "initialVelocity");
        return this.f36254d.b(j11, initialValue, targetValue, initialVelocity);
    }

    @Override // l0.j1
    public int c() {
        return this.f36252b;
    }

    @Override // l0.g1
    public V d(V v11, V v12, V v13) {
        return (V) j1.a.b(this, v11, v12, v13);
    }

    @Override // l0.j1
    public int e() {
        return this.f36251a;
    }

    @Override // l0.g1
    public long f(V v11, V v12, V v13) {
        return j1.a.a(this, v11, v12, v13);
    }

    @Override // l0.g1
    public V g(long j11, V initialValue, V targetValue, V initialVelocity) {
        kotlin.jvm.internal.s.g(initialValue, "initialValue");
        kotlin.jvm.internal.s.g(targetValue, "targetValue");
        kotlin.jvm.internal.s.g(initialVelocity, "initialVelocity");
        return this.f36254d.g(j11, initialValue, targetValue, initialVelocity);
    }
}