package u50;

import java.security.SecureRandom;

/* loaded from: classes5.dex */
public final class j0 extends b {

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f53230b;

    /* renamed from: c  reason: collision with root package name */
    private k0 f53231c;

    public j0(SecureRandom secureRandom) {
        super(true);
        byte[] bArr = new byte[57];
        this.f53230b = bArr;
        t60.b.t(secureRandom, bArr);
    }

    public j0(byte[] bArr) {
        this(d(bArr), 0);
    }

    public j0(byte[] bArr, int i11) {
        super(true);
        byte[] bArr2 = new byte[57];
        this.f53230b = bArr2;
        System.arraycopy(bArr, i11, bArr2, 0, 57);
    }

    private static byte[] d(byte[] bArr) {
        if (bArr.length == 57) {
            return bArr;
        }
        throw new IllegalArgumentException("'buf' must have length 57");
    }

    public k0 b() {
        k0 k0Var;
        synchronized (this.f53230b) {
            if (this.f53231c == null) {
                byte[] bArr = new byte[57];
                t60.b.u(this.f53230b, 0, bArr, 0);
                this.f53231c = new k0(bArr, 0);
            }
            k0Var = this.f53231c;
        }
        return k0Var;
    }

    public void c(int i11, byte[] bArr, byte[] bArr2, int i12, int i13, byte[] bArr3, int i14) {
        byte[] bArr4 = new byte[57];
        b().b(bArr4, 0);
        if (i11 == 0) {
            t60.b.P(this.f53230b, 0, bArr4, 0, bArr, bArr2, i12, i13, bArr3, i14);
        } else if (i11 != 1) {
            throw new IllegalArgumentException("algorithm");
        } else {
            if (64 != i13) {
                throw new IllegalArgumentException("msgLen");
            }
            t60.b.Q(this.f53230b, 0, bArr4, 0, bArr, bArr2, i12, bArr3, i14);
        }
    }

    public byte[] getEncoded() {
        return org.bouncycastle.util.a.h(this.f53230b);
    }
}