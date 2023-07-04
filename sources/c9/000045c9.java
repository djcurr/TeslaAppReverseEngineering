package com.plaid.internal;

import com.plaid.internal.workflow.persistence.database.WorkflowDatabase;

/* loaded from: classes2.dex */
public final class v6 implements w6 {

    /* renamed from: a  reason: collision with root package name */
    public final u0<String, Object> f19618a;

    /* renamed from: b  reason: collision with root package name */
    public final s6 f19619b;

    @kotlin.coroutines.jvm.internal.f(c = "com.plaid.internal.workflow.persistence.LocalPaneStateDatabaseStore", f = "LocalPaneStateDatabaseStore.kt", l = {23}, m = "putString")
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        public Object f19620a;

        /* renamed from: b  reason: collision with root package name */
        public Object f19621b;

        /* renamed from: c  reason: collision with root package name */
        public Object f19622c;

        /* renamed from: d  reason: collision with root package name */
        public /* synthetic */ Object f19623d;

        /* renamed from: f  reason: collision with root package name */
        public int f19625f;

        public a(zz.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f19623d = obj;
            this.f19625f |= Integer.MIN_VALUE;
            return v6.this.a(null, null, null, this);
        }
    }

    public v6(WorkflowDatabase database, u0<String, Object> cache) {
        kotlin.jvm.internal.s.g(database, "database");
        kotlin.jvm.internal.s.g(cache, "cache");
        this.f19618a = cache;
        this.f19619b = database.a();
    }

    @Override // com.plaid.internal.w6
    public Object a(String str, String str2, zz.d<? super String> dVar) {
        Object a11 = this.f19618a.a(str2);
        String str3 = a11 instanceof String ? (String) a11 : null;
        return str3 == null ? this.f19619b.a(str, str2, dVar) : str3;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003f  */
    @Override // com.plaid.internal.w6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(java.lang.String r5, java.lang.String r6, java.lang.String r7, zz.d<? super vz.b0> r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof com.plaid.internal.v6.a
            if (r0 == 0) goto L13
            r0 = r8
            com.plaid.internal.v6$a r0 = (com.plaid.internal.v6.a) r0
            int r1 = r0.f19625f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19625f = r1
            goto L18
        L13:
            com.plaid.internal.v6$a r0 = new com.plaid.internal.v6$a
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f19623d
            java.lang.Object r1 = a00.b.d()
            int r2 = r0.f19625f
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r5 = r0.f19622c
            r7 = r5
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r5 = r0.f19621b
            r6 = r5
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r5 = r0.f19620a
            com.plaid.internal.v6 r5 = (com.plaid.internal.v6) r5
            vz.r.b(r8)
            goto L54
        L37:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3f:
            vz.r.b(r8)
            com.plaid.internal.s6 r8 = r4.f19619b
            r0.f19620a = r4
            r0.f19621b = r6
            r0.f19622c = r7
            r0.f19625f = r3
            java.lang.Object r5 = r8.a(r5, r6, r7, r0)
            if (r5 != r1) goto L53
            return r1
        L53:
            r5 = r4
        L54:
            com.plaid.internal.u0<java.lang.String, java.lang.Object> r5 = r5.f19618a
            r5.a(r6, r7)
            vz.b0 r5 = vz.b0.f54756a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.plaid.internal.v6.a(java.lang.String, java.lang.String, java.lang.String, zz.d):java.lang.Object");
    }

    @Override // com.plaid.internal.w6
    public Object a(String str, zz.d<? super vz.b0> dVar) {
        Object d11;
        this.f19618a.clear();
        Object a11 = this.f19619b.a(str, dVar);
        d11 = a00.d.d();
        return a11 == d11 ? a11 : vz.b0.f54756a;
    }
}