package x20;

import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.internal.e0;
import kotlinx.coroutines.internal.f0;
import kotlinx.coroutines.internal.s;
import v20.g1;
import v20.o;
import v20.r0;
import v20.s0;
import vz.b0;
import vz.q;
import x20.i;

/* loaded from: classes5.dex */
public abstract class a<E> extends x20.c<E> implements x20.e<E> {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x20.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static final class C1300a<E> implements x20.g<E> {

        /* renamed from: a  reason: collision with root package name */
        public final a<E> f56969a;

        /* renamed from: b  reason: collision with root package name */
        private Object f56970b = x20.b.f56991d;

        public C1300a(a<E> aVar) {
            this.f56969a = aVar;
        }

        private final boolean c(Object obj) {
            if (obj instanceof m) {
                m mVar = (m) obj;
                if (mVar.f57017d == null) {
                    return false;
                }
                throw e0.k(mVar.d0());
            }
            return true;
        }

        private final Object d(zz.d<? super Boolean> dVar) {
            zz.d c11;
            Object d11;
            c11 = a00.c.c(dVar);
            v20.p b11 = v20.r.b(c11);
            d dVar2 = new d(this, b11);
            while (true) {
                if (this.f56969a.M(dVar2)) {
                    this.f56969a.a0(b11, dVar2);
                    break;
                }
                Object W = this.f56969a.W();
                e(W);
                if (W instanceof m) {
                    m mVar = (m) W;
                    if (mVar.f57017d == null) {
                        q.a aVar = vz.q.f54772b;
                        b11.resumeWith(vz.q.b(kotlin.coroutines.jvm.internal.b.a(false)));
                    } else {
                        q.a aVar2 = vz.q.f54772b;
                        b11.resumeWith(vz.q.b(vz.r.a(mVar.d0())));
                    }
                } else if (W != x20.b.f56991d) {
                    Boolean a11 = kotlin.coroutines.jvm.internal.b.a(true);
                    h00.l<E, b0> lVar = this.f56969a.f56995a;
                    b11.S(a11, lVar == null ? null : kotlinx.coroutines.internal.z.a(lVar, W, b11.getContext()));
                }
            }
            Object s11 = b11.s();
            d11 = a00.d.d();
            if (s11 == d11) {
                kotlin.coroutines.jvm.internal.h.c(dVar);
            }
            return s11;
        }

        @Override // x20.g
        public Object a(zz.d<? super Boolean> dVar) {
            Object b11 = b();
            f0 f0Var = x20.b.f56991d;
            if (b11 != f0Var) {
                return kotlin.coroutines.jvm.internal.b.a(c(b()));
            }
            e(this.f56969a.W());
            return b() != f0Var ? kotlin.coroutines.jvm.internal.b.a(c(b())) : d(dVar);
        }

        public final Object b() {
            return this.f56970b;
        }

        public final void e(Object obj) {
            this.f56970b = obj;
        }

        @Override // x20.g
        public E next() {
            E e11 = (E) this.f56970b;
            if (!(e11 instanceof m)) {
                f0 f0Var = x20.b.f56991d;
                if (e11 != f0Var) {
                    this.f56970b = f0Var;
                    return e11;
                }
                throw new IllegalStateException("'hasNext' should be called prior to 'next' invocation");
            }
            throw e0.k(((m) e11).d0());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static class b<E> extends s<E> {

        /* renamed from: d  reason: collision with root package name */
        public final v20.o<Object> f56971d;

        /* renamed from: e  reason: collision with root package name */
        public final int f56972e;

        public b(v20.o<Object> oVar, int i11) {
            this.f56971d = oVar;
            this.f56972e = i11;
        }

        @Override // x20.s
        public void X(m<?> mVar) {
            if (this.f56972e == 1) {
                v20.o<Object> oVar = this.f56971d;
                q.a aVar = vz.q.f54772b;
                oVar.resumeWith(vz.q.b(x20.i.b(x20.i.f57009b.a(mVar.f57017d))));
                return;
            }
            v20.o<Object> oVar2 = this.f56971d;
            q.a aVar2 = vz.q.f54772b;
            oVar2.resumeWith(vz.q.b(vz.r.a(mVar.d0())));
        }

        public final Object Y(E e11) {
            return this.f56972e == 1 ? x20.i.b(x20.i.f57009b.c(e11)) : e11;
        }

        @Override // x20.u
        public void i(E e11) {
            this.f56971d.U(v20.q.f53988a);
        }

        @Override // x20.u
        public f0 q(E e11, s.c cVar) {
            Object o11 = this.f56971d.o(Y(e11), cVar == null ? null : cVar.f35507c, W(e11));
            if (o11 == null) {
                return null;
            }
            if (r0.a()) {
                if (!(o11 == v20.q.f53988a)) {
                    throw new AssertionError();
                }
            }
            if (cVar != null) {
                cVar.d();
            }
            return v20.q.f53988a;
        }

        @Override // kotlinx.coroutines.internal.s
        public String toString() {
            return "ReceiveElement@" + s0.b(this) + "[receiveMode=" + this.f56972e + ']';
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static final class c<E> extends b<E> {

        /* renamed from: f  reason: collision with root package name */
        public final h00.l<E, b0> f56973f;

        /* JADX WARN: Multi-variable type inference failed */
        public c(v20.o<Object> oVar, int i11, h00.l<? super E, b0> lVar) {
            super(oVar, i11);
            this.f56973f = lVar;
        }

        @Override // x20.s
        public h00.l<Throwable, b0> W(E e11) {
            return kotlinx.coroutines.internal.z.a(this.f56973f, e11, this.f56971d.getContext());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static class d<E> extends s<E> {

        /* renamed from: d  reason: collision with root package name */
        public final C1300a<E> f56974d;

        /* renamed from: e  reason: collision with root package name */
        public final v20.o<Boolean> f56975e;

        /* JADX WARN: Multi-variable type inference failed */
        public d(C1300a<E> c1300a, v20.o<? super Boolean> oVar) {
            this.f56974d = c1300a;
            this.f56975e = oVar;
        }

        @Override // x20.s
        public h00.l<Throwable, b0> W(E e11) {
            h00.l<E, b0> lVar = this.f56974d.f56969a.f56995a;
            if (lVar == null) {
                return null;
            }
            return kotlinx.coroutines.internal.z.a(lVar, e11, this.f56975e.getContext());
        }

        @Override // x20.s
        public void X(m<?> mVar) {
            Object t11;
            if (mVar.f57017d == null) {
                t11 = o.a.b(this.f56975e, Boolean.FALSE, null, 2, null);
            } else {
                t11 = this.f56975e.t(mVar.d0());
            }
            if (t11 != null) {
                this.f56974d.e(mVar);
                this.f56975e.U(t11);
            }
        }

        @Override // x20.u
        public void i(E e11) {
            this.f56974d.e(e11);
            this.f56975e.U(v20.q.f53988a);
        }

        @Override // x20.u
        public f0 q(E e11, s.c cVar) {
            Object o11 = this.f56975e.o(Boolean.TRUE, cVar == null ? null : cVar.f35507c, W(e11));
            if (o11 == null) {
                return null;
            }
            if (r0.a()) {
                if (!(o11 == v20.q.f53988a)) {
                    throw new AssertionError();
                }
            }
            if (cVar != null) {
                cVar.d();
            }
            return v20.q.f53988a;
        }

        @Override // kotlinx.coroutines.internal.s
        public String toString() {
            return kotlin.jvm.internal.s.p("ReceiveHasNext@", s0.b(this));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static final class e<R, E> extends s<E> implements g1 {

        /* renamed from: d  reason: collision with root package name */
        public final a<E> f56976d;

        /* renamed from: e  reason: collision with root package name */
        public final kotlinx.coroutines.selects.d<R> f56977e;

        /* renamed from: f  reason: collision with root package name */
        public final h00.p<Object, zz.d<? super R>, Object> f56978f;

        /* renamed from: g  reason: collision with root package name */
        public final int f56979g;

        /* JADX WARN: Multi-variable type inference failed */
        public e(a<E> aVar, kotlinx.coroutines.selects.d<? super R> dVar, h00.p<Object, ? super zz.d<? super R>, ? extends Object> pVar, int i11) {
            this.f56976d = aVar;
            this.f56977e = dVar;
            this.f56978f = pVar;
            this.f56979g = i11;
        }

        @Override // x20.s
        public h00.l<Throwable, b0> W(E e11) {
            h00.l<E, b0> lVar = this.f56976d.f56995a;
            if (lVar == null) {
                return null;
            }
            return kotlinx.coroutines.internal.z.a(lVar, e11, this.f56977e.l().getContext());
        }

        @Override // x20.s
        public void X(m<?> mVar) {
            if (this.f56977e.k()) {
                int i11 = this.f56979g;
                if (i11 == 0) {
                    this.f56977e.m(mVar.d0());
                } else if (i11 != 1) {
                } else {
                    z20.a.e(this.f56978f, x20.i.b(x20.i.f57009b.a(mVar.f57017d)), this.f56977e.l(), null, 4, null);
                }
            }
        }

        @Override // v20.g1
        public void dispose() {
            if (N()) {
                this.f56976d.U();
            }
        }

        @Override // x20.u
        public void i(E e11) {
            z20.a.c(this.f56978f, this.f56979g == 1 ? x20.i.b(x20.i.f57009b.c(e11)) : e11, this.f56977e.l(), W(e11));
        }

        @Override // x20.u
        public f0 q(E e11, s.c cVar) {
            return (f0) this.f56977e.j(cVar);
        }

        @Override // kotlinx.coroutines.internal.s
        public String toString() {
            return "ReceiveSelect@" + s0.b(this) + '[' + this.f56977e + ",receiveMode=" + this.f56979g + ']';
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public final class f extends v20.f {

        /* renamed from: a  reason: collision with root package name */
        private final s<?> f56980a;

        public f(s<?> sVar) {
            this.f56980a = sVar;
        }

        @Override // v20.n
        public void a(Throwable th2) {
            if (this.f56980a.N()) {
                a.this.U();
            }
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ b0 invoke(Throwable th2) {
            a(th2);
            return b0.f54756a;
        }

        public String toString() {
            return "RemoveReceiveOnCancel[" + this.f56980a + ']';
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes5.dex */
    public static final class g<E> extends s.d<w> {
        public g(kotlinx.coroutines.internal.q qVar) {
            super(qVar);
        }

        @Override // kotlinx.coroutines.internal.s.d, kotlinx.coroutines.internal.s.a
        protected Object e(kotlinx.coroutines.internal.s sVar) {
            if (sVar instanceof m) {
                return sVar;
            }
            if (sVar instanceof w) {
                return null;
            }
            return x20.b.f56991d;
        }

        @Override // kotlinx.coroutines.internal.s.a
        public Object j(s.c cVar) {
            f0 Y = ((w) cVar.f35505a).Y(cVar);
            if (Y == null) {
                return kotlinx.coroutines.internal.t.f35511a;
            }
            Object obj = kotlinx.coroutines.internal.c.f35451b;
            if (Y == obj) {
                return obj;
            }
            if (r0.a()) {
                if (Y == v20.q.f53988a) {
                    return null;
                }
                throw new AssertionError();
            }
            return null;
        }

        @Override // kotlinx.coroutines.internal.s.a
        public void k(kotlinx.coroutines.internal.s sVar) {
            ((w) sVar).Z();
        }
    }

    /* loaded from: classes5.dex */
    public static final class h extends s.b {

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ a f56982d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(kotlinx.coroutines.internal.s sVar, a aVar) {
            super(sVar);
            this.f56982d = aVar;
        }

        @Override // kotlinx.coroutines.internal.d
        /* renamed from: k */
        public Object i(kotlinx.coroutines.internal.s sVar) {
            if (this.f56982d.Q()) {
                return null;
            }
            return kotlinx.coroutines.internal.r.a();
        }
    }

    /* loaded from: classes5.dex */
    public static final class i implements kotlinx.coroutines.selects.c<E> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a<E> f56983a;

        i(a<E> aVar) {
            this.f56983a = aVar;
        }

        @Override // kotlinx.coroutines.selects.c
        public <R> void n(kotlinx.coroutines.selects.d<? super R> dVar, h00.p<? super E, ? super zz.d<? super R>, ? extends Object> pVar) {
            this.f56983a.Z(dVar, 0, pVar);
        }
    }

    /* loaded from: classes5.dex */
    public static final class j implements kotlinx.coroutines.selects.c<x20.i<? extends E>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a<E> f56984a;

        j(a<E> aVar) {
            this.f56984a = aVar;
        }

        @Override // kotlinx.coroutines.selects.c
        public <R> void n(kotlinx.coroutines.selects.d<? super R> dVar, h00.p<? super x20.i<? extends E>, ? super zz.d<? super R>, ? extends Object> pVar) {
            this.f56984a.Z(dVar, 1, pVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.AbstractChannel", f = "AbstractChannel.kt", l = {633}, m = "receiveCatching-JP2dKIU")
    /* loaded from: classes5.dex */
    public static final class k extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        /* synthetic */ Object f56985a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a<E> f56986b;

        /* renamed from: c  reason: collision with root package name */
        int f56987c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(a<E> aVar, zz.d<? super k> dVar) {
            super(dVar);
            this.f56986b = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d11;
            this.f56985a = obj;
            this.f56987c |= Integer.MIN_VALUE;
            Object k11 = this.f56986b.k(this);
            d11 = a00.d.d();
            return k11 == d11 ? k11 : x20.i.b(k11);
        }
    }

    public a(h00.l<? super E, b0> lVar) {
        super(lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean M(s<? super E> sVar) {
        boolean N = N(sVar);
        if (N) {
            V();
        }
        return N;
    }

    private final <R> boolean O(kotlinx.coroutines.selects.d<? super R> dVar, h00.p<Object, ? super zz.d<? super R>, ? extends Object> pVar, int i11) {
        e eVar = new e(this, dVar, pVar, i11);
        boolean M = M(eVar);
        if (M) {
            dVar.g(eVar);
        }
        return M;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [x20.a$b] */
    private final <R> Object Y(int i11, zz.d<? super R> dVar) {
        zz.d c11;
        c cVar;
        Object d11;
        c11 = a00.c.c(dVar);
        v20.p b11 = v20.r.b(c11);
        if (this.f56995a == null) {
            cVar = new b(b11, i11);
        } else {
            cVar = new c(b11, i11, this.f56995a);
        }
        while (true) {
            if (M(cVar)) {
                a0(b11, cVar);
                break;
            }
            Object W = W();
            if (W instanceof m) {
                cVar.X((m) W);
                break;
            } else if (W != x20.b.f56991d) {
                b11.S(cVar.Y(W), cVar.W(W));
                break;
            }
        }
        Object s11 = b11.s();
        d11 = a00.d.d();
        if (s11 == d11) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return s11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <R> void Z(kotlinx.coroutines.selects.d<? super R> dVar, int i11, h00.p<Object, ? super zz.d<? super R>, ? extends Object> pVar) {
        while (!dVar.f()) {
            if (R()) {
                if (O(dVar, pVar, i11)) {
                    return;
                }
            } else {
                Object X = X(dVar);
                if (X == kotlinx.coroutines.selects.e.d()) {
                    return;
                }
                if (X != x20.b.f56991d && X != kotlinx.coroutines.internal.c.f35451b) {
                    b0(pVar, dVar, i11, X);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a0(v20.o<?> oVar, s<?> sVar) {
        oVar.T(new f(sVar));
    }

    private final <R> void b0(h00.p<Object, ? super zz.d<? super R>, ? extends Object> pVar, kotlinx.coroutines.selects.d<? super R> dVar, int i11, Object obj) {
        boolean z11 = obj instanceof m;
        if (!z11) {
            if (i11 == 1) {
                i.b bVar = x20.i.f57009b;
                z20.b.c(pVar, x20.i.b(z11 ? bVar.a(((m) obj).f57017d) : bVar.c(obj)), dVar.l());
                return;
            }
            z20.b.c(pVar, obj, dVar.l());
        } else if (i11 != 0) {
            if (i11 == 1 && dVar.k()) {
                z20.b.c(pVar, x20.i.b(x20.i.f57009b.a(((m) obj).f57017d)), dVar.l());
            }
        } else {
            throw e0.k(((m) obj).d0());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // x20.c
    public u<E> F() {
        u<E> F = super.F();
        if (F != null && !(F instanceof m)) {
            U();
        }
        return F;
    }

    public final boolean K(Throwable th2) {
        boolean q11 = q(th2);
        S(q11);
        return q11;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final g<E> L() {
        return new g<>(s());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean N(s<? super E> sVar) {
        int R;
        kotlinx.coroutines.internal.s H;
        if (P()) {
            kotlinx.coroutines.internal.s s11 = s();
            do {
                H = s11.H();
                if (!(!(H instanceof w))) {
                    return false;
                }
            } while (!H.y(sVar, s11));
        } else {
            kotlinx.coroutines.internal.s s12 = s();
            h hVar = new h(sVar, this);
            do {
                kotlinx.coroutines.internal.s H2 = s12.H();
                if (!(!(H2 instanceof w))) {
                    return false;
                }
                R = H2.R(sVar, s12, hVar);
                if (R != 1) {
                }
            } while (R != 2);
            return false;
        }
        return true;
    }

    protected abstract boolean P();

    protected abstract boolean Q();

    protected final boolean R() {
        return !(s().G() instanceof w) && Q();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void S(boolean z11) {
        m<?> p11 = p();
        if (p11 != null) {
            Object b11 = kotlinx.coroutines.internal.n.b(null, 1, null);
            while (true) {
                kotlinx.coroutines.internal.s H = p11.H();
                if (H instanceof kotlinx.coroutines.internal.q) {
                    T(b11, p11);
                    return;
                } else if (r0.a() && !(H instanceof w)) {
                    throw new AssertionError();
                } else {
                    if (!H.N()) {
                        H.I();
                    } else {
                        b11 = kotlinx.coroutines.internal.n.c(b11, (w) H);
                    }
                }
            }
        } else {
            throw new IllegalStateException("Cannot happen".toString());
        }
    }

    protected void T(Object obj, m<?> mVar) {
        if (obj == null) {
            return;
        }
        if (!(obj instanceof ArrayList)) {
            ((w) obj).X(mVar);
            return;
        }
        ArrayList arrayList = (ArrayList) obj;
        int size = arrayList.size() - 1;
        if (size < 0) {
            return;
        }
        while (true) {
            int i11 = size - 1;
            ((w) arrayList.get(size)).X(mVar);
            if (i11 < 0) {
                return;
            }
            size = i11;
        }
    }

    protected void U() {
    }

    protected void V() {
    }

    protected Object W() {
        while (true) {
            w G = G();
            if (G == null) {
                return x20.b.f56991d;
            }
            f0 Y = G.Y(null);
            if (Y != null) {
                if (r0.a()) {
                    if (!(Y == v20.q.f53988a)) {
                        throw new AssertionError();
                    }
                }
                G.V();
                return G.W();
            }
            G.Z();
        }
    }

    protected Object X(kotlinx.coroutines.selects.d<?> dVar) {
        g<E> L = L();
        Object n11 = dVar.n(L);
        if (n11 != null) {
            return n11;
        }
        L.o().V();
        return L.o().W();
    }

    @Override // x20.t
    public boolean c() {
        return o() != null && Q();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // x20.t
    public final Object e(zz.d<? super E> dVar) {
        Object W = W();
        return (W == x20.b.f56991d || (W instanceof m)) ? Y(0, dVar) : W;
    }

    @Override // x20.t
    public final kotlinx.coroutines.selects.c<E> f() {
        return new i(this);
    }

    @Override // x20.t
    public final kotlinx.coroutines.selects.c<x20.i<E>> i() {
        return new j(this);
    }

    @Override // x20.t
    public final x20.g<E> iterator() {
        return new C1300a(this);
    }

    @Override // x20.t
    public final void j(CancellationException cancellationException) {
        if (c()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new CancellationException(kotlin.jvm.internal.s.p(s0.a(this), " was cancelled"));
        }
        K(cancellationException);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    @Override // x20.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object k(zz.d<? super x20.i<? extends E>> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof x20.a.k
            if (r0 == 0) goto L13
            r0 = r5
            x20.a$k r0 = (x20.a.k) r0
            int r1 = r0.f56987c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f56987c = r1
            goto L18
        L13:
            x20.a$k r0 = new x20.a$k
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f56985a
            java.lang.Object r1 = a00.b.d()
            int r2 = r0.f56987c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            vz.r.b(r5)
            goto L5b
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            vz.r.b(r5)
            java.lang.Object r5 = r4.W()
            kotlinx.coroutines.internal.f0 r2 = x20.b.f56991d
            if (r5 == r2) goto L52
            boolean r0 = r5 instanceof x20.m
            if (r0 == 0) goto L4b
            x20.i$b r0 = x20.i.f57009b
            x20.m r5 = (x20.m) r5
            java.lang.Throwable r5 = r5.f57017d
            java.lang.Object r5 = r0.a(r5)
            goto L51
        L4b:
            x20.i$b r0 = x20.i.f57009b
            java.lang.Object r5 = r0.c(r5)
        L51:
            return r5
        L52:
            r0.f56987c = r3
            java.lang.Object r5 = r4.Y(r3, r0)
            if (r5 != r1) goto L5b
            return r1
        L5b:
            x20.i r5 = (x20.i) r5
            java.lang.Object r5 = r5.l()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: x20.a.k(zz.d):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // x20.t
    public final Object l() {
        Object W = W();
        return W == x20.b.f56991d ? x20.i.f57009b.b() : W instanceof m ? x20.i.f57009b.a(((m) W).f57017d) : x20.i.f57009b.c(W);
    }
}