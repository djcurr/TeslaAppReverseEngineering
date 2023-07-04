package n60;

import java.math.BigInteger;
import okhttp3.internal.http2.Settings;

/* loaded from: classes5.dex */
public class v extends b {
    @Override // n60.b
    protected i c(i iVar, BigInteger bigInteger) {
        i iVar2;
        w l11 = x.l(iVar, x.i(bigInteger.bitLength()), true);
        i[] c11 = l11.c();
        i[] d11 = l11.d();
        int g11 = l11.g();
        int[] e11 = x.e(g11, bigInteger);
        i u11 = iVar.i().u();
        int length = e11.length;
        if (length > 1) {
            length--;
            int i11 = e11[length];
            int i12 = i11 >> 16;
            int i13 = i11 & Settings.DEFAULT_INITIAL_WINDOW_SIZE;
            int abs = Math.abs(i12);
            i[] iVarArr = i12 < 0 ? d11 : c11;
            if ((abs << 2) < (1 << g11)) {
                int a11 = 32 - r70.f.a(abs);
                int i14 = g11 - a11;
                iVar2 = iVarArr[((1 << (g11 - 1)) - 1) >>> 1].a(iVarArr[(((abs ^ (1 << (a11 - 1))) << i14) + 1) >>> 1]);
                i13 -= i14;
            } else {
                iVar2 = iVarArr[abs >>> 1];
            }
            u11 = iVar2.I(i13);
        }
        while (length > 0) {
            length--;
            int i15 = e11[length];
            int i16 = i15 >> 16;
            u11 = u11.K((i16 < 0 ? d11 : c11)[Math.abs(i16) >>> 1]).I(i15 & Settings.DEFAULT_INITIAL_WINDOW_SIZE);
        }
        return u11;
    }
}