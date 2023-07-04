package pl;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* loaded from: classes3.dex */
public class t implements hl.o {

    /* renamed from: a  reason: collision with root package name */
    private final nl.a f46687a;

    /* renamed from: b  reason: collision with root package name */
    private final int f46688b;

    public t(nl.a aVar, int i11) {
        this.f46687a = aVar;
        this.f46688b = i11;
        if (i11 >= 10) {
            aVar.a(new byte[0], i11);
            return;
        }
        throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
    }

    @Override // hl.o
    public void a(byte[] bArr, byte[] bArr2) {
        if (!g.b(b(bArr2), bArr)) {
            throw new GeneralSecurityException("invalid MAC");
        }
    }

    @Override // hl.o
    public byte[] b(byte[] bArr) {
        return this.f46687a.a(bArr, this.f46688b);
    }
}