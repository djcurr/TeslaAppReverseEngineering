package w0;

import android.view.KeyEvent;
import androidx.compose.ui.platform.y1;
import c1.a2;
import c1.e1;
import c1.g1;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import f2.m0;
import f2.z;
import h2.a;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o1.f;
import w0.g0;

/* loaded from: classes.dex */
public final class g {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class a extends kotlin.jvm.internal.u implements h00.l<n2.w, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f54944a = new a();

        a() {
            super(1);
        }

        @Override // h00.l
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ vz.b0 mo12invoke(n2.w wVar) {
            invoke2(wVar);
            return vz.b0.f54756a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(n2.w it2) {
            kotlin.jvm.internal.s.g(it2, "it");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends kotlin.jvm.internal.u implements h00.l<c1.z, c1.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ x0.t f54945a;

        /* loaded from: classes.dex */
        public static final class a implements c1.y {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ x0.t f54946a;

            public a(x0.t tVar) {
                this.f54946a = tVar;
            }

            @Override // c1.y
            public void dispose() {
                this.f54946a.E();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(x0.t tVar) {
            super(1);
            this.f54945a = tVar;
        }

        @Override // h00.l
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final c1.y mo12invoke(c1.z DisposableEffect) {
            kotlin.jvm.internal.s.g(DisposableEffect, "$this$DisposableEffect");
            return new a(this.f54945a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class c extends kotlin.jvm.internal.u implements h00.l<c1.z, c1.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ s2.c0 f54947a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ t0 f54948b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ s2.a0 f54949c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ s2.m f54950d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ h00.l<s2.a0, vz.b0> f54951e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ h00.l<s2.l, vz.b0> f54952f;

        /* loaded from: classes.dex */
        public static final class a implements c1.y {
            @Override // c1.y
            public void dispose() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(s2.c0 c0Var, t0 t0Var, s2.a0 a0Var, s2.m mVar, h00.l<? super s2.a0, vz.b0> lVar, h00.l<? super s2.l, vz.b0> lVar2) {
            super(1);
            this.f54947a = c0Var;
            this.f54948b = t0Var;
            this.f54949c = a0Var;
            this.f54950d = mVar;
            this.f54951e = lVar;
            this.f54952f = lVar2;
        }

        @Override // h00.l
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final c1.y mo12invoke(c1.z DisposableEffect) {
            kotlin.jvm.internal.s.g(DisposableEffect, "$this$DisposableEffect");
            if (this.f54947a != null && this.f54948b.c()) {
                t0 t0Var = this.f54948b;
                t0Var.r(g0.f55056a.i(this.f54947a, this.f54949c, t0Var.i(), this.f54950d, this.f54951e, this.f54952f));
            }
            return new a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class d extends kotlin.jvm.internal.u implements h00.p<c1.i, Integer, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f54953a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ n2.a0 f54954b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ q0 f54955c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ s2.a0 f54956d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ s2.k0 f54957e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ o1.f f54958f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ o1.f f54959g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ o1.f f54960h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ o1.f f54961i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ t0 f54962j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ x0.t f54963k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ boolean f54964l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ boolean f54965m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ h00.l<n2.w, vz.b0> f54966n;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public static final class a extends kotlin.jvm.internal.u implements h00.p<c1.i, Integer, vz.b0> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ x0.t f54967a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ t0 f54968b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ boolean f54969c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ boolean f54970d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ h00.l<n2.w, vz.b0> f54971e;

            /* renamed from: w0.g$d$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C1243a implements f2.z {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ t0 f54972a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ h00.l<n2.w, vz.b0> f54973b;

                /* renamed from: w0.g$d$a$a$a  reason: collision with other inner class name */
                /* loaded from: classes.dex */
                static final class C1244a extends kotlin.jvm.internal.u implements h00.l<m0.a, vz.b0> {

                    /* renamed from: a  reason: collision with root package name */
                    public static final C1244a f54974a = new C1244a();

                    C1244a() {
                        super(1);
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
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                C1243a(t0 t0Var, h00.l<? super n2.w, vz.b0> lVar) {
                    this.f54972a = t0Var;
                    this.f54973b = lVar;
                }

                @Override // f2.z
                public int a(f2.k kVar, List<? extends f2.j> list, int i11) {
                    return z.a.d(this, kVar, list, i11);
                }

                @Override // f2.z
                public f2.a0 b(f2.b0 receiver, List<? extends f2.y> measurables, long j11) {
                    int c11;
                    int c12;
                    Map<f2.a, Integer> l11;
                    kotlin.jvm.internal.s.g(receiver, "$receiver");
                    kotlin.jvm.internal.s.g(measurables, "measurables");
                    g0.a aVar = g0.f55056a;
                    d0 n11 = this.f54972a.n();
                    x2.q layoutDirection = receiver.getLayoutDirection();
                    v0 g11 = this.f54972a.g();
                    vz.u<Integer, Integer, n2.w> d11 = aVar.d(n11, j11, layoutDirection, g11 == null ? null : g11.i());
                    int intValue = d11.a().intValue();
                    int intValue2 = d11.b().intValue();
                    n2.w c13 = d11.c();
                    v0 g12 = this.f54972a.g();
                    if (!kotlin.jvm.internal.s.c(g12 != null ? g12.i() : null, c13)) {
                        this.f54972a.t(new v0(c13));
                        this.f54973b.mo12invoke(c13);
                    }
                    f2.i a11 = f2.b.a();
                    c11 = j00.c.c(c13.g());
                    f2.i b11 = f2.b.b();
                    c12 = j00.c.c(c13.j());
                    l11 = wz.s0.l(vz.v.a(a11, Integer.valueOf(c11)), vz.v.a(b11, Integer.valueOf(c12)));
                    return receiver.I(intValue, intValue2, l11, C1244a.f54974a);
                }

                @Override // f2.z
                public int c(f2.k kVar, List<? extends f2.j> measurables, int i11) {
                    kotlin.jvm.internal.s.g(kVar, "<this>");
                    kotlin.jvm.internal.s.g(measurables, "measurables");
                    this.f54972a.n().n(kVar.getLayoutDirection());
                    return this.f54972a.n().b();
                }

                @Override // f2.z
                public int d(f2.k kVar, List<? extends f2.j> list, int i11) {
                    return z.a.a(this, kVar, list, i11);
                }

                @Override // f2.z
                public int e(f2.k kVar, List<? extends f2.j> list, int i11) {
                    return z.a.c(this, kVar, list, i11);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(x0.t tVar, t0 t0Var, boolean z11, boolean z12, h00.l<? super n2.w, vz.b0> lVar) {
                super(2);
                this.f54967a = tVar;
                this.f54968b = t0Var;
                this.f54969c = z11;
                this.f54970d = z12;
                this.f54971e = lVar;
            }

            @Override // h00.p
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ vz.b0 mo160invoke(c1.i iVar, Integer num) {
                invoke(iVar, num.intValue());
                return vz.b0.f54756a;
            }

            public final void invoke(c1.i iVar, int i11) {
                if (((i11 & 11) ^ 2) == 0 && iVar.i()) {
                    iVar.G();
                    return;
                }
                C1243a c1243a = new C1243a(this.f54968b, this.f54971e);
                iVar.x(1376089394);
                f.a aVar = o1.f.f42062f1;
                x2.d dVar = (x2.d) iVar.A(androidx.compose.ui.platform.l0.d());
                x2.q qVar = (x2.q) iVar.A(androidx.compose.ui.platform.l0.i());
                y1 y1Var = (y1) iVar.A(androidx.compose.ui.platform.l0.m());
                a.C0551a c0551a = h2.a.Y0;
                h00.a<h2.a> a11 = c0551a.a();
                h00.q<g1<h2.a>, c1.i, Integer, vz.b0> b11 = f2.u.b(aVar);
                if (!(iVar.k() instanceof c1.e)) {
                    c1.h.c();
                }
                iVar.D();
                if (iVar.f()) {
                    iVar.s(a11);
                } else {
                    iVar.o();
                }
                iVar.E();
                c1.i a12 = a2.a(iVar);
                a2.c(a12, c1243a, c0551a.d());
                a2.c(a12, dVar, c0551a.b());
                a2.c(a12, qVar, c0551a.c());
                a2.c(a12, y1Var, c0551a.f());
                iVar.c();
                boolean z11 = false;
                b11.invoke(g1.a(g1.b(iVar)), iVar, 0);
                iVar.x(2058660585);
                iVar.x(1017239479);
                iVar.N();
                iVar.N();
                iVar.q();
                iVar.N();
                x0.t tVar = this.f54967a;
                if (this.f54968b.b() == w0.j.Selection && this.f54968b.f() != null) {
                    f2.o f11 = this.f54968b.f();
                    kotlin.jvm.internal.s.e(f11);
                    if (f11.h() && this.f54969c) {
                        z11 = true;
                    }
                }
                g.b(tVar, z11, iVar, 8);
                if (this.f54968b.b() == w0.j.Cursor && !this.f54970d && this.f54969c) {
                    g.c(this.f54967a, iVar, 8);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public static final class b extends kotlin.jvm.internal.u implements h00.a<v0> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ t0 f54975a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(t0 t0Var) {
                super(0);
                this.f54975a = t0Var;
            }

            @Override // h00.a
            /* renamed from: a */
            public final v0 mo11invoke() {
                return this.f54975a.g();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(int i11, n2.a0 a0Var, q0 q0Var, s2.a0 a0Var2, s2.k0 k0Var, o1.f fVar, o1.f fVar2, o1.f fVar3, o1.f fVar4, t0 t0Var, x0.t tVar, boolean z11, boolean z12, h00.l<? super n2.w, vz.b0> lVar) {
            super(2);
            this.f54953a = i11;
            this.f54954b = a0Var;
            this.f54955c = q0Var;
            this.f54956d = a0Var2;
            this.f54957e = k0Var;
            this.f54958f = fVar;
            this.f54959g = fVar2;
            this.f54960h = fVar3;
            this.f54961i = fVar4;
            this.f54962j = t0Var;
            this.f54963k = tVar;
            this.f54964l = z11;
            this.f54965m = z12;
            this.f54966n = lVar;
        }

        @Override // h00.p
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ vz.b0 mo160invoke(c1.i iVar, Integer num) {
            invoke(iVar, num.intValue());
            return vz.b0.f54756a;
        }

        public final void invoke(c1.i iVar, int i11) {
            if (((i11 & 11) ^ 2) == 0 && iVar.i()) {
                iVar.G();
            } else {
                x0.q.a(s0.a(p0.c(y.a(o1.f.f42062f1, this.f54953a, this.f54954b), this.f54955c, this.f54956d, this.f54957e, new b(this.f54962j)).g0(this.f54958f).g0(this.f54959g), this.f54954b).g0(this.f54960h).g0(this.f54961i), j1.c.b(iVar, -819904786, true, new a(this.f54963k, this.f54962j, this.f54964l, this.f54965m, this.f54966n)), iVar, 48, 0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class e extends kotlin.jvm.internal.u implements h00.p<c1.i, Integer, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ s2.a0 f54976a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h00.l<s2.a0, vz.b0> f54977b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ o1.f f54978c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ n2.a0 f54979d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ s2.k0 f54980e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ h00.l<n2.w, vz.b0> f54981f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ o0.m f54982g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ t1.s f54983h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ boolean f54984i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ int f54985j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ s2.m f54986k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ u f54987l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ boolean f54988m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ boolean f54989n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ h00.q<h00.p<? super c1.i, ? super Integer, vz.b0>, c1.i, Integer, vz.b0> f54990o;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ int f54991p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ int f54992q;

        /* renamed from: t  reason: collision with root package name */
        final /* synthetic */ int f54993t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(s2.a0 a0Var, h00.l<? super s2.a0, vz.b0> lVar, o1.f fVar, n2.a0 a0Var2, s2.k0 k0Var, h00.l<? super n2.w, vz.b0> lVar2, o0.m mVar, t1.s sVar, boolean z11, int i11, s2.m mVar2, u uVar, boolean z12, boolean z13, h00.q<? super h00.p<? super c1.i, ? super Integer, vz.b0>, ? super c1.i, ? super Integer, vz.b0> qVar, int i12, int i13, int i14) {
            super(2);
            this.f54976a = a0Var;
            this.f54977b = lVar;
            this.f54978c = fVar;
            this.f54979d = a0Var2;
            this.f54980e = k0Var;
            this.f54981f = lVar2;
            this.f54982g = mVar;
            this.f54983h = sVar;
            this.f54984i = z11;
            this.f54985j = i11;
            this.f54986k = mVar2;
            this.f54987l = uVar;
            this.f54988m = z12;
            this.f54989n = z13;
            this.f54990o = qVar;
            this.f54991p = i12;
            this.f54992q = i13;
            this.f54993t = i14;
        }

        @Override // h00.p
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ vz.b0 mo160invoke(c1.i iVar, Integer num) {
            invoke(iVar, num.intValue());
            return vz.b0.f54756a;
        }

        public final void invoke(c1.i iVar, int i11) {
            g.a(this.f54976a, this.f54977b, this.f54978c, this.f54979d, this.f54980e, this.f54981f, this.f54982g, this.f54983h, this.f54984i, this.f54985j, this.f54986k, this.f54987l, this.f54988m, this.f54989n, this.f54990o, iVar, this.f54991p | 1, this.f54992q, this.f54993t);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class f extends kotlin.jvm.internal.u implements h00.l<f2.o, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ t0 f54994a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(t0 t0Var) {
            super(1);
            this.f54994a = t0Var;
        }

        public final void a(f2.o it2) {
            kotlin.jvm.internal.s.g(it2, "it");
            v0 g11 = this.f54994a.g();
            if (g11 == null) {
                return;
            }
            g11.l(it2);
        }

        @Override // h00.l
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ vz.b0 mo12invoke(f2.o oVar) {
            a(oVar);
            return vz.b0.f54756a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w0.g$g  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C1245g extends kotlin.jvm.internal.u implements h00.l<v1.e, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ t0 f54995a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ s2.a0 f54996b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ s2.t f54997c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1245g(t0 t0Var, s2.a0 a0Var, s2.t tVar) {
            super(1);
            this.f54995a = t0Var;
            this.f54996b = a0Var;
            this.f54997c = tVar;
        }

        public final void a(v1.e drawBehind) {
            kotlin.jvm.internal.s.g(drawBehind, "$this$drawBehind");
            v0 g11 = this.f54995a.g();
            if (g11 == null) {
                return;
            }
            s2.a0 a0Var = this.f54996b;
            s2.t tVar = this.f54997c;
            t0 t0Var = this.f54995a;
            g0.f55056a.c(drawBehind.j0().b(), a0Var, tVar, g11.i(), t0Var.j());
        }

        @Override // h00.l
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ vz.b0 mo12invoke(v1.e eVar) {
            a(eVar);
            return vz.b0.f54756a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class h extends kotlin.jvm.internal.u implements h00.l<r1.w, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ t0 f54998a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ s2.c0 f54999b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ s2.a0 f55000c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ s2.m f55001d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ h00.l<s2.a0, vz.b0> f55002e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ h00.l<s2.l, vz.b0> f55003f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ s2.t f55004g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ x0.t f55005h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        h(t0 t0Var, s2.c0 c0Var, s2.a0 a0Var, s2.m mVar, h00.l<? super s2.a0, vz.b0> lVar, h00.l<? super s2.l, vz.b0> lVar2, s2.t tVar, x0.t tVar2) {
            super(1);
            this.f54998a = t0Var;
            this.f54999b = c0Var;
            this.f55000c = a0Var;
            this.f55001d = mVar;
            this.f55002e = lVar;
            this.f55003f = lVar2;
            this.f55004g = tVar;
            this.f55005h = tVar2;
        }

        @Override // h00.l
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ vz.b0 mo12invoke(r1.w wVar) {
            invoke2(wVar);
            return vz.b0.f54756a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(r1.w it2) {
            kotlin.jvm.internal.s.g(it2, "it");
            if (this.f54998a.c() == it2.isFocused()) {
                return;
            }
            this.f54998a.q(it2.isFocused());
            s2.c0 c0Var = this.f54999b;
            if (c0Var != null) {
                g.g(c0Var, this.f54998a, this.f55000c, this.f55001d, this.f55002e, this.f55003f, this.f55004g);
            }
            if (it2.isFocused()) {
                return;
            }
            x0.t.o(this.f55005h, null, 1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class i extends kotlin.jvm.internal.u implements h00.l<s2.l, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ t0 f55006a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(t0 t0Var) {
            super(1);
            this.f55006a = t0Var;
        }

        public final void a(int i11) {
            this.f55006a.e().d(i11);
        }

        @Override // h00.l
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ vz.b0 mo12invoke(s2.l lVar) {
            a(lVar.o());
            return vz.b0.f54756a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class j extends kotlin.jvm.internal.u implements h00.l<f2.o, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ s2.c0 f55007a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ t0 f55008b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ x0.t f55009c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ s2.a0 f55010d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ s2.t f55011e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(s2.c0 c0Var, t0 t0Var, x0.t tVar, s2.a0 a0Var, s2.t tVar2) {
            super(1);
            this.f55007a = c0Var;
            this.f55008b = t0Var;
            this.f55009c = tVar;
            this.f55010d = a0Var;
            this.f55011e = tVar2;
        }

        public final void a(f2.o it2) {
            kotlin.jvm.internal.s.g(it2, "it");
            if (this.f55007a != null) {
                this.f55008b.s(it2);
                if (this.f55008b.b() == w0.j.Selection) {
                    if (this.f55008b.k()) {
                        this.f55009c.T();
                    } else {
                        this.f55009c.E();
                    }
                    this.f55008b.w(x0.u.b(this.f55009c, true));
                    this.f55008b.v(x0.u.b(this.f55009c, false));
                }
                v0 g11 = this.f55008b.g();
                if (g11 != null) {
                    t0 t0Var = this.f55008b;
                    s2.a0 a0Var = this.f55010d;
                    s2.t tVar = this.f55011e;
                    s2.h0 d11 = t0Var.d();
                    if (d11 != null) {
                        g0.f55056a.e(a0Var, t0Var.n(), g11.i(), it2, d11, t0Var.c(), tVar);
                    }
                }
            }
            v0 g12 = this.f55008b.g();
            if (g12 == null) {
                return;
            }
            g12.m(it2);
        }

        @Override // h00.l
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ vz.b0 mo12invoke(f2.o oVar) {
            a(oVar);
            return vz.b0.f54756a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class k extends kotlin.jvm.internal.u implements h00.l<s2.a0, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ t0 f55012a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c1.y0 f55013b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(t0 t0Var, c1.y0 y0Var) {
            super(1);
            this.f55012a = t0Var;
            this.f55013b = y0Var;
        }

        @Override // h00.l
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ vz.b0 mo12invoke(s2.a0 a0Var) {
            invoke2(a0Var);
            return vz.b0.f54756a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(s2.a0 it2) {
            kotlin.jvm.internal.s.g(it2, "it");
            if (!kotlin.jvm.internal.s.c(it2.h(), this.f55012a.n().k().g())) {
                this.f55012a.p(w0.j.None);
            }
            this.f55012a.h().mo12invoke(it2);
            this.f55013b.invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class l extends kotlin.jvm.internal.u implements h00.l<s1.f, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ t0 f55014a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ r1.s f55015b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f55016c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ x0.t f55017d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ s2.t f55018e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ h00.l<s2.a0, vz.b0> f55019f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        l(t0 t0Var, r1.s sVar, boolean z11, x0.t tVar, s2.t tVar2, h00.l<? super s2.a0, vz.b0> lVar) {
            super(1);
            this.f55014a = t0Var;
            this.f55015b = sVar;
            this.f55016c = z11;
            this.f55017d = tVar;
            this.f55018e = tVar2;
            this.f55019f = lVar;
        }

        @Override // h00.l
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ vz.b0 mo12invoke(s1.f fVar) {
            m1117invokek4lQ0M(fVar.t());
            return vz.b0.f54756a;
        }

        /* renamed from: invoke-k-4lQ0M  reason: not valid java name */
        public final void m1117invokek4lQ0M(long j11) {
            g.i(this.f55014a, this.f55015b, !this.f55016c);
            if (this.f55014a.c()) {
                if (this.f55014a.b() != w0.j.Selection) {
                    v0 g11 = this.f55014a.g();
                    if (g11 == null) {
                        return;
                    }
                    t0 t0Var = this.f55014a;
                    g0.f55056a.j(j11, g11, t0Var.i(), this.f55018e, this.f55019f);
                    if (t0Var.n().k().length() > 0) {
                        t0Var.p(w0.j.Cursor);
                        return;
                    }
                    return;
                }
                this.f55017d.n(s1.f.d(j11));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class m extends kotlin.jvm.internal.u implements h00.a<q0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.gestures.a f55020a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(androidx.compose.foundation.gestures.a aVar) {
            super(0);
            this.f55020a = aVar;
        }

        @Override // h00.a
        /* renamed from: a */
        public final q0 mo11invoke() {
            return new q0(this.f55020a, BitmapDescriptorFactory.HUE_RED, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class n extends kotlin.jvm.internal.u implements h00.l<l2.v, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ s2.m f55021a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ s2.i0 f55022b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ s2.a0 f55023c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f55024d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ boolean f55025e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ boolean f55026f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ t0 f55027g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ h00.l<s2.a0, vz.b0> f55028h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ s2.t f55029i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ x0.t f55030j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ r1.s f55031k;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public static final class a extends kotlin.jvm.internal.u implements h00.l<List<n2.w>, Boolean> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ t0 f55032a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(t0 t0Var) {
                super(1);
                this.f55032a = t0Var;
            }

            @Override // h00.l
            /* renamed from: a */
            public final Boolean mo12invoke(List<n2.w> it2) {
                boolean z11;
                kotlin.jvm.internal.s.g(it2, "it");
                if (this.f55032a.g() != null) {
                    v0 g11 = this.f55032a.g();
                    kotlin.jvm.internal.s.e(g11);
                    it2.add(g11.i());
                    z11 = true;
                } else {
                    z11 = false;
                }
                return Boolean.valueOf(z11);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public static final class b extends kotlin.jvm.internal.u implements h00.l<n2.a, Boolean> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ h00.l<s2.a0, vz.b0> f55033a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            b(h00.l<? super s2.a0, vz.b0> lVar) {
                super(1);
                this.f55033a = lVar;
            }

            @Override // h00.l
            /* renamed from: a */
            public final Boolean mo12invoke(n2.a it2) {
                kotlin.jvm.internal.s.g(it2, "it");
                this.f55033a.mo12invoke(new s2.a0(it2.g(), n2.z.a(it2.g().length()), (n2.y) null, 4, (DefaultConstructorMarker) null));
                return Boolean.TRUE;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public static final class c extends kotlin.jvm.internal.u implements h00.q<Integer, Integer, Boolean, Boolean> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ s2.t f55034a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ boolean f55035b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ s2.a0 f55036c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ x0.t f55037d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ h00.l<s2.a0, vz.b0> f55038e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            c(s2.t tVar, boolean z11, s2.a0 a0Var, x0.t tVar2, h00.l<? super s2.a0, vz.b0> lVar) {
                super(3);
                this.f55034a = tVar;
                this.f55035b = z11;
                this.f55036c = a0Var;
                this.f55037d = tVar2;
                this.f55038e = lVar;
            }

            public final Boolean a(int i11, int i12, boolean z11) {
                int i13;
                int d11;
                if (!z11) {
                    i11 = this.f55034a.transformedToOriginal(i11);
                }
                if (!z11) {
                    i12 = this.f55034a.transformedToOriginal(i12);
                }
                boolean z12 = false;
                if (this.f55035b && (i11 != n2.y.n(this.f55036c.g()) || i12 != n2.y.i(this.f55036c.g()))) {
                    i13 = m00.l.i(i11, i12);
                    if (i13 >= 0) {
                        d11 = m00.l.d(i11, i12);
                        if (d11 <= this.f55036c.e().length()) {
                            if (!z11 && i11 != i12) {
                                this.f55037d.p();
                            } else {
                                this.f55037d.q();
                            }
                            this.f55038e.mo12invoke(new s2.a0(this.f55036c.e(), n2.z.b(i11, i12), (n2.y) null, 4, (DefaultConstructorMarker) null));
                            z12 = true;
                        }
                    }
                    this.f55037d.q();
                }
                return Boolean.valueOf(z12);
            }

            @Override // h00.q
            public /* bridge */ /* synthetic */ Boolean invoke(Integer num, Integer num2, Boolean bool) {
                return a(num.intValue(), num2.intValue(), bool.booleanValue());
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public static final class d extends kotlin.jvm.internal.u implements h00.a<Boolean> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ t0 f55039a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ r1.s f55040b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ boolean f55041c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(t0 t0Var, r1.s sVar, boolean z11) {
                super(0);
                this.f55039a = t0Var;
                this.f55040b = sVar;
                this.f55041c = z11;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // h00.a
            /* renamed from: invoke */
            public final Boolean mo11invoke() {
                g.i(this.f55039a, this.f55040b, !this.f55041c);
                return Boolean.TRUE;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public static final class e extends kotlin.jvm.internal.u implements h00.a<Boolean> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ x0.t f55042a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            e(x0.t tVar) {
                super(0);
                this.f55042a = tVar;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // h00.a
            /* renamed from: invoke */
            public final Boolean mo11invoke() {
                this.f55042a.p();
                return Boolean.TRUE;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public static final class f extends kotlin.jvm.internal.u implements h00.a<Boolean> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ x0.t f55043a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            f(x0.t tVar) {
                super(0);
                this.f55043a = tVar;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // h00.a
            /* renamed from: invoke */
            public final Boolean mo11invoke() {
                x0.t.j(this.f55043a, false, 1, null);
                return Boolean.TRUE;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: w0.g$n$g  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C1246g extends kotlin.jvm.internal.u implements h00.a<Boolean> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ x0.t f55044a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1246g(x0.t tVar) {
                super(0);
                this.f55044a = tVar;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // h00.a
            /* renamed from: invoke */
            public final Boolean mo11invoke() {
                this.f55044a.m();
                return Boolean.TRUE;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public static final class h extends kotlin.jvm.internal.u implements h00.a<Boolean> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ x0.t f55045a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            h(x0.t tVar) {
                super(0);
                this.f55045a = tVar;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // h00.a
            /* renamed from: invoke */
            public final Boolean mo11invoke() {
                this.f55045a.G();
                return Boolean.TRUE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        n(s2.m mVar, s2.i0 i0Var, s2.a0 a0Var, boolean z11, boolean z12, boolean z13, t0 t0Var, h00.l<? super s2.a0, vz.b0> lVar, s2.t tVar, x0.t tVar2, r1.s sVar) {
            super(1);
            this.f55021a = mVar;
            this.f55022b = i0Var;
            this.f55023c = a0Var;
            this.f55024d = z11;
            this.f55025e = z12;
            this.f55026f = z13;
            this.f55027g = t0Var;
            this.f55028h = lVar;
            this.f55029i = tVar;
            this.f55030j = tVar2;
            this.f55031k = sVar;
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
            l2.t.J(semantics, this.f55021a.d());
            l2.t.G(semantics, this.f55022b.b());
            l2.t.U(semantics, this.f55023c.g());
            if (!this.f55024d) {
                l2.t.i(semantics);
            }
            if (this.f55025e) {
                l2.t.w(semantics);
            }
            l2.t.p(semantics, null, new a(this.f55027g), 1, null);
            l2.t.T(semantics, null, new b(this.f55028h), 1, null);
            l2.t.O(semantics, null, new c(this.f55029i, this.f55024d, this.f55023c, this.f55030j, this.f55028h), 1, null);
            l2.t.t(semantics, null, new d(this.f55027g, this.f55031k, this.f55026f), 1, null);
            l2.t.v(semantics, null, new e(this.f55030j), 1, null);
            if (!n2.y.h(this.f55023c.g()) && !this.f55025e) {
                l2.t.e(semantics, null, new f(this.f55030j), 1, null);
                if (this.f55024d && !this.f55026f) {
                    l2.t.g(semantics, null, new C1246g(this.f55030j), 1, null);
                }
            }
            if (!this.f55024d || this.f55026f) {
                return;
            }
            l2.t.y(semantics, null, new h(this.f55030j), 1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class o extends kotlin.jvm.internal.u implements h00.p<c1.i, Integer, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ x0.t f55046a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f55047b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f55048c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(x0.t tVar, boolean z11, int i11) {
            super(2);
            this.f55046a = tVar;
            this.f55047b = z11;
            this.f55048c = i11;
        }

        @Override // h00.p
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ vz.b0 mo160invoke(c1.i iVar, Integer num) {
            invoke(iVar, num.intValue());
            return vz.b0.f54756a;
        }

        public final void invoke(c1.i iVar, int i11) {
            g.b(this.f55046a, this.f55047b, iVar, this.f55048c | 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$1$1", f = "CoreTextField.kt", l = {863}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class p extends kotlin.coroutines.jvm.internal.l implements h00.p<d2.c0, zz.d<? super vz.b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f55049a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f55050b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ e0 f55051c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(e0 e0Var, zz.d<? super p> dVar) {
            super(2, dVar);
            this.f55051c = e0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
            p pVar = new p(this.f55051c, dVar);
            pVar.f55050b = obj;
            return pVar;
        }

        @Override // h00.p
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Object mo160invoke(d2.c0 c0Var, zz.d<? super vz.b0> dVar) {
            return ((p) create(c0Var, dVar)).invokeSuspend(vz.b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d11;
            d11 = a00.d.d();
            int i11 = this.f55049a;
            if (i11 == 0) {
                vz.r.b(obj);
                e0 e0Var = this.f55051c;
                this.f55049a = 1;
                if (w.b((d2.c0) this.f55050b, e0Var, this) == d11) {
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
    /* loaded from: classes.dex */
    public static final class q extends kotlin.jvm.internal.u implements h00.p<c1.i, Integer, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ x0.t f55052a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f55053b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(x0.t tVar, int i11) {
            super(2);
            this.f55052a = tVar;
            this.f55053b = i11;
        }

        @Override // h00.p
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ vz.b0 mo160invoke(c1.i iVar, Integer num) {
            invoke(iVar, num.intValue());
            return vz.b0.f54756a;
        }

        public final void invoke(c1.i iVar, int i11) {
            g.c(this.f55052a, iVar, this.f55053b | 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class r extends kotlin.jvm.internal.u implements h00.l<b2.b, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ t0 f55054a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ x0.t f55055b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        r(t0 t0Var, x0.t tVar) {
            super(1);
            this.f55054a = t0Var;
            this.f55055b = tVar;
        }

        @Override // h00.l
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Boolean mo12invoke(b2.b bVar) {
            return m1118invokeZmokQxo(bVar.f());
        }

        /* renamed from: invoke-ZmokQxo  reason: not valid java name */
        public final Boolean m1118invokeZmokQxo(KeyEvent keyEvent) {
            kotlin.jvm.internal.s.g(keyEvent, "keyEvent");
            boolean z11 = true;
            if (this.f55054a.b() == w0.j.None || !w0.o.a(keyEvent)) {
                z11 = false;
            } else {
                x0.t.o(this.f55055b, null, 1, null);
            }
            return Boolean.valueOf(z11);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0308 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:226:0x034b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x047e  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x04af  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0526  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0554  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x05b4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:272:0x05f4  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x05f6  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0638  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x064b  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0652  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x06a1  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x06ad  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x06b1  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0783  */
    /* JADX WARN: Removed duplicated region for block: B:298:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0134  */
    /* JADX WARN: Type inference failed for: r1v31, types: [o1.f] */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r9v20, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v22, types: [s2.i0] */
    /* JADX WARN: Type inference failed for: r9v23 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(s2.a0 r40, h00.l<? super s2.a0, vz.b0> r41, o1.f r42, n2.a0 r43, s2.k0 r44, h00.l<? super n2.w, vz.b0> r45, o0.m r46, t1.s r47, boolean r48, int r49, s2.m r50, w0.u r51, boolean r52, boolean r53, h00.q<? super h00.p<? super c1.i, ? super java.lang.Integer, vz.b0>, ? super c1.i, ? super java.lang.Integer, vz.b0> r54, c1.i r55, int r56, int r57, int r58) {
        /*
            Method dump skipped, instructions count: 1951
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w0.g.a(s2.a0, h00.l, o1.f, n2.a0, s2.k0, h00.l, o0.m, t1.s, boolean, int, s2.m, w0.u, boolean, boolean, h00.q, c1.i, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(x0.t tVar, boolean z11, c1.i iVar, int i11) {
        v0 g11;
        c1.i h11 = iVar.h(-498401361);
        if (z11) {
            t0 z12 = tVar.z();
            n2.w wVar = null;
            if (z12 != null && (g11 = z12.g()) != null) {
                wVar = g11.i();
            }
            if (wVar != null) {
                if (!n2.y.h(tVar.C().g())) {
                    int originalToTransformed = tVar.x().originalToTransformed(n2.y.n(tVar.C().g()));
                    int originalToTransformed2 = tVar.x().originalToTransformed(n2.y.i(tVar.C().g()));
                    w2.c b11 = wVar.b(originalToTransformed);
                    w2.c b12 = wVar.b(Math.max(originalToTransformed2 - 1, 0));
                    h11.x(-498400769);
                    t0 z13 = tVar.z();
                    if (z13 != null && z13.m()) {
                        x0.u.a(true, b11, tVar, h11, 518);
                    }
                    h11.N();
                    t0 z14 = tVar.z();
                    if (z14 != null && z14.l()) {
                        x0.u.a(false, b12, tVar, h11, 518);
                    }
                }
                t0 z15 = tVar.z();
                if (z15 != null) {
                    if (tVar.F()) {
                        z15.u(false);
                    }
                    if (z15.c()) {
                        if (z15.k()) {
                            tVar.T();
                        } else {
                            tVar.E();
                        }
                    }
                }
            }
        } else {
            tVar.E();
        }
        e1 l11 = h11.l();
        if (l11 == null) {
            return;
        }
        l11.a(new o(tVar, z11, i11));
    }

    public static final void c(x0.t manager, c1.i iVar, int i11) {
        v0 g11;
        int m11;
        kotlin.jvm.internal.s.g(manager, "manager");
        c1.i h11 = iVar.h(-1260650262);
        int originalToTransformed = manager.x().originalToTransformed(n2.y.n(manager.C().g()));
        h11.x(-3686930);
        boolean O = h11.O(manager);
        Object y11 = h11.y();
        if (O || y11 == c1.i.f8486a.a()) {
            y11 = manager.l();
            h11.p(y11);
        }
        h11.N();
        e0 e0Var = (e0) y11;
        t0 z11 = manager.z();
        n2.w i12 = (z11 == null || (g11 = z11.g()) == null) ? null : g11.i();
        if (i12 != null) {
            m11 = m00.l.m(originalToTransformed, 0, i12.k().l().length());
            s1.h d11 = i12.d(m11);
            w0.a.a(s1.g.a(d11.i() + (((x2.d) h11.A(androidx.compose.ui.platform.l0.d())).i0(f0.d()) / 2), d11.e()), d2.i0.b(o1.f.f42062f1, e0Var, new p(e0Var, null)), null, h11, 384);
        }
        e1 l11 = h11.l();
        if (l11 == null) {
            return;
        }
        l11.a(new q(manager, i11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(s2.c0 c0Var, t0 t0Var, s2.a0 a0Var, s2.m mVar, h00.l<? super s2.a0, vz.b0> lVar, h00.l<? super s2.l, vz.b0> lVar2, s2.t tVar) {
        v0 g11;
        if (t0Var.c()) {
            g0.a aVar = g0.f55056a;
            s2.h0 h11 = aVar.h(c0Var, a0Var, t0Var.i(), mVar, lVar, lVar2);
            f2.o f11 = t0Var.f();
            if (f11 != null && (g11 = t0Var.g()) != null) {
                aVar.e(a0Var, t0Var.n(), g11.i(), f11, h11, t0Var.c(), tVar);
            }
            t0Var.r(h11);
            return;
        }
        s2.h0 d11 = t0Var.d();
        if (d11 != null) {
            g0.f55056a.f(d11, t0Var.i(), lVar);
        }
        t0Var.r(null);
    }

    private static final o1.f h(o1.f fVar, t0 t0Var, x0.t tVar) {
        return b2.f.b(fVar, new r(t0Var, tVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(t0 t0Var, r1.s sVar, boolean z11) {
        s2.h0 d11;
        if (!t0Var.c()) {
            sVar.c();
        } else if (!z11 || (d11 = t0Var.d()) == null) {
        } else {
            d11.e();
        }
    }
}