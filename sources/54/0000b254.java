package sc;

/* loaded from: classes.dex */
public class p extends i<a> {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends h {

        /* renamed from: b  reason: collision with root package name */
        int f50375b;

        public a(p pVar, bc.m mVar) {
            super(mVar);
            mVar.t(4L);
            this.f50375b = mVar.f();
            mVar.f();
            mVar.f();
            mVar.h();
            mVar.t(1L);
        }
    }

    public p(bc.m mVar, sc.a aVar) {
        super(mVar, aVar);
    }

    public void b(tc.o oVar) {
        a aVar = (a) this.f50348d.get(0);
        oVar.B(1, (aVar.f50375b & 1) == 1);
        oVar.B(2, (aVar.f50375b & 2) == 2);
        oVar.B(3, (aVar.f50375b & 4) == 4);
        oVar.B(4, (aVar.f50375b & 8) == 8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // sc.i
    /* renamed from: c */
    public a a(bc.m mVar) {
        return new a(this, mVar);
    }
}