package u50;

import java.security.SecureRandom;

/* loaded from: classes5.dex */
public final class v1 extends b {

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f53299b;

    public v1(SecureRandom secureRandom) {
        super(true);
        byte[] bArr = new byte[56];
        this.f53299b = bArr;
        s60.c.d(secureRandom, bArr);
    }

    public v1(byte[] bArr) {
        this(d(bArr), 0);
    }

    public v1(byte[] bArr, int i11) {
        super(true);
        byte[] bArr2 = new byte[56];
        this.f53299b = bArr2;
        System.arraycopy(bArr, i11, bArr2, 0, 56);
    }

    private static byte[] d(byte[] bArr) {
        if (bArr.length == 56) {
            return bArr;
        }
        throw new IllegalArgumentException("'buf' must have length 56");
    }

    public w1 b() {
        byte[] bArr = new byte[56];
        s60.c.e(this.f53299b, 0, bArr, 0);
        return new w1(bArr, 0);
    }

    public void c(w1 w1Var, byte[] bArr, int i11) {
        byte[] bArr2 = new byte[56];
        w1Var.b(bArr2, 0);
        if (!s60.c.a(this.f53299b, 0, bArr2, 0, bArr, i11)) {
            throw new IllegalStateException("X448 agreement failed");
        }
    }

    public byte[] getEncoded() {
        return org.bouncycastle.util.a.h(this.f53299b);
    }
}