package u50;

import java.math.BigInteger;

/* loaded from: classes5.dex */
public class p0 extends m0 {

    /* renamed from: c  reason: collision with root package name */
    private BigInteger f53266c;

    public p0(BigInteger bigInteger, n0 n0Var) {
        super(false, n0Var);
        this.f53266c = bigInteger;
    }

    public BigInteger c() {
        return this.f53266c;
    }

    @Override // u50.m0
    public boolean equals(Object obj) {
        return (obj instanceof p0) && ((p0) obj).c().equals(this.f53266c) && super.equals(obj);
    }

    @Override // u50.m0
    public int hashCode() {
        return this.f53266c.hashCode() ^ super.hashCode();
    }
}