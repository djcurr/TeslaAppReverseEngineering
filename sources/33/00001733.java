package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.producers.a0;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public class u0 implements o0<nf.e> {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f11559a;

    /* renamed from: b  reason: collision with root package name */
    private final pd.g f11560b;

    /* renamed from: c  reason: collision with root package name */
    private final o0<nf.e> f11561c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f11562d;

    /* renamed from: e  reason: collision with root package name */
    private final uf.d f11563e;

    /* loaded from: classes3.dex */
    private class a extends p<nf.e, nf.e> {

        /* renamed from: c  reason: collision with root package name */
        private final boolean f11564c;

        /* renamed from: d  reason: collision with root package name */
        private final uf.d f11565d;

        /* renamed from: e  reason: collision with root package name */
        private final p0 f11566e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f11567f;

        /* renamed from: g  reason: collision with root package name */
        private final a0 f11568g;

        /* renamed from: com.facebook.imagepipeline.producers.u0$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        class C0218a implements a0.d {
            C0218a(u0 u0Var) {
            }

            @Override // com.facebook.imagepipeline.producers.a0.d
            public void a(nf.e eVar, int i11) {
                a aVar = a.this;
                aVar.v(eVar, i11, (uf.c) md.k.g(aVar.f11565d.createImageTranscoder(eVar.L(), a.this.f11564c)));
            }
        }

        /* loaded from: classes3.dex */
        class b extends e {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ l f11571a;

            b(u0 u0Var, l lVar) {
                this.f11571a = lVar;
            }

            @Override // com.facebook.imagepipeline.producers.e, com.facebook.imagepipeline.producers.q0
            public void a() {
                if (a.this.f11566e.i()) {
                    a.this.f11568g.h();
                }
            }

            @Override // com.facebook.imagepipeline.producers.q0
            public void b() {
                a.this.f11568g.c();
                a.this.f11567f = true;
                this.f11571a.a();
            }
        }

        a(l<nf.e> lVar, p0 p0Var, boolean z11, uf.d dVar) {
            super(lVar);
            this.f11567f = false;
            this.f11566e = p0Var;
            Boolean p11 = p0Var.l().p();
            this.f11564c = p11 != null ? p11.booleanValue() : z11;
            this.f11565d = dVar;
            this.f11568g = new a0(u0.this.f11559a, new C0218a(u0.this), 100);
            p0Var.c(new b(u0.this, lVar));
        }

        private nf.e A(nf.e eVar) {
            return (this.f11566e.l().q().c() || eVar.e0() == 0 || eVar.e0() == -1) ? eVar : x(eVar, 0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void v(nf.e eVar, int i11, uf.c cVar) {
            this.f11566e.h().d(this.f11566e, "ResizeAndRotateProducer");
            com.facebook.imagepipeline.request.a l11 = this.f11566e.l();
            pd.i c11 = u0.this.f11560b.c();
            try {
                uf.b b11 = cVar.b(eVar, c11, l11.q(), l11.o(), null, 85);
                if (b11.a() != 2) {
                    Map<String, String> y11 = y(eVar, l11.o(), b11, cVar.getIdentifier());
                    qd.a p02 = qd.a.p0(c11.a());
                    try {
                        nf.e eVar2 = new nf.e(p02);
                        eVar2.Z0(af.b.f395a);
                        eVar2.I0();
                        this.f11566e.h().j(this.f11566e, "ResizeAndRotateProducer", y11);
                        if (b11.a() != 1) {
                            i11 |= 16;
                        }
                        o().b(eVar2, i11);
                        nf.e.j(eVar2);
                        return;
                    } finally {
                        qd.a.C(p02);
                    }
                }
                throw new RuntimeException("Error while transcoding the image");
            } catch (Exception e11) {
                this.f11566e.h().k(this.f11566e, "ResizeAndRotateProducer", e11, null);
                if (com.facebook.imagepipeline.producers.b.d(i11)) {
                    o().onFailure(e11);
                }
            } finally {
                c11.close();
            }
        }

        private void w(nf.e eVar, int i11, af.c cVar) {
            nf.e A;
            if (cVar != af.b.f395a && cVar != af.b.f405k) {
                A = z(eVar);
            } else {
                A = A(eVar);
            }
            o().b(A, i11);
        }

        private nf.e x(nf.e eVar, int i11) {
            nf.e g11 = nf.e.g(eVar);
            if (g11 != null) {
                g11.b1(i11);
            }
            return g11;
        }

        private Map<String, String> y(nf.e eVar, p001if.d dVar, uf.b bVar, String str) {
            String str2;
            if (this.f11566e.h().f(this.f11566e, "ResizeAndRotateProducer")) {
                String str3 = eVar.getWidth() + "x" + eVar.getHeight();
                if (dVar != null) {
                    str2 = dVar.f30385a + "x" + dVar.f30386b;
                } else {
                    str2 = "Unspecified";
                }
                HashMap hashMap = new HashMap();
                hashMap.put("Image format", String.valueOf(eVar.L()));
                hashMap.put("Original size", str3);
                hashMap.put("Requested size", str2);
                hashMap.put("queueTime", String.valueOf(this.f11568g.f()));
                hashMap.put("Transcoder id", str);
                hashMap.put("Transcoding result", String.valueOf(bVar));
                return md.g.a(hashMap);
            }
            return null;
        }

        private nf.e z(nf.e eVar) {
            p001if.e q11 = this.f11566e.l().q();
            return (q11.g() || !q11.f()) ? eVar : x(eVar, q11.e());
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.b
        /* renamed from: B */
        public void h(nf.e eVar, int i11) {
            if (this.f11567f) {
                return;
            }
            boolean d11 = com.facebook.imagepipeline.producers.b.d(i11);
            if (eVar == null) {
                if (d11) {
                    o().b(null, 1);
                    return;
                }
                return;
            }
            af.c L = eVar.L();
            com.facebook.common.util.a h11 = u0.h(this.f11566e.l(), eVar, (uf.c) md.k.g(this.f11565d.createImageTranscoder(L, this.f11564c)));
            if (d11 || h11 != com.facebook.common.util.a.UNSET) {
                if (h11 != com.facebook.common.util.a.YES) {
                    w(eVar, i11, L);
                } else if (this.f11568g.k(eVar, i11)) {
                    if (d11 || this.f11566e.i()) {
                        this.f11568g.h();
                    }
                }
            }
        }
    }

    public u0(Executor executor, pd.g gVar, o0<nf.e> o0Var, boolean z11, uf.d dVar) {
        this.f11559a = (Executor) md.k.g(executor);
        this.f11560b = (pd.g) md.k.g(gVar);
        this.f11561c = (o0) md.k.g(o0Var);
        this.f11563e = (uf.d) md.k.g(dVar);
        this.f11562d = z11;
    }

    private static boolean f(p001if.e eVar, nf.e eVar2) {
        return !eVar.c() && (uf.e.e(eVar, eVar2) != 0 || g(eVar, eVar2));
    }

    private static boolean g(p001if.e eVar, nf.e eVar2) {
        if (eVar.f() && !eVar.c()) {
            return uf.e.f53423a.contains(Integer.valueOf(eVar2.D()));
        }
        eVar2.S0(0);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.facebook.common.util.a h(com.facebook.imagepipeline.request.a aVar, nf.e eVar, uf.c cVar) {
        if (eVar != null && eVar.L() != af.c.f407b) {
            if (!cVar.a(eVar.L())) {
                return com.facebook.common.util.a.NO;
            }
            return com.facebook.common.util.a.valueOf(f(aVar.q(), eVar) || cVar.c(eVar, aVar.q(), aVar.o()));
        }
        return com.facebook.common.util.a.UNSET;
    }

    @Override // com.facebook.imagepipeline.producers.o0
    public void b(l<nf.e> lVar, p0 p0Var) {
        this.f11561c.b(new a(lVar, p0Var, this.f11562d, this.f11563e), p0Var);
    }
}