package pl;

import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes3.dex */
public final class r implements nl.a {

    /* renamed from: a  reason: collision with root package name */
    private final SecretKey f46679a;

    /* renamed from: b  reason: collision with root package name */
    private byte[] f46680b;

    /* renamed from: c  reason: collision with root package name */
    private byte[] f46681c;

    public r(byte[] bArr) {
        w.a(bArr.length);
        this.f46679a = new SecretKeySpec(bArr, "AES");
        b();
    }

    private void b() {
        Cipher c11 = c();
        c11.init(1, this.f46679a);
        byte[] b11 = e.b(c11.doFinal(new byte[16]));
        this.f46680b = b11;
        this.f46681c = e.b(b11);
    }

    private static Cipher c() {
        return m.f46674f.a("AES/ECB/NoPadding");
    }

    @Override // nl.a
    public byte[] a(byte[] bArr, int i11) {
        byte[] e11;
        if (i11 <= 16) {
            Cipher c11 = c();
            c11.init(1, this.f46679a);
            int max = Math.max(1, (int) Math.ceil(bArr.length / 16.0d));
            if (max * 16 == bArr.length) {
                e11 = g.d(bArr, (max - 1) * 16, this.f46680b, 0, 16);
            } else {
                e11 = g.e(e.a(Arrays.copyOfRange(bArr, (max - 1) * 16, bArr.length)), this.f46681c);
            }
            byte[] bArr2 = new byte[16];
            for (int i12 = 0; i12 < max - 1; i12++) {
                bArr2 = c11.doFinal(g.d(bArr2, 0, bArr, i12 * 16, 16));
            }
            return Arrays.copyOf(c11.doFinal(g.e(e11, bArr2)), i11);
        }
        throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
    }
}