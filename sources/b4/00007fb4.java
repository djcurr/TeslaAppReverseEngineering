package kotlinx.coroutines.flow;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final /* synthetic */ class n {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes5.dex */
    public static final class a<T> implements kotlinx.coroutines.flow.e<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.e f35299a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h00.p f35300b;

        public a(kotlinx.coroutines.flow.e eVar, h00.p pVar) {
            this.f35299a = eVar;
            this.f35300b = pVar;
        }

        @Override // kotlinx.coroutines.flow.e
        public Object collect(f<? super T> fVar, zz.d<? super vz.b0> dVar) {
            Object d11;
            Object collect = this.f35299a.collect(new b(new kotlin.jvm.internal.h0(), fVar, this.f35300b), dVar);
            d11 = a00.d.d();
            return collect == d11 ? collect : vz.b0.f54756a;
        }
    }

    /* loaded from: classes5.dex */
    static final class b<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.h0 f35301a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ f<T> f35302b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h00.p<T, zz.d<? super Boolean>, Object> f35303c;

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1", f = "Limit.kt", l = {37, 38, 40}, m = "emit")
        /* loaded from: classes5.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: a  reason: collision with root package name */
            Object f35304a;

            /* renamed from: b  reason: collision with root package name */
            Object f35305b;

            /* renamed from: c  reason: collision with root package name */
            /* synthetic */ Object f35306c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ b<T> f35307d;

            /* renamed from: e  reason: collision with root package name */
            int f35308e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(b<? super T> bVar, zz.d<? super a> dVar) {
                super(dVar);
                this.f35307d = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f35306c = obj;
                this.f35308e |= Integer.MIN_VALUE;
                return this.f35307d.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        b(kotlin.jvm.internal.h0 h0Var, f<? super T> fVar, h00.p<? super T, ? super zz.d<? super Boolean>, ? extends Object> pVar) {
            this.f35301a = h0Var;
            this.f35302b = fVar;
            this.f35303c = pVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0045  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0074  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x008b  */
        @Override // kotlinx.coroutines.flow.f
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object emit(T r7, zz.d<? super vz.b0> r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof kotlinx.coroutines.flow.n.b.a
                if (r0 == 0) goto L13
                r0 = r8
                kotlinx.coroutines.flow.n$b$a r0 = (kotlinx.coroutines.flow.n.b.a) r0
                int r1 = r0.f35308e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f35308e = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.n$b$a r0 = new kotlinx.coroutines.flow.n$b$a
                r0.<init>(r6, r8)
            L18:
                java.lang.Object r8 = r0.f35306c
                java.lang.Object r1 = a00.b.d()
                int r2 = r0.f35308e
                r3 = 3
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L45
                if (r2 == r5) goto L41
                if (r2 == r4) goto L37
                if (r2 != r3) goto L2f
                vz.r.b(r8)
                goto L88
            L2f:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L37:
                java.lang.Object r7 = r0.f35305b
                java.lang.Object r2 = r0.f35304a
                kotlinx.coroutines.flow.n$b r2 = (kotlinx.coroutines.flow.n.b) r2
                vz.r.b(r8)
                goto L6c
            L41:
                vz.r.b(r8)
                goto L59
            L45:
                vz.r.b(r8)
                kotlin.jvm.internal.h0 r8 = r6.f35301a
                boolean r8 = r8.f34902a
                if (r8 == 0) goto L5c
                kotlinx.coroutines.flow.f<T> r8 = r6.f35302b
                r0.f35308e = r5
                java.lang.Object r7 = r8.emit(r7, r0)
                if (r7 != r1) goto L59
                return r1
            L59:
                vz.b0 r7 = vz.b0.f54756a
                return r7
            L5c:
                h00.p<T, zz.d<? super java.lang.Boolean>, java.lang.Object> r8 = r6.f35303c
                r0.f35304a = r6
                r0.f35305b = r7
                r0.f35308e = r4
                java.lang.Object r8 = r8.invoke(r7, r0)
                if (r8 != r1) goto L6b
                return r1
            L6b:
                r2 = r6
            L6c:
                java.lang.Boolean r8 = (java.lang.Boolean) r8
                boolean r8 = r8.booleanValue()
                if (r8 != 0) goto L8b
                kotlin.jvm.internal.h0 r8 = r2.f35301a
                r8.f34902a = r5
                kotlinx.coroutines.flow.f<T> r8 = r2.f35302b
                r2 = 0
                r0.f35304a = r2
                r0.f35305b = r2
                r0.f35308e = r3
                java.lang.Object r7 = r8.emit(r7, r0)
                if (r7 != r1) goto L88
                return r1
            L88:
                vz.b0 r7 = vz.b0.f54756a
                return r7
            L8b:
                vz.b0 r7 = vz.b0.f54756a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.n.b.emit(java.lang.Object, zz.d):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__LimitKt", f = "Limit.kt", l = {73}, m = "emitAbort$FlowKt__LimitKt")
    /* loaded from: classes5.dex */
    public static final class c<T> extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        Object f35309a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f35310b;

        /* renamed from: c  reason: collision with root package name */
        int f35311c;

        c(zz.d<? super c> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f35310b = obj;
            this.f35311c |= Integer.MIN_VALUE;
            return n.c(null, null, this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes5.dex */
    public static final class d<T> implements kotlinx.coroutines.flow.e<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.e f35312a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f35313b;

        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1", f = "Limit.kt", l = {115}, m = "collect")
        /* loaded from: classes5.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: a  reason: collision with root package name */
            /* synthetic */ Object f35314a;

            /* renamed from: b  reason: collision with root package name */
            int f35315b;

            /* renamed from: d  reason: collision with root package name */
            Object f35317d;

            public a(zz.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f35314a = obj;
                this.f35315b |= Integer.MIN_VALUE;
                return d.this.collect(null, this);
            }
        }

        public d(kotlinx.coroutines.flow.e eVar, int i11) {
            this.f35312a = eVar;
            this.f35313b = i11;
        }

        /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(2:10|11)(2:17|18))(3:19|20|(1:22))|12|13|14))|25|6|7|(0)(0)|12|13|14) */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0051, code lost:
            r8 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0052, code lost:
            y20.m.a(r8, r7);
         */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
        @Override // kotlinx.coroutines.flow.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object collect(kotlinx.coroutines.flow.f<? super T> r7, zz.d<? super vz.b0> r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof kotlinx.coroutines.flow.n.d.a
                if (r0 == 0) goto L13
                r0 = r8
                kotlinx.coroutines.flow.n$d$a r0 = (kotlinx.coroutines.flow.n.d.a) r0
                int r1 = r0.f35315b
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f35315b = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.n$d$a r0 = new kotlinx.coroutines.flow.n$d$a
                r0.<init>(r8)
            L18:
                java.lang.Object r8 = r0.f35314a
                java.lang.Object r1 = a00.b.d()
                int r2 = r0.f35315b
                r3 = 1
                if (r2 == 0) goto L35
                if (r2 != r3) goto L2d
                java.lang.Object r7 = r0.f35317d
                kotlinx.coroutines.flow.f r7 = (kotlinx.coroutines.flow.f) r7
                vz.r.b(r8)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L51
                goto L55
            L2d:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L35:
                vz.r.b(r8)
                kotlin.jvm.internal.j0 r8 = new kotlin.jvm.internal.j0
                r8.<init>()
                kotlinx.coroutines.flow.e r2 = r6.f35312a     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L51
                kotlinx.coroutines.flow.n$e r4 = new kotlinx.coroutines.flow.n$e     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L51
                int r5 = r6.f35313b     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L51
                r4.<init>(r8, r5, r7)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L51
                r0.f35317d = r7     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L51
                r0.f35315b = r3     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L51
                java.lang.Object r7 = r2.collect(r4, r0)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L51
                if (r7 != r1) goto L55
                return r1
            L51:
                r8 = move-exception
                y20.m.a(r8, r7)
            L55:
                vz.b0 r7 = vz.b0.f54756a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.n.d.collect(kotlinx.coroutines.flow.f, zz.d):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class e<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.j0 f35318a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f35319b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ f<T> f35320c;

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1", f = "Limit.kt", l = {61, 63}, m = "emit")
        /* loaded from: classes5.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: a  reason: collision with root package name */
            /* synthetic */ Object f35321a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ e<T> f35322b;

            /* renamed from: c  reason: collision with root package name */
            int f35323c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(e<? super T> eVar, zz.d<? super a> dVar) {
                super(dVar);
                this.f35322b = eVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f35321a = obj;
                this.f35323c |= Integer.MIN_VALUE;
                return this.f35322b.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        e(kotlin.jvm.internal.j0 j0Var, int i11, f<? super T> fVar) {
            this.f35318a = j0Var;
            this.f35319b = i11;
            this.f35320c = fVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
        @Override // kotlinx.coroutines.flow.f
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object emit(T r6, zz.d<? super vz.b0> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof kotlinx.coroutines.flow.n.e.a
                if (r0 == 0) goto L13
                r0 = r7
                kotlinx.coroutines.flow.n$e$a r0 = (kotlinx.coroutines.flow.n.e.a) r0
                int r1 = r0.f35323c
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f35323c = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.n$e$a r0 = new kotlinx.coroutines.flow.n$e$a
                r0.<init>(r5, r7)
            L18:
                java.lang.Object r7 = r0.f35321a
                java.lang.Object r1 = a00.b.d()
                int r2 = r0.f35323c
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L38
                if (r2 == r4) goto L34
                if (r2 != r3) goto L2c
                vz.r.b(r7)
                goto L5f
            L2c:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L34:
                vz.r.b(r7)
                goto L51
            L38:
                vz.r.b(r7)
                kotlin.jvm.internal.j0 r7 = r5.f35318a
                int r2 = r7.f34912a
                int r2 = r2 + r4
                r7.f34912a = r2
                int r7 = r5.f35319b
                if (r2 >= r7) goto L54
                kotlinx.coroutines.flow.f<T> r7 = r5.f35320c
                r0.f35323c = r4
                java.lang.Object r6 = r7.emit(r6, r0)
                if (r6 != r1) goto L51
                return r1
            L51:
                vz.b0 r6 = vz.b0.f54756a
                return r6
            L54:
                kotlinx.coroutines.flow.f<T> r7 = r5.f35320c
                r0.f35323c = r3
                java.lang.Object r6 = kotlinx.coroutines.flow.n.a(r7, r6, r0)
                if (r6 != r1) goto L5f
                return r1
            L5f:
                vz.b0 r6 = vz.b0.f54756a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.n.e.emit(java.lang.Object, zz.d):java.lang.Object");
        }
    }

    public static final <T> kotlinx.coroutines.flow.e<T> b(kotlinx.coroutines.flow.e<? extends T> eVar, h00.p<? super T, ? super zz.d<? super Boolean>, ? extends Object> pVar) {
        return new a(eVar, pVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> java.lang.Object c(kotlinx.coroutines.flow.f<? super T> r4, T r5, zz.d<? super vz.b0> r6) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.n.c
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.flow.n$c r0 = (kotlinx.coroutines.flow.n.c) r0
            int r1 = r0.f35311c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f35311c = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.n$c r0 = new kotlinx.coroutines.flow.n$c
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f35310b
            java.lang.Object r1 = a00.b.d()
            int r2 = r0.f35311c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 == r3) goto L2d
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2d:
            java.lang.Object r4 = r0.f35309a
            kotlinx.coroutines.flow.f r4 = (kotlinx.coroutines.flow.f) r4
            vz.r.b(r6)
            goto L43
        L35:
            vz.r.b(r6)
            r0.f35309a = r4
            r0.f35311c = r3
            java.lang.Object r5 = r4.emit(r5, r0)
            if (r5 != r1) goto L43
            return r1
        L43:
            kotlinx.coroutines.flow.internal.AbortFlowException r5 = new kotlinx.coroutines.flow.internal.AbortFlowException
            r5.<init>(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.n.c(kotlinx.coroutines.flow.f, java.lang.Object, zz.d):java.lang.Object");
    }

    public static final <T> kotlinx.coroutines.flow.e<T> d(kotlinx.coroutines.flow.e<? extends T> eVar, int i11) {
        if (i11 > 0) {
            return new d(eVar, i11);
        }
        throw new IllegalArgumentException(("Requested element count " + i11 + " should be positive").toString());
    }
}