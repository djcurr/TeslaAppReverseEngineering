package b1;

import c1.o0;
import c1.s1;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import l0.c1;
import t1.a0;
import v1.e;
import v20.a2;
import v20.p0;
import v20.x;
import v20.z;
import vz.b0;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    private s1.f f7209a;

    /* renamed from: b  reason: collision with root package name */
    private final float f7210b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f7211c;

    /* renamed from: d  reason: collision with root package name */
    private Float f7212d;

    /* renamed from: e  reason: collision with root package name */
    private Float f7213e;

    /* renamed from: f  reason: collision with root package name */
    private s1.f f7214f;

    /* renamed from: g  reason: collision with root package name */
    private final l0.a<Float, l0.m> f7215g;

    /* renamed from: h  reason: collision with root package name */
    private final l0.a<Float, l0.m> f7216h;

    /* renamed from: i  reason: collision with root package name */
    private final l0.a<Float, l0.m> f7217i;

    /* renamed from: j  reason: collision with root package name */
    private final x<b0> f7218j;

    /* renamed from: k  reason: collision with root package name */
    private final o0 f7219k;

    /* renamed from: l  reason: collision with root package name */
    private final o0 f7220l;

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.ripple.RippleAnimation", f = "RippleAnimation.kt", l = {80, 82, 83}, m = "animate")
    /* loaded from: classes.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        Object f7221a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f7222b;

        /* renamed from: d  reason: collision with root package name */
        int f7224d;

        a(zz.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f7222b = obj;
            this.f7224d |= Integer.MIN_VALUE;
            return g.this.d(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.ripple.RippleAnimation$fadeIn$2", f = "RippleAnimation.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.l implements h00.p<v20.o0, zz.d<? super a2>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f7225a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f7226b;

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.ripple.RippleAnimation$fadeIn$2$1", f = "RippleAnimation.kt", l = {89}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements h00.p<v20.o0, zz.d<? super b0>, Object> {

            /* renamed from: a  reason: collision with root package name */
            int f7228a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ g f7229b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(g gVar, zz.d<? super a> dVar) {
                super(2, dVar);
                this.f7229b = gVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final zz.d<b0> create(Object obj, zz.d<?> dVar) {
                return new a(this.f7229b, dVar);
            }

            @Override // h00.p
            public final Object invoke(v20.o0 o0Var, zz.d<? super b0> dVar) {
                return ((a) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object d11;
                d11 = a00.d.d();
                int i11 = this.f7228a;
                if (i11 == 0) {
                    vz.r.b(obj);
                    l0.a aVar = this.f7229b.f7215g;
                    Float b11 = kotlin.coroutines.jvm.internal.b.b(1.0f);
                    c1 k11 = l0.j.k(75, 0, l0.b0.b(), 2, null);
                    this.f7228a = 1;
                    if (l0.a.f(aVar, b11, k11, null, null, this, 12, null) == d11) {
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
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.ripple.RippleAnimation$fadeIn$2$2", f = "RippleAnimation.kt", l = {95}, m = "invokeSuspend")
        /* renamed from: b1.g$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0140b extends kotlin.coroutines.jvm.internal.l implements h00.p<v20.o0, zz.d<? super b0>, Object> {

            /* renamed from: a  reason: collision with root package name */
            int f7230a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ g f7231b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0140b(g gVar, zz.d<? super C0140b> dVar) {
                super(2, dVar);
                this.f7231b = gVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final zz.d<b0> create(Object obj, zz.d<?> dVar) {
                return new C0140b(this.f7231b, dVar);
            }

            @Override // h00.p
            public final Object invoke(v20.o0 o0Var, zz.d<? super b0> dVar) {
                return ((C0140b) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object d11;
                d11 = a00.d.d();
                int i11 = this.f7230a;
                if (i11 == 0) {
                    vz.r.b(obj);
                    l0.a aVar = this.f7231b.f7216h;
                    Float b11 = kotlin.coroutines.jvm.internal.b.b(1.0f);
                    c1 k11 = l0.j.k(225, 0, l0.b0.a(), 2, null);
                    this.f7230a = 1;
                    if (l0.a.f(aVar, b11, k11, null, null, this, 12, null) == d11) {
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
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.ripple.RippleAnimation$fadeIn$2$3", f = "RippleAnimation.kt", l = {101}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class c extends kotlin.coroutines.jvm.internal.l implements h00.p<v20.o0, zz.d<? super b0>, Object> {

            /* renamed from: a  reason: collision with root package name */
            int f7232a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ g f7233b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(g gVar, zz.d<? super c> dVar) {
                super(2, dVar);
                this.f7233b = gVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final zz.d<b0> create(Object obj, zz.d<?> dVar) {
                return new c(this.f7233b, dVar);
            }

            @Override // h00.p
            public final Object invoke(v20.o0 o0Var, zz.d<? super b0> dVar) {
                return ((c) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object d11;
                d11 = a00.d.d();
                int i11 = this.f7232a;
                if (i11 == 0) {
                    vz.r.b(obj);
                    l0.a aVar = this.f7233b.f7217i;
                    Float b11 = kotlin.coroutines.jvm.internal.b.b(1.0f);
                    c1 k11 = l0.j.k(225, 0, l0.b0.b(), 2, null);
                    this.f7232a = 1;
                    if (l0.a.f(aVar, b11, k11, null, null, this, 12, null) == d11) {
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

        b(zz.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<b0> create(Object obj, zz.d<?> dVar) {
            b bVar = new b(dVar);
            bVar.f7226b = obj;
            return bVar;
        }

        @Override // h00.p
        public final Object invoke(v20.o0 o0Var, zz.d<? super a2> dVar) {
            return ((b) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a2 d11;
            a00.d.d();
            if (this.f7225a == 0) {
                vz.r.b(obj);
                v20.o0 o0Var = (v20.o0) this.f7226b;
                v20.k.d(o0Var, null, null, new a(g.this, null), 3, null);
                v20.k.d(o0Var, null, null, new C0140b(g.this, null), 3, null);
                d11 = v20.k.d(o0Var, null, null, new c(g.this, null), 3, null);
                return d11;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.ripple.RippleAnimation$fadeOut$2", f = "RippleAnimation.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.l implements h00.p<v20.o0, zz.d<? super a2>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f7234a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f7235b;

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.ripple.RippleAnimation$fadeOut$2$1", f = "RippleAnimation.kt", l = {112}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements h00.p<v20.o0, zz.d<? super b0>, Object> {

            /* renamed from: a  reason: collision with root package name */
            int f7237a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ g f7238b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(g gVar, zz.d<? super a> dVar) {
                super(2, dVar);
                this.f7238b = gVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final zz.d<b0> create(Object obj, zz.d<?> dVar) {
                return new a(this.f7238b, dVar);
            }

            @Override // h00.p
            public final Object invoke(v20.o0 o0Var, zz.d<? super b0> dVar) {
                return ((a) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object d11;
                d11 = a00.d.d();
                int i11 = this.f7237a;
                if (i11 == 0) {
                    vz.r.b(obj);
                    l0.a aVar = this.f7238b.f7215g;
                    Float b11 = kotlin.coroutines.jvm.internal.b.b(BitmapDescriptorFactory.HUE_RED);
                    c1 k11 = l0.j.k(150, 0, l0.b0.b(), 2, null);
                    this.f7237a = 1;
                    if (l0.a.f(aVar, b11, k11, null, null, this, 12, null) == d11) {
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

        c(zz.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<b0> create(Object obj, zz.d<?> dVar) {
            c cVar = new c(dVar);
            cVar.f7235b = obj;
            return cVar;
        }

        @Override // h00.p
        public final Object invoke(v20.o0 o0Var, zz.d<? super a2> dVar) {
            return ((c) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a2 d11;
            a00.d.d();
            if (this.f7234a == 0) {
                vz.r.b(obj);
                d11 = v20.k.d((v20.o0) this.f7235b, null, null, new a(g.this, null), 3, null);
                return d11;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    private g(s1.f fVar, float f11, boolean z11) {
        o0 d11;
        o0 d12;
        this.f7209a = fVar;
        this.f7210b = f11;
        this.f7211c = z11;
        this.f7215g = l0.b.b(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 2, null);
        this.f7216h = l0.b.b(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 2, null);
        this.f7217i = l0.b.b(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 2, null);
        this.f7218j = z.a(null);
        Boolean bool = Boolean.FALSE;
        d11 = s1.d(bool, null, 2, null);
        this.f7219k = d11;
        d12 = s1.d(bool, null, 2, null);
        this.f7220l = d12;
    }

    public /* synthetic */ g(s1.f fVar, float f11, boolean z11, DefaultConstructorMarker defaultConstructorMarker) {
        this(fVar, f11, z11);
    }

    private final Object f(zz.d<? super b0> dVar) {
        Object d11;
        Object e11 = p0.e(new b(null), dVar);
        d11 = a00.d.d();
        return e11 == d11 ? e11 : b0.f54756a;
    }

    private final Object g(zz.d<? super b0> dVar) {
        Object d11;
        Object e11 = p0.e(new c(null), dVar);
        d11 = a00.d.d();
        return e11 == d11 ? e11 : b0.f54756a;
    }

    private final boolean i() {
        return ((Boolean) this.f7220l.getValue()).booleanValue();
    }

    private final boolean j() {
        return ((Boolean) this.f7219k.getValue()).booleanValue();
    }

    private final void k(boolean z11) {
        this.f7220l.setValue(Boolean.valueOf(z11));
    }

    private final void l(boolean z11) {
        this.f7219k.setValue(Boolean.valueOf(z11));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0065 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0071 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(zz.d<? super vz.b0> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof b1.g.a
            if (r0 == 0) goto L13
            r0 = r7
            b1.g$a r0 = (b1.g.a) r0
            int r1 = r0.f7224d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f7224d = r1
            goto L18
        L13:
            b1.g$a r0 = new b1.g$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f7222b
            java.lang.Object r1 = a00.b.d()
            int r2 = r0.f7224d
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L47
            if (r2 == r5) goto L3f
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            vz.r.b(r7)
            goto L72
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L37:
            java.lang.Object r2 = r0.f7221a
            b1.g r2 = (b1.g) r2
            vz.r.b(r7)
            goto L66
        L3f:
            java.lang.Object r2 = r0.f7221a
            b1.g r2 = (b1.g) r2
            vz.r.b(r7)
            goto L56
        L47:
            vz.r.b(r7)
            r0.f7221a = r6
            r0.f7224d = r5
            java.lang.Object r7 = r6.f(r0)
            if (r7 != r1) goto L55
            return r1
        L55:
            r2 = r6
        L56:
            r2.l(r5)
            v20.x<vz.b0> r7 = r2.f7218j
            r0.f7221a = r2
            r0.f7224d = r4
            java.lang.Object r7 = r7.u0(r0)
            if (r7 != r1) goto L66
            return r1
        L66:
            r7 = 0
            r0.f7221a = r7
            r0.f7224d = r3
            java.lang.Object r7 = r2.g(r0)
            if (r7 != r1) goto L72
            return r1
        L72:
            vz.b0 r7 = vz.b0.f54756a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: b1.g.d(zz.d):java.lang.Object");
    }

    public final void e(v1.e receiver, long j11) {
        Float valueOf;
        s.g(receiver, "$receiver");
        if (this.f7212d == null) {
            this.f7212d = Float.valueOf(h.b(receiver.c()));
        }
        if (this.f7213e == null) {
            if (Float.isNaN(this.f7210b)) {
                valueOf = Float.valueOf(h.a(receiver, this.f7211c, receiver.c()));
            } else {
                valueOf = Float.valueOf(receiver.i0(this.f7210b));
            }
            this.f7213e = valueOf;
        }
        if (this.f7209a == null) {
            this.f7209a = s1.f.d(receiver.o0());
        }
        if (this.f7214f == null) {
            this.f7214f = s1.f.d(s1.g.a(s1.l.i(receiver.c()) / 2.0f, s1.l.g(receiver.c()) / 2.0f));
        }
        float floatValue = (!i() || j()) ? this.f7215g.o().floatValue() : 1.0f;
        Float f11 = this.f7212d;
        s.e(f11);
        float floatValue2 = f11.floatValue();
        Float f12 = this.f7213e;
        s.e(f12);
        float a11 = y2.a.a(floatValue2, f12.floatValue(), this.f7216h.o().floatValue());
        s1.f fVar = this.f7209a;
        s.e(fVar);
        float l11 = s1.f.l(fVar.t());
        s1.f fVar2 = this.f7214f;
        s.e(fVar2);
        float a12 = y2.a.a(l11, s1.f.l(fVar2.t()), this.f7217i.o().floatValue());
        s1.f fVar3 = this.f7209a;
        s.e(fVar3);
        float m11 = s1.f.m(fVar3.t());
        s1.f fVar4 = this.f7214f;
        s.e(fVar4);
        long a13 = s1.g.a(a12, y2.a.a(m11, s1.f.m(fVar4.t()), this.f7217i.o().floatValue()));
        long l12 = a0.l(j11, a0.o(j11) * floatValue, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
        if (this.f7211c) {
            float i11 = s1.l.i(receiver.c());
            float g11 = s1.l.g(receiver.c());
            int b11 = t1.z.f51535a.b();
            v1.d j02 = receiver.j0();
            long c11 = j02.c();
            j02.b().m();
            j02.a().a(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, i11, g11, b11);
            e.b.b(receiver, l12, a11, a13, BitmapDescriptorFactory.HUE_RED, null, null, 0, 120, null);
            j02.b().h();
            j02.d(c11);
            return;
        }
        e.b.b(receiver, l12, a11, a13, BitmapDescriptorFactory.HUE_RED, null, null, 0, 120, null);
    }

    public final void h() {
        k(true);
        this.f7218j.complete(b0.f54756a);
    }
}