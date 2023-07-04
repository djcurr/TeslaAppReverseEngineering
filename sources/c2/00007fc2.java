package kotlinx.coroutines.flow;

import kotlinx.coroutines.flow.internal.AbortFlowException;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final /* synthetic */ class p {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes5.dex */
    public static final class a<T> implements kotlinx.coroutines.flow.f<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.l0 f35333a;

        public a(kotlin.jvm.internal.l0 l0Var) {
            this.f35333a = l0Var;
        }

        @Override // kotlinx.coroutines.flow.f
        public Object emit(T t11, zz.d<? super vz.b0> dVar) {
            this.f35333a.f34916a = t11;
            throw new AbortFlowException(this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes5.dex */
    public static final class b<T> implements kotlinx.coroutines.flow.f<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h00.p f35334a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.l0 f35335b;

        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$2", f = "Reduce.kt", l = {143}, m = "emit")
        /* loaded from: classes5.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: a  reason: collision with root package name */
            Object f35336a;

            /* renamed from: b  reason: collision with root package name */
            /* synthetic */ Object f35337b;

            /* renamed from: c  reason: collision with root package name */
            int f35338c;

            /* renamed from: e  reason: collision with root package name */
            Object f35340e;

            public a(zz.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f35337b = obj;
                this.f35338c |= Integer.MIN_VALUE;
                return b.this.emit(null, this);
            }
        }

        public b(h00.p pVar, kotlin.jvm.internal.l0 l0Var) {
            this.f35334a = pVar;
            this.f35335b = l0Var;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x005a  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0061  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0064  */
        @Override // kotlinx.coroutines.flow.f
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object emit(T r5, zz.d<? super vz.b0> r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof kotlinx.coroutines.flow.p.b.a
                if (r0 == 0) goto L13
                r0 = r6
                kotlinx.coroutines.flow.p$b$a r0 = (kotlinx.coroutines.flow.p.b.a) r0
                int r1 = r0.f35338c
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f35338c = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.p$b$a r0 = new kotlinx.coroutines.flow.p$b$a
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.f35337b
                java.lang.Object r1 = a00.b.d()
                int r2 = r0.f35338c
                r3 = 1
                if (r2 == 0) goto L37
                if (r2 != r3) goto L2f
                java.lang.Object r5 = r0.f35340e
                java.lang.Object r0 = r0.f35336a
                kotlinx.coroutines.flow.p$b r0 = (kotlinx.coroutines.flow.p.b) r0
                vz.r.b(r6)
                goto L52
            L2f:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L37:
                vz.r.b(r6)
                h00.p r6 = r4.f35334a
                r0.f35336a = r4
                r0.f35340e = r5
                r0.f35338c = r3
                r2 = 6
                kotlin.jvm.internal.q.c(r2)
                java.lang.Object r6 = r6.invoke(r5, r0)
                r0 = 7
                kotlin.jvm.internal.q.c(r0)
                if (r6 != r1) goto L51
                return r1
            L51:
                r0 = r4
            L52:
                java.lang.Boolean r6 = (java.lang.Boolean) r6
                boolean r6 = r6.booleanValue()
                if (r6 == 0) goto L5f
                kotlin.jvm.internal.l0 r6 = r0.f35335b
                r6.f34916a = r5
                r3 = 0
            L5f:
                if (r3 == 0) goto L64
                vz.b0 r5 = vz.b0.f54756a
                return r5
            L64:
                kotlinx.coroutines.flow.internal.AbortFlowException r5 = new kotlinx.coroutines.flow.internal.AbortFlowException
                r5.<init>(r0)
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.p.b.emit(java.lang.Object, zz.d):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", l = {CipherSuite.TLS_RSA_PSK_WITH_AES_256_CBC_SHA384}, m = "first")
    /* loaded from: classes5.dex */
    public static final class c<T> extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        Object f35341a;

        /* renamed from: b  reason: collision with root package name */
        Object f35342b;

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ Object f35343c;

        /* renamed from: d  reason: collision with root package name */
        int f35344d;

        c(zz.d<? super c> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f35343c = obj;
            this.f35344d |= Integer.MIN_VALUE;
            return kotlinx.coroutines.flow.g.r(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", l = {CipherSuite.TLS_RSA_PSK_WITH_AES_256_CBC_SHA384}, m = "first")
    /* loaded from: classes5.dex */
    public static final class d<T> extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        Object f35345a;

        /* renamed from: b  reason: collision with root package name */
        Object f35346b;

        /* renamed from: c  reason: collision with root package name */
        Object f35347c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f35348d;

        /* renamed from: e  reason: collision with root package name */
        int f35349e;

        d(zz.d<? super d> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f35348d = obj;
            this.f35349e |= Integer.MIN_VALUE;
            return kotlinx.coroutines.flow.g.q(null, null, this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes5.dex */
    public static final class e<T> implements kotlinx.coroutines.flow.f<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.l0 f35350a;

        public e(kotlin.jvm.internal.l0 l0Var) {
            this.f35350a = l0Var;
        }

        @Override // kotlinx.coroutines.flow.f
        public Object emit(T t11, zz.d<? super vz.b0> dVar) {
            this.f35350a.f34916a = t11;
            throw new AbortFlowException(this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes5.dex */
    public static final class f<T> implements kotlinx.coroutines.flow.f<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h00.p f35351a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.l0 f35352b;

        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2", f = "Reduce.kt", l = {143}, m = "emit")
        /* loaded from: classes5.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: a  reason: collision with root package name */
            Object f35353a;

            /* renamed from: b  reason: collision with root package name */
            /* synthetic */ Object f35354b;

            /* renamed from: c  reason: collision with root package name */
            int f35355c;

            /* renamed from: e  reason: collision with root package name */
            Object f35357e;

            public a(zz.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f35354b = obj;
                this.f35355c |= Integer.MIN_VALUE;
                return f.this.emit(null, this);
            }
        }

        public f(h00.p pVar, kotlin.jvm.internal.l0 l0Var) {
            this.f35351a = pVar;
            this.f35352b = l0Var;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x005a  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0061  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0064  */
        @Override // kotlinx.coroutines.flow.f
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object emit(T r5, zz.d<? super vz.b0> r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof kotlinx.coroutines.flow.p.f.a
                if (r0 == 0) goto L13
                r0 = r6
                kotlinx.coroutines.flow.p$f$a r0 = (kotlinx.coroutines.flow.p.f.a) r0
                int r1 = r0.f35355c
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f35355c = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.p$f$a r0 = new kotlinx.coroutines.flow.p$f$a
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.f35354b
                java.lang.Object r1 = a00.b.d()
                int r2 = r0.f35355c
                r3 = 1
                if (r2 == 0) goto L37
                if (r2 != r3) goto L2f
                java.lang.Object r5 = r0.f35357e
                java.lang.Object r0 = r0.f35353a
                kotlinx.coroutines.flow.p$f r0 = (kotlinx.coroutines.flow.p.f) r0
                vz.r.b(r6)
                goto L52
            L2f:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L37:
                vz.r.b(r6)
                h00.p r6 = r4.f35351a
                r0.f35353a = r4
                r0.f35357e = r5
                r0.f35355c = r3
                r2 = 6
                kotlin.jvm.internal.q.c(r2)
                java.lang.Object r6 = r6.invoke(r5, r0)
                r0 = 7
                kotlin.jvm.internal.q.c(r0)
                if (r6 != r1) goto L51
                return r1
            L51:
                r0 = r4
            L52:
                java.lang.Boolean r6 = (java.lang.Boolean) r6
                boolean r6 = r6.booleanValue()
                if (r6 == 0) goto L5f
                kotlin.jvm.internal.l0 r6 = r0.f35352b
                r6.f34916a = r5
                r3 = 0
            L5f:
                if (r3 == 0) goto L64
                vz.b0 r5 = vz.b0.f54756a
                return r5
            L64:
                kotlinx.coroutines.flow.internal.AbortFlowException r5 = new kotlinx.coroutines.flow.internal.AbortFlowException
                r5.<init>(r0)
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.p.f.emit(java.lang.Object, zz.d):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", l = {CipherSuite.TLS_RSA_PSK_WITH_AES_256_CBC_SHA384}, m = "firstOrNull")
    /* loaded from: classes5.dex */
    public static final class g<T> extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        Object f35358a;

        /* renamed from: b  reason: collision with root package name */
        Object f35359b;

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ Object f35360c;

        /* renamed from: d  reason: collision with root package name */
        int f35361d;

        g(zz.d<? super g> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f35360c = obj;
            this.f35361d |= Integer.MIN_VALUE;
            return kotlinx.coroutines.flow.g.t(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", l = {CipherSuite.TLS_RSA_PSK_WITH_AES_256_CBC_SHA384}, m = "firstOrNull")
    /* loaded from: classes5.dex */
    public static final class h<T> extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        Object f35362a;

        /* renamed from: b  reason: collision with root package name */
        Object f35363b;

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ Object f35364c;

        /* renamed from: d  reason: collision with root package name */
        int f35365d;

        h(zz.d<? super h> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f35364c = obj;
            this.f35365d |= Integer.MIN_VALUE;
            return kotlinx.coroutines.flow.g.s(null, null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0070 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> java.lang.Object a(kotlinx.coroutines.flow.e<? extends T> r4, h00.p<? super T, ? super zz.d<? super java.lang.Boolean>, ? extends java.lang.Object> r5, zz.d<? super T> r6) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.p.d
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.flow.p$d r0 = (kotlinx.coroutines.flow.p.d) r0
            int r1 = r0.f35349e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f35349e = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.p$d r0 = new kotlinx.coroutines.flow.p$d
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f35348d
            java.lang.Object r1 = a00.b.d()
            int r2 = r0.f35349e
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r4 = r0.f35347c
            kotlinx.coroutines.flow.p$b r4 = (kotlinx.coroutines.flow.p.b) r4
            java.lang.Object r5 = r0.f35346b
            kotlin.jvm.internal.l0 r5 = (kotlin.jvm.internal.l0) r5
            java.lang.Object r0 = r0.f35345a
            h00.p r0 = (h00.p) r0
            vz.r.b(r6)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L35
            goto L6a
        L35:
            r6 = move-exception
            goto L67
        L37:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3f:
            vz.r.b(r6)
            kotlin.jvm.internal.l0 r6 = new kotlin.jvm.internal.l0
            r6.<init>()
            kotlinx.coroutines.internal.f0 r2 = y20.q.f59054a
            r6.f34916a = r2
            kotlinx.coroutines.flow.p$b r2 = new kotlinx.coroutines.flow.p$b
            r2.<init>(r5, r6)
            r0.f35345a = r5     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L62
            r0.f35346b = r6     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L62
            r0.f35347c = r2     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L62
            r0.f35349e = r3     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L62
            java.lang.Object r4 = r4.collect(r2, r0)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L62
            if (r4 != r1) goto L5f
            return r1
        L5f:
            r0 = r5
            r5 = r6
            goto L6a
        L62:
            r4 = move-exception
            r0 = r5
            r5 = r6
            r6 = r4
            r4 = r2
        L67:
            y20.m.a(r6, r4)
        L6a:
            T r4 = r5.f34916a
            kotlinx.coroutines.internal.f0 r5 = y20.q.f59054a
            if (r4 == r5) goto L71
            return r4
        L71:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            java.lang.String r5 = "Expected at least one element matching the predicate "
            java.lang.String r5 = kotlin.jvm.internal.s.p(r5, r0)
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.p.a(kotlinx.coroutines.flow.e, h00.p, zz.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0068 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> java.lang.Object b(kotlinx.coroutines.flow.e<? extends T> r4, zz.d<? super T> r5) {
        /*
            boolean r0 = r5 instanceof kotlinx.coroutines.flow.p.c
            if (r0 == 0) goto L13
            r0 = r5
            kotlinx.coroutines.flow.p$c r0 = (kotlinx.coroutines.flow.p.c) r0
            int r1 = r0.f35344d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f35344d = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.p$c r0 = new kotlinx.coroutines.flow.p$c
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f35343c
            java.lang.Object r1 = a00.b.d()
            int r2 = r0.f35344d
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r4 = r0.f35342b
            kotlinx.coroutines.flow.p$a r4 = (kotlinx.coroutines.flow.p.a) r4
            java.lang.Object r0 = r0.f35341a
            kotlin.jvm.internal.l0 r0 = (kotlin.jvm.internal.l0) r0
            vz.r.b(r5)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L31
            goto L62
        L31:
            r5 = move-exception
            goto L5f
        L33:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3b:
            vz.r.b(r5)
            kotlin.jvm.internal.l0 r5 = new kotlin.jvm.internal.l0
            r5.<init>()
            kotlinx.coroutines.internal.f0 r2 = y20.q.f59054a
            r5.f34916a = r2
            kotlinx.coroutines.flow.p$a r2 = new kotlinx.coroutines.flow.p$a
            r2.<init>(r5)
            r0.f35341a = r5     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L5b
            r0.f35342b = r2     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L5b
            r0.f35344d = r3     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L5b
            java.lang.Object r4 = r4.collect(r2, r0)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L5b
            if (r4 != r1) goto L59
            return r1
        L59:
            r0 = r5
            goto L62
        L5b:
            r4 = move-exception
            r0 = r5
            r5 = r4
            r4 = r2
        L5f:
            y20.m.a(r5, r4)
        L62:
            T r4 = r0.f34916a
            kotlinx.coroutines.internal.f0 r5 = y20.q.f59054a
            if (r4 == r5) goto L69
            return r4
        L69:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            java.lang.String r5 = "Expected at least one element"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.p.b(kotlinx.coroutines.flow.e, zz.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> java.lang.Object c(kotlinx.coroutines.flow.e<? extends T> r4, h00.p<? super T, ? super zz.d<? super java.lang.Boolean>, ? extends java.lang.Object> r5, zz.d<? super T> r6) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.p.h
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.flow.p$h r0 = (kotlinx.coroutines.flow.p.h) r0
            int r1 = r0.f35365d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f35365d = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.p$h r0 = new kotlinx.coroutines.flow.p$h
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f35364c
            java.lang.Object r1 = a00.b.d()
            int r2 = r0.f35365d
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r4 = r0.f35363b
            kotlinx.coroutines.flow.p$f r4 = (kotlinx.coroutines.flow.p.f) r4
            java.lang.Object r5 = r0.f35362a
            kotlin.jvm.internal.l0 r5 = (kotlin.jvm.internal.l0) r5
            vz.r.b(r6)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L31
            goto L5e
        L31:
            r6 = move-exception
            goto L5b
        L33:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3b:
            vz.r.b(r6)
            kotlin.jvm.internal.l0 r6 = new kotlin.jvm.internal.l0
            r6.<init>()
            kotlinx.coroutines.flow.p$f r2 = new kotlinx.coroutines.flow.p$f
            r2.<init>(r5, r6)
            r0.f35362a = r6     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L57
            r0.f35363b = r2     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L57
            r0.f35365d = r3     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L57
            java.lang.Object r4 = r4.collect(r2, r0)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L57
            if (r4 != r1) goto L55
            return r1
        L55:
            r5 = r6
            goto L5e
        L57:
            r4 = move-exception
            r5 = r6
            r6 = r4
            r4 = r2
        L5b:
            y20.m.a(r6, r4)
        L5e:
            T r4 = r5.f34916a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.p.c(kotlinx.coroutines.flow.e, h00.p, zz.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> java.lang.Object d(kotlinx.coroutines.flow.e<? extends T> r4, zz.d<? super T> r5) {
        /*
            boolean r0 = r5 instanceof kotlinx.coroutines.flow.p.g
            if (r0 == 0) goto L13
            r0 = r5
            kotlinx.coroutines.flow.p$g r0 = (kotlinx.coroutines.flow.p.g) r0
            int r1 = r0.f35361d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f35361d = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.p$g r0 = new kotlinx.coroutines.flow.p$g
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f35360c
            java.lang.Object r1 = a00.b.d()
            int r2 = r0.f35361d
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r4 = r0.f35359b
            kotlinx.coroutines.flow.p$e r4 = (kotlinx.coroutines.flow.p.e) r4
            java.lang.Object r0 = r0.f35358a
            kotlin.jvm.internal.l0 r0 = (kotlin.jvm.internal.l0) r0
            vz.r.b(r5)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L31
            goto L5e
        L31:
            r5 = move-exception
            goto L5b
        L33:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3b:
            vz.r.b(r5)
            kotlin.jvm.internal.l0 r5 = new kotlin.jvm.internal.l0
            r5.<init>()
            kotlinx.coroutines.flow.p$e r2 = new kotlinx.coroutines.flow.p$e
            r2.<init>(r5)
            r0.f35358a = r5     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L57
            r0.f35359b = r2     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L57
            r0.f35361d = r3     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L57
            java.lang.Object r4 = r4.collect(r2, r0)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L57
            if (r4 != r1) goto L55
            return r1
        L55:
            r0 = r5
            goto L5e
        L57:
            r4 = move-exception
            r0 = r5
            r5 = r4
            r4 = r2
        L5b:
            y20.m.a(r5, r4)
        L5e:
            T r4 = r0.f34916a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.p.d(kotlinx.coroutines.flow.e, zz.d):java.lang.Object");
    }
}