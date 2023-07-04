package m1;

import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: d  reason: collision with root package name */
    public static final a f38186d = new a(null);

    /* renamed from: a  reason: collision with root package name */
    private j f38187a;

    /* renamed from: b  reason: collision with root package name */
    private int f38188b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f38189c;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: m1.h$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        static final class C0733a implements f {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ h00.p<Set<? extends Object>, h, vz.b0> f38190a;

            /* JADX WARN: Multi-variable type inference failed */
            C0733a(h00.p<? super Set<? extends Object>, ? super h, vz.b0> pVar) {
                this.f38190a = pVar;
            }

            @Override // m1.f
            public final void dispose() {
                h00.p<Set<? extends Object>, h, vz.b0> pVar = this.f38190a;
                synchronized (l.z()) {
                    l.c().remove(pVar);
                    vz.b0 b0Var = vz.b0.f54756a;
                }
            }
        }

        /* loaded from: classes.dex */
        static final class b implements f {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ h00.l<Object, vz.b0> f38191a;

            b(h00.l<Object, vz.b0> lVar) {
                this.f38191a = lVar;
            }

            @Override // m1.f
            public final void dispose() {
                h00.l<Object, vz.b0> lVar = this.f38191a;
                synchronized (l.z()) {
                    l.f().remove(lVar);
                }
                l.b();
            }
        }

        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final h a() {
            return l.y();
        }

        public final void b() {
            l.y().l();
        }

        public final <T> T c(h00.l<Object, vz.b0> lVar, h00.l<Object, vz.b0> lVar2, h00.a<? extends T> block) {
            h e0Var;
            kotlin.jvm.internal.s.g(block, "block");
            if (lVar == null && lVar2 == null) {
                return block.invoke();
            }
            h hVar = (h) l.i().a();
            if (hVar == null || (hVar instanceof c)) {
                e0Var = new e0(hVar instanceof c ? (c) hVar : null, lVar, lVar2);
            } else if (lVar == null) {
                return block.invoke();
            } else {
                e0Var = hVar.r(lVar);
            }
            try {
                h i11 = e0Var.i();
                T invoke = block.invoke();
                e0Var.n(i11);
                return invoke;
            } finally {
                e0Var.b();
            }
        }

        public final f d(h00.p<? super Set<? extends Object>, ? super h, vz.b0> observer) {
            kotlin.jvm.internal.s.g(observer, "observer");
            l.a(l.e());
            synchronized (l.z()) {
                l.c().add(observer);
            }
            return new C0733a(observer);
        }

        public final f e(h00.l<Object, vz.b0> observer) {
            kotlin.jvm.internal.s.g(observer, "observer");
            synchronized (l.z()) {
                l.f().add(observer);
            }
            l.b();
            return new b(observer);
        }

        public final void f() {
            Set<b0> x11;
            boolean z11;
            synchronized (l.z()) {
                z11 = false;
                if (((m1.a) l.d().get()).x() != null) {
                    if (!x11.isEmpty()) {
                        z11 = true;
                    }
                }
            }
            if (z11) {
                l.b();
            }
        }

        public final c g(h00.l<Object, vz.b0> lVar, h00.l<Object, vz.b0> lVar2) {
            h y11 = l.y();
            c cVar = y11 instanceof c ? (c) y11 : null;
            c F = cVar != null ? cVar.F(lVar, lVar2) : null;
            if (F != null) {
                return F;
            }
            throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot".toString());
        }

        public final h h(h00.l<Object, vz.b0> lVar) {
            return l.y().r(lVar);
        }
    }

    private h(int i11, j jVar) {
        this.f38187a = jVar;
        this.f38188b = i11;
    }

    public /* synthetic */ h(int i11, j jVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, jVar);
    }

    public void a() {
        synchronized (l.z()) {
            l.q(l.h().j(d()));
            vz.b0 b0Var = vz.b0.f54756a;
        }
    }

    public void b() {
        this.f38189c = true;
    }

    public final boolean c() {
        return this.f38189c;
    }

    public int d() {
        return this.f38188b;
    }

    public j e() {
        return this.f38187a;
    }

    public abstract h00.l<Object, vz.b0> f();

    public abstract boolean g();

    public abstract h00.l<Object, vz.b0> h();

    public h i() {
        h hVar = (h) l.i().a();
        l.i().b(this);
        return hVar;
    }

    public abstract void j(h hVar);

    public abstract void k(h hVar);

    public abstract void l();

    public abstract void m(b0 b0Var);

    public void n(h hVar) {
        l.i().b(hVar);
    }

    public final void o(boolean z11) {
        this.f38189c = z11;
    }

    public void p(int i11) {
        this.f38188b = i11;
    }

    public void q(j jVar) {
        kotlin.jvm.internal.s.g(jVar, "<set-?>");
        this.f38187a = jVar;
    }

    public abstract h r(h00.l<Object, vz.b0> lVar);

    public final void s() {
        if (!(!this.f38189c)) {
            throw new IllegalArgumentException("Cannot use a disposed snapshot".toString());
        }
    }
}