package org.bouncycastle.asn1;

/* loaded from: classes5.dex */
public class r0 extends n implements e40.g {

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f43093a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public r0(byte[] bArr) {
        this.f43093a = bArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public boolean e(n nVar) {
        if (nVar instanceof r0) {
            return org.bouncycastle.util.a.c(this.f43093a, ((r0) nVar).f43093a);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public void f(m mVar, boolean z11) {
        mVar.n(z11, 18, this.f43093a);
    }

    @Override // e40.g
    public String getString() {
        return r70.m.b(this.f43093a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public int h() {
        return v1.a(this.f43093a.length) + 1 + this.f43093a.length;
    }

    @Override // e40.c
    public int hashCode() {
        return org.bouncycastle.util.a.F(this.f43093a);
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