package s50;

import java.lang.reflect.Array;

/* loaded from: classes5.dex */
public class g implements a {

    /* renamed from: a  reason: collision with root package name */
    private long[][] f50289a;

    @Override // s50.a
    public void a(long[] jArr) {
        long[][] jArr2 = this.f50289a;
        if (jArr2 == null) {
            this.f50289a = (long[][]) Array.newInstance(long.class, 256, 4);
        } else if (c.c(jArr, jArr2[1])) {
            return;
        }
        c.b(jArr, this.f50289a[1]);
        for (int i11 = 2; i11 < 256; i11 += 2) {
            long[][] jArr3 = this.f50289a;
            c.d(jArr3[i11 >> 1], jArr3[i11]);
            long[][] jArr4 = this.f50289a;
            c.a(jArr4[i11], jArr4[1], jArr4[i11 + 1]);
        }
    }

    @Override // s50.a
    public void b(long[] jArr) {
        long[] jArr2 = new long[4];
        c.b(this.f50289a[((int) (jArr[3] >>> 56)) & 255], jArr2);
        for (int i11 = 30; i11 >= 0; i11--) {
            c.e(jArr2, jArr2);
            c.a(this.f50289a[((int) (jArr[i11 >>> 3] >>> ((i11 & 7) << 3))) & 255], jArr2, jArr2);
        }
        c.b(jArr2, jArr);
    }
}