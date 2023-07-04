package com.facebook.imagepipeline.producers;

import android.graphics.Bitmap;
import android.os.Build;
import com.facebook.common.util.ExceptionWithNoStacktrace;
import com.facebook.imagepipeline.producers.a0;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public class n implements o0<qd.a<nf.c>> {

    /* renamed from: a  reason: collision with root package name */
    private final pd.a f11472a;

    /* renamed from: b  reason: collision with root package name */
    private final Executor f11473b;

    /* renamed from: c  reason: collision with root package name */
    private final lf.b f11474c;

    /* renamed from: d  reason: collision with root package name */
    private final lf.d f11475d;

    /* renamed from: e  reason: collision with root package name */
    private final o0<nf.e> f11476e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f11477f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f11478g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f11479h;

    /* renamed from: i  reason: collision with root package name */
    private final int f11480i;

    /* renamed from: j  reason: collision with root package name */
    private final jf.a f11481j;

    /* renamed from: k  reason: collision with root package name */
    private final Runnable f11482k;

    /* renamed from: l  reason: collision with root package name */
    private final md.n<Boolean> f11483l;

    /* loaded from: classes3.dex */
    private class a extends c {
        public a(n nVar, l<qd.a<nf.c>> lVar, p0 p0Var, boolean z11, int i11) {
            super(lVar, p0Var, z11, i11);
        }

        @Override // com.facebook.imagepipeline.producers.n.c
        protected synchronized boolean H(nf.e eVar, int i11) {
            if (com.facebook.imagepipeline.producers.b.e(i11)) {
                return false;
            }
            return super.H(eVar, i11);
        }

        @Override // com.facebook.imagepipeline.producers.n.c
        protected int w(nf.e eVar) {
            return eVar.p0();
        }

        @Override // com.facebook.imagepipeline.producers.n.c
        protected nf.j x() {
            return nf.i.d(0, false, false);
        }
    }

    /* loaded from: classes3.dex */
    private class b extends c {

        /* renamed from: i  reason: collision with root package name */
        private final lf.e f11484i;

        /* renamed from: j  reason: collision with root package name */
        private final lf.d f11485j;

        /* renamed from: k  reason: collision with root package name */
        private int f11486k;

        public b(n nVar, l<qd.a<nf.c>> lVar, p0 p0Var, lf.e eVar, lf.d dVar, boolean z11, int i11) {
            super(lVar, p0Var, z11, i11);
            this.f11484i = (lf.e) md.k.g(eVar);
            this.f11485j = (lf.d) md.k.g(dVar);
            this.f11486k = 0;
        }

        @Override // com.facebook.imagepipeline.producers.n.c
        protected synchronized boolean H(nf.e eVar, int i11) {
            boolean H = super.H(eVar, i11);
            if ((com.facebook.imagepipeline.producers.b.e(i11) || com.facebook.imagepipeline.producers.b.m(i11, 8)) && !com.facebook.imagepipeline.producers.b.m(i11, 4) && nf.e.G0(eVar) && eVar.L() == af.b.f395a) {
                if (!this.f11484i.g(eVar)) {
                    return false;
                }
                int d11 = this.f11484i.d();
                int i12 = this.f11486k;
                if (d11 <= i12) {
                    return false;
                }
                if (d11 < this.f11485j.a(i12) && !this.f11484i.e()) {
                    return false;
                }
                this.f11486k = d11;
            }
            return H;
        }

        @Override // com.facebook.imagepipeline.producers.n.c
        protected int w(nf.e eVar) {
            return this.f11484i.c();
        }

        @Override // com.facebook.imagepipeline.producers.n.c
        protected nf.j x() {
            return this.f11485j.b(this.f11484i.d());
        }
    }

    /* loaded from: classes3.dex */
    private abstract class c extends p<nf.e, qd.a<nf.c>> {

        /* renamed from: c  reason: collision with root package name */
        private final p0 f11487c;

        /* renamed from: d  reason: collision with root package name */
        private final r0 f11488d;

        /* renamed from: e  reason: collision with root package name */
        private final p001if.b f11489e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f11490f;

        /* renamed from: g  reason: collision with root package name */
        private final a0 f11491g;

        /* loaded from: classes3.dex */
        class a implements a0.d {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ p0 f11493a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ int f11494b;

            a(n nVar, p0 p0Var, int i11) {
                this.f11493a = p0Var;
                this.f11494b = i11;
            }

            @Override // com.facebook.imagepipeline.producers.a0.d
            public void a(nf.e eVar, int i11) {
                if (eVar != null) {
                    c.this.f11487c.b("image_format", eVar.L().a());
                    if (n.this.f11477f || !com.facebook.imagepipeline.producers.b.m(i11, 16)) {
                        com.facebook.imagepipeline.request.a l11 = this.f11493a.l();
                        if (n.this.f11478g || !ud.d.l(l11.s())) {
                            eVar.h1(uf.a.b(l11.q(), l11.o(), eVar, this.f11494b));
                        }
                    }
                    if (this.f11493a.d().D().z()) {
                        c.this.E(eVar);
                    }
                    c.this.u(eVar, i11);
                }
            }
        }

        /* loaded from: classes3.dex */
        class b extends e {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ boolean f11496a;

            b(n nVar, boolean z11) {
                this.f11496a = z11;
            }

            @Override // com.facebook.imagepipeline.producers.e, com.facebook.imagepipeline.producers.q0
            public void a() {
                if (c.this.f11487c.i()) {
                    c.this.f11491g.h();
                }
            }

            @Override // com.facebook.imagepipeline.producers.q0
            public void b() {
                if (this.f11496a) {
                    c.this.y();
                }
            }
        }

        public c(l<qd.a<nf.c>> lVar, p0 p0Var, boolean z11, int i11) {
            super(lVar);
            this.f11487c = p0Var;
            this.f11488d = p0Var.h();
            p001if.b f11 = p0Var.l().f();
            this.f11489e = f11;
            this.f11490f = false;
            this.f11491g = new a0(n.this.f11473b, new a(n.this, p0Var, i11), f11.f30361a);
            p0Var.c(new b(n.this, z11));
        }

        private void A(nf.c cVar, int i11) {
            qd.a<nf.c> b11 = n.this.f11481j.b(cVar);
            try {
                D(com.facebook.imagepipeline.producers.b.d(i11));
                o().b(b11, i11);
            } finally {
                qd.a.C(b11);
            }
        }

        private nf.c B(nf.e eVar, int i11, nf.j jVar) {
            boolean z11 = n.this.f11482k != null && ((Boolean) n.this.f11483l.get()).booleanValue();
            try {
                return n.this.f11474c.a(eVar, i11, jVar, this.f11489e);
            } catch (OutOfMemoryError e11) {
                if (z11) {
                    n.this.f11482k.run();
                    System.gc();
                    return n.this.f11474c.a(eVar, i11, jVar, this.f11489e);
                }
                throw e11;
            }
        }

        private synchronized boolean C() {
            return this.f11490f;
        }

        private void D(boolean z11) {
            synchronized (this) {
                if (z11) {
                    if (!this.f11490f) {
                        o().c(1.0f);
                        this.f11490f = true;
                        this.f11491g.c();
                    }
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void E(nf.e eVar) {
            if (eVar.L() != af.b.f395a) {
                return;
            }
            eVar.h1(uf.a.c(eVar, com.facebook.imageutils.a.c(this.f11489e.f30367g), 104857600));
        }

        private void G(nf.e eVar, nf.c cVar) {
            this.f11487c.b("encoded_width", Integer.valueOf(eVar.getWidth()));
            this.f11487c.b("encoded_height", Integer.valueOf(eVar.getHeight()));
            this.f11487c.b("encoded_size", Integer.valueOf(eVar.p0()));
            if (cVar instanceof nf.b) {
                Bitmap p11 = ((nf.b) cVar).p();
                this.f11487c.b("bitmap_config", String.valueOf(p11 == null ? null : p11.getConfig()));
            }
            if (cVar != null) {
                cVar.m(this.f11487c.getExtras());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:41:0x00d4  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void u(nf.e r21, int r22) {
            /*
                Method dump skipped, instructions count: 322
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.producers.n.c.u(nf.e, int):void");
        }

        private Map<String, String> v(nf.c cVar, long j11, nf.j jVar, boolean z11, String str, String str2, String str3, String str4) {
            Bitmap p11;
            if (this.f11488d.f(this.f11487c, "DecodeProducer")) {
                String valueOf = String.valueOf(j11);
                String valueOf2 = String.valueOf(jVar.b());
                String valueOf3 = String.valueOf(z11);
                if (cVar instanceof nf.d) {
                    md.k.g(((nf.d) cVar).p());
                    HashMap hashMap = new HashMap(8);
                    hashMap.put("bitmapSize", p11.getWidth() + "x" + p11.getHeight());
                    hashMap.put("queueTime", valueOf);
                    hashMap.put("hasGoodQuality", valueOf2);
                    hashMap.put("isFinal", valueOf3);
                    hashMap.put("encodedImageSize", str2);
                    hashMap.put("imageFormat", str);
                    hashMap.put("requestedImageSize", str3);
                    hashMap.put("sampleSize", str4);
                    if (Build.VERSION.SDK_INT >= 12) {
                        hashMap.put("byteCount", p11.getByteCount() + "");
                    }
                    return md.g.a(hashMap);
                }
                HashMap hashMap2 = new HashMap(7);
                hashMap2.put("queueTime", valueOf);
                hashMap2.put("hasGoodQuality", valueOf2);
                hashMap2.put("isFinal", valueOf3);
                hashMap2.put("encodedImageSize", str2);
                hashMap2.put("imageFormat", str);
                hashMap2.put("requestedImageSize", str3);
                hashMap2.put("sampleSize", str4);
                return md.g.a(hashMap2);
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void y() {
            D(true);
            o().a();
        }

        private void z(Throwable th2) {
            D(true);
            o().onFailure(th2);
        }

        @Override // com.facebook.imagepipeline.producers.b
        /* renamed from: F */
        public void h(nf.e eVar, int i11) {
            boolean d11;
            try {
                if (tf.b.d()) {
                    tf.b.a("DecodeProducer#onNewResultImpl");
                }
                boolean d12 = com.facebook.imagepipeline.producers.b.d(i11);
                if (d12) {
                    if (eVar == null) {
                        z(new ExceptionWithNoStacktrace("Encoded image is null."));
                        if (d11) {
                            return;
                        }
                        return;
                    } else if (!eVar.F0()) {
                        z(new ExceptionWithNoStacktrace("Encoded image is not valid."));
                        if (tf.b.d()) {
                            tf.b.b();
                            return;
                        }
                        return;
                    }
                }
                if (!H(eVar, i11)) {
                    if (tf.b.d()) {
                        tf.b.b();
                        return;
                    }
                    return;
                }
                boolean m11 = com.facebook.imagepipeline.producers.b.m(i11, 4);
                if (d12 || m11 || this.f11487c.i()) {
                    this.f11491g.h();
                }
                if (tf.b.d()) {
                    tf.b.b();
                }
            } finally {
                if (tf.b.d()) {
                    tf.b.b();
                }
            }
        }

        protected boolean H(nf.e eVar, int i11) {
            return this.f11491g.k(eVar, i11);
        }

        @Override // com.facebook.imagepipeline.producers.p, com.facebook.imagepipeline.producers.b
        public void f() {
            y();
        }

        @Override // com.facebook.imagepipeline.producers.p, com.facebook.imagepipeline.producers.b
        public void g(Throwable th2) {
            z(th2);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.p, com.facebook.imagepipeline.producers.b
        public void i(float f11) {
            super.i(f11 * 0.99f);
        }

        protected abstract int w(nf.e eVar);

        protected abstract nf.j x();
    }

    public n(pd.a aVar, Executor executor, lf.b bVar, lf.d dVar, boolean z11, boolean z12, boolean z13, o0<nf.e> o0Var, int i11, jf.a aVar2, Runnable runnable, md.n<Boolean> nVar) {
        this.f11472a = (pd.a) md.k.g(aVar);
        this.f11473b = (Executor) md.k.g(executor);
        this.f11474c = (lf.b) md.k.g(bVar);
        this.f11475d = (lf.d) md.k.g(dVar);
        this.f11477f = z11;
        this.f11478g = z12;
        this.f11476e = (o0) md.k.g(o0Var);
        this.f11479h = z13;
        this.f11480i = i11;
        this.f11481j = aVar2;
        this.f11482k = runnable;
        this.f11483l = nVar;
    }

    @Override // com.facebook.imagepipeline.producers.o0
    public void b(l<qd.a<nf.c>> lVar, p0 p0Var) {
        l<nf.e> bVar;
        try {
            if (tf.b.d()) {
                tf.b.a("DecodeProducer#produceResults");
            }
            if (!ud.d.l(p0Var.l().s())) {
                bVar = new a(this, lVar, p0Var, this.f11479h, this.f11480i);
            } else {
                bVar = new b(this, lVar, p0Var, new lf.e(this.f11472a), this.f11475d, this.f11479h, this.f11480i);
            }
            this.f11476e.b(bVar, p0Var);
        } finally {
            if (tf.b.d()) {
                tf.b.b();
            }
        }
    }
}