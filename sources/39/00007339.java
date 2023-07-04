package hf;

/* loaded from: classes3.dex */
public class q {

    /* loaded from: classes3.dex */
    static class a implements u<gd.d> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o f29183a;

        a(o oVar) {
            this.f29183a = oVar;
        }

        @Override // hf.u
        /* renamed from: d */
        public void a(gd.d dVar) {
            this.f29183a.n(dVar);
        }

        @Override // hf.u
        /* renamed from: e */
        public void b(gd.d dVar) {
            this.f29183a.b(dVar);
        }

        @Override // hf.u
        /* renamed from: f */
        public void c(gd.d dVar) {
            this.f29183a.k(dVar);
        }
    }

    public static p<gd.d, nf.c> a(s<gd.d, nf.c> sVar, o oVar) {
        oVar.a(sVar);
        return new p<>(sVar, new a(oVar));
    }
}