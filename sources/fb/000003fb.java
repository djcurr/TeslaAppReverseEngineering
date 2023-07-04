package androidx.camera.view;

import androidx.camera.core.impl.s;
import androidx.camera.core.impl.z0;
import androidx.camera.core.n0;
import androidx.camera.view.PreviewView;
import androidx.concurrent.futures.b;
import androidx.lifecycle.f0;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class e implements z0.a<s.a> {

    /* renamed from: a */
    private final androidx.camera.core.impl.r f2602a;

    /* renamed from: b */
    private final f0<PreviewView.f> f2603b;

    /* renamed from: c */
    private PreviewView.f f2604c;

    /* renamed from: d */
    private final k f2605d;

    /* renamed from: e */
    com.google.common.util.concurrent.c<Void> f2606e;

    /* renamed from: f */
    private boolean f2607f = false;

    /* loaded from: classes.dex */
    public class a implements c0.c<Void> {

        /* renamed from: a */
        final /* synthetic */ List f2608a;

        /* renamed from: b */
        final /* synthetic */ z.d f2609b;

        a(List list, z.d dVar) {
            e.this = r1;
            this.f2608a = list;
            this.f2609b = dVar;
        }

        @Override // c0.c
        /* renamed from: a */
        public void onSuccess(Void r22) {
            e.this.f2606e = null;
        }

        @Override // c0.c
        public void onFailure(Throwable th2) {
            e.this.f2606e = null;
            if (this.f2608a.isEmpty()) {
                return;
            }
            for (androidx.camera.core.impl.e eVar : this.f2608a) {
                ((androidx.camera.core.impl.r) this.f2609b).e(eVar);
            }
            this.f2608a.clear();
        }
    }

    /* loaded from: classes.dex */
    public class b extends androidx.camera.core.impl.e {

        /* renamed from: a */
        final /* synthetic */ b.a f2611a;

        /* renamed from: b */
        final /* synthetic */ z.d f2612b;

        b(e eVar, b.a aVar, z.d dVar) {
            this.f2611a = aVar;
            this.f2612b = dVar;
        }

        @Override // androidx.camera.core.impl.e
        public void b(androidx.camera.core.impl.m mVar) {
            this.f2611a.c(null);
            ((androidx.camera.core.impl.r) this.f2612b).e(this);
        }
    }

    public e(androidx.camera.core.impl.r rVar, f0<PreviewView.f> f0Var, k kVar) {
        this.f2602a = rVar;
        this.f2603b = f0Var;
        this.f2605d = kVar;
        synchronized (this) {
            this.f2604c = f0Var.getValue();
        }
    }

    public static /* synthetic */ Void b(e eVar, Void r12) {
        return eVar.h(r12);
    }

    public static /* synthetic */ Object c(e eVar, z.d dVar, List list, b.a aVar) {
        return eVar.i(dVar, list, aVar);
    }

    public static /* synthetic */ com.google.common.util.concurrent.c d(e eVar, Void r12) {
        return eVar.g(r12);
    }

    private void e() {
        com.google.common.util.concurrent.c<Void> cVar = this.f2606e;
        if (cVar != null) {
            cVar.cancel(false);
            this.f2606e = null;
        }
    }

    public /* synthetic */ com.google.common.util.concurrent.c g(Void r12) {
        return this.f2605d.i();
    }

    public /* synthetic */ Void h(Void r12) {
        l(PreviewView.f.STREAMING);
        return null;
    }

    public /* synthetic */ Object i(z.d dVar, List list, b.a aVar) {
        b bVar = new b(this, aVar, dVar);
        list.add(bVar);
        ((androidx.camera.core.impl.r) dVar).b(b0.a.a(), bVar);
        return "waitForCaptureResult";
    }

    private void k(z.d dVar) {
        l(PreviewView.f.IDLE);
        ArrayList arrayList = new ArrayList();
        c0.d e11 = c0.d.b(m(dVar, arrayList)).f(new c0.a() { // from class: androidx.camera.view.c
            {
                e.this = this;
            }

            @Override // c0.a
            public final com.google.common.util.concurrent.c apply(Object obj) {
                return e.d(e.this, (Void) obj);
            }
        }, b0.a.a()).e(new p.a() { // from class: androidx.camera.view.d
            {
                e.this = this;
            }

            @Override // p.a
            public final Object apply(Object obj) {
                return e.b(e.this, (Void) obj);
            }
        }, b0.a.a());
        this.f2606e = e11;
        c0.f.b(e11, new a(arrayList, dVar), b0.a.a());
    }

    private com.google.common.util.concurrent.c<Void> m(final z.d dVar, final List<androidx.camera.core.impl.e> list) {
        return androidx.concurrent.futures.b.a(new b.c() { // from class: androidx.camera.view.b
            {
                e.this = this;
            }

            @Override // androidx.concurrent.futures.b.c
            public final Object a(b.a aVar) {
                return e.c(e.this, dVar, list, aVar);
            }
        });
    }

    public void f() {
        e();
    }

    @Override // androidx.camera.core.impl.z0.a
    /* renamed from: j */
    public void a(s.a aVar) {
        if (aVar != s.a.CLOSING && aVar != s.a.CLOSED && aVar != s.a.RELEASING && aVar != s.a.RELEASED) {
            if ((aVar == s.a.OPENING || aVar == s.a.OPEN || aVar == s.a.PENDING_OPEN) && !this.f2607f) {
                k(this.f2602a);
                this.f2607f = true;
                return;
            }
            return;
        }
        l(PreviewView.f.IDLE);
        if (this.f2607f) {
            this.f2607f = false;
            e();
        }
    }

    public void l(PreviewView.f fVar) {
        synchronized (this) {
            if (this.f2604c.equals(fVar)) {
                return;
            }
            this.f2604c = fVar;
            n0.a("StreamStateObserver", "Update Preview stream state to " + fVar);
            this.f2603b.postValue(fVar);
        }
    }

    @Override // androidx.camera.core.impl.z0.a
    public void onError(Throwable th2) {
        f();
        l(PreviewView.f.IDLE);
    }
}