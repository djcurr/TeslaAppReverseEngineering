package org.bouncycastle.asn1;

/* loaded from: classes5.dex */
public class b0 extends p {
    public b0() {
    }

    public b0(e40.b bVar) {
        super(bVar);
    }

    public b0(d dVar) {
        super(dVar);
    }

    public b0(e40.b[] bVarArr) {
        super(bVarArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public void f(m mVar, boolean z11) {
        mVar.q(z11, 48, this.f43074a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public int h() {
        int length = this.f43074a.length;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12++) {
            i11 += this.f43074a[i12].toASN1Primitive().h();
        }
        return i11 + 2 + 2;
    }
}