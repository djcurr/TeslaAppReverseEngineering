package org.bouncycastle.asn1;

/* loaded from: classes5.dex */
public class f1 extends b {
    public f1(byte[] bArr, int i11) {
        super(bArr, i11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public void f(m mVar, boolean z11) {
        mVar.k(z11, 3, (byte) this.f43020b, this.f43019a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public int h() {
        return v1.a(this.f43019a.length + 1) + 1 + this.f43019a.length + 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public boolean m() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.b, org.bouncycastle.asn1.n
    public n o() {
        return this;
    }
}