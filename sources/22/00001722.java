package com.facebook.imagepipeline.producers;

/* loaded from: classes3.dex */
public abstract class p<I, O> extends b<I> {

    /* renamed from: b  reason: collision with root package name */
    private final l<O> f11520b;

    public p(l<O> lVar) {
        this.f11520b = lVar;
    }

    @Override // com.facebook.imagepipeline.producers.b
    protected void f() {
        this.f11520b.a();
    }

    @Override // com.facebook.imagepipeline.producers.b
    protected void g(Throwable th2) {
        this.f11520b.onFailure(th2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.producers.b
    public void i(float f11) {
        this.f11520b.c(f11);
    }

    public l<O> o() {
        return this.f11520b;
    }
}