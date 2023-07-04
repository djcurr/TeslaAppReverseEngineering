package org.bouncycastle.asn1;

/* loaded from: classes5.dex */
public class m1 extends q {

    /* renamed from: c  reason: collision with root package name */
    private int f43068c;

    public m1() {
        this.f43068c = -1;
    }

    public m1(e40.b bVar) {
        super(bVar);
        this.f43068c = -1;
    }

    public m1(d dVar) {
        super(dVar, false);
        this.f43068c = -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public m1(boolean z11, e40.b[] bVarArr) {
        super(z11, bVarArr);
        this.f43068c = -1;
    }

    private int x() {
        if (this.f43068c < 0) {
            int length = this.f43081a.length;
            int i11 = 0;
            for (int i12 = 0; i12 < length; i12++) {
                i11 += this.f43081a[i12].toASN1Primitive().o().h();
            }
            this.f43068c = i11;
        }
        return this.f43068c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public void f(m mVar, boolean z11) {
        if (z11) {
            mVar.f(49);
        }
        m e11 = mVar.e();
        int length = this.f43081a.length;
        int i11 = 0;
        if (this.f43068c >= 0 || length > 16) {
            mVar.r(x());
            while (i11 < length) {
                e11.u(this.f43081a[i11].toASN1Primitive(), true);
                i11++;
            }
            return;
        }
        n[] nVarArr = new n[length];
        int i12 = 0;
        for (int i13 = 0; i13 < length; i13++) {
            n o11 = this.f43081a[i13].toASN1Primitive().o();
            nVarArr[i13] = o11;
            i12 += o11.h();
        }
        this.f43068c = i12;
        mVar.r(i12);
        while (i11 < length) {
            e11.u(nVarArr[i11], true);
            i11++;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public int h() {
        int x11 = x();
        return v1.a(x11) + 1 + x11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.q, org.bouncycastle.asn1.n
    public n o() {
        return this;
    }
}