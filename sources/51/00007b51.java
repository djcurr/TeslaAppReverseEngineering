package j60;

import e50.x0;
import java.io.IOException;
import java.security.Principal;
import org.bouncycastle.asn1.h;
import org.bouncycastle.asn1.p;
import org.spongycastle.asn1.ASN1Encoding;

/* loaded from: classes5.dex */
public class e extends x0 implements Principal {
    public e(c50.c cVar) {
        super((p) cVar.toASN1Primitive());
    }

    public e(x0 x0Var) {
        super((p) x0Var.toASN1Primitive());
    }

    public e(byte[] bArr) {
        super(o(new h(bArr)));
    }

    private static p o(h hVar) {
        try {
            return p.p(hVar.D());
        } catch (IllegalArgumentException e11) {
            throw new IOException("not an ASN.1 Sequence: " + e11);
        }
    }

    @Override // e40.c, r70.c
    public byte[] getEncoded() {
        try {
            return d(ASN1Encoding.DER);
        } catch (IOException e11) {
            throw new RuntimeException(e11.toString());
        }
    }

    @Override // java.security.Principal
    public String getName() {
        return toString();
    }
}