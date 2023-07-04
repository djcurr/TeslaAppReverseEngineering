package com.plaid.internal;

/* loaded from: classes2.dex */
public final class i3 {

    /* renamed from: a  reason: collision with root package name */
    public static final i3 f18728a = new i3();

    @kotlin.coroutines.jvm.internal.f(c = "com.plaid.internal.workflow.network.ExponentialBackoffRetry", f = "ExponentialBackoffRetry.kt", l = {22, 24}, m = "doNetworkCallWithRetries$link_sdk_release")
    /* loaded from: classes2.dex */
    public static final class a<T> extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        public Object f18729a;

        /* renamed from: b  reason: collision with root package name */
        public Object f18730b;

        /* renamed from: c  reason: collision with root package name */
        public Object f18731c;

        /* renamed from: d  reason: collision with root package name */
        public /* synthetic */ Object f18732d;

        /* renamed from: f  reason: collision with root package name */
        public int f18734f;

        public a(zz.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f18732d = obj;
            this.f18734f |= Integer.MIN_VALUE;
            return i3.this.a(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.plaid.internal.workflow.network.ExponentialBackoffRetry$doNetworkCallWithRetries$2", f = "ExponentialBackoffRetry.kt", l = {32, 33}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.l implements h00.p<v20.o0, zz.d<? super vz.b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public Object f18735a;

        /* renamed from: b  reason: collision with root package name */
        public int f18736b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.j0 f18737c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.l0<f7<T, Object>> f18738d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ h00.l<zz.d<? super f7<? extends T, ? extends Object>>, Object> f18739e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(kotlin.jvm.internal.j0 j0Var, kotlin.jvm.internal.l0<f7<T, Object>> l0Var, h00.l<? super zz.d<? super f7<? extends T, ? extends Object>>, ? extends Object> lVar, zz.d<? super b> dVar) {
            super(2, dVar);
            this.f18737c = j0Var;
            this.f18738d = l0Var;
            this.f18739e = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
            return new b(this.f18737c, this.f18738d, this.f18739e, dVar);
        }

        @Override // h00.p
        public Object invoke(v20.o0 o0Var, zz.d<? super vz.b0> dVar) {
            return new b(this.f18737c, this.f18738d, this.f18739e, dVar).invokeSuspend(vz.b0.f54756a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:13:0x0031  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0057  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0090 A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x008e -> B:28:0x0091). Please submit an issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = a00.b.d()
                int r1 = r8.f18736b
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L26
                if (r1 == r3) goto L21
                if (r1 != r2) goto L19
                java.lang.Object r1 = r8.f18735a
                kotlin.jvm.internal.l0 r1 = (kotlin.jvm.internal.l0) r1
                vz.r.b(r9)
                r4 = r9
                r9 = r8
                goto L91
            L19:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L21:
                vz.r.b(r9)
                r9 = r8
                goto L82
            L26:
                vz.r.b(r9)
                r9 = r8
            L2a:
                kotlin.jvm.internal.j0 r1 = r9.f18737c
                int r1 = r1.f34912a
                r4 = 4
                if (r1 >= r4) goto L9b
                kotlin.jvm.internal.l0<com.plaid.internal.f7<T, java.lang.Object>> r1 = r9.f18738d
                T r1 = r1.f34916a
                com.plaid.internal.f7 r1 = (com.plaid.internal.f7) r1
                boolean r1 = r1.a()
                if (r1 == 0) goto L9b
                kotlin.jvm.internal.l0<com.plaid.internal.f7<T, java.lang.Object>> r1 = r9.f18738d
                T r1 = r1.f34916a
                com.plaid.internal.f7 r1 = (com.plaid.internal.f7) r1
                r1.getClass()
                boolean r4 = r1 instanceof com.plaid.internal.f7.a
                if (r4 == 0) goto L54
                com.plaid.internal.f7$a r1 = (com.plaid.internal.f7.a) r1
                int r1 = r1.f18585b
                r4 = 400(0x190, float:5.6E-43)
                if (r1 != r4) goto L54
                r1 = r3
                goto L55
            L54:
                r1 = 0
            L55:
                if (r1 != 0) goto L9b
                kotlin.jvm.internal.j0 r1 = r9.f18737c
                int r1 = r1.f34912a
                double r4 = (double) r1
                r6 = 4611686018427387904(0x4000000000000000, double:2.0)
                double r4 = java.lang.Math.pow(r6, r4)
                long r4 = (long) r4
                r1 = 1000(0x3e8, float:1.401E-42)
                long r6 = (long) r1
                long r4 = r4 * r6
                k00.c$a r1 = k00.c.f34202a
                r6 = 0
                long r6 = r1.g(r6, r4)
                long r6 = r6 + r4
                r4 = 32000(0x7d00, double:1.581E-319)
                long r4 = java.lang.Math.min(r6, r4)
                r1 = 0
                r9.f18735a = r1
                r9.f18736b = r3
                java.lang.Object r1 = v20.y0.b(r4, r9)
                if (r1 != r0) goto L82
                return r0
            L82:
                kotlin.jvm.internal.l0<com.plaid.internal.f7<T, java.lang.Object>> r1 = r9.f18738d
                h00.l<zz.d<? super com.plaid.internal.f7<? extends T, ? extends java.lang.Object>>, java.lang.Object> r4 = r9.f18739e
                r9.f18735a = r1
                r9.f18736b = r2
                java.lang.Object r4 = r4.invoke(r9)
                if (r4 != r0) goto L91
                return r0
            L91:
                r1.f34916a = r4
                kotlin.jvm.internal.j0 r1 = r9.f18737c
                int r4 = r1.f34912a
                int r4 = r4 + r3
                r1.f34912a = r4
                goto L2a
            L9b:
                vz.b0 r9 = vz.b0.f54756a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.plaid.internal.i3.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0086 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final <T> java.lang.Object a(h00.l<? super zz.d<? super com.plaid.internal.f7<? extends T, ? extends java.lang.Object>>, ? extends java.lang.Object> r9, zz.d<? super com.plaid.internal.f7<? extends T, ? extends java.lang.Object>> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.plaid.internal.i3.a
            if (r0 == 0) goto L13
            r0 = r10
            com.plaid.internal.i3$a r0 = (com.plaid.internal.i3.a) r0
            int r1 = r0.f18734f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f18734f = r1
            goto L18
        L13:
            com.plaid.internal.i3$a r0 = new com.plaid.internal.i3$a
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f18732d
            java.lang.Object r1 = a00.b.d()
            int r2 = r0.f18734f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L4b
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r9 = r0.f18729a
            kotlin.jvm.internal.l0 r9 = (kotlin.jvm.internal.l0) r9
            vz.r.b(r10)
            goto L88
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L38:
            java.lang.Object r9 = r0.f18731c
            kotlin.jvm.internal.l0 r9 = (kotlin.jvm.internal.l0) r9
            java.lang.Object r2 = r0.f18730b
            kotlin.jvm.internal.l0 r2 = (kotlin.jvm.internal.l0) r2
            java.lang.Object r4 = r0.f18729a
            h00.l r4 = (h00.l) r4
            vz.r.b(r10)
            r7 = r2
            r2 = r10
            r10 = r7
            goto L67
        L4b:
            vz.r.b(r10)
            kotlin.jvm.internal.l0 r10 = new kotlin.jvm.internal.l0
            r10.<init>()
            r0.f18729a = r9
            r0.f18730b = r10
            r0.f18731c = r10
            r0.f18734f = r4
            r4 = r9
            com.plaid.internal.i6$g r4 = (com.plaid.internal.i6.g) r4
            java.lang.Object r9 = r4.invoke(r0)
            if (r9 != r1) goto L65
            return r1
        L65:
            r2 = r9
            r9 = r10
        L67:
            r9.f34916a = r2
            kotlin.jvm.internal.j0 r9 = new kotlin.jvm.internal.j0
            r9.<init>()
            v20.j0 r2 = v20.e1.b()
            com.plaid.internal.i3$b r5 = new com.plaid.internal.i3$b
            r6 = 0
            r5.<init>(r9, r10, r4, r6)
            r0.f18729a = r10
            r0.f18730b = r6
            r0.f18731c = r6
            r0.f18734f = r3
            java.lang.Object r9 = v20.i.g(r2, r5, r0)
            if (r9 != r1) goto L87
            return r1
        L87:
            r9 = r10
        L88:
            T r9 = r9.f34916a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.plaid.internal.i3.a(h00.l, zz.d):java.lang.Object");
    }
}