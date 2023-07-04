package y0;

import c1.v1;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import n0.n;
import org.spongycastle.crypto.tls.CipherSuite;

/* loaded from: classes.dex */
public class e1<T> {

    /* renamed from: a  reason: collision with root package name */
    private final l0.i<Float> f58025a;

    /* renamed from: b  reason: collision with root package name */
    private final h00.l<T, Boolean> f58026b;

    /* renamed from: c  reason: collision with root package name */
    private final c1.o0 f58027c;

    /* renamed from: d  reason: collision with root package name */
    private final c1.o0 f58028d;

    /* renamed from: e  reason: collision with root package name */
    private final c1.o0<Float> f58029e;

    /* renamed from: f  reason: collision with root package name */
    private final c1.o0<Float> f58030f;

    /* renamed from: g  reason: collision with root package name */
    private final c1.o0<Float> f58031g;

    /* renamed from: h  reason: collision with root package name */
    private final c1.o0<Float> f58032h;

    /* renamed from: i  reason: collision with root package name */
    private final c1.o0 f58033i;

    /* renamed from: j  reason: collision with root package name */
    private final kotlinx.coroutines.flow.e<Map<Float, T>> f58034j;

    /* renamed from: k  reason: collision with root package name */
    private float f58035k;

    /* renamed from: l  reason: collision with root package name */
    private float f58036l;

    /* renamed from: m  reason: collision with root package name */
    private final c1.o0 f58037m;

    /* renamed from: n  reason: collision with root package name */
    private final c1.o0 f58038n;

    /* renamed from: o  reason: collision with root package name */
    private final c1.o0 f58039o;

    /* renamed from: p  reason: collision with root package name */
    private final n0.n f58040p;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.SwipeableState$animateInternalToOffset$2", f = "Swipeable.kt", l = {223}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.l implements h00.p<n0.l, zz.d<? super vz.b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f58041a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f58042b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ e1<T> f58043c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ float f58044d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ l0.i<Float> f58045e;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public static final class a extends kotlin.jvm.internal.u implements h00.l<l0.a<Float, l0.m>, vz.b0> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ n0.l f58046a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ kotlin.jvm.internal.i0 f58047b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(n0.l lVar, kotlin.jvm.internal.i0 i0Var) {
                super(1);
                this.f58046a = lVar;
                this.f58047b = i0Var;
            }

            public final void a(l0.a<Float, l0.m> animateTo) {
                kotlin.jvm.internal.s.g(animateTo, "$this$animateTo");
                this.f58046a.a(animateTo.o().floatValue() - this.f58047b.f34910a);
                this.f58047b.f34910a = animateTo.o().floatValue();
            }

            @Override // h00.l
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ vz.b0 mo12invoke(l0.a<Float, l0.m> aVar) {
                a(aVar);
                return vz.b0.f54756a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(e1<T> e1Var, float f11, l0.i<Float> iVar, zz.d<? super b> dVar) {
            super(2, dVar);
            this.f58043c = e1Var;
            this.f58044d = f11;
            this.f58045e = iVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
            b bVar = new b(this.f58043c, this.f58044d, this.f58045e, dVar);
            bVar.f58042b = obj;
            return bVar;
        }

        @Override // h00.p
        /* renamed from: e */
        public final Object mo160invoke(n0.l lVar, zz.d<? super vz.b0> dVar) {
            return ((b) create(lVar, dVar)).invokeSuspend(vz.b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d11;
            d11 = a00.d.d();
            int i11 = this.f58041a;
            try {
                if (i11 == 0) {
                    vz.r.b(obj);
                    n0.l lVar = (n0.l) this.f58042b;
                    kotlin.jvm.internal.i0 i0Var = new kotlin.jvm.internal.i0();
                    i0Var.f34910a = ((Number) ((e1) this.f58043c).f58031g.getValue()).floatValue();
                    ((e1) this.f58043c).f58032h.setValue(kotlin.coroutines.jvm.internal.b.b(this.f58044d));
                    this.f58043c.C(true);
                    l0.a b11 = l0.b.b(i0Var.f34910a, BitmapDescriptorFactory.HUE_RED, 2, null);
                    Float b12 = kotlin.coroutines.jvm.internal.b.b(this.f58044d);
                    l0.i<Float> iVar = this.f58045e;
                    a aVar = new a(lVar, i0Var);
                    this.f58041a = 1;
                    if (l0.a.f(b11, b12, iVar, null, aVar, this, 4, null) == d11) {
                        return d11;
                    }
                } else if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    vz.r.b(obj);
                }
                ((e1) this.f58043c).f58032h.setValue(null);
                this.f58043c.C(false);
                return vz.b0.f54756a;
            } catch (Throwable th2) {
                ((e1) this.f58043c).f58032h.setValue(null);
                this.f58043c.C(false);
                throw th2;
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class c implements kotlinx.coroutines.flow.f<Map<Float, ? extends T>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Object f58048a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e1 f58049b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ l0.i f58050c;

        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.SwipeableState$animateTo$$inlined$collect$1", f = "Swipeable.kt", l = {140}, m = "emit")
        /* loaded from: classes.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: a  reason: collision with root package name */
            /* synthetic */ Object f58051a;

            /* renamed from: b  reason: collision with root package name */
            int f58052b;

            /* renamed from: d  reason: collision with root package name */
            Object f58054d;

            /* renamed from: e  reason: collision with root package name */
            Object f58055e;

            public a(zz.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f58051a = obj;
                this.f58052b |= Integer.MIN_VALUE;
                return c.this.emit(null, this);
            }
        }

        public c(Object obj, e1 e1Var, l0.i iVar) {
            this.f58048a = obj;
            this.f58049b = e1Var;
            this.f58050c = iVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x003f  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0085  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00b9  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x00f8  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x012c  */
        @Override // kotlinx.coroutines.flow.f
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object emit(java.util.Map<java.lang.Float, ? extends T> r9, zz.d<? super vz.b0> r10) {
            /*
                Method dump skipped, instructions count: 312
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: y0.e1.c.emit(java.lang.Object, zz.d):java.lang.Object");
        }
    }

    /* loaded from: classes.dex */
    static final class d extends kotlin.jvm.internal.u implements h00.l<Float, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e1<T> f58056a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(e1<T> e1Var) {
            super(1);
            this.f58056a = e1Var;
        }

        public final void a(float f11) {
            float l11;
            float floatValue = ((Number) ((e1) this.f58056a).f58031g.getValue()).floatValue() + f11;
            l11 = m00.l.l(floatValue, this.f58056a.r(), this.f58056a.q());
            float f12 = floatValue - l11;
            w0 t11 = this.f58056a.t();
            ((e1) this.f58056a).f58029e.setValue(Float.valueOf(l11 + (t11 == null ? BitmapDescriptorFactory.HUE_RED : t11.a(f12))));
            ((e1) this.f58056a).f58030f.setValue(Float.valueOf(f12));
            ((e1) this.f58056a).f58031g.setValue(Float.valueOf(floatValue));
        }

        @Override // h00.l
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ vz.b0 mo12invoke(Float f11) {
            a(f11.floatValue());
            return vz.b0.f54756a;
        }
    }

    /* loaded from: classes.dex */
    static final class e extends kotlin.jvm.internal.u implements h00.a<Map<Float, ? extends T>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e1<T> f58057a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(e1<T> e1Var) {
            super(0);
            this.f58057a = e1Var;
        }

        @Override // h00.a
        /* renamed from: invoke */
        public final Map<Float, T> mo11invoke() {
            return this.f58057a.l();
        }
    }

    /* loaded from: classes.dex */
    public static final class f implements kotlinx.coroutines.flow.f<Map<Float, ? extends T>> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ float f58059b;

        public f(float f11) {
            this.f58059b = f11;
        }

        @Override // kotlinx.coroutines.flow.f
        public Object emit(Map<Float, ? extends T> map, zz.d<? super vz.b0> dVar) {
            Float e11;
            float c11;
            Object d11;
            Object d12;
            Map<Float, ? extends T> map2 = map;
            e11 = d1.e(map2, e1.this.o());
            kotlin.jvm.internal.s.e(e11);
            float floatValue = e11.floatValue();
            c11 = d1.c(e1.this.s().getValue().floatValue(), floatValue, map2.keySet(), e1.this.v(), this.f58059b, e1.this.w());
            T t11 = map2.get(kotlin.coroutines.jvm.internal.b.b(c11));
            if (t11 == null || !e1.this.n().mo12invoke(t11).booleanValue()) {
                e1 e1Var = e1.this;
                Object h11 = e1Var.h(floatValue, e1Var.m(), dVar);
                d11 = a00.d.d();
                if (h11 == d11) {
                    return h11;
                }
            } else {
                Object j11 = e1.j(e1.this, t11, null, dVar, 2, null);
                d12 = a00.d.d();
                if (j11 == d12) {
                    return j11;
                }
            }
            return vz.b0.f54756a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.SwipeableState", f = "Swipeable.kt", l = {159, CipherSuite.TLS_RSA_PSK_WITH_AES_256_CBC_SHA384, CipherSuite.TLS_RSA_WITH_CAMELLIA_128_CBC_SHA256}, m = "processNewAnchors$material_release")
    /* loaded from: classes.dex */
    public static final class g extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        Object f58060a;

        /* renamed from: b  reason: collision with root package name */
        Object f58061b;

        /* renamed from: c  reason: collision with root package name */
        float f58062c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f58063d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ e1<T> f58064e;

        /* renamed from: f  reason: collision with root package name */
        int f58065f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(e1<T> e1Var, zz.d<? super g> dVar) {
            super(dVar);
            this.f58064e = e1Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f58063d = obj;
            this.f58065f |= Integer.MIN_VALUE;
            return this.f58064e.A(null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.SwipeableState$snapInternalToOffset$2", f = "Swipeable.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class h extends kotlin.coroutines.jvm.internal.l implements h00.p<n0.l, zz.d<? super vz.b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f58066a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f58067b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ float f58068c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ e1<T> f58069d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(float f11, e1<T> e1Var, zz.d<? super h> dVar) {
            super(2, dVar);
            this.f58068c = f11;
            this.f58069d = e1Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
            h hVar = new h(this.f58068c, this.f58069d, dVar);
            hVar.f58067b = obj;
            return hVar;
        }

        @Override // h00.p
        /* renamed from: e */
        public final Object mo160invoke(n0.l lVar, zz.d<? super vz.b0> dVar) {
            return ((h) create(lVar, dVar)).invokeSuspend(vz.b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a00.d.d();
            if (this.f58066a == 0) {
                vz.r.b(obj);
                ((n0.l) this.f58067b).a(this.f58068c - ((Number) ((e1) this.f58069d).f58031g.getValue()).floatValue());
                return vz.b0.f54756a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* loaded from: classes.dex */
    public static final class i implements kotlinx.coroutines.flow.e<Map<Float, ? extends T>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.e f58070a;

        /* loaded from: classes.dex */
        public static final class a implements kotlinx.coroutines.flow.f<Map<Float, ? extends T>> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.flow.f f58071a;

            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.SwipeableState$special$$inlined$filter$1$2", f = "Swipeable.kt", l = {137}, m = "emit")
            /* renamed from: y0.e1$i$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C1322a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: a  reason: collision with root package name */
                /* synthetic */ Object f58072a;

                /* renamed from: b  reason: collision with root package name */
                int f58073b;

                public C1322a(zz.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f58072a = obj;
                    this.f58073b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(kotlinx.coroutines.flow.f fVar) {
                this.f58071a = fVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
            @Override // kotlinx.coroutines.flow.f
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public java.lang.Object emit(java.lang.Object r5, zz.d r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof y0.e1.i.a.C1322a
                    if (r0 == 0) goto L13
                    r0 = r6
                    y0.e1$i$a$a r0 = (y0.e1.i.a.C1322a) r0
                    int r1 = r0.f58073b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f58073b = r1
                    goto L18
                L13:
                    y0.e1$i$a$a r0 = new y0.e1$i$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f58072a
                    java.lang.Object r1 = a00.b.d()
                    int r2 = r0.f58073b
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    vz.r.b(r6)
                    goto L49
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    vz.r.b(r6)
                    kotlinx.coroutines.flow.f r6 = r4.f58071a
                    r2 = r5
                    java.util.Map r2 = (java.util.Map) r2
                    boolean r2 = r2.isEmpty()
                    r2 = r2 ^ r3
                    if (r2 == 0) goto L49
                    r0.f58073b = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L49
                    return r1
                L49:
                    vz.b0 r5 = vz.b0.f54756a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: y0.e1.i.a.emit(java.lang.Object, zz.d):java.lang.Object");
            }
        }

        public i(kotlinx.coroutines.flow.e eVar) {
            this.f58070a = eVar;
        }

        @Override // kotlinx.coroutines.flow.e
        public Object collect(kotlinx.coroutines.flow.f fVar, zz.d dVar) {
            Object d11;
            Object collect = this.f58070a.collect(new a(fVar), dVar);
            d11 = a00.d.d();
            return collect == d11 ? collect : vz.b0.f54756a;
        }
    }

    /* loaded from: classes.dex */
    static final class j extends kotlin.jvm.internal.u implements h00.p<Float, Float, Float> {

        /* renamed from: a  reason: collision with root package name */
        public static final j f58075a = new j();

        j() {
            super(2);
        }

        public final Float a(float f11, float f12) {
            return Float.valueOf((float) BitmapDescriptorFactory.HUE_RED);
        }

        @Override // h00.p
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Float mo160invoke(Float f11, Float f12) {
            return a(f11.floatValue(), f12.floatValue());
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e1(T t11, l0.i<Float> animationSpec, h00.l<? super T, Boolean> confirmStateChange) {
        c1.o0 d11;
        c1.o0 d12;
        c1.o0<Float> d13;
        c1.o0<Float> d14;
        c1.o0<Float> d15;
        c1.o0<Float> d16;
        Map i11;
        c1.o0 d17;
        c1.o0 d18;
        c1.o0 d19;
        c1.o0 d21;
        kotlin.jvm.internal.s.g(animationSpec, "animationSpec");
        kotlin.jvm.internal.s.g(confirmStateChange, "confirmStateChange");
        this.f58025a = animationSpec;
        this.f58026b = confirmStateChange;
        d11 = c1.s1.d(t11, null, 2, null);
        this.f58027c = d11;
        d12 = c1.s1.d(Boolean.FALSE, null, 2, null);
        this.f58028d = d12;
        Float valueOf = Float.valueOf((float) BitmapDescriptorFactory.HUE_RED);
        d13 = c1.s1.d(valueOf, null, 2, null);
        this.f58029e = d13;
        d14 = c1.s1.d(valueOf, null, 2, null);
        this.f58030f = d14;
        d15 = c1.s1.d(valueOf, null, 2, null);
        this.f58031g = d15;
        d16 = c1.s1.d(null, null, 2, null);
        this.f58032h = d16;
        i11 = wz.s0.i();
        d17 = c1.s1.d(i11, null, 2, null);
        this.f58033i = d17;
        this.f58034j = kotlinx.coroutines.flow.g.F(new i(c1.n1.n(new e(this))), 1);
        this.f58035k = Float.NEGATIVE_INFINITY;
        this.f58036l = Float.POSITIVE_INFINITY;
        d18 = c1.s1.d(j.f58075a, null, 2, null);
        this.f58037m = d18;
        d19 = c1.s1.d(valueOf, null, 2, null);
        this.f58038n = d19;
        d21 = c1.s1.d(null, null, 2, null);
        this.f58039o = d21;
        this.f58040p = n0.m.a(new d(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C(boolean z11) {
        this.f58028d.setValue(Boolean.valueOf(z11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D(T t11) {
        this.f58027c.setValue(t11);
    }

    private final Object J(float f11, zz.d<? super vz.b0> dVar) {
        Object d11;
        Object a11 = n.a.a(p(), null, new h(f11, this, null), dVar, 1, null);
        d11 = a00.d.d();
        return a11 == d11 ? a11 : vz.b0.f54756a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object h(float f11, l0.i<Float> iVar, zz.d<? super vz.b0> dVar) {
        Object d11;
        Object a11 = n.a.a(p(), null, new b(this, f11, iVar, null), dVar, 1, null);
        d11 = a00.d.d();
        return a11 == d11 ? a11 : vz.b0.f54756a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object j(e1 e1Var, Object obj, l0.i iVar, zz.d dVar, int i11, Object obj2) {
        if (obj2 == null) {
            if ((i11 & 2) != 0) {
                iVar = e1Var.m();
            }
            return e1Var.i(obj, iVar, dVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animateTo");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0216 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0217  */
    /* JADX WARN: Type inference failed for: r10v27, types: [float] */
    /* JADX WARN: Type inference failed for: r10v75, types: [float] */
    /* JADX WARN: Type inference failed for: r10v77, types: [float] */
    /* JADX WARN: Type inference failed for: r10v88 */
    /* JADX WARN: Type inference failed for: r10v89 */
    /* JADX WARN: Type inference failed for: r10v90 */
    /* JADX WARN: Type inference failed for: r10v91 */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object A(java.util.Map<java.lang.Float, ? extends T> r10, java.util.Map<java.lang.Float, ? extends T> r11, zz.d<? super vz.b0> r12) {
        /*
            Method dump skipped, instructions count: 635
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y0.e1.A(java.util.Map, java.util.Map, zz.d):java.lang.Object");
    }

    public final void B(Map<Float, ? extends T> map) {
        kotlin.jvm.internal.s.g(map, "<set-?>");
        this.f58033i.setValue(map);
    }

    public final void E(float f11) {
        this.f58036l = f11;
    }

    public final void F(float f11) {
        this.f58035k = f11;
    }

    public final void G(w0 w0Var) {
        this.f58039o.setValue(w0Var);
    }

    public final void H(h00.p<? super Float, ? super Float, Float> pVar) {
        kotlin.jvm.internal.s.g(pVar, "<set-?>");
        this.f58037m.setValue(pVar);
    }

    public final void I(float f11) {
        this.f58038n.setValue(Float.valueOf(f11));
    }

    public final Object i(T t11, l0.i<Float> iVar, zz.d<? super vz.b0> dVar) {
        Object d11;
        Object collect = this.f58034j.collect(new c(t11, this, iVar), dVar);
        d11 = a00.d.d();
        return collect == d11 ? collect : vz.b0.f54756a;
    }

    public final void k(Map<Float, ? extends T> newAnchors) {
        Float e11;
        kotlin.jvm.internal.s.g(newAnchors, "newAnchors");
        if (l().isEmpty()) {
            e11 = d1.e(newAnchors, o());
            if (e11 != null) {
                this.f58029e.setValue(e11);
                this.f58031g.setValue(e11);
                return;
            }
            throw new IllegalArgumentException("The initial value must have an associated anchor.".toString());
        }
    }

    public final Map<Float, T> l() {
        return (Map) this.f58033i.getValue();
    }

    public final l0.i<Float> m() {
        return this.f58025a;
    }

    public final h00.l<T, Boolean> n() {
        return this.f58026b;
    }

    public final T o() {
        return this.f58027c.getValue();
    }

    public final n0.n p() {
        return this.f58040p;
    }

    public final float q() {
        return this.f58036l;
    }

    public final float r() {
        return this.f58035k;
    }

    public final v1<Float> s() {
        return this.f58029e;
    }

    public final w0 t() {
        return (w0) this.f58039o.getValue();
    }

    public final T u() {
        float floatValue;
        Float e11;
        Float value = this.f58032h.getValue();
        if (value == null) {
            float floatValue2 = s().getValue().floatValue();
            e11 = d1.e(l(), o());
            floatValue = d1.c(floatValue2, e11 == null ? s().getValue().floatValue() : e11.floatValue(), l().keySet(), v(), BitmapDescriptorFactory.HUE_RED, Float.POSITIVE_INFINITY);
        } else {
            floatValue = value.floatValue();
        }
        T t11 = l().get(Float.valueOf(floatValue));
        return t11 == null ? o() : t11;
    }

    public final h00.p<Float, Float, Float> v() {
        return (h00.p) this.f58037m.getValue();
    }

    public final float w() {
        return ((Number) this.f58038n.getValue()).floatValue();
    }

    public final boolean x() {
        return ((Boolean) this.f58028d.getValue()).booleanValue();
    }

    public final float y(float f11) {
        float l11;
        l11 = m00.l.l(this.f58031g.getValue().floatValue() + f11, this.f58035k, this.f58036l);
        float floatValue = l11 - this.f58031g.getValue().floatValue();
        if (Math.abs(floatValue) > BitmapDescriptorFactory.HUE_RED) {
            this.f58040p.b(floatValue);
        }
        return floatValue;
    }

    public final Object z(float f11, zz.d<? super vz.b0> dVar) {
        Object d11;
        Object collect = this.f58034j.collect(new f(f11), dVar);
        d11 = a00.d.d();
        return collect == d11 ? collect : vz.b0.f54756a;
    }
}