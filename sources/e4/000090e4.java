package org.bouncycastle.asn1;

import java.io.ByteArrayOutputStream;
import org.spongycastle.asn1.ASN1Encoding;

/* loaded from: classes5.dex */
public class k0 extends f {
    public k0(k kVar, i iVar, n nVar, int i11, n nVar2) {
        super(kVar, iVar, nVar, i11, nVar2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public void f(m mVar, boolean z11) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        k kVar = this.f43037a;
        if (kVar != null) {
            byteArrayOutputStream.write(kVar.d(ASN1Encoding.DER));
        }
        i iVar = this.f43038b;
        if (iVar != null) {
            byteArrayOutputStream.write(iVar.d(ASN1Encoding.DER));
        }
        n nVar = this.f43039c;
        if (nVar != null) {
            byteArrayOutputStream.write(nVar.d(ASN1Encoding.DER));
        }
        byteArrayOutputStream.write(new z0(true, this.f43040d, this.f43041e).d(ASN1Encoding.DER));
        mVar.m(z11, 32, 8, byteArrayOutputStream.toByteArray());
    }

    @Override // org.bouncycastle.asn1.f, org.bouncycastle.asn1.n
    int h() {
        return getEncoded().length;
    }

    @Override // org.bouncycastle.asn1.f, org.bouncycastle.asn1.n
    n n() {
        return this;
    }

    @Override // org.bouncycastle.asn1.f, org.bouncycastle.asn1.n
    n o() {
        return this;
    }
}