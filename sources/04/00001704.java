package com.facebook.imagepipeline.producers;

/* loaded from: classes3.dex */
public class k implements o0<nf.e> {

    /* renamed from: a  reason: collision with root package name */
    private final o0<nf.e> f11445a;

    /* renamed from: b  reason: collision with root package name */
    private final o0<nf.e> f11446b;

    /* loaded from: classes3.dex */
    private class b extends p<nf.e, nf.e> {

        /* renamed from: c  reason: collision with root package name */
        private p0 f11447c;

        @Override // com.facebook.imagepipeline.producers.p, com.facebook.imagepipeline.producers.b
        protected void g(Throwable th2) {
            k.this.f11446b.b(o(), this.f11447c);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.b
        /* renamed from: p */
        public void h(nf.e eVar, int i11) {
            com.facebook.imagepipeline.request.a l11 = this.f11447c.l();
            boolean d11 = com.facebook.imagepipeline.producers.b.d(i11);
            boolean c11 = e1.c(eVar, l11.o());
            if (eVar != null && (c11 || l11.g())) {
                if (d11 && c11) {
                    o().b(eVar, i11);
                } else {
                    o().b(eVar, com.facebook.imagepipeline.producers.b.n(i11, 1));
                }
            }
            if (!d11 || c11) {
                return;
            }
            nf.e.j(eVar);
            k.this.f11446b.b(o(), this.f11447c);
        }

        private b(l<nf.e> lVar, p0 p0Var) {
            super(lVar);
            this.f11447c = p0Var;
        }
    }

    public k(o0<nf.e> o0Var, o0<nf.e> o0Var2) {
        this.f11445a = o0Var;
        this.f11446b = o0Var2;
    }

    @Override // com.facebook.imagepipeline.producers.o0
    public void b(l<nf.e> lVar, p0 p0Var) {
        this.f11445a.b(new b(lVar, p0Var), p0Var);
    }
}