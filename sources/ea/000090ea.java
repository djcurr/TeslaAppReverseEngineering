package org.bouncycastle.asn1;

/* loaded from: classes5.dex */
public class m0 extends n implements e40.g {

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f43067a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public m0(byte[] bArr) {
        this.f43067a = bArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public boolean e(n nVar) {
        if (nVar instanceof m0) {
            return org.bouncycastle.util.a.c(this.f43067a, ((m0) nVar).f43067a);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public void f(m mVar, boolean z11) {
        mVar.n(z11, 27, this.f43067a);
    }

    @Override // e40.g
    public String getString() {
        return r70.m.b(this.f43067a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public int h() {
        return v1.a(this.f43067a.length) + 1 + this.f43067a.length;
    }

    @Override // e40.c
    public int hashCode() {
        return org.bouncycastle.util.a.F(this.f43067a);
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