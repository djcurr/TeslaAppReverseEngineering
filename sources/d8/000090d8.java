package org.bouncycastle.asn1;

import java.io.ByteArrayOutputStream;
import org.spongycastle.asn1.ASN1Encoding;

/* loaded from: classes5.dex */
public class g1 extends f {
    public g1(d dVar) {
        super(dVar);
    }

    public g1(k kVar, i iVar, n nVar, int i11, n nVar2) {
        super(kVar, iVar, nVar, i11, nVar2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public void f(m mVar, boolean z11) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        k kVar = this.f43037a;
        if (kVar != null) {
            byteArrayOutputStream.write(kVar.d(ASN1Encoding.DL));
        }
        i iVar = this.f43038b;
        if (iVar != null) {
            byteArrayOutputStream.write(iVar.d(ASN1Encoding.DL));
        }
        n nVar = this.f43039c;
        if (nVar != null) {
            byteArrayOutputStream.write(nVar.d(ASN1Encoding.DL));
        }
        byteArrayOutputStream.write(new o1(true, this.f43040d, this.f43041e).d(ASN1Encoding.DL));
        mVar.m(z11, 32, 8, byteArrayOutputStream.toByteArray());
    }

    @Override // org.bouncycastle.asn1.f, org.bouncycastle.asn1.n
    int h() {
        return getEncoded().length;
    }

    @Override // org.bouncycastle.asn1.f, org.bouncycastle.asn1.n
    n o() {
        return this;
    }
}