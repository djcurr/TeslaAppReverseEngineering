package com.facebook.imagepipeline.producers;

import android.net.Uri;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public class l0 implements o0<nf.e> {

    /* renamed from: a  reason: collision with root package name */
    private final hf.e f11449a;

    /* renamed from: b  reason: collision with root package name */
    private final hf.f f11450b;

    /* renamed from: c  reason: collision with root package name */
    private final pd.g f11451c;

    /* renamed from: d  reason: collision with root package name */
    private final pd.a f11452d;

    /* renamed from: e  reason: collision with root package name */
    private final o0<nf.e> f11453e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a implements n5.d<nf.e, Void> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ r0 f11454a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ p0 f11455b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ l f11456c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ gd.d f11457d;

        a(r0 r0Var, p0 p0Var, l lVar, gd.d dVar) {
            this.f11454a = r0Var;
            this.f11455b = p0Var;
            this.f11456c = lVar;
            this.f11457d = dVar;
        }

        @Override // n5.d
        /* renamed from: b */
        public Void a(n5.e<nf.e> eVar) {
            if (l0.g(eVar)) {
                this.f11454a.c(this.f11455b, "PartialDiskCacheProducer", null);
                this.f11456c.a();
            } else if (eVar.n()) {
                this.f11454a.k(this.f11455b, "PartialDiskCacheProducer", eVar.i(), null);
                l0.this.i(this.f11456c, this.f11455b, this.f11457d, null);
            } else {
                nf.e j11 = eVar.j();
                if (j11 != null) {
                    r0 r0Var = this.f11454a;
                    p0 p0Var = this.f11455b;
                    r0Var.j(p0Var, "PartialDiskCacheProducer", l0.f(r0Var, p0Var, true, j11.p0()));
                    p001if.a e11 = p001if.a.e(j11.p0() - 1);
                    j11.R0(e11);
                    int p02 = j11.p0();
                    com.facebook.imagepipeline.request.a l11 = this.f11455b.l();
                    if (e11.a(l11.c())) {
                        this.f11455b.e("disk", "partial");
                        this.f11454a.b(this.f11455b, "PartialDiskCacheProducer", true);
                        this.f11456c.b(j11, 9);
                    } else {
                        this.f11456c.b(j11, 8);
                        l0.this.i(this.f11456c, new v0(ImageRequestBuilder.b(l11).u(p001if.a.b(p02 - 1)).a(), this.f11455b), this.f11457d, j11);
                    }
                } else {
                    r0 r0Var2 = this.f11454a;
                    p0 p0Var2 = this.f11455b;
                    r0Var2.j(p0Var2, "PartialDiskCacheProducer", l0.f(r0Var2, p0Var2, false, 0));
                    l0.this.i(this.f11456c, this.f11455b, this.f11457d, j11);
                }
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class b extends e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AtomicBoolean f11459a;

        b(l0 l0Var, AtomicBoolean atomicBoolean) {
            this.f11459a = atomicBoolean;
        }

        @Override // com.facebook.imagepipeline.producers.q0
        public void b() {
            this.f11459a.set(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class c extends p<nf.e, nf.e> {

        /* renamed from: c  reason: collision with root package name */
        private final hf.e f11460c;

        /* renamed from: d  reason: collision with root package name */
        private final gd.d f11461d;

        /* renamed from: e  reason: collision with root package name */
        private final pd.g f11462e;

        /* renamed from: f  reason: collision with root package name */
        private final pd.a f11463f;

        /* renamed from: g  reason: collision with root package name */
        private final nf.e f11464g;

        /* synthetic */ c(l lVar, hf.e eVar, gd.d dVar, pd.g gVar, pd.a aVar, nf.e eVar2, a aVar2) {
            this(lVar, eVar, dVar, gVar, aVar, eVar2);
        }

        private void p(InputStream inputStream, OutputStream outputStream, int i11) {
            byte[] bArr = this.f11463f.get(16384);
            int i12 = i11;
            while (i12 > 0) {
                try {
                    int read = inputStream.read(bArr, 0, Math.min(16384, i12));
                    if (read < 0) {
                        break;
                    } else if (read > 0) {
                        outputStream.write(bArr, 0, read);
                        i12 -= read;
                    }
                } finally {
                    this.f11463f.a(bArr);
                }
            }
            if (i12 > 0) {
                throw new IOException(String.format(null, "Failed to read %d bytes - finished %d short", Integer.valueOf(i11), Integer.valueOf(i12)));
            }
        }

        private pd.i q(nf.e eVar, nf.e eVar2) {
            int i11 = ((p001if.a) md.k.g(eVar2.p())).f30358a;
            pd.i e11 = this.f11462e.e(eVar2.p0() + i11);
            p(eVar.a0(), e11, i11);
            p(eVar2.a0(), e11, eVar2.p0());
            return e11;
        }

        private void s(pd.i iVar) {
            nf.e eVar;
            Throwable th2;
            qd.a p02 = qd.a.p0(iVar.a());
            try {
                eVar = new nf.e(p02);
            } catch (Throwable th3) {
                eVar = null;
                th2 = th3;
            }
            try {
                eVar.I0();
                o().b(eVar, 1);
                nf.e.j(eVar);
                qd.a.C(p02);
            } catch (Throwable th4) {
                th2 = th4;
                nf.e.j(eVar);
                qd.a.C(p02);
                throw th2;
            }
        }

        @Override // com.facebook.imagepipeline.producers.b
        /* renamed from: r */
        public void h(nf.e eVar, int i11) {
            if (com.facebook.imagepipeline.producers.b.e(i11)) {
                return;
            }
            if (this.f11464g != null && eVar != null && eVar.p() != null) {
                try {
                    try {
                        s(q(this.f11464g, eVar));
                    } catch (IOException e11) {
                        nd.a.k("PartialDiskCacheProducer", "Error while merging image data", e11);
                        o().onFailure(e11);
                    }
                    this.f11460c.r(this.f11461d);
                } finally {
                    eVar.close();
                    this.f11464g.close();
                }
            } else if (com.facebook.imagepipeline.producers.b.m(i11, 8) && com.facebook.imagepipeline.producers.b.d(i11) && eVar != null && eVar.L() != af.c.f407b) {
                this.f11460c.p(this.f11461d, eVar);
                o().b(eVar, i11);
            } else {
                o().b(eVar, i11);
            }
        }

        private c(l<nf.e> lVar, hf.e eVar, gd.d dVar, pd.g gVar, pd.a aVar, nf.e eVar2) {
            super(lVar);
            this.f11460c = eVar;
            this.f11461d = dVar;
            this.f11462e = gVar;
            this.f11463f = aVar;
            this.f11464g = eVar2;
        }
    }

    public l0(hf.e eVar, hf.f fVar, pd.g gVar, pd.a aVar, o0<nf.e> o0Var) {
        this.f11449a = eVar;
        this.f11450b = fVar;
        this.f11451c = gVar;
        this.f11452d = aVar;
        this.f11453e = o0Var;
    }

    private static Uri e(com.facebook.imagepipeline.request.a aVar) {
        return aVar.s().buildUpon().appendQueryParameter("fresco_partial", "true").build();
    }

    static Map<String, String> f(r0 r0Var, p0 p0Var, boolean z11, int i11) {
        if (r0Var.f(p0Var, "PartialDiskCacheProducer")) {
            if (z11) {
                return md.g.of("cached_value_found", String.valueOf(z11), "encodedImageSize", String.valueOf(i11));
            }
            return md.g.of("cached_value_found", String.valueOf(z11));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean g(n5.e<?> eVar) {
        return eVar.l() || (eVar.n() && (eVar.i() instanceof CancellationException));
    }

    private n5.d<nf.e, Void> h(l<nf.e> lVar, p0 p0Var, gd.d dVar) {
        return new a(p0Var.h(), p0Var, lVar, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(l<nf.e> lVar, p0 p0Var, gd.d dVar, nf.e eVar) {
        this.f11453e.b(new c(lVar, this.f11449a, dVar, this.f11451c, this.f11452d, eVar, null), p0Var);
    }

    private void j(AtomicBoolean atomicBoolean, p0 p0Var) {
        p0Var.c(new b(this, atomicBoolean));
    }

    @Override // com.facebook.imagepipeline.producers.o0
    public void b(l<nf.e> lVar, p0 p0Var) {
        com.facebook.imagepipeline.request.a l11 = p0Var.l();
        if (!l11.v()) {
            this.f11453e.b(lVar, p0Var);
            return;
        }
        p0Var.h().d(p0Var, "PartialDiskCacheProducer");
        gd.d b11 = this.f11450b.b(l11, e(l11), p0Var.a());
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.f11449a.n(b11, atomicBoolean).e(h(lVar, p0Var, b11));
        j(atomicBoolean, p0Var);
    }
}