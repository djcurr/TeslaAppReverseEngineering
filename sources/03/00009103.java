package org.bouncycastle.asn1;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import org.spongycastle.asn1.ASN1Encoding;

/* loaded from: classes5.dex */
public class u extends a {
    public u(int i11, d dVar) {
        super(true, i11, u(dVar));
    }

    private static byte[] u(d dVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        for (int i11 = 0; i11 != dVar.f(); i11++) {
            try {
                byteArrayOutputStream.write(((e40.c) dVar.d(i11)).d(ASN1Encoding.BER));
            } catch (IOException e11) {
                throw new ASN1ParsingException("malformed object: " + e11, e11);
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.a, org.bouncycastle.asn1.n
    public void f(m mVar, boolean z11) {
        mVar.o(z11, this.f43012a ? 96 : 64, this.f43013b, this.f43014c);
    }
}