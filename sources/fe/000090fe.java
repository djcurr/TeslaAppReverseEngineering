package org.bouncycastle.asn1;

import org.spongycastle.asn1.ASN1Encoding;

/* loaded from: classes5.dex */
public class s0 extends l {
    public s0(e40.b bVar) {
        super(bVar.toASN1Primitive().d(ASN1Encoding.DER));
    }

    public s0(byte[] bArr) {
        super(bArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public void f(m mVar, boolean z11) {
        mVar.n(z11, 4, this.f43063a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public int h() {
        return v1.a(this.f43063a.length) + 1 + this.f43063a.length;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public boolean m() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.l, org.bouncycastle.asn1.n
    public n n() {
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.l, org.bouncycastle.asn1.n
    public n o() {
        return this;
    }
}