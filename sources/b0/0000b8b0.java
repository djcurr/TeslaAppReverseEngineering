package v20;

import kotlinx.coroutines.TimeoutCancellationException;

/* loaded from: classes5.dex */
public final class e3 {

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.TimeoutKt", f = "Timeout.kt", l = {100}, m = "withTimeoutOrNull")
    /* loaded from: classes5.dex */
    public static final class a<T> extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        long f53915a;

        /* renamed from: b  reason: collision with root package name */
        Object f53916b;

        /* renamed from: c  reason: collision with root package name */
        Object f53917c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f53918d;

        /* renamed from: e  reason: collision with root package name */
        int f53919e;

        a(zz.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f53918d = obj;
            this.f53919e |= Integer.MIN_VALUE;
            return e3.d(0L, null, this);
        }
    }

    public static final TimeoutCancellationException a(long j11, a2 a2Var) {
        return new TimeoutCancellationException("Timed out waiting for " + j11 + " ms", a2Var);
    }

    private static final <U, T extends U> Object b(d3<U, ? super T> d3Var, h00.p<? super o0, ? super zz.d<? super T>, ? extends Object> pVar) {
        d2.k(d3Var, y0.c(d3Var.f35453c.getContext()).l(d3Var.f53908d, d3Var, d3Var.getContext()));
        return z20.b.e(d3Var, d3Var, pVar);
    }

    public static final <T> Object c(long j11, h00.p<? super o0, ? super zz.d<? super T>, ? extends Object> pVar, zz.d<? super T> dVar) {
        Object d11;
        if (j11 > 0) {
            Object b11 = b(new d3(j11, dVar), pVar);
            d11 = a00.d.d();
            if (b11 == d11) {
                kotlin.coroutines.jvm.internal.h.c(dVar);
            }
            return b11;
        }
        throw new TimeoutCancellationException("Timed out immediately");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0074 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0075  */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, v20.d3] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> java.lang.Object d(long r7, h00.p<? super v20.o0, ? super zz.d<? super T>, ? extends java.lang.Object> r9, zz.d<? super T> r10) {
        /*
            boolean r0 = r10 instanceof v20.e3.a
            if (r0 == 0) goto L13
            r0 = r10
            v20.e3$a r0 = (v20.e3.a) r0
            int r1 = r0.f53919e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f53919e = r1
            goto L18
        L13:
            v20.e3$a r0 = new v20.e3$a
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f53918d
            java.lang.Object r1 = a00.b.d()
            int r2 = r0.f53919e
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 != r4) goto L34
            java.lang.Object r7 = r0.f53917c
            kotlin.jvm.internal.l0 r7 = (kotlin.jvm.internal.l0) r7
            java.lang.Object r8 = r0.f53916b
            h00.p r8 = (h00.p) r8
            vz.r.b(r10)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L32
            goto L6b
        L32:
            r8 = move-exception
            goto L6e
        L34:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3c:
            vz.r.b(r10)
            r5 = 0
            int r10 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r10 > 0) goto L46
            return r3
        L46:
            kotlin.jvm.internal.l0 r10 = new kotlin.jvm.internal.l0
            r10.<init>()
            r0.f53916b = r9     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L6c
            r0.f53917c = r10     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L6c
            r0.f53915a = r7     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L6c
            r0.f53919e = r4     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L6c
            v20.d3 r2 = new v20.d3     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L6c
            r2.<init>(r7, r0)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L6c
            r10.f34916a = r2     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L6c
            java.lang.Object r7 = b(r2, r9)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L6c
            java.lang.Object r8 = a00.b.d()     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L6c
            if (r7 != r8) goto L67
            kotlin.coroutines.jvm.internal.h.c(r0)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L6c
        L67:
            if (r7 != r1) goto L6a
            return r1
        L6a:
            r10 = r7
        L6b:
            return r10
        L6c:
            r8 = move-exception
            r7 = r10
        L6e:
            v20.a2 r9 = r8.f35228a
            T r7 = r7.f34916a
            if (r9 != r7) goto L75
            return r3
        L75:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: v20.e3.d(long, h00.p, zz.d):java.lang.Object");
    }
}