package d2;

import androidx.compose.ui.platform.l0;
import androidx.compose.ui.platform.x0;
import androidx.compose.ui.platform.y0;

/* loaded from: classes.dex */
public final class q {

    /* loaded from: classes.dex */
    public static final class a extends kotlin.jvm.internal.u implements h00.l<y0, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p f23395a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f23396b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(p pVar, boolean z11) {
            super(1);
            this.f23395a = pVar;
            this.f23396b = z11;
        }

        public final void a(y0 y0Var) {
            kotlin.jvm.internal.s.g(y0Var, "$this$null");
            y0Var.b("pointerHoverIcon");
            y0Var.a().b("icon", this.f23395a);
            y0Var.a().b("overrideDescendants", Boolean.valueOf(this.f23396b));
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
        final /* synthetic */ p f23397a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f23398b;

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.input.pointer.PointerIconKt$pointerHoverIcon$2$1", f = "PointerIcon.kt", l = {70}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements h00.p<c0, zz.d<? super vz.b0>, Object> {

            /* renamed from: a  reason: collision with root package name */
            int f23399a;

            /* renamed from: b  reason: collision with root package name */
            private /* synthetic */ Object f23400b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ boolean f23401c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ r f23402d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ p f23403e;

            /* JADX INFO: Access modifiers changed from: package-private */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.input.pointer.PointerIconKt$pointerHoverIcon$2$1$1", f = "PointerIcon.kt", l = {76}, m = "invokeSuspend")
            /* renamed from: d2.q$b$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0450a extends kotlin.coroutines.jvm.internal.k implements h00.p<c, zz.d<? super vz.b0>, Object> {

                /* renamed from: b  reason: collision with root package name */
                int f23404b;

                /* renamed from: c  reason: collision with root package name */
                private /* synthetic */ Object f23405c;

                /* renamed from: d  reason: collision with root package name */
                final /* synthetic */ boolean f23406d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ r f23407e;

                /* renamed from: f  reason: collision with root package name */
                final /* synthetic */ p f23408f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0450a(boolean z11, r rVar, p pVar, zz.d<? super C0450a> dVar) {
                    super(2, dVar);
                    this.f23406d = z11;
                    this.f23407e = rVar;
                    this.f23408f = pVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
                    C0450a c0450a = new C0450a(this.f23406d, this.f23407e, this.f23408f, dVar);
                    c0450a.f23405c = obj;
                    return c0450a;
                }

                @Override // h00.p
                /* renamed from: e */
                public final Object invoke(c cVar, zz.d<? super vz.b0> dVar) {
                    return ((C0450a) create(cVar, dVar)).invokeSuspend(vz.b0.f54756a);
                }

                /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
                /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
                /* JADX WARN: Removed duplicated region for block: B:15:0x003a A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:16:0x003b  */
                /* JADX WARN: Removed duplicated region for block: B:19:0x0052  */
                /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
                /* JADX WARN: Removed duplicated region for block: B:22:0x005e  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003b -> B:17:0x0040). Please submit an issue!!! */
                @Override // kotlin.coroutines.jvm.internal.a
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r8) {
                    /*
                        r7 = this;
                        java.lang.Object r0 = a00.b.d()
                        int r1 = r7.f23404b
                        r2 = 1
                        if (r1 == 0) goto L1e
                        if (r1 != r2) goto L16
                        java.lang.Object r1 = r7.f23405c
                        d2.c r1 = (d2.c) r1
                        vz.r.b(r8)
                        r3 = r1
                        r1 = r0
                        r0 = r7
                        goto L40
                    L16:
                        java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r8.<init>(r0)
                        throw r8
                    L1e:
                        vz.r.b(r8)
                        java.lang.Object r8 = r7.f23405c
                        d2.c r8 = (d2.c) r8
                        r1 = r8
                        r8 = r7
                    L27:
                        boolean r3 = r8.f23406d
                        if (r3 == 0) goto L2e
                        androidx.compose.ui.input.pointer.a r3 = androidx.compose.ui.input.pointer.a.Main
                        goto L30
                    L2e:
                        androidx.compose.ui.input.pointer.a r3 = androidx.compose.ui.input.pointer.a.Initial
                    L30:
                        r8.f23405c = r1
                        r8.f23404b = r2
                        java.lang.Object r3 = r1.P(r3, r8)
                        if (r3 != r0) goto L3b
                        return r0
                    L3b:
                        r6 = r0
                        r0 = r8
                        r8 = r3
                        r3 = r1
                        r1 = r6
                    L40:
                        d2.m r8 = (d2.m) r8
                        int r8 = r8.d()
                        d2.o$a r4 = d2.o.f23387a
                        int r5 = r4.a()
                        boolean r5 = d2.o.i(r8, r5)
                        if (r5 == 0) goto L54
                        r8 = r2
                        goto L5c
                    L54:
                        int r4 = r4.c()
                        boolean r8 = d2.o.i(r8, r4)
                    L5c:
                        if (r8 == 0) goto L65
                        d2.r r8 = r0.f23407e
                        d2.p r4 = r0.f23408f
                        r8.a(r4)
                    L65:
                        r8 = r0
                        r0 = r1
                        r1 = r3
                        goto L27
                    */
                    throw new UnsupportedOperationException("Method not decompiled: d2.q.b.a.C0450a.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(boolean z11, r rVar, p pVar, zz.d<? super a> dVar) {
                super(2, dVar);
                this.f23401c = z11;
                this.f23402d = rVar;
                this.f23403e = pVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
                a aVar = new a(this.f23401c, this.f23402d, this.f23403e, dVar);
                aVar.f23400b = obj;
                return aVar;
            }

            @Override // h00.p
            public final Object invoke(c0 c0Var, zz.d<? super vz.b0> dVar) {
                return ((a) create(c0Var, dVar)).invokeSuspend(vz.b0.f54756a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object d11;
                d11 = a00.d.d();
                int i11 = this.f23399a;
                if (i11 == 0) {
                    vz.r.b(obj);
                    C0450a c0450a = new C0450a(this.f23401c, this.f23402d, this.f23403e, null);
                    this.f23399a = 1;
                    if (((c0) this.f23400b).E(c0450a, this) == d11) {
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
        b(p pVar, boolean z11) {
            super(3);
            this.f23397a = pVar;
            this.f23398b = z11;
        }

        public final o1.f a(o1.f composed, c1.i iVar, int i11) {
            o1.f c11;
            kotlin.jvm.internal.s.g(composed, "$this$composed");
            iVar.x(-270919819);
            r rVar = (r) iVar.A(l0.j());
            if (rVar == null) {
                c11 = o1.f.f42062f1;
            } else {
                c11 = i0.c(composed, this.f23397a, Boolean.valueOf(this.f23398b), new a(this.f23398b, rVar, this.f23397a, null));
            }
            iVar.N();
            return c11;
        }

        @Override // h00.q
        public /* bridge */ /* synthetic */ o1.f invoke(o1.f fVar, c1.i iVar, Integer num) {
            return a(fVar, iVar, num.intValue());
        }
    }

    public static final o1.f a(o1.f fVar, p icon, boolean z11) {
        kotlin.jvm.internal.s.g(fVar, "<this>");
        kotlin.jvm.internal.s.g(icon, "icon");
        return o1.e.a(fVar, x0.c() ? new a(icon, z11) : x0.a(), new b(icon, z11));
    }

    public static /* synthetic */ o1.f b(o1.f fVar, p pVar, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return a(fVar, pVar, z11);
    }
}