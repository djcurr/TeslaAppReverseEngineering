package com.plaid.internal;

/* loaded from: classes2.dex */
public final class l7 implements be, bb {

    /* renamed from: a  reason: collision with root package name */
    public final w6 f18965a;

    @kotlin.coroutines.jvm.internal.f(c = "com.plaid.internal.workflow.di.OAuthRedirectUriStore", f = "OAuthRedirectUriStore.kt", l = {20, 24}, m = "readOAuthRedirectUri")
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        public Object f18966a;

        /* renamed from: b  reason: collision with root package name */
        public /* synthetic */ Object f18967b;

        /* renamed from: d  reason: collision with root package name */
        public int f18969d;

        public a(zz.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f18967b = obj;
            this.f18969d |= Integer.MIN_VALUE;
            return l7.this.a(this);
        }
    }

    public l7(w6 localPaneStateStore) {
        kotlin.jvm.internal.s.g(localPaneStateStore, "localPaneStateStore");
        this.f18965a = localPaneStateStore;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0064  */
    @Override // com.plaid.internal.bb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(zz.d<? super java.lang.String> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.plaid.internal.l7.a
            if (r0 == 0) goto L13
            r0 = r7
            com.plaid.internal.l7$a r0 = (com.plaid.internal.l7.a) r0
            int r1 = r0.f18969d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f18969d = r1
            goto L18
        L13:
            com.plaid.internal.l7$a r0 = new com.plaid.internal.l7$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f18967b
            java.lang.Object r1 = a00.b.d()
            int r2 = r0.f18969d
            r3 = 2
            java.lang.String r4 = "oauth_pane_state"
            r5 = 1
            if (r2 == 0) goto L42
            if (r2 == r5) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r0 = r0.f18966a
            java.lang.String r0 = (java.lang.String) r0
            vz.r.b(r7)
            goto L65
        L32:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L3a:
            java.lang.Object r2 = r0.f18966a
            com.plaid.internal.l7 r2 = (com.plaid.internal.l7) r2
            vz.r.b(r7)
            goto L55
        L42:
            vz.r.b(r7)
            com.plaid.internal.w6 r7 = r6.f18965a
            r0.f18966a = r6
            r0.f18969d = r5
            java.lang.String r2 = "received_redirect_uri"
            java.lang.Object r7 = r7.a(r4, r2, r0)
            if (r7 != r1) goto L54
            return r1
        L54:
            r2 = r6
        L55:
            java.lang.String r7 = (java.lang.String) r7
            com.plaid.internal.w6 r2 = r2.f18965a
            r0.f18966a = r7
            r0.f18969d = r3
            java.lang.Object r0 = r2.a(r4, r0)
            if (r0 != r1) goto L64
            return r1
        L64:
            r0 = r7
        L65:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.plaid.internal.l7.a(zz.d):java.lang.Object");
    }

    @Override // com.plaid.internal.be
    public Object a(String str, zz.d<? super vz.b0> dVar) {
        Object d11;
        Object a11 = this.f18965a.a("oauth_pane_state", "received_redirect_uri", str, dVar);
        d11 = a00.d.d();
        return a11 == d11 ? a11 : vz.b0.f54756a;
    }
}