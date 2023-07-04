package sc;

import okhttp3.internal.ws.WebSocketProtocol;

/* loaded from: classes.dex */
public class r extends i<a> {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends h {

        /* renamed from: b  reason: collision with root package name */
        String f50378b;

        /* renamed from: c  reason: collision with root package name */
        long f50379c;

        /* renamed from: d  reason: collision with root package name */
        long f50380d;

        /* renamed from: e  reason: collision with root package name */
        int f50381e;

        /* renamed from: f  reason: collision with root package name */
        int f50382f;

        /* renamed from: g  reason: collision with root package name */
        long f50383g;

        /* renamed from: h  reason: collision with root package name */
        long f50384h;

        /* renamed from: i  reason: collision with root package name */
        String f50385i;

        /* renamed from: j  reason: collision with root package name */
        int f50386j;

        /* renamed from: k  reason: collision with root package name */
        int f50387k;

        public a(r rVar, bc.m mVar) {
            super(mVar);
            mVar.p();
            mVar.p();
            this.f50378b = mVar.m(4);
            this.f50379c = mVar.q();
            this.f50380d = mVar.q();
            this.f50381e = mVar.p();
            this.f50382f = mVar.p();
            this.f50383g = mVar.q();
            this.f50384h = mVar.q();
            mVar.q();
            mVar.p();
            this.f50385i = mVar.m(mVar.r());
            this.f50386j = mVar.p();
            this.f50387k = mVar.e();
        }
    }

    public r(bc.m mVar, sc.a aVar) {
        super(mVar, aVar);
    }

    public void b(tc.r rVar) {
        a aVar = (a) this.f50348d.get(0);
        rc.c.b(1, aVar.f50378b, rVar);
        rc.c.b(10, aVar.f50346a, rVar);
        rVar.L(2, aVar.f50379c);
        rVar.L(3, aVar.f50380d);
        rVar.J(4, aVar.f50381e);
        rVar.J(5, aVar.f50382f);
        rVar.R(8, aVar.f50385i.trim());
        rVar.J(9, aVar.f50386j);
        rVar.J(13, aVar.f50387k);
        long j11 = aVar.f50383g;
        rVar.F(6, ((j11 & (-65536)) >> 16) + ((j11 & WebSocketProtocol.PAYLOAD_SHORT_MAX) / Math.pow(2.0d, 4.0d)));
        long j12 = aVar.f50384h;
        rVar.F(7, ((j12 & (-65536)) >> 16) + ((j12 & WebSocketProtocol.PAYLOAD_SHORT_MAX) / Math.pow(2.0d, 4.0d)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // sc.i
    /* renamed from: c */
    public a a(bc.m mVar) {
        return new a(this, mVar);
    }
}