package com.plaid.internal;

/* loaded from: classes2.dex */
public final class t8 {

    /* renamed from: a  reason: collision with root package name */
    public final ma f19514a;

    /* renamed from: b  reason: collision with root package name */
    public s8 f19515b;

    @kotlin.coroutines.jvm.internal.f(c = "com.plaid.internal.globalvalues.PlaidClientSideOnlyConfigurationStore", f = "PlaidClientSideOnlyConfigurationStore.kt", l = {24, 25}, m = "read")
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        public Object f19516a;

        /* renamed from: b  reason: collision with root package name */
        public Object f19517b;

        /* renamed from: c  reason: collision with root package name */
        public /* synthetic */ Object f19518c;

        /* renamed from: e  reason: collision with root package name */
        public int f19520e;

        public a(zz.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f19518c = obj;
            this.f19520e |= Integer.MIN_VALUE;
            return t8.this.a(this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.plaid.internal.globalvalues.PlaidClientSideOnlyConfigurationStore$readNoLoadingUi$2", f = "PlaidClientSideOnlyConfigurationStore.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.l implements h00.p<v20.o0, zz.d<? super Boolean>, Object> {
        public b(zz.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
            return new b(dVar);
        }

        @Override // h00.p
        public Object invoke(v20.o0 o0Var, zz.d<? super Boolean> dVar) {
            return new b(dVar).invokeSuspend(vz.b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a00.d.d();
            vz.r.b(obj);
            return kotlin.coroutines.jvm.internal.b.a(kotlin.jvm.internal.s.c(t8.this.f19514a.b("plaid_no_loading_ui"), "true"));
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.plaid.internal.globalvalues.PlaidClientSideOnlyConfigurationStore", f = "PlaidClientSideOnlyConfigurationStore.kt", l = {78}, m = "storeStatusBarColor")
    /* loaded from: classes2.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ Object f19522a;

        /* renamed from: c  reason: collision with root package name */
        public int f19524c;

        public c(zz.d<? super c> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f19522a = obj;
            this.f19524c |= Integer.MIN_VALUE;
            return t8.this.a(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.plaid.internal.globalvalues.PlaidClientSideOnlyConfigurationStore$storeStatusBarColor$3$1", f = "PlaidClientSideOnlyConfigurationStore.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.l implements h00.p<v20.o0, zz.d<? super vz.b0>, Object> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ String f19526b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, zz.d<? super d> dVar) {
            super(2, dVar);
            this.f19526b = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
            return new d(this.f19526b, dVar);
        }

        @Override // h00.p
        public Object invoke(v20.o0 o0Var, zz.d<? super vz.b0> dVar) {
            return new d(this.f19526b, dVar).invokeSuspend(vz.b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a00.d.d();
            vz.r.b(obj);
            t8.this.f19514a.a("plaid_status_bar_color", this.f19526b);
            return vz.b0.f54756a;
        }
    }

    public t8(ma storage) {
        kotlin.jvm.internal.s.g(storage, "storage");
        this.f19514a = storage;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(zz.d<? super com.plaid.internal.s8> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.plaid.internal.t8.a
            if (r0 == 0) goto L13
            r0 = r6
            com.plaid.internal.t8$a r0 = (com.plaid.internal.t8.a) r0
            int r1 = r0.f19520e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19520e = r1
            goto L18
        L13:
            com.plaid.internal.t8$a r0 = new com.plaid.internal.t8$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f19518c
            java.lang.Object r1 = a00.b.d()
            int r2 = r0.f19520e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L44
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r1 = r0.f19517b
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.f19516a
            com.plaid.internal.t8 r0 = (com.plaid.internal.t8) r0
            vz.r.b(r6)
            goto L83
        L34:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L3c:
            java.lang.Object r2 = r0.f19516a
            com.plaid.internal.t8 r2 = (com.plaid.internal.t8) r2
            vz.r.b(r6)
            goto L71
        L44:
            vz.r.b(r6)
            com.plaid.internal.s8 r6 = r5.f19515b
            if (r6 == 0) goto L4c
            return r6
        L4c:
            r0.f19516a = r5
            r0.f19520e = r4
            r2 = 0
            if (r6 != 0) goto L55
            r4 = r2
            goto L57
        L55:
            java.lang.String r4 = r6.f19433b
        L57:
            if (r4 == 0) goto L60
            if (r6 != 0) goto L5d
            r6 = r2
            goto L6d
        L5d:
            java.lang.String r6 = r6.f19433b
            goto L6d
        L60:
            v20.j0 r6 = v20.e1.b()
            com.plaid.internal.u8 r4 = new com.plaid.internal.u8
            r4.<init>(r5, r2)
            java.lang.Object r6 = v20.i.g(r6, r4, r0)
        L6d:
            if (r6 != r1) goto L70
            return r1
        L70:
            r2 = r5
        L71:
            java.lang.String r6 = (java.lang.String) r6
            r0.f19516a = r2
            r0.f19517b = r6
            r0.f19520e = r3
            java.lang.Object r0 = r2.b(r0)
            if (r0 != r1) goto L80
            return r1
        L80:
            r1 = r6
            r6 = r0
            r0 = r2
        L83:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            com.plaid.internal.s8 r2 = new com.plaid.internal.s8
            r3 = 0
            r4 = 4
            r2.<init>(r6, r1, r3, r4)
            r0.f19515b = r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.plaid.internal.t8.a(zz.d):java.lang.Object");
    }

    public final Object b(zz.d<? super Boolean> dVar) {
        s8 s8Var = this.f19515b;
        if ((s8Var == null ? null : kotlin.coroutines.jvm.internal.b.a(s8Var.f19432a)) != null) {
            s8 s8Var2 = this.f19515b;
            boolean z11 = true;
            return kotlin.coroutines.jvm.internal.b.a((s8Var2 == null || !s8Var2.f19432a) ? false : false);
        }
        return v20.i.g(v20.e1.b(), new b(null), dVar);
    }

    public final void a(boolean z11) {
        s8 s8Var = this.f19515b;
        if (s8Var != null) {
            this.f19515b = s8.a(s8Var, z11, null, false, 6);
        }
        this.f19514a.a("plaid_no_loading_ui", String.valueOf(z11));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.String r6, zz.d<? super vz.b0> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.plaid.internal.t8.c
            if (r0 == 0) goto L13
            r0 = r7
            com.plaid.internal.t8$c r0 = (com.plaid.internal.t8.c) r0
            int r1 = r0.f19524c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19524c = r1
            goto L18
        L13:
            com.plaid.internal.t8$c r0 = new com.plaid.internal.t8$c
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f19522a
            java.lang.Object r1 = a00.b.d()
            int r2 = r0.f19524c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            vz.r.b(r7)
            goto L57
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            vz.r.b(r7)
            com.plaid.internal.s8 r7 = r5.f19515b
            if (r7 != 0) goto L39
            goto L41
        L39:
            r2 = 5
            r4 = 0
            com.plaid.internal.s8 r7 = com.plaid.internal.s8.a(r7, r4, r6, r4, r2)
            r5.f19515b = r7
        L41:
            if (r6 != 0) goto L44
            goto L57
        L44:
            v20.j0 r7 = v20.e1.b()
            com.plaid.internal.t8$d r2 = new com.plaid.internal.t8$d
            r4 = 0
            r2.<init>(r6, r4)
            r0.f19524c = r3
            java.lang.Object r6 = v20.i.g(r7, r2, r0)
            if (r6 != r1) goto L57
            return r1
        L57:
            vz.b0 r6 = vz.b0.f54756a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.plaid.internal.t8.a(java.lang.String, zz.d):java.lang.Object");
    }
}