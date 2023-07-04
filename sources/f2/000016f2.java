package com.facebook.imagepipeline.producers;

import android.util.Pair;
import com.facebook.imagepipeline.request.a;

/* loaded from: classes3.dex */
public class g extends i0<Pair<gd.d, a.c>, qd.a<nf.c>> {

    /* renamed from: f  reason: collision with root package name */
    private final hf.f f11389f;

    public g(hf.f fVar, o0 o0Var) {
        super(o0Var, "BitmapMemoryCacheKeyMultiplexProducer", "multiplex_bmp_cnt");
        this.f11389f = fVar;
    }

    @Override // com.facebook.imagepipeline.producers.i0
    /* renamed from: l */
    public qd.a<nf.c> g(qd.a<nf.c> aVar) {
        return qd.a.m(aVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.producers.i0
    /* renamed from: m */
    public Pair<gd.d, a.c> j(p0 p0Var) {
        return Pair.create(this.f11389f.a(p0Var.l(), p0Var.a()), p0Var.p());
    }
}