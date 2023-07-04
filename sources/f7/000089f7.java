package n60;

import java.math.BigInteger;
import org.spongycastle.math.ec.Tnaf;

/* loaded from: classes5.dex */
class o implements Cloneable {

    /* renamed from: b  reason: collision with root package name */
    private static final short[] f40643b = {0, 1, 4, 5, 16, 17, 20, 21, 64, 65, 68, 69, 80, 81, 84, 85, 256, 257, 260, 261, 272, 273, 276, 277, 320, 321, 324, 325, 336, 337, 340, 341, 1024, 1025, 1028, 1029, 1040, 1041, 1044, 1045, 1088, 1089, 1092, 1093, 1104, 1105, 1108, 1109, 1280, 1281, 1284, 1285, 1296, 1297, 1300, 1301, 1344, 1345, 1348, 1349, 1360, 1361, 1364, 1365, 4096, 4097, 4100, 4101, 4112, 4113, 4116, 4117, 4160, 4161, 4164, 4165, 4176, 4177, 4180, 4181, 4352, 4353, 4356, 4357, 4368, 4369, 4372, 4373, 4416, 4417, 4420, 4421, 4432, 4433, 4436, 4437, 5120, 5121, 5124, 5125, 5136, 5137, 5140, 5141, 5184, 5185, 5188, 5189, 5200, 5201, 5204, 5205, 5376, 5377, 5380, 5381, 5392, 5393, 5396, 5397, 5440, 5441, 5444, 5445, 5456, 5457, 5460, 5461, 16384, 16385, 16388, 16389, 16400, 16401, 16404, 16405, 16448, 16449, 16452, 16453, 16464, 16465, 16468, 16469, 16640, 16641, 16644, 16645, 16656, 16657, 16660, 16661, 16704, 16705, 16708, 16709, 16720, 16721, 16724, 16725, 17408, 17409, 17412, 17413, 17424, 17425, 17428, 17429, 17472, 17473, 17476, 17477, 17488, 17489, 17492, 17493, 17664, 17665, 17668, 17669, 17680, 17681, 17684, 17685, 17728, 17729, 17732, 17733, 17744, 17745, 17748, 17749, 20480, 20481, 20484, 20485, 20496, 20497, 20500, 20501, 20544, 20545, 20548, 20549, 20560, 20561, 20564, 20565, 20736, 20737, 20740, 20741, 20752, 20753, 20756, 20757, 20800, 20801, 20804, 20805, 20816, 20817, 20820, 20821, 21504, 21505, 21508, 21509, 21520, 21521, 21524, 21525, 21568, 21569, 21572, 21573, 21584, 21585, 21588, 21589, 21760, 21761, 21764, 21765, 21776, 21777, 21780, 21781, 21824, 21825, 21828, 21829, 21840, 21841, 21844, 21845};

    /* renamed from: c  reason: collision with root package name */
    static final byte[] f40644c = {0, 1, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8};

    /* renamed from: a  reason: collision with root package name */
    private long[] f40645a;

    public o(int i11) {
        this.f40645a = new long[i11];
    }

    public o(BigInteger bigInteger) {
        int i11;
        if (bigInteger == null || bigInteger.signum() < 0) {
            throw new IllegalArgumentException("invalid F2m field value");
        }
        if (bigInteger.signum() == 0) {
            this.f40645a = new long[]{0};
            return;
        }
        byte[] byteArray = bigInteger.toByteArray();
        int length = byteArray.length;
        if (byteArray[0] == 0) {
            length--;
            i11 = 1;
        } else {
            i11 = 0;
        }
        int i12 = (length + 7) / 8;
        this.f40645a = new long[i12];
        int i13 = i12 - 1;
        int i14 = (length % 8) + i11;
        if (i11 < i14) {
            long j11 = 0;
            while (i11 < i14) {
                j11 = (j11 << 8) | (byteArray[i11] & 255);
                i11++;
            }
            this.f40645a[i13] = j11;
            i13--;
        }
        while (i13 >= 0) {
            long j12 = 0;
            int i15 = 0;
            while (i15 < 8) {
                j12 = (j12 << 8) | (byteArray[i11] & 255);
                i15++;
                i11++;
            }
            this.f40645a[i13] = j12;
            i13--;
        }
    }

    public o(long[] jArr) {
        this.f40645a = jArr;
    }

    public o(long[] jArr, int i11, int i12) {
        if (i11 == 0 && i12 == jArr.length) {
            this.f40645a = jArr;
            return;
        }
        long[] jArr2 = new long[i12];
        this.f40645a = jArr2;
        System.arraycopy(jArr, i11, jArr2, 0, i12);
    }

    private static void B(long[] jArr, int i11, int i12, int i13, int[] iArr) {
        m(jArr, i11, i12);
        int i14 = i12 - i13;
        int length = iArr.length;
        while (true) {
            length--;
            if (length < 0) {
                m(jArr, i11, i14);
                return;
            }
            m(jArr, i11, iArr[length] + i14);
        }
    }

    private static void C(long[] jArr, int i11, int i12, int i13, int[] iArr) {
        while (true) {
            i12--;
            if (i12 < i13) {
                return;
            }
            if (N(jArr, i11, i12)) {
                B(jArr, i11, i12, i13, iArr);
            }
        }
    }

    private static int E(long[] jArr, int i11, int i12, int i13, int[] iArr) {
        int i14 = (i13 + 63) >>> 6;
        if (i12 < i14) {
            return i12;
        }
        int i15 = i12 << 6;
        int min = Math.min(i15, (i13 << 1) - 1);
        int i16 = i15 - min;
        int i17 = i12;
        while (i16 >= 64) {
            i17--;
            i16 -= 64;
        }
        int length = iArr.length;
        int i18 = iArr[length - 1];
        int i19 = length > 1 ? iArr[length - 2] : 0;
        int max = Math.max(i13, i18 + 64);
        int min2 = (i16 + Math.min(min - max, i13 - i19)) >> 6;
        if (min2 > 1) {
            int i21 = i17 - min2;
            G(jArr, i11, i17, i21, i13, iArr);
            while (i17 > i21) {
                i17--;
                jArr[i11 + i17] = 0;
            }
            min = i21 << 6;
        }
        if (min > max) {
            I(jArr, i11, i17, max, i13, iArr);
        } else {
            max = min;
        }
        if (max > i13) {
            C(jArr, i11, max, i13, iArr);
        }
        return i14;
    }

    private static o F(long[] jArr, int i11, int i12, int i13, int[] iArr) {
        return new o(jArr, i11, E(jArr, i11, i12, i13, iArr));
    }

    private static void G(long[] jArr, int i11, int i12, int i13, int i14, int[] iArr) {
        int i15 = (i13 << 6) - i14;
        int length = iArr.length;
        while (true) {
            length--;
            if (length < 0) {
                n(jArr, i11, jArr, i11 + i13, i12 - i13, i15);
                return;
            }
            n(jArr, i11, jArr, i11 + i13, i12 - i13, i15 + iArr[length]);
        }
    }

    private static void H(long[] jArr, int i11, int i12, long j11, int i13, int[] iArr) {
        int i14 = i12 - i13;
        int length = iArr.length;
        while (true) {
            length--;
            if (length < 0) {
                o(jArr, i11, i14, j11);
                return;
            }
            o(jArr, i11, iArr[length] + i14, j11);
        }
    }

    private static void I(long[] jArr, int i11, int i12, int i13, int i14, int[] iArr) {
        int i15 = i13 >>> 6;
        int i16 = i12;
        while (true) {
            int i17 = i16 - 1;
            if (i17 <= i15) {
                break;
            }
            int i18 = i11 + i17;
            long j11 = jArr[i18];
            if (j11 != 0) {
                jArr[i18] = 0;
                H(jArr, i11, i17 << 6, j11, i14, iArr);
            }
            i16 = i17;
        }
        int i19 = i13 & 63;
        int i21 = i11 + i15;
        long j12 = jArr[i21] >>> i19;
        if (j12 != 0) {
            jArr[i21] = jArr[i21] ^ (j12 << i19);
            H(jArr, i11, i13, j12, i14, iArr);
        }
    }

    private long[] J(int i11) {
        long[] jArr = new long[i11];
        long[] jArr2 = this.f40645a;
        System.arraycopy(jArr2, 0, jArr, 0, Math.min(jArr2.length, i11));
        return jArr;
    }

    private static long K(long[] jArr, int i11, long[] jArr2, int i12, int i13, int i14) {
        int i15 = 64 - i14;
        long j11 = 0;
        for (int i16 = 0; i16 < i13; i16++) {
            long j12 = jArr[i11 + i16];
            jArr2[i12 + i16] = j11 | (j12 << i14);
            j11 = j12 >>> i15;
        }
        return j11;
    }

    private static void M(long[] jArr, int i11, int i12, int[] iArr) {
        int i13 = i11 << 1;
        while (true) {
            i11--;
            if (i11 < 0) {
                return;
            }
            long j11 = jArr[i11];
            int i14 = i13 - 1;
            jArr[i14] = r((int) (j11 >>> 32));
            i13 = i14 - 1;
            jArr[i13] = r((int) j11);
        }
    }

    private static boolean N(long[] jArr, int i11, int i12) {
        return (jArr[i11 + (i12 >>> 6)] & (1 << (i12 & 63))) != 0;
    }

    private static void a(long[] jArr, int i11, long[] jArr2, int i12, int i13) {
        for (int i14 = 0; i14 < i13; i14++) {
            int i15 = i11 + i14;
            jArr[i15] = jArr[i15] ^ jArr2[i12 + i14];
        }
    }

    private static void b(long[] jArr, int i11, long[] jArr2, int i12, long[] jArr3, int i13, int i14) {
        for (int i15 = 0; i15 < i14; i15++) {
            jArr3[i13 + i15] = jArr[i11 + i15] ^ jArr2[i12 + i15];
        }
    }

    private static void c(long[] jArr, int i11, long[] jArr2, int i12, long[] jArr3, int i13, int i14) {
        for (int i15 = 0; i15 < i14; i15++) {
            int i16 = i11 + i15;
            jArr[i16] = jArr[i16] ^ (jArr2[i12 + i15] ^ jArr3[i13 + i15]);
        }
    }

    private void e(o oVar, int i11, int i12) {
        int i13 = (i11 + 63) >>> 6;
        int i14 = i12 >>> 6;
        int i15 = i12 & 63;
        if (i15 == 0) {
            a(this.f40645a, i14, oVar.f40645a, 0, i13);
            return;
        }
        long h11 = h(this.f40645a, i14, oVar.f40645a, 0, i13, i15);
        if (h11 != 0) {
            long[] jArr = this.f40645a;
            int i16 = i13 + i14;
            jArr[i16] = h11 ^ jArr[i16];
        }
    }

    private static long g(long[] jArr, int i11, long[] jArr2, int i12, int i13, int i14) {
        int i15 = 64 - i14;
        long j11 = 0;
        while (true) {
            i13--;
            if (i13 < 0) {
                return j11;
            }
            long j12 = jArr2[i12 + i13];
            int i16 = i11 + i13;
            jArr[i16] = (j11 | (j12 >>> i14)) ^ jArr[i16];
            j11 = j12 << i15;
        }
    }

    private static long h(long[] jArr, int i11, long[] jArr2, int i12, int i13, int i14) {
        int i15 = 64 - i14;
        long j11 = 0;
        for (int i16 = 0; i16 < i13; i16++) {
            long j12 = jArr2[i12 + i16];
            int i17 = i11 + i16;
            jArr[i17] = (j11 | (j12 << i14)) ^ jArr[i17];
            j11 = j12 >>> i15;
        }
        return j11;
    }

    private static int i(long j11) {
        int i11;
        int i12 = 32;
        int i13 = (int) (j11 >>> 32);
        if (i13 == 0) {
            i13 = (int) j11;
            i12 = 0;
        }
        int i14 = i13 >>> 16;
        if (i14 == 0) {
            int i15 = i13 >>> 8;
            i11 = i15 == 0 ? f40644c[i13] : f40644c[i15] + 8;
        } else {
            int i16 = i14 >>> 8;
            i11 = i16 == 0 ? f40644c[i14] + Tnaf.POW_2_WIDTH : f40644c[i16] + 24;
        }
        return i12 + i11;
    }

    private int l(int i11) {
        int i12 = (i11 + 62) >>> 6;
        while (i12 != 0) {
            i12--;
            long j11 = this.f40645a[i12];
            if (j11 != 0) {
                return (i12 << 6) + i(j11);
            }
        }
        return 0;
    }

    private static void m(long[] jArr, int i11, int i12) {
        int i13 = i11 + (i12 >>> 6);
        jArr[i13] = jArr[i13] ^ (1 << (i12 & 63));
    }

    private static void n(long[] jArr, int i11, long[] jArr2, int i12, int i13, int i14) {
        int i15 = i11 + (i14 >>> 6);
        int i16 = i14 & 63;
        if (i16 == 0) {
            a(jArr, i15, jArr2, i12, i13);
        } else {
            jArr[i15] = g(jArr, i15 + 1, jArr2, i12, i13, 64 - i16) ^ jArr[i15];
        }
    }

    private static void o(long[] jArr, int i11, int i12, long j11) {
        int i13 = i11 + (i12 >>> 6);
        int i14 = i12 & 63;
        if (i14 == 0) {
            jArr[i13] = jArr[i13] ^ j11;
            return;
        }
        jArr[i13] = jArr[i13] ^ (j11 << i14);
        long j12 = j11 >>> (64 - i14);
        if (j12 != 0) {
            int i15 = i13 + 1;
            jArr[i15] = j12 ^ jArr[i15];
        }
    }

    private static long r(int i11) {
        short[] sArr = f40643b;
        int i12 = sArr[i11 & 255] | (sArr[(i11 >>> 8) & 255] << 16);
        short s11 = sArr[(i11 >>> 16) & 255];
        return (i12 & 4294967295L) | ((((sArr[i11 >>> 24] << 16) | s11) & 4294967295L) << 32);
    }

    private static void z(long j11, long[] jArr, int i11, long[] jArr2, int i12) {
        if ((j11 & 1) != 0) {
            a(jArr2, i12, jArr, 0, i11);
        }
        long j12 = j11;
        int i13 = 1;
        while (true) {
            long j13 = j12 >>> 1;
            if (j13 == 0) {
                return;
            }
            if ((j13 & 1) != 0) {
                long h11 = h(jArr2, i12, jArr, 0, i11, i13);
                if (h11 != 0) {
                    int i14 = i12 + i11;
                    jArr2[i14] = h11 ^ jArr2[i14];
                }
            }
            i13++;
            j12 = j13;
        }
    }

    public void A(int i11, int[] iArr) {
        long[] jArr = this.f40645a;
        int E = E(jArr, 0, jArr.length, i11, iArr);
        if (E < jArr.length) {
            long[] jArr2 = new long[E];
            this.f40645a = jArr2;
            System.arraycopy(jArr, 0, jArr2, 0, E);
        }
    }

    public o L(int i11, int[] iArr) {
        int p11 = p();
        if (p11 == 0) {
            return this;
        }
        int i12 = p11 << 1;
        long[] jArr = new long[i12];
        int i13 = 0;
        while (i13 < i12) {
            long j11 = this.f40645a[i13 >>> 1];
            int i14 = i13 + 1;
            jArr[i13] = r((int) j11);
            i13 = i14 + 1;
            jArr[i14] = r((int) (j11 >>> 32));
        }
        return new o(jArr, 0, i12);
    }

    public boolean O() {
        long[] jArr = this.f40645a;
        return jArr.length > 0 && (1 & jArr[0]) != 0;
    }

    public BigInteger P() {
        int p11 = p();
        if (p11 == 0) {
            return d.f40584a;
        }
        int i11 = p11 - 1;
        long j11 = this.f40645a[i11];
        byte[] bArr = new byte[8];
        int i12 = 0;
        boolean z11 = false;
        for (int i13 = 7; i13 >= 0; i13--) {
            byte b11 = (byte) (j11 >>> (i13 * 8));
            if (z11 || b11 != 0) {
                bArr[i12] = b11;
                i12++;
                z11 = true;
            }
        }
        byte[] bArr2 = new byte[(i11 * 8) + i12];
        for (int i14 = 0; i14 < i12; i14++) {
            bArr2[i14] = bArr[i14];
        }
        for (int i15 = p11 - 2; i15 >= 0; i15--) {
            long j12 = this.f40645a[i15];
            int i16 = 7;
            while (i16 >= 0) {
                bArr2[i12] = (byte) (j12 >>> (i16 * 8));
                i16--;
                i12++;
            }
        }
        return new BigInteger(1, bArr2);
    }

    public Object clone() {
        return new o(org.bouncycastle.util.a.l(this.f40645a));
    }

    public o d() {
        if (this.f40645a.length == 0) {
            return new o(new long[]{1});
        }
        long[] J = J(Math.max(1, p()));
        J[0] = 1 ^ J[0];
        return new o(J);
    }

    public boolean equals(Object obj) {
        if (obj instanceof o) {
            o oVar = (o) obj;
            int p11 = p();
            if (oVar.p() != p11) {
                return false;
            }
            for (int i11 = 0; i11 < p11; i11++) {
                if (this.f40645a[i11] != oVar.f40645a[i11]) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public void f(o oVar, int i11) {
        int p11 = oVar.p();
        if (p11 == 0) {
            return;
        }
        int i12 = p11 + i11;
        if (i12 > this.f40645a.length) {
            this.f40645a = J(i12);
        }
        a(this.f40645a, i11, oVar.f40645a, 0, p11);
    }

    public int hashCode() {
        int p11 = p();
        int i11 = 1;
        for (int i12 = 0; i12 < p11; i12++) {
            long j11 = this.f40645a[i12];
            i11 = (((i11 * 31) ^ ((int) j11)) * 31) ^ ((int) (j11 >>> 32));
        }
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j(long[] jArr, int i11) {
        long[] jArr2 = this.f40645a;
        System.arraycopy(jArr2, 0, jArr, i11, jArr2.length);
    }

    public int k() {
        int length = this.f40645a.length;
        while (length != 0) {
            length--;
            long j11 = this.f40645a[length];
            if (j11 != 0) {
                return (length << 6) + i(j11);
            }
        }
        return 0;
    }

    public int p() {
        return q(this.f40645a.length);
    }

    public int q(int i11) {
        long[] jArr = this.f40645a;
        int min = Math.min(i11, jArr.length);
        if (min < 1) {
            return 0;
        }
        if (jArr[0] != 0) {
            do {
                min--;
            } while (jArr[min] == 0);
            return min + 1;
        }
        do {
            min--;
            if (jArr[min] != 0) {
                return min + 1;
            }
        } while (min > 0);
        return 0;
    }

    public boolean s() {
        long[] jArr = this.f40645a;
        if (jArr[0] != 1) {
            return false;
        }
        for (int i11 = 1; i11 < jArr.length; i11++) {
            if (jArr[i11] != 0) {
                return false;
            }
        }
        return true;
    }

    public boolean t() {
        for (long j11 : this.f40645a) {
            if (j11 != 0) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        int p11 = p();
        if (p11 == 0) {
            return "0";
        }
        int i11 = p11 - 1;
        StringBuffer stringBuffer = new StringBuffer(Long.toBinaryString(this.f40645a[i11]));
        while (true) {
            i11--;
            if (i11 < 0) {
                return stringBuffer.toString();
            }
            String binaryString = Long.toBinaryString(this.f40645a[i11]);
            int length = binaryString.length();
            if (length < 64) {
                stringBuffer.append("0000000000000000000000000000000000000000000000000000000000000000".substring(length));
            }
            stringBuffer.append(binaryString);
        }
    }

    public o u(int i11, int[] iArr) {
        int k11 = k();
        if (k11 == 0) {
            throw new IllegalStateException();
        }
        int i12 = 1;
        if (k11 == 1) {
            return this;
        }
        int i13 = (i11 + 63) >>> 6;
        o oVar = new o(i13);
        B(oVar.f40645a, 0, i11, i11, iArr);
        o oVar2 = new o(i13);
        oVar2.f40645a[0] = 1;
        o oVar3 = new o(i13);
        int[] iArr2 = new int[2];
        iArr2[0] = k11;
        iArr2[1] = i11 + 1;
        o[] oVarArr = {(o) clone(), oVar};
        int[] iArr3 = {1, 0};
        o[] oVarArr2 = {oVar2, oVar3};
        int i14 = iArr2[1];
        int i15 = iArr3[1];
        int i16 = i14 - iArr2[0];
        while (true) {
            if (i16 < 0) {
                i16 = -i16;
                iArr2[i12] = i14;
                iArr3[i12] = i15;
                int i17 = 1 - i12;
                int i18 = iArr2[i17];
                i15 = iArr3[i17];
                i12 = i17;
                i14 = i18;
            }
            int i19 = 1 - i12;
            oVarArr[i12].e(oVarArr[i19], iArr2[i19], i16);
            int l11 = oVarArr[i12].l(i14);
            if (l11 == 0) {
                return oVarArr2[i19];
            }
            int i21 = iArr3[i19];
            oVarArr2[i12].e(oVarArr2[i19], i21, i16);
            int i22 = i21 + i16;
            if (i22 > i15) {
                i15 = i22;
            } else if (i22 == i15) {
                i15 = oVarArr2[i12].l(i15);
            }
            i16 += l11 - i14;
            i14 = l11;
        }
    }

    public o v(o oVar, int i11, int[] iArr) {
        int i12;
        int i13;
        o oVar2;
        o oVar3;
        int i14;
        long[] jArr;
        int i15;
        int k11 = k();
        if (k11 == 0) {
            return this;
        }
        int k12 = oVar.k();
        if (k12 == 0) {
            return oVar;
        }
        if (k11 > k12) {
            i13 = k11;
            i12 = k12;
            oVar3 = this;
            oVar2 = oVar;
        } else {
            i12 = k11;
            i13 = k12;
            oVar2 = this;
            oVar3 = oVar;
        }
        int i16 = (i12 + 63) >>> 6;
        int i17 = (i13 + 63) >>> 6;
        int i18 = ((i12 + i13) + 62) >>> 6;
        if (i16 == 1) {
            long j11 = oVar2.f40645a[0];
            if (j11 == 1) {
                return oVar3;
            }
            long[] jArr2 = new long[i18];
            z(j11, oVar3.f40645a, i17, jArr2, 0);
            return F(jArr2, 0, i18, i11, iArr);
        }
        int i19 = ((i13 + 7) + 63) >>> 6;
        int[] iArr2 = new int[16];
        int i21 = i19 << 4;
        long[] jArr3 = new long[i21];
        iArr2[1] = i19;
        System.arraycopy(oVar3.f40645a, 0, jArr3, i19, i17);
        int i22 = 2;
        int i23 = i19;
        for (int i24 = 16; i22 < i24; i24 = 16) {
            i23 += i19;
            iArr2[i22] = i23;
            if ((i22 & 1) == 0) {
                jArr = jArr3;
                i15 = i21;
                K(jArr3, i23 >>> 1, jArr3, i23, i19, 1);
            } else {
                jArr = jArr3;
                i15 = i21;
                b(jArr, i19, jArr3, i23 - i19, jArr, i23, i19);
            }
            i22++;
            i21 = i15;
            jArr3 = jArr;
        }
        long[] jArr4 = jArr3;
        int i25 = i21;
        long[] jArr5 = new long[i25];
        K(jArr4, 0, jArr5, 0, i25, 4);
        long[] jArr6 = oVar2.f40645a;
        int i26 = i18 << 3;
        long[] jArr7 = new long[i26];
        int i27 = 0;
        while (i27 < i16) {
            long j12 = jArr6[i27];
            int i28 = i27;
            while (true) {
                long j13 = j12 >>> 4;
                i14 = i27;
                c(jArr7, i28, jArr4, iArr2[((int) j12) & 15], jArr5, iArr2[((int) j13) & 15], i19);
                j12 = j13 >>> 4;
                if (j12 == 0) {
                    break;
                }
                i28 += i18;
                i27 = i14;
            }
            i27 = i14 + 1;
        }
        while (true) {
            i26 -= i18;
            if (i26 == 0) {
                return F(jArr7, 0, i18, i11, iArr);
            }
            h(jArr7, i26 - i18, jArr7, i26, i18, 8);
        }
    }

    public o w(int i11, int[] iArr) {
        int p11 = p();
        if (p11 == 0) {
            return this;
        }
        int i12 = p11 << 1;
        long[] jArr = new long[i12];
        int i13 = 0;
        while (i13 < i12) {
            long j11 = this.f40645a[i13 >>> 1];
            int i14 = i13 + 1;
            jArr[i13] = r((int) j11);
            i13 = i14 + 1;
            jArr[i14] = r((int) (j11 >>> 32));
        }
        return new o(jArr, 0, E(jArr, 0, i12, i11, iArr));
    }

    public o x(int i11, int i12, int[] iArr) {
        int p11 = p();
        if (p11 == 0) {
            return this;
        }
        int i13 = ((i12 + 63) >>> 6) << 1;
        long[] jArr = new long[i13];
        System.arraycopy(this.f40645a, 0, jArr, 0, p11);
        while (true) {
            i11--;
            if (i11 < 0) {
                return new o(jArr, 0, p11);
            }
            M(jArr, p11, i12, iArr);
            p11 = E(jArr, 0, i13, i12, iArr);
        }
    }

    public o y(o oVar, int i11, int[] iArr) {
        int i12;
        int i13;
        o oVar2;
        o oVar3;
        long[] jArr;
        int i14;
        int k11 = k();
        if (k11 == 0) {
            return this;
        }
        int k12 = oVar.k();
        if (k12 == 0) {
            return oVar;
        }
        if (k11 > k12) {
            i13 = k11;
            i12 = k12;
            oVar3 = this;
            oVar2 = oVar;
        } else {
            i12 = k11;
            i13 = k12;
            oVar2 = this;
            oVar3 = oVar;
        }
        int i15 = (i12 + 63) >>> 6;
        int i16 = (i13 + 63) >>> 6;
        int i17 = ((i12 + i13) + 62) >>> 6;
        if (i15 == 1) {
            long j11 = oVar2.f40645a[0];
            if (j11 == 1) {
                return oVar3;
            }
            long[] jArr2 = new long[i17];
            z(j11, oVar3.f40645a, i16, jArr2, 0);
            return new o(jArr2, 0, i17);
        }
        int i18 = ((i13 + 7) + 63) >>> 6;
        int[] iArr2 = new int[16];
        int i19 = i18 << 4;
        long[] jArr3 = new long[i19];
        iArr2[1] = i18;
        System.arraycopy(oVar3.f40645a, 0, jArr3, i18, i16);
        int i21 = 2;
        int i22 = i18;
        for (int i23 = 16; i21 < i23; i23 = 16) {
            i22 += i18;
            iArr2[i21] = i22;
            if ((i21 & 1) == 0) {
                jArr = jArr3;
                i14 = i19;
                K(jArr3, i22 >>> 1, jArr3, i22, i18, 1);
            } else {
                jArr = jArr3;
                i14 = i19;
                b(jArr, i18, jArr, i22 - i18, jArr3, i22, i18);
            }
            i21++;
            i19 = i14;
            jArr3 = jArr;
        }
        long[] jArr4 = jArr3;
        int i24 = i19;
        long[] jArr5 = new long[i24];
        K(jArr4, 0, jArr5, 0, i24, 4);
        long[] jArr6 = oVar2.f40645a;
        int i25 = i17 << 3;
        long[] jArr7 = new long[i25];
        for (int i26 = 0; i26 < i15; i26++) {
            long j12 = jArr6[i26];
            int i27 = i26;
            while (true) {
                long j13 = j12 >>> 4;
                c(jArr7, i27, jArr4, iArr2[((int) j12) & 15], jArr5, iArr2[((int) j13) & 15], i18);
                j12 = j13 >>> 4;
                if (j12 == 0) {
                    break;
                }
                i27 += i17;
            }
        }
        while (true) {
            i25 -= i17;
            if (i25 == 0) {
                return new o(jArr7, 0, i17);
            }
            h(jArr7, i25 - i17, jArr7, i25, i17, 8);
        }
    }
}