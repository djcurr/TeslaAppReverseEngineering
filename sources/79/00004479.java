package com.plaid.internal;

@kotlin.coroutines.jvm.internal.f(c = "com.plaid.internal.core.crashreporting.internal.CrashStorage$clear$2", f = "CrashStorage.kt", l = {47, 47}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class l2 extends kotlin.coroutines.jvm.internal.l implements h00.p<v20.o0, zz.d<? super vz.b0>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public Object f18953a;

    /* renamed from: b  reason: collision with root package name */
    public Object f18954b;

    /* renamed from: c  reason: collision with root package name */
    public int f18955c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ k2 f18956d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(k2 k2Var, zz.d<? super l2> dVar) {
        super(2, dVar);
        this.f18956d = k2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
        return new l2(this.f18956d, dVar);
    }

    @Override // h00.p
    public Object invoke(v20.o0 o0Var, zz.d<? super vz.b0> dVar) {
        return new l2(this.f18956d, dVar).invokeSuspend(vz.b0.f54756a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0044  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r0 = a00.b.d()
            int r1 = r5.f18955c
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L26
            if (r1 == r3) goto L22
            if (r1 != r2) goto L1a
            java.lang.Object r1 = r5.f18954b
            java.util.Iterator r1 = (java.util.Iterator) r1
            java.lang.Object r3 = r5.f18953a
            com.plaid.internal.k2 r3 = (com.plaid.internal.k2) r3
            vz.r.b(r6)
            goto L3e
        L1a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L22:
            vz.r.b(r6)
            goto L36
        L26:
            vz.r.b(r6)
            com.plaid.internal.k2 r6 = r5.f18956d
            r5.f18955c = r3
            com.plaid.internal.ra r6 = r6.f18918a
            java.lang.Object r6 = r6.a(r5)
            if (r6 != r0) goto L36
            return r0
        L36:
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            com.plaid.internal.k2 r3 = r5.f18956d
            java.util.Iterator r1 = r6.iterator()
        L3e:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L59
            java.lang.Object r6 = r1.next()
            java.lang.String r6 = (java.lang.String) r6
            com.plaid.internal.ra r4 = r3.f18918a
            r5.f18953a = r3
            r5.f18954b = r1
            r5.f18955c = r2
            java.lang.Object r6 = r4.b(r6, r5)
            if (r6 != r0) goto L3e
            return r0
        L59:
            vz.b0 r6 = vz.b0.f54756a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.plaid.internal.l2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}