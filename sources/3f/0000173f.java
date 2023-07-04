package com.facebook.imagepipeline.producers;

/* loaded from: classes3.dex */
public class x0<T> implements o0<Void> {

    /* renamed from: a  reason: collision with root package name */
    private final o0<T> f11596a;

    /* loaded from: classes3.dex */
    class a extends p<T, Void> {
        a(x0 x0Var, l lVar) {
            super(lVar);
        }

        @Override // com.facebook.imagepipeline.producers.b
        protected void h(T t11, int i11) {
            if (b.d(i11)) {
                o().b(null, i11);
            }
        }
    }

    public x0(o0<T> o0Var) {
        this.f11596a = o0Var;
    }

    @Override // com.facebook.imagepipeline.producers.o0
    public void b(l<Void> lVar, p0 p0Var) {
        this.f11596a.b(new a(this, lVar), p0Var);
    }
}