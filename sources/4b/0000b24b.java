package sc;

/* loaded from: classes.dex */
public class k extends i<a> {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends h {

        /* renamed from: b  reason: collision with root package name */
        int f50350b;

        /* renamed from: c  reason: collision with root package name */
        int f50351c;

        public a(k kVar, bc.m mVar) {
            super(mVar);
            mVar.p();
            mVar.p();
            mVar.f();
            this.f50350b = mVar.p();
            this.f50351c = mVar.p();
            mVar.p();
            mVar.p();
            mVar.q();
        }
    }

    public k(bc.m mVar, sc.a aVar) {
        super(mVar, aVar);
    }

    public void b(tc.f fVar) {
        a aVar = (a) this.f50348d.get(0);
        fVar.R(769, rc.c.a(769, aVar.f50346a));
        fVar.J(770, aVar.f50350b);
        fVar.J(771, aVar.f50351c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // sc.i
    /* renamed from: c */
    public a a(bc.m mVar) {
        return new a(this, mVar);
    }
}