package kotlinx.coroutines.flow;

/* loaded from: classes5.dex */
public final class l0<T> implements f<T> {

    /* renamed from: a  reason: collision with root package name */
    private final f<T> f35291a;

    /* renamed from: b  reason: collision with root package name */
    private final h00.p<f<? super T>, zz.d<? super vz.b0>, Object> f35292b;

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.SubscribedFlowCollector", f = "Share.kt", l = {419, 423}, m = "onSubscription")
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        Object f35293a;

        /* renamed from: b  reason: collision with root package name */
        Object f35294b;

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ Object f35295c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ l0<T> f35296d;

        /* renamed from: e  reason: collision with root package name */
        int f35297e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(l0<T> l0Var, zz.d<? super a> dVar) {
            super(dVar);
            this.f35296d = l0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f35295c = obj;
            this.f35297e |= Integer.MIN_VALUE;
            return this.f35296d.a(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007a  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [y20.r] */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(zz.d<? super vz.b0> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof kotlinx.coroutines.flow.l0.a
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.flow.l0$a r0 = (kotlinx.coroutines.flow.l0.a) r0
            int r1 = r0.f35297e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f35297e = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.l0$a r0 = new kotlinx.coroutines.flow.l0$a
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f35295c
            java.lang.Object r1 = a00.b.d()
            int r2 = r0.f35297e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            vz.r.b(r7)
            goto L77
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L34:
            java.lang.Object r2 = r0.f35294b
            y20.r r2 = (y20.r) r2
            java.lang.Object r4 = r0.f35293a
            kotlinx.coroutines.flow.l0 r4 = (kotlinx.coroutines.flow.l0) r4
            vz.r.b(r7)     // Catch: java.lang.Throwable -> L7d
            goto L5e
        L40:
            vz.r.b(r7)
            y20.r r2 = new y20.r
            kotlinx.coroutines.flow.f<T> r7 = r6.f35291a
            zz.g r5 = r0.getContext()
            r2.<init>(r7, r5)
            h00.p<kotlinx.coroutines.flow.f<? super T>, zz.d<? super vz.b0>, java.lang.Object> r7 = r6.f35292b     // Catch: java.lang.Throwable -> L7d
            r0.f35293a = r6     // Catch: java.lang.Throwable -> L7d
            r0.f35294b = r2     // Catch: java.lang.Throwable -> L7d
            r0.f35297e = r4     // Catch: java.lang.Throwable -> L7d
            java.lang.Object r7 = r7.invoke(r2, r0)     // Catch: java.lang.Throwable -> L7d
            if (r7 != r1) goto L5d
            return r1
        L5d:
            r4 = r6
        L5e:
            r2.releaseIntercepted()
            kotlinx.coroutines.flow.f<T> r7 = r4.f35291a
            boolean r2 = r7 instanceof kotlinx.coroutines.flow.l0
            if (r2 == 0) goto L7a
            kotlinx.coroutines.flow.l0 r7 = (kotlinx.coroutines.flow.l0) r7
            r2 = 0
            r0.f35293a = r2
            r0.f35294b = r2
            r0.f35297e = r3
            java.lang.Object r7 = r7.a(r0)
            if (r7 != r1) goto L77
            return r1
        L77:
            vz.b0 r7 = vz.b0.f54756a
            return r7
        L7a:
            vz.b0 r7 = vz.b0.f54756a
            return r7
        L7d:
            r7 = move-exception
            r2.releaseIntercepted()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.l0.a(zz.d):java.lang.Object");
    }

    @Override // kotlinx.coroutines.flow.f
    public Object emit(T t11, zz.d<? super vz.b0> dVar) {
        return this.f35291a.emit(t11, dVar);
    }
}