package ti;

/* loaded from: classes3.dex */
public final class j0 {
    public static int a(byte[] bArr, int i11, int i12) {
        while (i11 < i12 && bArr[i11] != 71) {
            i11++;
        }
        return i11;
    }

    public static long b(ak.v vVar, int i11, int i12) {
        vVar.O(i11);
        if (vVar.a() < 5) {
            return -9223372036854775807L;
        }
        int m11 = vVar.m();
        if ((8388608 & m11) == 0 && ((2096896 & m11) >> 8) == i12) {
            if (((m11 & 32) != 0) && vVar.C() >= 7 && vVar.a() >= 7) {
                if ((vVar.C() & 16) == 16) {
                    byte[] bArr = new byte[6];
                    vVar.j(bArr, 0, 6);
                    return c(bArr);
                }
            }
            return -9223372036854775807L;
        }
        return -9223372036854775807L;
    }

    private static long c(byte[] bArr) {
        return ((bArr[0] & 255) << 25) | ((bArr[1] & 255) << 17) | ((bArr[2] & 255) << 9) | ((bArr[3] & 255) << 1) | ((255 & bArr[4]) >> 7);
    }
}