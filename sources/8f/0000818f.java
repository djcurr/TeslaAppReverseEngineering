package l0;

import kotlin.jvm.internal.DefaultConstructorMarker;
import l0.g1;
import l0.p;

/* loaded from: classes.dex */
public final class n1<V extends p> implements g1<V> {

    /* renamed from: a  reason: collision with root package name */
    private final j1<V> f36222a;

    /* renamed from: b  reason: collision with root package name */
    private final q0 f36223b;

    /* renamed from: c  reason: collision with root package name */
    private final long f36224c;

    /* renamed from: d  reason: collision with root package name */
    private final long f36225d;

    private n1(j1<V> j1Var, q0 q0Var, long j11) {
        this.f36222a = j1Var;
        this.f36223b = q0Var;
        this.f36224c = (j1Var.c() + j1Var.e()) * 1000000;
        this.f36225d = j11 * 1000000;
    }

    public /* synthetic */ n1(j1 j1Var, q0 q0Var, long j11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j1Var, q0Var, j11);
    }

    private final long h(long j11) {
        long j12 = this.f36225d;
        if (j11 + j12 <= 0) {
            return 0L;
        }
        long j13 = j11 + j12;
        long j14 = this.f36224c;
        long j15 = j13 / j14;
        return (this.f36223b == q0.Restart || j15 % ((long) 2) == 0) ? j13 - (j15 * j14) : ((j15 + 1) * j14) - j13;
    }

    private final V i(long j11, V v11, V v12, V v13) {
        long j12 = this.f36225d;
        long j13 = this.f36224c;
        return j11 + j12 > j13 ? g(j13 - j12, v11, v12, v13) : v12;
    }

    @Override // l0.g1
    public boolean a() {
        return true;
    }

    @Override // l0.g1
    public V b(long j11, V initialValue, V targetValue, V initialVelocity) {
        kotlin.jvm.internal.s.g(initialValue, "initialValue");
        kotlin.jvm.internal.s.g(targetValue, "targetValue");
        kotlin.jvm.internal.s.g(initialVelocity, "initialVelocity");
        return this.f36222a.b(h(j11), initialValue, targetValue, i(j11, initialValue, initialVelocity, targetValue));
    }

    @Override // l0.g1
    public V d(V v11, V v12, V v13) {
        return (V) g1.a.a(this, v11, v12, v13);
    }

    @Override // l0.g1
    public long f(V initialValue, V targetValue, V initialVelocity) {
        kotlin.jvm.internal.s.g(initialValue, "initialValue");
        kotlin.jvm.internal.s.g(targetValue, "targetValue");
        kotlin.jvm.internal.s.g(initialVelocity, "initialVelocity");
        return Long.MAX_VALUE;
    }

    @Override // l0.g1
    public V g(long j11, V initialValue, V targetValue, V initialVelocity) {
        kotlin.jvm.internal.s.g(initialValue, "initialValue");
        kotlin.jvm.internal.s.g(targetValue, "targetValue");
        kotlin.jvm.internal.s.g(initialVelocity, "initialVelocity");
        return this.f36222a.g(h(j11), initialValue, targetValue, i(j11, initialValue, initialVelocity, targetValue));
    }
}