package com.facebook.imagepipeline.producers;

/* loaded from: classes3.dex */
public class m0 implements o0<qd.a<nf.c>> {

    /* renamed from: a  reason: collision with root package name */
    private final hf.s<gd.d, nf.c> f11465a;

    /* renamed from: b  reason: collision with root package name */
    private final hf.f f11466b;

    /* renamed from: c  reason: collision with root package name */
    private final o0<qd.a<nf.c>> f11467c;

    /* loaded from: classes3.dex */
    public static class a extends p<qd.a<nf.c>, qd.a<nf.c>> {

        /* renamed from: c  reason: collision with root package name */
        private final gd.d f11468c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f11469d;

        /* renamed from: e  reason: collision with root package name */
        private final hf.s<gd.d, nf.c> f11470e;

        /* renamed from: f  reason: collision with root package name */
        private final boolean f11471f;

        public a(l<qd.a<nf.c>> lVar, gd.d dVar, boolean z11, hf.s<gd.d, nf.c> sVar, boolean z12) {
            super(lVar);
            this.f11468c = dVar;
            this.f11469d = z11;
            this.f11470e = sVar;
            this.f11471f = z12;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.b
        /* renamed from: p */
        public void h(qd.a<nf.c> aVar, int i11) {
            if (aVar == null) {
                if (b.d(i11)) {
                    o().b(null, i11);
                }
            } else if (!b.e(i11) || this.f11469d) {
                qd.a<nf.c> c11 = this.f11471f ? this.f11470e.c(this.f11468c, aVar) : null;
                try {
                    o().c(1.0f);
                    l<qd.a<nf.c>> o11 = o();
                    if (c11 != null) {
                        aVar = c11;
                    }
                    o11.b(aVar, i11);
                } finally {
                    qd.a.C(c11);
                }
            }
        }
    }

    public m0(hf.s<gd.d, nf.c> sVar, hf.f fVar, o0<qd.a<nf.c>> o0Var) {
        this.f11465a = sVar;
        this.f11466b = fVar;
        this.f11467c = o0Var;
    }

    @Override // com.facebook.imagepipeline.producers.o0
    public void b(l<qd.a<nf.c>> lVar, p0 p0Var) {
        r0 h11 = p0Var.h();
        com.facebook.imagepipeline.request.a l11 = p0Var.l();
        Object a11 = p0Var.a();
        sf.b i11 = l11.i();
        if (i11 != null && i11.a() != null) {
            h11.d(p0Var, c());
            gd.d c11 = this.f11466b.c(l11, a11);
            qd.a<nf.c> aVar = this.f11465a.get(c11);
            if (aVar != null) {
                h11.j(p0Var, c(), h11.f(p0Var, c()) ? md.g.of("cached_value_found", "true") : null);
                h11.b(p0Var, "PostprocessedBitmapMemoryCacheProducer", true);
                p0Var.e("memory_bitmap", "postprocessed");
                lVar.c(1.0f);
                lVar.b(aVar, 1);
                aVar.close();
                return;
            }
            a aVar2 = new a(lVar, c11, i11 instanceof sf.c, this.f11465a, p0Var.l().w());
            h11.j(p0Var, c(), h11.f(p0Var, c()) ? md.g.of("cached_value_found", "false") : null);
            this.f11467c.b(aVar2, p0Var);
            return;
        }
        this.f11467c.b(lVar, p0Var);
    }

    protected String c() {
        return "PostprocessedBitmapMemoryCacheProducer";
    }
}