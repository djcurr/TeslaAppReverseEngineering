package l0;

import l0.p;

/* loaded from: classes.dex */
final class m1<V extends p> implements i1<V> {

    /* renamed from: a  reason: collision with root package name */
    private final e0 f36210a;

    /* renamed from: b  reason: collision with root package name */
    private V f36211b;

    /* renamed from: c  reason: collision with root package name */
    private V f36212c;

    /* renamed from: d  reason: collision with root package name */
    private V f36213d;

    /* renamed from: e  reason: collision with root package name */
    private final float f36214e;

    public m1(e0 floatDecaySpec) {
        kotlin.jvm.internal.s.g(floatDecaySpec, "floatDecaySpec");
        this.f36210a = floatDecaySpec;
        this.f36214e = floatDecaySpec.a();
    }

    @Override // l0.i1
    public float a() {
        return this.f36214e;
    }

    @Override // l0.i1
    public V b(long j11, V initialValue, V initialVelocity) {
        kotlin.jvm.internal.s.g(initialValue, "initialValue");
        kotlin.jvm.internal.s.g(initialVelocity, "initialVelocity");
        if (this.f36212c == null) {
            this.f36212c = (V) q.d(initialValue);
        }
        int i11 = 0;
        V v11 = this.f36212c;
        if (v11 == null) {
            kotlin.jvm.internal.s.x("velocityVector");
            v11 = null;
        }
        int b11 = v11.b();
        while (i11 < b11) {
            int i12 = i11 + 1;
            V v12 = this.f36212c;
            if (v12 == null) {
                kotlin.jvm.internal.s.x("velocityVector");
                v12 = null;
            }
            v12.e(i11, this.f36210a.b(j11, initialValue.a(i11), initialVelocity.a(i11)));
            i11 = i12;
        }
        V v13 = this.f36212c;
        if (v13 == null) {
            kotlin.jvm.internal.s.x("velocityVector");
            return null;
        }
        return v13;
    }

    @Override // l0.i1
    public V c(long j11, V initialValue, V initialVelocity) {
        kotlin.jvm.internal.s.g(initialValue, "initialValue");
        kotlin.jvm.internal.s.g(initialVelocity, "initialVelocity");
        if (this.f36211b == null) {
            this.f36211b = (V) q.d(initialValue);
        }
        int i11 = 0;
        V v11 = this.f36211b;
        if (v11 == null) {
            kotlin.jvm.internal.s.x("valueVector");
            v11 = null;
        }
        int b11 = v11.b();
        while (i11 < b11) {
            int i12 = i11 + 1;
            V v12 = this.f36211b;
            if (v12 == null) {
                kotlin.jvm.internal.s.x("valueVector");
                v12 = null;
            }
            v12.e(i11, this.f36210a.e(j11, initialValue.a(i11), initialVelocity.a(i11)));
            i11 = i12;
        }
        V v13 = this.f36211b;
        if (v13 == null) {
            kotlin.jvm.internal.s.x("valueVector");
            return null;
        }
        return v13;
    }

    @Override // l0.i1
    public V d(V initialValue, V initialVelocity) {
        kotlin.jvm.internal.s.g(initialValue, "initialValue");
        kotlin.jvm.internal.s.g(initialVelocity, "initialVelocity");
        if (this.f36213d == null) {
            this.f36213d = (V) q.d(initialValue);
        }
        int i11 = 0;
        V v11 = this.f36213d;
        if (v11 == null) {
            kotlin.jvm.internal.s.x("targetVector");
            v11 = null;
        }
        int b11 = v11.b();
        while (i11 < b11) {
            int i12 = i11 + 1;
            V v12 = this.f36213d;
            if (v12 == null) {
                kotlin.jvm.internal.s.x("targetVector");
                v12 = null;
            }
            v12.e(i11, this.f36210a.d(initialValue.a(i11), initialVelocity.a(i11)));
            i11 = i12;
        }
        V v13 = this.f36213d;
        if (v13 == null) {
            kotlin.jvm.internal.s.x("targetVector");
            return null;
        }
        return v13;
    }

    @Override // l0.i1
    public long e(V initialValue, V initialVelocity) {
        kotlin.jvm.internal.s.g(initialValue, "initialValue");
        kotlin.jvm.internal.s.g(initialVelocity, "initialVelocity");
        if (this.f36212c == null) {
            this.f36212c = (V) q.d(initialValue);
        }
        V v11 = this.f36212c;
        if (v11 == null) {
            kotlin.jvm.internal.s.x("velocityVector");
            v11 = null;
        }
        int b11 = v11.b();
        long j11 = 0;
        for (int i11 = 0; i11 < b11; i11++) {
            j11 = Math.max(j11, this.f36210a.c(initialValue.a(i11), initialVelocity.a(i11)));
        }
        return j11;
    }
}