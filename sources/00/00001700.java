package com.facebook.imagepipeline.producers;

import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.imagepipeline.request.a;
import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* loaded from: classes3.dex */
public class j implements o0<qd.a<nf.c>> {

    /* renamed from: a  reason: collision with root package name */
    private final hf.s<gd.d, PooledByteBuffer> f11426a;

    /* renamed from: b  reason: collision with root package name */
    private final hf.e f11427b;

    /* renamed from: c  reason: collision with root package name */
    private final hf.e f11428c;

    /* renamed from: d  reason: collision with root package name */
    private final hf.f f11429d;

    /* renamed from: e  reason: collision with root package name */
    private final o0<qd.a<nf.c>> f11430e;

    /* renamed from: f  reason: collision with root package name */
    private final hf.d<gd.d> f11431f;

    /* renamed from: g  reason: collision with root package name */
    private final hf.d<gd.d> f11432g;

    /* loaded from: classes3.dex */
    private static class a extends p<qd.a<nf.c>, qd.a<nf.c>> {

        /* renamed from: c  reason: collision with root package name */
        private final p0 f11433c;

        /* renamed from: d  reason: collision with root package name */
        private final hf.s<gd.d, PooledByteBuffer> f11434d;

        /* renamed from: e  reason: collision with root package name */
        private final hf.e f11435e;

        /* renamed from: f  reason: collision with root package name */
        private final hf.e f11436f;

        /* renamed from: g  reason: collision with root package name */
        private final hf.f f11437g;

        /* renamed from: h  reason: collision with root package name */
        private final hf.d<gd.d> f11438h;

        /* renamed from: i  reason: collision with root package name */
        private final hf.d<gd.d> f11439i;

        public a(l<qd.a<nf.c>> lVar, p0 p0Var, hf.s<gd.d, PooledByteBuffer> sVar, hf.e eVar, hf.e eVar2, hf.f fVar, hf.d<gd.d> dVar, hf.d<gd.d> dVar2) {
            super(lVar);
            this.f11433c = p0Var;
            this.f11434d = sVar;
            this.f11435e = eVar;
            this.f11436f = eVar2;
            this.f11437g = fVar;
            this.f11438h = dVar;
            this.f11439i = dVar2;
        }

        @Override // com.facebook.imagepipeline.producers.b
        /* renamed from: p */
        public void h(qd.a<nf.c> aVar, int i11) {
            boolean d11;
            try {
                if (tf.b.d()) {
                    tf.b.a("BitmapProbeProducer#onNewResultImpl");
                }
                if (!b.e(i11) && aVar != null && !b.l(i11, 8)) {
                    com.facebook.imagepipeline.request.a l11 = this.f11433c.l();
                    gd.d d12 = this.f11437g.d(l11, this.f11433c.a());
                    String str = (String) this.f11433c.o(AppMeasurementSdk.ConditionalUserProperty.ORIGIN);
                    if (str != null && str.equals("memory_bitmap")) {
                        if (this.f11433c.d().D().r() && !this.f11438h.b(d12)) {
                            this.f11434d.b(d12);
                            this.f11438h.a(d12);
                        }
                        if (this.f11433c.d().D().p() && !this.f11439i.b(d12)) {
                            (l11.d() == a.b.SMALL ? this.f11436f : this.f11435e).h(d12);
                            this.f11439i.a(d12);
                        }
                    }
                    o().b(aVar, i11);
                    if (d11) {
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

    public j(hf.s<gd.d, PooledByteBuffer> sVar, hf.e eVar, hf.e eVar2, hf.f fVar, hf.d<gd.d> dVar, hf.d<gd.d> dVar2, o0<qd.a<nf.c>> o0Var) {
        this.f11426a = sVar;
        this.f11427b = eVar;
        this.f11428c = eVar2;
        this.f11429d = fVar;
        this.f11431f = dVar;
        this.f11432g = dVar2;
        this.f11430e = o0Var;
    }

    @Override // com.facebook.imagepipeline.producers.o0
    public void b(l<qd.a<nf.c>> lVar, p0 p0Var) {
        try {
            if (tf.b.d()) {
                tf.b.a("BitmapProbeProducer#produceResults");
            }
            r0 h11 = p0Var.h();
            h11.d(p0Var, c());
            a aVar = new a(lVar, p0Var, this.f11426a, this.f11427b, this.f11428c, this.f11429d, this.f11431f, this.f11432g);
            h11.j(p0Var, "BitmapProbeProducer", null);
            if (tf.b.d()) {
                tf.b.a("mInputProducer.produceResult");
            }
            this.f11430e.b(aVar, p0Var);
            if (tf.b.d()) {
                tf.b.b();
            }
        } finally {
            if (tf.b.d()) {
                tf.b.b();
            }
        }
    }

    protected String c() {
        return "BitmapProbeProducer";
    }
}