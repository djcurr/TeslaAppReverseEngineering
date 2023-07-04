package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.image.EncodedImage;

/* loaded from: classes3.dex */
public class c1 implements o0<nf.e> {

    /* renamed from: a  reason: collision with root package name */
    private final d1<EncodedImage>[] f11349a;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class a extends p<nf.e, nf.e> {

        /* renamed from: c  reason: collision with root package name */
        private final p0 f11350c;

        /* renamed from: d  reason: collision with root package name */
        private final int f11351d;

        /* renamed from: e  reason: collision with root package name */
        private final p001if.d f11352e;

        public a(l<nf.e> lVar, p0 p0Var, int i11) {
            super(lVar);
            this.f11350c = p0Var;
            this.f11351d = i11;
            this.f11352e = p0Var.l().o();
        }

        @Override // com.facebook.imagepipeline.producers.p, com.facebook.imagepipeline.producers.b
        protected void g(Throwable th2) {
            if (c1.this.e(this.f11351d + 1, o(), this.f11350c)) {
                return;
            }
            o().onFailure(th2);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.b
        /* renamed from: p */
        public void h(nf.e eVar, int i11) {
            if (eVar != null && (b.e(i11) || e1.c(eVar, this.f11352e))) {
                o().b(eVar, i11);
            } else if (b.d(i11)) {
                nf.e.j(eVar);
                if (c1.this.e(this.f11351d + 1, o(), this.f11350c)) {
                    return;
                }
                o().b(null, 1);
            }
        }
    }

    public c1(d1<EncodedImage>... d1VarArr) {
        d1<EncodedImage>[] d1VarArr2 = (d1[]) md.k.g(d1VarArr);
        this.f11349a = d1VarArr2;
        md.k.e(0, d1VarArr2.length);
    }

    private int d(int i11, p001if.d dVar) {
        while (true) {
            d1<EncodedImage>[] d1VarArr = this.f11349a;
            if (i11 >= d1VarArr.length) {
                return -1;
            }
            if (d1VarArr[i11].a(dVar)) {
                return i11;
            }
            i11++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean e(int i11, l<nf.e> lVar, p0 p0Var) {
        int d11 = d(i11, p0Var.l().o());
        if (d11 == -1) {
            return false;
        }
        this.f11349a[d11].b(new a(lVar, p0Var, d11), p0Var);
        return true;
    }

    @Override // com.facebook.imagepipeline.producers.o0
    public void b(l<nf.e> lVar, p0 p0Var) {
        if (p0Var.l().o() == null) {
            lVar.b(null, 1);
        } else if (e(0, lVar, p0Var)) {
        } else {
            lVar.b(null, 1);
        }
    }
}