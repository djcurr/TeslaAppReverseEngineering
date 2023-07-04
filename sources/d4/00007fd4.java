package kotlinx.coroutines.flow;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final /* synthetic */ class r {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes5.dex */
    public static final class a<T> implements e<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f35386a;

        /* renamed from: kotlinx.coroutines.flow.r$a$a  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0669a<T> implements f {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ f f35387a;

            @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2", f = "Transform.kt", l = {223}, m = "emit")
            /* renamed from: kotlinx.coroutines.flow.r$a$a$a  reason: collision with other inner class name */
            /* loaded from: classes5.dex */
            public static final class C0670a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: a  reason: collision with root package name */
                /* synthetic */ Object f35388a;

                /* renamed from: b  reason: collision with root package name */
                int f35389b;

                public C0670a(zz.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f35388a = obj;
                    this.f35389b |= Integer.MIN_VALUE;
                    return C0669a.this.emit(null, this);
                }
            }

            public C0669a(f fVar) {
                this.f35387a = fVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
            @Override // kotlinx.coroutines.flow.f
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object emit(T r5, zz.d<? super vz.b0> r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof kotlinx.coroutines.flow.r.a.C0669a.C0670a
                    if (r0 == 0) goto L13
                    r0 = r6
                    kotlinx.coroutines.flow.r$a$a$a r0 = (kotlinx.coroutines.flow.r.a.C0669a.C0670a) r0
                    int r1 = r0.f35389b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f35389b = r1
                    goto L18
                L13:
                    kotlinx.coroutines.flow.r$a$a$a r0 = new kotlinx.coroutines.flow.r$a$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f35388a
                    java.lang.Object r1 = a00.b.d()
                    int r2 = r0.f35389b
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    vz.r.b(r6)
                    goto L41
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    vz.r.b(r6)
                    kotlinx.coroutines.flow.f r6 = r4.f35387a
                    if (r5 == 0) goto L41
                    r0.f35389b = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L41
                    return r1
                L41:
                    vz.b0 r5 = vz.b0.f54756a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.r.a.C0669a.emit(java.lang.Object, zz.d):java.lang.Object");
            }
        }

        public a(e eVar) {
            this.f35386a = eVar;
        }

        @Override // kotlinx.coroutines.flow.e
        public Object collect(f fVar, zz.d dVar) {
            Object d11;
            Object collect = this.f35386a.collect(new C0669a(fVar), dVar);
            d11 = a00.d.d();
            return collect == d11 ? collect : vz.b0.f54756a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes5.dex */
    public static final class b<T> implements e<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f35391a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h00.p f35392b;

        /* loaded from: classes5.dex */
        public static final class a<T> implements f {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ f f35393a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ h00.p f35394b;

            @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2", f = "Transform.kt", l = {223, 224}, m = "emit")
            /* renamed from: kotlinx.coroutines.flow.r$b$a$a  reason: collision with other inner class name */
            /* loaded from: classes5.dex */
            public static final class C0671a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: a  reason: collision with root package name */
                /* synthetic */ Object f35395a;

                /* renamed from: b  reason: collision with root package name */
                int f35396b;

                /* renamed from: d  reason: collision with root package name */
                Object f35398d;

                /* renamed from: e  reason: collision with root package name */
                Object f35399e;

                public C0671a(zz.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f35395a = obj;
                    this.f35396b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(f fVar, h00.p pVar) {
                this.f35393a = fVar;
                this.f35394b = pVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
            /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
            /* JADX WARN: Removed duplicated region for block: B:22:0x0069 A[RETURN] */
            @Override // kotlinx.coroutines.flow.f
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object emit(T r6, zz.d<? super vz.b0> r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof kotlinx.coroutines.flow.r.b.a.C0671a
                    if (r0 == 0) goto L13
                    r0 = r7
                    kotlinx.coroutines.flow.r$b$a$a r0 = (kotlinx.coroutines.flow.r.b.a.C0671a) r0
                    int r1 = r0.f35396b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f35396b = r1
                    goto L18
                L13:
                    kotlinx.coroutines.flow.r$b$a$a r0 = new kotlinx.coroutines.flow.r$b$a$a
                    r0.<init>(r7)
                L18:
                    java.lang.Object r7 = r0.f35395a
                    java.lang.Object r1 = a00.b.d()
                    int r2 = r0.f35396b
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L3e
                    if (r2 == r4) goto L34
                    if (r2 != r3) goto L2c
                    vz.r.b(r7)
                    goto L6a
                L2c:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L34:
                    java.lang.Object r6 = r0.f35399e
                    kotlinx.coroutines.flow.f r6 = (kotlinx.coroutines.flow.f) r6
                    java.lang.Object r2 = r0.f35398d
                    vz.r.b(r7)
                    goto L5c
                L3e:
                    vz.r.b(r7)
                    kotlinx.coroutines.flow.f r7 = r5.f35393a
                    h00.p r2 = r5.f35394b
                    r0.f35398d = r6
                    r0.f35399e = r7
                    r0.f35396b = r4
                    r4 = 6
                    kotlin.jvm.internal.q.c(r4)
                    java.lang.Object r2 = r2.invoke(r6, r0)
                    r4 = 7
                    kotlin.jvm.internal.q.c(r4)
                    if (r2 != r1) goto L5a
                    return r1
                L5a:
                    r2 = r6
                    r6 = r7
                L5c:
                    r7 = 0
                    r0.f35398d = r7
                    r0.f35399e = r7
                    r0.f35396b = r3
                    java.lang.Object r6 = r6.emit(r2, r0)
                    if (r6 != r1) goto L6a
                    return r1
                L6a:
                    vz.b0 r6 = vz.b0.f54756a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.r.b.a.emit(java.lang.Object, zz.d):java.lang.Object");
            }
        }

        public b(e eVar, h00.p pVar) {
            this.f35391a = eVar;
            this.f35392b = pVar;
        }

        @Override // kotlinx.coroutines.flow.e
        public Object collect(f fVar, zz.d dVar) {
            Object d11;
            Object collect = this.f35391a.collect(new a(fVar, this.f35392b), dVar);
            d11 = a00.d.d();
            return collect == d11 ? collect : vz.b0.f54756a;
        }
    }

    public static final <T> e<T> a(e<? extends T> eVar) {
        return new a(eVar);
    }

    public static final <T> e<T> b(e<? extends T> eVar, h00.p<? super T, ? super zz.d<? super vz.b0>, ? extends Object> pVar) {
        return new b(eVar, pVar);
    }
}