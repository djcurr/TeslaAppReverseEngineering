package sc;

import org.spongycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public class m extends i<a> {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends h {

        /* renamed from: b  reason: collision with root package name */
        int f50358b;

        /* renamed from: c  reason: collision with root package name */
        int f50359c;

        /* renamed from: d  reason: collision with root package name */
        int[] f50360d;

        /* renamed from: e  reason: collision with root package name */
        long f50361e;

        /* renamed from: f  reason: collision with root package name */
        int f50362f;

        /* renamed from: g  reason: collision with root package name */
        int f50363g;

        /* renamed from: h  reason: collision with root package name */
        int[] f50364h;

        /* renamed from: i  reason: collision with root package name */
        String f50365i;

        public a(m mVar, bc.m mVar2) {
            super(mVar2);
            this.f50358b = mVar2.f();
            this.f50359c = mVar2.f();
            this.f50360d = new int[]{mVar2.p(), mVar2.p(), mVar2.p()};
            this.f50361e = mVar2.g();
            mVar2.t(8L);
            this.f50362f = mVar2.p();
            this.f50363g = mVar2.p();
            mVar2.t(1L);
            mVar2.t(2L);
            this.f50364h = new int[]{mVar2.p(), mVar2.p(), mVar2.p()};
            this.f50365i = mVar2.m(mVar2.r());
        }
    }

    public m(bc.m mVar, sc.a aVar) {
        super(mVar, aVar);
    }

    public void b(tc.l lVar) {
        a aVar = (a) this.f50348d.get(0);
        lVar.B(1, (aVar.f50358b & 2) == 2);
        lVar.B(2, (aVar.f50358b & 8) == 8);
        lVar.B(3, (aVar.f50358b & 32) == 32);
        lVar.B(4, (aVar.f50358b & 64) == 64);
        lVar.R(5, (aVar.f50358b & 128) == 128 ? "Horizontal" : "Vertical");
        lVar.R(6, (aVar.f50358b & 256) == 256 ? "Reverse" : "Normal");
        lVar.B(7, (aVar.f50358b & 512) == 512);
        lVar.B(8, (aVar.f50358b & 4096) == 4096);
        lVar.B(9, (aVar.f50358b & PKIFailureInfo.certRevoked) == 8192);
        lVar.B(10, (aVar.f50358b & 16384) == 16384);
        int i11 = aVar.f50359c;
        if (i11 == -1) {
            lVar.R(11, "Right");
        } else if (i11 == 0) {
            lVar.R(11, "Left");
        } else if (i11 == 1) {
            lVar.R(11, "Center");
        }
        lVar.K(12, aVar.f50360d);
        lVar.L(13, aVar.f50361e);
        lVar.J(14, aVar.f50362f);
        int i12 = aVar.f50363g;
        if (i12 == 1) {
            lVar.R(15, "Bold");
        } else if (i12 == 2) {
            lVar.R(15, "Italic");
        } else if (i12 == 4) {
            lVar.R(15, "Underline");
        } else if (i12 == 8) {
            lVar.R(15, "Outline");
        } else if (i12 == 16) {
            lVar.R(15, "Shadow");
        } else if (i12 == 32) {
            lVar.R(15, "Condense");
        } else if (i12 == 64) {
            lVar.R(15, "Extend");
        }
        lVar.K(16, aVar.f50364h);
        lVar.R(17, aVar.f50365i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // sc.i
    /* renamed from: c */
    public a a(bc.m mVar) {
        return new a(this, mVar);
    }
}