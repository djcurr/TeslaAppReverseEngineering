package r50;

import java.lang.reflect.Array;
import r70.i;

/* loaded from: classes5.dex */
public class e implements c {

    /* renamed from: a  reason: collision with root package name */
    private byte[] f49252a;

    /* renamed from: b  reason: collision with root package name */
    private long[][] f49253b;

    @Override // r50.c
    public void init(byte[] bArr) {
        if (this.f49253b == null) {
            this.f49253b = (long[][]) Array.newInstance(long.class, 256, 2);
        } else if (d.a(this.f49252a, bArr) != 0) {
            return;
        }
        byte[] bArr2 = new byte[16];
        this.f49252a = bArr2;
        d.e(bArr, bArr2);
        d.c(this.f49252a, this.f49253b[1]);
        long[][] jArr = this.f49253b;
        d.k(jArr[1], jArr[1]);
        for (int i11 = 2; i11 < 256; i11 += 2) {
            long[][] jArr2 = this.f49253b;
            d.g(jArr2[i11 >> 1], jArr2[i11]);
            long[][] jArr3 = this.f49253b;
            d.s(jArr3[i11], jArr3[1], jArr3[i11 + 1]);
        }
    }

    @Override // r50.c
    public void multiplyH(byte[] bArr) {
        long[] jArr = this.f49253b[bArr[15] & 255];
        long j11 = jArr[0];
        long j12 = jArr[1];
        for (int i11 = 14; i11 >= 0; i11--) {
            long[] jArr2 = this.f49253b[bArr[i11] & 255];
            long j13 = j12 << 56;
            j12 = ((j12 >>> 8) | (j11 << 56)) ^ jArr2[1];
            j11 = (((((j11 >>> 8) ^ jArr2[0]) ^ j13) ^ (j13 >>> 1)) ^ (j13 >>> 2)) ^ (j13 >>> 7);
        }
        i.s(j11, bArr, 0);
        i.s(j12, bArr, 8);
    }
}