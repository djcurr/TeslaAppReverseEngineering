package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.request.a;

/* loaded from: classes3.dex */
public class r implements o0<nf.e> {

    /* renamed from: a  reason: collision with root package name */
    private final hf.e f11530a;

    /* renamed from: b  reason: collision with root package name */
    private final hf.e f11531b;

    /* renamed from: c  reason: collision with root package name */
    private final hf.f f11532c;

    /* renamed from: d  reason: collision with root package name */
    private final o0<nf.e> f11533d;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class b extends p<nf.e, nf.e> {

        /* renamed from: c  reason: collision with root package name */
        private final p0 f11534c;

        /* renamed from: d  reason: collision with root package name */
        private final hf.e f11535d;

        /* renamed from: e  reason: collision with root package name */
        private final hf.e f11536e;

        /* renamed from: f  reason: collision with root package name */
        private final hf.f f11537f;

        @Override // com.facebook.imagepipeline.producers.b
        /* renamed from: p */
        public void h(nf.e eVar, int i11) {
            this.f11534c.h().d(this.f11534c, "DiskCacheWriteProducer");
            if (!com.facebook.imagepipeline.producers.b.e(i11) && eVar != null && !com.facebook.imagepipeline.producers.b.l(i11, 10) && eVar.L() != af.c.f407b) {
                com.facebook.imagepipeline.request.a l11 = this.f11534c.l();
                gd.d d11 = this.f11537f.d(l11, this.f11534c.a());
                if (l11.d() == a.b.SMALL) {
                    this.f11536e.p(d11, eVar);
                } else {
                    this.f11535d.p(d11, eVar);
                }
                this.f11534c.h().j(this.f11534c, "DiskCacheWriteProducer", null);
                o().b(eVar, i11);
                return;
            }
            this.f11534c.h().j(this.f11534c, "DiskCacheWriteProducer", null);
            o().b(eVar, i11);
        }

        private b(l<nf.e> lVar, p0 p0Var, hf.e eVar, hf.e eVar2, hf.f fVar) {
            super(lVar);
            this.f11534c = p0Var;
            this.f11535d = eVar;
            this.f11536e = eVar2;
            this.f11537f = fVar;
        }
    }

    public r(hf.e eVar, hf.e eVar2, hf.f fVar, o0<nf.e> o0Var) {
        this.f11530a = eVar;
        this.f11531b = eVar2;
        this.f11532c = fVar;
        this.f11533d = o0Var;
    }

    private void c(l<nf.e> lVar, p0 p0Var) {
        if (p0Var.p().getValue() >= a.c.DISK_CACHE.getValue()) {
            p0Var.e("disk", "nil-result_write");
            lVar.b(null, 1);
            return;
        }
        if (p0Var.l().v()) {
            lVar = new b(lVar, p0Var, this.f11530a, this.f11531b, this.f11532c);
        }
        this.f11533d.b(lVar, p0Var);
    }

    @Override // com.facebook.imagepipeline.producers.o0
    public void b(l<nf.e> lVar, p0 p0Var) {
        c(lVar, p0Var);
    }
}