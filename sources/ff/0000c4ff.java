package zl;

import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import zl.i;

/* loaded from: classes3.dex */
public class i {

    /* renamed from: a */
    private final d f60524a;

    /* renamed from: b */
    private final com.google.firebase.crashlytics.internal.common.h f60525b;

    /* renamed from: c */
    private final String f60526c;

    /* renamed from: d */
    private final a f60527d = new a(false);

    /* renamed from: e */
    private final a f60528e = new a(true);

    /* renamed from: f */
    private final AtomicMarkableReference<String> f60529f = new AtomicMarkableReference<>(null, false);

    /* loaded from: classes3.dex */
    public class a {

        /* renamed from: a */
        final AtomicMarkableReference<b> f60530a;

        /* renamed from: b */
        private final AtomicReference<Callable<Void>> f60531b = new AtomicReference<>(null);

        /* renamed from: c */
        private final boolean f60532c;

        public a(boolean z11) {
            i.this = r2;
            this.f60532c = z11;
            this.f60530a = new AtomicMarkableReference<>(new b(64, z11 ? PKIFailureInfo.certRevoked : 1024), false);
        }

        public static /* synthetic */ Void a(a aVar) {
            return aVar.c();
        }

        public /* synthetic */ Void c() {
            this.f60531b.set(null);
            e();
            return null;
        }

        private void d() {
            Callable<Void> callable = new Callable() { // from class: zl.h
                {
                    i.a.this = this;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return i.a.a(i.a.this);
                }
            };
            if (this.f60531b.compareAndSet(null, callable)) {
                i.this.f60525b.h(callable);
            }
        }

        private void e() {
            Map<String, String> map;
            synchronized (this) {
                if (this.f60530a.isMarked()) {
                    map = this.f60530a.getReference().a();
                    AtomicMarkableReference<b> atomicMarkableReference = this.f60530a;
                    atomicMarkableReference.set(atomicMarkableReference.getReference(), false);
                } else {
                    map = null;
                }
            }
            if (map != null) {
                i.this.f60524a.k(i.this.f60526c, map, this.f60532c);
            }
        }

        public Map<String, String> b() {
            return this.f60530a.getReference().a();
        }

        public boolean f(String str, String str2) {
            synchronized (this) {
                if (this.f60530a.getReference().d(str, str2)) {
                    AtomicMarkableReference<b> atomicMarkableReference = this.f60530a;
                    atomicMarkableReference.set(atomicMarkableReference.getReference(), true);
                    d();
                    return true;
                }
                return false;
            }
        }
    }

    public i(String str, dm.f fVar, com.google.firebase.crashlytics.internal.common.h hVar) {
        this.f60526c = str;
        this.f60524a = new d(fVar);
        this.f60525b = hVar;
    }

    public static /* synthetic */ Object a(i iVar) {
        return iVar.h();
    }

    public /* synthetic */ Object h() {
        k();
        return null;
    }

    public static i i(String str, dm.f fVar, com.google.firebase.crashlytics.internal.common.h hVar) {
        d dVar = new d(fVar);
        i iVar = new i(str, fVar, hVar);
        iVar.f60527d.f60530a.getReference().e(dVar.g(str, false));
        iVar.f60528e.f60530a.getReference().e(dVar.g(str, true));
        iVar.f60529f.set(dVar.h(str), false);
        return iVar;
    }

    public static String j(String str, dm.f fVar) {
        return new d(fVar).h(str);
    }

    private void k() {
        boolean z11;
        String str;
        synchronized (this.f60529f) {
            z11 = false;
            if (this.f60529f.isMarked()) {
                str = g();
                this.f60529f.set(str, false);
                z11 = true;
            } else {
                str = null;
            }
        }
        if (z11) {
            this.f60524a.l(this.f60526c, str);
        }
    }

    public Map<String, String> e() {
        return this.f60527d.b();
    }

    public Map<String, String> f() {
        return this.f60528e.b();
    }

    public String g() {
        return this.f60529f.getReference();
    }

    public boolean l(String str, String str2) {
        return this.f60527d.f(str, str2);
    }

    public void m(String str) {
        String c11 = b.c(str, 1024);
        synchronized (this.f60529f) {
            if (com.google.firebase.crashlytics.internal.common.g.A(c11, this.f60529f.getReference())) {
                return;
            }
            this.f60529f.set(c11, true);
            this.f60525b.h(new Callable() { // from class: zl.g
                {
                    i.this = this;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return i.a(i.this);
                }
            });
        }
    }
}