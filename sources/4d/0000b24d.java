package sc;

import org.spongycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public class l extends i<a> {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends h {

        /* renamed from: b  reason: collision with root package name */
        int f50352b;

        /* renamed from: c  reason: collision with root package name */
        long f50353c;

        /* renamed from: d  reason: collision with root package name */
        int f50354d;

        /* renamed from: e  reason: collision with root package name */
        int f50355e;

        /* renamed from: f  reason: collision with root package name */
        int f50356f;

        /* renamed from: g  reason: collision with root package name */
        int[] f50357g;
    }

    public l(bc.m mVar, sc.a aVar) {
        super(mVar, aVar);
    }

    public void b(tc.i iVar) {
        a aVar = (a) this.f50348d.get(0);
        iVar.B(1, (aVar.f50352b & PKIFailureInfo.duplicateCertReq) == 536870912);
        iVar.B(2, (aVar.f50352b & 1073741824) == 1073741824);
        iVar.B(3, (aVar.f50352b & (-1073741824)) == -1073741824);
        iVar.L(4, aVar.f50353c);
        iVar.J(5, aVar.f50354d);
        int i11 = aVar.f50355e;
        if (i11 == 1) {
            iVar.R(6, "Bold");
        } else if (i11 == 2) {
            iVar.R(6, "Italic");
        } else if (i11 == 4) {
            iVar.R(6, "Underline");
        }
        iVar.J(7, aVar.f50356f);
        iVar.K(8, aVar.f50357g);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // sc.i
    /* renamed from: c */
    public a a(bc.m mVar) {
        return null;
    }
}