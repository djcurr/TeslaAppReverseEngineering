package l0;

import l0.p;

/* loaded from: classes.dex */
public final class q1<V extends p> implements k1<V> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ l1<V> f36249a;

    private q1(float f11, float f12, r rVar) {
        this.f36249a = new l1<>(rVar);
    }

    @Override // l0.g1
    public boolean a() {
        return this.f36249a.a();
    }

    @Override // l0.g1
    public V b(long j11, V initialValue, V targetValue, V initialVelocity) {
        kotlin.jvm.internal.s.g(initialValue, "initialValue");
        kotlin.jvm.internal.s.g(targetValue, "targetValue");
        kotlin.jvm.internal.s.g(initialVelocity, "initialVelocity");
        return this.f36249a.b(j11, initialValue, targetValue, initialVelocity);
    }

    @Override // l0.g1
    public V d(V initialValue, V targetValue, V initialVelocity) {
        kotlin.jvm.internal.s.g(initialValue, "initialValue");
        kotlin.jvm.internal.s.g(targetValue, "targetValue");
        kotlin.jvm.internal.s.g(initialVelocity, "initialVelocity");
        return this.f36249a.d(initialValue, targetValue, initialVelocity);
    }

    @Override // l0.g1
    public long f(V initialValue, V targetValue, V initialVelocity) {
        kotlin.jvm.internal.s.g(initialValue, "initialValue");
        kotlin.jvm.internal.s.g(targetValue, "targetValue");
        kotlin.jvm.internal.s.g(initialVelocity, "initialVelocity");
        return this.f36249a.f(initialValue, targetValue, initialVelocity);
    }

    @Override // l0.g1
    public V g(long j11, V initialValue, V targetValue, V initialVelocity) {
        kotlin.jvm.internal.s.g(initialValue, "initialValue");
        kotlin.jvm.internal.s.g(targetValue, "targetValue");
        kotlin.jvm.internal.s.g(initialVelocity, "initialVelocity");
        return this.f36249a.g(j11, initialValue, targetValue, initialVelocity);
    }

    public q1(float f11, float f12, V v11) {
        this(f11, f12, h1.b(v11, f11, f12));
    }
}