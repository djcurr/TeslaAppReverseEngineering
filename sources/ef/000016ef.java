package com.facebook.imagepipeline.producers;

import java.io.InputStream;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public class f1 implements o0<nf.e> {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f11381a;

    /* renamed from: b  reason: collision with root package name */
    private final pd.g f11382b;

    /* renamed from: c  reason: collision with root package name */
    private final o0<nf.e> f11383c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a extends w0<nf.e> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ nf.e f11384f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(l lVar, r0 r0Var, p0 p0Var, String str, nf.e eVar) {
            super(lVar, r0Var, p0Var, str);
            this.f11384f = eVar;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.w0, kd.g
        public void d() {
            nf.e.j(this.f11384f);
            super.d();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.w0, kd.g
        public void e(Exception exc) {
            nf.e.j(this.f11384f);
            super.e(exc);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // kd.g
        /* renamed from: j */
        public void b(nf.e eVar) {
            nf.e.j(eVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // kd.g
        /* renamed from: k */
        public nf.e c() {
            pd.i c11 = f1.this.f11382b.c();
            try {
                f1.g(this.f11384f, c11);
                qd.a p02 = qd.a.p0(c11.a());
                nf.e eVar = new nf.e(p02);
                eVar.l(this.f11384f);
                qd.a.C(p02);
                return eVar;
            } finally {
                c11.close();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.w0, kd.g
        /* renamed from: l */
        public void f(nf.e eVar) {
            nf.e.j(this.f11384f);
            super.f(eVar);
        }
    }

    /* loaded from: classes3.dex */
    private class b extends p<nf.e, nf.e> {

        /* renamed from: c  reason: collision with root package name */
        private final p0 f11386c;

        /* renamed from: d  reason: collision with root package name */
        private com.facebook.common.util.a f11387d;

        public b(l<nf.e> lVar, p0 p0Var) {
            super(lVar);
            this.f11386c = p0Var;
            this.f11387d = com.facebook.common.util.a.UNSET;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.b
        /* renamed from: p */
        public void h(nf.e eVar, int i11) {
            if (this.f11387d == com.facebook.common.util.a.UNSET && eVar != null) {
                this.f11387d = f1.h(eVar);
            }
            if (this.f11387d == com.facebook.common.util.a.NO) {
                o().b(eVar, i11);
            } else if (com.facebook.imagepipeline.producers.b.d(i11)) {
                if (this.f11387d == com.facebook.common.util.a.YES && eVar != null) {
                    f1.this.i(eVar, o(), this.f11386c);
                } else {
                    o().b(eVar, i11);
                }
            }
        }
    }

    public f1(Executor executor, pd.g gVar, o0<nf.e> o0Var) {
        this.f11381a = (Executor) md.k.g(executor);
        this.f11382b = (pd.g) md.k.g(gVar);
        this.f11383c = (o0) md.k.g(o0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void g(nf.e eVar, pd.i iVar) {
        InputStream inputStream = (InputStream) md.k.g(eVar.R());
        af.c c11 = af.d.c(inputStream);
        if (c11 != af.b.f400f && c11 != af.b.f402h) {
            if (c11 != af.b.f401g && c11 != af.b.f403i) {
                throw new IllegalArgumentException("Wrong image format");
            }
            com.facebook.imagepipeline.nativecode.f.a().a(inputStream, iVar);
            eVar.Z0(af.b.f396b);
            return;
        }
        com.facebook.imagepipeline.nativecode.f.a().c(inputStream, iVar, 80);
        eVar.Z0(af.b.f395a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.facebook.common.util.a h(nf.e eVar) {
        md.k.g(eVar);
        af.c c11 = af.d.c((InputStream) md.k.g(eVar.R()));
        if (af.b.a(c11)) {
            com.facebook.imagepipeline.nativecode.e a11 = com.facebook.imagepipeline.nativecode.f.a();
            if (a11 == null) {
                return com.facebook.common.util.a.NO;
            }
            return com.facebook.common.util.a.valueOf(!a11.b(c11));
        } else if (c11 == af.c.f407b) {
            return com.facebook.common.util.a.UNSET;
        } else {
            return com.facebook.common.util.a.NO;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(nf.e eVar, l<nf.e> lVar, p0 p0Var) {
        md.k.g(eVar);
        this.f11381a.execute(new a(lVar, p0Var.h(), p0Var, "WebpTranscodeProducer", nf.e.g(eVar)));
    }

    @Override // com.facebook.imagepipeline.producers.o0
    public void b(l<nf.e> lVar, p0 p0Var) {
        this.f11383c.b(new b(lVar, p0Var), p0Var);
    }
}