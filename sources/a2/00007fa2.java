package kotlinx.coroutines.flow;

import v20.o0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final /* synthetic */ class i {

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ChannelsKt", f = "Channels.kt", l = {51, 62}, m = "emitAllImpl$FlowKt__ChannelsKt")
    /* loaded from: classes5.dex */
    public static final class a<T> extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        Object f35267a;

        /* renamed from: b  reason: collision with root package name */
        Object f35268b;

        /* renamed from: c  reason: collision with root package name */
        boolean f35269c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f35270d;

        /* renamed from: e  reason: collision with root package name */
        int f35271e;

        a(zz.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f35270d = obj;
            this.f35271e |= Integer.MIN_VALUE;
            return i.c(null, null, false, this);
        }
    }

    public static final <T> Object b(f<? super T> fVar, x20.t<? extends T> tVar, zz.d<? super vz.b0> dVar) {
        Object d11;
        Object c11 = c(fVar, tVar, true, dVar);
        d11 = a00.d.d();
        return c11 == d11 ? c11 : vz.b0.f54756a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0076 A[Catch: all -> 0x0055, TRY_LEAVE, TryCatch #0 {all -> 0x0055, blocks: (B:13:0x0032, B:28:0x0070, B:30:0x0076, B:36:0x0084, B:37:0x0085, B:18:0x004b), top: B:47:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0085 A[Catch: all -> 0x0055, TRY_LEAVE, TryCatch #0 {all -> 0x0055, blocks: (B:13:0x0032, B:28:0x0070, B:30:0x0076, B:36:0x0084, B:37:0x0085, B:18:0x004b), top: B:47:0x0022 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0095 -> B:14:0x0035). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> java.lang.Object c(kotlinx.coroutines.flow.f<? super T> r7, x20.t<? extends T> r8, boolean r9, zz.d<? super vz.b0> r10) {
        /*
            boolean r0 = r10 instanceof kotlinx.coroutines.flow.i.a
            if (r0 == 0) goto L13
            r0 = r10
            kotlinx.coroutines.flow.i$a r0 = (kotlinx.coroutines.flow.i.a) r0
            int r1 = r0.f35271e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f35271e = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.i$a r0 = new kotlinx.coroutines.flow.i$a
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f35270d
            java.lang.Object r1 = a00.b.d()
            int r2 = r0.f35271e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L57
            if (r2 == r4) goto L41
            if (r2 != r3) goto L39
            boolean r7 = r0.f35269c
            java.lang.Object r8 = r0.f35268b
            x20.t r8 = (x20.t) r8
            java.lang.Object r9 = r0.f35267a
            kotlinx.coroutines.flow.f r9 = (kotlinx.coroutines.flow.f) r9
            vz.r.b(r10)     // Catch: java.lang.Throwable -> L55
        L35:
            r6 = r9
            r9 = r7
            r7 = r6
            goto L5d
        L39:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L41:
            boolean r7 = r0.f35269c
            java.lang.Object r8 = r0.f35268b
            x20.t r8 = (x20.t) r8
            java.lang.Object r9 = r0.f35267a
            kotlinx.coroutines.flow.f r9 = (kotlinx.coroutines.flow.f) r9
            vz.r.b(r10)     // Catch: java.lang.Throwable -> L55
            x20.i r10 = (x20.i) r10     // Catch: java.lang.Throwable -> L55
            java.lang.Object r10 = r10.l()     // Catch: java.lang.Throwable -> L55
            goto L6f
        L55:
            r9 = move-exception
            goto L9c
        L57:
            vz.r.b(r10)
            kotlinx.coroutines.flow.g.o(r7)
        L5d:
            r0.f35267a = r7     // Catch: java.lang.Throwable -> L98
            r0.f35268b = r8     // Catch: java.lang.Throwable -> L98
            r0.f35269c = r9     // Catch: java.lang.Throwable -> L98
            r0.f35271e = r4     // Catch: java.lang.Throwable -> L98
            java.lang.Object r10 = r8.k(r0)     // Catch: java.lang.Throwable -> L98
            if (r10 != r1) goto L6c
            return r1
        L6c:
            r6 = r9
            r9 = r7
            r7 = r6
        L6f:
            r2 = 0
            boolean r5 = x20.i.i(r10)     // Catch: java.lang.Throwable -> L55
            if (r5 == 0) goto L85
            java.lang.Throwable r9 = x20.i.e(r10)     // Catch: java.lang.Throwable -> L55
            if (r9 != 0) goto L84
            if (r7 == 0) goto L81
            x20.j.a(r8, r2)
        L81:
            vz.b0 r7 = vz.b0.f54756a
            return r7
        L84:
            throw r9     // Catch: java.lang.Throwable -> L55
        L85:
            java.lang.Object r10 = x20.i.g(r10)     // Catch: java.lang.Throwable -> L55
            r0.f35267a = r9     // Catch: java.lang.Throwable -> L55
            r0.f35268b = r8     // Catch: java.lang.Throwable -> L55
            r0.f35269c = r7     // Catch: java.lang.Throwable -> L55
            r0.f35271e = r3     // Catch: java.lang.Throwable -> L55
            java.lang.Object r10 = r9.emit(r10, r0)     // Catch: java.lang.Throwable -> L55
            if (r10 != r1) goto L35
            return r1
        L98:
            r7 = move-exception
            r6 = r9
            r9 = r7
            r7 = r6
        L9c:
            throw r9     // Catch: java.lang.Throwable -> L9d
        L9d:
            r10 = move-exception
            if (r7 == 0) goto La3
            x20.j.a(r8, r9)
        La3:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.i.c(kotlinx.coroutines.flow.f, x20.t, boolean, zz.d):java.lang.Object");
    }

    public static final <T> x20.t<T> d(e<? extends T> eVar, o0 o0Var) {
        return y20.e.b(eVar).l(o0Var);
    }
}