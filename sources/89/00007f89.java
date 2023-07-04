package kotlinx.coroutines.flow;

/* loaded from: classes5.dex */
public abstract class a<T> implements e<T> {

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.AbstractFlow", f = "Flow.kt", l = {230}, m = "collect")
    /* renamed from: kotlinx.coroutines.flow.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static final class C0663a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        Object f35230a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f35231b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ a<T> f35232c;

        /* renamed from: d  reason: collision with root package name */
        int f35233d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0663a(a<T> aVar, zz.d<? super C0663a> dVar) {
            super(dVar);
            this.f35232c = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f35231b = obj;
            this.f35233d |= Integer.MIN_VALUE;
            return this.f35232c.collect(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    @Override // kotlinx.coroutines.flow.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object collect(kotlinx.coroutines.flow.f<? super T> r6, zz.d<? super vz.b0> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof kotlinx.coroutines.flow.a.C0663a
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.flow.a$a r0 = (kotlinx.coroutines.flow.a.C0663a) r0
            int r1 = r0.f35233d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f35233d = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.a$a r0 = new kotlinx.coroutines.flow.a$a
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f35231b
            java.lang.Object r1 = a00.b.d()
            int r2 = r0.f35233d
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r6 = r0.f35230a
            y20.r r6 = (y20.r) r6
            vz.r.b(r7)     // Catch: java.lang.Throwable -> L2d
            goto L4f
        L2d:
            r7 = move-exception
            goto L59
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            vz.r.b(r7)
            y20.r r7 = new y20.r
            zz.g r2 = r0.getContext()
            r7.<init>(r6, r2)
            r0.f35230a = r7     // Catch: java.lang.Throwable -> L55
            r0.f35233d = r3     // Catch: java.lang.Throwable -> L55
            java.lang.Object r6 = r5.e(r7, r0)     // Catch: java.lang.Throwable -> L55
            if (r6 != r1) goto L4e
            return r1
        L4e:
            r6 = r7
        L4f:
            r6.releaseIntercepted()
            vz.b0 r6 = vz.b0.f54756a
            return r6
        L55:
            r6 = move-exception
            r4 = r7
            r7 = r6
            r6 = r4
        L59:
            r6.releaseIntercepted()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.a.collect(kotlinx.coroutines.flow.f, zz.d):java.lang.Object");
    }

    public abstract Object e(f<? super T> fVar, zz.d<? super vz.b0> dVar);
}