package com.plaid.internal;

import com.plaid.internal.g6;
import com.plaid.internal.wa;

/* loaded from: classes2.dex */
public final class y3 implements j6 {

    /* renamed from: a  reason: collision with root package name */
    public final ma f19879a;

    /* renamed from: b  reason: collision with root package name */
    public final sw.a<kotlinx.serialization.json.a> f19880b;

    /* renamed from: c  reason: collision with root package name */
    public final v20.q1 f19881c;

    /* renamed from: d  reason: collision with root package name */
    public g6 f19882d;

    @kotlin.coroutines.jvm.internal.f(c = "com.plaid.internal.workflow.persistence.HybridLinkStateStore$getCurrentLinkState$2", f = "HybridLinkStateStore.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.l implements h00.p<v20.o0, zz.d<? super g6>, Object> {
        public a(zz.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
            return new a(dVar);
        }

        @Override // h00.p
        public Object invoke(v20.o0 o0Var, zz.d<? super g6> dVar) {
            return new a(dVar).invokeSuspend(vz.b0.f54756a);
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0031 A[Catch: all -> 0x0055, Exception -> 0x0057, Merged into TryCatch #0 {all -> 0x0055, Exception -> 0x0057, blocks: (B:5:0x001d, B:7:0x0025, B:13:0x0031, B:19:0x0058), top: B:27:0x001d }, TRY_LEAVE] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x004f  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.String r0 = "plaid_link_state"
                a00.b.d()
                vz.r.b(r8)
                com.plaid.internal.y3 r8 = com.plaid.internal.y3.this
                com.plaid.internal.g6 r8 = r8.f19882d
                r1 = 2
                r2 = 0
                if (r8 != 0) goto L6f
                com.plaid.internal.wa$a r8 = com.plaid.internal.wa.f19678a
                java.lang.String r3 = "Initializing statestore"
                com.plaid.internal.wa.a.a(r8, r3, r2, r1)
                com.plaid.internal.y3 r8 = com.plaid.internal.y3.this
                r8.getClass()
                r3 = 1
                com.plaid.internal.ma r4 = r8.f19879a     // Catch: java.lang.Throwable -> L55 java.lang.Exception -> L57
                java.lang.String r4 = r4.b(r0)     // Catch: java.lang.Throwable -> L55 java.lang.Exception -> L57
                if (r4 == 0) goto L2e
                int r5 = r4.length()     // Catch: java.lang.Throwable -> L55 java.lang.Exception -> L57
                if (r5 != 0) goto L2c
                goto L2e
            L2c:
                r5 = r2
                goto L2f
            L2e:
                r5 = r3
            L2f:
                if (r5 != 0) goto L4f
                sw.a<kotlinx.serialization.json.a> r5 = r8.f19880b     // Catch: java.lang.Throwable -> L55 java.lang.Exception -> L57
                java.lang.Object r5 = r5.get()     // Catch: java.lang.Throwable -> L55 java.lang.Exception -> L57
                kotlinx.serialization.json.a r5 = (kotlinx.serialization.json.a) r5     // Catch: java.lang.Throwable -> L55 java.lang.Exception -> L57
                com.plaid.internal.g6$c r6 = com.plaid.internal.g6.f18615a     // Catch: java.lang.Throwable -> L55 java.lang.Exception -> L57
                vz.k<c30.b<java.lang.Object>> r6 = com.plaid.internal.g6.f18616b     // Catch: java.lang.Throwable -> L55 java.lang.Exception -> L57
                java.lang.Object r6 = r6.getValue()     // Catch: java.lang.Throwable -> L55 java.lang.Exception -> L57
                c30.b r6 = (c30.b) r6     // Catch: java.lang.Throwable -> L55 java.lang.Exception -> L57
                java.lang.Object r4 = r5.b(r6, r4)     // Catch: java.lang.Throwable -> L55 java.lang.Exception -> L57
                com.plaid.internal.g6 r4 = (com.plaid.internal.g6) r4     // Catch: java.lang.Throwable -> L55 java.lang.Exception -> L57
                com.plaid.internal.ma r3 = r8.f19879a
                r3.a(r0)
                goto L66
            L4f:
                com.plaid.internal.ma r3 = r8.f19879a
                r3.a(r0)
                goto L64
            L55:
                r1 = move-exception
                goto L69
            L57:
                r4 = move-exception
                com.plaid.internal.wa$a r5 = com.plaid.internal.wa.f19678a     // Catch: java.lang.Throwable -> L55
                com.plaid.internal.b7 r5 = com.plaid.internal.wa.f19679b     // Catch: java.lang.Throwable -> L55
                r5.a(r4, r3)     // Catch: java.lang.Throwable -> L55
                com.plaid.internal.ma r3 = r8.f19879a
                r3.a(r0)
            L64:
                com.plaid.internal.g6$i r4 = com.plaid.internal.g6.i.f18640c
            L66:
                r8.f19882d = r4
                goto L6f
            L69:
                com.plaid.internal.ma r8 = r8.f19879a
                r8.a(r0)
                throw r1
            L6f:
                com.plaid.internal.wa$a r8 = com.plaid.internal.wa.f19678a
                com.plaid.internal.y3 r0 = com.plaid.internal.y3.this
                com.plaid.internal.g6 r0 = r0.f19882d
                java.lang.String r3 = "Get current LinkState: "
                java.lang.String r0 = kotlin.jvm.internal.s.p(r3, r0)
                com.plaid.internal.wa.a.a(r8, r0, r2, r1)
                com.plaid.internal.y3 r8 = com.plaid.internal.y3.this
                com.plaid.internal.g6 r8 = r8.f19882d
                kotlin.jvm.internal.s.e(r8)
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.plaid.internal.y3.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.plaid.internal.workflow.persistence.HybridLinkStateStore$storeLinkState$2", f = "HybridLinkStateStore.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.l implements h00.p<v20.o0, zz.d<? super vz.b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ g6 f19884a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ y3 f19885b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(g6 g6Var, y3 y3Var, zz.d<? super b> dVar) {
            super(2, dVar);
            this.f19884a = g6Var;
            this.f19885b = y3Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
            return new b(this.f19884a, this.f19885b, dVar);
        }

        @Override // h00.p
        public Object invoke(v20.o0 o0Var, zz.d<? super vz.b0> dVar) {
            return new b(this.f19884a, this.f19885b, dVar).invokeSuspend(vz.b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a00.d.d();
            vz.r.b(obj);
            wa.a.a(wa.f19678a, kotlin.jvm.internal.s.p("Store LinkState: ", this.f19884a), false, 2);
            y3 y3Var = this.f19885b;
            g6 g6Var = this.f19884a;
            y3Var.f19882d = g6Var;
            if (!(g6Var instanceof g6.a)) {
                g6.c cVar = g6.f18615a;
                y3Var.f19879a.a("plaid_link_state", y3Var.f19880b.get().c(g6.f18616b.getValue(), g6Var));
            }
            return vz.b0.f54756a;
        }
    }

    public y3(ma plaidStorage, sw.a<kotlinx.serialization.json.a> json) {
        kotlin.jvm.internal.s.g(plaidStorage, "plaidStorage");
        kotlin.jvm.internal.s.g(json, "json");
        this.f19879a = plaidStorage;
        this.f19880b = json;
        this.f19881c = v20.c3.d("LinkStateStoreThreadSafe");
    }

    @Override // com.plaid.internal.ab
    public Object a(zz.d<? super g6> dVar) {
        return v20.i.g(this.f19881c, new a(null), dVar);
    }

    @Override // com.plaid.internal.j6
    public Object a(g6 g6Var, zz.d<? super vz.b0> dVar) {
        Object d11;
        Object g11 = v20.i.g(this.f19881c, new b(g6Var, this, null), dVar);
        d11 = a00.d.d();
        return g11 == d11 ? g11 : vz.b0.f54756a;
    }
}