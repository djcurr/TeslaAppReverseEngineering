package y0;

import androidx.compose.ui.platform.y1;
import c1.a2;
import c1.i;
import c1.v1;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import h2.a;
import java.util.Map;
import o1.f;
import v1.e;
import y0.d1;

/* loaded from: classes.dex */
public final class m0 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class a extends kotlin.jvm.internal.u implements h00.q<p0.f, c1.i, Integer, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ n0 f58406a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f58407b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ t1.c1 f58408c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ long f58409d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ long f58410e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ float f58411f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ h00.p<c1.i, Integer, vz.b0> f58412g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ long f58413h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ v20.o0 f58414i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ h00.q<p0.i, c1.i, Integer, vz.b0> f58415j;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: y0.m0$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C1327a extends kotlin.jvm.internal.u implements h00.a<vz.b0> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ n0 f58416a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ v20.o0 f58417b;

            /* JADX INFO: Access modifiers changed from: package-private */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$1$1$1", f = "ModalBottomSheet.kt", l = {256}, m = "invokeSuspend")
            /* renamed from: y0.m0$a$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C1328a extends kotlin.coroutines.jvm.internal.l implements h00.p<v20.o0, zz.d<? super vz.b0>, Object> {

                /* renamed from: a  reason: collision with root package name */
                int f58418a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ n0 f58419b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C1328a(n0 n0Var, zz.d<? super C1328a> dVar) {
                    super(2, dVar);
                    this.f58419b = n0Var;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
                    return new C1328a(this.f58419b, dVar);
                }

                @Override // h00.p
                public final Object mo160invoke(v20.o0 o0Var, zz.d<? super vz.b0> dVar) {
                    return ((C1328a) create(o0Var, dVar)).invokeSuspend(vz.b0.f54756a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object d11;
                    d11 = a00.d.d();
                    int i11 = this.f58418a;
                    if (i11 == 0) {
                        vz.r.b(obj);
                        n0 n0Var = this.f58419b;
                        this.f58418a = 1;
                        if (n0Var.N(this) == d11) {
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
            C1327a(n0 n0Var, v20.o0 o0Var) {
                super(0);
                this.f58416a = n0Var;
                this.f58417b = o0Var;
            }

            @Override // h00.a
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ vz.b0 mo11invoke() {
                invoke2();
                return vz.b0.f54756a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                if (this.f58416a.n().mo12invoke(o0.Hidden).booleanValue()) {
                    v20.k.d(this.f58417b, null, null, new C1328a(this.f58416a, null), 3, null);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public static final class b extends kotlin.jvm.internal.u implements h00.l<x2.d, x2.k> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ n0 f58420a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ float f58421b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(n0 n0Var, float f11) {
                super(1);
                this.f58420a = n0Var;
                this.f58421b = f11;
            }

            public final long a(x2.d offset) {
                int c11;
                kotlin.jvm.internal.s.g(offset, "$this$offset");
                if (this.f58420a.l().isEmpty()) {
                    c11 = j00.c.c(this.f58421b);
                } else {
                    c11 = j00.c.c(this.f58420a.s().getValue().floatValue());
                }
                return x2.l.a(0, c11);
            }

            @Override // h00.l
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ x2.k mo12invoke(x2.d dVar) {
                return x2.k.b(a(dVar));
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public static final class c extends kotlin.jvm.internal.u implements h00.l<f2.o, vz.b0> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ c1.o0<Float> f58422a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(c1.o0<Float> o0Var) {
                super(1);
                this.f58422a = o0Var;
            }

            public final void a(f2.o it2) {
                kotlin.jvm.internal.s.g(it2, "it");
                this.f58422a.setValue(Float.valueOf(x2.o.f(it2.e())));
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
        public static final class d extends kotlin.jvm.internal.u implements h00.l<l2.v, vz.b0> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ n0 f58423a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ v20.o0 f58424b;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: y0.m0$a$d$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C1329a extends kotlin.jvm.internal.u implements h00.a<Boolean> {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ n0 f58425a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ v20.o0 f58426b;

                /* JADX INFO: Access modifiers changed from: package-private */
                @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$4$1$1", f = "ModalBottomSheet.kt", l = {284}, m = "invokeSuspend")
                /* renamed from: y0.m0$a$d$a$a  reason: collision with other inner class name */
                /* loaded from: classes.dex */
                public static final class C1330a extends kotlin.coroutines.jvm.internal.l implements h00.p<v20.o0, zz.d<? super vz.b0>, Object> {

                    /* renamed from: a  reason: collision with root package name */
                    int f58427a;

                    /* renamed from: b  reason: collision with root package name */
                    final /* synthetic */ n0 f58428b;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C1330a(n0 n0Var, zz.d<? super C1330a> dVar) {
                        super(2, dVar);
                        this.f58428b = n0Var;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
                        return new C1330a(this.f58428b, dVar);
                    }

                    @Override // h00.p
                    public final Object mo160invoke(v20.o0 o0Var, zz.d<? super vz.b0> dVar) {
                        return ((C1330a) create(o0Var, dVar)).invokeSuspend(vz.b0.f54756a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        Object d11;
                        d11 = a00.d.d();
                        int i11 = this.f58427a;
                        if (i11 == 0) {
                            vz.r.b(obj);
                            n0 n0Var = this.f58428b;
                            this.f58427a = 1;
                            if (n0Var.N(this) == d11) {
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
                C1329a(n0 n0Var, v20.o0 o0Var) {
                    super(0);
                    this.f58425a = n0Var;
                    this.f58426b = o0Var;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // h00.a
                /* renamed from: invoke */
                public final Boolean mo11invoke() {
                    if (this.f58425a.n().mo12invoke(o0.Hidden).booleanValue()) {
                        v20.k.d(this.f58426b, null, null, new C1330a(this.f58425a, null), 3, null);
                    }
                    return Boolean.TRUE;
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* loaded from: classes.dex */
            public static final class b extends kotlin.jvm.internal.u implements h00.a<Boolean> {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ n0 f58429a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ v20.o0 f58430b;

                /* JADX INFO: Access modifiers changed from: package-private */
                @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$4$2$1", f = "ModalBottomSheet.kt", l = {291}, m = "invokeSuspend")
                /* renamed from: y0.m0$a$d$b$a  reason: collision with other inner class name */
                /* loaded from: classes.dex */
                public static final class C1331a extends kotlin.coroutines.jvm.internal.l implements h00.p<v20.o0, zz.d<? super vz.b0>, Object> {

                    /* renamed from: a  reason: collision with root package name */
                    int f58431a;

                    /* renamed from: b  reason: collision with root package name */
                    final /* synthetic */ n0 f58432b;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C1331a(n0 n0Var, zz.d<? super C1331a> dVar) {
                        super(2, dVar);
                        this.f58432b = n0Var;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
                        return new C1331a(this.f58432b, dVar);
                    }

                    @Override // h00.p
                    public final Object mo160invoke(v20.o0 o0Var, zz.d<? super vz.b0> dVar) {
                        return ((C1331a) create(o0Var, dVar)).invokeSuspend(vz.b0.f54756a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        Object d11;
                        d11 = a00.d.d();
                        int i11 = this.f58431a;
                        if (i11 == 0) {
                            vz.r.b(obj);
                            n0 n0Var = this.f58432b;
                            this.f58431a = 1;
                            if (n0Var.K(this) == d11) {
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
                b(n0 n0Var, v20.o0 o0Var) {
                    super(0);
                    this.f58429a = n0Var;
                    this.f58430b = o0Var;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // h00.a
                /* renamed from: invoke */
                public final Boolean mo11invoke() {
                    if (this.f58429a.n().mo12invoke(o0.Expanded).booleanValue()) {
                        v20.k.d(this.f58430b, null, null, new C1331a(this.f58429a, null), 3, null);
                    }
                    return Boolean.TRUE;
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* loaded from: classes.dex */
            public static final class c extends kotlin.jvm.internal.u implements h00.a<Boolean> {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ n0 f58433a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ v20.o0 f58434b;

                /* JADX INFO: Access modifiers changed from: package-private */
                @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$4$3$1", f = "ModalBottomSheet.kt", l = {298}, m = "invokeSuspend")
                /* renamed from: y0.m0$a$d$c$a  reason: collision with other inner class name */
                /* loaded from: classes.dex */
                public static final class C1332a extends kotlin.coroutines.jvm.internal.l implements h00.p<v20.o0, zz.d<? super vz.b0>, Object> {

                    /* renamed from: a  reason: collision with root package name */
                    int f58435a;

                    /* renamed from: b  reason: collision with root package name */
                    final /* synthetic */ n0 f58436b;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C1332a(n0 n0Var, zz.d<? super C1332a> dVar) {
                        super(2, dVar);
                        this.f58436b = n0Var;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
                        return new C1332a(this.f58436b, dVar);
                    }

                    @Override // h00.p
                    public final Object mo160invoke(v20.o0 o0Var, zz.d<? super vz.b0> dVar) {
                        return ((C1332a) create(o0Var, dVar)).invokeSuspend(vz.b0.f54756a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        Object d11;
                        d11 = a00.d.d();
                        int i11 = this.f58435a;
                        if (i11 == 0) {
                            vz.r.b(obj);
                            n0 n0Var = this.f58436b;
                            this.f58435a = 1;
                            if (n0Var.M(this) == d11) {
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
                c(n0 n0Var, v20.o0 o0Var) {
                    super(0);
                    this.f58433a = n0Var;
                    this.f58434b = o0Var;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // h00.a
                /* renamed from: invoke */
                public final Boolean mo11invoke() {
                    if (this.f58433a.n().mo12invoke(o0.HalfExpanded).booleanValue()) {
                        v20.k.d(this.f58434b, null, null, new C1332a(this.f58433a, null), 3, null);
                    }
                    return Boolean.TRUE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(n0 n0Var, v20.o0 o0Var) {
                super(1);
                this.f58423a = n0Var;
                this.f58424b = o0Var;
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
                if (this.f58423a.P()) {
                    l2.t.k(semantics, null, new C1329a(this.f58423a, this.f58424b), 1, null);
                    if (this.f58423a.o() == o0.HalfExpanded) {
                        l2.t.n(semantics, null, new b(this.f58423a, this.f58424b), 1, null);
                    } else if (this.f58423a.O()) {
                        l2.t.c(semantics, null, new c(this.f58423a, this.f58424b), 1, null);
                    }
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public static final class e extends kotlin.jvm.internal.u implements h00.p<c1.i, Integer, vz.b0> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ h00.q<p0.i, c1.i, Integer, vz.b0> f58437a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ int f58438b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            e(h00.q<? super p0.i, ? super c1.i, ? super Integer, vz.b0> qVar, int i11) {
                super(2);
                this.f58437a = qVar;
                this.f58438b = i11;
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
                h00.q<p0.i, c1.i, Integer, vz.b0> qVar = this.f58437a;
                int i12 = (this.f58438b << 9) & 7168;
                iVar.x(-1113030915);
                f.a aVar = o1.f.f42062f1;
                int i13 = i12 >> 3;
                f2.z a11 = p0.h.a(p0.a.f45228a.h(), o1.a.f42039a.h(), iVar, (i13 & 112) | (i13 & 14));
                iVar.x(1376089394);
                x2.d dVar = (x2.d) iVar.A(androidx.compose.ui.platform.l0.d());
                x2.q qVar2 = (x2.q) iVar.A(androidx.compose.ui.platform.l0.i());
                y1 y1Var = (y1) iVar.A(androidx.compose.ui.platform.l0.m());
                a.C0551a c0551a = h2.a.Y0;
                h00.a<h2.a> a12 = c0551a.a();
                h00.q<c1.g1<h2.a>, c1.i, Integer, vz.b0> b11 = f2.u.b(aVar);
                int i14 = ((((i12 << 3) & 112) << 9) & 7168) | 6;
                if (!(iVar.k() instanceof c1.e)) {
                    c1.h.c();
                }
                iVar.D();
                if (iVar.f()) {
                    iVar.s(a12);
                } else {
                    iVar.o();
                }
                iVar.E();
                c1.i a13 = a2.a(iVar);
                a2.c(a13, a11, c0551a.d());
                a2.c(a13, dVar, c0551a.b());
                a2.c(a13, qVar2, c0551a.c());
                a2.c(a13, y1Var, c0551a.f());
                iVar.c();
                b11.invoke(c1.g1.a(c1.g1.b(iVar)), iVar, Integer.valueOf((i14 >> 3) & 112));
                iVar.x(2058660585);
                iVar.x(276693625);
                if (((((i14 >> 9) & 14) & 11) ^ 2) == 0 && iVar.i()) {
                    iVar.G();
                } else {
                    qVar.invoke(p0.j.f45341a, iVar, Integer.valueOf(((i12 >> 6) & 112) | 6));
                }
                iVar.N();
                iVar.N();
                iVar.q();
                iVar.N();
                iVar.N();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(n0 n0Var, int i11, t1.c1 c1Var, long j11, long j12, float f11, h00.p<? super c1.i, ? super Integer, vz.b0> pVar, long j13, v20.o0 o0Var, h00.q<? super p0.i, ? super c1.i, ? super Integer, vz.b0> qVar) {
            super(3);
            this.f58406a = n0Var;
            this.f58407b = i11;
            this.f58408c = c1Var;
            this.f58409d = j11;
            this.f58410e = j12;
            this.f58411f = f11;
            this.f58412g = pVar;
            this.f58413h = j13;
            this.f58414i = o0Var;
            this.f58415j = qVar;
        }

        @Override // h00.q
        public /* bridge */ /* synthetic */ vz.b0 invoke(p0.f fVar, c1.i iVar, Integer num) {
            invoke(fVar, iVar, num.intValue());
            return vz.b0.f54756a;
        }

        public final void invoke(p0.f BoxWithConstraints, c1.i iVar, int i11) {
            int i12;
            float f11;
            kotlin.jvm.internal.s.g(BoxWithConstraints, "$this$BoxWithConstraints");
            if ((i11 & 14) == 0) {
                i12 = i11 | (iVar.O(BoxWithConstraints) ? 4 : 2);
            } else {
                i12 = i11;
            }
            if (((i12 & 91) ^ 18) == 0 && iVar.i()) {
                iVar.G();
                return;
            }
            float m11 = x2.b.m(BoxWithConstraints.b());
            iVar.x(-3687241);
            Object y11 = iVar.y();
            i.a aVar = c1.i.f8486a;
            if (y11 == aVar.a()) {
                y11 = c1.s1.d(null, null, 2, null);
                iVar.p(y11);
            }
            iVar.N();
            c1.o0 o0Var = (c1.o0) y11;
            f.a aVar2 = o1.f.f42062f1;
            o1.f l11 = p0.e0.l(aVar2, BitmapDescriptorFactory.HUE_RED, 1, null);
            h00.p<c1.i, Integer, vz.b0> pVar = this.f58412g;
            int i13 = this.f58407b;
            long j11 = this.f58413h;
            n0 n0Var = this.f58406a;
            v20.o0 o0Var2 = this.f58414i;
            iVar.x(-1990474327);
            f2.z i14 = p0.c.i(o1.a.f42039a.k(), false, iVar, 0);
            iVar.x(1376089394);
            x2.d dVar = (x2.d) iVar.A(androidx.compose.ui.platform.l0.d());
            x2.q qVar = (x2.q) iVar.A(androidx.compose.ui.platform.l0.i());
            y1 y1Var = (y1) iVar.A(androidx.compose.ui.platform.l0.m());
            a.C0551a c0551a = h2.a.Y0;
            h00.a<h2.a> a11 = c0551a.a();
            h00.q<c1.g1<h2.a>, c1.i, Integer, vz.b0> b11 = f2.u.b(l11);
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
            a2.c(a12, i14, c0551a.d());
            a2.c(a12, dVar, c0551a.b());
            a2.c(a12, qVar, c0551a.c());
            a2.c(a12, y1Var, c0551a.f());
            iVar.c();
            b11.invoke(c1.g1.a(c1.g1.b(iVar)), iVar, 0);
            iVar.x(2058660585);
            iVar.x(-1253629305);
            p0.d dVar2 = p0.d.f45270a;
            iVar.x(-1295131076);
            pVar.mo160invoke(iVar, Integer.valueOf((i13 >> 24) & 14));
            m0.b(j11, new C1327a(n0Var, o0Var2), n0Var.u() != o0.Hidden, iVar, (i13 >> 21) & 14);
            iVar.N();
            iVar.N();
            iVar.N();
            iVar.q();
            iVar.N();
            iVar.N();
            o1.f b12 = c2.f.b(p0.e0.n(aVar2, BitmapDescriptorFactory.HUE_RED, 1, null), this.f58406a.L(), null, 2, null);
            Object obj = this.f58406a;
            Object valueOf = Float.valueOf(m11);
            n0 n0Var2 = this.f58406a;
            iVar.x(-3686552);
            boolean O = iVar.O(obj) | iVar.O(valueOf);
            Object y12 = iVar.y();
            if (O || y12 == aVar.a()) {
                f11 = m11;
                y12 = new b(n0Var2, f11);
                iVar.p(y12);
            } else {
                f11 = m11;
            }
            iVar.N();
            o1.f g11 = m0.g(p0.r.a(b12, (h00.l) y12), this.f58406a, f11, o0Var);
            iVar.x(-3686930);
            boolean O2 = iVar.O(o0Var);
            Object y13 = iVar.y();
            if (O2 || y13 == aVar.a()) {
                y13 = new c(o0Var);
                iVar.p(y13);
            }
            iVar.N();
            o1.f b13 = l2.o.b(f2.g0.a(g11, (h00.l) y13), false, new d(this.f58406a, this.f58414i), 1, null);
            t1.c1 c1Var = this.f58408c;
            long j12 = this.f58409d;
            long j13 = this.f58410e;
            float f12 = this.f58411f;
            j1.a b14 = j1.c.b(iVar, -819902168, true, new e(this.f58415j, this.f58407b));
            int i15 = this.f58407b;
            b1.b(b13, c1Var, j12, j13, null, f12, b14, iVar, 1572864 | ((i15 >> 6) & 112) | ((i15 >> 9) & 896) | ((i15 >> 9) & 7168) | ((i15 << 3) & 458752), 16);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends kotlin.jvm.internal.u implements h00.p<c1.i, Integer, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h00.q<p0.i, c1.i, Integer, vz.b0> f58439a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ o1.f f58440b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ n0 f58441c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ t1.c1 f58442d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ float f58443e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ long f58444f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ long f58445g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ long f58446h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ h00.p<c1.i, Integer, vz.b0> f58447i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ int f58448j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ int f58449k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(h00.q<? super p0.i, ? super c1.i, ? super Integer, vz.b0> qVar, o1.f fVar, n0 n0Var, t1.c1 c1Var, float f11, long j11, long j12, long j13, h00.p<? super c1.i, ? super Integer, vz.b0> pVar, int i11, int i12) {
            super(2);
            this.f58439a = qVar;
            this.f58440b = fVar;
            this.f58441c = n0Var;
            this.f58442d = c1Var;
            this.f58443e = f11;
            this.f58444f = j11;
            this.f58445g = j12;
            this.f58446h = j13;
            this.f58447i = pVar;
            this.f58448j = i11;
            this.f58449k = i12;
        }

        @Override // h00.p
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ vz.b0 mo160invoke(c1.i iVar, Integer num) {
            invoke(iVar, num.intValue());
            return vz.b0.f54756a;
        }

        public final void invoke(c1.i iVar, int i11) {
            m0.a(this.f58439a, this.f58440b, this.f58441c, this.f58442d, this.f58443e, this.f58444f, this.f58445g, this.f58446h, this.f58447i, iVar, this.f58448j | 1, this.f58449k);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class c extends kotlin.jvm.internal.u implements h00.l<v1.e, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f58450a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ v1<Float> f58451b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(long j11, v1<Float> v1Var) {
            super(1);
            this.f58450a = j11;
            this.f58451b = v1Var;
        }

        public final void a(v1.e Canvas) {
            kotlin.jvm.internal.s.g(Canvas, "$this$Canvas");
            e.b.j(Canvas, this.f58450a, 0L, 0L, m0.c(this.f58451b), null, null, 0, 118, null);
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
    public static final class d extends kotlin.jvm.internal.u implements h00.p<c1.i, Integer, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f58452a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h00.a<vz.b0> f58453b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f58454c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f58455d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(long j11, h00.a<vz.b0> aVar, boolean z11, int i11) {
            super(2);
            this.f58452a = j11;
            this.f58453b = aVar;
            this.f58454c = z11;
            this.f58455d = i11;
        }

        @Override // h00.p
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ vz.b0 mo160invoke(c1.i iVar, Integer num) {
            invoke(iVar, num.intValue());
            return vz.b0.f54756a;
        }

        public final void invoke(c1.i iVar, int i11) {
            m0.b(this.f58452a, this.f58453b, this.f58454c, iVar, this.f58455d | 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.ModalBottomSheetKt$Scrim$dismissModifier$1$1", f = "ModalBottomSheet.kt", l = {364}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class e extends kotlin.coroutines.jvm.internal.l implements h00.p<d2.c0, zz.d<? super vz.b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f58456a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f58457b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h00.a<vz.b0> f58458c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public static final class a extends kotlin.jvm.internal.u implements h00.l<s1.f, vz.b0> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ h00.a<vz.b0> f58459a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(h00.a<vz.b0> aVar) {
                super(1);
                this.f58459a = aVar;
            }

            @Override // h00.l
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ vz.b0 mo12invoke(s1.f fVar) {
                m1134invokek4lQ0M(fVar.t());
                return vz.b0.f54756a;
            }

            /* renamed from: invoke-k-4lQ0M  reason: not valid java name */
            public final void m1134invokek4lQ0M(long j11) {
                this.f58459a.mo11invoke();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(h00.a<vz.b0> aVar, zz.d<? super e> dVar) {
            super(2, dVar);
            this.f58458c = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
            e eVar = new e(this.f58458c, dVar);
            eVar.f58457b = obj;
            return eVar;
        }

        @Override // h00.p
        public final Object mo160invoke(d2.c0 c0Var, zz.d<? super vz.b0> dVar) {
            return ((e) create(c0Var, dVar)).invokeSuspend(vz.b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d11;
            d11 = a00.d.d();
            int i11 = this.f58456a;
            if (i11 == 0) {
                vz.r.b(obj);
                d2.c0 c0Var = (d2.c0) this.f58457b;
                a aVar = new a(this.f58458c);
                this.f58456a = 1;
                if (n0.i0.k(c0Var, null, null, null, aVar, this, 7, null) == d11) {
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
    public static final class f extends kotlin.jvm.internal.u implements h00.l<l2.v, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f58460a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h00.a<vz.b0> f58461b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public static final class a extends kotlin.jvm.internal.u implements h00.a<Boolean> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ h00.a<vz.b0> f58462a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(h00.a<vz.b0> aVar) {
                super(0);
                this.f58462a = aVar;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // h00.a
            /* renamed from: invoke */
            public final Boolean mo11invoke() {
                this.f58462a.mo11invoke();
                return Boolean.TRUE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str, h00.a<vz.b0> aVar) {
            super(1);
            this.f58460a = str;
            this.f58461b = aVar;
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
            l2.t.F(semantics, this.f58460a);
            l2.t.t(semantics, null, new a(this.f58461b), 1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class g extends kotlin.jvm.internal.u implements h00.l<o0, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final g f58463a = new g();

        g() {
            super(1);
        }

        @Override // h00.l
        /* renamed from: a */
        public final Boolean mo12invoke(o0 it2) {
            kotlin.jvm.internal.s.g(it2, "it");
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class h extends kotlin.jvm.internal.u implements h00.a<n0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o0 f58464a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ l0.i<Float> f58465b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h00.l<o0, Boolean> f58466c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        h(o0 o0Var, l0.i<Float> iVar, h00.l<? super o0, Boolean> lVar) {
            super(0);
            this.f58464a = o0Var;
            this.f58465b = iVar;
            this.f58466c = lVar;
        }

        @Override // h00.a
        /* renamed from: a */
        public final n0 mo11invoke() {
            return new n0(this.f58464a, this.f58465b, this.f58466c);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:158:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0113  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(h00.q<? super p0.i, ? super c1.i, ? super java.lang.Integer, vz.b0> r30, o1.f r31, y0.n0 r32, t1.c1 r33, float r34, long r35, long r37, long r39, h00.p<? super c1.i, ? super java.lang.Integer, vz.b0> r41, c1.i r42, int r43, int r44) {
        /*
            Method dump skipped, instructions count: 677
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y0.m0.a(h00.q, o1.f, y0.n0, t1.c1, float, long, long, long, h00.p, c1.i, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(long j11, h00.a<vz.b0> aVar, boolean z11, c1.i iVar, int i11) {
        int i12;
        o1.f fVar;
        c1.i h11 = iVar.h(1010543443);
        if ((i11 & 14) == 0) {
            i12 = (h11.e(j11) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            i12 |= h11.O(aVar) ? 32 : 16;
        }
        if ((i11 & 896) == 0) {
            i12 |= h11.a(z11) ? 256 : 128;
        }
        if (((i12 & 731) ^ 146) == 0 && h11.i()) {
            h11.G();
        } else {
            if (j11 != t1.a0.f51365b.f()) {
                v1<Float> d11 = l0.c.d(z11 ? 1.0f : 0.0f, new l0.c1(0, 0, null, 7, null), BitmapDescriptorFactory.HUE_RED, null, h11, 0, 12);
                String a11 = a1.a(z0.f58722a.b(), h11, 6);
                h11.x(1010543781);
                if (z11) {
                    f.a aVar2 = o1.f.f42062f1;
                    h11.x(-3686930);
                    boolean O = h11.O(aVar);
                    Object y11 = h11.y();
                    if (O || y11 == c1.i.f8486a.a()) {
                        y11 = new e(aVar, null);
                        h11.p(y11);
                    }
                    h11.N();
                    o1.f b11 = d2.i0.b(aVar2, aVar, (h00.p) y11);
                    h11.x(-3686552);
                    boolean O2 = h11.O(a11) | h11.O(aVar);
                    Object y12 = h11.y();
                    if (O2 || y12 == c1.i.f8486a.a()) {
                        y12 = new f(a11, aVar);
                        h11.p(y12);
                    }
                    h11.N();
                    fVar = l2.o.a(b11, true, (h00.l) y12);
                } else {
                    fVar = o1.f.f42062f1;
                }
                h11.N();
                o1.f g02 = p0.e0.l(o1.f.f42062f1, BitmapDescriptorFactory.HUE_RED, 1, null).g0(fVar);
                t1.a0 h12 = t1.a0.h(j11);
                h11.x(-3686552);
                boolean O3 = h11.O(h12) | h11.O(d11);
                Object y13 = h11.y();
                if (O3 || y13 == c1.i.f8486a.a()) {
                    y13 = new c(j11, d11);
                    h11.p(y13);
                }
                h11.N();
                m0.g.a(g02, (h00.l) y13, h11, 0);
            }
        }
        c1.e1 l11 = h11.l();
        if (l11 == null) {
            return;
        }
        l11.a(new d(j11, aVar, z11, i11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float c(v1<Float> v1Var) {
        return v1Var.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final o1.f g(o1.f fVar, n0 n0Var, float f11, v1<Float> v1Var) {
        o1.f fVar2;
        Map l11;
        Float value = v1Var.getValue();
        if (value != null) {
            float f12 = f11 / 2;
            if (value.floatValue() < f12) {
                l11 = wz.s0.l(vz.v.a(Float.valueOf(f11), o0.Hidden), vz.v.a(Float.valueOf(f11 - value.floatValue()), o0.Expanded));
            } else {
                l11 = wz.s0.l(vz.v.a(Float.valueOf(f11), o0.Hidden), vz.v.a(Float.valueOf(f12), o0.HalfExpanded), vz.v.a(Float.valueOf(Math.max((float) BitmapDescriptorFactory.HUE_RED, f11 - value.floatValue())), o0.Expanded));
            }
            fVar2 = d1.g(o1.f.f42062f1, n0Var, r8, androidx.compose.foundation.gestures.a.Vertical, (r26 & 8) != 0 ? true : n0Var.o() != o0.Hidden, (r26 & 16) != 0 ? false : false, (r26 & 32) != 0 ? null : null, (r26 & 64) != 0 ? d1.b.f57989a : null, (r26 & 128) != 0 ? c1.d(c1.f57955a, l11.keySet(), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 6, null) : null, (r26 & 256) != 0 ? c1.f57955a.b() : BitmapDescriptorFactory.HUE_RED);
        } else {
            fVar2 = o1.f.f42062f1;
        }
        return fVar.g0(fVar2);
    }

    public static final n0 h(o0 initialValue, l0.i<Float> iVar, h00.l<? super o0, Boolean> lVar, c1.i iVar2, int i11, int i12) {
        kotlin.jvm.internal.s.g(initialValue, "initialValue");
        iVar2.x(170040195);
        if ((i12 & 2) != 0) {
            iVar = c1.f57955a.a();
        }
        if ((i12 & 4) != 0) {
            lVar = g.f58463a;
        }
        n0 n0Var = (n0) l1.b.b(new Object[0], n0.f58483r.a(iVar, lVar), null, new h(initialValue, iVar, lVar), iVar2, 72, 4);
        iVar2.N();
        return n0Var;
    }
}