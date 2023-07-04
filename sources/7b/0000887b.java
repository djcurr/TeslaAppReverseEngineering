package n0;

import c1.v1;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.jvm.internal.k0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class h0 {

    /* renamed from: a  reason: collision with root package name */
    private final androidx.compose.foundation.gestures.a f39788a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f39789b;

    /* renamed from: c  reason: collision with root package name */
    private final v1<c2.d> f39790c;

    /* renamed from: d  reason: collision with root package name */
    private final f0 f39791d;

    /* renamed from: e  reason: collision with root package name */
    private final p f39792e;

    /* renamed from: f  reason: collision with root package name */
    private final v f39793f;

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.ScrollingLogic", f = "Scrollable.kt", l = {304}, m = "doFlingAnimation-QWom1Mo")
    /* loaded from: classes.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        Object f39794a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f39795b;

        /* renamed from: d  reason: collision with root package name */
        int f39797d;

        a(zz.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f39795b = obj;
            this.f39797d |= Integer.MIN_VALUE;
            return h0.this.b(0L, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2", f = "Scrollable.kt", l = {317}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.l implements h00.p<c0, zz.d<? super vz.b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        Object f39798a;

        /* renamed from: b  reason: collision with root package name */
        Object f39799b;

        /* renamed from: c  reason: collision with root package name */
        long f39800c;

        /* renamed from: d  reason: collision with root package name */
        int f39801d;

        /* renamed from: e  reason: collision with root package name */
        private /* synthetic */ Object f39802e;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ k0 f39804g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ long f39805h;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public static final class a extends kotlin.jvm.internal.u implements h00.l<Float, Float> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ h0 f39806a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ c0 f39807b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(h0 h0Var, c0 c0Var) {
                super(1);
                this.f39806a = h0Var;
                this.f39807b = c0Var;
            }

            public final Float a(float f11) {
                h0 h0Var = this.f39806a;
                return Float.valueOf(f11 - this.f39806a.i(h0Var.a(this.f39807b, h0Var.i(f11), null, c2.g.f8750a.b())));
            }

            @Override // h00.l
            public /* bridge */ /* synthetic */ Float invoke(Float f11) {
                return a(f11.floatValue());
            }
        }

        /* renamed from: n0.h0$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0770b implements c0 {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ h00.l<Float, Float> f39808a;

            /* JADX WARN: Multi-variable type inference failed */
            C0770b(h00.l<? super Float, Float> lVar) {
                this.f39808a = lVar;
            }

            @Override // n0.c0
            public float a(float f11) {
                return this.f39808a.invoke(Float.valueOf(f11)).floatValue();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(k0 k0Var, long j11, zz.d<? super b> dVar) {
            super(2, dVar);
            this.f39804g = k0Var;
            this.f39805h = j11;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
            b bVar = new b(this.f39804g, this.f39805h, dVar);
            bVar.f39802e = obj;
            return bVar;
        }

        @Override // h00.p
        public final Object invoke(c0 c0Var, zz.d<? super vz.b0> dVar) {
            return ((b) create(c0Var, dVar)).invokeSuspend(vz.b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d11;
            h0 h0Var;
            k0 k0Var;
            h0 h0Var2;
            long j11;
            d11 = a00.d.d();
            int i11 = this.f39801d;
            if (i11 == 0) {
                vz.r.b(obj);
                C0770b c0770b = new C0770b(new a(h0.this, (c0) this.f39802e));
                h0Var = h0.this;
                k0 k0Var2 = this.f39804g;
                long j12 = this.f39805h;
                p c11 = h0Var.c();
                long j13 = k0Var2.f34914a;
                float i12 = h0Var.i(h0Var.k(j12));
                this.f39802e = h0Var;
                this.f39798a = h0Var;
                this.f39799b = k0Var2;
                this.f39800c = j13;
                this.f39801d = 1;
                obj = c11.a(c0770b, i12, this);
                if (obj == d11) {
                    return d11;
                }
                k0Var = k0Var2;
                h0Var2 = h0Var;
                j11 = j13;
            } else if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                j11 = this.f39800c;
                k0Var = (k0) this.f39799b;
                h0Var = (h0) this.f39798a;
                h0Var2 = (h0) this.f39802e;
                vz.r.b(obj);
            }
            k0Var.f34914a = h0Var.o(j11, h0Var2.i(((Number) obj).floatValue()));
            return vz.b0.f54756a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.ScrollingLogic", f = "Scrollable.kt", l = {292, 294, 296}, m = "onDragStopped")
    /* loaded from: classes.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        Object f39809a;

        /* renamed from: b  reason: collision with root package name */
        long f39810b;

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ Object f39811c;

        /* renamed from: e  reason: collision with root package name */
        int f39813e;

        c(zz.d<? super c> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f39811c = obj;
            this.f39813e |= Integer.MIN_VALUE;
            return h0.this.g(BitmapDescriptorFactory.HUE_RED, this);
        }
    }

    public h0(androidx.compose.foundation.gestures.a orientation, boolean z11, v1<c2.d> nestedScrollDispatcher, f0 scrollableState, p flingBehavior, v vVar) {
        kotlin.jvm.internal.s.g(orientation, "orientation");
        kotlin.jvm.internal.s.g(nestedScrollDispatcher, "nestedScrollDispatcher");
        kotlin.jvm.internal.s.g(scrollableState, "scrollableState");
        kotlin.jvm.internal.s.g(flingBehavior, "flingBehavior");
        this.f39788a = orientation;
        this.f39789b = z11;
        this.f39790c = nestedScrollDispatcher;
        this.f39791d = scrollableState;
        this.f39792e = flingBehavior;
        this.f39793f = vVar;
    }

    public final float a(c0 receiver, float f11, s1.f fVar, int i11) {
        kotlin.jvm.internal.s.g(receiver, "$receiver");
        v vVar = this.f39793f;
        float l11 = f11 - (vVar == null ? BitmapDescriptorFactory.HUE_RED : l(vVar.g(m(f11), fVar, i11)));
        c2.d value = this.f39790c.getValue();
        float l12 = l11 - l(value.d(m(l11), i11));
        float i12 = i(receiver.a(i(l12)));
        float f12 = l12 - i12;
        long b11 = value.b(m(i12), m(f12), i11);
        v vVar2 = this.f39793f;
        if (vVar2 != null) {
            vVar2.a(m(l12), m(f12 - l(b11)), fVar, i11);
        }
        return f12;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(long r13, zz.d<? super x2.u> r15) {
        /*
            r12 = this;
            boolean r0 = r15 instanceof n0.h0.a
            if (r0 == 0) goto L13
            r0 = r15
            n0.h0$a r0 = (n0.h0.a) r0
            int r1 = r0.f39797d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f39797d = r1
            goto L18
        L13:
            n0.h0$a r0 = new n0.h0$a
            r0.<init>(r15)
        L18:
            r4 = r0
            java.lang.Object r15 = r4.f39795b
            java.lang.Object r0 = a00.b.d()
            int r1 = r4.f39797d
            r2 = 1
            if (r1 == 0) goto L36
            if (r1 != r2) goto L2e
            java.lang.Object r13 = r4.f39794a
            kotlin.jvm.internal.k0 r13 = (kotlin.jvm.internal.k0) r13
            vz.r.b(r15)
            goto L5f
        L2e:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L36:
            vz.r.b(r15)
            kotlin.jvm.internal.k0 r15 = new kotlin.jvm.internal.k0
            r15.<init>()
            r15.f34914a = r13
            n0.f0 r1 = r12.f()
            r3 = 0
            n0.h0$b r11 = new n0.h0$b
            r10 = 0
            r5 = r11
            r6 = r12
            r7 = r15
            r8 = r13
            r5.<init>(r7, r8, r10)
            r5 = 1
            r6 = 0
            r4.f39794a = r15
            r4.f39797d = r2
            r2 = r3
            r3 = r11
            java.lang.Object r13 = n0.f0.a.a(r1, r2, r3, r4, r5, r6)
            if (r13 != r0) goto L5e
            return r0
        L5e:
            r13 = r15
        L5f:
            long r13 = r13.f34914a
            x2.u r13 = x2.u.b(r13)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.h0.b(long, zz.d):java.lang.Object");
    }

    public final p c() {
        return this.f39792e;
    }

    public final v1<c2.d> d() {
        return this.f39790c;
    }

    public final v e() {
        return this.f39793f;
    }

    public final f0 f() {
        return this.f39791d;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(float r10, zz.d<? super vz.b0> r11) {
        /*
            Method dump skipped, instructions count: 239
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.h0.g(float, zz.d):java.lang.Object");
    }

    public final long h(long j11) {
        if (this.f39791d.c()) {
            return s1.f.f49950b.c();
        }
        return m(i(this.f39791d.b(i(l(j11)))));
    }

    public final float i(float f11) {
        return this.f39789b ? f11 * (-1) : f11;
    }

    public final boolean j() {
        if (!this.f39791d.c()) {
            v vVar = this.f39793f;
            if (!(vVar == null ? false : vVar.f())) {
                return false;
            }
        }
        return true;
    }

    public final float k(long j11) {
        return this.f39788a == androidx.compose.foundation.gestures.a.Horizontal ? x2.u.h(j11) : x2.u.i(j11);
    }

    public final float l(long j11) {
        return this.f39788a == androidx.compose.foundation.gestures.a.Horizontal ? s1.f.l(j11) : s1.f.m(j11);
    }

    public final long m(float f11) {
        if (f11 == BitmapDescriptorFactory.HUE_RED) {
            return s1.f.f49950b.c();
        }
        return this.f39788a == androidx.compose.foundation.gestures.a.Horizontal ? s1.g.a(f11, BitmapDescriptorFactory.HUE_RED) : s1.g.a(BitmapDescriptorFactory.HUE_RED, f11);
    }

    public final long n(float f11) {
        return this.f39788a == androidx.compose.foundation.gestures.a.Horizontal ? x2.v.a(f11, BitmapDescriptorFactory.HUE_RED) : x2.v.a(BitmapDescriptorFactory.HUE_RED, f11);
    }

    public final long o(long j11, float f11) {
        return this.f39788a == androidx.compose.foundation.gestures.a.Horizontal ? x2.u.e(j11, f11, BitmapDescriptorFactory.HUE_RED, 2, null) : x2.u.e(j11, BitmapDescriptorFactory.HUE_RED, f11, 1, null);
    }
}