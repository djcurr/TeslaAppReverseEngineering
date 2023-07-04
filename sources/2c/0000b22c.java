package s70;

import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes5.dex */
public class a implements b {

    /* renamed from: a  reason: collision with root package name */
    protected final byte[] f50308a = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

    /* renamed from: b  reason: collision with root package name */
    protected byte f50309b = 61;

    /* renamed from: c  reason: collision with root package name */
    protected final byte[] f50310c = new byte[128];

    public a() {
        e();
    }

    private int b(OutputStream outputStream, char c11, char c12, char c13, char c14) {
        byte b11 = this.f50309b;
        if (c13 == b11) {
            if (c14 == b11) {
                byte[] bArr = this.f50310c;
                byte b12 = bArr[c11];
                byte b13 = bArr[c12];
                if ((b12 | b13) >= 0) {
                    outputStream.write((b12 << 2) | (b13 >> 4));
                    return 1;
                }
                throw new IOException("invalid characters encountered at end of base64 data");
            }
            throw new IOException("invalid characters encountered at end of base64 data");
        } else if (c14 == b11) {
            byte[] bArr2 = this.f50310c;
            byte b14 = bArr2[c11];
            byte b15 = bArr2[c12];
            byte b16 = bArr2[c13];
            if ((b14 | b15 | b16) >= 0) {
                outputStream.write((b14 << 2) | (b15 >> 4));
                outputStream.write((b15 << 4) | (b16 >> 2));
                return 2;
            }
            throw new IOException("invalid characters encountered at end of base64 data");
        } else {
            byte[] bArr3 = this.f50310c;
            byte b17 = bArr3[c11];
            byte b18 = bArr3[c12];
            byte b19 = bArr3[c13];
            byte b21 = bArr3[c14];
            if ((b17 | b18 | b19 | b21) >= 0) {
                outputStream.write((b17 << 2) | (b18 >> 4));
                outputStream.write((b18 << 4) | (b19 >> 2));
                outputStream.write((b19 << 6) | b21);
                return 3;
            }
            throw new IOException("invalid characters encountered at end of base64 data");
        }
    }

    private boolean d(char c11) {
        return c11 == '\n' || c11 == '\r' || c11 == '\t' || c11 == ' ';
    }

    private int f(String str, int i11, int i12) {
        while (i11 < i12 && d(str.charAt(i11))) {
            i11++;
        }
        return i11;
    }

    @Override // s70.b
    public int a(int i11) {
        return ((i11 + 2) / 3) * 4;
    }

    public int c(byte[] bArr, int i11, int i12, byte[] bArr2, int i13) {
        int i14 = (i11 + i12) - 2;
        int i15 = i11;
        int i16 = i13;
        while (i15 < i14) {
            int i17 = i15 + 1;
            byte b11 = bArr[i15];
            int i18 = i17 + 1;
            int i19 = bArr[i17] & 255;
            int i21 = i18 + 1;
            int i22 = bArr[i18] & 255;
            int i23 = i16 + 1;
            byte[] bArr3 = this.f50308a;
            bArr2[i16] = bArr3[(b11 >>> 2) & 63];
            int i24 = i23 + 1;
            bArr2[i23] = bArr3[((b11 << 4) | (i19 >>> 4)) & 63];
            int i25 = i24 + 1;
            bArr2[i24] = bArr3[((i19 << 2) | (i22 >>> 6)) & 63];
            i16 = i25 + 1;
            bArr2[i25] = bArr3[i22 & 63];
            i15 = i21;
        }
        int i26 = i12 - (i15 - i11);
        if (i26 == 1) {
            int i27 = bArr[i15] & 255;
            int i28 = i16 + 1;
            byte[] bArr4 = this.f50308a;
            bArr2[i16] = bArr4[(i27 >>> 2) & 63];
            int i29 = i28 + 1;
            bArr2[i28] = bArr4[(i27 << 4) & 63];
            int i31 = i29 + 1;
            byte b12 = this.f50309b;
            bArr2[i29] = b12;
            i16 = i31 + 1;
            bArr2[i31] = b12;
        } else if (i26 == 2) {
            int i32 = bArr[i15] & 255;
            int i33 = bArr[i15 + 1] & 255;
            int i34 = i16 + 1;
            byte[] bArr5 = this.f50308a;
            bArr2[i16] = bArr5[(i32 >>> 2) & 63];
            int i35 = i34 + 1;
            bArr2[i34] = bArr5[((i32 << 4) | (i33 >>> 4)) & 63];
            int i36 = i35 + 1;
            bArr2[i35] = bArr5[(i33 << 2) & 63];
            i16 = i36 + 1;
            bArr2[i36] = this.f50309b;
        }
        return i16 - i13;
    }

    @Override // s70.b
    public int decode(String str, OutputStream outputStream) {
        byte[] bArr = new byte[54];
        int length = str.length();
        while (length > 0 && d(str.charAt(length - 1))) {
            length--;
        }
        if (length == 0) {
            return 0;
        }
        int i11 = length;
        int i12 = 0;
        while (i11 > 0 && i12 != 4) {
            if (!d(str.charAt(i11 - 1))) {
                i12++;
            }
            i11--;
        }
        int f11 = f(str, 0, i11);
        int i13 = 0;
        int i14 = 0;
        while (f11 < i11) {
            int i15 = f11 + 1;
            byte b11 = this.f50310c[str.charAt(f11)];
            int f12 = f(str, i15, i11);
            int i16 = f12 + 1;
            byte b12 = this.f50310c[str.charAt(f12)];
            int f13 = f(str, i16, i11);
            int i17 = f13 + 1;
            byte b13 = this.f50310c[str.charAt(f13)];
            int f14 = f(str, i17, i11);
            int i18 = f14 + 1;
            byte b14 = this.f50310c[str.charAt(f14)];
            if ((b11 | b12 | b13 | b14) < 0) {
                throw new IOException("invalid characters encountered in base64 data");
            }
            int i19 = i13 + 1;
            bArr[i13] = (byte) ((b11 << 2) | (b12 >> 4));
            int i21 = i19 + 1;
            bArr[i19] = (byte) ((b12 << 4) | (b13 >> 2));
            i13 = i21 + 1;
            bArr[i21] = (byte) ((b13 << 6) | b14);
            i14 += 3;
            if (i13 == 54) {
                outputStream.write(bArr);
                i13 = 0;
            }
            f11 = f(str, i18, i11);
        }
        if (i13 > 0) {
            outputStream.write(bArr, 0, i13);
        }
        int f15 = f(str, f11, length);
        int f16 = f(str, f15 + 1, length);
        int f17 = f(str, f16 + 1, length);
        return i14 + b(outputStream, str.charAt(f15), str.charAt(f16), str.charAt(f17), str.charAt(f(str, f17 + 1, length)));
    }

    protected void e() {
        int i11 = 0;
        int i12 = 0;
        while (true) {
            byte[] bArr = this.f50310c;
            if (i12 >= bArr.length) {
                break;
            }
            bArr[i12] = -1;
            i12++;
        }
        while (true) {
            byte[] bArr2 = this.f50308a;
            if (i11 >= bArr2.length) {
                return;
            }
            this.f50310c[bArr2[i11]] = (byte) i11;
            i11++;
        }
    }

    @Override // s70.b
    public int encode(byte[] bArr, int i11, int i12, OutputStream outputStream) {
        byte[] bArr2 = new byte[72];
        while (i12 > 0) {
            int min = Math.min(54, i12);
            outputStream.write(bArr2, 0, c(bArr, i11, min, bArr2, 0));
            i11 += min;
            i12 -= min;
        }
        return ((i12 + 2) / 3) * 4;
    }
}