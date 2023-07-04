package l0;

import java.util.Map;
import l0.j1;
import l0.p;

/* loaded from: classes.dex */
public final class o1<V extends p> implements j1<V> {

    /* renamed from: a  reason: collision with root package name */
    private final Map<Integer, vz.p<V, a0>> f36231a;

    /* renamed from: b  reason: collision with root package name */
    private final int f36232b;

    /* renamed from: c  reason: collision with root package name */
    private final int f36233c;

    /* renamed from: d  reason: collision with root package name */
    private V f36234d;

    /* renamed from: e  reason: collision with root package name */
    private V f36235e;

    /* JADX WARN: Multi-variable type inference failed */
    public o1(Map<Integer, ? extends vz.p<? extends V, ? extends a0>> keyframes, int i11, int i12) {
        kotlin.jvm.internal.s.g(keyframes, "keyframes");
        this.f36231a = keyframes;
        this.f36232b = i11;
        this.f36233c = i12;
    }

    private final void h(V v11) {
        if (this.f36234d == null) {
            this.f36234d = (V) q.d(v11);
            this.f36235e = (V) q.d(v11);
        }
    }

    @Override // l0.g1
    public boolean a() {
        return j1.a.c(this);
    }

    @Override // l0.g1
    public V b(long j11, V initialValue, V targetValue, V initialVelocity) {
        long c11;
        kotlin.jvm.internal.s.g(initialValue, "initialValue");
        kotlin.jvm.internal.s.g(targetValue, "targetValue");
        kotlin.jvm.internal.s.g(initialVelocity, "initialVelocity");
        c11 = h1.c(this, j11 / 1000000);
        int i11 = (int) c11;
        if (this.f36231a.containsKey(Integer.valueOf(i11))) {
            return (V) ((vz.p) wz.p0.j(this.f36231a, Integer.valueOf(i11))).c();
        }
        if (i11 >= e()) {
            return targetValue;
        }
        if (i11 <= 0) {
            return initialValue;
        }
        int e11 = e();
        a0 b11 = b0.b();
        int i12 = 0;
        V v11 = initialValue;
        int i13 = 0;
        for (Map.Entry<Integer, vz.p<V, a0>> entry : this.f36231a.entrySet()) {
            int intValue = entry.getKey().intValue();
            vz.p<V, a0> value = entry.getValue();
            if (i11 > intValue && intValue >= i13) {
                v11 = value.c();
                b11 = value.d();
                i13 = intValue;
            } else if (i11 < intValue && intValue <= e11) {
                targetValue = value.c();
                e11 = intValue;
            }
        }
        float a11 = b11.a((i11 - i13) / (e11 - i13));
        h(initialValue);
        int b12 = v11.b();
        while (true) {
            V v12 = null;
            if (i12 >= b12) {
                break;
            }
            int i14 = i12 + 1;
            V v13 = this.f36234d;
            if (v13 == null) {
                kotlin.jvm.internal.s.x("valueVector");
            } else {
                v12 = v13;
            }
            v12.e(i12, f1.k(v11.a(i12), targetValue.a(i12), a11));
            i12 = i14;
        }
        V v14 = this.f36234d;
        if (v14 == null) {
            kotlin.jvm.internal.s.x("valueVector");
            return null;
        }
        return v14;
    }

    @Override // l0.j1
    public int c() {
        return this.f36233c;
    }

    @Override // l0.g1
    public V d(V v11, V v12, V v13) {
        return (V) j1.a.b(this, v11, v12, v13);
    }

    @Override // l0.j1
    public int e() {
        return this.f36232b;
    }

    @Override // l0.g1
    public long f(V v11, V v12, V v13) {
        return j1.a.a(this, v11, v12, v13);
    }

    @Override // l0.g1
    public V g(long j11, V initialValue, V targetValue, V initialVelocity) {
        long c11;
        kotlin.jvm.internal.s.g(initialValue, "initialValue");
        kotlin.jvm.internal.s.g(targetValue, "targetValue");
        kotlin.jvm.internal.s.g(initialVelocity, "initialVelocity");
        c11 = h1.c(this, j11 / 1000000);
        if (c11 <= 0) {
            return initialVelocity;
        }
        p e11 = h1.e(this, c11 - 1, initialValue, targetValue, initialVelocity);
        p e12 = h1.e(this, c11, initialValue, targetValue, initialVelocity);
        h(initialValue);
        int i11 = 0;
        int b11 = e11.b();
        while (true) {
            V v11 = null;
            if (i11 >= b11) {
                break;
            }
            int i12 = i11 + 1;
            V v12 = this.f36235e;
            if (v12 == null) {
                kotlin.jvm.internal.s.x("velocityVector");
            } else {
                v11 = v12;
            }
            v11.e(i11, (e11.a(i11) - e12.a(i11)) * 1000.0f);
            i11 = i12;
        }
        V v13 = this.f36235e;
        if (v13 == null) {
            kotlin.jvm.internal.s.x("velocityVector");
            return null;
        }
        return v13;
    }
}