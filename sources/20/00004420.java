package com.plaid.internal;

/* loaded from: classes2.dex */
public final class i5 extends androidx.lifecycle.p0 {

    /* renamed from: a  reason: collision with root package name */
    public final k4 f18746a;

    /* renamed from: b  reason: collision with root package name */
    public w5 f18747b;

    /* renamed from: c  reason: collision with root package name */
    public p5 f18748c;

    /* renamed from: d  reason: collision with root package name */
    public j6 f18749d;

    /* renamed from: e  reason: collision with root package name */
    public t8 f18750e;

    @kotlin.coroutines.jvm.internal.f(c = "com.plaid.internal.link.LinkActivityViewModel", f = "LinkActivityViewModel.kt", l = {73}, m = "onBackPressed")
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ Object f18751a;

        /* renamed from: c  reason: collision with root package name */
        public int f18753c;

        public a(zz.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f18751a = obj;
            this.f18753c |= Integer.MIN_VALUE;
            return i5.this.a(this);
        }
    }

    public i5(g5 linkActivityParentComponent) {
        kotlin.jvm.internal.s.g(linkActivityParentComponent, "linkActivityParentComponent");
        k4 a11 = x2.q().a(linkActivityParentComponent).a(new m4()).a();
        ((x2) a11).a(this);
        kotlin.jvm.internal.s.f(a11, "builder()\n    .linkActiv…kActivityViewModel)\n    }");
        this.f18746a = a11;
    }

    public final p5 a() {
        p5 p5Var = this.f18748c;
        if (p5Var != null) {
            return p5Var;
        }
        kotlin.jvm.internal.s.x("controller");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(zz.d<? super java.lang.Boolean> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.plaid.internal.i5.a
            if (r0 == 0) goto L13
            r0 = r5
            com.plaid.internal.i5$a r0 = (com.plaid.internal.i5.a) r0
            int r1 = r0.f18753c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f18753c = r1
            goto L18
        L13:
            com.plaid.internal.i5$a r0 = new com.plaid.internal.i5$a
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f18751a
            java.lang.Object r1 = a00.b.d()
            int r2 = r0.f18753c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            vz.r.b(r5)
            goto L41
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            vz.r.b(r5)
            com.plaid.internal.p5 r5 = r4.a()
            r0.f18753c = r3
            java.lang.Object r5 = r5.a(r0)
            if (r5 != r1) goto L41
            return r1
        L41:
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.b.a(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.plaid.internal.i5.a(zz.d):java.lang.Object");
    }
}