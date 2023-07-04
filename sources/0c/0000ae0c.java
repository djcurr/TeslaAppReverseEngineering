package qi;

import ak.k0;
import org.spongycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
final class d {

    /* loaded from: classes3.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final long[] f48201a;

        /* renamed from: b  reason: collision with root package name */
        public final int[] f48202b;

        /* renamed from: c  reason: collision with root package name */
        public final int f48203c;

        /* renamed from: d  reason: collision with root package name */
        public final long[] f48204d;

        /* renamed from: e  reason: collision with root package name */
        public final int[] f48205e;

        /* renamed from: f  reason: collision with root package name */
        public final long f48206f;

        private b(long[] jArr, int[] iArr, int i11, long[] jArr2, int[] iArr2, long j11) {
            this.f48201a = jArr;
            this.f48202b = iArr;
            this.f48203c = i11;
            this.f48204d = jArr2;
            this.f48205e = iArr2;
            this.f48206f = j11;
        }
    }

    public static b a(int i11, long[] jArr, int[] iArr, long j11) {
        int i12 = PKIFailureInfo.certRevoked / i11;
        int i13 = 0;
        for (int i14 : iArr) {
            i13 += k0.l(i14, i12);
        }
        long[] jArr2 = new long[i13];
        int[] iArr2 = new int[i13];
        long[] jArr3 = new long[i13];
        int[] iArr3 = new int[i13];
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        for (int i18 = 0; i18 < iArr.length; i18++) {
            int i19 = iArr[i18];
            long j12 = jArr[i18];
            while (i19 > 0) {
                int min = Math.min(i12, i19);
                jArr2[i16] = j12;
                iArr2[i16] = i11 * min;
                i17 = Math.max(i17, iArr2[i16]);
                jArr3[i16] = i15 * j11;
                iArr3[i16] = 1;
                j12 += iArr2[i16];
                i15 += min;
                i19 -= min;
                i16++;
            }
        }
        return new b(jArr2, iArr2, i17, jArr3, iArr3, j11 * i15);
    }
}