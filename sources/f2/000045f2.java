package com.plaid.internal;

import com.plaid.internal.core.crashreporting.internal.models.Crash;
import com.plaid.internal.core.crashreporting.internal.models.CrashApiOptions;
import com.plaid.internal.core.crashreporting.internal.models.CrashContext;
import com.plaid.internal.core.crashreporting.internal.models.CrashContextTypeAdapter;
import java.util.List;

/* loaded from: classes2.dex */
public final class wb implements c2 {

    /* renamed from: a */
    public final ja f19680a;

    /* renamed from: b */
    public final vz.k f19681b;

    /* renamed from: c */
    public CrashApiOptions f19682c;

    @kotlin.coroutines.jvm.internal.f(c = "com.plaid.internal.core.crashreporting.internal.implementation.api.SentryCrashApi", f = "SentryCrashApi.kt", l = {41}, m = "sendCrash")
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a */
        public /* synthetic */ Object f19683a;

        /* renamed from: c */
        public int f19685c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(zz.d<? super a> dVar) {
            super(dVar);
            wb.this = r1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f19683a = obj;
            this.f19685c |= Integer.MIN_VALUE;
            return wb.this.a((Crash) null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.plaid.internal.core.crashreporting.internal.implementation.api.SentryCrashApi", f = "SentryCrashApi.kt", l = {55}, m = "sendCrashes")
    /* loaded from: classes2.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a */
        public Object f19686a;

        /* renamed from: b */
        public /* synthetic */ Object f19687b;

        /* renamed from: d */
        public int f19689d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(zz.d<? super b> dVar) {
            super(dVar);
            wb.this = r1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f19687b = obj;
            this.f19689d |= Integer.MIN_VALUE;
            return wb.this.a((List<Crash>) null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.plaid.internal.core.crashreporting.internal.implementation.api.SentryCrashApi$sendCrashes$2", f = "SentryCrashApi.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.l implements h00.p<v20.o0, zz.d<? super vz.b0>, Object> {

        /* renamed from: a */
        public /* synthetic */ Object f19690a;

        /* renamed from: b */
        public final /* synthetic */ List<Crash> f19691b;

        /* renamed from: c */
        public final /* synthetic */ List<f7<Object, Object>> f19692c;

        /* renamed from: d */
        public final /* synthetic */ wb f19693d;

        @kotlin.coroutines.jvm.internal.f(c = "com.plaid.internal.core.crashreporting.internal.implementation.api.SentryCrashApi$sendCrashes$2$1$1", f = "SentryCrashApi.kt", l = {58}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements h00.p<v20.o0, zz.d<? super vz.b0>, Object> {

            /* renamed from: a */
            public Object f19694a;

            /* renamed from: b */
            public int f19695b;

            /* renamed from: c */
            public final /* synthetic */ List<f7<Object, Object>> f19696c;

            /* renamed from: d */
            public final /* synthetic */ wb f19697d;

            /* renamed from: e */
            public final /* synthetic */ Crash f19698e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(List<f7<Object, Object>> list, wb wbVar, Crash crash, zz.d<? super a> dVar) {
                super(2, dVar);
                this.f19696c = list;
                this.f19697d = wbVar;
                this.f19698e = crash;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
                return new a(this.f19696c, this.f19697d, this.f19698e, dVar);
            }

            @Override // h00.p
            public Object invoke(v20.o0 o0Var, zz.d<? super vz.b0> dVar) {
                return new a(this.f19696c, this.f19697d, this.f19698e, dVar).invokeSuspend(vz.b0.f54756a);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List] */
            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object d11;
                List<f7<Object, Object>> list;
                d11 = a00.d.d();
                int i11 = this.f19695b;
                if (i11 == 0) {
                    vz.r.b(obj);
                    List<f7<Object, Object>> list2 = this.f19696c;
                    Object value = this.f19697d.f19681b.getValue();
                    kotlin.jvm.internal.s.f(value, "<get-sentryRetrofitApi>(...)");
                    xb xbVar = (xb) value;
                    CrashApiOptions crashApiOptions = this.f19697d.f19682c;
                    CrashApiOptions crashApiOptions2 = null;
                    if (crashApiOptions == null) {
                        kotlin.jvm.internal.s.x("crashApiOptions");
                        crashApiOptions = null;
                    }
                    String p11 = kotlin.jvm.internal.s.p("Sentry sentry_version=6,sentry_key=", crashApiOptions.getApiKey());
                    CrashApiOptions crashApiOptions3 = this.f19697d.f19682c;
                    if (crashApiOptions3 == null) {
                        kotlin.jvm.internal.s.x("crashApiOptions");
                    } else {
                        crashApiOptions2 = crashApiOptions3;
                    }
                    String apiKey = crashApiOptions2.getApiKey();
                    Crash crash = this.f19698e;
                    this.f19694a = list2;
                    this.f19695b = 1;
                    Object a11 = xbVar.a(p11, apiKey, crash, this);
                    if (a11 == d11) {
                        return d11;
                    }
                    list = list2;
                    obj = a11;
                } else if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    list = (List) this.f19694a;
                    vz.r.b(obj);
                }
                list.add(obj);
                return vz.b0.f54756a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(List<Crash> list, List<f7<Object, Object>> list2, wb wbVar, zz.d<? super c> dVar) {
            super(2, dVar);
            this.f19691b = list;
            this.f19692c = list2;
            this.f19693d = wbVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
            c cVar = new c(this.f19691b, this.f19692c, this.f19693d, dVar);
            cVar.f19690a = obj;
            return cVar;
        }

        @Override // h00.p
        public Object invoke(v20.o0 o0Var, zz.d<? super vz.b0> dVar) {
            c cVar = new c(this.f19691b, this.f19692c, this.f19693d, dVar);
            cVar.f19690a = o0Var;
            return cVar.invokeSuspend(vz.b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a00.d.d();
            vz.r.b(obj);
            v20.o0 o0Var = (v20.o0) this.f19690a;
            List<Crash> list = this.f19691b;
            List<f7<Object, Object>> list2 = this.f19692c;
            wb wbVar = this.f19693d;
            for (Crash crash : list) {
                v20.k.d(o0Var, null, null, new a(list2, wbVar, crash, null), 3, null);
            }
            return vz.b0.f54756a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends kotlin.jvm.internal.u implements h00.a<xb> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d() {
            super(0);
            wb.this = r1;
        }

        @Override // h00.a
        public xb invoke() {
            ja jaVar = wb.this.f19680a;
            StringBuilder a11 = g4.a("https://analytics.plaid.com/sentry/api/");
            CrashApiOptions crashApiOptions = wb.this.f19682c;
            if (crashApiOptions == null) {
                kotlin.jvm.internal.s.x("crashApiOptions");
                crashApiOptions = null;
            }
            a11.append(crashApiOptions.getProjectId());
            a11.append('/');
            return (xb) jaVar.a(a11.toString(), new la(new com.google.gson.f().d("yyyy-MM-dd'T'HH:mm:ss").c(CrashContext.class, new CrashContextTypeAdapter()).b(), null, 2)).b(xb.class);
        }
    }

    public wb(ja retrofitFactory) {
        vz.k a11;
        kotlin.jvm.internal.s.g(retrofitFactory, "retrofitFactory");
        this.f19680a = retrofitFactory;
        a11 = vz.m.a(new d());
        this.f19681b = a11;
    }

    public void a(CrashApiOptions crashApiOptions) {
        kotlin.jvm.internal.s.g(crashApiOptions, "crashApiOptions");
        this.f19682c = crashApiOptions;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0031  */
    @Override // com.plaid.internal.c2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(com.plaid.internal.core.crashreporting.internal.models.Crash r8, zz.d<? super java.lang.Boolean> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.plaid.internal.wb.a
            if (r0 == 0) goto L13
            r0 = r9
            com.plaid.internal.wb$a r0 = (com.plaid.internal.wb.a) r0
            int r1 = r0.f19685c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19685c = r1
            goto L18
        L13:
            com.plaid.internal.wb$a r0 = new com.plaid.internal.wb$a
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f19683a
            java.lang.Object r1 = a00.b.d()
            int r2 = r0.f19685c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            vz.r.b(r9)
            goto L6c
        L29:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L31:
            vz.r.b(r9)
            vz.k r9 = r7.f19681b
            java.lang.Object r9 = r9.getValue()
            java.lang.String r2 = "<get-sentryRetrofitApi>(...)"
            kotlin.jvm.internal.s.f(r9, r2)
            com.plaid.internal.xb r9 = (com.plaid.internal.xb) r9
            com.plaid.internal.core.crashreporting.internal.models.CrashApiOptions r2 = r7.f19682c
            r4 = 0
            java.lang.String r5 = "crashApiOptions"
            if (r2 != 0) goto L4c
            kotlin.jvm.internal.s.x(r5)
            r2 = r4
        L4c:
            java.lang.String r2 = r2.getApiKey()
            java.lang.String r6 = "Sentry sentry_version=6,sentry_key="
            java.lang.String r2 = kotlin.jvm.internal.s.p(r6, r2)
            com.plaid.internal.core.crashreporting.internal.models.CrashApiOptions r6 = r7.f19682c
            if (r6 != 0) goto L5e
            kotlin.jvm.internal.s.x(r5)
            goto L5f
        L5e:
            r4 = r6
        L5f:
            java.lang.String r4 = r4.getApiKey()
            r0.f19685c = r3
            java.lang.Object r9 = r9.a(r2, r4, r8, r0)
            if (r9 != r1) goto L6c
            return r1
        L6c:
            com.plaid.internal.f7 r9 = (com.plaid.internal.f7) r9
            boolean r8 = r9.a()
            r8 = r8 ^ r3
            java.lang.Boolean r8 = kotlin.coroutines.jvm.internal.b.a(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.plaid.internal.wb.a(com.plaid.internal.core.crashreporting.internal.models.Crash, zz.d):java.lang.Object");
    }

    @Override // com.plaid.internal.c2
    public void a(String message) {
        kotlin.jvm.internal.s.g(message, "message");
        throw new RuntimeException(message);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0062  */
    @Override // com.plaid.internal.c2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(java.util.List<com.plaid.internal.core.crashreporting.internal.models.Crash> r7, zz.d<? super java.lang.Boolean> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.plaid.internal.wb.b
            if (r0 == 0) goto L13
            r0 = r8
            com.plaid.internal.wb$b r0 = (com.plaid.internal.wb.b) r0
            int r1 = r0.f19689d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19689d = r1
            goto L18
        L13:
            com.plaid.internal.wb$b r0 = new com.plaid.internal.wb$b
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f19687b
            java.lang.Object r1 = a00.b.d()
            int r2 = r0.f19689d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r7 = r0.f19686a
            java.util.List r7 = (java.util.List) r7
            vz.r.b(r8)
            goto L53
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            vz.r.b(r8)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            v20.j0 r2 = v20.e1.b()
            com.plaid.internal.wb$c r4 = new com.plaid.internal.wb$c
            r5 = 0
            r4.<init>(r7, r8, r6, r5)
            r0.f19686a = r8
            r0.f19689d = r3
            java.lang.Object r7 = v20.i.g(r2, r4, r0)
            if (r7 != r1) goto L52
            return r1
        L52:
            r7 = r8
        L53:
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r7 = r7.iterator()
        L5c:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L73
            java.lang.Object r0 = r7.next()
            r1 = r0
            com.plaid.internal.f7 r1 = (com.plaid.internal.f7) r1
            boolean r1 = r1.a()
            if (r1 == 0) goto L5c
            r8.add(r0)
            goto L5c
        L73:
            boolean r7 = wz.u.R(r8)
            r7 = r7 ^ r3
            java.lang.Boolean r7 = kotlin.coroutines.jvm.internal.b.a(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.plaid.internal.wb.a(java.util.List, zz.d):java.lang.Object");
    }
}