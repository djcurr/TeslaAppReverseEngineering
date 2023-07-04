package m0;

import androidx.compose.ui.platform.l0;
import androidx.compose.ui.platform.x0;
import androidx.compose.ui.platform.y0;
import c1.i;
import c1.o0;
import c1.s1;

/* loaded from: classes.dex */
public final class m {

    /* loaded from: classes.dex */
    public static final class a extends kotlin.jvm.internal.u implements h00.l<y0, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f37998a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ o0.m f37999b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z11, o0.m mVar) {
            super(1);
            this.f37998a = z11;
            this.f37999b = mVar;
        }

        public final void a(y0 y0Var) {
            kotlin.jvm.internal.s.g(y0Var, "$this$null");
            y0Var.b("focusable");
            y0Var.a().b("enabled", Boolean.valueOf(this.f37998a));
            y0Var.a().b("interactionSource", this.f37999b);
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ vz.b0 invoke(y0 y0Var) {
            a(y0Var);
            return vz.b0.f54756a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends kotlin.jvm.internal.u implements h00.q<o1.f, c1.i, Integer, o1.f> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o0.m f38000a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f38001b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public static final class a extends kotlin.jvm.internal.u implements h00.l<c1.z, c1.y> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ o0<o0.d> f38002a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ o0.m f38003b;

            /* renamed from: m0.m$b$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0722a implements c1.y {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ o0 f38004a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ o0.m f38005b;

                public C0722a(o0 o0Var, o0.m mVar) {
                    this.f38004a = o0Var;
                    this.f38005b = mVar;
                }

                @Override // c1.y
                public void dispose() {
                    o0.d dVar = (o0.d) this.f38004a.getValue();
                    if (dVar == null) {
                        return;
                    }
                    o0.e eVar = new o0.e(dVar);
                    o0.m mVar = this.f38005b;
                    if (mVar != null) {
                        mVar.a(eVar);
                    }
                    this.f38004a.setValue(null);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(o0<o0.d> o0Var, o0.m mVar) {
                super(1);
                this.f38002a = o0Var;
                this.f38003b = mVar;
            }

            @Override // h00.l
            public final c1.y invoke(c1.z DisposableEffect) {
                kotlin.jvm.internal.s.g(DisposableEffect, "$this$DisposableEffect");
                return new C0722a(this.f38002a, this.f38003b);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: m0.m$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0723b extends kotlin.jvm.internal.u implements h00.l<c1.z, c1.y> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ boolean f38006a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ v20.o0 f38007b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ o0<o0.d> f38008c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ o0.m f38009d;

            /* JADX INFO: Access modifiers changed from: package-private */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.FocusableKt$focusable$2$2$1", f = "Focusable.kt", l = {81}, m = "invokeSuspend")
            /* renamed from: m0.m$b$b$a */
            /* loaded from: classes.dex */
            public static final class a extends kotlin.coroutines.jvm.internal.l implements h00.p<v20.o0, zz.d<? super vz.b0>, Object> {

                /* renamed from: a  reason: collision with root package name */
                Object f38010a;

                /* renamed from: b  reason: collision with root package name */
                int f38011b;

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ o0<o0.d> f38012c;

                /* renamed from: d  reason: collision with root package name */
                final /* synthetic */ o0.m f38013d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(o0<o0.d> o0Var, o0.m mVar, zz.d<? super a> dVar) {
                    super(2, dVar);
                    this.f38012c = o0Var;
                    this.f38013d = mVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
                    return new a(this.f38012c, this.f38013d, dVar);
                }

                @Override // h00.p
                public final Object invoke(v20.o0 o0Var, zz.d<? super vz.b0> dVar) {
                    return ((a) create(o0Var, dVar)).invokeSuspend(vz.b0.f54756a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object d11;
                    o0<o0.d> o0Var;
                    o0<o0.d> o0Var2;
                    d11 = a00.d.d();
                    int i11 = this.f38011b;
                    if (i11 == 0) {
                        vz.r.b(obj);
                        o0.d value = this.f38012c.getValue();
                        if (value != null) {
                            o0.m mVar = this.f38013d;
                            o0Var = this.f38012c;
                            o0.e eVar = new o0.e(value);
                            if (mVar != null) {
                                this.f38010a = o0Var;
                                this.f38011b = 1;
                                if (mVar.c(eVar, this) == d11) {
                                    return d11;
                                }
                                o0Var2 = o0Var;
                            }
                            o0Var.setValue(null);
                        }
                        return vz.b0.f54756a;
                    } else if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        o0Var2 = (o0) this.f38010a;
                        vz.r.b(obj);
                    }
                    o0Var = o0Var2;
                    o0Var.setValue(null);
                    return vz.b0.f54756a;
                }
            }

            /* renamed from: m0.m$b$b$b  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0724b implements c1.y {
                @Override // c1.y
                public void dispose() {
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0723b(boolean z11, v20.o0 o0Var, o0<o0.d> o0Var2, o0.m mVar) {
                super(1);
                this.f38006a = z11;
                this.f38007b = o0Var;
                this.f38008c = o0Var2;
                this.f38009d = mVar;
            }

            @Override // h00.l
            public final c1.y invoke(c1.z DisposableEffect) {
                kotlin.jvm.internal.s.g(DisposableEffect, "$this$DisposableEffect");
                if (!this.f38006a) {
                    v20.k.d(this.f38007b, null, null, new a(this.f38008c, this.f38009d, null), 3, null);
                }
                return new C0724b();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public static final class c extends kotlin.jvm.internal.u implements h00.l<l2.v, vz.b0> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ o0<Boolean> f38014a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(o0<Boolean> o0Var) {
                super(1);
                this.f38014a = o0Var;
            }

            @Override // h00.l
            public /* bridge */ /* synthetic */ vz.b0 invoke(l2.v vVar) {
                invoke2(vVar);
                return vz.b0.f54756a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(l2.v semantics) {
                kotlin.jvm.internal.s.g(semantics, "$this$semantics");
                l2.t.H(semantics, b.d(this.f38014a));
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public static final class d extends kotlin.jvm.internal.u implements h00.l<r1.w, vz.b0> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ v20.o0 f38015a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ o0<Boolean> f38016b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ o0<o0.d> f38017c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ o0.m f38018d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ t0.b f38019e;

            /* JADX INFO: Access modifiers changed from: package-private */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.FocusableKt$focusable$2$4$1", f = "Focusable.kt", l = {102, 106, 108}, m = "invokeSuspend")
            /* loaded from: classes.dex */
            public static final class a extends kotlin.coroutines.jvm.internal.l implements h00.p<v20.o0, zz.d<? super vz.b0>, Object> {

                /* renamed from: a  reason: collision with root package name */
                Object f38020a;

                /* renamed from: b  reason: collision with root package name */
                int f38021b;

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ o0<o0.d> f38022c;

                /* renamed from: d  reason: collision with root package name */
                final /* synthetic */ o0.m f38023d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ t0.b f38024e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(o0<o0.d> o0Var, o0.m mVar, t0.b bVar, zz.d<? super a> dVar) {
                    super(2, dVar);
                    this.f38022c = o0Var;
                    this.f38023d = mVar;
                    this.f38024e = bVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
                    return new a(this.f38022c, this.f38023d, this.f38024e, dVar);
                }

                @Override // h00.p
                public final Object invoke(v20.o0 o0Var, zz.d<? super vz.b0> dVar) {
                    return ((a) create(o0Var, dVar)).invokeSuspend(vz.b0.f54756a);
                }

                /* JADX WARN: Removed duplicated region for block: B:27:0x0063  */
                /* JADX WARN: Removed duplicated region for block: B:32:0x007f A[RETURN] */
                @Override // kotlin.coroutines.jvm.internal.a
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r9) {
                    /*
                        r8 = this;
                        java.lang.Object r0 = a00.b.d()
                        int r1 = r8.f38021b
                        r2 = 3
                        r3 = 2
                        r4 = 1
                        r5 = 0
                        if (r1 == 0) goto L2f
                        if (r1 == r4) goto L27
                        if (r1 == r3) goto L1f
                        if (r1 != r2) goto L17
                        vz.r.b(r9)
                        goto L80
                    L17:
                        java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r9.<init>(r0)
                        throw r9
                    L1f:
                        java.lang.Object r1 = r8.f38020a
                        o0.d r1 = (o0.d) r1
                        vz.r.b(r9)
                        goto L6e
                    L27:
                        java.lang.Object r1 = r8.f38020a
                        c1.o0 r1 = (c1.o0) r1
                        vz.r.b(r9)
                        goto L55
                    L2f:
                        vz.r.b(r9)
                        c1.o0<o0.d> r9 = r8.f38022c
                        java.lang.Object r9 = r9.getValue()
                        o0.d r9 = (o0.d) r9
                        if (r9 != 0) goto L3d
                        goto L59
                    L3d:
                        o0.m r1 = r8.f38023d
                        c1.o0<o0.d> r6 = r8.f38022c
                        o0.e r7 = new o0.e
                        r7.<init>(r9)
                        if (r1 != 0) goto L49
                        goto L56
                    L49:
                        r8.f38020a = r6
                        r8.f38021b = r4
                        java.lang.Object r9 = r1.c(r7, r8)
                        if (r9 != r0) goto L54
                        return r0
                    L54:
                        r1 = r6
                    L55:
                        r6 = r1
                    L56:
                        r6.setValue(r5)
                    L59:
                        o0.d r1 = new o0.d
                        r1.<init>()
                        o0.m r9 = r8.f38023d
                        if (r9 != 0) goto L63
                        goto L6e
                    L63:
                        r8.f38020a = r1
                        r8.f38021b = r3
                        java.lang.Object r9 = r9.c(r1, r8)
                        if (r9 != r0) goto L6e
                        return r0
                    L6e:
                        c1.o0<o0.d> r9 = r8.f38022c
                        r9.setValue(r1)
                        t0.b r9 = r8.f38024e
                        r8.f38020a = r5
                        r8.f38021b = r2
                        java.lang.Object r9 = t0.b.a.a(r9, r5, r8, r4, r5)
                        if (r9 != r0) goto L80
                        return r0
                    L80:
                        vz.b0 r9 = vz.b0.f54756a
                        return r9
                    */
                    throw new UnsupportedOperationException("Method not decompiled: m0.m.b.d.a.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.FocusableKt$focusable$2$4$2", f = "Focusable.kt", l = {114}, m = "invokeSuspend")
            /* renamed from: m0.m$b$d$b  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0725b extends kotlin.coroutines.jvm.internal.l implements h00.p<v20.o0, zz.d<? super vz.b0>, Object> {

                /* renamed from: a  reason: collision with root package name */
                Object f38025a;

                /* renamed from: b  reason: collision with root package name */
                int f38026b;

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ o0<o0.d> f38027c;

                /* renamed from: d  reason: collision with root package name */
                final /* synthetic */ o0.m f38028d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0725b(o0<o0.d> o0Var, o0.m mVar, zz.d<? super C0725b> dVar) {
                    super(2, dVar);
                    this.f38027c = o0Var;
                    this.f38028d = mVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
                    return new C0725b(this.f38027c, this.f38028d, dVar);
                }

                @Override // h00.p
                public final Object invoke(v20.o0 o0Var, zz.d<? super vz.b0> dVar) {
                    return ((C0725b) create(o0Var, dVar)).invokeSuspend(vz.b0.f54756a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object d11;
                    o0<o0.d> o0Var;
                    o0<o0.d> o0Var2;
                    d11 = a00.d.d();
                    int i11 = this.f38026b;
                    if (i11 == 0) {
                        vz.r.b(obj);
                        o0.d value = this.f38027c.getValue();
                        if (value != null) {
                            o0.m mVar = this.f38028d;
                            o0Var = this.f38027c;
                            o0.e eVar = new o0.e(value);
                            if (mVar != null) {
                                this.f38025a = o0Var;
                                this.f38026b = 1;
                                if (mVar.c(eVar, this) == d11) {
                                    return d11;
                                }
                                o0Var2 = o0Var;
                            }
                            o0Var.setValue(null);
                        }
                        return vz.b0.f54756a;
                    } else if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        o0Var2 = (o0) this.f38025a;
                        vz.r.b(obj);
                    }
                    o0Var = o0Var2;
                    o0Var.setValue(null);
                    return vz.b0.f54756a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(v20.o0 o0Var, o0<Boolean> o0Var2, o0<o0.d> o0Var3, o0.m mVar, t0.b bVar) {
                super(1);
                this.f38015a = o0Var;
                this.f38016b = o0Var2;
                this.f38017c = o0Var3;
                this.f38018d = mVar;
                this.f38019e = bVar;
            }

            @Override // h00.l
            public /* bridge */ /* synthetic */ vz.b0 invoke(r1.w wVar) {
                invoke2(wVar);
                return vz.b0.f54756a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(r1.w it2) {
                kotlin.jvm.internal.s.g(it2, "it");
                b.e(this.f38016b, it2.isFocused());
                if (b.d(this.f38016b)) {
                    v20.k.d(this.f38015a, null, null, new a(this.f38017c, this.f38018d, this.f38019e, null), 3, null);
                } else {
                    v20.k.d(this.f38015a, null, null, new C0725b(this.f38017c, this.f38018d, null), 3, null);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(o0.m mVar, boolean z11) {
            super(3);
            this.f38000a = mVar;
            this.f38001b = z11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean d(o0<Boolean> o0Var) {
            return o0Var.getValue().booleanValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void e(o0<Boolean> o0Var, boolean z11) {
            o0Var.setValue(Boolean.valueOf(z11));
        }

        public final o1.f c(o1.f composed, c1.i iVar, int i11) {
            o1.f fVar;
            kotlin.jvm.internal.s.g(composed, "$this$composed");
            iVar.x(1407538527);
            iVar.x(-723524056);
            iVar.x(-3687241);
            Object y11 = iVar.y();
            i.a aVar = c1.i.f8486a;
            if (y11 == aVar.a()) {
                c1.s sVar = new c1.s(c1.b0.j(zz.h.f61280a, iVar));
                iVar.p(sVar);
                y11 = sVar;
            }
            iVar.N();
            v20.o0 a11 = ((c1.s) y11).a();
            iVar.N();
            iVar.x(-3687241);
            Object y12 = iVar.y();
            if (y12 == aVar.a()) {
                y12 = s1.d(null, null, 2, null);
                iVar.p(y12);
            }
            iVar.N();
            o0 o0Var = (o0) y12;
            iVar.x(-3687241);
            Object y13 = iVar.y();
            if (y13 == aVar.a()) {
                y13 = s1.d(Boolean.FALSE, null, 2, null);
                iVar.p(y13);
            }
            iVar.N();
            o0 o0Var2 = (o0) y13;
            iVar.x(-3687241);
            Object y14 = iVar.y();
            if (y14 == aVar.a()) {
                y14 = t0.d.a();
                iVar.p(y14);
            }
            iVar.N();
            t0.b bVar = (t0.b) y14;
            o0.m mVar = this.f38000a;
            c1.b0.a(mVar, new a(o0Var, mVar), iVar, 0);
            c1.b0.a(Boolean.valueOf(this.f38001b), new C0723b(this.f38001b, a11, o0Var, this.f38000a), iVar, 0);
            if (this.f38001b) {
                fVar = r1.k.a(r1.b.a(t0.d.b(l2.o.b(o1.f.f42062f1, false, new c(o0Var2), 1, null), bVar), new d(a11, o0Var2, o0Var, this.f38000a, bVar)));
            } else {
                fVar = o1.f.f42062f1;
            }
            iVar.N();
            return fVar;
        }

        @Override // h00.q
        public /* bridge */ /* synthetic */ o1.f invoke(o1.f fVar, c1.i iVar, Integer num) {
            return c(fVar, iVar, num.intValue());
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends kotlin.jvm.internal.u implements h00.l<y0, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f38029a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ o0.m f38030b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(boolean z11, o0.m mVar) {
            super(1);
            this.f38029a = z11;
            this.f38030b = mVar;
        }

        public final void a(y0 y0Var) {
            kotlin.jvm.internal.s.g(y0Var, "$this$null");
            y0Var.b("focusableInNonTouchMode");
            y0Var.a().b("enabled", Boolean.valueOf(this.f38029a));
            y0Var.a().b("interactionSource", this.f38030b);
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
        final /* synthetic */ boolean f38031a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ o0.m f38032b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public static final class a extends kotlin.jvm.internal.u implements h00.l<r1.p, vz.b0> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ a2.b f38033a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(a2.b bVar) {
                super(1);
                this.f38033a = bVar;
            }

            @Override // h00.l
            public /* bridge */ /* synthetic */ vz.b0 invoke(r1.p pVar) {
                invoke2(pVar);
                return vz.b0.f54756a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(r1.p focusProperties) {
                kotlin.jvm.internal.s.g(focusProperties, "$this$focusProperties");
                focusProperties.a(!a2.a.f(this.f38033a.a(), a2.a.f130b.b()));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(boolean z11, o0.m mVar) {
            super(3);
            this.f38031a = z11;
            this.f38032b = mVar;
        }

        public final o1.f a(o1.f composed, c1.i iVar, int i11) {
            kotlin.jvm.internal.s.g(composed, "$this$composed");
            iVar.x(-1672139192);
            o1.f a11 = m.a(r1.q.a(o1.f.f42062f1, new a((a2.b) iVar.A(l0.h()))), this.f38031a, this.f38032b);
            iVar.N();
            return a11;
        }

        @Override // h00.q
        public /* bridge */ /* synthetic */ o1.f invoke(o1.f fVar, c1.i iVar, Integer num) {
            return a(fVar, iVar, num.intValue());
        }
    }

    public static final o1.f a(o1.f fVar, boolean z11, o0.m mVar) {
        kotlin.jvm.internal.s.g(fVar, "<this>");
        return o1.e.a(fVar, x0.c() ? new a(z11, mVar) : x0.a(), new b(mVar, z11));
    }

    public static final o1.f b(o1.f fVar, boolean z11, o0.m mVar) {
        kotlin.jvm.internal.s.g(fVar, "<this>");
        return o1.e.a(fVar, x0.c() ? new c(z11, mVar) : x0.a(), new d(z11, mVar));
    }
}