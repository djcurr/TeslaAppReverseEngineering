package n0;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import l0.y0;

/* loaded from: classes.dex */
public final class b0 {

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.ScrollExtensionsKt", f = "ScrollExtensions.kt", l = {40}, m = "animateScrollBy")
    /* loaded from: classes.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a */
        Object f39691a;

        /* renamed from: b */
        /* synthetic */ Object f39692b;

        /* renamed from: c */
        int f39693c;

        a(zz.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f39692b = obj;
            this.f39693c |= Integer.MIN_VALUE;
            return b0.a(null, BitmapDescriptorFactory.HUE_RED, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$2", f = "ScrollExtensions.kt", l = {41}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.l implements h00.p<c0, zz.d<? super vz.b0>, Object> {

        /* renamed from: a */
        int f39694a;

        /* renamed from: b */
        private /* synthetic */ Object f39695b;

        /* renamed from: c */
        final /* synthetic */ float f39696c;

        /* renamed from: d */
        final /* synthetic */ l0.i<Float> f39697d;

        /* renamed from: e */
        final /* synthetic */ kotlin.jvm.internal.i0 f39698e;

        /* loaded from: classes.dex */
        public static final class a extends kotlin.jvm.internal.u implements h00.p<Float, Float, vz.b0> {

            /* renamed from: a */
            final /* synthetic */ kotlin.jvm.internal.i0 f39699a;

            /* renamed from: b */
            final /* synthetic */ c0 f39700b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(kotlin.jvm.internal.i0 i0Var, c0 c0Var) {
                super(2);
                this.f39699a = i0Var;
                this.f39700b = c0Var;
            }

            public final void a(float f11, float f12) {
                kotlin.jvm.internal.i0 i0Var = this.f39699a;
                float f13 = i0Var.f34910a;
                i0Var.f34910a = f13 + this.f39700b.a(f11 - f13);
            }

            @Override // h00.p
            public /* bridge */ /* synthetic */ vz.b0 invoke(Float f11, Float f12) {
                a(f11.floatValue(), f12.floatValue());
                return vz.b0.f54756a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(float f11, l0.i<Float> iVar, kotlin.jvm.internal.i0 i0Var, zz.d<? super b> dVar) {
            super(2, dVar);
            this.f39696c = f11;
            this.f39697d = iVar;
            this.f39698e = i0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
            b bVar = new b(this.f39696c, this.f39697d, this.f39698e, dVar);
            bVar.f39695b = obj;
            return bVar;
        }

        @Override // h00.p
        public final Object invoke(c0 c0Var, zz.d<? super vz.b0> dVar) {
            return ((b) create(c0Var, dVar)).invokeSuspend(vz.b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d11;
            d11 = a00.d.d();
            int i11 = this.f39694a;
            if (i11 == 0) {
                vz.r.b(obj);
                float f11 = this.f39696c;
                l0.i<Float> iVar = this.f39697d;
                a aVar = new a(this.f39698e, (c0) this.f39695b);
                this.f39694a = 1;
                if (y0.e(BitmapDescriptorFactory.HUE_RED, f11, BitmapDescriptorFactory.HUE_RED, iVar, aVar, this, 4, null) == d11) {
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

    /* JADX WARN: Removed duplicated region for block: B:30:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(n0.f0 r7, float r8, l0.i<java.lang.Float> r9, zz.d<? super java.lang.Float> r10) {
        /*
            boolean r0 = r10 instanceof n0.b0.a
            if (r0 == 0) goto L13
            r0 = r10
            n0.b0$a r0 = (n0.b0.a) r0
            int r1 = r0.f39693c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f39693c = r1
            goto L18
        L13:
            n0.b0$a r0 = new n0.b0$a
            r0.<init>(r10)
        L18:
            r4 = r0
            java.lang.Object r10 = r4.f39692b
            java.lang.Object r0 = a00.b.d()
            int r1 = r4.f39693c
            r2 = 1
            if (r1 == 0) goto L36
            if (r1 != r2) goto L2e
            java.lang.Object r7 = r4.f39691a
            kotlin.jvm.internal.i0 r7 = (kotlin.jvm.internal.i0) r7
            vz.r.b(r10)
            goto L57
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L36:
            vz.r.b(r10)
            kotlin.jvm.internal.i0 r10 = new kotlin.jvm.internal.i0
            r10.<init>()
            r3 = 0
            n0.b0$b r5 = new n0.b0$b
            r1 = 0
            r5.<init>(r8, r9, r10, r1)
            r8 = 1
            r6 = 0
            r4.f39691a = r10
            r4.f39693c = r2
            r1 = r7
            r2 = r3
            r3 = r5
            r5 = r8
            java.lang.Object r7 = n0.f0.a.a(r1, r2, r3, r4, r5, r6)
            if (r7 != r0) goto L56
            return r0
        L56:
            r7 = r10
        L57:
            float r7 = r7.f34910a
            java.lang.Float r7 = kotlin.coroutines.jvm.internal.b.b(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.b0.a(n0.f0, float, l0.i, zz.d):java.lang.Object");
    }

    public static /* synthetic */ Object b(f0 f0Var, float f11, l0.i iVar, zz.d dVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            iVar = l0.j.i(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, 7, null);
        }
        return a(f0Var, f11, iVar, dVar);
    }
}