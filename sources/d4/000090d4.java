package org.bouncycastle.asn1;

import java.util.Enumeration;

/* loaded from: classes5.dex */
public class f0 extends s {
    public f0(boolean z11, int i11, e40.b bVar) {
        super(z11, i11, bVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public void f(m mVar, boolean z11) {
        Enumeration t11;
        mVar.v(z11, 160, this.f43098a);
        mVar.f(128);
        if (this.f43099b) {
            mVar.u(this.f43100c.toASN1Primitive(), true);
        } else {
            e40.b bVar = this.f43100c;
            if (bVar instanceof l) {
                t11 = bVar instanceof x ? ((x) bVar).v() : new x(((l) bVar).r()).v();
            } else if (bVar instanceof p) {
                t11 = ((p) bVar).s();
            } else if (!(bVar instanceof q)) {
                throw new ASN1Exception("not implemented: " + this.f43100c.getClass().getName());
            } else {
                t11 = ((q) bVar).t();
            }
            mVar.h(t11);
        }
        mVar.f(0);
        mVar.f(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public int h() {
        int b11;
        int h11 = this.f43100c.toASN1Primitive().h();
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
        return this.f43099b || this.f43100c.toASN1Primitive().m();
    }
}