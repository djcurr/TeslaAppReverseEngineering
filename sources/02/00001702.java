package com.facebook.imagepipeline.producers;

import android.os.SystemClock;
import com.facebook.imagepipeline.producers.k0;
import java.io.InputStream;
import java.util.Map;

/* loaded from: classes3.dex */
public class j0 implements o0<nf.e> {

    /* renamed from: a  reason: collision with root package name */
    protected final pd.g f11440a;

    /* renamed from: b  reason: collision with root package name */
    private final pd.a f11441b;

    /* renamed from: c  reason: collision with root package name */
    private final k0 f11442c;

    /* loaded from: classes3.dex */
    class a implements k0.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ w f11443a;

        a(w wVar) {
            this.f11443a = wVar;
        }

        @Override // com.facebook.imagepipeline.producers.k0.a
        public void a() {
            j0.this.k(this.f11443a);
        }

        @Override // com.facebook.imagepipeline.producers.k0.a
        public void b(InputStream inputStream, int i11) {
            if (tf.b.d()) {
                tf.b.a("NetworkFetcher->onResponse");
            }
            j0.this.m(this.f11443a, inputStream, i11);
            if (tf.b.d()) {
                tf.b.b();
            }
        }

        @Override // com.facebook.imagepipeline.producers.k0.a
        public void onFailure(Throwable th2) {
            j0.this.l(this.f11443a, th2);
        }
    }

    public j0(pd.g gVar, pd.a aVar, k0 k0Var) {
        this.f11440a = gVar;
        this.f11441b = aVar;
        this.f11442c = k0Var;
    }

    protected static float e(int i11, int i12) {
        return i12 > 0 ? i11 / i12 : 1.0f - ((float) Math.exp((-i11) / 50000.0d));
    }

    private Map<String, String> f(w wVar, int i11) {
        if (wVar.d().f(wVar.b(), "NetworkFetchProducer")) {
            return this.f11442c.d(wVar, i11);
        }
        return null;
    }

    protected static void j(pd.i iVar, int i11, p001if.a aVar, l<nf.e> lVar, p0 p0Var) {
        nf.e eVar;
        qd.a p02 = qd.a.p0(iVar.a());
        nf.e eVar2 = null;
        try {
            eVar = new nf.e(p02);
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            eVar.R0(aVar);
            eVar.I0();
            p0Var.k(nf.f.NETWORK);
            lVar.b(eVar, i11);
            nf.e.j(eVar);
            qd.a.C(p02);
        } catch (Throwable th3) {
            th = th3;
            eVar2 = eVar;
            nf.e.j(eVar2);
            qd.a.C(p02);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k(w wVar) {
        wVar.d().c(wVar.b(), "NetworkFetchProducer", null);
        wVar.a().a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l(w wVar, Throwable th2) {
        wVar.d().k(wVar.b(), "NetworkFetchProducer", th2, null);
        wVar.d().b(wVar.b(), "NetworkFetchProducer", false);
        wVar.b().g("network");
        wVar.a().onFailure(th2);
    }

    private boolean n(w wVar) {
        if (wVar.b().i()) {
            return this.f11442c.c(wVar);
        }
        return false;
    }

    @Override // com.facebook.imagepipeline.producers.o0
    public void b(l<nf.e> lVar, p0 p0Var) {
        p0Var.h().d(p0Var, "NetworkFetchProducer");
        w e11 = this.f11442c.e(lVar, p0Var);
        this.f11442c.a(e11, new a(e11));
    }

    protected long g() {
        return SystemClock.uptimeMillis();
    }

    protected void h(pd.i iVar, w wVar) {
        Map<String, String> f11 = f(wVar, iVar.size());
        r0 d11 = wVar.d();
        d11.j(wVar.b(), "NetworkFetchProducer", f11);
        d11.b(wVar.b(), "NetworkFetchProducer", true);
        wVar.b().g("network");
        j(iVar, wVar.e() | 1, wVar.f(), wVar.a(), wVar.b());
    }

    protected void i(pd.i iVar, w wVar) {
        long g11 = g();
        if (!n(wVar) || g11 - wVar.c() < 100) {
            return;
        }
        wVar.h(g11);
        wVar.d().h(wVar.b(), "NetworkFetchProducer", "intermediate_result");
        j(iVar, wVar.e(), wVar.f(), wVar.a(), wVar.b());
    }

    protected void m(w wVar, InputStream inputStream, int i11) {
        pd.i c11;
        if (i11 > 0) {
            c11 = this.f11440a.e(i11);
        } else {
            c11 = this.f11440a.c();
        }
        byte[] bArr = this.f11441b.get(16384);
        while (true) {
            try {
                int read = inputStream.read(bArr);
                if (read < 0) {
                    this.f11442c.b(wVar, c11.size());
                    h(c11, wVar);
                    return;
                } else if (read > 0) {
                    c11.write(bArr, 0, read);
                    i(c11, wVar);
                    wVar.a().c(e(c11.size(), i11));
                }
            } finally {
                this.f11441b.a(bArr);
                c11.close();
            }
        }
    }
}