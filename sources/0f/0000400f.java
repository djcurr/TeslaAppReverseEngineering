package com.plaid.internal.core.crashreporting.internal;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import com.google.gson.e;
import com.plaid.internal.c2;
import com.plaid.internal.core.crashreporting.internal.models.CrashApiOptions;
import com.plaid.internal.ja;
import com.plaid.internal.k2;
import h00.p;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.s;
import v20.o0;
import vz.b0;

/* loaded from: classes2.dex */
public final class CrashUploadWorker extends CoroutineWorker {

    /* renamed from: a  reason: collision with root package name */
    public final ja f18265a;

    /* renamed from: b  reason: collision with root package name */
    public final e f18266b;

    @f(c = "com.plaid.internal.core.crashreporting.internal.CrashUploadWorker", f = "CrashUploadWorker.kt", l = {35}, m = "doWork")
    /* loaded from: classes2.dex */
    public static final class a extends d {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ Object f18267a;

        /* renamed from: c  reason: collision with root package name */
        public int f18269c;

        public a(zz.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f18267a = obj;
            this.f18269c |= Integer.MIN_VALUE;
            return CrashUploadWorker.this.doWork(this);
        }
    }

    @f(c = "com.plaid.internal.core.crashreporting.internal.CrashUploadWorker$doWork$2", f = "CrashUploadWorker.kt", l = {36, 39, 40}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends l implements p<o0, zz.d<? super ListenableWorker.a>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public Object f18270a;

        /* renamed from: b  reason: collision with root package name */
        public int f18271b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ k2 f18272c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ c2 f18273d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(k2 k2Var, c2 c2Var, zz.d<? super b> dVar) {
            super(2, dVar);
            this.f18272c = k2Var;
            this.f18273d = c2Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<b0> create(Object obj, zz.d<?> dVar) {
            return new b(this.f18272c, this.f18273d, dVar);
        }

        @Override // h00.p
        /* renamed from: invoke */
        public Object mo160invoke(o0 o0Var, zz.d<? super ListenableWorker.a> dVar) {
            return new b(this.f18272c, this.f18273d, dVar).invokeSuspend(b0.f54756a);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x0075 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = a00.b.d()
                int r1 = r6.f18271b
                r2 = 3
                r3 = 2
                r4 = 1
                r5 = 0
                if (r1 == 0) goto L2a
                if (r1 == r4) goto L26
                if (r1 == r3) goto L1e
                if (r1 != r2) goto L16
                vz.r.b(r7)
                goto L76
            L16:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1e:
                java.lang.Object r1 = r6.f18270a
                java.util.List r1 = (java.util.List) r1
                vz.r.b(r7)
                goto L69
            L26:
                vz.r.b(r7)
                goto L44
            L2a:
                vz.r.b(r7)
                com.plaid.internal.k2 r7 = r6.f18272c
                r6.f18271b = r4
                r7.getClass()
                v20.j0 r1 = v20.e1.b()
                com.plaid.internal.m2 r4 = new com.plaid.internal.m2
                r4.<init>(r7, r5)
                java.lang.Object r7 = v20.i.g(r1, r4, r6)
                if (r7 != r0) goto L44
                return r0
            L44:
                r1 = r7
                java.util.List r1 = (java.util.List) r1
                com.plaid.internal.k2 r7 = r6.f18272c
                r6.f18270a = r1
                r6.f18271b = r3
                r7.getClass()
                v20.j0 r3 = v20.e1.b()
                com.plaid.internal.l2 r4 = new com.plaid.internal.l2
                r4.<init>(r7, r5)
                java.lang.Object r7 = v20.i.g(r3, r4, r6)
                java.lang.Object r3 = a00.b.d()
                if (r7 != r3) goto L64
                goto L66
            L64:
                vz.b0 r7 = vz.b0.f54756a
            L66:
                if (r7 != r0) goto L69
                return r0
            L69:
                com.plaid.internal.c2 r7 = r6.f18273d
                r6.f18270a = r5
                r6.f18271b = r2
                java.lang.Object r7 = r7.a(r1, r6)
                if (r7 != r0) goto L76
                return r0
            L76:
                androidx.work.ListenableWorker$a r7 = androidx.work.ListenableWorker.a.c()
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.plaid.internal.core.crashreporting.internal.CrashUploadWorker.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CrashUploadWorker(Context appContext, WorkerParameters workerParams) {
        super(appContext, workerParams);
        ja a11;
        s.g(appContext, "appContext");
        s.g(workerParams, "workerParams");
        a11 = ja.f18891e.a(false, null);
        this.f18265a = a11;
        this.f18266b = new e();
    }

    public final CrashApiOptions a(androidx.work.e eVar) {
        CrashApiOptions crashApiOptions = (CrashApiOptions) this.f18266b.h(eVar.k("crashOptions"), CrashApiOptions.class);
        if (crashApiOptions != null) {
            return crashApiOptions;
        }
        throw new IllegalArgumentException("No crash options provided");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object doWork(zz.d<? super androidx.work.ListenableWorker.a> r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof com.plaid.internal.core.crashreporting.internal.CrashUploadWorker.a
            if (r0 == 0) goto L13
            r0 = r10
            com.plaid.internal.core.crashreporting.internal.CrashUploadWorker$a r0 = (com.plaid.internal.core.crashreporting.internal.CrashUploadWorker.a) r0
            int r1 = r0.f18269c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f18269c = r1
            goto L18
        L13:
            com.plaid.internal.core.crashreporting.internal.CrashUploadWorker$a r0 = new com.plaid.internal.core.crashreporting.internal.CrashUploadWorker$a
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f18267a
            java.lang.Object r1 = a00.b.d()
            int r2 = r0.f18269c
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            vz.r.b(r10)
            goto Lbd
        L2a:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L32:
            vz.r.b(r10)
            androidx.work.e r10 = r9.getInputData()
            java.lang.String r2 = "inputData"
            kotlin.jvm.internal.s.f(r10, r2)
            com.plaid.internal.ja r4 = r9.f18265a
            java.lang.String r5 = "plaidRetrofitFactory"
            kotlin.jvm.internal.s.g(r4, r5)
            java.lang.String r5 = "crashesApiClass"
            java.lang.String r5 = r10.k(r5)
            java.lang.Class<com.plaid.internal.wb> r6 = com.plaid.internal.wb.class
            java.lang.String r6 = r6.getSimpleName()
            boolean r6 = kotlin.jvm.internal.s.c(r5, r6)
            if (r6 == 0) goto Lc3
            com.plaid.internal.wb r5 = new com.plaid.internal.wb
            r5.<init>(r4)
            com.plaid.internal.core.crashreporting.internal.models.CrashApiOptions r10 = r9.a(r10)
            java.lang.String r4 = "crashApiOptions"
            kotlin.jvm.internal.s.g(r10, r4)
            r5.f19682c = r10
            android.content.Context r10 = r9.getApplicationContext()
            java.lang.String r4 = "applicationContext"
            kotlin.jvm.internal.s.f(r10, r4)
            com.plaid.internal.j2 r6 = new com.plaid.internal.j2
            android.content.Context r7 = r9.getApplicationContext()
            kotlin.jvm.internal.s.f(r7, r4)
            androidx.work.e r4 = r9.getInputData()
            kotlin.jvm.internal.s.f(r4, r2)
            com.plaid.internal.core.crashreporting.internal.models.CrashApiOptions r2 = r9.a(r4)
            com.plaid.internal.p2 r4 = com.plaid.internal.p2.f19205a
            com.plaid.internal.d8 r8 = com.plaid.internal.d8.f18493a
            r6.<init>(r7, r2, r4, r8)
            java.lang.String r2 = "application"
            kotlin.jvm.internal.s.g(r10, r2)
            java.lang.String r2 = "crashReportFactory"
            kotlin.jvm.internal.s.g(r6, r2)
            com.plaid.internal.e9 r2 = new com.plaid.internal.e9
            java.io.File r10 = r10.getFilesDir()
            java.lang.String r4 = "application.filesDir"
            kotlin.jvm.internal.s.f(r10, r4)
            java.lang.String r4 = "plaid-sdk/crashes"
            r2.<init>(r10, r4)
            com.plaid.internal.k2 r10 = new com.plaid.internal.k2
            r10.<init>(r2, r6)
            v20.j0 r2 = v20.e1.b()
            com.plaid.internal.core.crashreporting.internal.CrashUploadWorker$b r4 = new com.plaid.internal.core.crashreporting.internal.CrashUploadWorker$b
            r6 = 0
            r4.<init>(r10, r5, r6)
            r0.f18269c = r3
            java.lang.Object r10 = v20.i.g(r2, r4, r0)
            if (r10 != r1) goto Lbd
            return r1
        Lbd:
            java.lang.String r0 = "val crashApi = createCra…xt Result.success()\n    }"
            kotlin.jvm.internal.s.f(r10, r0)
            return r10
        Lc3:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Unknown crash api class: "
            java.lang.String r0 = kotlin.jvm.internal.s.p(r0, r5)
            r10.<init>(r0)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.plaid.internal.core.crashreporting.internal.CrashUploadWorker.doWork(zz.d):java.lang.Object");
    }
}