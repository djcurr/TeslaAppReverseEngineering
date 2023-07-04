package s50;

import java.lang.reflect.Array;

/* loaded from: classes5.dex */
public class f implements a {

    /* renamed from: a  reason: collision with root package name */
    private long[][] f50288a;

    @Override // s50.a
    public void a(long[] jArr) {
        long[][] jArr2 = this.f50288a;
        if (jArr2 == null) {
            this.f50288a = (long[][]) Array.newInstance(long.class, 256, 2);
        } else if (b.c(jArr, jArr2[1])) {
            return;
        }
        b.b(jArr, this.f50288a[1]);
        for (int i11 = 2; i11 < 256; i11 += 2) {
            long[][] jArr3 = this.f50288a;
            b.d(jArr3[i11 >> 1], jArr3[i11]);
            long[][] jArr4 = this.f50288a;
            b.a(jArr4[i11], jArr4[1], jArr4[i11 + 1]);
        }
    }

    @Override // s50.a
    public void b(long[] jArr) {
        long[] jArr2 = new long[2];
        b.b(this.f50288a[((int) (jArr[1] >>> 56)) & 255], jArr2);
        for (int i11 = 14; i11 >= 0; i11--) {
            b.e(jArr2, jArr2);
            b.a(this.f50288a[((int) (jArr[i11 >>> 3] >>> ((i11 & 7) << 3))) & 255], jArr2, jArr2);
        }
        b.b(jArr2, jArr);
    }
}