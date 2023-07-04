package l50;

import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.spongycastle.crypto.tls.AlertDescription;

/* loaded from: classes5.dex */
public class x0 implements org.bouncycastle.crypto.e {

    /* renamed from: f  reason: collision with root package name */
    static short[] f36954f = {163, 215, 9, 131, 248, 72, 246, 244, 179, 33, 21, 120, 153, 177, 175, 249, 231, 45, 77, 138, 206, 76, 202, 46, 82, 149, 217, 30, 78, 56, 68, 40, 10, 223, 2, 160, 23, 241, 96, 104, 18, 183, 122, 195, 233, 250, 61, 83, 150, 132, 107, 186, 242, 99, 154, 25, 124, 174, 229, 245, 247, 22, 106, 162, 57, 182, 123, 15, 193, 147, 129, 27, 238, 180, 26, 234, 208, 145, 47, 184, 85, 185, 218, 133, 63, 65, 191, 224, 90, 88, 128, 95, 102, 11, 216, 144, 53, 213, 192, 167, 51, 6, 101, 105, 69, 0, 148, 86, 109, 152, 155, 118, 151, 252, 178, 194, 176, 254, 219, 32, 225, 235, 214, 228, 221, 71, 74, 29, 66, 237, 158, AlertDescription.unsupported_extension, 73, 60, 205, 67, 39, 210, 7, 212, 222, 199, 103, 24, 137, 203, 48, 31, 141, 198, 143, 170, 200, 116, 220, 201, 93, 92, 49, 164, AlertDescription.unrecognized_name, 136, 97, 44, 159, 13, 43, 135, 80, 130, 84, 100, 38, 125, 3, 64, 52, 75, 28, AlertDescription.unknown_psk_identity, 209, 196, 253, 59, 204, 251, 127, 171, 230, 62, 91, 165, 173, 4, 35, 156, 20, 81, 34, 240, 41, 121, AlertDescription.bad_certificate_status_response, 126, 255, 140, 14, 226, 12, 239, 188, AlertDescription.bad_certificate_hash_value, 117, AlertDescription.certificate_unobtainable, 55, 161, 236, 211, 142, 98, 139, 134, 16, 232, 8, 119, 17, 190, 146, 79, 36, 197, 50, 54, 157, 207, 243, 166, 187, 172, 94, 108, 169, 19, 87, 37, 181, 227, 189, 168, 58, 1, 5, 89, 42, 70};

    /* renamed from: a  reason: collision with root package name */
    private int[] f36955a;

    /* renamed from: b  reason: collision with root package name */
    private int[] f36956b;

    /* renamed from: c  reason: collision with root package name */
    private int[] f36957c;

    /* renamed from: d  reason: collision with root package name */
    private int[] f36958d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f36959e;

    private int c(int i11, int i12) {
        int i13 = i12 & 255;
        short[] sArr = f36954f;
        int i14 = ((i12 >> 8) & 255) ^ sArr[this.f36955a[i11] ^ i13];
        int i15 = i13 ^ sArr[this.f36956b[i11] ^ i14];
        int i16 = i14 ^ sArr[this.f36957c[i11] ^ i15];
        return (i16 << 8) + (sArr[this.f36958d[i11] ^ i16] ^ i15);
    }

    private int d(int i11, int i12) {
        int i13 = i12 & 255;
        int i14 = (i12 >> 8) & 255;
        short[] sArr = f36954f;
        int i15 = i13 ^ sArr[this.f36958d[i11] ^ i14];
        int i16 = i14 ^ sArr[this.f36957c[i11] ^ i15];
        int i17 = i15 ^ sArr[this.f36956b[i11] ^ i16];
        return ((sArr[this.f36955a[i11] ^ i17] ^ i16) << 8) + i17;
    }

    public int a(byte[] bArr, int i11, byte[] bArr2, int i12) {
        int i13 = (bArr[i11 + 0] << 8) + (bArr[i11 + 1] & 255);
        int i14 = (bArr[i11 + 2] << 8) + (bArr[i11 + 3] & 255);
        int i15 = (bArr[i11 + 4] << 8) + (bArr[i11 + 5] & 255);
        int i16 = (bArr[i11 + 6] << 8) + (bArr[i11 + 7] & 255);
        int i17 = 31;
        for (int i18 = 0; i18 < 2; i18++) {
            int i19 = 0;
            while (i19 < 8) {
                int d11 = d(i17, i14);
                i17--;
                i19++;
                int i21 = i16;
                i16 = i13;
                i13 = d11;
                i14 = (i15 ^ d11) ^ (i17 + 1);
                i15 = i21;
            }
            int i22 = 0;
            while (i22 < 8) {
                int d12 = d(i17, i14);
                i17--;
                i22++;
                int i23 = i16;
                i16 = (i13 ^ i14) ^ (i17 + 1);
                i13 = d12;
                i14 = i15;
                i15 = i23;
            }
        }
        bArr2[i12 + 0] = (byte) (i13 >> 8);
        bArr2[i12 + 1] = (byte) i13;
        bArr2[i12 + 2] = (byte) (i14 >> 8);
        bArr2[i12 + 3] = (byte) i14;
        bArr2[i12 + 4] = (byte) (i15 >> 8);
        bArr2[i12 + 5] = (byte) i15;
        bArr2[i12 + 6] = (byte) (i16 >> 8);
        bArr2[i12 + 7] = (byte) i16;
        return 8;
    }

    public int b(byte[] bArr, int i11, byte[] bArr2, int i12) {
        int i13 = (bArr[i11 + 0] << 8) + (bArr[i11 + 1] & 255);
        int i14 = (bArr[i11 + 2] << 8) + (bArr[i11 + 3] & 255);
        int i15 = (bArr[i11 + 4] << 8) + (bArr[i11 + 5] & 255);
        int i16 = (bArr[i11 + 6] << 8) + (bArr[i11 + 7] & 255);
        int i17 = 0;
        for (int i18 = 0; i18 < 2; i18++) {
            int i19 = 0;
            while (i19 < 8) {
                int c11 = c(i17, i13);
                i17++;
                i19++;
                int i21 = i14;
                i14 = c11;
                i13 = (i16 ^ c11) ^ i17;
                i16 = i15;
                i15 = i21;
            }
            int i22 = 0;
            while (i22 < 8) {
                int i23 = i17 + 1;
                int i24 = (i14 ^ i13) ^ i23;
                int c12 = c(i17, i13);
                i22++;
                i17 = i23;
                i14 = c12;
                i13 = i16;
                i16 = i15;
                i15 = i24;
            }
        }
        bArr2[i12 + 0] = (byte) (i13 >> 8);
        bArr2[i12 + 1] = (byte) i13;
        bArr2[i12 + 2] = (byte) (i14 >> 8);
        bArr2[i12 + 3] = (byte) i14;
        bArr2[i12 + 4] = (byte) (i15 >> 8);
        bArr2[i12 + 5] = (byte) i15;
        bArr2[i12 + 6] = (byte) (i16 >> 8);
        bArr2[i12 + 7] = (byte) i16;
        return 8;
    }

    @Override // org.bouncycastle.crypto.e
    public String getAlgorithmName() {
        return "SKIPJACK";
    }

    @Override // org.bouncycastle.crypto.e
    public int getBlockSize() {
        return 8;
    }

    @Override // org.bouncycastle.crypto.e
    public void init(boolean z11, org.bouncycastle.crypto.i iVar) {
        if (!(iVar instanceof u50.b1)) {
            throw new IllegalArgumentException("invalid parameter passed to SKIPJACK init - " + iVar.getClass().getName());
        }
        byte[] a11 = ((u50.b1) iVar).a();
        this.f36959e = z11;
        this.f36955a = new int[32];
        this.f36956b = new int[32];
        this.f36957c = new int[32];
        this.f36958d = new int[32];
        for (int i11 = 0; i11 < 32; i11++) {
            int i12 = i11 * 4;
            this.f36955a[i11] = a11[i12 % 10] & 255;
            this.f36956b[i11] = a11[(i12 + 1) % 10] & 255;
            this.f36957c[i11] = a11[(i12 + 2) % 10] & 255;
            this.f36958d[i11] = a11[(i12 + 3) % 10] & 255;
        }
    }

    @Override // org.bouncycastle.crypto.e
    public int processBlock(byte[] bArr, int i11, byte[] bArr2, int i12) {
        if (this.f36956b != null) {
            if (i11 + 8 <= bArr.length) {
                if (i12 + 8 <= bArr2.length) {
                    if (this.f36959e) {
                        b(bArr, i11, bArr2, i12);
                        return 8;
                    }
                    a(bArr, i11, bArr2, i12);
                    return 8;
                }
                throw new OutputLengthException("output buffer too short");
            }
            throw new DataLengthException("input buffer too short");
        }
        throw new IllegalStateException("SKIPJACK engine not initialised");
    }

    @Override // org.bouncycastle.crypto.e
    public void reset() {
    }
}