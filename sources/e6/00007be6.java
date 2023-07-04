package ji;

import com.google.android.exoplayer2.ParserException;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class z {

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static final class a {
        public a(int i11, int i12, long[] jArr, int i13, boolean z11) {
        }
    }

    /* loaded from: classes3.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final String[] f33786a;

        public b(String str, String[] strArr, int i11) {
            this.f33786a = strArr;
        }
    }

    /* loaded from: classes3.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f33787a;

        public c(boolean z11, int i11, int i12, int i13) {
            this.f33787a = z11;
        }
    }

    /* loaded from: classes3.dex */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public final int f33788a;

        /* renamed from: b  reason: collision with root package name */
        public final int f33789b;

        /* renamed from: c  reason: collision with root package name */
        public final int f33790c;

        /* renamed from: d  reason: collision with root package name */
        public final int f33791d;

        /* renamed from: e  reason: collision with root package name */
        public final int f33792e;

        /* renamed from: f  reason: collision with root package name */
        public final int f33793f;

        /* renamed from: g  reason: collision with root package name */
        public final byte[] f33794g;

        public d(int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, boolean z11, byte[] bArr) {
            this.f33788a = i12;
            this.f33789b = i13;
            this.f33790c = i14;
            this.f33791d = i15;
            this.f33792e = i17;
            this.f33793f = i18;
            this.f33794g = bArr;
        }
    }

    public static int a(int i11) {
        int i12 = 0;
        while (i11 > 0) {
            i12++;
            i11 >>>= 1;
        }
        return i12;
    }

    private static long b(long j11, long j12) {
        return (long) Math.floor(Math.pow(j11, 1.0d / j12));
    }

    private static a c(y yVar) {
        if (yVar.d(24) == 5653314) {
            int d11 = yVar.d(16);
            int d12 = yVar.d(24);
            long[] jArr = new long[d12];
            boolean c11 = yVar.c();
            long j11 = 0;
            if (!c11) {
                boolean c12 = yVar.c();
                for (int i11 = 0; i11 < d12; i11++) {
                    if (c12) {
                        if (yVar.c()) {
                            jArr[i11] = yVar.d(5) + 1;
                        } else {
                            jArr[i11] = 0;
                        }
                    } else {
                        jArr[i11] = yVar.d(5) + 1;
                    }
                }
            } else {
                int d13 = yVar.d(5) + 1;
                int i12 = 0;
                while (i12 < d12) {
                    int d14 = yVar.d(a(d12 - i12));
                    for (int i13 = 0; i13 < d14 && i12 < d12; i13++) {
                        jArr[i12] = d13;
                        i12++;
                    }
                    d13++;
                }
            }
            int d15 = yVar.d(4);
            if (d15 <= 2) {
                if (d15 == 1 || d15 == 2) {
                    yVar.e(32);
                    yVar.e(32);
                    int d16 = yVar.d(4) + 1;
                    yVar.e(1);
                    if (d15 != 1) {
                        j11 = d12 * d11;
                    } else if (d11 != 0) {
                        j11 = b(d12, d11);
                    }
                    yVar.e((int) (j11 * d16));
                }
                return new a(d11, d12, jArr, d15, c11);
            }
            StringBuilder sb2 = new StringBuilder(53);
            sb2.append("lookup type greater than 2 not decodable: ");
            sb2.append(d15);
            throw new ParserException(sb2.toString());
        }
        int b11 = yVar.b();
        StringBuilder sb3 = new StringBuilder(66);
        sb3.append("expected code book to start with [0x56, 0x43, 0x42] at ");
        sb3.append(b11);
        throw new ParserException(sb3.toString());
    }

    private static void d(y yVar) {
        int d11 = yVar.d(6) + 1;
        for (int i11 = 0; i11 < d11; i11++) {
            int d12 = yVar.d(16);
            if (d12 == 0) {
                yVar.e(8);
                yVar.e(16);
                yVar.e(16);
                yVar.e(6);
                yVar.e(8);
                int d13 = yVar.d(4) + 1;
                for (int i12 = 0; i12 < d13; i12++) {
                    yVar.e(8);
                }
            } else if (d12 == 1) {
                int d14 = yVar.d(5);
                int i13 = -1;
                int[] iArr = new int[d14];
                for (int i14 = 0; i14 < d14; i14++) {
                    iArr[i14] = yVar.d(4);
                    if (iArr[i14] > i13) {
                        i13 = iArr[i14];
                    }
                }
                int i15 = i13 + 1;
                int[] iArr2 = new int[i15];
                for (int i16 = 0; i16 < i15; i16++) {
                    iArr2[i16] = yVar.d(3) + 1;
                    int d15 = yVar.d(2);
                    if (d15 > 0) {
                        yVar.e(8);
                    }
                    for (int i17 = 0; i17 < (1 << d15); i17++) {
                        yVar.e(8);
                    }
                }
                yVar.e(2);
                int d16 = yVar.d(4);
                int i18 = 0;
                int i19 = 0;
                for (int i21 = 0; i21 < d14; i21++) {
                    i18 += iArr2[iArr[i21]];
                    while (i19 < i18) {
                        yVar.e(d16);
                        i19++;
                    }
                }
            } else {
                StringBuilder sb2 = new StringBuilder(52);
                sb2.append("floor type greater than 1 not decodable: ");
                sb2.append(d12);
                throw new ParserException(sb2.toString());
            }
        }
    }

    private static void e(int i11, y yVar) {
        int d11 = yVar.d(6) + 1;
        for (int i12 = 0; i12 < d11; i12++) {
            int d12 = yVar.d(16);
            if (d12 != 0) {
                StringBuilder sb2 = new StringBuilder(52);
                sb2.append("mapping type other than 0 not supported: ");
                sb2.append(d12);
                ak.o.c("VorbisUtil", sb2.toString());
            } else {
                int d13 = yVar.c() ? yVar.d(4) + 1 : 1;
                if (yVar.c()) {
                    int d14 = yVar.d(8) + 1;
                    for (int i13 = 0; i13 < d14; i13++) {
                        int i14 = i11 - 1;
                        yVar.e(a(i14));
                        yVar.e(a(i14));
                    }
                }
                if (yVar.d(2) != 0) {
                    throw new ParserException("to reserved bits must be zero after mapping coupling steps");
                }
                if (d13 > 1) {
                    for (int i15 = 0; i15 < i11; i15++) {
                        yVar.e(4);
                    }
                }
                for (int i16 = 0; i16 < d13; i16++) {
                    yVar.e(8);
                    yVar.e(8);
                    yVar.e(8);
                }
            }
        }
    }

    private static c[] f(y yVar) {
        int d11 = yVar.d(6) + 1;
        c[] cVarArr = new c[d11];
        for (int i11 = 0; i11 < d11; i11++) {
            cVarArr[i11] = new c(yVar.c(), yVar.d(16), yVar.d(16), yVar.d(8));
        }
        return cVarArr;
    }

    private static void g(y yVar) {
        int d11 = yVar.d(6) + 1;
        for (int i11 = 0; i11 < d11; i11++) {
            if (yVar.d(16) <= 2) {
                yVar.e(24);
                yVar.e(24);
                yVar.e(24);
                int d12 = yVar.d(6) + 1;
                yVar.e(8);
                int[] iArr = new int[d12];
                for (int i12 = 0; i12 < d12; i12++) {
                    iArr[i12] = ((yVar.c() ? yVar.d(5) : 0) * 8) + yVar.d(3);
                }
                for (int i13 = 0; i13 < d12; i13++) {
                    for (int i14 = 0; i14 < 8; i14++) {
                        if ((iArr[i13] & (1 << i14)) != 0) {
                            yVar.e(8);
                        }
                    }
                }
            } else {
                throw new ParserException("residueType greater than 2 is not decodable");
            }
        }
    }

    public static b h(ak.v vVar) {
        return i(vVar, true, true);
    }

    public static b i(ak.v vVar, boolean z11, boolean z12) {
        if (z11) {
            l(3, vVar, false);
        }
        String z13 = vVar.z((int) vVar.s());
        int length = 11 + z13.length();
        long s11 = vVar.s();
        String[] strArr = new String[(int) s11];
        int i11 = length + 4;
        for (int i12 = 0; i12 < s11; i12++) {
            strArr[i12] = vVar.z((int) vVar.s());
            i11 = i11 + 4 + strArr[i12].length();
        }
        if (z12 && (vVar.C() & 1) == 0) {
            throw new ParserException("framing bit expected to be set");
        }
        return new b(z13, strArr, i11 + 1);
    }

    public static d j(ak.v vVar) {
        l(1, vVar, false);
        int t11 = vVar.t();
        int C = vVar.C();
        int t12 = vVar.t();
        int p11 = vVar.p();
        if (p11 <= 0) {
            p11 = -1;
        }
        int p12 = vVar.p();
        if (p12 <= 0) {
            p12 = -1;
        }
        int p13 = vVar.p();
        if (p13 <= 0) {
            p13 = -1;
        }
        int C2 = vVar.C();
        return new d(t11, C, t12, p11, p12, p13, (int) Math.pow(2.0d, C2 & 15), (int) Math.pow(2.0d, (C2 & 240) >> 4), (vVar.C() & 1) > 0, Arrays.copyOf(vVar.d(), vVar.f()));
    }

    public static c[] k(ak.v vVar, int i11) {
        l(5, vVar, false);
        int C = vVar.C() + 1;
        y yVar = new y(vVar.d());
        yVar.e(vVar.e() * 8);
        for (int i12 = 0; i12 < C; i12++) {
            c(yVar);
        }
        int d11 = yVar.d(6) + 1;
        for (int i13 = 0; i13 < d11; i13++) {
            if (yVar.d(16) != 0) {
                throw new ParserException("placeholder of time domain transforms not zeroed out");
            }
        }
        d(yVar);
        g(yVar);
        e(i11, yVar);
        c[] f11 = f(yVar);
        if (yVar.c()) {
            return f11;
        }
        throw new ParserException("framing bit after modes not set as expected");
    }

    public static boolean l(int i11, ak.v vVar, boolean z11) {
        if (vVar.a() < 7) {
            if (z11) {
                return false;
            }
            int a11 = vVar.a();
            StringBuilder sb2 = new StringBuilder(29);
            sb2.append("too short header: ");
            sb2.append(a11);
            throw new ParserException(sb2.toString());
        } else if (vVar.C() != i11) {
            if (z11) {
                return false;
            }
            String valueOf = String.valueOf(Integer.toHexString(i11));
            throw new ParserException(valueOf.length() != 0 ? "expected header type ".concat(valueOf) : new String("expected header type "));
        } else if (vVar.C() == 118 && vVar.C() == 111 && vVar.C() == 114 && vVar.C() == 98 && vVar.C() == 105 && vVar.C() == 115) {
            return true;
        } else {
            if (z11) {
                return false;
            }
            throw new ParserException("expected characters 'vorbis'");
        }
    }
}