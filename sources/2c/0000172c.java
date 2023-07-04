package com.facebook.imagepipeline.producers;

import android.util.Pair;
import com.facebook.imagepipeline.request.a;

/* loaded from: classes3.dex */
public class s extends i0<Pair<gd.d, a.c>, nf.e> {

    /* renamed from: f  reason: collision with root package name */
    private final hf.f f11538f;

    public s(hf.f fVar, boolean z11, o0 o0Var) {
        super(o0Var, "EncodedCacheKeyMultiplexProducer", "multiplex_enc_cnt", z11);
        this.f11538f = fVar;
    }

    @Override // com.facebook.imagepipeline.producers.i0
    /* renamed from: l */
    public nf.e g(nf.e eVar) {
        return nf.e.g(eVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.producers.i0
    /* renamed from: m */
    public Pair<gd.d, a.c> j(p0 p0Var) {
        return Pair.create(this.f11538f.d(p0Var.l(), p0Var.a()), p0Var.p());
    }
}