package org.bouncycastle.asn1;

/* loaded from: classes5.dex */
public class z0 extends s {
    public z0(int i11, e40.b bVar) {
        super(true, i11, bVar);
    }

    public z0(boolean z11, int i11, e40.b bVar) {
        super(z11, i11, bVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public void f(m mVar, boolean z11) {
        n n11 = this.f43100c.toASN1Primitive().n();
        mVar.v(z11, (this.f43099b || n11.m()) ? 160 : 128, this.f43098a);
        if (this.f43099b) {
            mVar.r(n11.h());
        }
        n11.f(mVar.d(), this.f43099b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public int h() {
        int b11;
        int h11 = this.f43100c.toASN1Primitive().n().h();
        if (this.f43099b) {
            b11 = v1.b(this.f43098a) + v1.a(h11);
        } else {
            h11--;
            b11 = v1.b(this.f43098a);
        }
        return b11 + h11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public boolean m() {
        return this.f43099b || this.f43100c.toASN1Primitive().n().m();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.s, org.bouncycastle.asn1.n
    public n n() {
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.s, org.bouncycastle.asn1.n
    public n o() {
        return this;
    }
}