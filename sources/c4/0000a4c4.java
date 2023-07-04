package org.spongycastle.util.encoders;

import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes4.dex */
public class Base64Encoder implements Encoder {
    protected final byte[] encodingTable = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
    protected byte padding = 61;
    protected final byte[] decodingTable = new byte[128];

    public Base64Encoder() {
        initialiseDecodingTable();
    }

    private int decodeLastBlock(OutputStream outputStream, char c11, char c12, char c13, char c14) {
        byte b11 = this.padding;
        if (c13 == b11) {
            byte[] bArr = this.decodingTable;
            byte b12 = bArr[c11];
            byte b13 = bArr[c12];
            if ((b12 | b13) >= 0) {
                outputStream.write((b12 << 2) | (b13 >> 4));
                return 1;
            }
            throw new IOException("invalid characters encountered at end of base64 data");
        } else if (c14 == b11) {
            byte[] bArr2 = this.decodingTable;
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
            byte[] bArr3 = this.decodingTable;
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

    private boolean ignore(char c11) {
        return c11 == '\n' || c11 == '\r' || c11 == '\t' || c11 == ' ';
    }

    private int nextI(byte[] bArr, int i11, int i12) {
        while (i11 < i12 && ignore((char) bArr[i11])) {
            i11++;
        }
        return i11;
    }

    @Override // org.spongycastle.util.encoders.Encoder
    public int decode(byte[] bArr, int i11, int i12, OutputStream outputStream) {
        int i13 = i12 + i11;
        while (i13 > i11 && ignore((char) bArr[i13 - 1])) {
            i13--;
        }
        int i14 = i13 - 4;
        int nextI = nextI(bArr, i11, i14);
        int i15 = 0;
        while (nextI < i14) {
            int i16 = nextI + 1;
            byte b11 = this.decodingTable[bArr[nextI]];
            int nextI2 = nextI(bArr, i16, i14);
            int i17 = nextI2 + 1;
            byte b12 = this.decodingTable[bArr[nextI2]];
            int nextI3 = nextI(bArr, i17, i14);
            int i18 = nextI3 + 1;
            byte b13 = this.decodingTable[bArr[nextI3]];
            int nextI4 = nextI(bArr, i18, i14);
            int i19 = nextI4 + 1;
            byte b14 = this.decodingTable[bArr[nextI4]];
            if ((b11 | b12 | b13 | b14) >= 0) {
                outputStream.write((b11 << 2) | (b12 >> 4));
                outputStream.write((b12 << 4) | (b13 >> 2));
                outputStream.write((b13 << 6) | b14);
                i15 += 3;
                nextI = nextI(bArr, i19, i14);
            } else {
                throw new IOException("invalid characters encountered in base64 data");
            }
        }
        return i15 + decodeLastBlock(outputStream, (char) bArr[i14], (char) bArr[i13 - 3], (char) bArr[i13 - 2], (char) bArr[i13 - 1]);
    }

    @Override // org.spongycastle.util.encoders.Encoder
    public int encode(byte[] bArr, int i11, int i12, OutputStream outputStream) {
        int i13;
        int i14 = i12 % 3;
        int i15 = i12 - i14;
        int i16 = i11;
        while (true) {
            i13 = i11 + i15;
            if (i16 >= i13) {
                break;
            }
            int i17 = bArr[i16] & 255;
            int i18 = bArr[i16 + 1] & 255;
            int i19 = bArr[i16 + 2] & 255;
            outputStream.write(this.encodingTable[(i17 >>> 2) & 63]);
            outputStream.write(this.encodingTable[((i17 << 4) | (i18 >>> 4)) & 63]);
            outputStream.write(this.encodingTable[((i18 << 2) | (i19 >>> 6)) & 63]);
            outputStream.write(this.encodingTable[i19 & 63]);
            i16 += 3;
        }
        if (i14 == 1) {
            int i21 = bArr[i13] & 255;
            outputStream.write(this.encodingTable[(i21 >>> 2) & 63]);
            outputStream.write(this.encodingTable[(i21 << 4) & 63]);
            outputStream.write(this.padding);
            outputStream.write(this.padding);
        } else if (i14 == 2) {
            int i22 = bArr[i13] & 255;
            int i23 = bArr[i13 + 1] & 255;
            outputStream.write(this.encodingTable[(i22 >>> 2) & 63]);
            outputStream.write(this.encodingTable[((i22 << 4) | (i23 >>> 4)) & 63]);
            outputStream.write(this.encodingTable[(i23 << 2) & 63]);
            outputStream.write(this.padding);
        }
        return ((i15 / 3) * 4) + (i14 == 0 ? 0 : 4);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void initialiseDecodingTable() {
        int i11 = 0;
        int i12 = 0;
        while (true) {
            byte[] bArr = this.decodingTable;
            if (i12 >= bArr.length) {
                break;
            }
            bArr[i12] = -1;
            i12++;
        }
        while (true) {
            byte[] bArr2 = this.encodingTable;
            if (i11 >= bArr2.length) {
                return;
            }
            this.decodingTable[bArr2[i11]] = (byte) i11;
            i11++;
        }
    }

    private int nextI(String str, int i11, int i12) {
        while (i11 < i12 && ignore(str.charAt(i11))) {
            i11++;
        }
        return i11;
    }

    @Override // org.spongycastle.util.encoders.Encoder
    public int decode(String str, OutputStream outputStream) {
        int length = str.length();
        while (length > 0 && ignore(str.charAt(length - 1))) {
            length--;
        }
        int i11 = length - 4;
        int i12 = 0;
        int nextI = nextI(str, 0, i11);
        while (nextI < i11) {
            int i13 = nextI + 1;
            byte b11 = this.decodingTable[str.charAt(nextI)];
            int nextI2 = nextI(str, i13, i11);
            int i14 = nextI2 + 1;
            byte b12 = this.decodingTable[str.charAt(nextI2)];
            int nextI3 = nextI(str, i14, i11);
            int i15 = nextI3 + 1;
            byte b13 = this.decodingTable[str.charAt(nextI3)];
            int nextI4 = nextI(str, i15, i11);
            int i16 = nextI4 + 1;
            byte b14 = this.decodingTable[str.charAt(nextI4)];
            if ((b11 | b12 | b13 | b14) >= 0) {
                outputStream.write((b11 << 2) | (b12 >> 4));
                outputStream.write((b12 << 4) | (b13 >> 2));
                outputStream.write((b13 << 6) | b14);
                i12 += 3;
                nextI = nextI(str, i16, i11);
            } else {
                throw new IOException("invalid characters encountered in base64 data");
            }
        }
        return i12 + decodeLastBlock(outputStream, str.charAt(i11), str.charAt(length - 3), str.charAt(length - 2), str.charAt(length - 1));
    }
}