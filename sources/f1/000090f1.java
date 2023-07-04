package org.bouncycastle.asn1;

/* loaded from: classes5.dex */
public class o1 extends s {
    public o1(boolean z11, int i11, e40.b bVar) {
        super(z11, i11, bVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public void f(m mVar, boolean z11) {
        n o11 = this.f43100c.toASN1Primitive().o();
        mVar.v(z11, (this.f43099b || o11.m()) ? 160 : 128, this.f43098a);
        if (this.f43099b) {
            mVar.r(o11.h());
        }
        mVar.e().u(o11, this.f43099b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public int h() {
        int b11;
        int h11 = this.f43100c.toASN1Primitive().o().h();
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
        return this.f43099b || this.f43100c.toASN1Primitive().o().m();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.s, org.bouncycastle.asn1.n
    public n o() {
        return this;
    }
}