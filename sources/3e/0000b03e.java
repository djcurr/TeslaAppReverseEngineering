package r60;

import java.math.BigInteger;
import n60.i;
import n60.p;
import n60.q;

/* loaded from: classes5.dex */
public abstract class c {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static class a implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ r60.a f49258a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ i f49259b;

        a(r60.a aVar, i iVar) {
            this.f49258a = aVar;
            this.f49259b = iVar;
        }

        private boolean b(b bVar, r60.a aVar) {
            return (bVar == null || bVar.a() != aVar || bVar.b() == null) ? false : true;
        }

        @Override // n60.p
        public q a(q qVar) {
            b bVar = qVar instanceof b ? (b) qVar : null;
            if (b(bVar, this.f49258a)) {
                return bVar;
            }
            i a11 = this.f49258a.getPointMap().a(this.f49259b);
            b bVar2 = new b();
            bVar2.c(this.f49258a);
            bVar2.d(a11);
            return bVar2;
        }
    }

    private static BigInteger a(BigInteger bigInteger, BigInteger bigInteger2, int i11) {
        boolean z11 = bigInteger2.signum() < 0;
        BigInteger multiply = bigInteger.multiply(bigInteger2.abs());
        boolean testBit = multiply.testBit(i11 - 1);
        BigInteger shiftRight = multiply.shiftRight(i11);
        if (testBit) {
            shiftRight = shiftRight.add(n60.d.f40585b);
        }
        return z11 ? shiftRight.negate() : shiftRight;
    }

    public static BigInteger[] b(g gVar, BigInteger bigInteger) {
        int b11 = gVar.b();
        BigInteger a11 = a(bigInteger, gVar.c(), b11);
        BigInteger a12 = a(bigInteger, gVar.d(), b11);
        return new BigInteger[]{bigInteger.subtract(a11.multiply(gVar.e()).add(a12.multiply(gVar.g()))), a11.multiply(gVar.f()).add(a12.multiply(gVar.h())).negate()};
    }

    public static i c(r60.a aVar, i iVar) {
        return ((b) iVar.i().B(iVar, "bc_endo", new a(aVar, iVar))).b();
    }
}