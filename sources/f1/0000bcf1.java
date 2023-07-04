package wl;

import am.c0;
import java.io.File;
import java.util.concurrent.atomic.AtomicReference;
import sm.a;

/* loaded from: classes3.dex */
public final class d implements wl.a {

    /* renamed from: c */
    private static final g f56097c = new b();

    /* renamed from: a */
    private final sm.a<wl.a> f56098a;

    /* renamed from: b */
    private final AtomicReference<wl.a> f56099b = new AtomicReference<>(null);

    /* loaded from: classes3.dex */
    private static final class b implements g {
        private b() {
        }

        @Override // wl.g
        public File a() {
            return null;
        }

        @Override // wl.g
        public File b() {
            return null;
        }

        @Override // wl.g
        public File c() {
            return null;
        }

        @Override // wl.g
        public File d() {
            return null;
        }

        @Override // wl.g
        public File e() {
            return null;
        }

        @Override // wl.g
        public File f() {
            return null;
        }
    }

    public d(sm.a<wl.a> aVar) {
        this.f56098a = aVar;
        aVar.a(new a.InterfaceC1119a() { // from class: wl.c
            {
                d.this = this;
            }

            @Override // sm.a.InterfaceC1119a
            public final void a(sm.b bVar) {
                d.e(d.this, bVar);
            }
        });
    }

    public static /* synthetic */ void e(d dVar, sm.b bVar) {
        dVar.g(bVar);
    }

    public static /* synthetic */ void f(String str, String str2, long j11, c0 c0Var, sm.b bVar) {
        h(str, str2, j11, c0Var, bVar);
    }

    public /* synthetic */ void g(sm.b bVar) {
        f.f().b("Crashlytics native component now available.");
        this.f56099b.set((wl.a) bVar.get());
    }

    public static /* synthetic */ void h(String str, String str2, long j11, c0 c0Var, sm.b bVar) {
        ((wl.a) bVar.get()).c(str, str2, j11, c0Var);
    }

    @Override // wl.a
    public g a(String str) {
        wl.a aVar = this.f56099b.get();
        if (aVar == null) {
            return f56097c;
        }
        return aVar.a(str);
    }

    @Override // wl.a
    public boolean b() {
        wl.a aVar = this.f56099b.get();
        return aVar != null && aVar.b();
    }

    @Override // wl.a
    public void c(final String str, final String str2, final long j11, final c0 c0Var) {
        f f11 = f.f();
        f11.i("Deferring native open session: " + str);
        this.f56098a.a(new a.InterfaceC1119a() { // from class: wl.b
            @Override // sm.a.InterfaceC1119a
            public final void a(sm.b bVar) {
                d.f(str, str2, j11, c0Var, bVar);
            }
        });
    }

    @Override // wl.a
    public boolean d(String str) {
        wl.a aVar = this.f56099b.get();
        return aVar != null && aVar.d(str);
    }
}