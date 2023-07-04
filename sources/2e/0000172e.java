package com.facebook.imagepipeline.producers;

import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.imagepipeline.request.a;

/* loaded from: classes3.dex */
public class t implements o0<nf.e> {

    /* renamed from: a  reason: collision with root package name */
    private final hf.s<gd.d, PooledByteBuffer> f11539a;

    /* renamed from: b  reason: collision with root package name */
    private final hf.f f11540b;

    /* renamed from: c  reason: collision with root package name */
    private final o0<nf.e> f11541c;

    /* loaded from: classes3.dex */
    private static class a extends p<nf.e, nf.e> {

        /* renamed from: c  reason: collision with root package name */
        private final hf.s<gd.d, PooledByteBuffer> f11542c;

        /* renamed from: d  reason: collision with root package name */
        private final gd.d f11543d;

        /* renamed from: e  reason: collision with root package name */
        private final boolean f11544e;

        /* renamed from: f  reason: collision with root package name */
        private final boolean f11545f;

        public a(l<nf.e> lVar, hf.s<gd.d, PooledByteBuffer> sVar, gd.d dVar, boolean z11, boolean z12) {
            super(lVar);
            this.f11542c = sVar;
            this.f11543d = dVar;
            this.f11544e = z11;
            this.f11545f = z12;
        }

        @Override // com.facebook.imagepipeline.producers.b
        /* renamed from: p */
        public void h(nf.e eVar, int i11) {
            boolean d11;
            try {
                if (tf.b.d()) {
                    tf.b.a("EncodedMemoryCacheProducer#onNewResultImpl");
                }
                if (!b.e(i11) && eVar != null && !b.l(i11, 10) && eVar.L() != af.c.f407b) {
                    qd.a<PooledByteBuffer> m11 = eVar.m();
                    if (m11 != null) {
                        qd.a<PooledByteBuffer> aVar = null;
                        if (this.f11545f && this.f11544e) {
                            aVar = this.f11542c.c(this.f11543d, m11);
                        }
                        qd.a.C(m11);
                        if (aVar != null) {
                            nf.e eVar2 = new nf.e(aVar);
                            eVar2.l(eVar);
                            qd.a.C(aVar);
                            o().c(1.0f);
                            o().b(eVar2, i11);
                            nf.e.j(eVar2);
                            if (d11) {
                                return;
                            }
                            return;
                        }
                    }
                    o().b(eVar, i11);
                    if (tf.b.d()) {
                        tf.b.b();
                        return;
                    }
                    return;
                }
                o().b(eVar, i11);
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

    public t(hf.s<gd.d, PooledByteBuffer> sVar, hf.f fVar, o0<nf.e> o0Var) {
        this.f11539a = sVar;
        this.f11540b = fVar;
        this.f11541c = o0Var;
    }

    @Override // com.facebook.imagepipeline.producers.o0
    public void b(l<nf.e> lVar, p0 p0Var) {
        try {
            if (tf.b.d()) {
                tf.b.a("EncodedMemoryCacheProducer#produceResults");
            }
            r0 h11 = p0Var.h();
            h11.d(p0Var, "EncodedMemoryCacheProducer");
            gd.d d11 = this.f11540b.d(p0Var.l(), p0Var.a());
            qd.a<PooledByteBuffer> aVar = this.f11539a.get(d11);
            if (aVar != null) {
                nf.e eVar = new nf.e(aVar);
                h11.j(p0Var, "EncodedMemoryCacheProducer", h11.f(p0Var, "EncodedMemoryCacheProducer") ? md.g.of("cached_value_found", "true") : null);
                h11.b(p0Var, "EncodedMemoryCacheProducer", true);
                p0Var.g("memory_encoded");
                lVar.c(1.0f);
                lVar.b(eVar, 1);
                nf.e.j(eVar);
                qd.a.C(aVar);
            } else if (p0Var.p().getValue() >= a.c.ENCODED_MEMORY_CACHE.getValue()) {
                h11.j(p0Var, "EncodedMemoryCacheProducer", h11.f(p0Var, "EncodedMemoryCacheProducer") ? md.g.of("cached_value_found", "false") : null);
                h11.b(p0Var, "EncodedMemoryCacheProducer", false);
                p0Var.e("memory_encoded", "nil-result");
                lVar.b(null, 1);
                qd.a.C(aVar);
                if (tf.b.d()) {
                    tf.b.b();
                }
            } else {
                a aVar2 = new a(lVar, this.f11539a, d11, p0Var.l().w(), p0Var.d().D().q());
                h11.j(p0Var, "EncodedMemoryCacheProducer", h11.f(p0Var, "EncodedMemoryCacheProducer") ? md.g.of("cached_value_found", "false") : null);
                this.f11541c.b(aVar2, p0Var);
                qd.a.C(aVar);
                if (tf.b.d()) {
                    tf.b.b();
                }
            }
        } finally {
            if (tf.b.d()) {
                tf.b.b();
            }
        }
    }
}