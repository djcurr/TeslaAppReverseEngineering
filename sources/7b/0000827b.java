package l50;

import okhttp3.internal.http2.Settings;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.spongycastle.crypto.signers.PSSSigner;
import org.spongycastle.math.ec.Tnaf;

/* loaded from: classes5.dex */
public class e0 implements org.bouncycastle.crypto.e {

    /* renamed from: c  reason: collision with root package name */
    private static byte[] f36712c = {-39, 120, -7, -60, 25, -35, -75, -19, 40, -23, -3, 121, 74, -96, -40, -99, -58, 126, 55, -125, 43, 118, 83, -114, 98, 76, 100, -120, 68, -117, -5, -94, 23, -102, 89, -11, -121, -77, 79, 19, 97, 69, 109, -115, 9, -127, 125, 50, -67, -113, 64, -21, -122, -73, 123, 11, -16, -107, 33, 34, 92, 107, 78, -126, 84, -42, 101, -109, -50, 96, -78, 28, 115, 86, -64, 20, -89, -116, -15, -36, 18, 117, -54, 31, 59, -66, -28, -47, 66, 61, -44, 48, -93, 60, -74, 38, 111, -65, 14, -38, 70, 105, 7, 87, 39, -14, 29, -101, PSSSigner.TRAILER_IMPLICIT, -108, 67, 3, -8, 17, -57, -10, -112, -17, 62, -25, 6, -61, -43, 47, -56, 102, 30, -41, 8, -24, -22, -34, Byte.MIN_VALUE, 82, -18, -9, -124, -86, 114, -84, 53, 77, 106, 42, -106, 26, -46, 113, 90, 21, 73, 116, 75, -97, -48, 94, 4, 24, -92, -20, -62, -32, 65, 110, 15, 81, -53, -52, 36, -111, -81, 80, -95, -12, 112, 57, -103, 124, 58, -123, 35, -72, -76, 122, -4, 2, 54, 91, 37, 85, -105, 49, 45, 93, -6, -104, -29, -118, -110, -82, 5, -33, 41, Tnaf.POW_2_WIDTH, 103, 108, -70, -55, -45, 0, -26, -49, -31, -98, -88, 44, 99, 22, 1, 63, 88, -30, -119, -87, 13, 56, 52, 27, -85, 51, -1, -80, -69, 72, 12, 95, -71, -79, -51, 46, -59, -13, -37, 71, -27, -91, -100, 119, 10, -90, 32, 104, -2, Byte.MAX_VALUE, -63, -83};

    /* renamed from: a  reason: collision with root package name */
    private int[] f36713a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f36714b;

    private void a(byte[] bArr, int i11, byte[] bArr2, int i12) {
        int i13 = ((bArr[i11 + 7] & 255) << 8) + (bArr[i11 + 6] & 255);
        int i14 = ((bArr[i11 + 5] & 255) << 8) + (bArr[i11 + 4] & 255);
        int i15 = ((bArr[i11 + 3] & 255) << 8) + (bArr[i11 + 2] & 255);
        int i16 = ((bArr[i11 + 1] & 255) << 8) + (bArr[i11 + 0] & 255);
        for (int i17 = 60; i17 >= 44; i17 -= 4) {
            i13 = d(i13, 11) - ((((~i14) & i16) + (i15 & i14)) + this.f36713a[i17 + 3]);
            i14 = d(i14, 13) - ((((~i15) & i13) + (i16 & i15)) + this.f36713a[i17 + 2]);
            i15 = d(i15, 14) - ((((~i16) & i14) + (i13 & i16)) + this.f36713a[i17 + 1]);
            i16 = d(i16, 15) - ((((~i13) & i15) + (i14 & i13)) + this.f36713a[i17]);
        }
        int[] iArr = this.f36713a;
        int i18 = i13 - iArr[i14 & 63];
        int i19 = i14 - iArr[i15 & 63];
        int i21 = i15 - iArr[i16 & 63];
        int i22 = i16 - iArr[i18 & 63];
        for (int i23 = 40; i23 >= 20; i23 -= 4) {
            i18 = d(i18, 11) - ((((~i19) & i22) + (i21 & i19)) + this.f36713a[i23 + 3]);
            i19 = d(i19, 13) - ((((~i21) & i18) + (i22 & i21)) + this.f36713a[i23 + 2]);
            i21 = d(i21, 14) - ((((~i22) & i19) + (i18 & i22)) + this.f36713a[i23 + 1]);
            i22 = d(i22, 15) - ((((~i18) & i21) + (i19 & i18)) + this.f36713a[i23]);
        }
        int[] iArr2 = this.f36713a;
        int i24 = i18 - iArr2[i19 & 63];
        int i25 = i19 - iArr2[i21 & 63];
        int i26 = i21 - iArr2[i22 & 63];
        int i27 = i22 - iArr2[i24 & 63];
        for (int i28 = 16; i28 >= 0; i28 -= 4) {
            i24 = d(i24, 11) - ((((~i25) & i27) + (i26 & i25)) + this.f36713a[i28 + 3]);
            i25 = d(i25, 13) - ((((~i26) & i24) + (i27 & i26)) + this.f36713a[i28 + 2]);
            i26 = d(i26, 14) - ((((~i27) & i25) + (i24 & i27)) + this.f36713a[i28 + 1]);
            i27 = d(i27, 15) - ((((~i24) & i26) + (i25 & i24)) + this.f36713a[i28]);
        }
        bArr2[i12 + 0] = (byte) i27;
        bArr2[i12 + 1] = (byte) (i27 >> 8);
        bArr2[i12 + 2] = (byte) i26;
        bArr2[i12 + 3] = (byte) (i26 >> 8);
        bArr2[i12 + 4] = (byte) i25;
        bArr2[i12 + 5] = (byte) (i25 >> 8);
        bArr2[i12 + 6] = (byte) i24;
        bArr2[i12 + 7] = (byte) (i24 >> 8);
    }

    private void b(byte[] bArr, int i11, byte[] bArr2, int i12) {
        int i13 = ((bArr[i11 + 7] & 255) << 8) + (bArr[i11 + 6] & 255);
        int i14 = ((bArr[i11 + 5] & 255) << 8) + (bArr[i11 + 4] & 255);
        int i15 = ((bArr[i11 + 3] & 255) << 8) + (bArr[i11 + 2] & 255);
        int i16 = ((bArr[i11 + 1] & 255) << 8) + (bArr[i11 + 0] & 255);
        for (int i17 = 0; i17 <= 16; i17 += 4) {
            i16 = d(i16 + ((~i13) & i15) + (i14 & i13) + this.f36713a[i17], 1);
            i15 = d(i15 + ((~i16) & i14) + (i13 & i16) + this.f36713a[i17 + 1], 2);
            i14 = d(i14 + ((~i15) & i13) + (i16 & i15) + this.f36713a[i17 + 2], 3);
            i13 = d(i13 + ((~i14) & i16) + (i15 & i14) + this.f36713a[i17 + 3], 5);
        }
        int[] iArr = this.f36713a;
        int i18 = i16 + iArr[i13 & 63];
        int i19 = i15 + iArr[i18 & 63];
        int i21 = i14 + iArr[i19 & 63];
        int i22 = i13 + iArr[i21 & 63];
        for (int i23 = 20; i23 <= 40; i23 += 4) {
            i18 = d(i18 + ((~i22) & i19) + (i21 & i22) + this.f36713a[i23], 1);
            i19 = d(i19 + ((~i18) & i21) + (i22 & i18) + this.f36713a[i23 + 1], 2);
            i21 = d(i21 + ((~i19) & i22) + (i18 & i19) + this.f36713a[i23 + 2], 3);
            i22 = d(i22 + ((~i21) & i18) + (i19 & i21) + this.f36713a[i23 + 3], 5);
        }
        int[] iArr2 = this.f36713a;
        int i24 = i18 + iArr2[i22 & 63];
        int i25 = i19 + iArr2[i24 & 63];
        int i26 = i21 + iArr2[i25 & 63];
        int i27 = i22 + iArr2[i26 & 63];
        for (int i28 = 44; i28 < 64; i28 += 4) {
            i24 = d(i24 + ((~i27) & i25) + (i26 & i27) + this.f36713a[i28], 1);
            i25 = d(i25 + ((~i24) & i26) + (i27 & i24) + this.f36713a[i28 + 1], 2);
            i26 = d(i26 + ((~i25) & i27) + (i24 & i25) + this.f36713a[i28 + 2], 3);
            i27 = d(i27 + ((~i26) & i24) + (i25 & i26) + this.f36713a[i28 + 3], 5);
        }
        bArr2[i12 + 0] = (byte) i24;
        bArr2[i12 + 1] = (byte) (i24 >> 8);
        bArr2[i12 + 2] = (byte) i25;
        bArr2[i12 + 3] = (byte) (i25 >> 8);
        bArr2[i12 + 4] = (byte) i26;
        bArr2[i12 + 5] = (byte) (i26 >> 8);
        bArr2[i12 + 6] = (byte) i27;
        bArr2[i12 + 7] = (byte) (i27 >> 8);
    }

    private int[] c(byte[] bArr, int i11) {
        int[] iArr = new int[128];
        for (int i12 = 0; i12 != bArr.length; i12++) {
            iArr[i12] = bArr[i12] & 255;
        }
        int length = bArr.length;
        if (length < 128) {
            int i13 = iArr[length - 1];
            int i14 = 0;
            while (true) {
                int i15 = i14 + 1;
                i13 = f36712c[(i13 + iArr[i14]) & 255] & 255;
                int i16 = length + 1;
                iArr[length] = i13;
                if (i16 >= 128) {
                    break;
                }
                length = i16;
                i14 = i15;
            }
        }
        int i17 = (i11 + 7) >> 3;
        int i18 = 128 - i17;
        int i19 = f36712c[(255 >> ((-i11) & 7)) & iArr[i18]] & 255;
        iArr[i18] = i19;
        for (int i21 = i18 - 1; i21 >= 0; i21--) {
            i19 = f36712c[i19 ^ iArr[i21 + i17]] & 255;
            iArr[i21] = i19;
        }
        int[] iArr2 = new int[64];
        for (int i22 = 0; i22 != 64; i22++) {
            int i23 = i22 * 2;
            iArr2[i22] = iArr[i23] + (iArr[i23 + 1] << 8);
        }
        return iArr2;
    }

    private int d(int i11, int i12) {
        int i13 = i11 & Settings.DEFAULT_INITIAL_WINDOW_SIZE;
        return (i13 >> (16 - i12)) | (i13 << i12);
    }

    @Override // org.bouncycastle.crypto.e
    public String getAlgorithmName() {
        return "RC2";
    }

    @Override // org.bouncycastle.crypto.e
    public int getBlockSize() {
        return 8;
    }

    @Override // org.bouncycastle.crypto.e
    public void init(boolean z11, org.bouncycastle.crypto.i iVar) {
        this.f36714b = z11;
        if (iVar instanceof u50.j1) {
            u50.j1 j1Var = (u50.j1) iVar;
            this.f36713a = c(j1Var.a(), j1Var.b());
        } else if (iVar instanceof u50.b1) {
            byte[] a11 = ((u50.b1) iVar).a();
            this.f36713a = c(a11, a11.length * 8);
        } else {
            throw new IllegalArgumentException("invalid parameter passed to RC2 init - " + iVar.getClass().getName());
        }
    }

    @Override // org.bouncycastle.crypto.e
    public final int processBlock(byte[] bArr, int i11, byte[] bArr2, int i12) {
        if (this.f36713a != null) {
            if (i11 + 8 <= bArr.length) {
                if (i12 + 8 <= bArr2.length) {
                    if (this.f36714b) {
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
        throw new IllegalStateException("RC2 engine not initialised");
    }

    @Override // org.bouncycastle.crypto.e
    public void reset() {
    }
}