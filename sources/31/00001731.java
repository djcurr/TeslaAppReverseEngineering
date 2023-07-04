package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.request.a;
import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* loaded from: classes3.dex */
public class u implements o0<nf.e> {

    /* renamed from: a  reason: collision with root package name */
    private final hf.e f11547a;

    /* renamed from: b  reason: collision with root package name */
    private final hf.e f11548b;

    /* renamed from: c  reason: collision with root package name */
    private final hf.f f11549c;

    /* renamed from: d  reason: collision with root package name */
    private final o0<nf.e> f11550d;

    /* renamed from: e  reason: collision with root package name */
    private final hf.d<gd.d> f11551e;

    /* renamed from: f  reason: collision with root package name */
    private final hf.d<gd.d> f11552f;

    /* loaded from: classes3.dex */
    private static class a extends p<nf.e, nf.e> {

        /* renamed from: c  reason: collision with root package name */
        private final p0 f11553c;

        /* renamed from: d  reason: collision with root package name */
        private final hf.e f11554d;

        /* renamed from: e  reason: collision with root package name */
        private final hf.e f11555e;

        /* renamed from: f  reason: collision with root package name */
        private final hf.f f11556f;

        /* renamed from: g  reason: collision with root package name */
        private final hf.d<gd.d> f11557g;

        /* renamed from: h  reason: collision with root package name */
        private final hf.d<gd.d> f11558h;

        public a(l<nf.e> lVar, p0 p0Var, hf.e eVar, hf.e eVar2, hf.f fVar, hf.d<gd.d> dVar, hf.d<gd.d> dVar2) {
            super(lVar);
            this.f11553c = p0Var;
            this.f11554d = eVar;
            this.f11555e = eVar2;
            this.f11556f = fVar;
            this.f11557g = dVar;
            this.f11558h = dVar2;
        }

        @Override // com.facebook.imagepipeline.producers.b
        /* renamed from: p */
        public void h(nf.e eVar, int i11) {
            boolean d11;
            try {
                if (tf.b.d()) {
                    tf.b.a("EncodedProbeProducer#onNewResultImpl");
                }
                if (!b.e(i11) && eVar != null && !b.l(i11, 10) && eVar.L() != af.c.f407b) {
                    com.facebook.imagepipeline.request.a l11 = this.f11553c.l();
                    gd.d d12 = this.f11556f.d(l11, this.f11553c.a());
                    this.f11557g.a(d12);
                    if ("memory_encoded".equals(this.f11553c.o(AppMeasurementSdk.ConditionalUserProperty.ORIGIN))) {
                        if (!this.f11558h.b(d12)) {
                            (l11.d() == a.b.SMALL ? this.f11555e : this.f11554d).h(d12);
                            this.f11558h.a(d12);
                        }
                    } else if ("disk".equals(this.f11553c.o(AppMeasurementSdk.ConditionalUserProperty.ORIGIN))) {
                        this.f11558h.a(d12);
                    }
                    o().b(eVar, i11);
                    if (d11) {
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

    public u(hf.e eVar, hf.e eVar2, hf.f fVar, hf.d dVar, hf.d dVar2, o0<nf.e> o0Var) {
        this.f11547a = eVar;
        this.f11548b = eVar2;
        this.f11549c = fVar;
        this.f11551e = dVar;
        this.f11552f = dVar2;
        this.f11550d = o0Var;
    }

    @Override // com.facebook.imagepipeline.producers.o0
    public void b(l<nf.e> lVar, p0 p0Var) {
        try {
            if (tf.b.d()) {
                tf.b.a("EncodedProbeProducer#produceResults");
            }
            r0 h11 = p0Var.h();
            h11.d(p0Var, c());
            a aVar = new a(lVar, p0Var, this.f11547a, this.f11548b, this.f11549c, this.f11551e, this.f11552f);
            h11.j(p0Var, "EncodedProbeProducer", null);
            if (tf.b.d()) {
                tf.b.a("mInputProducer.produceResult");
            }
            this.f11550d.b(aVar, p0Var);
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
        return "EncodedProbeProducer";
    }
}