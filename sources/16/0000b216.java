package s50;

import java.lang.reflect.Array;

/* loaded from: classes5.dex */
public class e implements a {

    /* renamed from: a  reason: collision with root package name */
    private long[][] f50287a;

    @Override // s50.a
    public void a(long[] jArr) {
        long[][] jArr2 = this.f50287a;
        if (jArr2 == null) {
            this.f50287a = (long[][]) Array.newInstance(long.class, 256, 8);
        } else if (d.c(jArr, jArr2[1])) {
            return;
        }
        d.b(jArr, this.f50287a[1]);
        for (int i11 = 2; i11 < 256; i11 += 2) {
            long[][] jArr3 = this.f50287a;
            d.d(jArr3[i11 >> 1], jArr3[i11]);
            long[][] jArr4 = this.f50287a;
            d.a(jArr4[i11], jArr4[1], jArr4[i11 + 1]);
        }
    }

    @Override // s50.a
    public void b(long[] jArr) {
        long[] jArr2 = new long[8];
        d.b(this.f50287a[((int) (jArr[7] >>> 56)) & 255], jArr2);
        for (int i11 = 62; i11 >= 0; i11--) {
            d.e(jArr2, jArr2);
            d.a(this.f50287a[((int) (jArr[i11 >>> 3] >>> ((i11 & 7) << 3))) & 255], jArr2, jArr2);
        }
        d.b(jArr2, jArr);
    }
}