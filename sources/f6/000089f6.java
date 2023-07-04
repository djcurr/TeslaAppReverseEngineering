package n60;

import java.math.BigInteger;

/* loaded from: classes5.dex */
public class n extends b {

    /* renamed from: a  reason: collision with root package name */
    protected final e f40641a;

    /* renamed from: b  reason: collision with root package name */
    protected final r60.d f40642b;

    public n(e eVar, r60.d dVar) {
        if (eVar == null || eVar.w() == null) {
            throw new IllegalArgumentException("Need curve with known group order");
        }
        this.f40641a = eVar;
        this.f40642b = dVar;
    }

    @Override // n60.b
    protected i c(i iVar, BigInteger bigInteger) {
        if (this.f40641a.l(iVar.i())) {
            BigInteger[] decomposeScalar = this.f40642b.decomposeScalar(bigInteger.mod(iVar.i().w()));
            BigInteger bigInteger2 = decomposeScalar[0];
            BigInteger bigInteger3 = decomposeScalar[1];
            return this.f40642b.hasEfficientPointMap() ? c.e(this.f40642b, iVar, bigInteger2, bigInteger3) : c.d(iVar, bigInteger2, r60.c.c(this.f40642b, iVar), bigInteger3);
        }
        throw new IllegalStateException();
    }
}