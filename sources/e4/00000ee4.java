package c1;

import c1.m0;
import java.util.ArrayList;
import java.util.List;
import vz.q;
import zz.g;

/* loaded from: classes.dex */
public final class f implements m0 {

    /* renamed from: a  reason: collision with root package name */
    private final h00.a<vz.b0> f8452a;

    /* renamed from: c  reason: collision with root package name */
    private Throwable f8454c;

    /* renamed from: b  reason: collision with root package name */
    private final Object f8453b = new Object();

    /* renamed from: d  reason: collision with root package name */
    private List<a<?>> f8455d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    private List<a<?>> f8456e = new ArrayList();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a<R> {

        /* renamed from: a  reason: collision with root package name */
        private final h00.l<Long, R> f8457a;

        /* renamed from: b  reason: collision with root package name */
        private final zz.d<R> f8458b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(h00.l<? super Long, ? extends R> onFrame, zz.d<? super R> continuation) {
            kotlin.jvm.internal.s.g(onFrame, "onFrame");
            kotlin.jvm.internal.s.g(continuation, "continuation");
            this.f8457a = onFrame;
            this.f8458b = continuation;
        }

        public final zz.d<R> a() {
            return this.f8458b;
        }

        public final h00.l<Long, R> b() {
            return this.f8457a;
        }

        public final void c(long j11) {
            Object b11;
            zz.d<R> dVar = this.f8458b;
            try {
                q.a aVar = vz.q.f54772b;
                b11 = vz.q.b(b().invoke(Long.valueOf(j11)));
            } catch (Throwable th2) {
                q.a aVar2 = vz.q.f54772b;
                b11 = vz.q.b(vz.r.a(th2));
            }
            dVar.resumeWith(b11);
        }
    }

    /* loaded from: classes.dex */
    static final class b extends kotlin.jvm.internal.u implements h00.l<Throwable, vz.b0> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.l0<a<R>> f8460b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(kotlin.jvm.internal.l0<a<R>> l0Var) {
            super(1);
            this.f8460b = l0Var;
        }

        public final void a(Throwable th2) {
            a aVar;
            Object obj = f.this.f8453b;
            f fVar = f.this;
            kotlin.jvm.internal.l0<a<R>> l0Var = this.f8460b;
            synchronized (obj) {
                List list = fVar.f8455d;
                Object obj2 = l0Var.f34916a;
                if (obj2 == null) {
                    kotlin.jvm.internal.s.x("awaiter");
                    aVar = null;
                } else {
                    aVar = (a) obj2;
                }
                list.remove(aVar);
                vz.b0 b0Var = vz.b0.f54756a;
            }
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ vz.b0 invoke(Throwable th2) {
            a(th2);
            return vz.b0.f54756a;
        }
    }

    public f(h00.a<vz.b0> aVar) {
        this.f8452a = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h(Throwable th2) {
        synchronized (this.f8453b) {
            if (this.f8454c != null) {
                return;
            }
            this.f8454c = th2;
            List<a<?>> list = this.f8455d;
            int i11 = 0;
            int size = list.size();
            while (i11 < size) {
                int i12 = i11 + 1;
                zz.d<?> a11 = list.get(i11).a();
                q.a aVar = vz.q.f54772b;
                a11.resumeWith(vz.q.b(vz.r.a(th2)));
                i11 = i12;
            }
            this.f8455d.clear();
            vz.b0 b0Var = vz.b0.f54756a;
        }
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [T, c1.f$a] */
    @Override // c1.m0
    public <R> Object e0(h00.l<? super Long, ? extends R> lVar, zz.d<? super R> dVar) {
        zz.d c11;
        a aVar;
        Object d11;
        c11 = a00.c.c(dVar);
        v20.p pVar = new v20.p(c11, 1);
        pVar.y();
        kotlin.jvm.internal.l0 l0Var = new kotlin.jvm.internal.l0();
        synchronized (this.f8453b) {
            Throwable th2 = this.f8454c;
            if (th2 != null) {
                q.a aVar2 = vz.q.f54772b;
                pVar.resumeWith(vz.q.b(vz.r.a(th2)));
            } else {
                l0Var.f34916a = new a(lVar, pVar);
                boolean z11 = !this.f8455d.isEmpty();
                List list = this.f8455d;
                T t11 = l0Var.f34916a;
                if (t11 == 0) {
                    kotlin.jvm.internal.s.x("awaiter");
                    aVar = null;
                } else {
                    aVar = (a) t11;
                }
                list.add(aVar);
                boolean z12 = !z11;
                pVar.T(new b(l0Var));
                if (z12 && this.f8452a != null) {
                    try {
                        this.f8452a.invoke();
                    } catch (Throwable th3) {
                        h(th3);
                    }
                }
            }
        }
        Object s11 = pVar.s();
        d11 = a00.d.d();
        if (s11 == d11) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return s11;
    }

    @Override // zz.g
    public <R> R fold(R r11, h00.p<? super R, ? super g.b, ? extends R> pVar) {
        return (R) m0.a.a(this, r11, pVar);
    }

    @Override // zz.g.b, zz.g
    public <E extends g.b> E get(g.c<E> cVar) {
        return (E) m0.a.b(this, cVar);
    }

    @Override // zz.g.b
    public g.c<?> getKey() {
        return m0.a.c(this);
    }

    public final boolean i() {
        boolean z11;
        synchronized (this.f8453b) {
            z11 = !this.f8455d.isEmpty();
        }
        return z11;
    }

    public final void k(long j11) {
        synchronized (this.f8453b) {
            List<a<?>> list = this.f8455d;
            this.f8455d = this.f8456e;
            this.f8456e = list;
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                list.get(i11).c(j11);
            }
            list.clear();
            vz.b0 b0Var = vz.b0.f54756a;
        }
    }

    @Override // zz.g
    public zz.g minusKey(g.c<?> cVar) {
        return m0.a.d(this, cVar);
    }

    @Override // zz.g
    public zz.g plus(zz.g gVar) {
        return m0.a.e(this, gVar);
    }
}