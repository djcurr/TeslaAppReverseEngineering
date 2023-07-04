package com.plaid.internal;

import com.plaid.internal.core.crashreporting.internal.models.Crash;
import java.util.List;

@kotlin.coroutines.jvm.internal.f(c = "com.plaid.internal.core.crashreporting.internal.CrashStorage$getCrashes$2", f = "CrashStorage.kt", l = {36, 38}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class m2 extends kotlin.coroutines.jvm.internal.l implements h00.p<v20.o0, zz.d<? super List<? extends Crash>>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public Object f19004a;

    /* renamed from: b  reason: collision with root package name */
    public Object f19005b;

    /* renamed from: c  reason: collision with root package name */
    public Object f19006c;

    /* renamed from: d  reason: collision with root package name */
    public int f19007d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ k2 f19008e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2(k2 k2Var, zz.d<? super m2> dVar) {
        super(2, dVar);
        this.f19008e = k2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
        return new m2(this.f19008e, dVar);
    }

    @Override // h00.p
    public Object invoke(v20.o0 o0Var, zz.d<? super List<? extends Crash>> dVar) {
        return new m2(this.f19008e, dVar).invokeSuspend(vz.b0.f54756a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:5|(3:6|7|8)|9|10|11|12|(4:14|15|16|(1:18)(6:20|9|10|11|12|(2:25|26)(0)))(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007e, code lost:
        r10 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a2  */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0074 -> B:39:0x007b). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0088 -> B:32:0x0099). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = a00.b.d()
            int r1 = r9.f19007d
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L37
            if (r1 == r3) goto L33
            if (r1 != r2) goto L2b
            java.lang.Object r1 = r9.f19006c
            java.util.Iterator r1 = (java.util.Iterator) r1
            java.lang.Object r4 = r9.f19005b
            java.util.Collection r4 = (java.util.Collection) r4
            java.lang.Object r5 = r9.f19004a
            com.plaid.internal.k2 r5 = (com.plaid.internal.k2) r5
            vz.r.b(r10)     // Catch: java.lang.Throwable -> L23
            r6 = r5
            r5 = r4
            r4 = r1
            r1 = r0
            r0 = r9
            goto L7b
        L23:
            r10 = move-exception
            r6 = r5
            r5 = r4
            r4 = r1
            r1 = r0
            r0 = r9
            goto L88
        L2b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L33:
            vz.r.b(r10)
            goto L47
        L37:
            vz.r.b(r10)
            com.plaid.internal.k2 r10 = r9.f19008e
            r9.f19007d = r3
            com.plaid.internal.ra r10 = r10.f18918a
            java.lang.Object r10 = r10.a(r9)
            if (r10 != r0) goto L47
            return r0
        L47:
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            com.plaid.internal.k2 r1 = r9.f19008e
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r10 = r10.iterator()
            r5 = r1
            r1 = r10
            r10 = r9
        L57:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto La2
            java.lang.Object r6 = r1.next()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.reflect.Type r7 = r5.f18921d     // Catch: java.lang.Throwable -> L80
            r10.f19004a = r5     // Catch: java.lang.Throwable -> L80
            r10.f19005b = r4     // Catch: java.lang.Throwable -> L80
            r10.f19006c = r1     // Catch: java.lang.Throwable -> L80
            r10.f19007d = r2     // Catch: java.lang.Throwable -> L80
            java.lang.Object r6 = com.plaid.internal.k2.a(r5, r6, r7, r10)     // Catch: java.lang.Throwable -> L80
            if (r6 != r0) goto L74
            return r0
        L74:
            r8 = r0
            r0 = r10
            r10 = r6
            r6 = r5
            r5 = r4
            r4 = r1
            r1 = r8
        L7b:
            java.util.List r10 = (java.util.List) r10     // Catch: java.lang.Throwable -> L7e
            goto L99
        L7e:
            r10 = move-exception
            goto L88
        L80:
            r6 = move-exception
            r8 = r0
            r0 = r10
            r10 = r6
            r6 = r5
            r5 = r4
            r4 = r1
            r1 = r8
        L88:
            com.plaid.internal.wa$a r7 = com.plaid.internal.wa.f19678a
            com.plaid.internal.b7 r7 = com.plaid.internal.wa.f19679b
            r7.a(r10, r3)
            com.plaid.internal.j2 r7 = r6.f18919b
            com.plaid.internal.core.crashreporting.internal.models.Crash r10 = r7.a(r10)
            java.util.List r10 = wz.u.d(r10)
        L99:
            wz.u.z(r5, r10)
            r10 = r0
            r0 = r1
            r1 = r4
            r4 = r5
            r5 = r6
            goto L57
        La2:
            java.util.List r4 = (java.util.List) r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.plaid.internal.m2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}