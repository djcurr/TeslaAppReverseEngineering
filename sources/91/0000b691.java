package u0;

import androidx.compose.ui.platform.x0;
import androidx.compose.ui.platform.y0;
import c1.i;
import c1.n1;
import c1.o0;
import c1.s1;
import c1.v1;
import d2.c0;
import g2.b;
import g2.e;
import h00.l;
import h00.q;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import l2.h;
import l2.o;
import l2.t;
import l2.v;
import m0.n;
import m0.p;
import m0.r;
import n0.e0;
import n0.i0;
import n0.y;
import o0.m;
import o1.f;
import vz.b0;

/* loaded from: classes.dex */
public final class b {

    /* loaded from: classes.dex */
    static final class a extends u implements q<f, i, Integer, f> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f52825a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f52826b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h f52827c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ l<Boolean, b0> f52828d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: u0.b$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C1183a extends u implements h00.a<b0> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ l<Boolean, b0> f52829a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ boolean f52830b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C1183a(l<? super Boolean, b0> lVar, boolean z11) {
                super(0);
                this.f52829a = lVar;
                this.f52830b = z11;
            }

            @Override // h00.a
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ b0 mo11invoke() {
                invoke2();
                return b0.f54756a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.f52829a.mo12invoke(Boolean.valueOf(!this.f52830b));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(boolean z11, boolean z12, h hVar, l<? super Boolean, b0> lVar) {
            super(3);
            this.f52825a = z11;
            this.f52826b = z12;
            this.f52827c = hVar;
            this.f52828d = lVar;
        }

        public final f a(f composed, i iVar, int i11) {
            s.g(composed, "$this$composed");
            iVar.x(1700574907);
            m2.a a11 = m2.b.a(this.f52825a);
            iVar.x(-3687241);
            Object y11 = iVar.y();
            if (y11 == i.f8486a.a()) {
                y11 = o0.l.a();
                iVar.p(y11);
            }
            iVar.N();
            f c11 = b.c(composed, a11, this.f52826b, this.f52827c, (m) y11, (p) iVar.A(r.a()), new C1183a(this.f52828d, this.f52825a));
            iVar.N();
            return c11;
        }

        @Override // h00.q
        public /* bridge */ /* synthetic */ f invoke(f fVar, i iVar, Integer num) {
            return a(fVar, iVar, num.intValue());
        }
    }

    /* renamed from: u0.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C1184b extends u implements l<y0, b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f52831a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f52832b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h f52833c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ l f52834d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1184b(boolean z11, boolean z12, h hVar, l lVar) {
            super(1);
            this.f52831a = z11;
            this.f52832b = z12;
            this.f52833c = hVar;
            this.f52834d = lVar;
        }

        public final void a(y0 y0Var) {
            s.g(y0Var, "$this$null");
            y0Var.b("toggleable");
            y0Var.a().b("value", Boolean.valueOf(this.f52831a));
            y0Var.a().b("enabled", Boolean.valueOf(this.f52832b));
            y0Var.a().b("role", this.f52833c);
            y0Var.a().b("onValueChange", this.f52834d);
        }

        @Override // h00.l
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ b0 mo12invoke(y0 y0Var) {
            a(y0Var);
            return b0.f54756a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class c extends u implements q<f, i, Integer, f> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h00.a<b0> f52835a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f52836b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ m f52837c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ p f52838d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ h f52839e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ m2.a f52840f;

        /* loaded from: classes.dex */
        public static final class a implements g2.b {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ o0<Boolean> f52841a;

            a(o0<Boolean> o0Var) {
                this.f52841a = o0Var;
            }

            @Override // o1.f
            public <R> R C(R r11, h00.p<? super R, ? super f.c, ? extends R> pVar) {
                return (R) b.a.b(this, r11, pVar);
            }

            @Override // o1.f
            public <R> R a0(R r11, h00.p<? super f.c, ? super R, ? extends R> pVar) {
                return (R) b.a.c(this, r11, pVar);
            }

            @Override // o1.f
            public f g0(f fVar) {
                return b.a.d(this, fVar);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // g2.b
            public void n0(e scope) {
                s.g(scope, "scope");
                this.f52841a.setValue(scope.g0(e0.d()));
            }

            @Override // o1.f
            public boolean p(l<? super f.c, Boolean> lVar) {
                return b.a.a(this, lVar);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: u0.b$c$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C1185b extends u implements h00.a<Boolean> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ o0<Boolean> f52842a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ h00.a<Boolean> f52843b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1185b(o0<Boolean> o0Var, h00.a<Boolean> aVar) {
                super(0);
                this.f52842a = o0Var;
                this.f52843b = aVar;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // h00.a
            /* renamed from: invoke */
            public final Boolean mo11invoke() {
                return Boolean.valueOf(this.f52842a.getValue().booleanValue() || this.f52843b.mo11invoke().booleanValue());
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.selection.ToggleableKt$toggleableImpl$1$gestures$1", f = "Toggleable.kt", l = {270}, m = "invokeSuspend")
        /* renamed from: u0.b$c$c  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C1186c extends kotlin.coroutines.jvm.internal.l implements h00.p<c0, zz.d<? super b0>, Object> {

            /* renamed from: a  reason: collision with root package name */
            int f52844a;

            /* renamed from: b  reason: collision with root package name */
            private /* synthetic */ Object f52845b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ boolean f52846c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ m f52847d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ o0<o0.p> f52848e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ v1<h00.a<Boolean>> f52849f;

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ v1<h00.a<b0>> f52850g;

            /* JADX INFO: Access modifiers changed from: package-private */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.selection.ToggleableKt$toggleableImpl$1$gestures$1$1", f = "Toggleable.kt", l = {273}, m = "invokeSuspend")
            /* renamed from: u0.b$c$c$a */
            /* loaded from: classes.dex */
            public static final class a extends kotlin.coroutines.jvm.internal.l implements q<y, s1.f, zz.d<? super b0>, Object> {

                /* renamed from: a  reason: collision with root package name */
                int f52851a;

                /* renamed from: b  reason: collision with root package name */
                private /* synthetic */ Object f52852b;

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ long f52853c;

                /* renamed from: d  reason: collision with root package name */
                final /* synthetic */ boolean f52854d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ m f52855e;

                /* renamed from: f  reason: collision with root package name */
                final /* synthetic */ o0<o0.p> f52856f;

                /* renamed from: g  reason: collision with root package name */
                final /* synthetic */ v1<h00.a<Boolean>> f52857g;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                a(boolean z11, m mVar, o0<o0.p> o0Var, v1<? extends h00.a<Boolean>> v1Var, zz.d<? super a> dVar) {
                    super(3, dVar);
                    this.f52854d = z11;
                    this.f52855e = mVar;
                    this.f52856f = o0Var;
                    this.f52857g = v1Var;
                }

                public final Object e(y yVar, long j11, zz.d<? super b0> dVar) {
                    a aVar = new a(this.f52854d, this.f52855e, this.f52856f, this.f52857g, dVar);
                    aVar.f52852b = yVar;
                    aVar.f52853c = j11;
                    return aVar.invokeSuspend(b0.f54756a);
                }

                @Override // h00.q
                public /* bridge */ /* synthetic */ Object invoke(y yVar, s1.f fVar, zz.d<? super b0> dVar) {
                    return e(yVar, fVar.t(), dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object d11;
                    d11 = a00.d.d();
                    int i11 = this.f52851a;
                    if (i11 == 0) {
                        vz.r.b(obj);
                        y yVar = (y) this.f52852b;
                        long j11 = this.f52853c;
                        if (this.f52854d) {
                            m mVar = this.f52855e;
                            o0<o0.p> o0Var = this.f52856f;
                            v1<h00.a<Boolean>> v1Var = this.f52857g;
                            this.f52851a = 1;
                            if (m0.h.i(yVar, j11, mVar, o0Var, v1Var, this) == d11) {
                                return d11;
                            }
                        }
                    } else if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        vz.r.b(obj);
                    }
                    return b0.f54756a;
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: u0.b$c$c$b  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C1187b extends u implements l<s1.f, b0> {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ boolean f52858a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ v1<h00.a<b0>> f52859b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C1187b(boolean z11, v1<? extends h00.a<b0>> v1Var) {
                    super(1);
                    this.f52858a = z11;
                    this.f52859b = v1Var;
                }

                @Override // h00.l
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ b0 mo12invoke(s1.f fVar) {
                    m1114invokek4lQ0M(fVar.t());
                    return b0.f54756a;
                }

                /* renamed from: invoke-k-4lQ0M  reason: not valid java name */
                public final void m1114invokek4lQ0M(long j11) {
                    if (this.f52858a) {
                        this.f52859b.getValue().mo11invoke();
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C1186c(boolean z11, m mVar, o0<o0.p> o0Var, v1<? extends h00.a<Boolean>> v1Var, v1<? extends h00.a<b0>> v1Var2, zz.d<? super C1186c> dVar) {
                super(2, dVar);
                this.f52846c = z11;
                this.f52847d = mVar;
                this.f52848e = o0Var;
                this.f52849f = v1Var;
                this.f52850g = v1Var2;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final zz.d<b0> create(Object obj, zz.d<?> dVar) {
                C1186c c1186c = new C1186c(this.f52846c, this.f52847d, this.f52848e, this.f52849f, this.f52850g, dVar);
                c1186c.f52845b = obj;
                return c1186c;
            }

            @Override // h00.p
            public final Object mo160invoke(c0 c0Var, zz.d<? super b0> dVar) {
                return ((C1186c) create(c0Var, dVar)).invokeSuspend(b0.f54756a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object d11;
                d11 = a00.d.d();
                int i11 = this.f52844a;
                if (i11 == 0) {
                    vz.r.b(obj);
                    a aVar = new a(this.f52846c, this.f52847d, this.f52848e, this.f52849f, null);
                    C1187b c1187b = new C1187b(this.f52846c, this.f52850g);
                    this.f52844a = 1;
                    if (i0.i((c0) this.f52845b, aVar, c1187b, this) == d11) {
                        return d11;
                    }
                } else if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    vz.r.b(obj);
                }
                return b0.f54756a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public static final class d extends u implements l<v, b0> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ h f52860a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ m2.a f52861b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ boolean f52862c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ h00.a<b0> f52863d;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* loaded from: classes.dex */
            public static final class a extends u implements h00.a<Boolean> {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ h00.a<b0> f52864a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(h00.a<b0> aVar) {
                    super(0);
                    this.f52864a = aVar;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // h00.a
                /* renamed from: invoke */
                public final Boolean mo11invoke() {
                    this.f52864a.mo11invoke();
                    return Boolean.TRUE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(h hVar, m2.a aVar, boolean z11, h00.a<b0> aVar2) {
                super(1);
                this.f52860a = hVar;
                this.f52861b = aVar;
                this.f52862c = z11;
                this.f52863d = aVar2;
            }

            @Override // h00.l
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ b0 mo12invoke(v vVar) {
                invoke2(vVar);
                return b0.f54756a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(v semantics) {
                s.g(semantics, "$this$semantics");
                h hVar = this.f52860a;
                if (hVar != null) {
                    t.L(semantics, hVar.m());
                }
                t.V(semantics, this.f52861b);
                t.t(semantics, null, new a(this.f52863d), 1, null);
                if (this.f52862c) {
                    return;
                }
                t.i(semantics);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(h00.a<b0> aVar, boolean z11, m mVar, p pVar, h hVar, m2.a aVar2) {
            super(3);
            this.f52835a = aVar;
            this.f52836b = z11;
            this.f52837c = mVar;
            this.f52838d = pVar;
            this.f52839e = hVar;
            this.f52840f = aVar2;
        }

        public final f a(f composed, i iVar, int i11) {
            s.g(composed, "$this$composed");
            iVar.x(-2134919645);
            iVar.x(-3687241);
            Object y11 = iVar.y();
            i.a aVar = i.f8486a;
            if (y11 == aVar.a()) {
                y11 = s1.d(null, null, 2, null);
                iVar.p(y11);
            }
            iVar.N();
            o0 o0Var = (o0) y11;
            f.a aVar2 = f.f42062f1;
            f a11 = o.a(aVar2, true, new d(this.f52839e, this.f52840f, this.f52836b, this.f52835a));
            v1 m11 = n1.m(this.f52835a, iVar, 0);
            iVar.x(-2134919160);
            if (this.f52836b) {
                m0.h.a(this.f52837c, o0Var, iVar, 48);
            }
            iVar.N();
            h00.a<Boolean> d11 = m0.i.d(iVar, 0);
            iVar.x(-3687241);
            Object y12 = iVar.y();
            if (y12 == aVar.a()) {
                y12 = s1.d(Boolean.TRUE, null, 2, null);
                iVar.p(y12);
            }
            iVar.N();
            o0 o0Var2 = (o0) y12;
            f c11 = d2.i0.c(aVar2, this.f52837c, Boolean.valueOf(this.f52836b), new C1186c(this.f52836b, this.f52837c, o0Var, n1.m(new C1185b(o0Var2, d11), iVar, 0), m11, null));
            iVar.x(-3687241);
            Object y13 = iVar.y();
            if (y13 == aVar.a()) {
                y13 = new a(o0Var2);
                iVar.p(y13);
            }
            iVar.N();
            f g02 = m0.m.b(n.a(r.b(composed.g0((f) y13).g0(a11), this.f52837c, this.f52838d), this.f52837c, this.f52836b), this.f52836b, this.f52837c).g0(c11);
            iVar.N();
            return g02;
        }

        @Override // h00.q
        public /* bridge */ /* synthetic */ f invoke(f fVar, i iVar, Integer num) {
            return a(fVar, iVar, num.intValue());
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends u implements l<y0, b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m2.a f52865a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f52866b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h f52867c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ m f52868d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ p f52869e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ h00.a f52870f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(m2.a aVar, boolean z11, h hVar, m mVar, p pVar, h00.a aVar2) {
            super(1);
            this.f52865a = aVar;
            this.f52866b = z11;
            this.f52867c = hVar;
            this.f52868d = mVar;
            this.f52869e = pVar;
            this.f52870f = aVar2;
        }

        public final void a(y0 y0Var) {
            s.g(y0Var, "$this$null");
            y0Var.b("triStateToggleable");
            y0Var.a().b("state", this.f52865a);
            y0Var.a().b("enabled", Boolean.valueOf(this.f52866b));
            y0Var.a().b("role", this.f52867c);
            y0Var.a().b("interactionSource", this.f52868d);
            y0Var.a().b("indication", this.f52869e);
            y0Var.a().b("onClick", this.f52870f);
        }

        @Override // h00.l
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ b0 mo12invoke(y0 y0Var) {
            a(y0Var);
            return b0.f54756a;
        }
    }

    public static final f b(f toggleable, boolean z11, boolean z12, h hVar, l<? super Boolean, b0> onValueChange) {
        s.g(toggleable, "$this$toggleable");
        s.g(onValueChange, "onValueChange");
        return o1.e.a(toggleable, x0.c() ? new C1184b(z11, z12, hVar, onValueChange) : x0.a(), new a(z11, z12, hVar, onValueChange));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f c(f fVar, m2.a aVar, boolean z11, h hVar, m mVar, p pVar, h00.a<b0> aVar2) {
        return o1.e.b(fVar, null, new c(aVar2, z11, mVar, pVar, hVar, aVar), 1, null);
    }

    public static final f d(f triStateToggleable, m2.a state, m interactionSource, p pVar, boolean z11, h hVar, h00.a<b0> onClick) {
        s.g(triStateToggleable, "$this$triStateToggleable");
        s.g(state, "state");
        s.g(interactionSource, "interactionSource");
        s.g(onClick, "onClick");
        return x0.b(triStateToggleable, x0.c() ? new d(state, z11, hVar, interactionSource, pVar, onClick) : x0.a(), c(f.f42062f1, state, z11, hVar, interactionSource, pVar, onClick));
    }
}