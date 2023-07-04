package n0;

import java.util.List;

/* loaded from: classes.dex */
public final class q {

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$2", f = "ForEachGesture.kt", l = {66}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.k implements h00.p<d2.c, zz.d<? super vz.b0>, Object> {

        /* renamed from: b  reason: collision with root package name */
        int f40104b;

        /* renamed from: c  reason: collision with root package name */
        private /* synthetic */ Object f40105c;

        a(zz.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
            a aVar = new a(dVar);
            aVar.f40105c = obj;
            return aVar;
        }

        @Override // h00.p
        /* renamed from: e */
        public final Object invoke(d2.c cVar, zz.d<? super vz.b0> dVar) {
            return ((a) create(cVar, dVar)).invokeSuspend(vz.b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d11;
            d11 = a00.d.d();
            int i11 = this.f40104b;
            if (i11 == 0) {
                vz.r.b(obj);
                this.f40104b = 1;
                if (q.b((d2.c) this.f40105c, this) == d11) {
                    return d11;
                }
            } else if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                vz.r.b(obj);
            }
            return vz.b0.f54756a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.ForEachGestureKt", f = "ForEachGesture.kt", l = {75}, m = "awaitAllPointersUp")
    /* loaded from: classes.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        Object f40106a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f40107b;

        /* renamed from: c  reason: collision with root package name */
        int f40108c;

        b(zz.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f40107b = obj;
            this.f40108c |= Integer.MIN_VALUE;
            return q.b(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.ForEachGestureKt", f = "ForEachGesture.kt", l = {41, 44, 48}, m = "forEachGesture")
    /* loaded from: classes.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        Object f40109a;

        /* renamed from: b  reason: collision with root package name */
        Object f40110b;

        /* renamed from: c  reason: collision with root package name */
        Object f40111c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f40112d;

        /* renamed from: e  reason: collision with root package name */
        int f40113e;

        c(zz.d<? super c> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f40112d = obj;
            this.f40113e |= Integer.MIN_VALUE;
            return q.d(null, null, this);
        }
    }

    public static final boolean a(d2.c cVar) {
        kotlin.jvm.internal.s.g(cVar, "<this>");
        List<d2.u> b11 = cVar.R().b();
        int size = b11.size();
        boolean z11 = false;
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                break;
            }
            int i12 = i11 + 1;
            if (b11.get(i11).i()) {
                z11 = true;
                break;
            }
            i11 = i12;
        }
        return !z11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003c, code lost:
        if (a(r7) == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003e, code lost:
        r8 = androidx.compose.ui.input.pointer.a.Final;
        r0.f40106a = r7;
        r0.f40108c = 1;
        r8 = r7.P(r8, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0048, code lost:
        if (r8 != r1) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004a, code lost:
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006b, code lost:
        if (r4 == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006f, code lost:
        return vz.b0.f54756a;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0048 -> B:19:0x004b). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(d2.c r7, zz.d<? super vz.b0> r8) {
        /*
            boolean r0 = r8 instanceof n0.q.b
            if (r0 == 0) goto L13
            r0 = r8
            n0.q$b r0 = (n0.q.b) r0
            int r1 = r0.f40108c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f40108c = r1
            goto L18
        L13:
            n0.q$b r0 = new n0.q$b
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f40107b
            java.lang.Object r1 = a00.b.d()
            int r2 = r0.f40108c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r7 = r0.f40106a
            d2.c r7 = (d2.c) r7
            vz.r.b(r8)
            goto L4b
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            vz.r.b(r8)
            boolean r8 = a(r7)
            if (r8 != 0) goto L6d
        L3e:
            androidx.compose.ui.input.pointer.a r8 = androidx.compose.ui.input.pointer.a.Final
            r0.f40106a = r7
            r0.f40108c = r3
            java.lang.Object r8 = r7.P(r8, r0)
            if (r8 != r1) goto L4b
            return r1
        L4b:
            d2.m r8 = (d2.m) r8
            java.util.List r8 = r8.b()
            int r2 = r8.size()
            r4 = 0
            r5 = r4
        L57:
            if (r5 >= r2) goto L6b
            int r6 = r5 + 1
            java.lang.Object r5 = r8.get(r5)
            d2.u r5 = (d2.u) r5
            boolean r5 = r5.i()
            if (r5 == 0) goto L69
            r4 = r3
            goto L6b
        L69:
            r5 = r6
            goto L57
        L6b:
            if (r4 != 0) goto L3e
        L6d:
            vz.b0 r7 = vz.b0.f54756a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.q.b(d2.c, zz.d):java.lang.Object");
    }

    public static final Object c(d2.c0 c0Var, zz.d<? super vz.b0> dVar) {
        Object d11;
        Object E = c0Var.E(new a(null), dVar);
        d11 = a00.d.d();
        return E == d11 ? E : vz.b0.f54756a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:1|(2:3|(4:5|6|7|(1:(1:(1:(2:12|13)(2:15|16))(6:17|18|19|20|21|(3:25|26|(1:28)(7:29|30|(1:32)|19|20|21|(2:23|24)(0)))(0)))(8:44|45|30|(0)|19|20|21|(0)(0)))(3:46|21|(0)(0))))|49|6|7|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005e, code lost:
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005f, code lost:
        r7 = r9;
        r9 = r8;
        r8 = r10;
        r10 = r7;
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a0, code lost:
        r0.f40109a = r8;
        r0.f40110b = null;
        r0.f40111c = null;
        r0.f40113e = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ad, code lost:
        if (c(r2, r0) == r1) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00af, code lost:
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b1, code lost:
        r8 = r9;
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:?, code lost:
        throw r8;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0094 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0075 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v3, types: [d2.c0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r8v13, types: [zz.g] */
    /* JADX WARN: Type inference failed for: r8v15, types: [zz.g] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [zz.g] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0092 -> B:18:0x004b). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x00b1 -> B:43:0x00b2). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object d(d2.c0 r8, h00.p<? super d2.c0, ? super zz.d<? super vz.b0>, ? extends java.lang.Object> r9, zz.d<? super vz.b0> r10) {
        /*
            boolean r0 = r10 instanceof n0.q.c
            if (r0 == 0) goto L13
            r0 = r10
            n0.q$c r0 = (n0.q.c) r0
            int r1 = r0.f40113e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f40113e = r1
            goto L18
        L13:
            n0.q$c r0 = new n0.q$c
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f40112d
            java.lang.Object r1 = a00.b.d()
            int r2 = r0.f40113e
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L64
            if (r2 == r5) goto L4e
            if (r2 == r4) goto L3c
            if (r2 == r3) goto L33
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L33:
            java.lang.Object r8 = r0.f40109a
            java.util.concurrent.CancellationException r8 = (java.util.concurrent.CancellationException) r8
            vz.r.b(r10)
            goto Lb0
        L3c:
            java.lang.Object r8 = r0.f40111c
            zz.g r8 = (zz.g) r8
            java.lang.Object r9 = r0.f40110b
            h00.p r9 = (h00.p) r9
            java.lang.Object r2 = r0.f40109a
            d2.c0 r2 = (d2.c0) r2
            vz.r.b(r10)     // Catch: java.util.concurrent.CancellationException -> L5e
        L4b:
            r10 = r9
            goto Lb2
        L4e:
            java.lang.Object r8 = r0.f40111c
            zz.g r8 = (zz.g) r8
            java.lang.Object r9 = r0.f40110b
            h00.p r9 = (h00.p) r9
            java.lang.Object r2 = r0.f40109a
            d2.c0 r2 = (d2.c0) r2
            vz.r.b(r10)     // Catch: java.util.concurrent.CancellationException -> L5e
            goto L86
        L5e:
            r10 = move-exception
            r7 = r9
            r9 = r8
            r8 = r10
            r10 = r7
            goto L9a
        L64:
            vz.r.b(r10)
            zz.g r10 = r0.getContext()
            r7 = r9
            r9 = r8
            r8 = r10
            r10 = r7
        L6f:
            boolean r2 = v20.d2.o(r8)
            if (r2 == 0) goto Lb4
            r0.f40109a = r9     // Catch: java.util.concurrent.CancellationException -> L95
            r0.f40110b = r10     // Catch: java.util.concurrent.CancellationException -> L95
            r0.f40111c = r8     // Catch: java.util.concurrent.CancellationException -> L95
            r0.f40113e = r5     // Catch: java.util.concurrent.CancellationException -> L95
            java.lang.Object r2 = r10.invoke(r9, r0)     // Catch: java.util.concurrent.CancellationException -> L95
            if (r2 != r1) goto L84
            return r1
        L84:
            r2 = r9
            r9 = r10
        L86:
            r0.f40109a = r2     // Catch: java.util.concurrent.CancellationException -> L5e
            r0.f40110b = r9     // Catch: java.util.concurrent.CancellationException -> L5e
            r0.f40111c = r8     // Catch: java.util.concurrent.CancellationException -> L5e
            r0.f40113e = r4     // Catch: java.util.concurrent.CancellationException -> L5e
            java.lang.Object r10 = c(r2, r0)     // Catch: java.util.concurrent.CancellationException -> L5e
            if (r10 != r1) goto L4b
            return r1
        L95:
            r2 = move-exception
            r7 = r9
            r9 = r8
            r8 = r2
            r2 = r7
        L9a:
            boolean r6 = v20.d2.o(r9)
            if (r6 == 0) goto Lb1
            r0.f40109a = r8
            r9 = 0
            r0.f40110b = r9
            r0.f40111c = r9
            r0.f40113e = r3
            java.lang.Object r9 = c(r2, r0)
            if (r9 != r1) goto Lb0
            return r1
        Lb0:
            throw r8
        Lb1:
            r8 = r9
        Lb2:
            r9 = r2
            goto L6f
        Lb4:
            vz.b0 r8 = vz.b0.f54756a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.q.d(d2.c0, h00.p, zz.d):java.lang.Object");
    }
}