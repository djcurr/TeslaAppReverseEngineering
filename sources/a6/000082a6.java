package l50;

import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.spongycastle.crypto.tls.CipherSuite;
import org.spongycastle.math.ec.Tnaf;

/* loaded from: classes5.dex */
public class x implements org.bouncycastle.crypto.b0 {

    /* renamed from: a  reason: collision with root package name */
    private byte[] f36946a;

    /* renamed from: b  reason: collision with root package name */
    private byte[] f36947b;

    /* renamed from: c  reason: collision with root package name */
    private byte[] f36948c;

    /* renamed from: d  reason: collision with root package name */
    private int[] f36949d;

    /* renamed from: e  reason: collision with root package name */
    private int[] f36950e;

    /* renamed from: f  reason: collision with root package name */
    private int f36951f;

    /* renamed from: g  reason: collision with root package name */
    private int f36952g = 4;

    /* renamed from: h  reason: collision with root package name */
    private boolean f36953h = false;

    private byte a() {
        if (this.f36952g > 3) {
            f();
            this.f36952g = 0;
        }
        byte[] bArr = this.f36948c;
        int i11 = this.f36952g;
        this.f36952g = i11 + 1;
        return bArr[i11];
    }

    private int b() {
        int[] iArr = this.f36950e;
        int i11 = (iArr[0] >>> 2) | (iArr[1] << 30);
        int i12 = (iArr[0] >>> 12) | (iArr[1] << 20);
        int i13 = (iArr[0] >>> 15) | (iArr[1] << 17);
        int i14 = (iArr[1] >>> 4) | (iArr[2] << 28);
        int i15 = (iArr[1] >>> 13) | (iArr[2] << 19);
        int i16 = iArr[2];
        int i17 = (iArr[2] >>> 9) | (iArr[3] << 23);
        int i18 = (iArr[2] >>> 25) | (iArr[3] << 7);
        int i19 = (iArr[3] << 1) | (iArr[2] >>> 31);
        int[] iArr2 = this.f36949d;
        int i21 = (iArr2[0] >>> 8) | (iArr2[1] << 24);
        int i22 = (iArr2[0] >>> 13) | (iArr2[1] << 19);
        int i23 = (iArr2[0] >>> 20) | (iArr2[1] << 12);
        int i24 = (iArr2[1] >>> 10) | (iArr2[2] << 22);
        int i25 = (iArr2[1] >>> 28) | (iArr2[2] << 4);
        int i26 = (iArr2[2] >>> 15) | (iArr2[3] << 17);
        int i27 = i19 & i12 & ((iArr2[2] >>> 31) | (iArr2[3] << 1));
        return ((((((((i27 ^ ((((i22 & i23) ^ (i12 & i21)) ^ (i19 & i24)) ^ (i25 & i26))) ^ ((iArr2[2] >>> 29) | (iArr2[3] << 3))) ^ i11) ^ i13) ^ i14) ^ i15) ^ i16) ^ i17) ^ i18;
    }

    private int c() {
        int[] iArr = this.f36949d;
        int i11 = iArr[0];
        int i12 = (iArr[0] >>> 7) | (iArr[1] << 25);
        int i13 = (iArr[1] >>> 6) | (iArr[2] << 26);
        return iArr[3] ^ ((((i12 ^ i11) ^ i13) ^ ((iArr[2] >>> 6) | (iArr[3] << 26))) ^ ((iArr[2] >>> 17) | (iArr[3] << 15)));
    }

    private int d() {
        int[] iArr = this.f36950e;
        int i11 = iArr[0];
        int i12 = (iArr[0] >>> 3) | (iArr[1] << 29);
        int i13 = (iArr[0] >>> 11) | (iArr[1] << 21);
        int i14 = (iArr[0] >>> 13) | (iArr[1] << 19);
        int i15 = (iArr[0] >>> 17) | (iArr[1] << 15);
        int i16 = (iArr[0] >>> 18) | (iArr[1] << 14);
        int i17 = (iArr[0] >>> 26) | (iArr[1] << 6);
        int i18 = (iArr[0] >>> 27) | (iArr[1] << 5);
        int i19 = (iArr[1] >>> 8) | (iArr[2] << 24);
        int i21 = (iArr[1] >>> 16) | (iArr[2] << 16);
        int i22 = (iArr[1] >>> 24) | (iArr[2] << 8);
        int i23 = (iArr[1] >>> 27) | (iArr[2] << 5);
        int i24 = (iArr[1] >>> 29) | (iArr[2] << 3);
        int i25 = (iArr[2] >>> 1) | (iArr[3] << 31);
        return (((((((iArr[3] ^ (((i11 ^ i17) ^ i22) ^ ((iArr[2] >>> 27) | (iArr[3] << 5)))) ^ (i12 & ((iArr[2] >>> 3) | (iArr[3] << 29)))) ^ (i13 & i14)) ^ (i15 & i16)) ^ (i18 & i23)) ^ (i19 & i21)) ^ (i24 & i25)) ^ (((iArr[2] >>> 4) | (iArr[3] << 28)) & ((iArr[2] >>> 20) | (iArr[3] << 12)));
    }

    private void e() {
        for (int i11 = 0; i11 < 8; i11++) {
            this.f36951f = b();
            this.f36950e = h(this.f36950e, (d() ^ this.f36949d[0]) ^ this.f36951f);
            this.f36949d = h(this.f36949d, c() ^ this.f36951f);
        }
        this.f36953h = true;
    }

    private void f() {
        int b11 = b();
        this.f36951f = b11;
        byte[] bArr = this.f36948c;
        bArr[0] = (byte) b11;
        bArr[1] = (byte) (b11 >> 8);
        bArr[2] = (byte) (b11 >> 16);
        bArr[3] = (byte) (b11 >> 24);
        this.f36950e = h(this.f36950e, d() ^ this.f36949d[0]);
        this.f36949d = h(this.f36949d, c());
    }

    private void g(byte[] bArr, byte[] bArr2) {
        bArr2[12] = -1;
        bArr2[13] = -1;
        bArr2[14] = -1;
        bArr2[15] = -1;
        this.f36946a = bArr;
        this.f36947b = bArr2;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int[] iArr = this.f36950e;
            if (i11 >= iArr.length) {
                return;
            }
            byte[] bArr3 = this.f36946a;
            int i13 = i12 + 3;
            int i14 = i12 + 2;
            int i15 = i12 + 1;
            iArr[i11] = (bArr3[i12] & 255) | (bArr3[i13] << 24) | ((bArr3[i14] << Tnaf.POW_2_WIDTH) & 16711680) | ((bArr3[i15] << 8) & CipherSuite.DRAFT_TLS_DHE_RSA_WITH_AES_128_OCB);
            int[] iArr2 = this.f36949d;
            byte[] bArr4 = this.f36947b;
            iArr2[i11] = (bArr4[i12] & 255) | (bArr4[i13] << 24) | ((bArr4[i14] << Tnaf.POW_2_WIDTH) & 16711680) | ((bArr4[i15] << 8) & CipherSuite.DRAFT_TLS_DHE_RSA_WITH_AES_128_OCB);
            i12 += 4;
            i11++;
        }
    }

    private int[] h(int[] iArr, int i11) {
        iArr[0] = iArr[1];
        iArr[1] = iArr[2];
        iArr[2] = iArr[3];
        iArr[3] = i11;
        return iArr;
    }

    @Override // org.bouncycastle.crypto.b0
    public String getAlgorithmName() {
        return "Grain-128";
    }

    @Override // org.bouncycastle.crypto.b0
    public void init(boolean z11, org.bouncycastle.crypto.i iVar) {
        if (!(iVar instanceof u50.f1)) {
            throw new IllegalArgumentException("Grain-128 Init parameters must include an IV");
        }
        u50.f1 f1Var = (u50.f1) iVar;
        byte[] a11 = f1Var.a();
        if (a11 == null || a11.length != 12) {
            throw new IllegalArgumentException("Grain-128  requires exactly 12 bytes of IV");
        }
        if (!(f1Var.b() instanceof u50.b1)) {
            throw new IllegalArgumentException("Grain-128 Init parameters must include a key");
        }
        u50.b1 b1Var = (u50.b1) f1Var.b();
        this.f36947b = new byte[b1Var.a().length];
        this.f36946a = new byte[b1Var.a().length];
        this.f36949d = new int[4];
        this.f36950e = new int[4];
        this.f36948c = new byte[4];
        System.arraycopy(a11, 0, this.f36947b, 0, a11.length);
        System.arraycopy(b1Var.a(), 0, this.f36946a, 0, b1Var.a().length);
        reset();
    }

    @Override // org.bouncycastle.crypto.b0
    public int processBytes(byte[] bArr, int i11, int i12, byte[] bArr2, int i13) {
        if (!this.f36953h) {
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
        this.f36952g = 4;
        g(this.f36946a, this.f36947b);
        e();
    }
}