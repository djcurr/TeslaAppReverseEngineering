package org.bouncycastle.asn1;

/* loaded from: classes5.dex */
public class d0 extends q {
    public d0() {
    }

    public d0(e40.b bVar) {
        super(bVar);
    }

    public d0(d dVar) {
        super(dVar, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public d0(boolean z11, e40.b[] bVarArr) {
        super(z11, bVarArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public void f(m mVar, boolean z11) {
        mVar.q(z11, 49, this.f43081a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public int h() {
        int length = this.f43081a.length;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12++) {
            i11 += this.f43081a[i12].toASN1Primitive().h();
        }
        return i11 + 2 + 2;
    }
}