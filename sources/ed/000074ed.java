package i9;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f30211a = new byte[128];

    /* renamed from: b  reason: collision with root package name */
    public static final char[] f30212b = new char[64];

    static {
        int i11;
        int i12;
        int i13 = 0;
        for (int i14 = 0; i14 < 128; i14++) {
            f30211a[i14] = -1;
        }
        for (int i15 = 90; i15 >= 65; i15--) {
            f30211a[i15] = (byte) (i15 - 65);
        }
        int i16 = 122;
        while (true) {
            i11 = 26;
            if (i16 < 97) {
                break;
            }
            f30211a[i16] = (byte) ((i16 - 97) + 26);
            i16--;
        }
        int i17 = 57;
        while (true) {
            i12 = 52;
            if (i17 < 48) {
                break;
            }
            f30211a[i17] = (byte) ((i17 - 48) + 52);
            i17--;
        }
        byte[] bArr = f30211a;
        bArr[43] = 62;
        bArr[47] = 63;
        for (int i18 = 0; i18 <= 25; i18++) {
            f30212b[i18] = (char) (i18 + 65);
        }
        int i19 = 0;
        while (i11 <= 51) {
            f30212b[i11] = (char) (i19 + 97);
            i11++;
            i19++;
        }
        while (i12 <= 61) {
            f30212b[i12] = (char) (i13 + 48);
            i12++;
            i13++;
        }
        char[] cArr = f30212b;
        cArr[62] = '+';
        cArr[63] = '/';
    }

    public static int a(char[] cArr) {
        if (cArr == null) {
            return 0;
        }
        int length = cArr.length;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12++) {
            if (!f(cArr[i12])) {
                cArr[i11] = cArr[i12];
                i11++;
            }
        }
        return i11;
    }

    public static String b(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        int length = bArr.length * 8;
        if (length == 0) {
            return "";
        }
        int i11 = length % 24;
        int i12 = length / 24;
        char[] cArr = new char[(i11 != 0 ? i12 + 1 : i12) * 4];
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (i13 < i12) {
            int i16 = i14 + 1;
            byte b11 = bArr[i14];
            int i17 = i16 + 1;
            byte b12 = bArr[i16];
            int i18 = i17 + 1;
            byte b13 = bArr[i17];
            byte b14 = (byte) (b12 & 15);
            byte b15 = (byte) (b11 & 3);
            int i19 = b11 & Byte.MIN_VALUE;
            int i21 = b11 >> 2;
            if (i19 != 0) {
                i21 ^= 192;
            }
            byte b16 = (byte) i21;
            int i22 = b12 & Byte.MIN_VALUE;
            int i23 = b12 >> 4;
            if (i22 != 0) {
                i23 ^= 240;
            }
            byte b17 = (byte) i23;
            int i24 = (b13 & Byte.MIN_VALUE) == 0 ? b13 >> 6 : (b13 >> 6) ^ 252;
            int i25 = i15 + 1;
            char[] cArr2 = f30212b;
            cArr[i15] = cArr2[b16];
            int i26 = i25 + 1;
            cArr[i25] = cArr2[(b15 << 4) | b17];
            int i27 = i26 + 1;
            cArr[i26] = cArr2[(b14 << 2) | ((byte) i24)];
            cArr[i27] = cArr2[b13 & 63];
            i13++;
            i15 = i27 + 1;
            i14 = i18;
        }
        if (i11 == 8) {
            byte b18 = bArr[i14];
            byte b19 = (byte) (b18 & 3);
            int i28 = b18 & Byte.MIN_VALUE;
            int i29 = b18 >> 2;
            if (i28 != 0) {
                i29 ^= 192;
            }
            int i31 = i15 + 1;
            char[] cArr3 = f30212b;
            cArr[i15] = cArr3[(byte) i29];
            int i32 = i31 + 1;
            cArr[i31] = cArr3[b19 << 4];
            cArr[i32] = '=';
            cArr[i32 + 1] = '=';
        } else if (i11 == 16) {
            byte b21 = bArr[i14];
            byte b22 = bArr[i14 + 1];
            byte b23 = (byte) (b22 & 15);
            byte b24 = (byte) (b21 & 3);
            int i33 = b21 & Byte.MIN_VALUE;
            int i34 = b21 >> 2;
            if (i33 != 0) {
                i34 ^= 192;
            }
            byte b25 = (byte) i34;
            int i35 = b22 & Byte.MIN_VALUE;
            int i36 = b22 >> 4;
            if (i35 != 0) {
                i36 ^= 240;
            }
            int i37 = i15 + 1;
            char[] cArr4 = f30212b;
            cArr[i15] = cArr4[b25];
            int i38 = i37 + 1;
            cArr[i37] = cArr4[((byte) i36) | (b24 << 4)];
            cArr[i38] = cArr4[b23 << 2];
            cArr[i38 + 1] = '=';
        }
        return new String(cArr);
    }

    public static boolean c(char c11) {
        return c11 < 128 && f30211a[c11] != -1;
    }

    public static byte[] d(String str) {
        if (str == null) {
            return null;
        }
        char[] charArray = str.toCharArray();
        int a11 = a(charArray);
        if (a11 % 4 != 0) {
            return null;
        }
        int i11 = a11 / 4;
        if (i11 == 0) {
            return new byte[0];
        }
        byte[] bArr = new byte[i11 * 3];
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (i12 < i11 - 1) {
            int i15 = i13 + 1;
            char c11 = charArray[i13];
            if (c(c11)) {
                int i16 = i15 + 1;
                char c12 = charArray[i15];
                if (c(c12)) {
                    int i17 = i16 + 1;
                    char c13 = charArray[i16];
                    if (c(c13)) {
                        int i18 = i17 + 1;
                        char c14 = charArray[i17];
                        if (c(c14)) {
                            byte[] bArr2 = f30211a;
                            byte b11 = bArr2[c11];
                            byte b12 = bArr2[c12];
                            byte b13 = bArr2[c13];
                            byte b14 = bArr2[c14];
                            int i19 = i14 + 1;
                            bArr[i14] = (byte) ((b11 << 2) | (b12 >> 4));
                            int i21 = i19 + 1;
                            bArr[i19] = (byte) (((b12 & 15) << 4) | ((b13 >> 2) & 15));
                            i14 = i21 + 1;
                            bArr[i21] = (byte) ((b13 << 6) | b14);
                            i12++;
                            i13 = i18;
                        }
                    }
                }
            }
            return null;
        }
        int i22 = i13 + 1;
        char c15 = charArray[i13];
        if (c(c15)) {
            int i23 = i22 + 1;
            char c16 = charArray[i22];
            if (c(c16)) {
                byte[] bArr3 = f30211a;
                byte b15 = bArr3[c15];
                byte b16 = bArr3[c16];
                int i24 = i23 + 1;
                char c17 = charArray[i23];
                char c18 = charArray[i24];
                if (c(c17) && c(c18)) {
                    byte b17 = bArr3[c17];
                    byte b18 = bArr3[c18];
                    int i25 = i14 + 1;
                    bArr[i14] = (byte) ((b15 << 2) | (b16 >> 4));
                    bArr[i25] = (byte) (((b16 & 15) << 4) | ((b17 >> 2) & 15));
                    bArr[i25 + 1] = (byte) (b18 | (b17 << 6));
                    return bArr;
                } else if (e(c17) && e(c18)) {
                    if ((b16 & 15) != 0) {
                        return null;
                    }
                    int i26 = i12 * 3;
                    byte[] bArr4 = new byte[i26 + 1];
                    System.arraycopy(bArr, 0, bArr4, 0, i26);
                    bArr4[i14] = (byte) ((b15 << 2) | (b16 >> 4));
                    return bArr4;
                } else if (e(c17) || !e(c18)) {
                    return null;
                } else {
                    byte b19 = bArr3[c17];
                    if ((b19 & 3) != 0) {
                        return null;
                    }
                    int i27 = i12 * 3;
                    byte[] bArr5 = new byte[i27 + 2];
                    System.arraycopy(bArr, 0, bArr5, 0, i27);
                    bArr5[i14] = (byte) ((b15 << 2) | (b16 >> 4));
                    bArr5[i14 + 1] = (byte) (((b19 >> 2) & 15) | ((b16 & 15) << 4));
                    return bArr5;
                }
            }
            return null;
        }
        return null;
    }

    public static boolean e(char c11) {
        return c11 == '=';
    }

    public static boolean f(char c11) {
        return c11 == ' ' || c11 == '\r' || c11 == '\n' || c11 == '\t';
    }
}