package u50;

import java.security.SecureRandom;

/* loaded from: classes5.dex */
public final class s1 extends b {

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f53287b;

    public s1(SecureRandom secureRandom) {
        super(true);
        byte[] bArr = new byte[32];
        this.f53287b = bArr;
        s60.a.d(secureRandom, bArr);
    }

    public s1(byte[] bArr) {
        this(d(bArr), 0);
    }

    public s1(byte[] bArr, int i11) {
        super(true);
        byte[] bArr2 = new byte[32];
        this.f53287b = bArr2;
        System.arraycopy(bArr, i11, bArr2, 0, 32);
    }

    private static byte[] d(byte[] bArr) {
        if (bArr.length == 32) {
            return bArr;
        }
        throw new IllegalArgumentException("'buf' must have length 32");
    }

    public t1 b() {
        byte[] bArr = new byte[32];
        s60.a.e(this.f53287b, 0, bArr, 0);
        return new t1(bArr, 0);
    }

    public void c(t1 t1Var, byte[] bArr, int i11) {
        byte[] bArr2 = new byte[32];
        t1Var.b(bArr2, 0);
        if (!s60.a.a(this.f53287b, 0, bArr2, 0, bArr, i11)) {
            throw new IllegalStateException("X25519 agreement failed");
        }
    }

    public byte[] getEncoded() {
        return org.bouncycastle.util.a.h(this.f53287b);
    }
}