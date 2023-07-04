package l0;

import c1.i;
import c1.v1;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: T
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:83)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:61)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:55)
    */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private static final v0<Float> f36087a = j.i(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, 7, null);

    /* renamed from: b  reason: collision with root package name */
    private static final v0<x2.g> f36088b = j.i(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, x2.g.c(s1.a(x2.g.f56937b)), 3, null);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class a extends kotlin.jvm.internal.u implements h00.a<vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ x20.e<T> f36089a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ T f36090b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(x20.e<T> eVar, T t11) {
            super(0);
            this.f36089a = eVar;
            this.f36090b = t11;
        }

        @Override // h00.a
        public /* bridge */ /* synthetic */ vz.b0 invoke() {
            invoke2();
            return vz.b0.f54756a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f36089a.d(this.f36090b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3", f = "AnimateAsState.kt", l = {368}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.l implements h00.p<v20.o0, zz.d<? super vz.b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        Object f36091a;

        /* renamed from: b  reason: collision with root package name */
        int f36092b;

        /* renamed from: c  reason: collision with root package name */
        private /* synthetic */ Object f36093c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ x20.e<T> f36094d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ l0.a<T, V> f36095e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ v1<i<T>> f36096f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ v1<h00.l<T, vz.b0>> f36097g;

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1", f = "AnimateAsState.kt", l = {377}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements h00.p<v20.o0, zz.d<? super vz.b0>, Object> {

            /* renamed from: a  reason: collision with root package name */
            int f36098a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ T f36099b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ l0.a<T, V> f36100c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ v1<i<T>> f36101d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ v1<h00.l<T, vz.b0>> f36102e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(T t11, l0.a<T, V> aVar, v1<? extends i<T>> v1Var, v1<? extends h00.l<? super T, vz.b0>> v1Var2, zz.d<? super a> dVar) {
                super(2, dVar);
                this.f36099b = t11;
                this.f36100c = aVar;
                this.f36101d = v1Var;
                this.f36102e = v1Var2;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
                return new a(this.f36099b, this.f36100c, this.f36101d, this.f36102e, dVar);
            }

            @Override // h00.p
            public /* bridge */ /* synthetic */ Object invoke(v20.o0 o0Var, zz.d<? super vz.b0> dVar) {
                return invoke2(o0Var, dVar);
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final Object invoke2(v20.o0 o0Var, zz.d<? super vz.b0> dVar) {
                return ((a) create(o0Var, dVar)).invokeSuspend(vz.b0.f54756a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object d11;
                d11 = a00.d.d();
                int i11 = this.f36098a;
                if (i11 == 0) {
                    vz.r.b(obj);
                    if (!kotlin.jvm.internal.s.c(this.f36099b, this.f36100c.m())) {
                        l0.a<T, V> aVar = this.f36100c;
                        T t11 = this.f36099b;
                        i g11 = c.g(this.f36101d);
                        this.f36098a = 1;
                        if (l0.a.f(aVar, t11, g11, null, null, this, 12, null) == d11) {
                            return d11;
                        }
                    }
                    return vz.b0.f54756a;
                } else if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    vz.r.b(obj);
                }
                h00.l f11 = c.f(this.f36102e);
                if (f11 != null) {
                    f11.invoke(this.f36100c.o());
                }
                return vz.b0.f54756a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(x20.e<T> eVar, l0.a<T, V> aVar, v1<? extends i<T>> v1Var, v1<? extends h00.l<? super T, vz.b0>> v1Var2, zz.d<? super b> dVar) {
            super(2, dVar);
            this.f36094d = eVar;
            this.f36095e = aVar;
            this.f36096f = v1Var;
            this.f36097g = v1Var2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
            b bVar = new b(this.f36094d, this.f36095e, this.f36096f, this.f36097g, dVar);
            bVar.f36093c = obj;
            return bVar;
        }

        @Override // h00.p
        public /* bridge */ /* synthetic */ Object invoke(v20.o0 o0Var, zz.d<? super vz.b0> dVar) {
            return invoke2(o0Var, dVar);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Object invoke2(v20.o0 o0Var, zz.d<? super vz.b0> dVar) {
            return ((b) create(o0Var, dVar)).invokeSuspend(vz.b0.f54756a);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0043 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:14:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0078  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0041 -> B:12:0x0044). Please submit an issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r18) {
            /*
                r17 = this;
                r0 = r17
                java.lang.Object r1 = a00.b.d()
                int r2 = r0.f36092b
                r3 = 1
                if (r2 == 0) goto L24
                if (r2 != r3) goto L1c
                java.lang.Object r2 = r0.f36091a
                x20.g r2 = (x20.g) r2
                java.lang.Object r4 = r0.f36093c
                v20.o0 r4 = (v20.o0) r4
                vz.r.b(r18)
                r6 = r18
                r5 = r0
                goto L44
            L1c:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L24:
                vz.r.b(r18)
                java.lang.Object r2 = r0.f36093c
                v20.o0 r2 = (v20.o0) r2
                x20.e<T> r4 = r0.f36094d
                x20.g r4 = r4.iterator()
                r5 = r0
                r16 = r4
                r4 = r2
                r2 = r16
            L37:
                r5.f36093c = r4
                r5.f36091a = r2
                r5.f36092b = r3
                java.lang.Object r6 = r2.a(r5)
                if (r6 != r1) goto L44
                return r1
            L44:
                java.lang.Boolean r6 = (java.lang.Boolean) r6
                boolean r6 = r6.booleanValue()
                if (r6 == 0) goto L78
                java.lang.Object r6 = r2.next()
                x20.e<T> r7 = r5.f36094d
                java.lang.Object r7 = r7.l()
                java.lang.Object r7 = x20.i.f(r7)
                if (r7 != 0) goto L5e
                r9 = r6
                goto L5f
            L5e:
                r9 = r7
            L5f:
                r6 = 0
                r14 = 0
                l0.c$b$a r15 = new l0.c$b$a
                l0.a<T, V> r10 = r5.f36095e
                c1.v1<l0.i<T>> r11 = r5.f36096f
                c1.v1<h00.l<T, vz.b0>> r12 = r5.f36097g
                r13 = 0
                r8 = r15
                r8.<init>(r9, r10, r11, r12, r13)
                r11 = 3
                r12 = 0
                r7 = r4
                r8 = r6
                r9 = r14
                r10 = r15
                v20.i.d(r7, r8, r9, r10, r11, r12)
                goto L37
            L78:
                vz.b0 r1 = vz.b0.f54756a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: l0.c.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    static {
        j.i(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, s1.l.c(s1.d(s1.l.f49969b)), 3, null);
        j.i(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, s1.f.d(s1.c(s1.f.f49950b)), 3, null);
        j.i(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, s1.g(s1.h.f49955e), 3, null);
        j.i(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, Integer.valueOf(s1.b(kotlin.jvm.internal.r.f34922a)), 3, null);
        j.i(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, x2.k.b(s1.e(x2.k.f56947b)), 3, null);
        j.i(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, x2.o.b(s1.f(x2.o.f56954b)), 3, null);
    }

    public static final v1<x2.g> c(float f11, i<x2.g> iVar, h00.l<? super x2.g, vz.b0> lVar, c1.i iVar2, int i11, int i12) {
        iVar2.x(-1364859110);
        if ((i12 & 2) != 0) {
            iVar = f36088b;
        }
        i<x2.g> iVar3 = iVar;
        if ((i12 & 4) != 0) {
            lVar = null;
        }
        v1<x2.g> e11 = e(x2.g.c(f11), f1.g(x2.g.f56937b), iVar3, null, lVar, iVar2, (i11 & 14) | ((i11 << 3) & 896) | (57344 & (i11 << 6)), 8);
        iVar2.N();
        return e11;
    }

    public static final v1<Float> d(float f11, i<Float> iVar, float f12, h00.l<? super Float, vz.b0> lVar, c1.i iVar2, int i11, int i12) {
        iVar2.x(841393235);
        if ((i12 & 2) != 0) {
            iVar = f36087a;
        }
        if ((i12 & 4) != 0) {
            f12 = 0.01f;
        }
        h00.l<? super Float, vz.b0> lVar2 = (i12 & 8) != 0 ? null : lVar;
        iVar2.x(841393485);
        if (iVar == f36087a) {
            Float valueOf = Float.valueOf(f12);
            iVar2.x(-3686930);
            boolean O = iVar2.O(valueOf);
            Object y11 = iVar2.y();
            if (O || y11 == c1.i.f8486a.a()) {
                y11 = j.i(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, Float.valueOf(f12), 3, null);
                iVar2.p(y11);
            }
            iVar2.N();
            iVar = (i) y11;
        }
        iVar2.N();
        int i13 = i11 << 3;
        v1<Float> e11 = e(Float.valueOf(f11), f1.b(kotlin.jvm.internal.l.f34915a), iVar, Float.valueOf(f12), lVar2, iVar2, (i11 & 14) | (i13 & 7168) | (i13 & 57344), 0);
        iVar2.N();
        return e11;
    }

    public static final <T, V extends p> v1<T> e(T t11, d1<T, V> typeConverter, i<T> iVar, T t12, h00.l<? super T, vz.b0> lVar, c1.i iVar2, int i11, int i12) {
        i<T> iVar3;
        kotlin.jvm.internal.s.g(typeConverter, "typeConverter");
        iVar2.x(1824613323);
        if ((i12 & 4) != 0) {
            iVar2.x(-3687241);
            Object y11 = iVar2.y();
            if (y11 == c1.i.f8486a.a()) {
                y11 = j.i(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, t12, 3, null);
                iVar2.p(y11);
            }
            iVar2.N();
            iVar3 = (i) y11;
        } else {
            iVar3 = iVar;
        }
        h00.l<? super T, vz.b0> lVar2 = (i12 & 16) != 0 ? null : lVar;
        iVar2.x(-3687241);
        Object y12 = iVar2.y();
        i.a aVar = c1.i.f8486a;
        Object obj = y12;
        if (y12 == aVar.a()) {
            l0.a aVar2 = new l0.a(t11, typeConverter, null, 4, null);
            iVar2.p(aVar2);
            obj = aVar2;
        }
        iVar2.N();
        l0.a aVar3 = (l0.a) obj;
        v1 m11 = c1.n1.m(lVar2, iVar2, (i11 >> 12) & 14);
        v1 m12 = c1.n1.m(iVar3, iVar2, (i11 >> 6) & 14);
        iVar2.x(-3687241);
        Object y13 = iVar2.y();
        if (y13 == aVar.a()) {
            y13 = x20.h.b(-1, null, null, 6, null);
            iVar2.p(y13);
        }
        iVar2.N();
        x20.e eVar = (x20.e) y13;
        c1.b0.h(new a(eVar, t11), iVar2, 0);
        c1.b0.d(eVar, new b(eVar, aVar3, m12, m11, null), iVar2, 8);
        v1<T> g11 = aVar3.g();
        iVar2.N();
        return g11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> h00.l<T, vz.b0> f(v1<? extends h00.l<? super T, vz.b0>> v1Var) {
        return (h00.l) ((h00.l<? super T, vz.b0>) v1Var.getValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> i<T> g(v1<? extends i<T>> v1Var) {
        return v1Var.getValue();
    }
}