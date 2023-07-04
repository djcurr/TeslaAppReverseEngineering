package l0;

import l0.j1;
import l0.p;

/* loaded from: classes.dex */
public final class p1<V extends p> implements j1<V> {

    /* renamed from: a  reason: collision with root package name */
    private final int f36248a;

    public p1(int i11) {
        this.f36248a = i11;
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
        return j11 < ((long) c()) * 1000000 ? initialValue : targetValue;
    }

    @Override // l0.j1
    public int c() {
        return this.f36248a;
    }

    @Override // l0.g1
    public V d(V v11, V v12, V v13) {
        return (V) j1.a.b(this, v11, v12, v13);
    }

    @Override // l0.j1
    public int e() {
        return 0;
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
        return initialVelocity;
    }
}