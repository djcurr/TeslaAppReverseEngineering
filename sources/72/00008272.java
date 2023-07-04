package l50;

import okhttp3.internal.http2.Settings;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.spongycastle.crypto.tls.CipherSuite;

/* loaded from: classes5.dex */
public class b0 implements org.bouncycastle.crypto.e {

    /* renamed from: a  reason: collision with root package name */
    private int[] f36674a = null;

    private int b(byte[] bArr, int i11) {
        return ((bArr[i11] << 8) & CipherSuite.DRAFT_TLS_DHE_RSA_WITH_AES_128_OCB) + (bArr[i11 + 1] & 255);
    }

    private int[] c(byte[] bArr) {
        int i11;
        int[] iArr = new int[52];
        int i12 = 0;
        if (bArr.length < 16) {
            byte[] bArr2 = new byte[16];
            System.arraycopy(bArr, 0, bArr2, 16 - bArr.length, bArr.length);
            bArr = bArr2;
        }
        while (true) {
            if (i12 >= 8) {
                break;
            }
            iArr[i12] = b(bArr, i12 * 2);
            i12++;
        }
        for (i11 = 8; i11 < 52; i11++) {
            int i13 = i11 & 7;
            if (i13 < 6) {
                iArr[i11] = (((iArr[i11 - 7] & 127) << 9) | (iArr[i11 - 6] >> 7)) & Settings.DEFAULT_INITIAL_WINDOW_SIZE;
            } else if (i13 == 6) {
                iArr[i11] = (((iArr[i11 - 7] & 127) << 9) | (iArr[i11 - 14] >> 7)) & Settings.DEFAULT_INITIAL_WINDOW_SIZE;
            } else {
                iArr[i11] = (((iArr[i11 - 15] & 127) << 9) | (iArr[i11 - 14] >> 7)) & Settings.DEFAULT_INITIAL_WINDOW_SIZE;
            }
        }
        return iArr;
    }

    private int[] d(boolean z11, byte[] bArr) {
        return z11 ? c(bArr) : f(c(bArr));
    }

    private void e(int[] iArr, byte[] bArr, int i11, byte[] bArr2, int i12) {
        int b11 = b(bArr, i11);
        int b12 = b(bArr, i11 + 2);
        int b13 = b(bArr, i11 + 4);
        int b14 = b(bArr, i11 + 6);
        int i13 = 0;
        int i14 = b13;
        int i15 = b12;
        int i16 = b11;
        int i17 = 0;
        while (i13 < 8) {
            int i18 = i17 + 1;
            int g11 = g(i16, iArr[i17]);
            int i19 = i18 + 1;
            int i21 = (i15 + iArr[i18]) & Settings.DEFAULT_INITIAL_WINDOW_SIZE;
            int i22 = i19 + 1;
            int i23 = (i14 + iArr[i19]) & Settings.DEFAULT_INITIAL_WINDOW_SIZE;
            int i24 = i22 + 1;
            int g12 = g(b14, iArr[i22]);
            int i25 = i24 + 1;
            int g13 = g(i23 ^ g11, iArr[i24]);
            int g14 = g(((i21 ^ g12) + g13) & Settings.DEFAULT_INITIAL_WINDOW_SIZE, iArr[i25]);
            int i26 = (g13 + g14) & Settings.DEFAULT_INITIAL_WINDOW_SIZE;
            b14 = g12 ^ i26;
            i14 = i26 ^ i21;
            i13++;
            i15 = i23 ^ g14;
            i16 = g11 ^ g14;
            i17 = i25 + 1;
        }
        int i27 = i17 + 1;
        i(g(i16, iArr[i17]), bArr2, i12);
        int i28 = i27 + 1;
        i(i14 + iArr[i27], bArr2, i12 + 2);
        i(i15 + iArr[i28], bArr2, i12 + 4);
        i(g(b14, iArr[i28 + 1]), bArr2, i12 + 6);
    }

    private int[] f(int[] iArr) {
        int[] iArr2 = new int[52];
        int h11 = h(iArr[0]);
        int i11 = 1;
        int a11 = a(iArr[1]);
        int a12 = a(iArr[2]);
        iArr2[51] = h(iArr[3]);
        iArr2[50] = a12;
        iArr2[49] = a11;
        int i12 = 48;
        iArr2[48] = h11;
        int i13 = 4;
        while (i11 < 8) {
            int i14 = i13 + 1;
            int i15 = iArr[i13];
            int i16 = i14 + 1;
            int i17 = i12 - 1;
            iArr2[i17] = iArr[i14];
            int i18 = i17 - 1;
            iArr2[i18] = i15;
            int i19 = i16 + 1;
            int h12 = h(iArr[i16]);
            int i21 = i19 + 1;
            int a13 = a(iArr[i19]);
            int i22 = i21 + 1;
            int a14 = a(iArr[i21]);
            int i23 = i18 - 1;
            iArr2[i23] = h(iArr[i22]);
            int i24 = i23 - 1;
            iArr2[i24] = a13;
            int i25 = i24 - 1;
            iArr2[i25] = a14;
            i12 = i25 - 1;
            iArr2[i12] = h12;
            i11++;
            i13 = i22 + 1;
        }
        int i26 = i13 + 1;
        int i27 = iArr[i13];
        int i28 = i26 + 1;
        int i29 = i12 - 1;
        iArr2[i29] = iArr[i26];
        int i31 = i29 - 1;
        iArr2[i31] = i27;
        int i32 = i28 + 1;
        int h13 = h(iArr[i28]);
        int i33 = i32 + 1;
        int a15 = a(iArr[i32]);
        int i34 = i33 + 1;
        int a16 = a(iArr[i33]);
        int i35 = i31 - 1;
        iArr2[i35] = h(iArr[i34]);
        int i36 = i35 - 1;
        iArr2[i36] = a16;
        int i37 = i36 - 1;
        iArr2[i37] = a15;
        iArr2[i37 - 1] = h13;
        return iArr2;
    }

    private int g(int i11, int i12) {
        int i13;
        if (i11 == 0) {
            i13 = 65537 - i12;
        } else if (i12 == 0) {
            i13 = 65537 - i11;
        } else {
            int i14 = i11 * i12;
            int i15 = i14 & Settings.DEFAULT_INITIAL_WINDOW_SIZE;
            int i16 = i14 >>> 16;
            i13 = (i15 - i16) + (i15 < i16 ? 1 : 0);
        }
        return i13 & Settings.DEFAULT_INITIAL_WINDOW_SIZE;
    }

    private int h(int i11) {
        if (i11 < 2) {
            return i11;
        }
        int i12 = 65537 / i11;
        int i13 = 65537 % i11;
        int i14 = 1;
        while (i13 != 1) {
            int i15 = i11 / i13;
            i11 %= i13;
            i14 = (i14 + (i15 * i12)) & Settings.DEFAULT_INITIAL_WINDOW_SIZE;
            if (i11 == 1) {
                return i14;
            }
            int i16 = i13 / i11;
            i13 %= i11;
            i12 = (i12 + (i16 * i14)) & Settings.DEFAULT_INITIAL_WINDOW_SIZE;
        }
        return (1 - i12) & Settings.DEFAULT_INITIAL_WINDOW_SIZE;
    }

    private void i(int i11, byte[] bArr, int i12) {
        bArr[i12] = (byte) (i11 >>> 8);
        bArr[i12 + 1] = (byte) i11;
    }

    int a(int i11) {
        return (0 - i11) & Settings.DEFAULT_INITIAL_WINDOW_SIZE;
    }

    @Override // org.bouncycastle.crypto.e
    public String getAlgorithmName() {
        return "IDEA";
    }

    @Override // org.bouncycastle.crypto.e
    public int getBlockSize() {
        return 8;
    }

    @Override // org.bouncycastle.crypto.e
    public void init(boolean z11, org.bouncycastle.crypto.i iVar) {
        if (iVar instanceof u50.b1) {
            this.f36674a = d(z11, ((u50.b1) iVar).a());
            return;
        }
        throw new IllegalArgumentException("invalid parameter passed to IDEA init - " + iVar.getClass().getName());
    }

    @Override // org.bouncycastle.crypto.e
    public int processBlock(byte[] bArr, int i11, byte[] bArr2, int i12) {
        int[] iArr = this.f36674a;
        if (iArr != null) {
            if (i11 + 8 <= bArr.length) {
                if (i12 + 8 <= bArr2.length) {
                    e(iArr, bArr, i11, bArr2, i12);
                    return 8;
                }
                throw new OutputLengthException("output buffer too short");
            }
            throw new DataLengthException("input buffer too short");
        }
        throw new IllegalStateException("IDEA engine not initialised");
    }

    @Override // org.bouncycastle.crypto.e
    public void reset() {
    }
}