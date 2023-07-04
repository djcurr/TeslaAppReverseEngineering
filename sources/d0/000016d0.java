package com.facebook.imagepipeline.producers;

/* loaded from: classes3.dex */
public class a implements o0<nf.e> {

    /* renamed from: a  reason: collision with root package name */
    private final o0<nf.e> f11320a;

    /* loaded from: classes3.dex */
    private static class b extends p<nf.e, nf.e> {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.b
        /* renamed from: p */
        public void h(nf.e eVar, int i11) {
            if (eVar == null) {
                o().b(null, i11);
                return;
            }
            if (!nf.e.D0(eVar)) {
                eVar.I0();
            }
            o().b(eVar, i11);
        }

        private b(l<nf.e> lVar) {
            super(lVar);
        }
    }

    public a(o0<nf.e> o0Var) {
        this.f11320a = o0Var;
    }

    @Override // com.facebook.imagepipeline.producers.o0
    public void b(l<nf.e> lVar, p0 p0Var) {
        this.f11320a.b(new b(lVar), p0Var);
    }
}