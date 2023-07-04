package com.facebook.imagepipeline.producers;

/* loaded from: classes3.dex */
public class y0<T> implements o0<T> {

    /* renamed from: a  reason: collision with root package name */
    private final o0<T> f11599a;

    /* renamed from: b  reason: collision with root package name */
    private final z0 f11600b;

    /* loaded from: classes3.dex */
    class a extends w0<T> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ r0 f11601f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ p0 f11602g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ l f11603h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(l lVar, r0 r0Var, p0 p0Var, String str, r0 r0Var2, p0 p0Var2, l lVar2) {
            super(lVar, r0Var, p0Var, str);
            this.f11601f = r0Var2;
            this.f11602g = p0Var2;
            this.f11603h = lVar2;
        }

        @Override // kd.g
        protected void b(T t11) {
        }

        @Override // kd.g
        protected T c() {
            return null;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.w0, kd.g
        public void f(T t11) {
            this.f11601f.j(this.f11602g, "BackgroundThreadHandoffProducer", null);
            y0.this.f11599a.b(this.f11603h, this.f11602g);
        }
    }

    /* loaded from: classes3.dex */
    class b extends e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ w0 f11605a;

        b(w0 w0Var) {
            this.f11605a = w0Var;
        }

        @Override // com.facebook.imagepipeline.producers.q0
        public void b() {
            this.f11605a.a();
            y0.this.f11600b.a(this.f11605a);
        }
    }

    public y0(o0<T> o0Var, z0 z0Var) {
        this.f11599a = (o0) md.k.g(o0Var);
        this.f11600b = z0Var;
    }

    private static String e(p0 p0Var) {
        if (of.a.b()) {
            return "ThreadHandoffProducer_produceResults_" + p0Var.getId();
        }
        return null;
    }

    @Override // com.facebook.imagepipeline.producers.o0
    public void b(l<T> lVar, p0 p0Var) {
        try {
            if (tf.b.d()) {
                tf.b.a("ThreadHandoffProducer#produceResults");
            }
            r0 h11 = p0Var.h();
            a aVar = new a(lVar, h11, p0Var, "BackgroundThreadHandoffProducer", h11, p0Var, lVar);
            p0Var.c(new b(aVar));
            this.f11600b.b(of.a.a(aVar, e(p0Var)));
        } finally {
            if (tf.b.d()) {
                tf.b.b();
            }
        }
    }
}