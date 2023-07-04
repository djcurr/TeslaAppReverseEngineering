package m0;

import android.view.KeyEvent;
import androidx.compose.ui.platform.x0;
import androidx.compose.ui.platform.y0;
import c1.e1;
import c1.i;
import c1.n1;
import c1.o0;
import c1.s1;
import c1.v1;
import com.google.android.gms.wallet.WalletConstants;
import g2.b;
import n0.i0;
import o1.f;
import okhttp3.internal.http.StatusLine;
import v20.p0;

/* loaded from: classes.dex */
public final class h {

    /* loaded from: classes.dex */
    public static final class a extends kotlin.jvm.internal.u implements h00.l<c1.z, c1.y> {

        /* renamed from: a */
        final /* synthetic */ o0<o0.p> f37922a;

        /* renamed from: b */
        final /* synthetic */ o0.m f37923b;

        /* renamed from: m0.h$a$a */
        /* loaded from: classes.dex */
        public static final class C0720a implements c1.y {

            /* renamed from: a */
            final /* synthetic */ o0 f37924a;

            /* renamed from: b */
            final /* synthetic */ o0.m f37925b;

            public C0720a(o0 o0Var, o0.m mVar) {
                this.f37924a = o0Var;
                this.f37925b = mVar;
            }

            @Override // c1.y
            public void dispose() {
                o0.p pVar = (o0.p) this.f37924a.getValue();
                if (pVar == null) {
                    return;
                }
                this.f37925b.a(new o0.o(pVar));
                this.f37924a.setValue(null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(o0<o0.p> o0Var, o0.m mVar) {
            super(1);
            this.f37922a = o0Var;
            this.f37923b = mVar;
        }

        @Override // h00.l
        public final c1.y mo12invoke(c1.z DisposableEffect) {
            kotlin.jvm.internal.s.g(DisposableEffect, "$this$DisposableEffect");
            return new C0720a(this.f37922a, this.f37923b);
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends kotlin.jvm.internal.u implements h00.p<c1.i, Integer, vz.b0> {

        /* renamed from: a */
        final /* synthetic */ o0.m f37926a;

        /* renamed from: b */
        final /* synthetic */ o0<o0.p> f37927b;

        /* renamed from: c */
        final /* synthetic */ int f37928c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(o0.m mVar, o0<o0.p> o0Var, int i11) {
            super(2);
            this.f37926a = mVar;
            this.f37927b = o0Var;
            this.f37928c = i11;
        }

        @Override // h00.p
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ vz.b0 mo160invoke(c1.i iVar, Integer num) {
            invoke(iVar, num.intValue());
            return vz.b0.f54756a;
        }

        public final void invoke(c1.i iVar, int i11) {
            h.a(this.f37926a, this.f37927b, iVar, this.f37928c | 1);
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends kotlin.jvm.internal.u implements h00.q<o1.f, c1.i, Integer, o1.f> {

        /* renamed from: a */
        final /* synthetic */ boolean f37929a;

        /* renamed from: b */
        final /* synthetic */ String f37930b;

        /* renamed from: c */
        final /* synthetic */ l2.h f37931c;

        /* renamed from: d */
        final /* synthetic */ h00.a<vz.b0> f37932d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(boolean z11, String str, l2.h hVar, h00.a<vz.b0> aVar) {
            super(3);
            this.f37929a = z11;
            this.f37930b = str;
            this.f37931c = hVar;
            this.f37932d = aVar;
        }

        public final o1.f a(o1.f composed, c1.i iVar, int i11) {
            kotlin.jvm.internal.s.g(composed, "$this$composed");
            iVar.x(1841979210);
            f.a aVar = o1.f.f42062f1;
            p pVar = (p) iVar.A(r.a());
            iVar.x(-3687241);
            Object y11 = iVar.y();
            if (y11 == c1.i.f8486a.a()) {
                y11 = o0.l.a();
                iVar.p(y11);
            }
            iVar.N();
            o1.f b11 = h.b(aVar, (o0.m) y11, pVar, this.f37929a, this.f37930b, this.f37931c, this.f37932d);
            iVar.N();
            return b11;
        }

        @Override // h00.q
        public /* bridge */ /* synthetic */ o1.f invoke(o1.f fVar, c1.i iVar, Integer num) {
            return a(fVar, iVar, num.intValue());
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends kotlin.jvm.internal.u implements h00.q<o1.f, c1.i, Integer, o1.f> {

        /* renamed from: a */
        final /* synthetic */ h00.a<vz.b0> f37933a;

        /* renamed from: b */
        final /* synthetic */ boolean f37934b;

        /* renamed from: c */
        final /* synthetic */ o0.m f37935c;

        /* renamed from: d */
        final /* synthetic */ p f37936d;

        /* renamed from: e */
        final /* synthetic */ String f37937e;

        /* renamed from: f */
        final /* synthetic */ l2.h f37938f;

        /* loaded from: classes.dex */
        public static final class a implements g2.b {

            /* renamed from: a */
            final /* synthetic */ o0<Boolean> f37939a;

            a(o0<Boolean> o0Var) {
                this.f37939a = o0Var;
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
            public o1.f g0(o1.f fVar) {
                return b.a.d(this, fVar);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // g2.b
            public void n0(g2.e scope) {
                kotlin.jvm.internal.s.g(scope, "scope");
                this.f37939a.setValue(scope.g0(n0.e0.d()));
            }

            @Override // o1.f
            public boolean p(h00.l<? super f.c, Boolean> lVar) {
                return b.a.a(this, lVar);
            }
        }

        /* loaded from: classes.dex */
        public static final class b extends kotlin.jvm.internal.u implements h00.a<Boolean> {

            /* renamed from: a */
            final /* synthetic */ o0<Boolean> f37940a;

            /* renamed from: b */
            final /* synthetic */ h00.a<Boolean> f37941b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(o0<Boolean> o0Var, h00.a<Boolean> aVar) {
                super(0);
                this.f37940a = o0Var;
                this.f37941b = aVar;
            }

            @Override // h00.a
            /* renamed from: invoke */
            public final Boolean mo11invoke() {
                return Boolean.valueOf(this.f37940a.getValue().booleanValue() || this.f37941b.mo11invoke().booleanValue());
            }
        }

        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.ClickableKt$clickable$4$gesture$1", f = "Clickable.kt", l = {142}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class c extends kotlin.coroutines.jvm.internal.l implements h00.p<d2.c0, zz.d<? super vz.b0>, Object> {

            /* renamed from: a */
            int f37942a;

            /* renamed from: b */
            private /* synthetic */ Object f37943b;

            /* renamed from: c */
            final /* synthetic */ boolean f37944c;

            /* renamed from: d */
            final /* synthetic */ o0.m f37945d;

            /* renamed from: e */
            final /* synthetic */ o0<o0.p> f37946e;

            /* renamed from: f */
            final /* synthetic */ v1<h00.a<Boolean>> f37947f;

            /* renamed from: g */
            final /* synthetic */ v1<h00.a<vz.b0>> f37948g;

            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.ClickableKt$clickable$4$gesture$1$1", f = "Clickable.kt", l = {145}, m = "invokeSuspend")
            /* loaded from: classes.dex */
            public static final class a extends kotlin.coroutines.jvm.internal.l implements h00.q<n0.y, s1.f, zz.d<? super vz.b0>, Object> {

                /* renamed from: a */
                int f37949a;

                /* renamed from: b */
                private /* synthetic */ Object f37950b;

                /* renamed from: c */
                /* synthetic */ long f37951c;

                /* renamed from: d */
                final /* synthetic */ boolean f37952d;

                /* renamed from: e */
                final /* synthetic */ o0.m f37953e;

                /* renamed from: f */
                final /* synthetic */ o0<o0.p> f37954f;

                /* renamed from: g */
                final /* synthetic */ v1<h00.a<Boolean>> f37955g;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                a(boolean z11, o0.m mVar, o0<o0.p> o0Var, v1<? extends h00.a<Boolean>> v1Var, zz.d<? super a> dVar) {
                    super(3, dVar);
                    this.f37952d = z11;
                    this.f37953e = mVar;
                    this.f37954f = o0Var;
                    this.f37955g = v1Var;
                }

                public final Object e(n0.y yVar, long j11, zz.d<? super vz.b0> dVar) {
                    a aVar = new a(this.f37952d, this.f37953e, this.f37954f, this.f37955g, dVar);
                    aVar.f37950b = yVar;
                    aVar.f37951c = j11;
                    return aVar.invokeSuspend(vz.b0.f54756a);
                }

                @Override // h00.q
                public /* bridge */ /* synthetic */ Object invoke(n0.y yVar, s1.f fVar, zz.d<? super vz.b0> dVar) {
                    return e(yVar, fVar.t(), dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object d11;
                    d11 = a00.d.d();
                    int i11 = this.f37949a;
                    if (i11 == 0) {
                        vz.r.b(obj);
                        n0.y yVar = (n0.y) this.f37950b;
                        long j11 = this.f37951c;
                        if (this.f37952d) {
                            o0.m mVar = this.f37953e;
                            o0<o0.p> o0Var = this.f37954f;
                            v1<h00.a<Boolean>> v1Var = this.f37955g;
                            this.f37949a = 1;
                            if (h.i(yVar, j11, mVar, o0Var, v1Var, this) == d11) {
                                return d11;
                            }
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
            public static final class b extends kotlin.jvm.internal.u implements h00.l<s1.f, vz.b0> {

                /* renamed from: a */
                final /* synthetic */ boolean f37956a;

                /* renamed from: b */
                final /* synthetic */ v1<h00.a<vz.b0>> f37957b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                b(boolean z11, v1<? extends h00.a<vz.b0>> v1Var) {
                    super(1);
                    this.f37956a = z11;
                    this.f37957b = v1Var;
                }

                @Override // h00.l
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ vz.b0 mo12invoke(s1.f fVar) {
                    m762invokek4lQ0M(fVar.t());
                    return vz.b0.f54756a;
                }

                /* renamed from: invoke-k-4lQ0M */
                public final void m762invokek4lQ0M(long j11) {
                    if (this.f37956a) {
                        this.f37957b.getValue().mo11invoke();
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            c(boolean z11, o0.m mVar, o0<o0.p> o0Var, v1<? extends h00.a<Boolean>> v1Var, v1<? extends h00.a<vz.b0>> v1Var2, zz.d<? super c> dVar) {
                super(2, dVar);
                this.f37944c = z11;
                this.f37945d = mVar;
                this.f37946e = o0Var;
                this.f37947f = v1Var;
                this.f37948g = v1Var2;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
                c cVar = new c(this.f37944c, this.f37945d, this.f37946e, this.f37947f, this.f37948g, dVar);
                cVar.f37943b = obj;
                return cVar;
            }

            @Override // h00.p
            public final Object mo160invoke(d2.c0 c0Var, zz.d<? super vz.b0> dVar) {
                return ((c) create(c0Var, dVar)).invokeSuspend(vz.b0.f54756a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object d11;
                d11 = a00.d.d();
                int i11 = this.f37942a;
                if (i11 == 0) {
                    vz.r.b(obj);
                    a aVar = new a(this.f37944c, this.f37945d, this.f37946e, this.f37947f, null);
                    b bVar = new b(this.f37944c, this.f37948g);
                    this.f37942a = 1;
                    if (i0.i((d2.c0) this.f37943b, aVar, bVar, this) == d11) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(h00.a<vz.b0> aVar, boolean z11, o0.m mVar, p pVar, String str, l2.h hVar) {
            super(3);
            this.f37933a = aVar;
            this.f37934b = z11;
            this.f37935c = mVar;
            this.f37936d = pVar;
            this.f37937e = str;
            this.f37938f = hVar;
        }

        public final o1.f a(o1.f composed, c1.i iVar, int i11) {
            kotlin.jvm.internal.s.g(composed, "$this$composed");
            iVar.x(1841981045);
            v1 m11 = n1.m(this.f37933a, iVar, 0);
            iVar.x(-3687241);
            Object y11 = iVar.y();
            i.a aVar = c1.i.f8486a;
            if (y11 == aVar.a()) {
                y11 = s1.d(null, null, 2, null);
                iVar.p(y11);
            }
            iVar.N();
            o0 o0Var = (o0) y11;
            iVar.x(1841981204);
            if (this.f37934b) {
                h.a(this.f37935c, o0Var, iVar, 48);
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
            v1 m12 = n1.m(new b(o0Var2, d11), iVar, 0);
            f.a aVar2 = o1.f.f42062f1;
            o1.f c11 = d2.i0.c(aVar2, this.f37935c, Boolean.valueOf(this.f37934b), new c(this.f37934b, this.f37935c, o0Var, m12, m11, null));
            iVar.x(-3687241);
            Object y13 = iVar.y();
            if (y13 == aVar.a()) {
                y13 = new a(o0Var2);
                iVar.p(y13);
            }
            iVar.N();
            o1.f f11 = h.f(aVar2.g0((o1.f) y13), c11, this.f37935c, this.f37936d, this.f37934b, this.f37937e, this.f37938f, null, null, this.f37933a);
            iVar.N();
            return f11;
        }

        @Override // h00.q
        public /* bridge */ /* synthetic */ o1.f invoke(o1.f fVar, c1.i iVar, Integer num) {
            return a(fVar, iVar, num.intValue());
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends kotlin.jvm.internal.u implements h00.l<y0, vz.b0> {

        /* renamed from: a */
        final /* synthetic */ boolean f37958a;

        /* renamed from: b */
        final /* synthetic */ String f37959b;

        /* renamed from: c */
        final /* synthetic */ l2.h f37960c;

        /* renamed from: d */
        final /* synthetic */ h00.a f37961d;

        /* renamed from: e */
        final /* synthetic */ p f37962e;

        /* renamed from: f */
        final /* synthetic */ o0.m f37963f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(boolean z11, String str, l2.h hVar, h00.a aVar, p pVar, o0.m mVar) {
            super(1);
            this.f37958a = z11;
            this.f37959b = str;
            this.f37960c = hVar;
            this.f37961d = aVar;
            this.f37962e = pVar;
            this.f37963f = mVar;
        }

        public final void a(y0 y0Var) {
            kotlin.jvm.internal.s.g(y0Var, "$this$null");
            y0Var.b("clickable");
            y0Var.a().b("enabled", Boolean.valueOf(this.f37958a));
            y0Var.a().b("onClickLabel", this.f37959b);
            y0Var.a().b("role", this.f37960c);
            y0Var.a().b("onClick", this.f37961d);
            y0Var.a().b("indication", this.f37962e);
            y0Var.a().b("interactionSource", this.f37963f);
        }

        @Override // h00.l
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ vz.b0 mo12invoke(y0 y0Var) {
            a(y0Var);
            return vz.b0.f54756a;
        }
    }

    /* loaded from: classes.dex */
    public static final class f extends kotlin.jvm.internal.u implements h00.l<y0, vz.b0> {

        /* renamed from: a */
        final /* synthetic */ boolean f37964a;

        /* renamed from: b */
        final /* synthetic */ String f37965b;

        /* renamed from: c */
        final /* synthetic */ l2.h f37966c;

        /* renamed from: d */
        final /* synthetic */ h00.a f37967d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(boolean z11, String str, l2.h hVar, h00.a aVar) {
            super(1);
            this.f37964a = z11;
            this.f37965b = str;
            this.f37966c = hVar;
            this.f37967d = aVar;
        }

        public final void a(y0 y0Var) {
            kotlin.jvm.internal.s.g(y0Var, "$this$null");
            y0Var.b("clickable");
            y0Var.a().b("enabled", Boolean.valueOf(this.f37964a));
            y0Var.a().b("onClickLabel", this.f37965b);
            y0Var.a().b("role", this.f37966c);
            y0Var.a().b("onClick", this.f37967d);
        }

        @Override // h00.l
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ vz.b0 mo12invoke(y0 y0Var) {
            a(y0Var);
            return vz.b0.f54756a;
        }
    }

    /* loaded from: classes.dex */
    public static final class g extends kotlin.jvm.internal.u implements h00.l<l2.v, vz.b0> {

        /* renamed from: a */
        final /* synthetic */ l2.h f37968a;

        /* renamed from: b */
        final /* synthetic */ String f37969b;

        /* renamed from: c */
        final /* synthetic */ h00.a<vz.b0> f37970c;

        /* renamed from: d */
        final /* synthetic */ String f37971d;

        /* renamed from: e */
        final /* synthetic */ boolean f37972e;

        /* renamed from: f */
        final /* synthetic */ h00.a<vz.b0> f37973f;

        /* loaded from: classes.dex */
        public static final class a extends kotlin.jvm.internal.u implements h00.a<Boolean> {

            /* renamed from: a */
            final /* synthetic */ h00.a<vz.b0> f37974a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(h00.a<vz.b0> aVar) {
                super(0);
                this.f37974a = aVar;
            }

            @Override // h00.a
            /* renamed from: invoke */
            public final Boolean mo11invoke() {
                this.f37974a.mo11invoke();
                return Boolean.TRUE;
            }
        }

        /* loaded from: classes.dex */
        public static final class b extends kotlin.jvm.internal.u implements h00.a<Boolean> {

            /* renamed from: a */
            final /* synthetic */ h00.a<vz.b0> f37975a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(h00.a<vz.b0> aVar) {
                super(0);
                this.f37975a = aVar;
            }

            @Override // h00.a
            /* renamed from: invoke */
            public final Boolean mo11invoke() {
                this.f37975a.mo11invoke();
                return Boolean.TRUE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(l2.h hVar, String str, h00.a<vz.b0> aVar, String str2, boolean z11, h00.a<vz.b0> aVar2) {
            super(1);
            this.f37968a = hVar;
            this.f37969b = str;
            this.f37970c = aVar;
            this.f37971d = str2;
            this.f37972e = z11;
            this.f37973f = aVar2;
        }

        @Override // h00.l
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ vz.b0 mo12invoke(l2.v vVar) {
            invoke2(vVar);
            return vz.b0.f54756a;
        }

        /* renamed from: invoke */
        public final void invoke2(l2.v semantics) {
            kotlin.jvm.internal.s.g(semantics, "$this$semantics");
            l2.h hVar = this.f37968a;
            if (hVar != null) {
                l2.t.L(semantics, hVar.m());
            }
            l2.t.s(semantics, this.f37969b, new a(this.f37973f));
            h00.a<vz.b0> aVar = this.f37970c;
            if (aVar != null) {
                l2.t.u(semantics, this.f37971d, new b(aVar));
            }
            if (this.f37972e) {
                return;
            }
            l2.t.i(semantics);
        }
    }

    /* renamed from: m0.h$h */
    /* loaded from: classes.dex */
    public static final class C0721h extends kotlin.jvm.internal.u implements h00.l<b2.b, Boolean> {

        /* renamed from: a */
        final /* synthetic */ boolean f37976a;

        /* renamed from: b */
        final /* synthetic */ h00.a<vz.b0> f37977b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0721h(boolean z11, h00.a<vz.b0> aVar) {
            super(1);
            this.f37976a = z11;
            this.f37977b = aVar;
        }

        @Override // h00.l
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Boolean mo12invoke(b2.b bVar) {
            return m763invokeZmokQxo(bVar.f());
        }

        /* renamed from: invoke-ZmokQxo */
        public final Boolean m763invokeZmokQxo(KeyEvent it2) {
            boolean z11;
            kotlin.jvm.internal.s.g(it2, "it");
            if (this.f37976a && m0.i.c(it2)) {
                this.f37977b.mo11invoke();
                z11 = true;
            } else {
                z11 = false;
            }
            return Boolean.valueOf(z11);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.ClickableKt$handlePressInteraction$2", f = "Clickable.kt", l = {WalletConstants.ERROR_CODE_UNSUPPORTED_API_VERSION, WalletConstants.ERROR_CODE_ILLEGAL_CALLER, StatusLine.HTTP_MISDIRECTED_REQUEST, 422, 431}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class i extends kotlin.coroutines.jvm.internal.l implements h00.p<v20.o0, zz.d<? super vz.b0>, Object> {

        /* renamed from: a */
        boolean f37978a;

        /* renamed from: b */
        int f37979b;

        /* renamed from: c */
        private /* synthetic */ Object f37980c;

        /* renamed from: d */
        final /* synthetic */ n0.y f37981d;

        /* renamed from: e */
        final /* synthetic */ long f37982e;

        /* renamed from: f */
        final /* synthetic */ o0.m f37983f;

        /* renamed from: g */
        final /* synthetic */ o0<o0.p> f37984g;

        /* renamed from: h */
        final /* synthetic */ v1<h00.a<Boolean>> f37985h;

        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.ClickableKt$handlePressInteraction$2$delayJob$1", f = "Clickable.kt", l = {WalletConstants.ERROR_CODE_SPENDING_LIMIT_EXCEEDED, WalletConstants.ERROR_CODE_BUYER_ACCOUNT_ERROR}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements h00.p<v20.o0, zz.d<? super vz.b0>, Object> {

            /* renamed from: a */
            Object f37986a;

            /* renamed from: b */
            int f37987b;

            /* renamed from: c */
            final /* synthetic */ v1<h00.a<Boolean>> f37988c;

            /* renamed from: d */
            final /* synthetic */ long f37989d;

            /* renamed from: e */
            final /* synthetic */ o0.m f37990e;

            /* renamed from: f */
            final /* synthetic */ o0<o0.p> f37991f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(v1<? extends h00.a<Boolean>> v1Var, long j11, o0.m mVar, o0<o0.p> o0Var, zz.d<? super a> dVar) {
                super(2, dVar);
                this.f37988c = v1Var;
                this.f37989d = j11;
                this.f37990e = mVar;
                this.f37991f = o0Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
                return new a(this.f37988c, this.f37989d, this.f37990e, this.f37991f, dVar);
            }

            @Override // h00.p
            public final Object mo160invoke(v20.o0 o0Var, zz.d<? super vz.b0> dVar) {
                return ((a) create(o0Var, dVar)).invokeSuspend(vz.b0.f54756a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object d11;
                o0.p pVar;
                d11 = a00.d.d();
                int i11 = this.f37987b;
                if (i11 == 0) {
                    vz.r.b(obj);
                    if (this.f37988c.getValue().mo11invoke().booleanValue()) {
                        long b11 = m0.i.b();
                        this.f37987b = 1;
                        if (v20.y0.b(b11, this) == d11) {
                            return d11;
                        }
                    }
                } else if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    pVar = (o0.p) this.f37986a;
                    vz.r.b(obj);
                    this.f37991f.setValue(pVar);
                    return vz.b0.f54756a;
                } else {
                    vz.r.b(obj);
                }
                o0.p pVar2 = new o0.p(this.f37989d, null);
                o0.m mVar = this.f37990e;
                this.f37986a = pVar2;
                this.f37987b = 2;
                if (mVar.c(pVar2, this) == d11) {
                    return d11;
                }
                pVar = pVar2;
                this.f37991f.setValue(pVar);
                return vz.b0.f54756a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        i(n0.y yVar, long j11, o0.m mVar, o0<o0.p> o0Var, v1<? extends h00.a<Boolean>> v1Var, zz.d<? super i> dVar) {
            super(2, dVar);
            this.f37981d = yVar;
            this.f37982e = j11;
            this.f37983f = mVar;
            this.f37984g = o0Var;
            this.f37985h = v1Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
            i iVar = new i(this.f37981d, this.f37982e, this.f37983f, this.f37984g, this.f37985h, dVar);
            iVar.f37980c = obj;
            return iVar;
        }

        @Override // h00.p
        public final Object mo160invoke(v20.o0 o0Var, zz.d<? super vz.b0> dVar) {
            return ((i) create(o0Var, dVar)).invokeSuspend(vz.b0.f54756a);
        }

        /* JADX WARN: Removed duplicated region for block: B:71:0x008e  */
        /* JADX WARN: Removed duplicated region for block: B:77:0x00b4 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r20) {
            /*
                Method dump skipped, instructions count: 227
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: m0.h.i.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final void a(o0.m interactionSource, o0<o0.p> pressedInteraction, c1.i iVar, int i11) {
        int i12;
        kotlin.jvm.internal.s.g(interactionSource, "interactionSource");
        kotlin.jvm.internal.s.g(pressedInteraction, "pressedInteraction");
        c1.i h11 = iVar.h(1115975634);
        if ((i11 & 14) == 0) {
            i12 = (h11.O(interactionSource) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            i12 |= h11.O(pressedInteraction) ? 32 : 16;
        }
        if (((i12 & 91) ^ 18) == 0 && h11.i()) {
            h11.G();
        } else {
            h11.x(-3686552);
            boolean O = h11.O(pressedInteraction) | h11.O(interactionSource);
            Object y11 = h11.y();
            if (O || y11 == c1.i.f8486a.a()) {
                y11 = new a(pressedInteraction, interactionSource);
                h11.p(y11);
            }
            h11.N();
            c1.b0.a(interactionSource, (h00.l) y11, h11, i12 & 14);
        }
        e1 l11 = h11.l();
        if (l11 == null) {
            return;
        }
        l11.a(new b(interactionSource, pressedInteraction, i11));
    }

    public static final o1.f b(o1.f clickable, o0.m interactionSource, p pVar, boolean z11, String str, l2.h hVar, h00.a<vz.b0> onClick) {
        kotlin.jvm.internal.s.g(clickable, "$this$clickable");
        kotlin.jvm.internal.s.g(interactionSource, "interactionSource");
        kotlin.jvm.internal.s.g(onClick, "onClick");
        return o1.e.a(clickable, x0.c() ? new e(z11, str, hVar, onClick, pVar, interactionSource) : x0.a(), new d(onClick, z11, interactionSource, pVar, str, hVar));
    }

    public static /* synthetic */ o1.f c(o1.f fVar, o0.m mVar, p pVar, boolean z11, String str, l2.h hVar, h00.a aVar, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z11 = true;
        }
        return b(fVar, mVar, pVar, z11, (i11 & 8) != 0 ? null : str, (i11 & 16) != 0 ? null : hVar, aVar);
    }

    public static final o1.f d(o1.f clickable, boolean z11, String str, l2.h hVar, h00.a<vz.b0> onClick) {
        kotlin.jvm.internal.s.g(clickable, "$this$clickable");
        kotlin.jvm.internal.s.g(onClick, "onClick");
        return o1.e.a(clickable, x0.c() ? new f(z11, str, hVar, onClick) : x0.a(), new c(z11, str, hVar, onClick));
    }

    public static /* synthetic */ o1.f e(o1.f fVar, boolean z11, String str, l2.h hVar, h00.a aVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        if ((i11 & 2) != 0) {
            str = null;
        }
        if ((i11 & 4) != 0) {
            hVar = null;
        }
        return d(fVar, z11, str, hVar, aVar);
    }

    public static final o1.f f(o1.f genericClickableWithoutGesture, o1.f gestureModifiers, o0.m interactionSource, p pVar, boolean z11, String str, l2.h hVar, String str2, h00.a<vz.b0> aVar, h00.a<vz.b0> onClick) {
        kotlin.jvm.internal.s.g(genericClickableWithoutGesture, "$this$genericClickableWithoutGesture");
        kotlin.jvm.internal.s.g(gestureModifiers, "gestureModifiers");
        kotlin.jvm.internal.s.g(interactionSource, "interactionSource");
        kotlin.jvm.internal.s.g(onClick, "onClick");
        return m.b(n.a(r.b(h(g(genericClickableWithoutGesture, hVar, str, aVar, str2, z11, onClick), z11, onClick), interactionSource, pVar), interactionSource, z11), z11, interactionSource).g0(gestureModifiers);
    }

    private static final o1.f g(o1.f fVar, l2.h hVar, String str, h00.a<vz.b0> aVar, String str2, boolean z11, h00.a<vz.b0> aVar2) {
        return l2.o.a(fVar, true, new g(hVar, str, aVar, str2, z11, aVar2));
    }

    private static final o1.f h(o1.f fVar, boolean z11, h00.a<vz.b0> aVar) {
        return b2.f.a(fVar, new C0721h(z11, aVar));
    }

    public static final Object i(n0.y yVar, long j11, o0.m mVar, o0<o0.p> o0Var, v1<? extends h00.a<Boolean>> v1Var, zz.d<? super vz.b0> dVar) {
        Object d11;
        Object e11 = p0.e(new i(yVar, j11, mVar, o0Var, v1Var, null), dVar);
        d11 = a00.d.d();
        return e11 == d11 ? e11 : vz.b0.f54756a;
    }
}