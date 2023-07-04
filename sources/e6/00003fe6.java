package com.plaid.internal;

/* loaded from: classes2.dex */
public final class b4 implements kotlinx.coroutines.flow.e<Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.e f18214a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ c4 f18215b;

    /* loaded from: classes2.dex */
    public static final class a<T> implements kotlinx.coroutines.flow.f {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.flow.f f18216a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ c4 f18217b;

        @kotlin.coroutines.jvm.internal.f(c = "com.plaid.androidutils.rx.IndexedValueFlow$sharedFlow$$inlined$map$1$2", f = "IndexedValueFlow.kt", l = {224}, m = "emit")
        /* renamed from: com.plaid.internal.b4$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0329a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: a  reason: collision with root package name */
            public /* synthetic */ Object f18218a;

            /* renamed from: b  reason: collision with root package name */
            public int f18219b;

            public C0329a(zz.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f18218a = obj;
                this.f18219b |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        public a(kotlinx.coroutines.flow.f fVar, c4 c4Var) {
            this.f18216a = fVar;
            this.f18217b = c4Var;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
        @Override // kotlinx.coroutines.flow.f
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object emit(java.lang.Object r5, zz.d r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof com.plaid.internal.b4.a.C0329a
                if (r0 == 0) goto L13
                r0 = r6
                com.plaid.internal.b4$a$a r0 = (com.plaid.internal.b4.a.C0329a) r0
                int r1 = r0.f18219b
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f18219b = r1
                goto L18
            L13:
                com.plaid.internal.b4$a$a r0 = new com.plaid.internal.b4$a$a
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.f18218a
                java.lang.Object r1 = a00.b.d()
                int r2 = r0.f18219b
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                vz.r.b(r6)
                goto L50
            L29:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L31:
                vz.r.b(r6)
                kotlinx.coroutines.flow.f r6 = r4.f18216a
                java.lang.Number r5 = (java.lang.Number) r5
                int r5 = r5.intValue()
                com.plaid.internal.c4 r2 = r4.f18217b
                java.util.List<? extends T> r2 = r2.f18245c
                kotlin.jvm.internal.s.e(r2)
                java.lang.Object r5 = r2.get(r5)
                r0.f18219b = r3
                java.lang.Object r5 = r6.emit(r5, r0)
                if (r5 != r1) goto L50
                return r1
            L50:
                vz.b0 r5 = vz.b0.f54756a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.plaid.internal.b4.a.emit(java.lang.Object, zz.d):java.lang.Object");
        }
    }

    public b4(kotlinx.coroutines.flow.e eVar, c4 c4Var) {
        this.f18214a = eVar;
        this.f18215b = c4Var;
    }

    @Override // kotlinx.coroutines.flow.e
    public Object collect(kotlinx.coroutines.flow.f<? super Object> fVar, zz.d dVar) {
        Object d11;
        Object collect = this.f18214a.collect(new a(fVar, this.f18215b), dVar);
        d11 = a00.d.d();
        return collect == d11 ? collect : vz.b0.f54756a;
    }
}