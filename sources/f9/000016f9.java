package com.facebook.imagepipeline.producers;

import android.graphics.Bitmap;

/* loaded from: classes3.dex */
public class i implements o0<qd.a<nf.c>> {

    /* renamed from: a  reason: collision with root package name */
    private final o0<qd.a<nf.c>> f11404a;

    /* renamed from: b  reason: collision with root package name */
    private final int f11405b;

    /* renamed from: c  reason: collision with root package name */
    private final int f11406c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f11407d;

    /* loaded from: classes3.dex */
    private static class a extends p<qd.a<nf.c>, qd.a<nf.c>> {

        /* renamed from: c  reason: collision with root package name */
        private final int f11408c;

        /* renamed from: d  reason: collision with root package name */
        private final int f11409d;

        a(l<qd.a<nf.c>> lVar, int i11, int i12) {
            super(lVar);
            this.f11408c = i11;
            this.f11409d = i12;
        }

        private void p(qd.a<nf.c> aVar) {
            nf.c J;
            Bitmap p11;
            int rowBytes;
            if (aVar == null || !aVar.R() || (J = aVar.J()) == null || J.isClosed() || !(J instanceof nf.d) || (p11 = ((nf.d) J).p()) == null || (rowBytes = p11.getRowBytes() * p11.getHeight()) < this.f11408c || rowBytes > this.f11409d) {
                return;
            }
            p11.prepareToDraw();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.b
        /* renamed from: q */
        public void h(qd.a<nf.c> aVar, int i11) {
            p(aVar);
            o().b(aVar, i11);
        }
    }

    public i(o0<qd.a<nf.c>> o0Var, int i11, int i12, boolean z11) {
        md.k.b(Boolean.valueOf(i11 <= i12));
        this.f11404a = (o0) md.k.g(o0Var);
        this.f11405b = i11;
        this.f11406c = i12;
        this.f11407d = z11;
    }

    @Override // com.facebook.imagepipeline.producers.o0
    public void b(l<qd.a<nf.c>> lVar, p0 p0Var) {
        if (p0Var.n() && !this.f11407d) {
            this.f11404a.b(lVar, p0Var);
        } else {
            this.f11404a.b(new a(lVar, this.f11405b, this.f11406c), p0Var);
        }
    }
}