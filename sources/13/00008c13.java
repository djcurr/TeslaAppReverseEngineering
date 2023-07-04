package net.time4j;

import java.util.Objects;
import net.time4j.engine.ChronoException;

/* loaded from: classes5.dex */
public final class s<C> implements net.time4j.engine.o, net.time4j.engine.m0 {

    /* renamed from: a  reason: collision with root package name */
    private final net.time4j.engine.l<?> f41502a;

    /* renamed from: b  reason: collision with root package name */
    private final net.time4j.engine.m<?, ?> f41503b;

    /* renamed from: c  reason: collision with root package name */
    private final h0 f41504c;

    /* JADX WARN: Type inference failed for: r3v1, types: [net.time4j.engine.l, net.time4j.engine.l<?>] */
    /* JADX WARN: Type inference failed for: r3v4, types: [net.time4j.engine.m<?, ?>, net.time4j.engine.m] */
    private s(net.time4j.engine.l<?> lVar, net.time4j.engine.m<?, ?> mVar, h0 h0Var) {
        if (h0Var.p() == 24) {
            if (lVar == null) {
                this.f41502a = null;
                this.f41503b = mVar.O(net.time4j.engine.h.c(1L));
            } else {
                this.f41502a = lVar.F(net.time4j.engine.h.c(1L));
                this.f41503b = null;
            }
            this.f41504c = h0.H0();
            return;
        }
        this.f41502a = lVar;
        this.f41503b = mVar;
        this.f41504c = h0Var;
    }

    /* JADX WARN: Incorrect types in method signature: <C:Lnet/time4j/engine/l<TC;>;>(TC;Lnet/time4j/h0;)Lnet/time4j/s<TC;>; */
    public static s b(net.time4j.engine.l lVar, h0 h0Var) {
        Objects.requireNonNull(lVar, "Missing date component.");
        return new s(lVar, null, h0Var);
    }

    /* JADX WARN: Incorrect types in method signature: <C:Lnet/time4j/engine/m<*TC;>;>(TC;Lnet/time4j/h0;)Lnet/time4j/s<TC;>; */
    public static s d(net.time4j.engine.m mVar, h0 h0Var) {
        Objects.requireNonNull(mVar, "Missing date component.");
        return new s(null, mVar, h0Var);
    }

    private net.time4j.engine.o j() {
        net.time4j.engine.l<?> lVar = this.f41502a;
        return lVar == null ? this.f41503b : lVar;
    }

    public b0 a(net.time4j.tz.l lVar, net.time4j.engine.d0 d0Var) {
        i0 o02;
        net.time4j.engine.l<?> lVar2 = this.f41502a;
        if (lVar2 == null) {
            o02 = ((g0) this.f41503b.S(g0.class)).o0(this.f41504c);
        } else {
            o02 = ((g0) lVar2.H(g0.class)).o0(this.f41504c);
        }
        int intValue = ((Integer) this.f41504c.l(h0.E)).intValue() - d0Var.b(o02.T(), lVar.z());
        if (intValue >= 86400) {
            o02 = o02.F(1L, f.DAYS);
        } else if (intValue < 0) {
            o02 = o02.G(1L, f.DAYS);
        }
        return o02.W(lVar);
    }

    @Override // net.time4j.engine.o
    public boolean c() {
        return false;
    }

    @Override // net.time4j.engine.o
    public <V> V e(net.time4j.engine.p<V> pVar) {
        return pVar.isDateElement() ? (V) j().e(pVar) : (V) this.f41504c.e(pVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof s) {
            s sVar = (s) s.class.cast(obj);
            if (this.f41504c.equals(sVar.f41504c)) {
                net.time4j.engine.l<?> lVar = this.f41502a;
                return lVar == null ? sVar.f41502a == null && this.f41503b.equals(sVar.f41503b) : sVar.f41503b == null && lVar.equals(sVar.f41502a);
            }
            return false;
        }
        return false;
    }

    @Override // net.time4j.engine.o
    public <V> V f(net.time4j.engine.p<V> pVar) {
        return pVar.isDateElement() ? (V) j().f(pVar) : (V) this.f41504c.f(pVar);
    }

    public C g() {
        C c11 = (C) this.f41502a;
        return c11 == null ? (C) this.f41503b : c11;
    }

    @Override // net.time4j.engine.o
    public int h(net.time4j.engine.p<Integer> pVar) {
        return pVar.isDateElement() ? j().h(pVar) : this.f41504c.h(pVar);
    }

    public int hashCode() {
        int hashCode;
        net.time4j.engine.l<?> lVar = this.f41502a;
        if (lVar == null) {
            hashCode = this.f41503b.hashCode();
        } else {
            hashCode = lVar.hashCode();
        }
        return hashCode + this.f41504c.hashCode();
    }

    @Override // net.time4j.engine.o
    public <V> V l(net.time4j.engine.p<V> pVar) {
        return pVar.isDateElement() ? (V) j().l(pVar) : (V) this.f41504c.l(pVar);
    }

    @Override // net.time4j.engine.o
    public net.time4j.tz.k o() {
        throw new ChronoException("Timezone not available: " + this);
    }

    @Override // net.time4j.engine.o
    public boolean q(net.time4j.engine.p<?> pVar) {
        return pVar.isDateElement() ? j().q(pVar) : this.f41504c.q(pVar);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        net.time4j.engine.l<?> lVar = this.f41502a;
        if (lVar == null) {
            sb2.append(this.f41503b);
        } else {
            sb2.append(lVar);
        }
        sb2.append(this.f41504c);
        return sb2.toString();
    }
}