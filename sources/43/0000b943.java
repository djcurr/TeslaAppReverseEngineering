package v5;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s;
import m00.l;
import okio.i;

/* loaded from: classes.dex */
public final class e {
    static {
        new e();
        i.a aVar = okio.i.f42657e;
        aVar.e("GIF");
        aVar.e("RIFF");
        aVar.e("WEBP");
        aVar.e("VP8X");
        aVar.e("ftyp");
        aVar.e("msf1");
        aVar.e("hevc");
        aVar.e("hevx");
    }

    private e() {
    }

    public static final int a(int i11, int i12, int i13, int i14, c6.f scale) {
        int d11;
        int d12;
        s.g(scale, "scale");
        d11 = l.d(Integer.highestOneBit(i11 / i13), 1);
        d12 = l.d(Integer.highestOneBit(i12 / i14), 1);
        int i15 = d.f54062a[scale.ordinal()];
        if (i15 != 1) {
            if (i15 == 2) {
                return Math.max(d11, d12);
            }
            throw new NoWhenBranchMatchedException();
        }
        return Math.min(d11, d12);
    }

    public static final c6.c b(int i11, int i12, c6.g dstSize, c6.f scale) {
        int b11;
        int b12;
        s.g(dstSize, "dstSize");
        s.g(scale, "scale");
        if (dstSize instanceof c6.b) {
            return new c6.c(i11, i12);
        }
        if (dstSize instanceof c6.c) {
            c6.c cVar = (c6.c) dstSize;
            double d11 = d(i11, i12, cVar.d(), cVar.c(), scale);
            b11 = j00.c.b(i11 * d11);
            b12 = j00.c.b(d11 * i12);
            return new c6.c(b11, b12);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final double c(double d11, double d12, double d13, double d14, c6.f scale) {
        s.g(scale, "scale");
        double d15 = d13 / d11;
        double d16 = d14 / d12;
        int i11 = d.f54065d[scale.ordinal()];
        if (i11 != 1) {
            if (i11 == 2) {
                return Math.min(d15, d16);
            }
            throw new NoWhenBranchMatchedException();
        }
        return Math.max(d15, d16);
    }

    public static final double d(int i11, int i12, int i13, int i14, c6.f scale) {
        s.g(scale, "scale");
        double d11 = i13 / i11;
        double d12 = i14 / i12;
        int i15 = d.f54063b[scale.ordinal()];
        if (i15 != 1) {
            if (i15 == 2) {
                return Math.min(d11, d12);
            }
            throw new NoWhenBranchMatchedException();
        }
        return Math.max(d11, d12);
    }
}