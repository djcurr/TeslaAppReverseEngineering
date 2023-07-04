package atd.e0;

import java.security.PublicKey;
import java.security.Signature;

/* loaded from: classes.dex */
final class b extends c {
    static {
        atd.s0.a.a(-798759501752896L);
        atd.s0.a.a(-798768091687488L);
    }

    private Signature b() {
        return Signature.getInstance(atd.s0.a.a(-798665012472384L), atd.i0.a.f6881a);
    }

    @Override // atd.b0.a
    public String a() {
        return atd.s0.a.a(-798381544630848L);
    }

    @Override // atd.e0.c
    public boolean a(byte[] bArr, byte[] bArr2, PublicKey publicKey) {
        Signature b11 = b();
        b11.initVerify(publicKey);
        b11.update(bArr2);
        return b11.verify(bArr);
    }
}