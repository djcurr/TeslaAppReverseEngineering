package org.bouncycastle.asn1;

/* loaded from: classes5.dex */
public class o0 extends n implements e40.g {

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f43073a;

    public o0(byte[] bArr) {
        this.f43073a = org.bouncycastle.util.a.h(bArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public boolean e(n nVar) {
        if (nVar instanceof o0) {
            return org.bouncycastle.util.a.c(this.f43073a, ((o0) nVar).f43073a);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public void f(m mVar, boolean z11) {
        mVar.n(z11, 25, this.f43073a);
    }

    @Override // e40.g
    public String getString() {
        return r70.m.b(this.f43073a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public int h() {
        return v1.a(this.f43073a.length) + 1 + this.f43073a.length;
    }

    @Override // e40.c
    public int hashCode() {
        return org.bouncycastle.util.a.F(this.f43073a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public boolean m() {
        return false;
    }
}