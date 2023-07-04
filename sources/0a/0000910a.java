package org.bouncycastle.asn1;

/* loaded from: classes5.dex */
public class w0 extends p {

    /* renamed from: b  reason: collision with root package name */
    private int f43113b;

    public w0() {
        this.f43113b = -1;
    }

    public w0(e40.b bVar) {
        super(bVar);
        this.f43113b = -1;
    }

    public w0(d dVar) {
        super(dVar);
        this.f43113b = -1;
    }

    public w0(e40.b[] bVarArr) {
        super(bVarArr);
        this.f43113b = -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public w0(e40.b[] bVarArr, boolean z11) {
        super(bVarArr, z11);
        this.f43113b = -1;
    }

    public static w0 u(p pVar) {
        return (w0) pVar.n();
    }

    private int v() {
        if (this.f43113b < 0) {
            int length = this.f43074a.length;
            int i11 = 0;
            for (int i12 = 0; i12 < length; i12++) {
                i11 += this.f43074a[i12].toASN1Primitive().n().h();
            }
            this.f43113b = i11;
        }
        return this.f43113b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public void f(m mVar, boolean z11) {
        if (z11) {
            mVar.f(48);
        }
        u0 d11 = mVar.d();
        int length = this.f43074a.length;
        int i11 = 0;
        if (this.f43113b >= 0 || length > 16) {
            mVar.r(v());
            while (i11 < length) {
                this.f43074a[i11].toASN1Primitive().n().f(d11, true);
                i11++;
            }
            return;
        }
        n[] nVarArr = new n[length];
        int i12 = 0;
        for (int i13 = 0; i13 < length; i13++) {
            n n11 = this.f43074a[i13].toASN1Primitive().n();
            nVarArr[i13] = n11;
            i12 += n11.h();
        }
        this.f43113b = i12;
        mVar.r(i12);
        while (i11 < length) {
            nVarArr[i11].f(d11, true);
            i11++;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public int h() {
        int v11 = v();
        return v1.a(v11) + 1 + v11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.p, org.bouncycastle.asn1.n
    public n n() {
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.p, org.bouncycastle.asn1.n
    public n o() {
        return this;
    }
}