package org.bouncycastle.util.encoders;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Objects;

/* loaded from: classes5.dex */
public class c implements s70.b {

    /* renamed from: a  reason: collision with root package name */
    protected final byte[] f43215a = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};

    /* renamed from: b  reason: collision with root package name */
    protected final byte[] f43216b = new byte[128];

    public c() {
        e();
    }

    private static boolean d(char c11) {
        return c11 == '\n' || c11 == '\r' || c11 == '\t' || c11 == ' ';
    }

    @Override // s70.b
    public int a(int i11) {
        return i11 * 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public byte[] b(String str, int i11, int i12) {
        Objects.requireNonNull(str, "'str' cannot be null");
        if (i11 < 0 || i12 < 0 || i11 > str.length() - i12) {
            throw new IndexOutOfBoundsException("invalid offset and/or length specified");
        }
        if ((i12 & 1) == 0) {
            int i13 = i12 >>> 1;
            byte[] bArr = new byte[i13];
            int i14 = 0;
            while (i14 < i13) {
                int i15 = i11 + 1;
                int i16 = i15 + 1;
                int i17 = (this.f43216b[str.charAt(i11)] << 4) | this.f43216b[str.charAt(i15)];
                if (i17 < 0) {
                    throw new IOException("invalid characters encountered in Hex string");
                }
                bArr[i14] = (byte) i17;
                i14++;
                i11 = i16;
            }
            return bArr;
        }
        throw new IOException("a hexadecimal encoding must have an even number of characters");
    }

    public int c(byte[] bArr, int i11, int i12, byte[] bArr2, int i13) {
        int i14 = i12 + i11;
        int i15 = i13;
        while (i11 < i14) {
            int i16 = i11 + 1;
            int i17 = bArr[i11] & 255;
            int i18 = i15 + 1;
            byte[] bArr3 = this.f43215a;
            bArr2[i15] = bArr3[i17 >>> 4];
            i15 = i18 + 1;
            bArr2[i18] = bArr3[i17 & 15];
            i11 = i16;
        }
        return i15 - i13;
    }

    @Override // s70.b
    public int decode(String str, OutputStream outputStream) {
        byte[] bArr = new byte[36];
        int length = str.length();
        while (length > 0 && d(str.charAt(length - 1))) {
            length--;
        }
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i11 < length) {
            while (i11 < length && d(str.charAt(i11))) {
                i11++;
            }
            int i14 = i11 + 1;
            byte b11 = this.f43216b[str.charAt(i11)];
            while (i14 < length && d(str.charAt(i14))) {
                i14++;
            }
            int i15 = i14 + 1;
            byte b12 = this.f43216b[str.charAt(i14)];
            if ((b11 | b12) < 0) {
                throw new IOException("invalid characters encountered in Hex string");
            }
            int i16 = i12 + 1;
            bArr[i12] = (byte) ((b11 << 4) | b12);
            if (i16 == 36) {
                outputStream.write(bArr);
                i12 = 0;
            } else {
                i12 = i16;
            }
            i13++;
            i11 = i15;
        }
        if (i12 > 0) {
            outputStream.write(bArr, 0, i12);
        }
        return i13;
    }

    protected void e() {
        int i11 = 0;
        int i12 = 0;
        while (true) {
            byte[] bArr = this.f43216b;
            if (i12 >= bArr.length) {
                break;
            }
            bArr[i12] = -1;
            i12++;
        }
        while (true) {
            byte[] bArr2 = this.f43215a;
            if (i11 >= bArr2.length) {
                byte[] bArr3 = this.f43216b;
                bArr3[65] = bArr3[97];
                bArr3[66] = bArr3[98];
                bArr3[67] = bArr3[99];
                bArr3[68] = bArr3[100];
                bArr3[69] = bArr3[101];
                bArr3[70] = bArr3[102];
                return;
            }
            this.f43216b[bArr2[i11]] = (byte) i11;
            i11++;
        }
    }

    @Override // s70.b
    public int encode(byte[] bArr, int i11, int i12, OutputStream outputStream) {
        byte[] bArr2 = new byte[72];
        while (i12 > 0) {
            int min = Math.min(36, i12);
            outputStream.write(bArr2, 0, c(bArr, i11, min, bArr2, 0));
            i11 += min;
            i12 -= min;
        }
        return i12 * 2;
    }
}