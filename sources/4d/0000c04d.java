package y0;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class d1 {

    /* loaded from: classes.dex */
    public static final class a implements c2.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e1<T> f57980a;

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.SwipeableKt$PreUpPostDownNestedScrollConnection$1", f = "Swipeable.kt", l = {882}, m = "onPostFling-RZ2iAVY")
        /* renamed from: y0.d1$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C1320a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: a  reason: collision with root package name */
            long f57981a;

            /* renamed from: b  reason: collision with root package name */
            /* synthetic */ Object f57982b;

            /* renamed from: d  reason: collision with root package name */
            int f57984d;

            C1320a(zz.d<? super C1320a> dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f57982b = obj;
                this.f57984d |= Integer.MIN_VALUE;
                return a.this.b(0L, 0L, this);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.SwipeableKt$PreUpPostDownNestedScrollConnection$1", f = "Swipeable.kt", l = {873}, m = "onPreFling-QWom1Mo")
        /* loaded from: classes.dex */
        public static final class b extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: a  reason: collision with root package name */
            long f57985a;

            /* renamed from: b  reason: collision with root package name */
            /* synthetic */ Object f57986b;

            /* renamed from: d  reason: collision with root package name */
            int f57988d;

            b(zz.d<? super b> dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f57986b = obj;
                this.f57988d |= Integer.MIN_VALUE;
                return a.this.a(0L, this);
            }
        }

        a(e1<T> e1Var) {
            this.f57980a = e1Var;
        }

        private final float e(long j11) {
            return s1.f.m(j11);
        }

        private final long f(float f11) {
            return s1.g.a(BitmapDescriptorFactory.HUE_RED, f11);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
        @Override // c2.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object a(long r7, zz.d<? super x2.u> r9) {
            /*
                r6 = this;
                boolean r0 = r9 instanceof y0.d1.a.b
                if (r0 == 0) goto L13
                r0 = r9
                y0.d1$a$b r0 = (y0.d1.a.b) r0
                int r1 = r0.f57988d
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f57988d = r1
                goto L18
            L13:
                y0.d1$a$b r0 = new y0.d1$a$b
                r0.<init>(r9)
            L18:
                java.lang.Object r9 = r0.f57986b
                java.lang.Object r1 = a00.b.d()
                int r2 = r0.f57988d
                r3 = 1
                if (r2 == 0) goto L33
                if (r2 != r3) goto L2b
                long r7 = r0.f57985a
                vz.r.b(r9)
                goto L78
            L2b:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L33:
                vz.r.b(r9)
                float r9 = x2.u.h(r7)
                float r2 = x2.u.i(r7)
                long r4 = s1.g.a(r9, r2)
                float r9 = r6.e(r4)
                r2 = 0
                int r2 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
                if (r2 >= 0) goto L72
                y0.e1<T> r2 = r6.f57980a
                c1.v1 r2 = r2.s()
                java.lang.Object r2 = r2.getValue()
                java.lang.Number r2 = (java.lang.Number) r2
                float r2 = r2.floatValue()
                y0.e1<T> r4 = r6.f57980a
                float r4 = r4.r()
                int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r2 <= 0) goto L72
                y0.e1<T> r2 = r6.f57980a
                r0.f57985a = r7
                r0.f57988d = r3
                java.lang.Object r9 = r2.z(r9, r0)
                if (r9 != r1) goto L78
                return r1
            L72:
                x2.u$a r7 = x2.u.f56966b
                long r7 = r7.a()
            L78:
                x2.u r7 = x2.u.b(r7)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: y0.d1.a.a(long, zz.d):java.lang.Object");
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
        @Override // c2.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object b(long r5, long r7, zz.d<? super x2.u> r9) {
            /*
                r4 = this;
                boolean r5 = r9 instanceof y0.d1.a.C1320a
                if (r5 == 0) goto L13
                r5 = r9
                y0.d1$a$a r5 = (y0.d1.a.C1320a) r5
                int r6 = r5.f57984d
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r1 = r6 & r0
                if (r1 == 0) goto L13
                int r6 = r6 - r0
                r5.f57984d = r6
                goto L18
            L13:
                y0.d1$a$a r5 = new y0.d1$a$a
                r5.<init>(r9)
            L18:
                java.lang.Object r6 = r5.f57982b
                java.lang.Object r9 = a00.b.d()
                int r0 = r5.f57984d
                r1 = 1
                if (r0 == 0) goto L33
                if (r0 != r1) goto L2b
                long r7 = r5.f57981a
                vz.r.b(r6)
                goto L53
            L2b:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L33:
                vz.r.b(r6)
                y0.e1<T> r6 = r4.f57980a
                float r0 = x2.u.h(r7)
                float r2 = x2.u.i(r7)
                long r2 = s1.g.a(r0, r2)
                float r0 = r4.e(r2)
                r5.f57981a = r7
                r5.f57984d = r1
                java.lang.Object r5 = r6.z(r0, r5)
                if (r5 != r9) goto L53
                return r9
            L53:
                x2.u r5 = x2.u.b(r7)
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: y0.d1.a.b(long, long, zz.d):java.lang.Object");
        }

        @Override // c2.a
        public long c(long j11, long j12, int i11) {
            if (c2.g.d(i11, c2.g.f8750a.a())) {
                return f(this.f57980a.y(e(j12)));
            }
            return s1.f.f49950b.c();
        }

        @Override // c2.a
        public long d(long j11, int i11) {
            float e11 = e(j11);
            if (e11 < BitmapDescriptorFactory.HUE_RED && c2.g.d(i11, c2.g.f8750a.a())) {
                return f(this.f57980a.y(e11));
            }
            return s1.f.f49950b.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes.dex */
    public static final class b<T> extends kotlin.jvm.internal.u implements h00.p<T, T, b0> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f57989a = new b();

        b() {
            super(2);
        }

        @Override // h00.p
        /* renamed from: a */
        public final b0 mo160invoke(T t11, T t12) {
            return new b0(x2.g.f(56), null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class c extends kotlin.jvm.internal.u implements h00.q<o1.f, c1.i, Integer, o1.f> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Map<Float, T> f57990a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e1<T> f57991b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.gestures.a f57992c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f57993d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ o0.m f57994e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ boolean f57995f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ w0 f57996g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ h00.p<T, T, p1> f57997h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ float f57998i;

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.SwipeableKt$swipeable$3$3", f = "Swipeable.kt", l = {607}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements h00.p<v20.o0, zz.d<? super vz.b0>, Object> {

            /* renamed from: a  reason: collision with root package name */
            int f57999a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ e1<T> f58000b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ Map<Float, T> f58001c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ w0 f58002d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ x2.d f58003e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ h00.p<T, T, p1> f58004f;

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ float f58005g;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: y0.d1$c$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C1321a extends kotlin.jvm.internal.u implements h00.p<Float, Float, Float> {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ Map<Float, T> f58006a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ h00.p<T, T, p1> f58007b;

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ x2.d f58008c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C1321a(Map<Float, ? extends T> map, h00.p<? super T, ? super T, ? extends p1> pVar, x2.d dVar) {
                    super(2);
                    this.f58006a = map;
                    this.f58007b = pVar;
                    this.f58008c = dVar;
                }

                public final Float a(float f11, float f12) {
                    return Float.valueOf(this.f58007b.mo160invoke(wz.p0.j(this.f58006a, Float.valueOf(f11)), wz.p0.j(this.f58006a, Float.valueOf(f12))).a(this.f58008c, f11, f12));
                }

                @Override // h00.p
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Float mo160invoke(Float f11, Float f12) {
                    return a(f11.floatValue(), f12.floatValue());
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(e1<T> e1Var, Map<Float, ? extends T> map, w0 w0Var, x2.d dVar, h00.p<? super T, ? super T, ? extends p1> pVar, float f11, zz.d<? super a> dVar2) {
                super(2, dVar2);
                this.f58000b = e1Var;
                this.f58001c = map;
                this.f58002d = w0Var;
                this.f58003e = dVar;
                this.f58004f = pVar;
                this.f58005g = f11;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
                return new a(this.f58000b, this.f58001c, this.f58002d, this.f58003e, this.f58004f, this.f58005g, dVar);
            }

            @Override // h00.p
            public final Object mo160invoke(v20.o0 o0Var, zz.d<? super vz.b0> dVar) {
                return ((a) create(o0Var, dVar)).invokeSuspend(vz.b0.f54756a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object d11;
                d11 = a00.d.d();
                int i11 = this.f57999a;
                if (i11 == 0) {
                    vz.r.b(obj);
                    Map l11 = this.f58000b.l();
                    this.f58000b.B(this.f58001c);
                    this.f58000b.G(this.f58002d);
                    this.f58000b.H(new C1321a(this.f58001c, this.f58004f, this.f58003e));
                    this.f58000b.I(this.f58003e.i0(this.f58005g));
                    e1<T> e1Var = this.f58000b;
                    Object obj2 = this.f58001c;
                    this.f57999a = 1;
                    if (e1Var.A(l11, obj2, this) == d11) {
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
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.SwipeableKt$swipeable$3$4", f = "Swipeable.kt", l = {}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class b extends kotlin.coroutines.jvm.internal.l implements h00.q<v20.o0, Float, zz.d<? super vz.b0>, Object> {

            /* renamed from: a  reason: collision with root package name */
            int f58009a;

            /* renamed from: b  reason: collision with root package name */
            private /* synthetic */ Object f58010b;

            /* renamed from: c  reason: collision with root package name */
            /* synthetic */ float f58011c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ e1<T> f58012d;

            /* JADX INFO: Access modifiers changed from: package-private */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.SwipeableKt$swipeable$3$4$1", f = "Swipeable.kt", l = {616}, m = "invokeSuspend")
            /* loaded from: classes.dex */
            public static final class a extends kotlin.coroutines.jvm.internal.l implements h00.p<v20.o0, zz.d<? super vz.b0>, Object> {

                /* renamed from: a  reason: collision with root package name */
                int f58013a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ e1<T> f58014b;

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ float f58015c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(e1<T> e1Var, float f11, zz.d<? super a> dVar) {
                    super(2, dVar);
                    this.f58014b = e1Var;
                    this.f58015c = f11;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
                    return new a(this.f58014b, this.f58015c, dVar);
                }

                @Override // h00.p
                public final Object mo160invoke(v20.o0 o0Var, zz.d<? super vz.b0> dVar) {
                    return ((a) create(o0Var, dVar)).invokeSuspend(vz.b0.f54756a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object d11;
                    d11 = a00.d.d();
                    int i11 = this.f58013a;
                    if (i11 == 0) {
                        vz.r.b(obj);
                        e1<T> e1Var = this.f58014b;
                        float f11 = this.f58015c;
                        this.f58013a = 1;
                        if (e1Var.z(f11, this) == d11) {
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
            b(e1<T> e1Var, zz.d<? super b> dVar) {
                super(3, dVar);
                this.f58012d = e1Var;
            }

            public final Object e(v20.o0 o0Var, float f11, zz.d<? super vz.b0> dVar) {
                b bVar = new b(this.f58012d, dVar);
                bVar.f58010b = o0Var;
                bVar.f58011c = f11;
                return bVar.invokeSuspend(vz.b0.f54756a);
            }

            @Override // h00.q
            public /* bridge */ /* synthetic */ Object invoke(v20.o0 o0Var, Float f11, zz.d<? super vz.b0> dVar) {
                return e(o0Var, f11.floatValue(), dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                a00.d.d();
                if (this.f58009a == 0) {
                    vz.r.b(obj);
                    v20.k.d((v20.o0) this.f58010b, null, null, new a(this.f58012d, this.f58011c, null), 3, null);
                    return vz.b0.f54756a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(Map<Float, ? extends T> map, e1<T> e1Var, androidx.compose.foundation.gestures.a aVar, boolean z11, o0.m mVar, boolean z12, w0 w0Var, h00.p<? super T, ? super T, ? extends p1> pVar, float f11) {
            super(3);
            this.f57990a = map;
            this.f57991b = e1Var;
            this.f57992c = aVar;
            this.f57993d = z11;
            this.f57994e = mVar;
            this.f57995f = z12;
            this.f57996g = w0Var;
            this.f57997h = pVar;
            this.f57998i = f11;
        }

        public final o1.f a(o1.f composed, c1.i iVar, int i11) {
            List U;
            kotlin.jvm.internal.s.g(composed, "$this$composed");
            iVar.x(1735465469);
            if (!this.f57990a.isEmpty()) {
                U = wz.e0.U(this.f57990a.values());
                if (U.size() == this.f57990a.size()) {
                    x2.d dVar = (x2.d) iVar.A(androidx.compose.ui.platform.l0.d());
                    this.f57991b.k(this.f57990a);
                    Map<Float, T> map = this.f57990a;
                    e1<T> e1Var = this.f57991b;
                    c1.b0.e(map, e1Var, new a(e1Var, map, this.f57996g, dVar, this.f57997h, this.f57998i, null), iVar, 8);
                    o1.f k11 = n0.m.k(o1.f.f42062f1, this.f57991b.p(), this.f57992c, this.f57993d, this.f57994e, this.f57991b.x(), null, new b(this.f57991b, null), this.f57995f, 32, null);
                    iVar.N();
                    return k11;
                }
                throw new IllegalArgumentException("You cannot have two anchors mapped to the same state.".toString());
            }
            throw new IllegalArgumentException("You must have at least one anchor.".toString());
        }

        @Override // h00.q
        public /* bridge */ /* synthetic */ o1.f invoke(o1.f fVar, c1.i iVar, Integer num) {
            return a(fVar, iVar, num.intValue());
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends kotlin.jvm.internal.u implements h00.l<androidx.compose.ui.platform.y0, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e1 f58016a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Map f58017b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.gestures.a f58018c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f58019d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ boolean f58020e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ o0.m f58021f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ h00.p f58022g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ w0 f58023h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ float f58024i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(e1 e1Var, Map map, androidx.compose.foundation.gestures.a aVar, boolean z11, boolean z12, o0.m mVar, h00.p pVar, w0 w0Var, float f11) {
            super(1);
            this.f58016a = e1Var;
            this.f58017b = map;
            this.f58018c = aVar;
            this.f58019d = z11;
            this.f58020e = z12;
            this.f58021f = mVar;
            this.f58022g = pVar;
            this.f58023h = w0Var;
            this.f58024i = f11;
        }

        public final void a(androidx.compose.ui.platform.y0 y0Var) {
            kotlin.jvm.internal.s.g(y0Var, "$this$null");
            y0Var.b("swipeable");
            y0Var.a().b("state", this.f58016a);
            y0Var.a().b("anchors", this.f58017b);
            y0Var.a().b("orientation", this.f58018c);
            y0Var.a().b("enabled", Boolean.valueOf(this.f58019d));
            y0Var.a().b("reverseDirection", Boolean.valueOf(this.f58020e));
            y0Var.a().b("interactionSource", this.f58021f);
            y0Var.a().b("thresholds", this.f58022g);
            y0Var.a().b("resistance", this.f58023h);
            y0Var.a().b("velocityThreshold", x2.g.c(this.f58024i));
        }

        @Override // h00.l
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ vz.b0 mo12invoke(androidx.compose.ui.platform.y0 y0Var) {
            a(y0Var);
            return vz.b0.f54756a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003f, code lost:
        if (r3 < r6.invoke(java.lang.Float.valueOf(r0), java.lang.Float.valueOf(r5)).floatValue()) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005c, code lost:
        if (r3 > r6.invoke(java.lang.Float.valueOf(r5), java.lang.Float.valueOf(r0)).floatValue()) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:?, code lost:
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:?, code lost:
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final float c(float r3, float r4, java.util.Set<java.lang.Float> r5, h00.p<? super java.lang.Float, ? super java.lang.Float, java.lang.Float> r6, float r7, float r8) {
        /*
            java.util.List r5 = d(r3, r5)
            int r0 = r5.size()
            if (r0 == 0) goto L6c
            r1 = 0
            r2 = 1
            if (r0 == r2) goto L62
            java.lang.Object r0 = r5.get(r1)
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            java.lang.Object r5 = r5.get(r2)
            java.lang.Number r5 = (java.lang.Number) r5
            float r5 = r5.floatValue()
            int r4 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r4 > 0) goto L42
            int r4 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r4 < 0) goto L2b
            return r5
        L2b:
            java.lang.Float r4 = java.lang.Float.valueOf(r0)
            java.lang.Float r7 = java.lang.Float.valueOf(r5)
            java.lang.Object r4 = r6.mo160invoke(r4, r7)
            java.lang.Number r4 = (java.lang.Number) r4
            float r4 = r4.floatValue()
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 >= 0) goto L5e
            goto L60
        L42:
            float r4 = -r8
            int r4 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r4 > 0) goto L48
            return r0
        L48:
            java.lang.Float r4 = java.lang.Float.valueOf(r5)
            java.lang.Float r7 = java.lang.Float.valueOf(r0)
            java.lang.Object r4 = r6.mo160invoke(r4, r7)
            java.lang.Number r4 = (java.lang.Number) r4
            float r4 = r4.floatValue()
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 <= 0) goto L60
        L5e:
            r4 = r5
            goto L6c
        L60:
            r4 = r0
            goto L6c
        L62:
            java.lang.Object r3 = r5.get(r1)
            java.lang.Number r3 = (java.lang.Number) r3
            float r4 = r3.floatValue()
        L6c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: y0.d1.c(float, float, java.util.Set, h00.p, float, float):float");
    }

    private static final List<Float> d(float f11, Set<Float> set) {
        Float s02;
        Float u02;
        List<Float> l11;
        List<Float> d11;
        List<Float> d12;
        List<Float> m11;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it2 = set.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (((double) ((Number) next).floatValue()) <= ((double) f11) + 0.001d) {
                arrayList.add(next);
            }
        }
        s02 = wz.e0.s0(arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : set) {
            if (((double) ((Number) obj).floatValue()) >= ((double) f11) - 0.001d) {
                arrayList2.add(obj);
            }
        }
        u02 = wz.e0.u0(arrayList2);
        if (s02 == null) {
            m11 = wz.w.m(u02);
            return m11;
        } else if (u02 == null) {
            d12 = wz.v.d(s02);
            return d12;
        } else if (kotlin.jvm.internal.s.b(s02, u02)) {
            d11 = wz.v.d(s02);
            return d11;
        } else {
            l11 = wz.w.l(s02, u02);
            return l11;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> Float e(Map<Float, ? extends T> map, T t11) {
        T t12;
        Iterator<T> it2 = map.entrySet().iterator();
        while (true) {
            if (!it2.hasNext()) {
                t12 = null;
                break;
            }
            t12 = it2.next();
            if (kotlin.jvm.internal.s.c(((Map.Entry) t12).getValue(), t11)) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) t12;
        if (entry == null) {
            return null;
        }
        return (Float) entry.getKey();
    }

    public static final <T> c2.a f(e1<T> e1Var) {
        kotlin.jvm.internal.s.g(e1Var, "<this>");
        return new a(e1Var);
    }

    public static final <T> o1.f g(o1.f swipeable, e1<T> state, Map<Float, ? extends T> anchors, androidx.compose.foundation.gestures.a orientation, boolean z11, boolean z12, o0.m mVar, h00.p<? super T, ? super T, ? extends p1> thresholds, w0 w0Var, float f11) {
        kotlin.jvm.internal.s.g(swipeable, "$this$swipeable");
        kotlin.jvm.internal.s.g(state, "state");
        kotlin.jvm.internal.s.g(anchors, "anchors");
        kotlin.jvm.internal.s.g(orientation, "orientation");
        kotlin.jvm.internal.s.g(thresholds, "thresholds");
        return o1.e.a(swipeable, androidx.compose.ui.platform.x0.c() ? new d(state, anchors, orientation, z11, z12, mVar, thresholds, w0Var, f11) : androidx.compose.ui.platform.x0.a(), new c(anchors, state, orientation, z11, mVar, z12, w0Var, thresholds, f11));
    }
}