package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.request.a;

/* loaded from: classes3.dex */
public class h implements o0<qd.a<nf.c>> {

    /* renamed from: a  reason: collision with root package name */
    private final hf.s<gd.d, nf.c> f11391a;

    /* renamed from: b  reason: collision with root package name */
    private final hf.f f11392b;

    /* renamed from: c  reason: collision with root package name */
    private final o0<qd.a<nf.c>> f11393c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a extends p<qd.a<nf.c>, qd.a<nf.c>> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ gd.d f11394c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f11395d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(l lVar, gd.d dVar, boolean z11) {
            super(lVar);
            this.f11394c = dVar;
            this.f11395d = z11;
        }

        @Override // com.facebook.imagepipeline.producers.b
        /* renamed from: p */
        public void h(qd.a<nf.c> aVar, int i11) {
            qd.a<nf.c> aVar2;
            boolean d11;
            try {
                if (tf.b.d()) {
                    tf.b.a("BitmapMemoryCacheProducer#onNewResultImpl");
                }
                boolean d12 = b.d(i11);
                if (aVar == null) {
                    if (d12) {
                        o().b(null, i11);
                    }
                    if (d11) {
                        return;
                    }
                    return;
                }
                if (!aVar.J().j() && !b.m(i11, 8)) {
                    if (!d12 && (aVar2 = h.this.f11391a.get(this.f11394c)) != null) {
                        nf.j a11 = aVar.J().a();
                        nf.j a12 = aVar2.J().a();
                        if (!a12.a() && a12.c() < a11.c()) {
                            qd.a.C(aVar2);
                        } else {
                            o().b(aVar2, i11);
                            qd.a.C(aVar2);
                            if (tf.b.d()) {
                                tf.b.b();
                                return;
                            }
                            return;
                        }
                    }
                    qd.a<nf.c> c11 = this.f11395d ? h.this.f11391a.c(this.f11394c, aVar) : null;
                    if (d12) {
                        o().c(1.0f);
                    }
                    l<qd.a<nf.c>> o11 = o();
                    if (c11 != null) {
                        aVar = c11;
                    }
                    o11.b(aVar, i11);
                    qd.a.C(c11);
                    if (tf.b.d()) {
                        tf.b.b();
                        return;
                    }
                    return;
                }
                o().b(aVar, i11);
                if (tf.b.d()) {
                    tf.b.b();
                }
            } finally {
                if (tf.b.d()) {
                    tf.b.b();
                }
            }
        }
    }

    public h(hf.s<gd.d, nf.c> sVar, hf.f fVar, o0<qd.a<nf.c>> o0Var) {
        this.f11391a = sVar;
        this.f11392b = fVar;
        this.f11393c = o0Var;
    }

    private static void f(nf.g gVar, p0 p0Var) {
        p0Var.m(gVar.getExtras());
    }

    @Override // com.facebook.imagepipeline.producers.o0
    public void b(l<qd.a<nf.c>> lVar, p0 p0Var) {
        boolean d11;
        try {
            if (tf.b.d()) {
                tf.b.a("BitmapMemoryCacheProducer#produceResults");
            }
            r0 h11 = p0Var.h();
            h11.d(p0Var, e());
            gd.d a11 = this.f11392b.a(p0Var.l(), p0Var.a());
            qd.a<nf.c> aVar = this.f11391a.get(a11);
            if (aVar != null) {
                f(aVar.J(), p0Var);
                boolean a12 = aVar.J().a().a();
                if (a12) {
                    h11.j(p0Var, e(), h11.f(p0Var, e()) ? md.g.of("cached_value_found", "true") : null);
                    h11.b(p0Var, e(), true);
                    p0Var.e("memory_bitmap", d());
                    lVar.c(1.0f);
                }
                lVar.b(aVar, b.k(a12));
                aVar.close();
                if (a12) {
                    if (d11) {
                        return;
                    }
                    return;
                }
            }
            if (p0Var.p().getValue() >= a.c.BITMAP_MEMORY_CACHE.getValue()) {
                h11.j(p0Var, e(), h11.f(p0Var, e()) ? md.g.of("cached_value_found", "false") : null);
                h11.b(p0Var, e(), false);
                p0Var.e("memory_bitmap", d());
                lVar.b(null, 1);
                if (tf.b.d()) {
                    tf.b.b();
                    return;
                }
                return;
            }
            l<qd.a<nf.c>> g11 = g(lVar, a11, p0Var.l().w());
            h11.j(p0Var, e(), h11.f(p0Var, e()) ? md.g.of("cached_value_found", "false") : null);
            if (tf.b.d()) {
                tf.b.a("mInputProducer.produceResult");
            }
            this.f11393c.b(g11, p0Var);
            if (tf.b.d()) {
                tf.b.b();
            }
            if (tf.b.d()) {
                tf.b.b();
            }
        } finally {
            if (tf.b.d()) {
                tf.b.b();
            }
        }
    }

    protected String d() {
        return "pipe_bg";
    }

    protected String e() {
        return "BitmapMemoryCacheProducer";
    }

    protected l<qd.a<nf.c>> g(l<qd.a<nf.c>> lVar, gd.d dVar, boolean z11) {
        return new a(lVar, dVar, z11);
    }
}