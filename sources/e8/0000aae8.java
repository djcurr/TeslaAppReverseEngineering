package pl;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class l implements hl.a {

    /* renamed from: a  reason: collision with root package name */
    private final p f46669a;

    /* renamed from: b  reason: collision with root package name */
    private final hl.o f46670b;

    /* renamed from: c  reason: collision with root package name */
    private final int f46671c;

    public l(p pVar, hl.o oVar, int i11) {
        this.f46669a = pVar;
        this.f46670b = oVar;
        this.f46671c = i11;
    }

    @Override // hl.a
    public byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] encrypt = this.f46669a.encrypt(bArr);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        return g.a(encrypt, this.f46670b.b(g.a(bArr2, encrypt, Arrays.copyOf(ByteBuffer.allocate(8).putLong(bArr2.length * 8).array(), 8))));
    }

    @Override // hl.a
    public byte[] decrypt(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int i11 = this.f46671c;
        if (length >= i11) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, bArr.length - i11);
            byte[] copyOfRange2 = Arrays.copyOfRange(bArr, bArr.length - this.f46671c, bArr.length);
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            this.f46670b.a(copyOfRange2, g.a(bArr2, copyOfRange, Arrays.copyOf(ByteBuffer.allocate(8).putLong(bArr2.length * 8).array(), 8)));
            return this.f46669a.a(copyOfRange);
        }
        throw new GeneralSecurityException("ciphertext too short");
    }
}