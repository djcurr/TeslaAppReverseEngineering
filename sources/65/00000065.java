package a50;

import java.math.BigInteger;
import java.util.Random;
import n60.i;

/* loaded from: classes5.dex */
public abstract class e {
    public static i a(n60.e eVar, byte[] bArr) {
        n60.f m11 = eVar.m(BigInteger.valueOf(bArr[bArr.length - 1] & 1));
        n60.f m12 = eVar.m(new BigInteger(1, bArr));
        if (!d(m12).equals(eVar.n())) {
            m12 = m12.b();
        }
        n60.f fVar = null;
        if (m12.i()) {
            fVar = eVar.o().n();
        } else {
            n60.f c11 = c(eVar, m12.o().g().j(eVar.o()).a(eVar.n()).a(m12));
            if (c11 != null) {
                if (!d(c11).equals(m11)) {
                    c11 = c11.b();
                }
                fVar = m12.j(c11);
            }
        }
        if (fVar != null) {
            return eVar.E(m12.t(), fVar.t());
        }
        throw new IllegalArgumentException("Invalid point compression");
    }

    public static byte[] b(i iVar) {
        i A = iVar.A();
        n60.f f11 = A.f();
        byte[] e11 = f11.e();
        if (!f11.i()) {
            if (d(A.g().d(f11)).h()) {
                int length = e11.length - 1;
                e11[length] = (byte) (e11[length] | 1);
            } else {
                int length2 = e11.length - 1;
                e11[length2] = (byte) (e11[length2] & 254);
            }
        }
        return e11;
    }

    private static n60.f c(n60.e eVar, n60.f fVar) {
        n60.f fVar2;
        if (fVar.i()) {
            return fVar;
        }
        n60.f m11 = eVar.m(n60.d.f40584a);
        Random random = new Random();
        int f11 = fVar.f();
        do {
            n60.f m12 = eVar.m(new BigInteger(f11, random));
            n60.f fVar3 = fVar;
            fVar2 = m11;
            for (int i11 = 1; i11 <= f11 - 1; i11++) {
                n60.f o11 = fVar3.o();
                fVar2 = fVar2.o().a(o11.j(m12));
                fVar3 = o11.a(fVar);
            }
            if (!fVar3.i()) {
                return null;
            }
        } while (fVar2.o().a(fVar2).i());
        return fVar2;
    }

    private static n60.f d(n60.f fVar) {
        n60.f fVar2 = fVar;
        for (int i11 = 1; i11 < fVar.f(); i11++) {
            fVar2 = fVar2.o().a(fVar);
        }
        return fVar2;
    }
}