package x20;

import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.internal.UndeliveredElementException;
import kotlinx.coroutines.internal.f0;
import kotlinx.coroutines.internal.s;
import v20.r0;
import v20.s0;
import vz.b0;
import vz.q;
import x20.x;

/* loaded from: classes5.dex */
public abstract class c<E> implements x<E> {

    /* renamed from: c  reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f56994c = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "onCloseHandler");

    /* renamed from: a  reason: collision with root package name */
    protected final h00.l<E, b0> f56995a;

    /* renamed from: b  reason: collision with root package name */
    private final kotlinx.coroutines.internal.q f56996b = new kotlinx.coroutines.internal.q();
    private volatile /* synthetic */ Object onCloseHandler = null;

    /* loaded from: classes5.dex */
    public static final class a<E> extends w {

        /* renamed from: d  reason: collision with root package name */
        public final E f56997d;

        public a(E e11) {
            this.f56997d = e11;
        }

        @Override // x20.w
        public void V() {
        }

        @Override // x20.w
        public Object W() {
            return this.f56997d;
        }

        @Override // x20.w
        public void X(m<?> mVar) {
            if (r0.a()) {
                throw new AssertionError();
            }
        }

        @Override // x20.w
        public f0 Y(s.c cVar) {
            f0 f0Var = v20.q.f53988a;
            if (cVar != null) {
                cVar.d();
            }
            return f0Var;
        }

        @Override // kotlinx.coroutines.internal.s
        public String toString() {
            return "SendBuffered@" + s0.b(this) + CoreConstants.LEFT_PARENTHESIS_CHAR + this.f56997d + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    /* loaded from: classes5.dex */
    public static final class b extends s.b {

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ c f56998d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(kotlinx.coroutines.internal.s sVar, c cVar) {
            super(sVar);
            this.f56998d = cVar;
        }

        @Override // kotlinx.coroutines.internal.d
        /* renamed from: k */
        public Object i(kotlinx.coroutines.internal.s sVar) {
            if (this.f56998d.z()) {
                return null;
            }
            return kotlinx.coroutines.internal.r.a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(h00.l<? super E, b0> lVar) {
        this.f56995a = lVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean A() {
        return !(this.f56996b.G() instanceof u) && z();
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x006f, code lost:
        r4 = r0.s();
        r0 = a00.d.d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0077, code lost:
        if (r4 != r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0079, code lost:
        kotlin.coroutines.jvm.internal.h.c(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007c, code lost:
        r5 = a00.d.d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0080, code lost:
        if (r4 != r5) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0082, code lost:
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0085, code lost:
        return vz.b0.f54756a;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object E(E r4, zz.d<? super vz.b0> r5) {
        /*
            r3 = this;
            zz.d r0 = a00.b.c(r5)
            v20.p r0 = v20.r.b(r0)
        L8:
            boolean r1 = g(r3)
            if (r1 == 0) goto L4d
            h00.l<E, vz.b0> r1 = r3.f56995a
            if (r1 != 0) goto L18
            x20.y r1 = new x20.y
            r1.<init>(r4, r0)
            goto L1f
        L18:
            x20.z r1 = new x20.z
            h00.l<E, vz.b0> r2 = r3.f56995a
            r1.<init>(r4, r0, r2)
        L1f:
            java.lang.Object r2 = r3.m(r1)
            if (r2 != 0) goto L29
            v20.r.c(r0, r1)
            goto L6f
        L29:
            boolean r1 = r2 instanceof x20.m
            if (r1 == 0) goto L33
            x20.m r2 = (x20.m) r2
            a(r3, r0, r4, r2)
            goto L6f
        L33:
            kotlinx.coroutines.internal.f0 r1 = x20.b.f56992e
            if (r2 != r1) goto L38
            goto L4d
        L38:
            boolean r1 = r2 instanceof x20.s
            if (r1 == 0) goto L3d
            goto L4d
        L3d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "enqueueSend returned "
            java.lang.String r5 = kotlin.jvm.internal.s.p(r5, r2)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L4d:
            java.lang.Object r1 = r3.B(r4)
            kotlinx.coroutines.internal.f0 r2 = x20.b.f56989b
            if (r1 != r2) goto L61
            vz.q$a r4 = vz.q.f54772b
            vz.b0 r4 = vz.b0.f54756a
            java.lang.Object r4 = vz.q.b(r4)
            r0.resumeWith(r4)
            goto L6f
        L61:
            kotlinx.coroutines.internal.f0 r2 = x20.b.f56990c
            if (r1 != r2) goto L66
            goto L8
        L66:
            boolean r2 = r1 instanceof x20.m
            if (r2 == 0) goto L86
            x20.m r1 = (x20.m) r1
            a(r3, r0, r4, r1)
        L6f:
            java.lang.Object r4 = r0.s()
            java.lang.Object r0 = a00.b.d()
            if (r4 != r0) goto L7c
            kotlin.coroutines.jvm.internal.h.c(r5)
        L7c:
            java.lang.Object r5 = a00.b.d()
            if (r4 != r5) goto L83
            return r4
        L83:
            vz.b0 r4 = vz.b0.f54756a
            return r4
        L86:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "offerInternal returned "
            java.lang.String r5 = kotlin.jvm.internal.s.p(r5, r1)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: x20.c.E(java.lang.Object, zz.d):java.lang.Object");
    }

    private final int h() {
        kotlinx.coroutines.internal.q qVar = this.f56996b;
        int i11 = 0;
        for (kotlinx.coroutines.internal.s sVar = (kotlinx.coroutines.internal.s) qVar.F(); !kotlin.jvm.internal.s.c(sVar, qVar); sVar = sVar.G()) {
            if (sVar instanceof kotlinx.coroutines.internal.s) {
                i11++;
            }
        }
        return i11;
    }

    private final String t() {
        String p11;
        kotlinx.coroutines.internal.s G = this.f56996b.G();
        if (G == this.f56996b) {
            return "EmptyQueue";
        }
        if (G instanceof m) {
            p11 = G.toString();
        } else if (G instanceof s) {
            p11 = "ReceiveQueued";
        } else {
            p11 = G instanceof w ? "SendQueued" : kotlin.jvm.internal.s.p("UNEXPECTED:", G);
        }
        kotlinx.coroutines.internal.s H = this.f56996b.H();
        if (H != G) {
            String str = p11 + ",queueSize=" + h();
            if (H instanceof m) {
                return str + ",closedForSend=" + H;
            }
            return str;
        }
        return p11;
    }

    private final void u(m<?> mVar) {
        Object b11 = kotlinx.coroutines.internal.n.b(null, 1, null);
        while (true) {
            kotlinx.coroutines.internal.s H = mVar.H();
            s sVar = H instanceof s ? (s) H : null;
            if (sVar == null) {
                break;
            } else if (!sVar.N()) {
                sVar.I();
            } else {
                b11 = kotlinx.coroutines.internal.n.c(b11, sVar);
            }
        }
        if (b11 != null) {
            if (!(b11 instanceof ArrayList)) {
                ((s) b11).X(mVar);
            } else {
                ArrayList arrayList = (ArrayList) b11;
                int size = arrayList.size() - 1;
                if (size >= 0) {
                    while (true) {
                        int i11 = size - 1;
                        ((s) arrayList.get(size)).X(mVar);
                        if (i11 < 0) {
                            break;
                        }
                        size = i11;
                    }
                }
            }
        }
        C(mVar);
    }

    private final Throwable v(m<?> mVar) {
        u(mVar);
        return mVar.f0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w(zz.d<?> dVar, E e11, m<?> mVar) {
        UndeliveredElementException d11;
        u(mVar);
        Throwable f02 = mVar.f0();
        h00.l<E, b0> lVar = this.f56995a;
        if (lVar == null || (d11 = kotlinx.coroutines.internal.z.d(lVar, e11, null, 2, null)) == null) {
            q.a aVar = vz.q.f54772b;
            dVar.resumeWith(vz.q.b(vz.r.a(f02)));
            return;
        }
        vz.f.a(d11, f02);
        q.a aVar2 = vz.q.f54772b;
        dVar.resumeWith(vz.q.b(vz.r.a(d11)));
    }

    private final void x(Throwable th2) {
        f0 f0Var;
        Object obj = this.onCloseHandler;
        if (obj == null || obj == (f0Var = x20.b.f56993f) || !f56994c.compareAndSet(this, obj, f0Var)) {
            return;
        }
        ((h00.l) kotlin.jvm.internal.r0.f(obj, 1)).invoke(th2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Object B(E e11) {
        u<E> F;
        f0 q11;
        do {
            F = F();
            if (F == null) {
                return x20.b.f56990c;
            }
            q11 = F.q(e11, null);
        } while (q11 == null);
        if (r0.a()) {
            if (!(q11 == v20.q.f53988a)) {
                throw new AssertionError();
            }
        }
        F.i(e11);
        return F.b();
    }

    protected void C(kotlinx.coroutines.internal.s sVar) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final u<?> D(E e11) {
        kotlinx.coroutines.internal.s H;
        kotlinx.coroutines.internal.s sVar = this.f56996b;
        a aVar = new a(e11);
        do {
            H = sVar.H();
            if (H instanceof u) {
                return (u) H;
            }
        } while (!H.y(aVar, sVar));
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public u<E> F() {
        kotlinx.coroutines.internal.s sVar;
        kotlinx.coroutines.internal.s P;
        kotlinx.coroutines.internal.q qVar = this.f56996b;
        while (true) {
            sVar = (kotlinx.coroutines.internal.s) qVar.F();
            if (sVar != qVar && (sVar instanceof u)) {
                if (((((u) sVar) instanceof m) && !sVar.M()) || (P = sVar.P()) == null) {
                    break;
                }
                P.K();
            }
        }
        sVar = null;
        return (u) sVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final w G() {
        kotlinx.coroutines.internal.s sVar;
        kotlinx.coroutines.internal.s P;
        kotlinx.coroutines.internal.q qVar = this.f56996b;
        while (true) {
            sVar = (kotlinx.coroutines.internal.s) qVar.F();
            if (sVar != qVar && (sVar instanceof w)) {
                if (((((w) sVar) instanceof m) && !sVar.M()) || (P = sVar.P()) == null) {
                    break;
                }
                P.K();
            }
        }
        sVar = null;
        return (w) sVar;
    }

    @Override // x20.x
    public final Object b(E e11, zz.d<? super b0> dVar) {
        Object d11;
        if (B(e11) == x20.b.f56989b) {
            return b0.f54756a;
        }
        Object E = E(e11, dVar);
        d11 = a00.d.d();
        return E == d11 ? E : b0.f54756a;
    }

    @Override // x20.x
    public final Object d(E e11) {
        Object B = B(e11);
        if (B == x20.b.f56989b) {
            return i.f57009b.c(b0.f54756a);
        }
        if (B == x20.b.f56990c) {
            m<?> p11 = p();
            return p11 == null ? i.f57009b.b() : i.f57009b.a(v(p11));
        } else if (B instanceof m) {
            return i.f57009b.a(v((m) B));
        } else {
            throw new IllegalStateException(kotlin.jvm.internal.s.p("trySend returned ", B).toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Object m(w wVar) {
        boolean z11;
        kotlinx.coroutines.internal.s H;
        if (y()) {
            kotlinx.coroutines.internal.s sVar = this.f56996b;
            do {
                H = sVar.H();
                if (H instanceof u) {
                    return H;
                }
            } while (!H.y(wVar, sVar));
            return null;
        }
        kotlinx.coroutines.internal.s sVar2 = this.f56996b;
        b bVar = new b(wVar, this);
        while (true) {
            kotlinx.coroutines.internal.s H2 = sVar2.H();
            if (!(H2 instanceof u)) {
                int R = H2.R(wVar, sVar2, bVar);
                z11 = true;
                if (R != 1) {
                    if (R == 2) {
                        z11 = false;
                        break;
                    }
                } else {
                    break;
                }
            } else {
                return H2;
            }
        }
        if (z11) {
            return null;
        }
        return x20.b.f56992e;
    }

    protected String n() {
        return "";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final m<?> o() {
        kotlinx.coroutines.internal.s G = this.f56996b.G();
        m<?> mVar = G instanceof m ? (m) G : null;
        if (mVar == null) {
            return null;
        }
        u(mVar);
        return mVar;
    }

    @Override // x20.x
    public boolean offer(E e11) {
        UndeliveredElementException d11;
        try {
            return x.a.b(this, e11);
        } catch (Throwable th2) {
            h00.l<E, b0> lVar = this.f56995a;
            if (lVar != null && (d11 = kotlinx.coroutines.internal.z.d(lVar, e11, null, 2, null)) != null) {
                vz.f.a(d11, th2);
                throw d11;
            }
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final m<?> p() {
        kotlinx.coroutines.internal.s H = this.f56996b.H();
        m<?> mVar = H instanceof m ? (m) H : null;
        if (mVar == null) {
            return null;
        }
        u(mVar);
        return mVar;
    }

    @Override // x20.x
    public boolean q(Throwable th2) {
        boolean z11;
        m<?> mVar = new m<>(th2);
        kotlinx.coroutines.internal.s sVar = this.f56996b;
        while (true) {
            kotlinx.coroutines.internal.s H = sVar.H();
            z11 = true;
            if (!(!(H instanceof m))) {
                z11 = false;
                break;
            } else if (H.y(mVar, sVar)) {
                break;
            }
        }
        if (!z11) {
            mVar = (m) this.f56996b.H();
        }
        u(mVar);
        if (z11) {
            x(th2);
        }
        return z11;
    }

    @Override // x20.x
    public final boolean r() {
        return p() != null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final kotlinx.coroutines.internal.q s() {
        return this.f56996b;
    }

    public String toString() {
        return s0.a(this) + '@' + s0.b(this) + CoreConstants.CURLY_LEFT + t() + CoreConstants.CURLY_RIGHT + n();
    }

    protected abstract boolean y();

    protected abstract boolean z();
}