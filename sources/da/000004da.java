package androidx.compose.ui.platform;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class u0 {

    /* renamed from: a  reason: collision with root package name */
    public static final u0 f3112a = new u0();

    /* renamed from: b  reason: collision with root package name */
    private static final AtomicBoolean f3113b = new AtomicBoolean(false);

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.platform.GlobalSnapshotManager$ensureStarted$1", f = "GlobalSnapshotManager.android.kt", l = {63}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.l implements h00.p<v20.o0, zz.d<? super vz.b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        Object f3114a;

        /* renamed from: b  reason: collision with root package name */
        Object f3115b;

        /* renamed from: c  reason: collision with root package name */
        int f3116c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ x20.e<vz.b0> f3117d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(x20.e<vz.b0> eVar, zz.d<? super a> dVar) {
            super(2, dVar);
            this.f3117d = eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
            return new a(this.f3117d, dVar);
        }

        @Override // h00.p
        public final Object invoke(v20.o0 o0Var, zz.d<? super vz.b0> dVar) {
            return ((a) create(o0Var, dVar)).invokeSuspend(vz.b0.f54756a);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x003a A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x004a A[Catch: all -> 0x0060, TRY_LEAVE, TryCatch #0 {all -> 0x0060, blocks: (B:17:0x0042, B:19:0x004a), top: B:30:0x0042 }] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x005a  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x003b -> B:16:0x0041). Please submit an issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = a00.b.d()
                int r1 = r7.f3116c
                r2 = 1
                if (r1 == 0) goto L23
                if (r1 != r2) goto L1b
                java.lang.Object r1 = r7.f3115b
                x20.g r1 = (x20.g) r1
                java.lang.Object r3 = r7.f3114a
                x20.t r3 = (x20.t) r3
                vz.r.b(r8)     // Catch: java.lang.Throwable -> L63
                r4 = r3
                r3 = r1
                r1 = r0
                r0 = r7
                goto L41
            L1b:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L23:
                vz.r.b(r8)
                x20.e<vz.b0> r3 = r7.f3117d
                x20.g r8 = r3.iterator()     // Catch: java.lang.Throwable -> L63
                r1 = r8
                r8 = r7
            L2e:
                r8.f3114a = r3     // Catch: java.lang.Throwable -> L63
                r8.f3115b = r1     // Catch: java.lang.Throwable -> L63
                r8.f3116c = r2     // Catch: java.lang.Throwable -> L63
                java.lang.Object r4 = r1.a(r8)     // Catch: java.lang.Throwable -> L63
                if (r4 != r0) goto L3b
                return r0
            L3b:
                r6 = r0
                r0 = r8
                r8 = r4
                r4 = r3
                r3 = r1
                r1 = r6
            L41:
                r5 = 0
                java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L60
                boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L60
                if (r8 == 0) goto L5a
                java.lang.Object r8 = r3.next()     // Catch: java.lang.Throwable -> L60
                vz.b0 r8 = (vz.b0) r8     // Catch: java.lang.Throwable -> L60
                m1.h$a r8 = m1.h.f38186d     // Catch: java.lang.Throwable -> L60
                r8.f()     // Catch: java.lang.Throwable -> L60
                r8 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                goto L2e
            L5a:
                x20.j.a(r4, r5)
                vz.b0 r8 = vz.b0.f54756a
                return r8
            L60:
                r8 = move-exception
                r3 = r4
                goto L64
            L63:
                r8 = move-exception
            L64:
                throw r8     // Catch: java.lang.Throwable -> L65
            L65:
                r0 = move-exception
                x20.j.a(r3, r8)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.u0.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends kotlin.jvm.internal.u implements h00.l<Object, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ x20.e<vz.b0> f3118a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(x20.e<vz.b0> eVar) {
            super(1);
            this.f3118a = eVar;
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ vz.b0 invoke(Object obj) {
            invoke2(obj);
            return vz.b0.f54756a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Object it2) {
            kotlin.jvm.internal.s.g(it2, "it");
            this.f3118a.d(vz.b0.f54756a);
        }
    }

    private u0() {
    }

    public final void a() {
        if (f3113b.compareAndSet(false, true)) {
            x20.e b11 = x20.h.b(-1, null, null, 6, null);
            v20.k.d(v20.p0.a(d0.f2872l.b()), null, null, new a(b11, null), 3, null);
            m1.h.f38186d.e(new b(b11));
        }
    }
}