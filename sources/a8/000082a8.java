package l50;

import okhttp3.internal.http2.Settings;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;

/* loaded from: classes5.dex */
public class y implements org.bouncycastle.crypto.b0 {

    /* renamed from: a  reason: collision with root package name */
    private byte[] f36960a;

    /* renamed from: b  reason: collision with root package name */
    private byte[] f36961b;

    /* renamed from: c  reason: collision with root package name */
    private byte[] f36962c;

    /* renamed from: d  reason: collision with root package name */
    private int[] f36963d;

    /* renamed from: e  reason: collision with root package name */
    private int[] f36964e;

    /* renamed from: f  reason: collision with root package name */
    private int f36965f;

    /* renamed from: g  reason: collision with root package name */
    private int f36966g = 2;

    /* renamed from: h  reason: collision with root package name */
    private boolean f36967h = false;

    private byte a() {
        if (this.f36966g > 1) {
            f();
            this.f36966g = 0;
        }
        byte[] bArr = this.f36962c;
        int i11 = this.f36966g;
        this.f36966g = i11 + 1;
        return bArr[i11];
    }

    private int b() {
        int[] iArr = this.f36964e;
        int i11 = (iArr[0] >>> 1) | (iArr[1] << 15);
        int i12 = (iArr[0] >>> 2) | (iArr[1] << 14);
        int i13 = (iArr[0] >>> 4) | (iArr[1] << 12);
        int i14 = (iArr[0] >>> 10) | (iArr[1] << 6);
        int i15 = (iArr[1] >>> 15) | (iArr[2] << 1);
        int i16 = (iArr[2] >>> 11) | (iArr[3] << 5);
        int i17 = (iArr[3] >>> 8) | (iArr[4] << 8);
        int i18 = (iArr[4] << 1) | (iArr[3] >>> 15);
        int[] iArr2 = this.f36963d;
        int i19 = (iArr2[0] >>> 3) | (iArr2[1] << 13);
        int i21 = (iArr2[1] >>> 9) | (iArr2[2] << 7);
        int i22 = (iArr2[3] << 2) | (iArr2[2] >>> 14);
        int i23 = iArr2[4];
        int i24 = (i21 ^ i18) ^ (i19 & i23);
        int i25 = i22 & i23;
        int i26 = i19 & i22;
        int i27 = i23 & i26;
        int i28 = i26 & i18;
        return (((((((((i18 & i25) ^ ((i28 ^ (i27 ^ (((i24 ^ i25) ^ (i23 & i18)) ^ ((i19 & i21) & i22)))) ^ ((i21 & i22) & i18))) ^ i11) ^ i12) ^ i13) ^ i14) ^ i15) ^ i16) ^ i17) & Settings.DEFAULT_INITIAL_WINDOW_SIZE;
    }

    private int c() {
        int[] iArr = this.f36963d;
        int i11 = iArr[0];
        int i12 = (iArr[1] >>> 7) | (iArr[2] << 9);
        int i13 = (iArr[2] >>> 6) | (iArr[3] << 10);
        return (((iArr[4] << 2) | (iArr[3] >>> 14)) ^ ((((((iArr[0] >>> 13) | (iArr[1] << 3)) ^ i11) ^ i12) ^ i13) ^ ((iArr[3] >>> 3) | (iArr[4] << 13)))) & Settings.DEFAULT_INITIAL_WINDOW_SIZE;
    }

    private int d() {
        int[] iArr = this.f36964e;
        int i11 = iArr[0];
        int i12 = (iArr[0] >>> 9) | (iArr[1] << 7);
        int i13 = (iArr[0] >>> 14) | (iArr[1] << 2);
        int i14 = (iArr[0] >>> 15) | (iArr[1] << 1);
        int i15 = (iArr[1] >>> 5) | (iArr[2] << 11);
        int i16 = (iArr[1] >>> 12) | (iArr[2] << 4);
        int i17 = (iArr[2] >>> 1) | (iArr[3] << 15);
        int i18 = (iArr[2] >>> 5) | (iArr[3] << 11);
        int i19 = (iArr[2] >>> 13) | (iArr[3] << 3);
        int i21 = (iArr[3] >>> 4) | (iArr[4] << 12);
        int i22 = (iArr[3] >>> 12) | (iArr[4] << 4);
        int i23 = (iArr[4] << 1) | (iArr[3] >>> 15);
        int i24 = i23 & i22;
        int i25 = i22 & i21;
        int i26 = ((((i11 ^ (((((((((((iArr[3] >>> 14) | (iArr[4] << 2)) ^ i22) ^ i21) ^ i19) ^ i18) ^ i17) ^ i16) ^ i15) ^ i13) ^ i12)) ^ i24) ^ (i18 & i17)) ^ (i14 & i12)) ^ (i25 & i19);
        int i27 = i17 & i16 & i15;
        return (((((((((i23 & i19) & i16) & i12) ^ (i26 ^ i27)) ^ ((i25 & i18) & i17)) ^ ((i24 & i15) & i14)) ^ (((i24 & i21) & i19) & i18)) ^ ((i14 & i27) & i12)) ^ (((((i21 & i19) & i18) & i17) & i16) & i15)) & Settings.DEFAULT_INITIAL_WINDOW_SIZE;
    }

    private void e() {
        for (int i11 = 0; i11 < 10; i11++) {
            this.f36965f = b();
            this.f36964e = h(this.f36964e, (d() ^ this.f36963d[0]) ^ this.f36965f);
            this.f36963d = h(this.f36963d, c() ^ this.f36965f);
        }
        this.f36967h = true;
    }

    private void f() {
        int b11 = b();
        this.f36965f = b11;
        byte[] bArr = this.f36962c;
        bArr[0] = (byte) b11;
        bArr[1] = (byte) (b11 >> 8);
        this.f36964e = h(this.f36964e, d() ^ this.f36963d[0]);
        this.f36963d = h(this.f36963d, c());
    }

    private void g(byte[] bArr, byte[] bArr2) {
        bArr2[8] = -1;
        bArr2[9] = -1;
        this.f36960a = bArr;
        this.f36961b = bArr2;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int[] iArr = this.f36964e;
            if (i11 >= iArr.length) {
                return;
            }
            byte[] bArr3 = this.f36960a;
            int i13 = i12 + 1;
            iArr[i11] = ((bArr3[i12] & 255) | (bArr3[i13] << 8)) & Settings.DEFAULT_INITIAL_WINDOW_SIZE;
            int[] iArr2 = this.f36963d;
            byte[] bArr4 = this.f36961b;
            iArr2[i11] = ((bArr4[i12] & 255) | (bArr4[i13] << 8)) & Settings.DEFAULT_INITIAL_WINDOW_SIZE;
            i12 += 2;
            i11++;
        }
    }

    private int[] h(int[] iArr, int i11) {
        iArr[0] = iArr[1];
        iArr[1] = iArr[2];
        iArr[2] = iArr[3];
        iArr[3] = iArr[4];
        iArr[4] = i11;
        return iArr;
    }

    @Override // org.bouncycastle.crypto.b0
    public String getAlgorithmName() {
        return "Grain v1";
    }

    @Override // org.bouncycastle.crypto.b0
    public void init(boolean z11, org.bouncycastle.crypto.i iVar) {
        if (!(iVar instanceof u50.f1)) {
            throw new IllegalArgumentException("Grain v1 Init parameters must include an IV");
        }
        u50.f1 f1Var = (u50.f1) iVar;
        byte[] a11 = f1Var.a();
        if (a11 == null || a11.length != 8) {
            throw new IllegalArgumentException("Grain v1 requires exactly 8 bytes of IV");
        }
        if (!(f1Var.b() instanceof u50.b1)) {
            throw new IllegalArgumentException("Grain v1 Init parameters must include a key");
        }
        u50.b1 b1Var = (u50.b1) f1Var.b();
        this.f36961b = new byte[b1Var.a().length];
        this.f36960a = new byte[b1Var.a().length];
        this.f36963d = new int[5];
        this.f36964e = new int[5];
        this.f36962c = new byte[2];
        System.arraycopy(a11, 0, this.f36961b, 0, a11.length);
        System.arraycopy(b1Var.a(), 0, this.f36960a, 0, b1Var.a().length);
        reset();
    }

    @Override // org.bouncycastle.crypto.b0
    public int processBytes(byte[] bArr, int i11, int i12, byte[] bArr2, int i13) {
        if (!this.f36967h) {
            throw new IllegalStateException(getAlgorithmName() + " not initialised");
        } else if (i11 + i12 <= bArr.length) {
            if (i13 + i12 <= bArr2.length) {
                for (int i14 = 0; i14 < i12; i14++) {
                    bArr2[i13 + i14] = (byte) (bArr[i11 + i14] ^ a());
                }
                return i12;
            }
            throw new OutputLengthException("output buffer too short");
        } else {
            throw new DataLengthException("input buffer too short");
        }
    }

    @Override // org.bouncycastle.crypto.b0
    public void reset() {
        this.f36966g = 2;
        g(this.f36960a, this.f36961b);
        e();
    }
}