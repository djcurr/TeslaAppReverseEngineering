package org.bouncycastle.asn1;

/* loaded from: classes5.dex */
public class d1 extends n implements e40.g {

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f43032a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d1(byte[] bArr) {
        this.f43032a = bArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public boolean e(n nVar) {
        if (nVar instanceof d1) {
            return org.bouncycastle.util.a.c(this.f43032a, ((d1) nVar).f43032a);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public void f(m mVar, boolean z11) {
        mVar.n(z11, 26, this.f43032a);
    }

    @Override // e40.g
    public String getString() {
        return r70.m.b(this.f43032a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public int h() {
        return v1.a(this.f43032a.length) + 1 + this.f43032a.length;
    }

    @Override // e40.c
    public int hashCode() {
        return org.bouncycastle.util.a.F(this.f43032a);
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