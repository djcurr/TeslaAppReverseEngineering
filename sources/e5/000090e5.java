package org.bouncycastle.asn1;

/* loaded from: classes5.dex */
public class k1 extends p {

    /* renamed from: b  reason: collision with root package name */
    private int f43062b;

    public k1() {
        this.f43062b = -1;
    }

    public k1(e40.b bVar) {
        super(bVar);
        this.f43062b = -1;
    }

    public k1(d dVar) {
        super(dVar);
        this.f43062b = -1;
    }

    public k1(e40.b[] bVarArr) {
        super(bVarArr);
        this.f43062b = -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public k1(e40.b[] bVarArr, boolean z11) {
        super(bVarArr, z11);
        this.f43062b = -1;
    }

    private int u() {
        if (this.f43062b < 0) {
            int length = this.f43074a.length;
            int i11 = 0;
            for (int i12 = 0; i12 < length; i12++) {
                i11 += this.f43074a[i12].toASN1Primitive().o().h();
            }
            this.f43062b = i11;
        }
        return this.f43062b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public void f(m mVar, boolean z11) {
        if (z11) {
            mVar.f(48);
        }
        m e11 = mVar.e();
        int length = this.f43074a.length;
        int i11 = 0;
        if (this.f43062b >= 0 || length > 16) {
            mVar.r(u());
            while (i11 < length) {
                e11.u(this.f43074a[i11].toASN1Primitive(), true);
                i11++;
            }
            return;
        }
        n[] nVarArr = new n[length];
        int i12 = 0;
        for (int i13 = 0; i13 < length; i13++) {
            n o11 = this.f43074a[i13].toASN1Primitive().o();
            nVarArr[i13] = o11;
            i12 += o11.h();
        }
        this.f43062b = i12;
        mVar.r(i12);
        while (i11 < length) {
            e11.u(nVarArr[i11], true);
            i11++;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public int h() {
        int u11 = u();
        return v1.a(u11) + 1 + u11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.p, org.bouncycastle.asn1.n
    public n o() {
        return this;
    }
}