package io.grpc.internal;

import io.grpc.internal.j1;
import io.grpc.internal.r;
import io.grpc.m0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class a0 implements j1 {

    /* renamed from: c  reason: collision with root package name */
    private final Executor f30626c;

    /* renamed from: d  reason: collision with root package name */
    private final io.grpc.h1 f30627d;

    /* renamed from: e  reason: collision with root package name */
    private Runnable f30628e;

    /* renamed from: f  reason: collision with root package name */
    private Runnable f30629f;

    /* renamed from: g  reason: collision with root package name */
    private Runnable f30630g;

    /* renamed from: h  reason: collision with root package name */
    private j1.a f30631h;

    /* renamed from: j  reason: collision with root package name */
    private io.grpc.f1 f30633j;

    /* renamed from: k  reason: collision with root package name */
    private m0.i f30634k;

    /* renamed from: l  reason: collision with root package name */
    private long f30635l;

    /* renamed from: a  reason: collision with root package name */
    private final io.grpc.g0 f30624a = io.grpc.g0.a(a0.class, null);

    /* renamed from: b  reason: collision with root package name */
    private final Object f30625b = new Object();

    /* renamed from: i  reason: collision with root package name */
    private Collection<e> f30632i = new LinkedHashSet();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j1.a f30636a;

        a(a0 a0Var, j1.a aVar) {
            this.f30636a = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f30636a.c(true);
        }
    }

    /* loaded from: classes5.dex */
    class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j1.a f30637a;

        b(a0 a0Var, j1.a aVar) {
            this.f30637a = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f30637a.c(false);
        }
    }

    /* loaded from: classes5.dex */
    class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j1.a f30638a;

        c(a0 a0Var, j1.a aVar) {
            this.f30638a = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f30638a.d();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ io.grpc.f1 f30639a;

        d(io.grpc.f1 f1Var) {
            this.f30639a = f1Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            a0.this.f30631h.a(this.f30639a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public class e extends b0 {

        /* renamed from: j  reason: collision with root package name */
        private final m0.f f30641j;

        /* renamed from: k  reason: collision with root package name */
        private final io.grpc.r f30642k;

        /* renamed from: l  reason: collision with root package name */
        private final io.grpc.k[] f30643l;

        /* synthetic */ e(a0 a0Var, m0.f fVar, io.grpc.k[] kVarArr, a aVar) {
            this(fVar, kVarArr);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Runnable z(s sVar) {
            io.grpc.r b11 = this.f30642k.b();
            try {
                q e11 = sVar.e(this.f30641j.c(), this.f30641j.b(), this.f30641j.a(), this.f30643l);
                this.f30642k.f(b11);
                return v(e11);
            } catch (Throwable th2) {
                this.f30642k.f(b11);
                throw th2;
            }
        }

        @Override // io.grpc.internal.b0, io.grpc.internal.q
        public void b(io.grpc.f1 f1Var) {
            super.b(f1Var);
            synchronized (a0.this.f30625b) {
                if (a0.this.f30630g != null) {
                    boolean remove = a0.this.f30632i.remove(this);
                    if (!a0.this.q() && remove) {
                        a0.this.f30627d.b(a0.this.f30629f);
                        if (a0.this.f30633j != null) {
                            a0.this.f30627d.b(a0.this.f30630g);
                            a0.this.f30630g = null;
                        }
                    }
                }
            }
            a0.this.f30627d.a();
        }

        @Override // io.grpc.internal.b0, io.grpc.internal.q
        public void o(w0 w0Var) {
            if (this.f30641j.a().j()) {
                w0Var.a("wait_for_ready");
            }
            super.o(w0Var);
        }

        @Override // io.grpc.internal.b0
        protected void t(io.grpc.f1 f1Var) {
            for (io.grpc.k kVar : this.f30643l) {
                kVar.i(f1Var);
            }
        }

        private e(m0.f fVar, io.grpc.k[] kVarArr) {
            this.f30642k = io.grpc.r.e();
            this.f30641j = fVar;
            this.f30643l = kVarArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a0(Executor executor, io.grpc.h1 h1Var) {
        this.f30626c = executor;
        this.f30627d = h1Var;
    }

    private e o(m0.f fVar, io.grpc.k[] kVarArr) {
        e eVar = new e(this, fVar, kVarArr, null);
        this.f30632i.add(eVar);
        if (p() == 1) {
            this.f30627d.b(this.f30628e);
        }
        return eVar;
    }

    @Override // io.grpc.internal.j1
    public final void b(io.grpc.f1 f1Var) {
        Collection<e> collection;
        Runnable runnable;
        f(f1Var);
        synchronized (this.f30625b) {
            collection = this.f30632i;
            runnable = this.f30630g;
            this.f30630g = null;
            if (!collection.isEmpty()) {
                this.f30632i = Collections.emptyList();
            }
        }
        if (runnable != null) {
            for (e eVar : collection) {
                Runnable v11 = eVar.v(new f0(f1Var, r.a.REFUSED, eVar.f30643l));
                if (v11 != null) {
                    v11.run();
                }
            }
            this.f30627d.execute(runnable);
        }
    }

    @Override // io.grpc.k0
    public io.grpc.g0 c() {
        return this.f30624a;
    }

    @Override // io.grpc.internal.s
    public final q e(io.grpc.s0<?, ?> s0Var, io.grpc.r0 r0Var, io.grpc.c cVar, io.grpc.k[] kVarArr) {
        q f0Var;
        try {
            s1 s1Var = new s1(s0Var, r0Var, cVar);
            m0.i iVar = null;
            long j11 = -1;
            while (true) {
                synchronized (this.f30625b) {
                    if (this.f30633j != null) {
                        f0Var = new f0(this.f30633j, kVarArr);
                        break;
                    }
                    m0.i iVar2 = this.f30634k;
                    if (iVar2 == null) {
                        f0Var = o(s1Var, kVarArr);
                        break;
                    } else if (iVar != null && j11 == this.f30635l) {
                        f0Var = o(s1Var, kVarArr);
                        break;
                    } else {
                        j11 = this.f30635l;
                        s j12 = q0.j(iVar2.a(s1Var), cVar.j());
                        if (j12 != null) {
                            f0Var = j12.e(s1Var.c(), s1Var.b(), s1Var.a(), kVarArr);
                            break;
                        }
                        iVar = iVar2;
                    }
                }
            }
            return f0Var;
        } finally {
            this.f30627d.a();
        }
    }

    @Override // io.grpc.internal.j1
    public final void f(io.grpc.f1 f1Var) {
        Runnable runnable;
        synchronized (this.f30625b) {
            if (this.f30633j != null) {
                return;
            }
            this.f30633j = f1Var;
            this.f30627d.b(new d(f1Var));
            if (!q() && (runnable = this.f30630g) != null) {
                this.f30627d.b(runnable);
                this.f30630g = null;
            }
            this.f30627d.a();
        }
    }

    @Override // io.grpc.internal.j1
    public final Runnable g(j1.a aVar) {
        this.f30631h = aVar;
        this.f30628e = new a(this, aVar);
        this.f30629f = new b(this, aVar);
        this.f30630g = new c(this, aVar);
        return null;
    }

    final int p() {
        int size;
        synchronized (this.f30625b) {
            size = this.f30632i.size();
        }
        return size;
    }

    public final boolean q() {
        boolean z11;
        synchronized (this.f30625b) {
            z11 = !this.f30632i.isEmpty();
        }
        return z11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void r(m0.i iVar) {
        Runnable runnable;
        synchronized (this.f30625b) {
            this.f30634k = iVar;
            this.f30635l++;
            if (iVar != null && q()) {
                ArrayList arrayList = new ArrayList(this.f30632i);
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    e eVar = (e) it2.next();
                    m0.e a11 = iVar.a(eVar.f30641j);
                    io.grpc.c a12 = eVar.f30641j.a();
                    s j11 = q0.j(a11, a12.j());
                    if (j11 != null) {
                        Executor executor = this.f30626c;
                        if (a12.e() != null) {
                            executor = a12.e();
                        }
                        Runnable z11 = eVar.z(j11);
                        if (z11 != null) {
                            executor.execute(z11);
                        }
                        arrayList2.add(eVar);
                    }
                }
                synchronized (this.f30625b) {
                    if (q()) {
                        this.f30632i.removeAll(arrayList2);
                        if (this.f30632i.isEmpty()) {
                            this.f30632i = new LinkedHashSet();
                        }
                        if (!q()) {
                            this.f30627d.b(this.f30629f);
                            if (this.f30633j != null && (runnable = this.f30630g) != null) {
                                this.f30627d.b(runnable);
                                this.f30630g = null;
                            }
                        }
                        this.f30627d.a();
                    }
                }
            }
        }
    }
}