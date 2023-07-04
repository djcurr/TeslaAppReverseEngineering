package org.bouncycastle.asn1;

/* loaded from: classes5.dex */
public class y0 extends n implements e40.g {

    /* renamed from: a  reason: collision with root package name */
    private byte[] f43122a;

    public y0(byte[] bArr) {
        this.f43122a = org.bouncycastle.util.a.h(bArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public boolean e(n nVar) {
        if (nVar instanceof y0) {
            return org.bouncycastle.util.a.c(this.f43122a, ((y0) nVar).f43122a);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public void f(m mVar, boolean z11) {
        mVar.n(z11, 20, this.f43122a);
    }

    @Override // e40.g
    public String getString() {
        return r70.m.b(this.f43122a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public int h() {
        return v1.a(this.f43122a.length) + 1 + this.f43122a.length;
    }

    @Override // e40.c
    public int hashCode() {
        return org.bouncycastle.util.a.F(this.f43122a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public boolean m() {
        return false;
    }

    public String toString() {
        return getString();
    }
}