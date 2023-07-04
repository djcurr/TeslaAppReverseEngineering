package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.request.a;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public class q implements o0<nf.e> {

    /* renamed from: a  reason: collision with root package name */
    private final hf.e f11521a;

    /* renamed from: b  reason: collision with root package name */
    private final hf.e f11522b;

    /* renamed from: c  reason: collision with root package name */
    private final hf.f f11523c;

    /* renamed from: d  reason: collision with root package name */
    private final o0<nf.e> f11524d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a implements n5.d<nf.e, Void> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ r0 f11525a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ p0 f11526b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ l f11527c;

        a(r0 r0Var, p0 p0Var, l lVar) {
            this.f11525a = r0Var;
            this.f11526b = p0Var;
            this.f11527c = lVar;
        }

        @Override // n5.d
        /* renamed from: b */
        public Void a(n5.e<nf.e> eVar) {
            if (q.f(eVar)) {
                this.f11525a.c(this.f11526b, "DiskCacheProducer", null);
                this.f11527c.a();
            } else if (eVar.n()) {
                this.f11525a.k(this.f11526b, "DiskCacheProducer", eVar.i(), null);
                q.this.f11524d.b(this.f11527c, this.f11526b);
            } else {
                nf.e j11 = eVar.j();
                if (j11 != null) {
                    r0 r0Var = this.f11525a;
                    p0 p0Var = this.f11526b;
                    r0Var.j(p0Var, "DiskCacheProducer", q.e(r0Var, p0Var, true, j11.p0()));
                    this.f11525a.b(this.f11526b, "DiskCacheProducer", true);
                    this.f11526b.g("disk");
                    this.f11527c.c(1.0f);
                    this.f11527c.b(j11, 1);
                    j11.close();
                } else {
                    r0 r0Var2 = this.f11525a;
                    p0 p0Var2 = this.f11526b;
                    r0Var2.j(p0Var2, "DiskCacheProducer", q.e(r0Var2, p0Var2, false, 0));
                    q.this.f11524d.b(this.f11527c, this.f11526b);
                }
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class b extends e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AtomicBoolean f11529a;

        b(q qVar, AtomicBoolean atomicBoolean) {
            this.f11529a = atomicBoolean;
        }

        @Override // com.facebook.imagepipeline.producers.q0
        public void b() {
            this.f11529a.set(true);
        }
    }

    public q(hf.e eVar, hf.e eVar2, hf.f fVar, o0<nf.e> o0Var) {
        this.f11521a = eVar;
        this.f11522b = eVar2;
        this.f11523c = fVar;
        this.f11524d = o0Var;
    }

    static Map<String, String> e(r0 r0Var, p0 p0Var, boolean z11, int i11) {
        if (r0Var.f(p0Var, "DiskCacheProducer")) {
            if (z11) {
                return md.g.of("cached_value_found", String.valueOf(z11), "encodedImageSize", String.valueOf(i11));
            }
            return md.g.of("cached_value_found", String.valueOf(z11));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean f(n5.e<?> eVar) {
        return eVar.l() || (eVar.n() && (eVar.i() instanceof CancellationException));
    }

    private void g(l<nf.e> lVar, p0 p0Var) {
        if (p0Var.p().getValue() >= a.c.DISK_CACHE.getValue()) {
            p0Var.e("disk", "nil-result_read");
            lVar.b(null, 1);
            return;
        }
        this.f11524d.b(lVar, p0Var);
    }

    private n5.d<nf.e, Void> h(l<nf.e> lVar, p0 p0Var) {
        return new a(p0Var.h(), p0Var, lVar);
    }

    private void i(AtomicBoolean atomicBoolean, p0 p0Var) {
        p0Var.c(new b(this, atomicBoolean));
    }

    @Override // com.facebook.imagepipeline.producers.o0
    public void b(l<nf.e> lVar, p0 p0Var) {
        com.facebook.imagepipeline.request.a l11 = p0Var.l();
        if (!l11.v()) {
            g(lVar, p0Var);
            return;
        }
        p0Var.h().d(p0Var, "DiskCacheProducer");
        gd.d d11 = this.f11523c.d(l11, p0Var.a());
        hf.e eVar = l11.d() == a.b.SMALL ? this.f11522b : this.f11521a;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        eVar.n(d11, atomicBoolean).e(h(lVar, p0Var));
        i(atomicBoolean, p0Var);
    }
}