package kotlinx.coroutines.flow;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class d<T> implements e<T> {

    /* renamed from: a  reason: collision with root package name */
    private final e<T> f35243a;

    /* renamed from: b  reason: collision with root package name */
    public final h00.l<T, Object> f35244b;

    /* renamed from: c  reason: collision with root package name */
    public final h00.p<Object, Object, Boolean> f35245c;

    /* loaded from: classes5.dex */
    static final class a<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d<T> f35246a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.l0<Object> f35247b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ f<T> f35248c;

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.DistinctFlowImpl$collect$2", f = "Distinct.kt", l = {81}, m = "emit")
        /* renamed from: kotlinx.coroutines.flow.d$a$a  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0664a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: a  reason: collision with root package name */
            /* synthetic */ Object f35249a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ a<T> f35250b;

            /* renamed from: c  reason: collision with root package name */
            int f35251c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0664a(a<? super T> aVar, zz.d<? super C0664a> dVar) {
                super(dVar);
                this.f35250b = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f35249a = obj;
                this.f35251c |= Integer.MIN_VALUE;
                return this.f35250b.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        a(d<T> dVar, kotlin.jvm.internal.l0<Object> l0Var, f<? super T> fVar) {
            this.f35246a = dVar;
            this.f35247b = l0Var;
            this.f35248c = fVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
        @Override // kotlinx.coroutines.flow.f
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object emit(T r6, zz.d<? super vz.b0> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof kotlinx.coroutines.flow.d.a.C0664a
                if (r0 == 0) goto L13
                r0 = r7
                kotlinx.coroutines.flow.d$a$a r0 = (kotlinx.coroutines.flow.d.a.C0664a) r0
                int r1 = r0.f35251c
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f35251c = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.d$a$a r0 = new kotlinx.coroutines.flow.d$a$a
                r0.<init>(r5, r7)
            L18:
                java.lang.Object r7 = r0.f35249a
                java.lang.Object r1 = a00.b.d()
                int r2 = r0.f35251c
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                vz.r.b(r7)
                goto L67
            L29:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L31:
                vz.r.b(r7)
                kotlinx.coroutines.flow.d<T> r7 = r5.f35246a
                h00.l<T, java.lang.Object> r7 = r7.f35244b
                java.lang.Object r7 = r7.invoke(r6)
                kotlin.jvm.internal.l0<java.lang.Object> r2 = r5.f35247b
                T r2 = r2.f34916a
                kotlinx.coroutines.internal.f0 r4 = y20.q.f59054a
                if (r2 == r4) goto L58
                kotlinx.coroutines.flow.d<T> r4 = r5.f35246a
                h00.p<java.lang.Object, java.lang.Object, java.lang.Boolean> r4 = r4.f35245c
                java.lang.Object r2 = r4.invoke(r2, r7)
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                boolean r2 = r2.booleanValue()
                if (r2 != 0) goto L55
                goto L58
            L55:
                vz.b0 r6 = vz.b0.f54756a
                return r6
            L58:
                kotlin.jvm.internal.l0<java.lang.Object> r2 = r5.f35247b
                r2.f34916a = r7
                kotlinx.coroutines.flow.f<T> r7 = r5.f35248c
                r0.f35251c = r3
                java.lang.Object r6 = r7.emit(r6, r0)
                if (r6 != r1) goto L67
                return r1
            L67:
                vz.b0 r6 = vz.b0.f54756a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.d.a.emit(java.lang.Object, zz.d):java.lang.Object");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(e<? extends T> eVar, h00.l<? super T, ? extends Object> lVar, h00.p<Object, Object, Boolean> pVar) {
        this.f35243a = eVar;
        this.f35244b = lVar;
        this.f35245c = pVar;
    }

    @Override // kotlinx.coroutines.flow.e
    public Object collect(f<? super T> fVar, zz.d<? super vz.b0> dVar) {
        Object d11;
        kotlin.jvm.internal.l0 l0Var = new kotlin.jvm.internal.l0();
        l0Var.f34916a = (T) y20.q.f59054a;
        Object collect = this.f35243a.collect(new a(this, l0Var, fVar), dVar);
        d11 = a00.d.d();
        return collect == d11 ? collect : vz.b0.f54756a;
    }
}