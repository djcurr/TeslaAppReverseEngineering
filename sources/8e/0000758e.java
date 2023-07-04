package il;

import hl.r;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import ol.a0;

/* loaded from: classes3.dex */
public final class j implements hl.a {

    /* renamed from: c  reason: collision with root package name */
    private static final byte[] f30465c = new byte[0];

    /* renamed from: a  reason: collision with root package name */
    private final a0 f30466a;

    /* renamed from: b  reason: collision with root package name */
    private final hl.a f30467b;

    public j(a0 a0Var, hl.a aVar) {
        this.f30466a = a0Var;
        this.f30467b = aVar;
    }

    private byte[] b(byte[] bArr, byte[] bArr2) {
        return ByteBuffer.allocate(bArr.length + 4 + bArr2.length).putInt(bArr.length).put(bArr).put(bArr2).array();
    }

    @Override // hl.a
    public byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] byteArray = r.o(this.f30466a).toByteArray();
        return b(this.f30467b.a(byteArray, f30465c), ((hl.a) r.i(this.f30466a.I(), byteArray, hl.a.class)).a(bArr, bArr2));
    }

    @Override // hl.a
    public byte[] decrypt(byte[] bArr, byte[] bArr2) {
        try {
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            int i11 = wrap.getInt();
            if (i11 > 0 && i11 <= bArr.length - 4) {
                byte[] bArr3 = new byte[i11];
                wrap.get(bArr3, 0, i11);
                byte[] bArr4 = new byte[wrap.remaining()];
                wrap.get(bArr4, 0, wrap.remaining());
                return ((hl.a) r.i(this.f30466a.I(), this.f30467b.decrypt(bArr3, f30465c), hl.a.class)).decrypt(bArr4, bArr2);
            }
            throw new GeneralSecurityException("invalid ciphertext");
        } catch (IndexOutOfBoundsException | NegativeArraySizeException | BufferUnderflowException e11) {
            throw new GeneralSecurityException("invalid ciphertext", e11);
        }
    }
}