package net.time4j;

import ch.qos.logback.core.CoreConstants;

/* loaded from: classes5.dex */
public final class b1 implements net.time4j.engine.o, m30.g {

    /* renamed from: a  reason: collision with root package name */
    private final b0 f40831a;

    /* renamed from: b  reason: collision with root package name */
    private final net.time4j.tz.l f40832b;

    /* renamed from: c  reason: collision with root package name */
    private final transient i0 f40833c;

    private b1(b0 b0Var, net.time4j.tz.l lVar) {
        this.f40832b = lVar;
        net.time4j.tz.p B = lVar.B(b0Var);
        if (b0Var.i0() && (B.i() != 0 || B.h() % 60 != 0)) {
            throw new IllegalArgumentException("Leap second can only be represented  with timezone-offset in full minutes: " + B);
        }
        this.f40831a = b0Var;
        this.f40833c = i0.S(b0Var, B);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static b1 j(b0 b0Var, net.time4j.tz.l lVar) {
        return new b1(b0Var, lVar);
    }

    @Override // net.time4j.base.f
    public int a() {
        return this.f40831a.a();
    }

    public net.time4j.tz.p b() {
        return this.f40832b.B(this.f40831a);
    }

    @Override // net.time4j.engine.o
    public boolean c() {
        return true;
    }

    @Override // m30.g
    public long d(m30.f fVar) {
        return this.f40831a.d(fVar);
    }

    @Override // net.time4j.engine.o
    public <V> V e(net.time4j.engine.p<V> pVar) {
        V v11;
        if (this.f40833c.q(pVar)) {
            v11 = (V) this.f40833c.e(pVar);
        } else {
            v11 = (V) this.f40831a.e(pVar);
        }
        if (pVar == h0.C && this.f40833c.getYear() >= 1972) {
            i0 i0Var = (i0) this.f40833c.mo184z(pVar, v11);
            if (!this.f40832b.K(i0Var, i0Var) && i0Var.W(this.f40832b).m0(1L, n0.SECONDS).i0()) {
                return pVar.getType().cast(60);
            }
        }
        return v11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b1) {
            b1 b1Var = (b1) obj;
            return this.f40831a.equals(b1Var.f40831a) && this.f40832b.equals(b1Var.f40832b);
        }
        return false;
    }

    @Override // net.time4j.engine.o
    public <V> V f(net.time4j.engine.p<V> pVar) {
        if (this.f40833c.q(pVar)) {
            return (V) this.f40833c.f(pVar);
        }
        return (V) this.f40831a.f(pVar);
    }

    @Override // net.time4j.base.f
    public long g() {
        return this.f40831a.g();
    }

    @Override // net.time4j.engine.o
    public int h(net.time4j.engine.p<Integer> pVar) {
        if (this.f40831a.i0() && pVar == h0.C) {
            return 60;
        }
        int h11 = this.f40833c.h(pVar);
        return h11 == Integer.MIN_VALUE ? this.f40831a.h(pVar) : h11;
    }

    public int hashCode() {
        return this.f40831a.hashCode() ^ this.f40832b.hashCode();
    }

    public boolean i() {
        return this.f40831a.i0();
    }

    @Override // m30.g
    public int k(m30.f fVar) {
        return this.f40831a.k(fVar);
    }

    @Override // net.time4j.engine.o
    public <V> V l(net.time4j.engine.p<V> pVar) {
        if (this.f40831a.i0() && pVar == h0.C) {
            return pVar.getType().cast(60);
        }
        if (this.f40833c.q(pVar)) {
            return (V) this.f40833c.l(pVar);
        }
        return (V) this.f40831a.l(pVar);
    }

    @Override // net.time4j.engine.o
    public net.time4j.tz.k o() {
        return this.f40832b.z();
    }

    @Override // net.time4j.engine.o
    public boolean q(net.time4j.engine.p<?> pVar) {
        return this.f40833c.q(pVar) || this.f40831a.q(pVar);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(40);
        sb2.append(this.f40833c.T());
        sb2.append('T');
        int p11 = this.f40833c.p();
        if (p11 < 10) {
            sb2.append('0');
        }
        sb2.append(p11);
        sb2.append(CoreConstants.COLON_CHAR);
        int m11 = this.f40833c.m();
        if (m11 < 10) {
            sb2.append('0');
        }
        sb2.append(m11);
        sb2.append(CoreConstants.COLON_CHAR);
        if (i()) {
            sb2.append("60");
        } else {
            int j11 = this.f40833c.j();
            if (j11 < 10) {
                sb2.append('0');
            }
            sb2.append(j11);
        }
        int a11 = this.f40833c.a();
        if (a11 != 0) {
            h0.T0(sb2, a11);
        }
        sb2.append(b());
        net.time4j.tz.k o11 = o();
        if (!(o11 instanceof net.time4j.tz.p)) {
            sb2.append('[');
            sb2.append(o11.a());
            sb2.append(']');
        }
        return sb2.toString();
    }
}