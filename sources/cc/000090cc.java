package org.bouncycastle.asn1;

/* loaded from: classes5.dex */
public class c1 extends n implements e40.g {

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f43027a;

    public c1(byte[] bArr) {
        this.f43027a = org.bouncycastle.util.a.h(bArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public boolean e(n nVar) {
        if (nVar instanceof c1) {
            return org.bouncycastle.util.a.c(this.f43027a, ((c1) nVar).f43027a);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public void f(m mVar, boolean z11) {
        mVar.n(z11, 21, this.f43027a);
    }

    @Override // e40.g
    public String getString() {
        return r70.m.b(this.f43027a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public int h() {
        return v1.a(this.f43027a.length) + 1 + this.f43027a.length;
    }

    @Override // e40.c
    public int hashCode() {
        return org.bouncycastle.util.a.F(this.f43027a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public boolean m() {
        return false;
    }
}