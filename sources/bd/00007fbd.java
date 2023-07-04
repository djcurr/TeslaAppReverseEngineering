package kotlinx.coroutines.flow;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final /* synthetic */ class o {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes5.dex */
    public static final class a<T> implements e<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f35324a;

        public a(e eVar) {
            this.f35324a = eVar;
        }

        @Override // kotlinx.coroutines.flow.e
        public Object collect(f<? super T> fVar, zz.d<? super vz.b0> dVar) {
            Object d11;
            Object collect = this.f35324a.collect(new b(fVar), dVar);
            d11 = a00.d.d();
            return collect == d11 ? collect : vz.b0.f54756a;
        }
    }

    /* loaded from: classes5.dex */
    static final class b<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f<T> f35325a;

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__MergeKt$flattenConcat$1$1", f = "Merge.kt", l = {80}, m = "emit")
        /* loaded from: classes5.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: a  reason: collision with root package name */
            /* synthetic */ Object f35326a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ b<T> f35327b;

            /* renamed from: c  reason: collision with root package name */
            int f35328c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(b<? super T> bVar, zz.d<? super a> dVar) {
                super(dVar);
                this.f35327b = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f35326a = obj;
                this.f35328c |= Integer.MIN_VALUE;
                return this.f35327b.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        b(f<? super T> fVar) {
            this.f35325a = fVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
        @Override // kotlinx.coroutines.flow.f
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object emit(kotlinx.coroutines.flow.e<? extends T> r5, zz.d<? super vz.b0> r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof kotlinx.coroutines.flow.o.b.a
                if (r0 == 0) goto L13
                r0 = r6
                kotlinx.coroutines.flow.o$b$a r0 = (kotlinx.coroutines.flow.o.b.a) r0
                int r1 = r0.f35328c
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f35328c = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.o$b$a r0 = new kotlinx.coroutines.flow.o$b$a
                r0.<init>(r4, r6)
            L18:
                java.lang.Object r6 = r0.f35326a
                java.lang.Object r1 = a00.b.d()
                int r2 = r0.f35328c
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                vz.r.b(r6)
                goto L3f
            L29:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L31:
                vz.r.b(r6)
                kotlinx.coroutines.flow.f<T> r6 = r4.f35325a
                r0.f35328c = r3
                java.lang.Object r5 = kotlinx.coroutines.flow.g.m(r6, r5, r0)
                if (r5 != r1) goto L3f
                return r1
            L3f:
                vz.b0 r5 = vz.b0.f54756a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.o.b.emit(kotlinx.coroutines.flow.e, zz.d):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [R, T] */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__MergeKt$mapLatest$1", f = "Merge.kt", l = {214, 214}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    public static final class c<R, T> extends kotlin.coroutines.jvm.internal.l implements h00.q<f<? super R>, T, zz.d<? super vz.b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f35329a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f35330b;

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ Object f35331c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ h00.p<T, zz.d<? super R>, Object> f35332d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(h00.p<? super T, ? super zz.d<? super R>, ? extends Object> pVar, zz.d<? super c> dVar) {
            super(3, dVar);
            this.f35332d = pVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h00.q
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, zz.d<? super vz.b0> dVar) {
            return invoke((f) ((f) obj), (f<? super R>) obj2, dVar);
        }

        public final Object invoke(f<? super R> fVar, T t11, zz.d<? super vz.b0> dVar) {
            c cVar = new c(this.f35332d, dVar);
            cVar.f35330b = fVar;
            cVar.f35331c = t11;
            return cVar.invokeSuspend(vz.b0.f54756a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d11;
            f fVar;
            d11 = a00.d.d();
            int i11 = this.f35329a;
            if (i11 == 0) {
                vz.r.b(obj);
                f fVar2 = (f) this.f35330b;
                Object obj2 = this.f35331c;
                this.f35330b = fVar2;
                this.f35329a = 1;
                obj = this.f35332d.invoke(obj2, this);
                fVar = fVar2;
                if (obj == d11) {
                    return d11;
                }
            } else if (i11 != 1) {
                if (i11 == 2) {
                    vz.r.b(obj);
                    return vz.b0.f54756a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                vz.r.b(obj);
                fVar = (f) this.f35330b;
            }
            this.f35330b = null;
            this.f35329a = 2;
            if (fVar.emit(obj, this) == d11) {
                return d11;
            }
            return vz.b0.f54756a;
        }
    }

    static {
        kotlinx.coroutines.internal.g0.b("kotlinx.coroutines.flow.defaultConcurrency", 16, 1, Integer.MAX_VALUE);
    }

    public static final <T> e<T> a(e<? extends e<? extends T>> eVar) {
        return new a(eVar);
    }

    public static final <T, R> e<R> b(e<? extends T> eVar, h00.p<? super T, ? super zz.d<? super R>, ? extends Object> pVar) {
        return g.G(eVar, new c(pVar, null));
    }

    public static final <T, R> e<R> c(e<? extends T> eVar, h00.q<? super f<? super R>, ? super T, ? super zz.d<? super vz.b0>, ? extends Object> qVar) {
        return new y20.h(qVar, eVar, null, 0, null, 28, null);
    }
}