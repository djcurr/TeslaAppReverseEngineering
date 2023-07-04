package u50;

import java.security.SecureRandom;

/* loaded from: classes5.dex */
public final class g0 extends b {

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f53211b;

    /* renamed from: c  reason: collision with root package name */
    private h0 f53212c;

    public g0(SecureRandom secureRandom) {
        super(true);
        byte[] bArr = new byte[32];
        this.f53211b = bArr;
        t60.a.s(secureRandom, bArr);
    }

    public g0(byte[] bArr) {
        this(d(bArr), 0);
    }

    public g0(byte[] bArr, int i11) {
        super(true);
        byte[] bArr2 = new byte[32];
        this.f53211b = bArr2;
        System.arraycopy(bArr, i11, bArr2, 0, 32);
    }

    private static byte[] d(byte[] bArr) {
        if (bArr.length == 32) {
            return bArr;
        }
        throw new IllegalArgumentException("'buf' must have length 32");
    }

    public h0 b() {
        h0 h0Var;
        synchronized (this.f53211b) {
            if (this.f53212c == null) {
                byte[] bArr = new byte[32];
                t60.a.t(this.f53211b, 0, bArr, 0);
                this.f53212c = new h0(bArr, 0);
            }
            h0Var = this.f53212c;
        }
        return h0Var;
    }

    public void c(int i11, byte[] bArr, byte[] bArr2, int i12, int i13, byte[] bArr3, int i14) {
        byte[] bArr4 = new byte[32];
        b().b(bArr4, 0);
        if (i11 == 0) {
            if (bArr != null) {
                throw new IllegalArgumentException("ctx");
            }
            t60.a.T(this.f53211b, 0, bArr4, 0, bArr2, i12, i13, bArr3, i14);
        } else if (i11 == 1) {
            t60.a.U(this.f53211b, 0, bArr4, 0, bArr, bArr2, i12, i13, bArr3, i14);
        } else if (i11 != 2) {
            throw new IllegalArgumentException("algorithm");
        } else {
            if (64 != i13) {
                throw new IllegalArgumentException("msgLen");
            }
            t60.a.V(this.f53211b, 0, bArr4, 0, bArr, bArr2, i12, bArr3, i14);
        }
    }

    public byte[] getEncoded() {
        return org.bouncycastle.util.a.h(this.f53211b);
    }
}