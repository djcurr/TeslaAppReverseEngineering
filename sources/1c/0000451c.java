package com.plaid.internal;

import android.content.Context;
import com.plaid.internal.core.crashreporting.internal.models.CrashApiOptions;

/* loaded from: classes2.dex */
public final class q2 {

    /* renamed from: a  reason: collision with root package name */
    public final Context f19285a;

    /* renamed from: b  reason: collision with root package name */
    public final k2 f19286b;

    /* renamed from: c  reason: collision with root package name */
    public final d2<?> f19287c;

    /* renamed from: d  reason: collision with root package name */
    public final CrashApiOptions f19288d;

    /* renamed from: e  reason: collision with root package name */
    public final com.google.gson.e f19289e;

    @kotlin.coroutines.jvm.internal.f(c = "com.plaid.internal.core.crashreporting.internal.CrashWorkManager", f = "CrashWorkManager.kt", l = {30}, m = "storeCrashAndScheduleUpload")
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        public Object f19290a;

        /* renamed from: b  reason: collision with root package name */
        public /* synthetic */ Object f19291b;

        /* renamed from: d  reason: collision with root package name */
        public int f19293d;

        public a(zz.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f19291b = obj;
            this.f19293d |= Integer.MIN_VALUE;
            return q2.this.a(null, this);
        }
    }

    public q2(Context application, k2 crashStorage, d2<?> crashApiClass, CrashApiOptions crashApiOptions) {
        kotlin.jvm.internal.s.g(application, "application");
        kotlin.jvm.internal.s.g(crashStorage, "crashStorage");
        kotlin.jvm.internal.s.g(crashApiClass, "crashApiClass");
        kotlin.jvm.internal.s.g(crashApiOptions, "crashApiOptions");
        this.f19285a = application;
        this.f19286b = crashStorage;
        this.f19287c = crashApiClass;
        this.f19288d = crashApiOptions;
        this.f19289e = new com.google.gson.e();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(com.plaid.internal.core.crashreporting.internal.models.Crash r6, zz.d<? super vz.b0> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.plaid.internal.q2.a
            if (r0 == 0) goto L13
            r0 = r7
            com.plaid.internal.q2$a r0 = (com.plaid.internal.q2.a) r0
            int r1 = r0.f19293d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19293d = r1
            goto L18
        L13:
            com.plaid.internal.q2$a r0 = new com.plaid.internal.q2$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f19291b
            java.lang.Object r1 = a00.b.d()
            int r2 = r0.f19293d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r6 = r0.f19290a
            com.plaid.internal.q2 r6 = (com.plaid.internal.q2) r6
            vz.r.b(r7)
            goto L61
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            vz.r.b(r7)
            com.plaid.internal.k2 r7 = r5.f19286b
            com.plaid.internal.core.crashreporting.internal.models.Crash[] r2 = new com.plaid.internal.core.crashreporting.internal.models.Crash[r3]
            r4 = 0
            r2[r4] = r6
            r0.f19290a = r5
            r0.f19293d = r3
            r7.getClass()
            v20.j0 r6 = v20.e1.b()
            com.plaid.internal.o2 r3 = new com.plaid.internal.o2
            r4 = 0
            r3.<init>(r7, r2, r4)
            java.lang.Object r6 = v20.i.g(r6, r3, r0)
            java.lang.Object r7 = a00.b.d()
            if (r6 != r7) goto L5b
            goto L5d
        L5b:
            vz.b0 r6 = vz.b0.f54756a
        L5d:
            if (r6 != r1) goto L60
            return r1
        L60:
            r6 = r5
        L61:
            r6.getClass()
            androidx.work.e$a r7 = new androidx.work.e$a
            r7.<init>()
            com.plaid.internal.d2<?> r0 = r6.f19287c
            java.lang.String r0 = r0.f18483a
            java.lang.String r1 = "crashesApiClass"
            androidx.work.e$a r7 = r7.g(r1, r0)
            com.google.gson.e r0 = r6.f19289e
            com.plaid.internal.core.crashreporting.internal.models.CrashApiOptions r1 = r6.f19288d
            java.lang.String r0 = r0.r(r1)
            java.lang.String r1 = "crashOptions"
            androidx.work.e$a r7 = r7.g(r1, r0)
            androidx.work.e r7 = r7.a()
            java.lang.String r0 = "Builder()\n      .putStri…iOptions))\n      .build()"
            kotlin.jvm.internal.s.f(r7, r0)
            androidx.work.s$a r0 = new androidx.work.s$a
            java.lang.Class<com.plaid.internal.core.crashreporting.internal.CrashUploadWorker> r1 = com.plaid.internal.core.crashreporting.internal.CrashUploadWorker.class
            r0.<init>(r1)
            androidx.work.c0$a r7 = r0.h(r7)
            androidx.work.s$a r7 = (androidx.work.s.a) r7
            androidx.work.c0 r7 = r7.b()
            java.lang.String r0 = "Builder(CrashUploadWorke…etInputData(data).build()"
            kotlin.jvm.internal.s.f(r7, r0)
            androidx.work.s r7 = (androidx.work.s) r7
            android.content.Context r6 = r6.f19285a
            androidx.work.b0 r6 = androidx.work.b0.i(r6)
            r6.d(r7)
            vz.b0 r6 = vz.b0.f54756a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.plaid.internal.q2.a(com.plaid.internal.core.crashreporting.internal.models.Crash, zz.d):java.lang.Object");
    }
}