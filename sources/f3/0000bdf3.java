package x0;

import d2.c0;
import vz.b0;

/* loaded from: classes.dex */
public final class a0 {

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt", f = "TextSelectionMouseDetector.kt", l = {128}, m = "awaitMouseEventDown")
    /* loaded from: classes.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        Object f56539a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f56540b;

        /* renamed from: c  reason: collision with root package name */
        int f56541c;

        a(zz.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f56540b = obj;
            this.f56541c |= Integer.MIN_VALUE;
            return a0.b(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt$mouseSelectionDetector$2", f = "TextSelectionMouseDetector.kt", l = {88}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    static final class b extends kotlin.coroutines.jvm.internal.l implements h00.p<c0, zz.d<? super b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f56542a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f56543b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ g f56544c;

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt$mouseSelectionDetector$2$1", f = "TextSelectionMouseDetector.kt", l = {91, 98, 113}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.k implements h00.p<d2.c, zz.d<? super b0>, Object> {

            /* renamed from: b  reason: collision with root package name */
            Object f56545b;

            /* renamed from: c  reason: collision with root package name */
            int f56546c;

            /* renamed from: d  reason: collision with root package name */
            private /* synthetic */ Object f56547d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ g f56548e;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: x0.a0$b$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C1289a extends kotlin.jvm.internal.u implements h00.l<d2.u, b0> {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ g f56549a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C1289a(g gVar) {
                    super(1);
                    this.f56549a = gVar;
                }

                public final void a(d2.u it2) {
                    kotlin.jvm.internal.s.g(it2, "it");
                    if (this.f56549a.c(it2.h())) {
                        d2.n.e(it2);
                    }
                }

                @Override // h00.l
                public /* bridge */ /* synthetic */ b0 invoke(d2.u uVar) {
                    a(uVar);
                    return b0.f54756a;
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: x0.a0$b$a$b  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C1290b extends kotlin.jvm.internal.u implements h00.l<d2.u, b0> {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ g f56550a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ k f56551b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C1290b(g gVar, k kVar) {
                    super(1);
                    this.f56550a = gVar;
                    this.f56551b = kVar;
                }

                public final void a(d2.u it2) {
                    kotlin.jvm.internal.s.g(it2, "it");
                    if (this.f56550a.b(it2.h(), this.f56551b)) {
                        d2.n.e(it2);
                    }
                }

                @Override // h00.l
                public /* bridge */ /* synthetic */ b0 invoke(d2.u uVar) {
                    a(uVar);
                    return b0.f54756a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(g gVar, zz.d<? super a> dVar) {
                super(2, dVar);
                this.f56548e = gVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final zz.d<b0> create(Object obj, zz.d<?> dVar) {
                a aVar = new a(this.f56548e, dVar);
                aVar.f56547d = obj;
                return aVar;
            }

            @Override // h00.p
            /* renamed from: e */
            public final Object invoke(d2.c cVar, zz.d<? super b0> dVar) {
                return ((a) create(cVar, dVar)).invokeSuspend(b0.f54756a);
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0051 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:17:0x0052  */
            /* JADX WARN: Removed duplicated region for block: B:20:0x006c  */
            /* JADX WARN: Removed duplicated region for block: B:25:0x0093  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00d6 -> B:14:0x0045). Please submit an issue!!! */
            @Override // kotlin.coroutines.jvm.internal.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r13) {
                /*
                    r12 = this;
                    java.lang.Object r0 = a00.b.d()
                    int r1 = r12.f56546c
                    r2 = 3
                    r3 = 2
                    r4 = 1
                    if (r1 == 0) goto L34
                    if (r1 == r4) goto L27
                    if (r1 == r3) goto L1a
                    if (r1 != r2) goto L12
                    goto L1a
                L12:
                    java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r13.<init>(r0)
                    throw r13
                L1a:
                    java.lang.Object r1 = r12.f56545b
                    x0.c r1 = (x0.c) r1
                    java.lang.Object r5 = r12.f56547d
                    d2.c r5 = (d2.c) r5
                    vz.r.b(r13)
                    r13 = r5
                    goto L44
                L27:
                    java.lang.Object r1 = r12.f56545b
                    x0.c r1 = (x0.c) r1
                    java.lang.Object r5 = r12.f56547d
                    d2.c r5 = (d2.c) r5
                    vz.r.b(r13)
                    r6 = r12
                    goto L56
                L34:
                    vz.r.b(r13)
                    java.lang.Object r13 = r12.f56547d
                    d2.c r13 = (d2.c) r13
                    x0.c r1 = new x0.c
                    androidx.compose.ui.platform.y1 r5 = r13.getViewConfiguration()
                    r1.<init>(r5)
                L44:
                    r5 = r12
                L45:
                    r5.f56547d = r13
                    r5.f56545b = r1
                    r5.f56546c = r4
                    java.lang.Object r6 = x0.a0.a(r13, r5)
                    if (r6 != r0) goto L52
                    return r0
                L52:
                    r11 = r5
                    r5 = r13
                    r13 = r6
                    r6 = r11
                L56:
                    d2.m r13 = (d2.m) r13
                    r1.d(r13)
                    java.util.List r7 = r13.b()
                    r8 = 0
                    java.lang.Object r7 = r7.get(r8)
                    d2.u r7 = (d2.u) r7
                    boolean r13 = x0.v.a(r13)
                    if (r13 == 0) goto L93
                    x0.g r13 = r6.f56548e
                    long r8 = r7.h()
                    boolean r13 = r13.d(r8)
                    if (r13 == 0) goto Ld6
                    d2.n.f(r7)
                    long r7 = r7.g()
                    x0.a0$b$a$a r13 = new x0.a0$b$a$a
                    x0.g r9 = r6.f56548e
                    r13.<init>(r9)
                    r6.f56547d = r5
                    r6.f56545b = r1
                    r6.f56546c = r3
                    java.lang.Object r13 = n0.j.j(r5, r7, r13, r6)
                    if (r13 != r0) goto Ld6
                    return r0
                L93:
                    int r13 = r1.a()
                    if (r13 == r4) goto La9
                    if (r13 == r3) goto La2
                    x0.k$a r13 = x0.k.f56574a
                    x0.k r13 = r13.f()
                    goto Laf
                La2:
                    x0.k$a r13 = x0.k.f56574a
                    x0.k r13 = r13.g()
                    goto Laf
                La9:
                    x0.k$a r13 = x0.k.f56574a
                    x0.k r13 = r13.e()
                Laf:
                    x0.g r8 = r6.f56548e
                    long r9 = r7.h()
                    boolean r8 = r8.a(r9, r13)
                    if (r8 == 0) goto Ld6
                    d2.n.f(r7)
                    long r7 = r7.g()
                    x0.a0$b$a$b r9 = new x0.a0$b$a$b
                    x0.g r10 = r6.f56548e
                    r9.<init>(r10, r13)
                    r6.f56547d = r5
                    r6.f56545b = r1
                    r6.f56546c = r2
                    java.lang.Object r13 = n0.j.j(r5, r7, r9, r6)
                    if (r13 != r0) goto Ld6
                    return r0
                Ld6:
                    r13 = r5
                    r5 = r6
                    goto L45
                */
                throw new UnsupportedOperationException("Method not decompiled: x0.a0.b.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(g gVar, zz.d<? super b> dVar) {
            super(2, dVar);
            this.f56544c = gVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<b0> create(Object obj, zz.d<?> dVar) {
            b bVar = new b(this.f56544c, dVar);
            bVar.f56543b = obj;
            return bVar;
        }

        @Override // h00.p
        public final Object invoke(c0 c0Var, zz.d<? super b0> dVar) {
            return ((b) create(c0Var, dVar)).invokeSuspend(b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d11;
            d11 = a00.d.d();
            int i11 = this.f56542a;
            if (i11 == 0) {
                vz.r.b(obj);
                a aVar = new a(this.f56544c, null);
                this.f56542a = 1;
                if (((c0) this.f56543b).E(aVar, this) == d11) {
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

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
        */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0044 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0079 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0042 -> B:18:0x0045). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(d2.c r10, zz.d<? super d2.m> r11) {
        /*
            boolean r0 = r11 instanceof x0.a0.a
            if (r0 == 0) goto L13
            r0 = r11
            x0.a0$a r0 = (x0.a0.a) r0
            int r1 = r0.f56541c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f56541c = r1
            goto L18
        L13:
            x0.a0$a r0 = new x0.a0$a
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f56540b
            java.lang.Object r1 = a00.b.d()
            int r2 = r0.f56541c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r10 = r0.f56539a
            d2.c r10 = (d2.c) r10
            vz.r.b(r11)
            goto L45
        L2d:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L35:
            vz.r.b(r11)
        L38:
            androidx.compose.ui.input.pointer.a r11 = androidx.compose.ui.input.pointer.a.Main
            r0.f56539a = r10
            r0.f56541c = r3
            java.lang.Object r11 = r10.P(r11, r0)
            if (r11 != r1) goto L45
            return r1
        L45:
            d2.m r11 = (d2.m) r11
            java.util.List r2 = r11.b()
            int r4 = r2.size()
            r5 = 0
            r6 = r5
        L51:
            if (r6 >= r4) goto L79
            int r7 = r6 + 1
            java.lang.Object r6 = r2.get(r6)
            d2.u r6 = (d2.u) r6
            int r8 = r6.m()
            d2.e0$a r9 = d2.e0.f23301a
            int r9 = r9.b()
            boolean r8 = d2.e0.g(r8, r9)
            if (r8 == 0) goto L73
            boolean r6 = d2.n.a(r6)
            if (r6 == 0) goto L73
            r6 = r3
            goto L74
        L73:
            r6 = r5
        L74:
            if (r6 != 0) goto L77
            goto L7a
        L77:
            r6 = r7
            goto L51
        L79:
            r5 = r3
        L7a:
            if (r5 == 0) goto L38
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: x0.a0.b(d2.c, zz.d):java.lang.Object");
    }

    public static final Object c(c0 c0Var, g gVar, zz.d<? super b0> dVar) {
        Object d11;
        Object d12 = n0.q.d(c0Var, new b(gVar, null), dVar);
        d11 = a00.d.d();
        return d12 == d11 ? d12 : b0.f54756a;
    }
}