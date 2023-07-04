package v20;

/* loaded from: classes5.dex */
public final class e {

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.AwaitKt", f = "Await.kt", l = {66}, m = "joinAll")
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        Object f53909a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f53910b;

        /* renamed from: c  reason: collision with root package name */
        int f53911c;

        a(zz.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f53910b = obj;
            this.f53911c |= Integer.MIN_VALUE;
            return e.a(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(java.util.Collection<? extends v20.a2> r4, zz.d<? super vz.b0> r5) {
        /*
            boolean r0 = r5 instanceof v20.e.a
            if (r0 == 0) goto L13
            r0 = r5
            v20.e$a r0 = (v20.e.a) r0
            int r1 = r0.f53911c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f53911c = r1
            goto L18
        L13:
            v20.e$a r0 = new v20.e$a
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f53910b
            java.lang.Object r1 = a00.b.d()
            int r2 = r0.f53911c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.f53909a
            java.util.Iterator r4 = (java.util.Iterator) r4
            vz.r.b(r5)
            goto L3c
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            vz.r.b(r5)
            java.util.Iterator r4 = r4.iterator()
        L3c:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L53
            java.lang.Object r5 = r4.next()
            v20.a2 r5 = (v20.a2) r5
            r0.f53909a = r4
            r0.f53911c = r3
            java.lang.Object r5 = r5.D(r0)
            if (r5 != r1) goto L3c
            return r1
        L53:
            vz.b0 r4 = vz.b0.f54756a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: v20.e.a(java.util.Collection, zz.d):java.lang.Object");
    }
}