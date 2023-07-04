package n60;

import java.math.BigInteger;

/* loaded from: classes5.dex */
public class k extends b {
    @Override // n60.b
    protected i c(i iVar, BigInteger bigInteger) {
        int a11;
        e i11 = iVar.i();
        if (bigInteger.bitLength() <= m.a(i11)) {
            l b11 = m.b(iVar);
            g a12 = b11.a();
            int c11 = b11.c();
            int i12 = ((a11 + c11) - 1) / c11;
            i u11 = i11.u();
            int i13 = c11 * i12;
            int[] r11 = v60.n.r(i13, bigInteger);
            int i14 = i13 - 1;
            for (int i15 = 0; i15 < i12; i15++) {
                int i16 = 0;
                for (int i17 = i14 - i15; i17 >= 0; i17 -= i12) {
                    int i18 = r11[i17 >>> 5] >>> (i17 & 31);
                    i16 = ((i16 ^ (i18 >>> 1)) << 1) ^ i18;
                }
                u11 = u11.K(a12.b(i16));
            }
            return u11.a(b11.b());
        }
        throw new IllegalStateException("fixed-point comb doesn't support scalars larger than the curve order");
    }
}