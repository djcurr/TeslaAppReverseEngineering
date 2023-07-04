package w0;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import f2.m0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import o1.f;
import org.spongycastle.crypto.tls.CipherSuite;
import s1.f;

/* loaded from: classes.dex */
public final class c0 implements c1.d1 {

    /* renamed from: a  reason: collision with root package name */
    private final y0 f54874a;

    /* renamed from: b  reason: collision with root package name */
    private x0.o f54875b;

    /* renamed from: c  reason: collision with root package name */
    public e0 f54876c;

    /* renamed from: d  reason: collision with root package name */
    private final f2.z f54877d;

    /* renamed from: e  reason: collision with root package name */
    private final o1.f f54878e;

    /* renamed from: f  reason: collision with root package name */
    private o1.f f54879f;

    /* loaded from: classes.dex */
    static final class a extends kotlin.jvm.internal.u implements h00.l<f2.o, vz.b0> {
        a() {
            super(1);
        }

        public final void a(f2.o it2) {
            x0.o oVar;
            kotlin.jvm.internal.s.g(it2, "it");
            c0.this.j().h(it2);
            if (x0.p.b(c0.this.f54875b, c0.this.j().f())) {
                long f11 = f2.p.f(it2);
                if (!s1.f.j(f11, c0.this.j().d()) && (oVar = c0.this.f54875b) != null) {
                    oVar.d(c0.this.j().f());
                }
                c0.this.j().k(f11);
            }
        }

        @Override // h00.l
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ vz.b0 mo12invoke(f2.o oVar) {
            a(oVar);
            return vz.b0.f54756a;
        }
    }

    /* loaded from: classes.dex */
    static final class b extends kotlin.jvm.internal.u implements h00.l<l2.v, vz.b0> {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public static final class a extends kotlin.jvm.internal.u implements h00.l<List<n2.w>, Boolean> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ c0 f54882a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(c0 c0Var) {
                super(1);
                this.f54882a = c0Var;
            }

            @Override // h00.l
            /* renamed from: a */
            public final Boolean mo12invoke(List<n2.w> it2) {
                boolean z11;
                kotlin.jvm.internal.s.g(it2, "it");
                if (this.f54882a.j().b() != null) {
                    n2.w b11 = this.f54882a.j().b();
                    kotlin.jvm.internal.s.e(b11);
                    it2.add(b11);
                    z11 = true;
                } else {
                    z11 = false;
                }
                return Boolean.valueOf(z11);
            }
        }

        b() {
            super(1);
        }

        @Override // h00.l
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ vz.b0 mo12invoke(l2.v vVar) {
            invoke2(vVar);
            return vz.b0.f54756a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(l2.v semantics) {
            kotlin.jvm.internal.s.g(semantics, "$this$semantics");
            l2.t.S(semantics, c0.this.j().g().k());
            l2.t.p(semantics, null, new a(c0.this), 1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class c extends kotlin.jvm.internal.u implements h00.l<v1.e, vz.b0> {
        c() {
            super(1);
        }

        public final void a(v1.e drawBehind) {
            Map<Long, x0.j> b11;
            kotlin.jvm.internal.s.g(drawBehind, "$this$drawBehind");
            n2.w b12 = c0.this.j().b();
            if (b12 == null) {
                return;
            }
            c0 c0Var = c0.this;
            x0.o oVar = c0Var.f54875b;
            x0.j jVar = (oVar == null || (b11 = oVar.b()) == null) ? null : b11.get(Long.valueOf(c0Var.j().f()));
            if (jVar != null) {
                if (!jVar.b()) {
                    jVar.c();
                    throw null;
                } else {
                    jVar.a();
                    throw null;
                }
            }
            d0.f54906k.a(drawBehind.j0().b(), b12);
        }

        @Override // h00.l
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ vz.b0 mo12invoke(v1.e eVar) {
            a(eVar);
            return vz.b0.f54756a;
        }
    }

    /* loaded from: classes.dex */
    public static final class d implements f2.z {

        /* loaded from: classes.dex */
        static final class a extends kotlin.jvm.internal.u implements h00.l<m0.a, vz.b0> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ List<vz.p<f2.m0, x2.k>> f54885a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(List<? extends vz.p<? extends f2.m0, x2.k>> list) {
                super(1);
                this.f54885a = list;
            }

            @Override // h00.l
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ vz.b0 mo12invoke(m0.a aVar) {
                invoke2(aVar);
                return vz.b0.f54756a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(m0.a layout) {
                kotlin.jvm.internal.s.g(layout, "$this$layout");
                List<vz.p<f2.m0, x2.k>> list = this.f54885a;
                int size = list.size();
                int i11 = 0;
                while (i11 < size) {
                    int i12 = i11 + 1;
                    vz.p<f2.m0, x2.k> pVar = list.get(i11);
                    m0.a.p(layout, pVar.c(), pVar.d().l(), BitmapDescriptorFactory.HUE_RED, 2, null);
                    i11 = i12;
                }
            }
        }

        d() {
        }

        @Override // f2.z
        public int a(f2.k kVar, List<? extends f2.j> measurables, int i11) {
            kotlin.jvm.internal.s.g(kVar, "<this>");
            kotlin.jvm.internal.s.g(measurables, "measurables");
            c0.this.j().g().n(kVar.getLayoutDirection());
            return c0.this.j().g().d();
        }

        @Override // f2.z
        public f2.a0 b(f2.b0 receiver, List<? extends f2.y> measurables, long j11) {
            int c11;
            int c12;
            Map<f2.a, Integer> l11;
            int i11;
            int c13;
            int c14;
            vz.p pVar;
            x0.o oVar;
            kotlin.jvm.internal.s.g(receiver, "$receiver");
            kotlin.jvm.internal.s.g(measurables, "measurables");
            n2.w l12 = c0.this.j().g().l(j11, receiver.getLayoutDirection(), c0.this.j().b());
            if (!kotlin.jvm.internal.s.c(c0.this.j().b(), l12)) {
                c0.this.j().c().mo12invoke(l12);
                n2.w b11 = c0.this.j().b();
                if (b11 != null) {
                    c0 c0Var = c0.this;
                    if (!kotlin.jvm.internal.s.c(b11.k().l(), l12.k().l()) && (oVar = c0Var.f54875b) != null) {
                        oVar.e(c0Var.j().f());
                    }
                }
            }
            c0.this.j().i(l12);
            if (measurables.size() >= l12.z().size()) {
                List<s1.h> z11 = l12.z();
                ArrayList arrayList = new ArrayList(z11.size());
                int size = z11.size();
                int i12 = 0;
                while (i12 < size) {
                    int i13 = i12 + 1;
                    s1.h hVar = z11.get(i12);
                    if (hVar == null) {
                        pVar = null;
                        i11 = size;
                    } else {
                        i11 = size;
                        f2.m0 X = measurables.get(i12).X(x2.c.b(0, (int) Math.floor(hVar.n()), 0, (int) Math.floor(hVar.h()), 5, null));
                        c13 = j00.c.c(hVar.i());
                        c14 = j00.c.c(hVar.l());
                        pVar = new vz.p(X, x2.k.b(x2.l.a(c13, c14)));
                    }
                    if (pVar != null) {
                        arrayList.add(pVar);
                    }
                    i12 = i13;
                    size = i11;
                }
                int g11 = x2.o.g(l12.A());
                int f11 = x2.o.f(l12.A());
                f2.i a11 = f2.b.a();
                c11 = j00.c.c(l12.g());
                f2.i b12 = f2.b.b();
                c12 = j00.c.c(l12.j());
                l11 = wz.s0.l(vz.v.a(a11, Integer.valueOf(c11)), vz.v.a(b12, Integer.valueOf(c12)));
                return receiver.I(g11, f11, l11, new a(arrayList));
            }
            throw new IllegalStateException("Check failed.".toString());
        }

        @Override // f2.z
        public int c(f2.k kVar, List<? extends f2.j> measurables, int i11) {
            kotlin.jvm.internal.s.g(kVar, "<this>");
            kotlin.jvm.internal.s.g(measurables, "measurables");
            c0.this.j().g().n(kVar.getLayoutDirection());
            return c0.this.j().g().b();
        }

        @Override // f2.z
        public int d(f2.k kVar, List<? extends f2.j> measurables, int i11) {
            kotlin.jvm.internal.s.g(kVar, "<this>");
            kotlin.jvm.internal.s.g(measurables, "measurables");
            return x2.o.f(d0.m(c0.this.j().g(), x2.c.a(0, i11, 0, Integer.MAX_VALUE), kVar.getLayoutDirection(), null, 4, null).A());
        }

        @Override // f2.z
        public int e(f2.k kVar, List<? extends f2.j> measurables, int i11) {
            kotlin.jvm.internal.s.g(kVar, "<this>");
            kotlin.jvm.internal.s.g(measurables, "measurables");
            return x2.o.f(d0.m(c0.this.j().g(), x2.c.a(0, i11, 0, Integer.MAX_VALUE), kVar.getLayoutDirection(), null, 4, null).A());
        }
    }

    /* loaded from: classes.dex */
    static final class e extends kotlin.jvm.internal.u implements h00.a<f2.o> {
        e() {
            super(0);
        }

        @Override // h00.a
        /* renamed from: a */
        public final f2.o mo11invoke() {
            return c0.this.j().a();
        }
    }

    /* loaded from: classes.dex */
    static final class f extends kotlin.jvm.internal.u implements h00.a<n2.w> {
        f() {
            super(0);
        }

        @Override // h00.a
        /* renamed from: a */
        public final n2.w mo11invoke() {
            return c0.this.j().b();
        }
    }

    /* loaded from: classes.dex */
    public static final class g implements e0 {

        /* renamed from: a  reason: collision with root package name */
        private long f54888a;

        /* renamed from: b  reason: collision with root package name */
        private long f54889b;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ x0.o f54891d;

        g(x0.o oVar) {
            this.f54891d = oVar;
            f.a aVar = s1.f.f49950b;
            this.f54888a = aVar.c();
            this.f54889b = aVar.c();
        }

        @Override // w0.e0
        public void a(long j11) {
            f2.o a11 = c0.this.j().a();
            if (a11 != null) {
                c0 c0Var = c0.this;
                x0.o oVar = this.f54891d;
                if (!a11.h()) {
                    return;
                }
                if (c0Var.k(j11, j11)) {
                    oVar.i(c0Var.j().f());
                } else {
                    oVar.h(a11, j11, x0.k.f56574a.g());
                }
                f(j11);
            }
            if (x0.p.b(this.f54891d, c0.this.j().f())) {
                this.f54889b = s1.f.f49950b.c();
            }
        }

        @Override // w0.e0
        public void b(long j11) {
            f2.o a11 = c0.this.j().a();
            if (a11 == null) {
                return;
            }
            x0.o oVar = this.f54891d;
            c0 c0Var = c0.this;
            if (a11.h() && x0.p.b(oVar, c0Var.j().f())) {
                e(s1.f.q(c(), j11));
                long q11 = s1.f.q(d(), c());
                if (c0Var.k(d(), q11) || !oVar.c(a11, q11, d(), false, x0.k.f56574a.d())) {
                    return;
                }
                f(q11);
                e(s1.f.f49950b.c());
            }
        }

        public final long c() {
            return this.f54889b;
        }

        public final long d() {
            return this.f54888a;
        }

        public final void e(long j11) {
            this.f54889b = j11;
        }

        public final void f(long j11) {
            this.f54888a = j11;
        }

        @Override // w0.e0
        public void onCancel() {
            if (x0.p.b(this.f54891d, c0.this.j().f())) {
                this.f54891d.j();
            }
        }

        @Override // w0.e0
        public void onStop() {
            if (x0.p.b(this.f54891d, c0.this.j().f())) {
                this.f54891d.j();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.TextController$update$2", f = "CoreText.kt", l = {CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA384}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class h extends kotlin.coroutines.jvm.internal.l implements h00.p<d2.c0, zz.d<? super vz.b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f54892a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f54893b;

        h(zz.d<? super h> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
            h hVar = new h(dVar);
            hVar.f54893b = obj;
            return hVar;
        }

        @Override // h00.p
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Object mo160invoke(d2.c0 c0Var, zz.d<? super vz.b0> dVar) {
            return ((h) create(c0Var, dVar)).invokeSuspend(vz.b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d11;
            d11 = a00.d.d();
            int i11 = this.f54892a;
            if (i11 == 0) {
                vz.r.b(obj);
                e0 g11 = c0.this.g();
                this.f54892a = 1;
                if (w.a((d2.c0) this.f54893b, g11, this) == d11) {
                    return d11;
                }
            } else if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                vz.r.b(obj);
            }
            return vz.b0.f54756a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.TextController$update$3", f = "CoreText.kt", l = {270}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class i extends kotlin.coroutines.jvm.internal.l implements h00.p<d2.c0, zz.d<? super vz.b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f54895a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f54896b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ j f54897c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(j jVar, zz.d<? super i> dVar) {
            super(2, dVar);
            this.f54897c = jVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
            i iVar = new i(this.f54897c, dVar);
            iVar.f54896b = obj;
            return iVar;
        }

        @Override // h00.p
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Object mo160invoke(d2.c0 c0Var, zz.d<? super vz.b0> dVar) {
            return ((i) create(c0Var, dVar)).invokeSuspend(vz.b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d11;
            d11 = a00.d.d();
            int i11 = this.f54895a;
            if (i11 == 0) {
                vz.r.b(obj);
                j jVar = this.f54897c;
                this.f54895a = 1;
                if (x0.a0.c((d2.c0) this.f54896b, jVar, this) == d11) {
                    return d11;
                }
            } else if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                vz.r.b(obj);
            }
            return vz.b0.f54756a;
        }
    }

    /* loaded from: classes.dex */
    public static final class j implements x0.g {

        /* renamed from: a  reason: collision with root package name */
        private long f54898a = s1.f.f49950b.c();

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ x0.o f54900c;

        j(x0.o oVar) {
            this.f54900c = oVar;
        }

        @Override // x0.g
        public boolean a(long j11, x0.k adjustment) {
            kotlin.jvm.internal.s.g(adjustment, "adjustment");
            f2.o a11 = c0.this.j().a();
            if (a11 == null) {
                return false;
            }
            x0.o oVar = this.f54900c;
            c0 c0Var = c0.this;
            if (a11.h()) {
                oVar.h(a11, j11, adjustment);
                f(j11);
                return x0.p.b(oVar, c0Var.j().f());
            }
            return false;
        }

        @Override // x0.g
        public boolean b(long j11, x0.k adjustment) {
            kotlin.jvm.internal.s.g(adjustment, "adjustment");
            f2.o a11 = c0.this.j().a();
            if (a11 != null) {
                x0.o oVar = this.f54900c;
                c0 c0Var = c0.this;
                if (!a11.h() || !x0.p.b(oVar, c0Var.j().f())) {
                    return false;
                }
                if (oVar.c(a11, j11, e(), false, adjustment)) {
                    f(j11);
                }
            }
            return true;
        }

        @Override // x0.g
        public boolean c(long j11) {
            f2.o a11 = c0.this.j().a();
            if (a11 == null) {
                return true;
            }
            x0.o oVar = this.f54900c;
            c0 c0Var = c0.this;
            if (a11.h() && x0.p.b(oVar, c0Var.j().f())) {
                if (oVar.c(a11, j11, e(), false, x0.k.f56574a.e())) {
                    f(j11);
                    return true;
                }
                return true;
            }
            return false;
        }

        @Override // x0.g
        public boolean d(long j11) {
            f2.o a11 = c0.this.j().a();
            if (a11 == null) {
                return false;
            }
            x0.o oVar = this.f54900c;
            c0 c0Var = c0.this;
            if (a11.h()) {
                if (oVar.c(a11, j11, e(), false, x0.k.f56574a.e())) {
                    f(j11);
                }
                return x0.p.b(oVar, c0Var.j().f());
            }
            return false;
        }

        public final long e() {
            return this.f54898a;
        }

        public final void f(long j11) {
            this.f54898a = j11;
        }
    }

    public c0(y0 state) {
        kotlin.jvm.internal.s.g(state, "state");
        this.f54874a = state;
        this.f54877d = new d();
        f.a aVar = o1.f.f42062f1;
        this.f54878e = l2.o.b(f2.g0.a(f(aVar), new a()), false, new b(), 1, null);
        this.f54879f = aVar;
    }

    private final o1.f f(o1.f fVar) {
        return q1.i.a(t1.f0.c(fVar, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0L, null, false, null, 16383, null), new c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean k(long j11, long j12) {
        n2.w b11 = this.f54874a.b();
        if (b11 == null) {
            return false;
        }
        int length = b11.k().l().g().length();
        int w11 = b11.w(j11);
        int w12 = b11.w(j12);
        int i11 = length - 1;
        return (w11 >= i11 && w12 >= i11) || (w11 < 0 && w12 < 0);
    }

    @Override // c1.d1
    public void b() {
        x0.o oVar = this.f54875b;
        if (oVar == null) {
            return;
        }
        j().l(oVar.f(new x0.h(j().f(), new e(), new f())));
    }

    @Override // c1.d1
    public void d() {
        x0.o oVar;
        x0.i e11 = this.f54874a.e();
        if (e11 == null || (oVar = this.f54875b) == null) {
            return;
        }
        oVar.g(e11);
    }

    @Override // c1.d1
    public void e() {
        x0.o oVar;
        x0.i e11 = this.f54874a.e();
        if (e11 == null || (oVar = this.f54875b) == null) {
            return;
        }
        oVar.g(e11);
    }

    public final e0 g() {
        e0 e0Var = this.f54876c;
        if (e0Var != null) {
            return e0Var;
        }
        kotlin.jvm.internal.s.x("longPressDragObserver");
        return null;
    }

    public final f2.z h() {
        return this.f54877d;
    }

    public final o1.f i() {
        return this.f54878e.g0(this.f54879f);
    }

    public final y0 j() {
        return this.f54874a;
    }

    public final void l(e0 e0Var) {
        kotlin.jvm.internal.s.g(e0Var, "<set-?>");
        this.f54876c = e0Var;
    }

    public final void m(x0.o oVar) {
        o1.f fVar;
        this.f54875b = oVar;
        if (oVar != null) {
            if (z0.a()) {
                l(new g(oVar));
                fVar = d2.i0.b(o1.f.f42062f1, g(), new h(null));
            } else {
                j jVar = new j(oVar);
                fVar = d2.q.b(d2.i0.b(o1.f.f42062f1, jVar, new i(jVar, null)), x0.a(), false, 2, null);
            }
        } else {
            fVar = o1.f.f42062f1;
        }
        this.f54879f = fVar;
    }
}