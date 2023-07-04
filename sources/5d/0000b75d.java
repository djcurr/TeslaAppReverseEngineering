package u50;

import java.math.BigInteger;

/* loaded from: classes5.dex */
public class o0 extends m0 {

    /* renamed from: c  reason: collision with root package name */
    private BigInteger f53258c;

    public o0(BigInteger bigInteger, n0 n0Var) {
        super(true, n0Var);
        this.f53258c = bigInteger;
    }

    public BigInteger c() {
        return this.f53258c;
    }

    @Override // u50.m0
    public boolean equals(Object obj) {
        if ((obj instanceof o0) && ((o0) obj).c().equals(this.f53258c)) {
            return super.equals(obj);
        }
        return false;
    }

    @Override // u50.m0
    public int hashCode() {
        return c().hashCode();
    }
}