package m0;

import android.os.Build;
import android.view.View;
import androidx.compose.ui.platform.l0;
import androidx.compose.ui.platform.x0;
import androidx.compose.ui.platform.y0;
import c1.i;
import c1.n1;
import c1.s1;
import c1.v1;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import f2.g0;
import v20.o0;

/* loaded from: classes.dex */
public final class t {

    /* loaded from: classes.dex */
    public static final class a extends kotlin.jvm.internal.u implements h00.l<y0, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h00.l f38079a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h00.l f38080b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ float f38081c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ u f38082d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(h00.l lVar, h00.l lVar2, float f11, u uVar) {
            super(1);
            this.f38079a = lVar;
            this.f38080b = lVar2;
            this.f38081c = f11;
            this.f38082d = uVar;
        }

        public final void a(y0 y0Var) {
            kotlin.jvm.internal.s.g(y0Var, "$this$null");
            y0Var.b(t.b(0, 1, null) ? "magnifier" : "magnifier (not supported)");
            y0Var.a().b("sourceCenter", this.f38079a);
            y0Var.a().b("magnifierCenter", this.f38080b);
            y0Var.a().b("zoom", Float.valueOf(this.f38081c));
            y0Var.a().b("style", this.f38082d);
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ vz.b0 invoke(y0 y0Var) {
            a(y0Var);
            return vz.b0.f54756a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends kotlin.jvm.internal.u implements h00.l<x2.d, s1.f> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f38083a = new b();

        b() {
            super(1);
        }

        public final long a(x2.d dVar) {
            kotlin.jvm.internal.s.g(dVar, "$this$null");
            return s1.f.f49950b.b();
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ s1.f invoke(x2.d dVar) {
            return s1.f.d(a(dVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class c extends kotlin.jvm.internal.u implements h00.q<o1.f, c1.i, Integer, o1.f> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h00.l<x2.d, s1.f> f38084a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h00.l<x2.d, s1.f> f38085b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ float f38086c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ z f38087d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ u f38088e;

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.MagnifierKt$magnifier$4$1", f = "Magnifier.kt", l = {320}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements h00.p<o0, zz.d<? super vz.b0>, Object> {

            /* renamed from: a  reason: collision with root package name */
            int f38089a;

            /* renamed from: b  reason: collision with root package name */
            private /* synthetic */ Object f38090b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ z f38091c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ u f38092d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ View f38093e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ x2.d f38094f;

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ float f38095g;

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.flow.t<vz.b0> f38096h;

            /* renamed from: i  reason: collision with root package name */
            final /* synthetic */ v1<h00.l<x2.d, s1.f>> f38097i;

            /* renamed from: j  reason: collision with root package name */
            final /* synthetic */ c1.o0<s1.f> f38098j;

            /* renamed from: k  reason: collision with root package name */
            final /* synthetic */ v1<h00.l<x2.d, s1.f>> f38099k;

            /* renamed from: l  reason: collision with root package name */
            final /* synthetic */ v1<Float> f38100l;

            /* JADX INFO: Access modifiers changed from: package-private */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.MagnifierKt$magnifier$4$1$1", f = "Magnifier.kt", l = {}, m = "invokeSuspend")
            /* renamed from: m0.t$c$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0729a extends kotlin.coroutines.jvm.internal.l implements h00.p<vz.b0, zz.d<? super vz.b0>, Object> {

                /* renamed from: a  reason: collision with root package name */
                int f38101a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ y f38102b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0729a(y yVar, zz.d<? super C0729a> dVar) {
                    super(2, dVar);
                    this.f38102b = yVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
                    return new C0729a(this.f38102b, dVar);
                }

                @Override // h00.p
                /* renamed from: e */
                public final Object invoke(vz.b0 b0Var, zz.d<? super vz.b0> dVar) {
                    return ((C0729a) create(b0Var, dVar)).invokeSuspend(vz.b0.f54756a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    a00.d.d();
                    if (this.f38101a == 0) {
                        vz.r.b(obj);
                        this.f38102b.b();
                        return vz.b0.f54756a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* loaded from: classes.dex */
            public static final class b extends kotlin.jvm.internal.u implements h00.a<vz.b0> {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ x2.d f38103a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ y f38104b;

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ v1<h00.l<x2.d, s1.f>> f38105c;

                /* renamed from: d  reason: collision with root package name */
                final /* synthetic */ c1.o0<s1.f> f38106d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ v1<h00.l<x2.d, s1.f>> f38107e;

                /* renamed from: f  reason: collision with root package name */
                final /* synthetic */ v1<Float> f38108f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                b(x2.d dVar, y yVar, v1<? extends h00.l<? super x2.d, s1.f>> v1Var, c1.o0<s1.f> o0Var, v1<? extends h00.l<? super x2.d, s1.f>> v1Var2, v1<Float> v1Var3) {
                    super(0);
                    this.f38103a = dVar;
                    this.f38104b = yVar;
                    this.f38105c = v1Var;
                    this.f38106d = o0Var;
                    this.f38107e = v1Var2;
                    this.f38108f = v1Var3;
                }

                @Override // h00.a
                public /* bridge */ /* synthetic */ vz.b0 invoke() {
                    invoke2();
                    return vz.b0.f54756a;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    long b11;
                    long t11 = ((s1.f) c.i(this.f38105c).invoke(this.f38103a)).t();
                    if (s1.g.c(c.g(this.f38106d)) && s1.g.c(t11)) {
                        y yVar = this.f38104b;
                        long q11 = s1.f.q(c.g(this.f38106d), t11);
                        Object invoke = c.j(this.f38107e).invoke(this.f38103a);
                        c1.o0<s1.f> o0Var = this.f38106d;
                        long t12 = ((s1.f) invoke).t();
                        if (s1.g.c(t12)) {
                            b11 = s1.f.q(c.g(o0Var), t12);
                        } else {
                            b11 = s1.f.f49950b.b();
                        }
                        yVar.a(q11, b11, c.k(this.f38108f));
                        return;
                    }
                    this.f38104b.dismiss();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(z zVar, u uVar, View view, x2.d dVar, float f11, kotlinx.coroutines.flow.t<vz.b0> tVar, v1<? extends h00.l<? super x2.d, s1.f>> v1Var, c1.o0<s1.f> o0Var, v1<? extends h00.l<? super x2.d, s1.f>> v1Var2, v1<Float> v1Var3, zz.d<? super a> dVar2) {
                super(2, dVar2);
                this.f38091c = zVar;
                this.f38092d = uVar;
                this.f38093e = view;
                this.f38094f = dVar;
                this.f38095g = f11;
                this.f38096h = tVar;
                this.f38097i = v1Var;
                this.f38098j = o0Var;
                this.f38099k = v1Var2;
                this.f38100l = v1Var3;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
                a aVar = new a(this.f38091c, this.f38092d, this.f38093e, this.f38094f, this.f38095g, this.f38096h, this.f38097i, this.f38098j, this.f38099k, this.f38100l, dVar);
                aVar.f38090b = obj;
                return aVar;
            }

            @Override // h00.p
            public final Object invoke(o0 o0Var, zz.d<? super vz.b0> dVar) {
                return ((a) create(o0Var, dVar)).invokeSuspend(vz.b0.f54756a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object d11;
                y yVar;
                d11 = a00.d.d();
                int i11 = this.f38089a;
                if (i11 == 0) {
                    vz.r.b(obj);
                    y b11 = this.f38091c.b(this.f38092d, this.f38093e, this.f38094f, this.f38095g);
                    kotlinx.coroutines.flow.g.z(kotlinx.coroutines.flow.g.B(this.f38096h, new C0729a(b11, null)), (o0) this.f38090b);
                    try {
                        kotlinx.coroutines.flow.e n11 = n1.n(new b(this.f38094f, b11, this.f38097i, this.f38098j, this.f38099k, this.f38100l));
                        this.f38090b = b11;
                        this.f38089a = 1;
                        if (kotlinx.coroutines.flow.g.f(n11, this) == d11) {
                            return d11;
                        }
                        yVar = b11;
                    } catch (Throwable th2) {
                        th = th2;
                        yVar = b11;
                        yVar.dismiss();
                        throw th;
                    }
                } else if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    yVar = (y) this.f38090b;
                    try {
                        vz.r.b(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        yVar.dismiss();
                        throw th;
                    }
                }
                yVar.dismiss();
                return vz.b0.f54756a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public static final class b extends kotlin.jvm.internal.u implements h00.l<f2.o, vz.b0> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ c1.o0<s1.f> f38109a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(c1.o0<s1.f> o0Var) {
                super(1);
                this.f38109a = o0Var;
            }

            public final void a(f2.o it2) {
                kotlin.jvm.internal.s.g(it2, "it");
                c.h(this.f38109a, f2.p.e(it2));
            }

            @Override // h00.l
            public /* bridge */ /* synthetic */ vz.b0 invoke(f2.o oVar) {
                a(oVar);
                return vz.b0.f54756a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: m0.t$c$c  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0730c extends kotlin.jvm.internal.u implements h00.l<v1.e, vz.b0> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.flow.t<vz.b0> f38110a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0730c(kotlinx.coroutines.flow.t<vz.b0> tVar) {
                super(1);
                this.f38110a = tVar;
            }

            public final void a(v1.e drawBehind) {
                kotlin.jvm.internal.s.g(drawBehind, "$this$drawBehind");
                this.f38110a.b(vz.b0.f54756a);
            }

            @Override // h00.l
            public /* bridge */ /* synthetic */ vz.b0 invoke(v1.e eVar) {
                a(eVar);
                return vz.b0.f54756a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(h00.l<? super x2.d, s1.f> lVar, h00.l<? super x2.d, s1.f> lVar2, float f11, z zVar, u uVar) {
            super(3);
            this.f38084a = lVar;
            this.f38085b = lVar2;
            this.f38086c = f11;
            this.f38087d = zVar;
            this.f38088e = uVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final long g(c1.o0<s1.f> o0Var) {
            return o0Var.getValue().t();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void h(c1.o0<s1.f> o0Var, long j11) {
            o0Var.setValue(s1.f.d(j11));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final h00.l<x2.d, s1.f> i(v1<? extends h00.l<? super x2.d, s1.f>> v1Var) {
            return (h00.l) v1Var.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final h00.l<x2.d, s1.f> j(v1<? extends h00.l<? super x2.d, s1.f>> v1Var) {
            return (h00.l) v1Var.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final float k(v1<Float> v1Var) {
            return v1Var.getValue().floatValue();
        }

        public final o1.f f(o1.f composed, c1.i iVar, int i11) {
            kotlin.jvm.internal.s.g(composed, "$this$composed");
            iVar.x(1676523321);
            View view = (View) iVar.A(androidx.compose.ui.platform.z.k());
            x2.d dVar = (x2.d) iVar.A(l0.d());
            iVar.x(-3687241);
            Object y11 = iVar.y();
            i.a aVar = c1.i.f8486a;
            if (y11 == aVar.a()) {
                y11 = s1.d(s1.f.d(s1.f.f49950b.b()), null, 2, null);
                iVar.p(y11);
            }
            iVar.N();
            c1.o0 o0Var = (c1.o0) y11;
            v1 m11 = n1.m(this.f38084a, iVar, 0);
            v1 m12 = n1.m(this.f38085b, iVar, 0);
            v1 m13 = n1.m(Float.valueOf(this.f38086c), iVar, 0);
            iVar.x(-3687241);
            Object y12 = iVar.y();
            if (y12 == aVar.a()) {
                y12 = kotlinx.coroutines.flow.a0.b(1, 0, kotlinx.coroutines.channels.a.DROP_OLDEST, 2, null);
                iVar.p(y12);
            }
            iVar.N();
            kotlinx.coroutines.flow.t tVar = (kotlinx.coroutines.flow.t) y12;
            float f11 = this.f38087d.a() ? BitmapDescriptorFactory.HUE_RED : this.f38086c;
            u uVar = this.f38088e;
            c1.b0.g(new Object[]{view, dVar, Float.valueOf(f11), uVar, Boolean.valueOf(kotlin.jvm.internal.s.c(uVar, u.f38111g.b()))}, new a(this.f38087d, this.f38088e, view, dVar, this.f38086c, tVar, m11, o0Var, m12, m13, null), iVar, 8);
            o1.f a11 = q1.i.a(g0.a(composed, new b(o0Var)), new C0730c(tVar));
            iVar.N();
            return a11;
        }

        @Override // h00.q
        public /* bridge */ /* synthetic */ o1.f invoke(o1.f fVar, c1.i iVar, Integer num) {
            return f(fVar, iVar, num.intValue());
        }
    }

    public static final boolean a(int i11) {
        return i11 >= 28;
    }

    public static /* synthetic */ boolean b(int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = Build.VERSION.SDK_INT;
        }
        return a(i11);
    }

    public static final o1.f c(o1.f fVar, h00.l<? super x2.d, s1.f> sourceCenter, h00.l<? super x2.d, s1.f> magnifierCenter, float f11, u style) {
        kotlin.jvm.internal.s.g(fVar, "<this>");
        kotlin.jvm.internal.s.g(sourceCenter, "sourceCenter");
        kotlin.jvm.internal.s.g(magnifierCenter, "magnifierCenter");
        kotlin.jvm.internal.s.g(style, "style");
        h00.l aVar = x0.c() ? new a(sourceCenter, magnifierCenter, f11, style) : x0.a();
        o1.f fVar2 = o1.f.f42062f1;
        if (b(0, 1, null)) {
            fVar2 = d(fVar2, sourceCenter, magnifierCenter, f11, style, z.f38136a.a());
        }
        return x0.b(fVar, aVar, fVar2);
    }

    public static final o1.f d(o1.f fVar, h00.l<? super x2.d, s1.f> sourceCenter, h00.l<? super x2.d, s1.f> magnifierCenter, float f11, u style, z platformMagnifierFactory) {
        kotlin.jvm.internal.s.g(fVar, "<this>");
        kotlin.jvm.internal.s.g(sourceCenter, "sourceCenter");
        kotlin.jvm.internal.s.g(magnifierCenter, "magnifierCenter");
        kotlin.jvm.internal.s.g(style, "style");
        kotlin.jvm.internal.s.g(platformMagnifierFactory, "platformMagnifierFactory");
        return o1.e.b(fVar, null, new c(sourceCenter, magnifierCenter, f11, platformMagnifierFactory, style), 1, null);
    }

    public static /* synthetic */ o1.f e(o1.f fVar, h00.l lVar, h00.l lVar2, float f11, u uVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            lVar2 = b.f38083a;
        }
        if ((i11 & 4) != 0) {
            f11 = Float.NaN;
        }
        if ((i11 & 8) != 0) {
            uVar = u.f38111g.a();
        }
        return c(fVar, lVar, lVar2, f11, uVar);
    }
}