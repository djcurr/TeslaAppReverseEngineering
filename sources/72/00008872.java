package n0;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
final class g implements p {

    /* renamed from: a  reason: collision with root package name */
    private final l0.w<Float> f39766a;

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.DefaultFlingBehavior", f = "Scrollable.kt", l = {401}, m = "performFling")
    /* loaded from: classes.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        Object f39767a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f39768b;

        /* renamed from: d  reason: collision with root package name */
        int f39770d;

        a(zz.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f39768b = obj;
            this.f39770d |= Integer.MIN_VALUE;
            return g.this.a(null, BitmapDescriptorFactory.HUE_RED, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends kotlin.jvm.internal.u implements h00.l<l0.h<Float, l0.m>, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.i0 f39771a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c0 f39772b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.i0 f39773c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(kotlin.jvm.internal.i0 i0Var, c0 c0Var, kotlin.jvm.internal.i0 i0Var2) {
            super(1);
            this.f39771a = i0Var;
            this.f39772b = c0Var;
            this.f39773c = i0Var2;
        }

        public final void a(l0.h<Float, l0.m> animateDecay) {
            kotlin.jvm.internal.s.g(animateDecay, "$this$animateDecay");
            float floatValue = animateDecay.e().floatValue() - this.f39771a.f34910a;
            float a11 = this.f39772b.a(floatValue);
            this.f39771a.f34910a = animateDecay.e().floatValue();
            this.f39773c.f34910a = animateDecay.f().floatValue();
            if (Math.abs(floatValue - a11) > 0.5f) {
                animateDecay.a();
            }
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ vz.b0 invoke(l0.h<Float, l0.m> hVar) {
            a(hVar);
            return vz.b0.f54756a;
        }
    }

    public g(l0.w<Float> flingDecay) {
        kotlin.jvm.internal.s.g(flingDecay, "flingDecay");
        this.f39766a = flingDecay;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    @Override // n0.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(n0.c0 r18, float r19, zz.d<? super java.lang.Float> r20) {
        /*
            r17 = this;
            r0 = r17
            r1 = r20
            boolean r2 = r1 instanceof n0.g.a
            if (r2 == 0) goto L17
            r2 = r1
            n0.g$a r2 = (n0.g.a) r2
            int r3 = r2.f39770d
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f39770d = r3
            goto L1c
        L17:
            n0.g$a r2 = new n0.g$a
            r2.<init>(r1)
        L1c:
            r7 = r2
            java.lang.Object r1 = r7.f39768b
            java.lang.Object r2 = a00.b.d()
            int r3 = r7.f39770d
            r4 = 1
            if (r3 == 0) goto L3a
            if (r3 != r4) goto L32
            java.lang.Object r2 = r7.f39767a
            kotlin.jvm.internal.i0 r2 = (kotlin.jvm.internal.i0) r2
            vz.r.b(r1)
            goto L82
        L32:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L3a:
            vz.r.b(r1)
            float r1 = java.lang.Math.abs(r19)
            r3 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 <= 0) goto L85
            kotlin.jvm.internal.i0 r1 = new kotlin.jvm.internal.i0
            r1.<init>()
            r3 = r19
            r1.f34910a = r3
            kotlin.jvm.internal.i0 r5 = new kotlin.jvm.internal.i0
            r5.<init>()
            r8 = 0
            r10 = 0
            r12 = 0
            r14 = 0
            r15 = 28
            r16 = 0
            r9 = r19
            l0.k r3 = l0.l.b(r8, r9, r10, r12, r14, r15, r16)
            l0.w<java.lang.Float> r6 = r0.f39766a
            r8 = 0
            n0.g$b r9 = new n0.g$b
            r10 = r18
            r9.<init>(r5, r10, r1)
            r10 = 2
            r11 = 0
            r7.f39767a = r1
            r7.f39770d = r4
            r4 = r6
            r5 = r8
            r6 = r9
            r8 = r10
            r9 = r11
            java.lang.Object r3 = l0.y0.h(r3, r4, r5, r6, r7, r8, r9)
            if (r3 != r2) goto L81
            return r2
        L81:
            r2 = r1
        L82:
            float r1 = r2.f34910a
            goto L88
        L85:
            r3 = r19
            r1 = r3
        L88:
            java.lang.Float r1 = kotlin.coroutines.jvm.internal.b.b(r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.g.a(n0.c0, float, zz.d):java.lang.Object");
    }
}