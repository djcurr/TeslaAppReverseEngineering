package com.facebook.imagepipeline.producers;

import com.google.android.gms.common.internal.ImagesContract;
import java.io.InputStream;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public abstract class e0 implements o0<nf.e> {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f11374a;

    /* renamed from: b  reason: collision with root package name */
    private final pd.g f11375b;

    /* loaded from: classes3.dex */
    class a extends w0<nf.e> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ com.facebook.imagepipeline.request.a f11376f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ r0 f11377g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ p0 f11378h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(l lVar, r0 r0Var, p0 p0Var, String str, com.facebook.imagepipeline.request.a aVar, r0 r0Var2, p0 p0Var2) {
            super(lVar, r0Var, p0Var, str);
            this.f11376f = aVar;
            this.f11377g = r0Var2;
            this.f11378h = p0Var2;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // kd.g
        /* renamed from: j */
        public void b(nf.e eVar) {
            nf.e.j(eVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // kd.g
        /* renamed from: k */
        public nf.e c() {
            nf.e d11 = e0.this.d(this.f11376f);
            if (d11 == null) {
                this.f11377g.b(this.f11378h, e0.this.f(), false);
                this.f11378h.g(ImagesContract.LOCAL);
                return null;
            }
            d11.I0();
            this.f11377g.b(this.f11378h, e0.this.f(), true);
            this.f11378h.g(ImagesContract.LOCAL);
            return d11;
        }
    }

    /* loaded from: classes3.dex */
    class b extends e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ w0 f11380a;

        b(e0 e0Var, w0 w0Var) {
            this.f11380a = w0Var;
        }

        @Override // com.facebook.imagepipeline.producers.q0
        public void b() {
            this.f11380a.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public e0(Executor executor, pd.g gVar) {
        this.f11374a = executor;
        this.f11375b = gVar;
    }

    @Override // com.facebook.imagepipeline.producers.o0
    public void b(l<nf.e> lVar, p0 p0Var) {
        r0 h11 = p0Var.h();
        com.facebook.imagepipeline.request.a l11 = p0Var.l();
        p0Var.e(ImagesContract.LOCAL, "fetch");
        a aVar = new a(lVar, h11, p0Var, f(), l11, h11, p0Var);
        p0Var.c(new b(this, aVar));
        this.f11374a.execute(aVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public nf.e c(InputStream inputStream, int i11) {
        qd.a p02;
        qd.a aVar = null;
        try {
            if (i11 <= 0) {
                p02 = qd.a.p0(this.f11375b.a(inputStream));
            } else {
                p02 = qd.a.p0(this.f11375b.b(inputStream, i11));
            }
            aVar = p02;
            return new nf.e(aVar);
        } finally {
            md.b.b(inputStream);
            qd.a.C(aVar);
        }
    }

    protected abstract nf.e d(com.facebook.imagepipeline.request.a aVar);

    /* JADX INFO: Access modifiers changed from: protected */
    public nf.e e(InputStream inputStream, int i11) {
        return c(inputStream, i11);
    }

    protected abstract String f();
}