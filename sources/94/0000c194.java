package y20;

import java.util.concurrent.atomic.AtomicInteger;
import v20.o0;
import vz.b0;
import wz.k0;
import x20.x;

/* loaded from: classes5.dex */
public final class i {

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2", f = "Combine.kt", l = {57, 79, 82}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.l implements h00.p<o0, zz.d<? super b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        Object f59029a;

        /* renamed from: b  reason: collision with root package name */
        Object f59030b;

        /* renamed from: c  reason: collision with root package name */
        int f59031c;

        /* renamed from: d  reason: collision with root package name */
        int f59032d;

        /* renamed from: e  reason: collision with root package name */
        int f59033e;

        /* renamed from: f  reason: collision with root package name */
        private /* synthetic */ Object f59034f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.e<T>[] f59035g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ h00.a<T[]> f59036h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ h00.q<kotlinx.coroutines.flow.f<? super R>, T[], zz.d<? super b0>, Object> f59037i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.f<R> f59038j;

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1", f = "Combine.kt", l = {34}, m = "invokeSuspend")
        /* renamed from: y20.i$a$a  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C1342a extends kotlin.coroutines.jvm.internal.l implements h00.p<o0, zz.d<? super b0>, Object> {

            /* renamed from: a  reason: collision with root package name */
            int f59039a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.flow.e<T>[] f59040b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ int f59041c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ AtomicInteger f59042d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ x20.e<k0<Object>> f59043e;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: y20.i$a$a$a  reason: collision with other inner class name */
            /* loaded from: classes5.dex */
            public static final class C1343a<T> implements kotlinx.coroutines.flow.f {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ x20.e<k0<Object>> f59044a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ int f59045b;

                /* JADX INFO: Access modifiers changed from: package-private */
                @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1", f = "Combine.kt", l = {35, 36}, m = "emit")
                /* renamed from: y20.i$a$a$a$a  reason: collision with other inner class name */
                /* loaded from: classes5.dex */
                public static final class C1344a extends kotlin.coroutines.jvm.internal.d {

                    /* renamed from: a  reason: collision with root package name */
                    /* synthetic */ Object f59046a;

                    /* renamed from: b  reason: collision with root package name */
                    final /* synthetic */ C1343a<T> f59047b;

                    /* renamed from: c  reason: collision with root package name */
                    int f59048c;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    C1344a(C1343a<? super T> c1343a, zz.d<? super C1344a> dVar) {
                        super(dVar);
                        this.f59047b = c1343a;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.f59046a = obj;
                        this.f59048c |= Integer.MIN_VALUE;
                        return this.f59047b.emit(null, this);
                    }
                }

                C1343a(x20.e<k0<Object>> eVar, int i11) {
                    this.f59044a = eVar;
                    this.f59045b = i11;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
                /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
                /* JADX WARN: Removed duplicated region for block: B:21:0x0055 A[RETURN] */
                @Override // kotlinx.coroutines.flow.f
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(T r7, zz.d<? super vz.b0> r8) {
                    /*
                        r6 = this;
                        boolean r0 = r8 instanceof y20.i.a.C1342a.C1343a.C1344a
                        if (r0 == 0) goto L13
                        r0 = r8
                        y20.i$a$a$a$a r0 = (y20.i.a.C1342a.C1343a.C1344a) r0
                        int r1 = r0.f59048c
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f59048c = r1
                        goto L18
                    L13:
                        y20.i$a$a$a$a r0 = new y20.i$a$a$a$a
                        r0.<init>(r6, r8)
                    L18:
                        java.lang.Object r8 = r0.f59046a
                        java.lang.Object r1 = a00.b.d()
                        int r2 = r0.f59048c
                        r3 = 2
                        r4 = 1
                        if (r2 == 0) goto L38
                        if (r2 == r4) goto L34
                        if (r2 != r3) goto L2c
                        vz.r.b(r8)
                        goto L56
                    L2c:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                        r7.<init>(r8)
                        throw r7
                    L34:
                        vz.r.b(r8)
                        goto L4d
                    L38:
                        vz.r.b(r8)
                        x20.e<wz.k0<java.lang.Object>> r8 = r6.f59044a
                        wz.k0 r2 = new wz.k0
                        int r5 = r6.f59045b
                        r2.<init>(r5, r7)
                        r0.f59048c = r4
                        java.lang.Object r7 = r8.b(r2, r0)
                        if (r7 != r1) goto L4d
                        return r1
                    L4d:
                        r0.f59048c = r3
                        java.lang.Object r7 = v20.j3.a(r0)
                        if (r7 != r1) goto L56
                        return r1
                    L56:
                        vz.b0 r7 = vz.b0.f54756a
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: y20.i.a.C1342a.C1343a.emit(java.lang.Object, zz.d):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C1342a(kotlinx.coroutines.flow.e<? extends T>[] eVarArr, int i11, AtomicInteger atomicInteger, x20.e<k0<Object>> eVar, zz.d<? super C1342a> dVar) {
                super(2, dVar);
                this.f59040b = eVarArr;
                this.f59041c = i11;
                this.f59042d = atomicInteger;
                this.f59043e = eVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final zz.d<b0> create(Object obj, zz.d<?> dVar) {
                return new C1342a(this.f59040b, this.f59041c, this.f59042d, this.f59043e, dVar);
            }

            @Override // h00.p
            public final Object invoke(o0 o0Var, zz.d<? super b0> dVar) {
                return ((C1342a) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object d11;
                AtomicInteger atomicInteger;
                d11 = a00.d.d();
                int i11 = this.f59039a;
                try {
                    if (i11 == 0) {
                        vz.r.b(obj);
                        kotlinx.coroutines.flow.e[] eVarArr = this.f59040b;
                        int i12 = this.f59041c;
                        kotlinx.coroutines.flow.e eVar = eVarArr[i12];
                        C1343a c1343a = new C1343a(this.f59043e, i12);
                        this.f59039a = 1;
                        if (eVar.collect(c1343a, this) == d11) {
                            return d11;
                        }
                    } else if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        vz.r.b(obj);
                    }
                    if (atomicInteger.decrementAndGet() == 0) {
                        x.a.a(this.f59043e, null, 1, null);
                    }
                    return b0.f54756a;
                } finally {
                    if (this.f59042d.decrementAndGet() == 0) {
                        x.a.a(this.f59043e, null, 1, null);
                    }
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(kotlinx.coroutines.flow.e<? extends T>[] eVarArr, h00.a<T[]> aVar, h00.q<? super kotlinx.coroutines.flow.f<? super R>, ? super T[], ? super zz.d<? super b0>, ? extends Object> qVar, kotlinx.coroutines.flow.f<? super R> fVar, zz.d<? super a> dVar) {
            super(2, dVar);
            this.f59035g = eVarArr;
            this.f59036h = aVar;
            this.f59037i = qVar;
            this.f59038j = fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<b0> create(Object obj, zz.d<?> dVar) {
            a aVar = new a(this.f59035g, this.f59036h, this.f59037i, this.f59038j, dVar);
            aVar.f59034f = obj;
            return aVar;
        }

        @Override // h00.p
        public final Object invoke(o0 o0Var, zz.d<? super b0> dVar) {
            return ((a) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00ea  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00ed A[LOOP:0: B:28:0x00ed->B:35:0x0111, LOOP_START, PHI: r3 r10 
          PHI: (r3v2 int) = (r3v1 int), (r3v3 int) binds: [B:25:0x00e8, B:35:0x0111] A[DONT_GENERATE, DONT_INLINE]
          PHI: (r10v5 wz.k0) = (r10v4 wz.k0), (r10v18 wz.k0) binds: [B:25:0x00e8, B:35:0x0111] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Type inference failed for: r11v1, types: [kotlinx.coroutines.flow.e[], kotlinx.coroutines.flow.e<T>[]] */
        /* JADX WARN: Type inference failed for: r2v12, types: [int] */
        /* JADX WARN: Type inference failed for: r2v7, types: [int] */
        /* JADX WARN: Type inference failed for: r2v9, types: [int] */
        /* JADX WARN: Type inference failed for: r7v0, types: [kotlinx.coroutines.flow.e<T>[]] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x0136 -> B:20:0x00c8). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x016b -> B:46:0x0167). Please submit an issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r25) {
            /*
                Method dump skipped, instructions count: 369
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: y20.i.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final <R, T> Object a(kotlinx.coroutines.flow.f<? super R> fVar, kotlinx.coroutines.flow.e<? extends T>[] eVarArr, h00.a<T[]> aVar, h00.q<? super kotlinx.coroutines.flow.f<? super R>, ? super T[], ? super zz.d<? super b0>, ? extends Object> qVar, zz.d<? super b0> dVar) {
        Object d11;
        Object a11 = l.a(new a(eVarArr, aVar, qVar, fVar, null), dVar);
        d11 = a00.d.d();
        return a11 == d11 ? a11 : b0.f54756a;
    }
}