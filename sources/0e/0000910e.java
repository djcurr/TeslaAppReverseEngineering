package org.bouncycastle.asn1;

/* loaded from: classes5.dex */
public class x0 extends q {

    /* renamed from: c  reason: collision with root package name */
    private int f43120c;

    public x0() {
        this.f43120c = -1;
    }

    public x0(e40.b bVar) {
        super(bVar);
        this.f43120c = -1;
    }

    public x0(d dVar) {
        super(dVar, true);
        this.f43120c = -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public x0(boolean z11, e40.b[] bVarArr) {
        super(x(z11), bVarArr);
        this.f43120c = -1;
    }

    public x0(e40.b[] bVarArr) {
        super(bVarArr, true);
        this.f43120c = -1;
    }

    private static boolean x(boolean z11) {
        if (z11) {
            return z11;
        }
        throw new IllegalStateException("DERSet elements should always be in sorted order");
    }

    private int y() {
        if (this.f43120c < 0) {
            int length = this.f43081a.length;
            int i11 = 0;
            for (int i12 = 0; i12 < length; i12++) {
                i11 += this.f43081a[i12].toASN1Primitive().n().h();
            }
            this.f43120c = i11;
        }
        return this.f43120c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public void f(m mVar, boolean z11) {
        if (z11) {
            mVar.f(49);
        }
        u0 d11 = mVar.d();
        int length = this.f43081a.length;
        int i11 = 0;
        if (this.f43120c >= 0 || length > 16) {
            mVar.r(y());
            while (i11 < length) {
                this.f43081a[i11].toASN1Primitive().n().f(d11, true);
                i11++;
            }
            return;
        }
        n[] nVarArr = new n[length];
        int i12 = 0;
        for (int i13 = 0; i13 < length; i13++) {
            n n11 = this.f43081a[i13].toASN1Primitive().n();
            nVarArr[i13] = n11;
            i12 += n11.h();
        }
        this.f43120c = i12;
        mVar.r(i12);
        while (i11 < length) {
            nVarArr[i11].f(d11, true);
            i11++;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public int h() {
        int y11 = y();
        return v1.a(y11) + 1 + y11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.q, org.bouncycastle.asn1.n
    public n n() {
        return this.f43082b ? this : super.n();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.q, org.bouncycastle.asn1.n
    public n o() {
        return this;
    }
}