package n0;

import androidx.compose.ui.platform.x0;
import androidx.compose.ui.platform.y0;
import c1.i;
import c1.n1;
import c1.s1;
import c1.v1;
import c2.a;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import n0.m;
import v20.o0;

/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: a  reason: collision with root package name */
    private static final c0 f39723a = new b();

    /* renamed from: b  reason: collision with root package name */
    private static final g2.f<Boolean> f39724b = g2.c.a(a.f39725a);

    /* loaded from: classes.dex */
    static final class a extends kotlin.jvm.internal.u implements h00.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f39725a = new a();

        a() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // h00.a
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements c0 {
        b() {
        }

        @Override // n0.c0
        public float a(float f11) {
            return f11;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends kotlin.jvm.internal.u implements h00.l<y0, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.gestures.a f39726a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ f0 f39727b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ v f39728c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f39729d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ boolean f39730e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ p f39731f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ o0.m f39732g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(androidx.compose.foundation.gestures.a aVar, f0 f0Var, v vVar, boolean z11, boolean z12, p pVar, o0.m mVar) {
            super(1);
            this.f39726a = aVar;
            this.f39727b = f0Var;
            this.f39728c = vVar;
            this.f39729d = z11;
            this.f39730e = z12;
            this.f39731f = pVar;
            this.f39732g = mVar;
        }

        public final void a(y0 y0Var) {
            kotlin.jvm.internal.s.g(y0Var, "$this$null");
            y0Var.b("scrollable");
            y0Var.a().b("orientation", this.f39726a);
            y0Var.a().b("state", this.f39727b);
            y0Var.a().b("overScrollController", this.f39728c);
            y0Var.a().b("enabled", Boolean.valueOf(this.f39729d));
            y0Var.a().b("reverseDirection", Boolean.valueOf(this.f39730e));
            y0Var.a().b("flingBehavior", this.f39731f);
            y0Var.a().b("interactionSource", this.f39732g);
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ vz.b0 invoke(y0 y0Var) {
            a(y0Var);
            return vz.b0.f54756a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class d extends kotlin.jvm.internal.u implements h00.q<o1.f, c1.i, Integer, o1.f> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ v f39733a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.gestures.a f39734b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ f0 f39735c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f39736d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ boolean f39737e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ o0.m f39738f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ p f39739g;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public static final class a extends kotlin.jvm.internal.u implements h00.l<Float, vz.b0> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ f0 f39740a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ boolean f39741b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(f0 f0Var, boolean z11) {
                super(1);
                this.f39740a = f0Var;
                this.f39741b = z11;
            }

            public final void a(float f11) {
                this.f39740a.b(d.c(f11, this.f39741b));
            }

            @Override // h00.l
            public /* bridge */ /* synthetic */ vz.b0 invoke(Float f11) {
                a(f11.floatValue());
                return vz.b0.f54756a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(v vVar, androidx.compose.foundation.gestures.a aVar, f0 f0Var, boolean z11, boolean z12, o0.m mVar, p pVar) {
            super(3);
            this.f39733a = vVar;
            this.f39734b = aVar;
            this.f39735c = f0Var;
            this.f39736d = z11;
            this.f39737e = z12;
            this.f39738f = mVar;
            this.f39739g = pVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final float c(float f11, boolean z11) {
            return z11 ? f11 * (-1) : f11;
        }

        public final o1.f b(o1.f composed, c1.i iVar, int i11) {
            o1.f fVar;
            kotlin.jvm.internal.s.g(composed, "$this$composed");
            iVar.x(536297813);
            v vVar = this.f39733a;
            o1.f a11 = vVar == null ? null : n0.b.a(o1.f.f42062f1, vVar);
            if (a11 == null) {
                a11 = o1.f.f42062f1;
            }
            androidx.compose.foundation.gestures.a aVar = this.f39734b;
            f0 f0Var = this.f39735c;
            Boolean valueOf = Boolean.valueOf(this.f39736d);
            androidx.compose.foundation.gestures.a aVar2 = this.f39734b;
            f0 f0Var2 = this.f39735c;
            boolean z11 = this.f39736d;
            iVar.x(-3686095);
            boolean O = iVar.O(aVar) | iVar.O(f0Var) | iVar.O(valueOf);
            Object y11 = iVar.y();
            if (O || y11 == c1.i.f8486a.a()) {
                y11 = new n0.e(aVar2, f0Var2, z11);
                iVar.p(y11);
            }
            iVar.N();
            n0.e eVar = (n0.e) y11;
            if (this.f39737e) {
                fVar = s.f40120a;
            } else {
                fVar = o1.f.f42062f1;
            }
            o1.f g02 = n0.c.a(e0.k(o1.f.f42062f1.g0(eVar).g0(a11), this.f39738f, this.f39734b, this.f39736d, this.f39735c, this.f39739g, this.f39733a, this.f39737e, iVar, 0), this.f39734b, new a(this.f39735c, this.f39736d)).g0(fVar);
            iVar.N();
            return g02;
        }

        @Override // h00.q
        public /* bridge */ /* synthetic */ o1.f invoke(o1.f fVar, c1.i iVar, Integer num) {
            return b(fVar, iVar, num.intValue());
        }
    }

    /* loaded from: classes.dex */
    public static final class e implements c2.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f39742a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ v1<h0> f39743b;

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.ScrollableKt$scrollableNestedScrollConnection$1", f = "Scrollable.kt", l = {382}, m = "onPostFling-RZ2iAVY")
        /* loaded from: classes.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: a  reason: collision with root package name */
            long f39744a;

            /* renamed from: b  reason: collision with root package name */
            /* synthetic */ Object f39745b;

            /* renamed from: d  reason: collision with root package name */
            int f39747d;

            a(zz.d<? super a> dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f39745b = obj;
                this.f39747d |= Integer.MIN_VALUE;
                return e.this.b(0L, 0L, this);
            }
        }

        e(boolean z11, v1<h0> v1Var) {
            this.f39742a = z11;
            this.f39743b = v1Var;
        }

        @Override // c2.a
        public Object a(long j11, zz.d<? super x2.u> dVar) {
            return a.C0168a.a(this, j11, dVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
        @Override // c2.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object b(long r3, long r5, zz.d<? super x2.u> r7) {
            /*
                r2 = this;
                boolean r3 = r7 instanceof n0.e0.e.a
                if (r3 == 0) goto L13
                r3 = r7
                n0.e0$e$a r3 = (n0.e0.e.a) r3
                int r4 = r3.f39747d
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r1 = r4 & r0
                if (r1 == 0) goto L13
                int r4 = r4 - r0
                r3.f39747d = r4
                goto L18
            L13:
                n0.e0$e$a r3 = new n0.e0$e$a
                r3.<init>(r7)
            L18:
                java.lang.Object r4 = r3.f39745b
                java.lang.Object r7 = a00.b.d()
                int r0 = r3.f39747d
                r1 = 1
                if (r0 == 0) goto L33
                if (r0 != r1) goto L2b
                long r5 = r3.f39744a
                vz.r.b(r4)
                goto L4d
            L2b:
                java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
                r3.<init>(r4)
                throw r3
            L33:
                vz.r.b(r4)
                boolean r4 = r2.f39742a
                if (r4 == 0) goto L58
                c1.v1<n0.h0> r4 = r2.f39743b
                java.lang.Object r4 = r4.getValue()
                n0.h0 r4 = (n0.h0) r4
                r3.f39744a = r5
                r3.f39747d = r1
                java.lang.Object r4 = r4.b(r5, r3)
                if (r4 != r7) goto L4d
                return r7
            L4d:
                x2.u r4 = (x2.u) r4
                long r3 = r4.n()
                long r3 = x2.u.k(r5, r3)
                goto L5e
            L58:
                x2.u$a r3 = x2.u.f56966b
                long r3 = r3.a()
            L5e:
                x2.u r3 = x2.u.b(r3)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: n0.e0.e.b(long, long, zz.d):java.lang.Object");
        }

        @Override // c2.a
        public long c(long j11, long j12, int i11) {
            if (this.f39742a) {
                return this.f39743b.getValue().h(j12);
            }
            return s1.f.f49950b.c();
        }

        @Override // c2.a
        public long d(long j11, int i11) {
            return a.C0168a.b(this, j11, i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class f extends kotlin.jvm.internal.u implements h00.p<c1.i, Integer, x> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a0 f39748a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(a0 a0Var) {
            super(2);
            this.f39748a = a0Var;
        }

        public final x a(c1.i iVar, int i11) {
            iVar.x(-971263152);
            a0 a0Var = this.f39748a;
            iVar.N();
            return a0Var;
        }

        @Override // h00.p
        public /* bridge */ /* synthetic */ x invoke(c1.i iVar, Integer num) {
            return a(iVar, num.intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class g extends kotlin.jvm.internal.u implements h00.l<d2.u, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final g f39749a = new g();

        g() {
            super(1);
        }

        @Override // h00.l
        /* renamed from: a */
        public final Boolean invoke(d2.u down) {
            kotlin.jvm.internal.s.g(down, "down");
            return Boolean.valueOf(!d2.e0.g(down.m(), d2.e0.f23301a.b()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class h extends kotlin.jvm.internal.u implements h00.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ v1<h0> f39750a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(v1<h0> v1Var) {
            super(0);
            this.f39750a = v1Var;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // h00.a
        public final Boolean invoke() {
            return Boolean.valueOf(this.f39750a.getValue().j());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.ScrollableKt$touchScrollable$4", f = "Scrollable.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class i extends kotlin.coroutines.jvm.internal.l implements h00.q<o0, Float, zz.d<? super vz.b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f39751a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ float f39752b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ c1.o0<c2.d> f39753c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ v1<h0> f39754d;

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.ScrollableKt$touchScrollable$4$1", f = "Scrollable.kt", l = {214}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements h00.p<o0, zz.d<? super vz.b0>, Object> {

            /* renamed from: a  reason: collision with root package name */
            int f39755a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ v1<h0> f39756b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ float f39757c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(v1<h0> v1Var, float f11, zz.d<? super a> dVar) {
                super(2, dVar);
                this.f39756b = v1Var;
                this.f39757c = f11;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
                return new a(this.f39756b, this.f39757c, dVar);
            }

            @Override // h00.p
            public final Object invoke(o0 o0Var, zz.d<? super vz.b0> dVar) {
                return ((a) create(o0Var, dVar)).invokeSuspend(vz.b0.f54756a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object d11;
                d11 = a00.d.d();
                int i11 = this.f39755a;
                if (i11 == 0) {
                    vz.r.b(obj);
                    float f11 = this.f39757c;
                    this.f39755a = 1;
                    if (this.f39756b.getValue().g(f11, this) == d11) {
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
        i(c1.o0<c2.d> o0Var, v1<h0> v1Var, zz.d<? super i> dVar) {
            super(3, dVar);
            this.f39753c = o0Var;
            this.f39754d = v1Var;
        }

        public final Object e(o0 o0Var, float f11, zz.d<? super vz.b0> dVar) {
            i iVar = new i(this.f39753c, this.f39754d, dVar);
            iVar.f39752b = f11;
            return iVar.invokeSuspend(vz.b0.f54756a);
        }

        @Override // h00.q
        public /* bridge */ /* synthetic */ Object invoke(o0 o0Var, Float f11, zz.d<? super vz.b0> dVar) {
            return e(o0Var, f11.floatValue(), dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a00.d.d();
            if (this.f39751a == 0) {
                vz.r.b(obj);
                v20.k.d(this.f39753c.getValue().f(), null, null, new a(this.f39754d, this.f39752b, null), 3, null);
                return vz.b0.f54756a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public static final g2.f<Boolean> d() {
        return f39724b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float e(float f11, float f12, float f13) {
        if ((f11 < BitmapDescriptorFactory.HUE_RED || f12 > f13) && (f11 >= BitmapDescriptorFactory.HUE_RED || f12 <= f13)) {
            float f14 = f12 - f13;
            return Math.abs(f11) < Math.abs(f14) ? f11 : f14;
        }
        return BitmapDescriptorFactory.HUE_RED;
    }

    public static final o1.f f(o1.f fVar, f0 state, androidx.compose.foundation.gestures.a orientation, v vVar, boolean z11, boolean z12, p pVar, o0.m mVar) {
        kotlin.jvm.internal.s.g(fVar, "<this>");
        kotlin.jvm.internal.s.g(state, "state");
        kotlin.jvm.internal.s.g(orientation, "orientation");
        return o1.e.a(fVar, x0.c() ? new c(orientation, state, vVar, z11, z12, pVar, mVar) : x0.a(), new d(vVar, orientation, state, z12, z11, mVar, pVar));
    }

    public static final o1.f g(o1.f fVar, f0 state, androidx.compose.foundation.gestures.a orientation, boolean z11, boolean z12, p pVar, o0.m mVar) {
        kotlin.jvm.internal.s.g(fVar, "<this>");
        kotlin.jvm.internal.s.g(state, "state");
        kotlin.jvm.internal.s.g(orientation, "orientation");
        return f(fVar, state, orientation, null, z11, z12, pVar, mVar);
    }

    public static /* synthetic */ o1.f i(o1.f fVar, f0 f0Var, androidx.compose.foundation.gestures.a aVar, boolean z11, boolean z12, p pVar, o0.m mVar, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z11 = true;
        }
        boolean z13 = z11;
        if ((i11 & 8) != 0) {
            z12 = false;
        }
        return g(fVar, f0Var, aVar, z13, z12, (i11 & 16) != 0 ? null : pVar, (i11 & 32) != 0 ? null : mVar);
    }

    private static final c2.a j(v1<h0> v1Var, boolean z11) {
        return new e(z11, v1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final o1.f k(o1.f fVar, o0.m mVar, androidx.compose.foundation.gestures.a aVar, boolean z11, f0 f0Var, p pVar, v vVar, boolean z12, c1.i iVar, int i11) {
        o1.f h11;
        iVar.x(-773069933);
        iVar.x(-773069624);
        p a11 = pVar == null ? d0.f39702a.a(iVar, 6) : pVar;
        iVar.N();
        iVar.x(-3687241);
        Object y11 = iVar.y();
        i.a aVar2 = c1.i.f8486a;
        if (y11 == aVar2.a()) {
            y11 = s1.d(new c2.d(), null, 2, null);
            iVar.p(y11);
        }
        iVar.N();
        c1.o0 o0Var = (c1.o0) y11;
        v1 m11 = n1.m(new h0(aVar, z11, o0Var, f0Var, a11, vVar), iVar, 0);
        Boolean valueOf = Boolean.valueOf(z12);
        iVar.x(-3686930);
        boolean O = iVar.O(valueOf);
        Object y12 = iVar.y();
        if (O || y12 == aVar2.a()) {
            y12 = j(m11, z12);
            iVar.p(y12);
        }
        iVar.N();
        c2.a aVar3 = (c2.a) y12;
        iVar.x(-3687241);
        Object y13 = iVar.y();
        if (y13 == aVar2.a()) {
            y13 = new a0(m11);
            iVar.p(y13);
        }
        iVar.N();
        h11 = m.h(fVar, new f((a0) y13), g.f39749a, aVar, (r22 & 8) != 0 ? true : z12, (r22 & 16) != 0 ? null : mVar, new h(m11), (r22 & 64) != 0 ? new m.j(null) : null, (r22 & 128) != 0 ? new m.k(null) : new i(o0Var, m11, null), (r22 & 256) != 0 ? false : false);
        o1.f a12 = c2.f.a(h11, aVar3, (c2.d) o0Var.getValue());
        iVar.N();
        return a12;
    }
}