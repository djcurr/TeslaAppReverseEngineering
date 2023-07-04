package i50;

import org.spongycastle.crypto.signers.PSSSigner;
import org.spongycastle.math.ec.Tnaf;

/* loaded from: classes5.dex */
public class c implements org.bouncycastle.crypto.r, r70.h {

    /* renamed from: k  reason: collision with root package name */
    private static final byte[] f29950k = {-88, 67, 95, 6, 107, 117, 108, 89, 113, -33, -121, -107, 23, -16, -40, 9, 109, -13, 29, -53, -55, 77, 44, -81, 121, -32, -105, -3, 111, 75, 69, 57, 62, -35, -93, 79, -76, -74, -102, 14, 31, -65, 21, -31, 73, -46, -109, -58, -110, 114, -98, 97, -47, 99, -6, -18, -12, 25, -43, -83, 88, -92, -69, -95, -36, -14, -125, 55, 66, -28, 122, 50, -100, -52, -85, 74, -113, 110, 4, 39, 46, -25, -30, 90, -106, 22, 35, 43, -62, 101, 102, 15, PSSSigner.TRAILER_IMPLICIT, -87, 71, 65, 52, 72, -4, -73, 106, -120, -91, 83, -122, -7, 91, -37, 56, 123, -61, 30, 34, 51, 36, 40, 54, -57, -78, 59, -114, 119, -70, -11, 20, -97, 8, 85, -101, 76, -2, 96, 92, -38, 24, 70, -51, 125, 33, -80, 63, 27, -119, -1, -21, -124, 105, 58, -99, -41, -45, 112, 103, 64, -75, -34, 93, 48, -111, -79, 120, 17, 1, -27, 0, 104, -104, -96, -59, 2, -90, 116, 45, 11, -94, 118, -77, -66, -50, -67, -82, -23, -118, 49, 28, -20, -15, -103, -108, -86, -10, 38, 47, -17, -24, -116, 53, 3, -44, Byte.MAX_VALUE, -5, 5, -63, 94, -112, 32, 61, -126, -9, -22, 10, 13, 126, -8, 80, 26, -60, 7, 87, -72, 60, 98, -29, -56, -84, 82, 100, Tnaf.POW_2_WIDTH, -48, -39, 19, 12, 18, 41, 81, -71, -49, -42, 115, -115, -127, 84, -64, -19, 78, 68, -89, 42, -123, 37, -26, -54, 124, -117, 86, Byte.MIN_VALUE};

    /* renamed from: l  reason: collision with root package name */
    private static final byte[] f29951l = {-50, -69, -21, -110, -22, -53, 19, -63, -23, 58, -42, -78, -46, -112, 23, -8, 66, 21, 86, -76, 101, 28, -120, 67, -59, 92, 54, -70, -11, 87, 103, -115, 49, -10, 100, 88, -98, -12, 34, -86, 117, 15, 2, -79, -33, 109, 115, 77, 124, 38, 46, -9, 8, 93, 68, 62, -97, 20, -56, -82, 84, Tnaf.POW_2_WIDTH, -40, PSSSigner.TRAILER_IMPLICIT, 26, 107, 105, -13, -67, 51, -85, -6, -47, -101, 104, 78, 22, -107, -111, -18, 76, 99, -114, 91, -52, 60, 25, -95, -127, 73, 123, -39, 111, 55, 96, -54, -25, 43, 72, -3, -106, 69, -4, 65, 18, 13, 121, -27, -119, -116, -29, 32, 48, -36, -73, 108, 74, -75, 63, -105, -44, 98, 45, 6, -92, -91, -125, 95, 42, -38, -55, 0, 126, -94, 85, -65, 17, -43, -100, -49, 14, 10, 61, 81, 125, -109, 27, -2, -60, 71, 9, -122, 11, -113, -99, 106, 7, -71, -80, -104, 24, 50, 113, 75, -17, 59, 112, -96, -28, 64, -1, -61, -87, -26, 120, -7, -117, 70, Byte.MIN_VALUE, 30, 56, -31, -72, -88, -32, 12, 35, 118, 29, 37, 36, 5, -15, 110, -108, 40, -102, -124, -24, -93, 79, 119, -45, -123, -30, 82, -14, -126, 80, 122, 47, 116, 83, -77, 97, -81, 57, 53, -34, -51, 31, -103, -84, -83, 114, 44, -35, -48, -121, -66, 94, -90, -20, 4, -58, 3, 52, -5, -37, 89, -74, -62, 1, -16, 90, -19, -89, 102, 33, Byte.MAX_VALUE, -118, 39, -57, -64, 41, -41};

    /* renamed from: m  reason: collision with root package name */
    private static final byte[] f29952m = {-109, -39, -102, -75, -104, 34, 69, -4, -70, 106, -33, 2, -97, -36, 81, 89, 74, 23, 43, -62, -108, -12, -69, -93, 98, -28, 113, -44, -51, 112, 22, -31, 73, 60, -64, -40, 92, -101, -83, -123, 83, -95, 122, -56, 45, -32, -47, 114, -90, 44, -60, -29, 118, 120, -73, -76, 9, 59, 14, 65, 76, -34, -78, -112, 37, -91, -41, 3, 17, 0, -61, 46, -110, -17, 78, 18, -99, 125, -53, 53, Tnaf.POW_2_WIDTH, -43, 79, -98, 77, -87, 85, -58, -48, 123, 24, -105, -45, 54, -26, 72, 86, -127, -113, 119, -52, -100, -71, -30, -84, -72, 47, 21, -92, 124, -38, 56, 30, 11, 5, -42, 20, 110, 108, 126, 102, -3, -79, -27, 96, -81, 94, 51, -121, -55, -16, 93, 109, 63, -120, -115, -57, -9, 29, -23, -20, -19, Byte.MIN_VALUE, 41, 39, -49, -103, -88, 80, 15, 55, 36, 40, 48, -107, -46, 62, 91, 64, -125, -77, 105, 87, 31, 7, 28, -118, PSSSigner.TRAILER_IMPLICIT, 32, -21, -50, -114, -85, -18, 49, -94, 115, -7, -54, 58, 26, -5, 13, -63, -2, -6, -14, 111, -67, -106, -35, 67, 82, -74, 8, -13, -82, -66, 25, -119, 50, 38, -80, -22, 75, 100, -124, -126, 107, -11, 121, -65, 1, 95, 117, 99, 27, 35, 61, 104, 42, 101, -24, -111, -10, -1, 19, 88, -15, 71, 10, Byte.MAX_VALUE, -59, -89, -25, 97, 90, 6, 70, 68, 66, 4, -96, -37, 57, -122, 84, -86, -116, 52, 33, -117, -8, 12, 116, 103};

    /* renamed from: n  reason: collision with root package name */
    private static final byte[] f29953n = {104, -115, -54, 77, 115, 75, 78, 42, -44, 82, 38, -77, 84, 30, 25, 31, 34, 3, 70, 61, 45, 74, 83, -125, 19, -118, -73, -43, 37, 121, -11, -67, 88, 47, 13, 2, -19, 81, -98, 17, -14, 62, 85, 94, -47, 22, 60, 102, 112, 93, -13, 69, 64, -52, -24, -108, 86, 8, -50, 26, 58, -46, -31, -33, -75, 56, 110, 14, -27, -12, -7, -122, -23, 79, -42, -123, 35, -49, 50, -103, 49, 20, -82, -18, -56, 72, -45, 48, -95, -110, 65, -79, 24, -60, 44, 113, 114, 68, 21, -3, 55, -66, 95, -86, -101, -120, -40, -85, -119, -100, -6, 96, -22, PSSSigner.TRAILER_IMPLICIT, 98, 12, 36, -90, -88, -20, 103, 32, -37, 124, 40, -35, -84, 91, 52, 126, Tnaf.POW_2_WIDTH, -15, 123, -113, 99, -96, 5, -102, 67, 119, 33, -65, 39, 9, -61, -97, -74, -41, 41, -62, -21, -64, -92, -117, -116, 29, -5, -1, -63, -78, -105, 46, -8, 101, -10, 117, 7, 4, 73, 51, -28, -39, -71, -48, 66, -57, 108, -112, 0, -114, 111, 80, 1, -59, -38, 71, 63, -51, 105, -94, -30, 122, -89, -58, -109, 15, 10, 6, -26, 43, -106, -93, 28, -81, 106, 18, -124, 57, -25, -80, -126, -9, -2, -99, -121, 92, -127, 53, -34, -76, -91, -4, Byte.MIN_VALUE, -17, -53, -69, 107, 118, -70, 90, 125, 120, 11, -107, -29, -83, 116, -104, 59, 54, 100, 109, -36, -16, 89, -87, 76, 23, Byte.MAX_VALUE, -111, -72, -55, 87, 27, -32, 97};

    /* renamed from: a  reason: collision with root package name */
    private int f29954a;

    /* renamed from: b  reason: collision with root package name */
    private int f29955b;

    /* renamed from: c  reason: collision with root package name */
    private int f29956c;

    /* renamed from: d  reason: collision with root package name */
    private int f29957d;

    /* renamed from: e  reason: collision with root package name */
    private long[] f29958e;

    /* renamed from: f  reason: collision with root package name */
    private long[] f29959f;

    /* renamed from: g  reason: collision with root package name */
    private long[] f29960g;

    /* renamed from: h  reason: collision with root package name */
    private long f29961h;

    /* renamed from: i  reason: collision with root package name */
    private int f29962i;

    /* renamed from: j  reason: collision with root package name */
    private byte[] f29963j;

    public c(int i11) {
        int i12;
        if (i11 != 256 && i11 != 384 && i11 != 512) {
            throw new IllegalArgumentException("Hash size is not recommended. Use 256/384/512 instead");
        }
        this.f29954a = i11 >>> 3;
        if (i11 > 256) {
            this.f29956c = 16;
            i12 = 14;
        } else {
            this.f29956c = 8;
            i12 = 10;
        }
        this.f29957d = i12;
        int i13 = this.f29956c;
        int i14 = i13 << 3;
        this.f29955b = i14;
        long[] jArr = new long[i13];
        this.f29958e = jArr;
        jArr[0] = i14;
        this.f29959f = new long[i13];
        this.f29960g = new long[i13];
        this.f29963j = new byte[i14];
    }

    public c(c cVar) {
        d(cVar);
    }

    private void b(long[] jArr) {
        for (int i11 = 0; i11 < this.f29957d; i11++) {
            long j11 = i11;
            for (int i12 = 0; i12 < this.f29956c; i12++) {
                jArr[i12] = jArr[i12] ^ j11;
                j11 += 16;
            }
            i(jArr);
            j(jArr);
            f(jArr);
        }
    }

    private void c(long[] jArr) {
        for (int i11 = 0; i11 < this.f29957d; i11++) {
            long j11 = ((((this.f29956c - 1) << 4) ^ i11) << 56) | 67818912035696883L;
            for (int i12 = 0; i12 < this.f29956c; i12++) {
                jArr[i12] = jArr[i12] + j11;
                j11 -= 1152921504606846976L;
            }
            i(jArr);
            j(jArr);
            f(jArr);
        }
    }

    private void d(c cVar) {
        this.f29954a = cVar.f29954a;
        this.f29955b = cVar.f29955b;
        this.f29957d = cVar.f29957d;
        int i11 = this.f29956c;
        if (i11 <= 0 || i11 != cVar.f29956c) {
            this.f29956c = cVar.f29956c;
            this.f29958e = org.bouncycastle.util.a.l(cVar.f29958e);
            int i12 = this.f29956c;
            this.f29959f = new long[i12];
            this.f29960g = new long[i12];
            this.f29963j = org.bouncycastle.util.a.h(cVar.f29963j);
        } else {
            System.arraycopy(cVar.f29958e, 0, this.f29958e, 0, i11);
            System.arraycopy(cVar.f29963j, 0, this.f29963j, 0, this.f29955b);
        }
        this.f29961h = cVar.f29961h;
        this.f29962i = cVar.f29962i;
    }

    private static long e(long j11) {
        long j12 = ((9187201950435737471L & j11) << 1) ^ (((j11 & (-9187201950435737472L)) >>> 7) * 29);
        long h11 = h(8, j11) ^ j11;
        long h12 = (h11 ^ h(16, h11)) ^ h(48, j11);
        long j13 = (j11 ^ h12) ^ j12;
        long j14 = (((-9187201950435737472L) & j13) >>> 6) * 29;
        return ((h(32, (((j13 & 4629771061636907072L) >>> 6) * 29) ^ (j14 ^ ((4557430888798830399L & j13) << 2))) ^ h12) ^ h(40, j12)) ^ h(48, j12);
    }

    private void f(long[] jArr) {
        for (int i11 = 0; i11 < this.f29956c; i11++) {
            jArr[i11] = e(jArr[i11]);
        }
    }

    private void g(byte[] bArr, int i11) {
        for (int i12 = 0; i12 < this.f29956c; i12++) {
            long p11 = r70.i.p(bArr, i11);
            i11 += 8;
            this.f29959f[i12] = this.f29958e[i12] ^ p11;
            this.f29960g[i12] = p11;
        }
        b(this.f29959f);
        c(this.f29960g);
        for (int i13 = 0; i13 < this.f29956c; i13++) {
            long[] jArr = this.f29958e;
            jArr[i13] = jArr[i13] ^ (this.f29959f[i13] ^ this.f29960g[i13]);
        }
    }

    private static long h(int i11, long j11) {
        return (j11 << (-i11)) | (j11 >>> i11);
    }

    private void i(long[] jArr) {
        int i11 = this.f29956c;
        if (i11 == 8) {
            long j11 = jArr[0];
            long j12 = jArr[1];
            long j13 = jArr[2];
            long j14 = jArr[3];
            long j15 = jArr[4];
            long j16 = jArr[5];
            long j17 = jArr[6];
            long j18 = jArr[7];
            long j19 = (j11 ^ j15) & (-4294967296L);
            long j21 = j11 ^ j19;
            long j22 = j15 ^ j19;
            long j23 = (j12 ^ j16) & 72057594021150720L;
            long j24 = j12 ^ j23;
            long j25 = j16 ^ j23;
            long j26 = (j13 ^ j17) & 281474976645120L;
            long j27 = j13 ^ j26;
            long j28 = j17 ^ j26;
            long j29 = (j14 ^ j18) & 1099511627520L;
            long j31 = j14 ^ j29;
            long j32 = j18 ^ j29;
            long j33 = (j21 ^ j27) & (-281470681808896L);
            long j34 = j21 ^ j33;
            long j35 = j27 ^ j33;
            long j36 = (j24 ^ j31) & 72056494543077120L;
            long j37 = j24 ^ j36;
            long j38 = j31 ^ j36;
            long j39 = (j22 ^ j28) & (-281470681808896L);
            long j41 = j22 ^ j39;
            long j42 = j28 ^ j39;
            long j43 = (j25 ^ j32) & 72056494543077120L;
            long j44 = j25 ^ j43;
            long j45 = j32 ^ j43;
            long j46 = (j34 ^ j37) & (-71777214294589696L);
            long j47 = j34 ^ j46;
            long j48 = j37 ^ j46;
            long j49 = (j35 ^ j38) & (-71777214294589696L);
            long j51 = j35 ^ j49;
            long j52 = j38 ^ j49;
            long j53 = (j41 ^ j44) & (-71777214294589696L);
            long j54 = (j42 ^ j45) & (-71777214294589696L);
            jArr[0] = j47;
            jArr[1] = j48;
            jArr[2] = j51;
            jArr[3] = j52;
            jArr[4] = j41 ^ j53;
            jArr[5] = j44 ^ j53;
            jArr[6] = j42 ^ j54;
            jArr[7] = j45 ^ j54;
        } else if (i11 != 16) {
            throw new IllegalStateException("unsupported state size: only 512/1024 are allowed");
        } else {
            long j55 = jArr[0];
            long j56 = jArr[1];
            long j57 = jArr[2];
            long j58 = jArr[3];
            long j59 = jArr[4];
            long j61 = jArr[5];
            long j62 = jArr[6];
            long j63 = jArr[7];
            long j64 = jArr[8];
            long j65 = jArr[9];
            long j66 = jArr[10];
            long j67 = jArr[11];
            long j68 = jArr[12];
            long j69 = jArr[13];
            long j71 = jArr[14];
            long j72 = jArr[15];
            long j73 = (j55 ^ j64) & (-72057594037927936L);
            long j74 = j55 ^ j73;
            long j75 = j64 ^ j73;
            long j76 = (j56 ^ j65) & (-72057594037927936L);
            long j77 = j56 ^ j76;
            long j78 = j65 ^ j76;
            long j79 = (j57 ^ j66) & (-281474976710656L);
            long j81 = j57 ^ j79;
            long j82 = j66 ^ j79;
            long j83 = (j58 ^ j67) & (-1099511627776L);
            long j84 = j58 ^ j83;
            long j85 = j67 ^ j83;
            long j86 = (j59 ^ j68) & (-4294967296L);
            long j87 = j59 ^ j86;
            long j88 = j68 ^ j86;
            long j89 = (j61 ^ j69) & 72057594021150720L;
            long j90 = j61 ^ j89;
            long j91 = j69 ^ j89;
            long j92 = (j62 ^ j71) & 72057594037862400L;
            long j93 = j62 ^ j92;
            long j94 = j71 ^ j92;
            long j95 = (j63 ^ j72) & 72057594037927680L;
            long j96 = j63 ^ j95;
            long j97 = j72 ^ j95;
            long j98 = (j74 ^ j87) & 72057589742960640L;
            long j99 = j74 ^ j98;
            long j100 = j87 ^ j98;
            long j101 = (j77 ^ j90) & (-16777216);
            long j102 = j77 ^ j101;
            long j103 = j90 ^ j101;
            long j104 = (j81 ^ j93) & (-71776119061282816L);
            long j105 = j81 ^ j104;
            long j106 = j93 ^ j104;
            long j107 = (j84 ^ j96) & (-72056494526300416L);
            long j108 = j84 ^ j107;
            long j109 = j96 ^ j107;
            long j110 = (j75 ^ j88) & 72057589742960640L;
            long j111 = j75 ^ j110;
            long j112 = j88 ^ j110;
            long j113 = (j78 ^ j91) & (-16777216);
            long j114 = j78 ^ j113;
            long j115 = j91 ^ j113;
            long j116 = (j82 ^ j94) & (-71776119061282816L);
            long j117 = j82 ^ j116;
            long j118 = j94 ^ j116;
            long j119 = (j85 ^ j97) & (-72056494526300416L);
            long j120 = j85 ^ j119;
            long j121 = j97 ^ j119;
            long j122 = (j99 ^ j105) & (-281470681808896L);
            long j123 = j99 ^ j122;
            long j124 = j105 ^ j122;
            long j125 = (j102 ^ j108) & 72056494543077120L;
            long j126 = j102 ^ j125;
            long j127 = j108 ^ j125;
            long j128 = (j100 ^ j106) & (-281470681808896L);
            long j129 = j100 ^ j128;
            long j130 = j106 ^ j128;
            long j131 = (j103 ^ j109) & 72056494543077120L;
            long j132 = j103 ^ j131;
            long j133 = j109 ^ j131;
            long j134 = (j111 ^ j117) & (-281470681808896L);
            long j135 = j111 ^ j134;
            long j136 = j117 ^ j134;
            long j137 = (j114 ^ j120) & 72056494543077120L;
            long j138 = j114 ^ j137;
            long j139 = j120 ^ j137;
            long j140 = (j112 ^ j118) & (-281470681808896L);
            long j141 = j112 ^ j140;
            long j142 = j118 ^ j140;
            long j143 = (j115 ^ j121) & 72056494543077120L;
            long j144 = j115 ^ j143;
            long j145 = j121 ^ j143;
            long j146 = (j123 ^ j126) & (-71777214294589696L);
            long j147 = j123 ^ j146;
            long j148 = j126 ^ j146;
            long j149 = (j124 ^ j127) & (-71777214294589696L);
            long j150 = j124 ^ j149;
            long j151 = j127 ^ j149;
            long j152 = (j129 ^ j132) & (-71777214294589696L);
            long j153 = j129 ^ j152;
            long j154 = j132 ^ j152;
            long j155 = (j130 ^ j133) & (-71777214294589696L);
            long j156 = j130 ^ j155;
            long j157 = j133 ^ j155;
            long j158 = (j135 ^ j138) & (-71777214294589696L);
            long j159 = j135 ^ j158;
            long j160 = j138 ^ j158;
            long j161 = (j136 ^ j139) & (-71777214294589696L);
            long j162 = j136 ^ j161;
            long j163 = j139 ^ j161;
            long j164 = (j141 ^ j144) & (-71777214294589696L);
            long j165 = (j142 ^ j145) & (-71777214294589696L);
            jArr[0] = j147;
            jArr[1] = j148;
            jArr[2] = j150;
            jArr[3] = j151;
            jArr[4] = j153;
            jArr[5] = j154;
            jArr[6] = j156;
            jArr[7] = j157;
            jArr[8] = j159;
            jArr[9] = j160;
            jArr[10] = j162;
            jArr[11] = j163;
            jArr[12] = j141 ^ j164;
            jArr[13] = j144 ^ j164;
            jArr[14] = j142 ^ j165;
            jArr[15] = j145 ^ j165;
        }
    }

    private void j(long[] jArr) {
        for (int i11 = 0; i11 < this.f29956c; i11++) {
            long j11 = jArr[i11];
            int i12 = (int) j11;
            int i13 = (int) (j11 >>> 32);
            byte[] bArr = f29950k;
            byte b11 = bArr[i12 & 255];
            byte[] bArr2 = f29951l;
            byte b12 = bArr2[(i12 >>> 8) & 255];
            byte[] bArr3 = f29952m;
            byte b13 = bArr3[(i12 >>> 16) & 255];
            byte[] bArr4 = f29953n;
            int i14 = (bArr4[i12 >>> 24] << 24) | (b11 & 255) | ((b12 & 255) << 8) | ((b13 & 255) << 16);
            byte b14 = bArr[i13 & 255];
            byte b15 = bArr2[(i13 >>> 8) & 255];
            byte b16 = bArr3[(i13 >>> 16) & 255];
            jArr[i11] = (i14 & 4294967295L) | (((bArr4[i13 >>> 24] << 24) | (((b14 & 255) | ((b15 & 255) << 8)) | ((b16 & 255) << 16))) << 32);
        }
    }

    @Override // r70.h
    public void a(r70.h hVar) {
        d((c) hVar);
    }

    @Override // r70.h
    public r70.h copy() {
        return new c(this);
    }

    @Override // org.bouncycastle.crypto.p
    public int doFinal(byte[] bArr, int i11) {
        int i12;
        int i13;
        int i14 = this.f29962i;
        byte[] bArr2 = this.f29963j;
        int i15 = i14 + 1;
        this.f29962i = i15;
        bArr2[i14] = Byte.MIN_VALUE;
        int i16 = this.f29955b - 12;
        int i17 = 0;
        if (i15 > i16) {
            while (true) {
                int i18 = this.f29962i;
                if (i18 >= this.f29955b) {
                    break;
                }
                byte[] bArr3 = this.f29963j;
                this.f29962i = i18 + 1;
                bArr3[i18] = 0;
            }
            this.f29962i = 0;
            g(this.f29963j, 0);
        }
        while (true) {
            i12 = this.f29962i;
            if (i12 >= i16) {
                break;
            }
            byte[] bArr4 = this.f29963j;
            this.f29962i = i12 + 1;
            bArr4[i12] = 0;
        }
        long j11 = (((this.f29961h & 4294967295L) * this.f29955b) + i14) << 3;
        r70.i.i((int) j11, this.f29963j, i12);
        int i19 = this.f29962i + 4;
        this.f29962i = i19;
        r70.i.v((j11 >>> 32) + (((this.f29961h >>> 32) * this.f29955b) << 3), this.f29963j, i19);
        g(this.f29963j, 0);
        System.arraycopy(this.f29958e, 0, this.f29959f, 0, this.f29956c);
        b(this.f29959f);
        while (true) {
            i13 = this.f29956c;
            if (i17 >= i13) {
                break;
            }
            long[] jArr = this.f29958e;
            jArr[i17] = jArr[i17] ^ this.f29959f[i17];
            i17++;
        }
        for (int i21 = i13 - (this.f29954a >>> 3); i21 < this.f29956c; i21++) {
            r70.i.v(this.f29958e[i21], bArr, i11);
            i11 += 8;
        }
        reset();
        return this.f29954a;
    }

    @Override // org.bouncycastle.crypto.p
    public String getAlgorithmName() {
        return "DSTU7564";
    }

    @Override // org.bouncycastle.crypto.r
    public int getByteLength() {
        return this.f29955b;
    }

    @Override // org.bouncycastle.crypto.p
    public int getDigestSize() {
        return this.f29954a;
    }

    @Override // org.bouncycastle.crypto.p
    public void reset() {
        org.bouncycastle.util.a.C(this.f29958e, 0L);
        this.f29958e[0] = this.f29955b;
        this.f29961h = 0L;
        this.f29962i = 0;
    }

    @Override // org.bouncycastle.crypto.p
    public void update(byte b11) {
        byte[] bArr = this.f29963j;
        int i11 = this.f29962i;
        int i12 = i11 + 1;
        this.f29962i = i12;
        bArr[i11] = b11;
        if (i12 == this.f29955b) {
            g(bArr, 0);
            this.f29962i = 0;
            this.f29961h++;
        }
    }

    @Override // org.bouncycastle.crypto.p
    public void update(byte[] bArr, int i11, int i12) {
        while (this.f29962i != 0 && i12 > 0) {
            update(bArr[i11]);
            i12--;
            i11++;
        }
        if (i12 > 0) {
            while (i12 >= this.f29955b) {
                g(bArr, i11);
                int i13 = this.f29955b;
                i11 += i13;
                i12 -= i13;
                this.f29961h++;
            }
            while (i12 > 0) {
                update(bArr[i11]);
                i12--;
                i11++;
            }
        }
    }
}