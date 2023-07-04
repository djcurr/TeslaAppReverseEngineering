package v60;

import org.spongycastle.crypto.tls.CipherSuite;

/* loaded from: classes5.dex */
public class b {
    public static long a(int i11) {
        int a11 = a.a(a.a(a.a(a.a(i11, CipherSuite.DRAFT_TLS_DHE_RSA_WITH_AES_128_OCB, 8), 15728880, 4), 202116108, 2), 572662306, 1);
        return (((a11 >>> 1) & 1431655765) << 32) | (1431655765 & a11);
    }

    public static void b(long j11, long[] jArr, int i11) {
        long b11 = a.b(a.b(a.b(a.b(a.b(j11, 4294901760L, 16), 280375465148160L, 8), 67555025218437360L, 4), 868082074056920076L, 2), 2459565876494606882L, 1);
        jArr[i11] = b11 & 6148914691236517205L;
        jArr[i11 + 1] = (b11 >>> 1) & 6148914691236517205L;
    }

    public static void c(long[] jArr, int i11, int i12, long[] jArr2, int i13) {
        for (int i14 = 0; i14 < i12; i14++) {
            b(jArr[i11 + i14], jArr2, i13);
            i13 += 2;
        }
    }

    public static void d(long j11, long[] jArr, int i11) {
        long b11 = a.b(a.b(a.b(a.b(a.b(j11, 4294901760L, 16), 280375465148160L, 8), 67555025218437360L, 4), 868082074056920076L, 2), 2459565876494606882L, 1);
        jArr[i11] = b11 & (-6148914691236517206L);
        jArr[i11 + 1] = (b11 << 1) & (-6148914691236517206L);
    }

    public static int e(int i11) {
        int i12 = i11 & 255;
        int i13 = (i12 | (i12 << 4)) & 3855;
        int i14 = (i13 | (i13 << 2)) & 13107;
        return (i14 | (i14 << 1)) & 21845;
    }

    public static int f(int i11) {
        return a.a(a.a(a.a(a.a(i11, 11141290, 7), 52428, 14), 15728880, 4), CipherSuite.DRAFT_TLS_DHE_RSA_WITH_AES_128_OCB, 8);
    }

    public static long g(long j11) {
        return a.b(a.b(a.b(a.b(a.b(j11, 2459565876494606882L, 1), 868082074056920076L, 2), 67555025218437360L, 4), 280375465148160L, 8), 4294901760L, 16);
    }
}