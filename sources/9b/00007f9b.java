package kotlinx.coroutines.flow;

import kotlin.KotlinNothingValueException;

/* loaded from: classes5.dex */
final class g0 implements e0 {

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.StartedLazily$command$1", f = "SharingStarted.kt", l = {155}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements h00.p<f<? super c0>, zz.d<? super vz.b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f35258a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f35259b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h0<Integer> f35260c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: kotlinx.coroutines.flow.g0$a$a  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0665a<T> implements f {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ kotlin.jvm.internal.h0 f35261a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ f<c0> f35262b;

            /* JADX INFO: Access modifiers changed from: package-private */
            @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.StartedLazily$command$1$1", f = "SharingStarted.kt", l = {158}, m = "emit")
            /* renamed from: kotlinx.coroutines.flow.g0$a$a$a  reason: collision with other inner class name */
            /* loaded from: classes5.dex */
            public static final class C0666a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: a  reason: collision with root package name */
                /* synthetic */ Object f35263a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ C0665a<T> f35264b;

                /* renamed from: c  reason: collision with root package name */
                int f35265c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C0666a(C0665a<? super T> c0665a, zz.d<? super C0666a> dVar) {
                    super(dVar);
                    this.f35264b = c0665a;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f35263a = obj;
                    this.f35265c |= Integer.MIN_VALUE;
                    return this.f35264b.a(0, this);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            C0665a(kotlin.jvm.internal.h0 h0Var, f<? super c0> fVar) {
                this.f35261a = h0Var;
                this.f35262b = fVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object a(int r5, zz.d<? super vz.b0> r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof kotlinx.coroutines.flow.g0.a.C0665a.C0666a
                    if (r0 == 0) goto L13
                    r0 = r6
                    kotlinx.coroutines.flow.g0$a$a$a r0 = (kotlinx.coroutines.flow.g0.a.C0665a.C0666a) r0
                    int r1 = r0.f35265c
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f35265c = r1
                    goto L18
                L13:
                    kotlinx.coroutines.flow.g0$a$a$a r0 = new kotlinx.coroutines.flow.g0$a$a$a
                    r0.<init>(r4, r6)
                L18:
                    java.lang.Object r6 = r0.f35263a
                    java.lang.Object r1 = a00.b.d()
                    int r2 = r0.f35265c
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    vz.r.b(r6)
                    goto L4b
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    vz.r.b(r6)
                    if (r5 <= 0) goto L4e
                    kotlin.jvm.internal.h0 r5 = r4.f35261a
                    boolean r6 = r5.f34902a
                    if (r6 != 0) goto L4e
                    r5.f34902a = r3
                    kotlinx.coroutines.flow.f<kotlinx.coroutines.flow.c0> r5 = r4.f35262b
                    kotlinx.coroutines.flow.c0 r6 = kotlinx.coroutines.flow.c0.START
                    r0.f35265c = r3
                    java.lang.Object r5 = r5.emit(r6, r0)
                    if (r5 != r1) goto L4b
                    return r1
                L4b:
                    vz.b0 r5 = vz.b0.f54756a
                    return r5
                L4e:
                    vz.b0 r5 = vz.b0.f54756a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.g0.a.C0665a.a(int, zz.d):java.lang.Object");
            }

            @Override // kotlinx.coroutines.flow.f
            public /* bridge */ /* synthetic */ Object emit(Object obj, zz.d dVar) {
                return a(((Number) obj).intValue(), dVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(h0<Integer> h0Var, zz.d<? super a> dVar) {
            super(2, dVar);
            this.f35260c = h0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
            a aVar = new a(this.f35260c, dVar);
            aVar.f35259b = obj;
            return aVar;
        }

        @Override // h00.p
        public final Object invoke(f<? super c0> fVar, zz.d<? super vz.b0> dVar) {
            return ((a) create(fVar, dVar)).invokeSuspend(vz.b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d11;
            d11 = a00.d.d();
            int i11 = this.f35258a;
            if (i11 == 0) {
                vz.r.b(obj);
                kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
                h0<Integer> h0Var2 = this.f35260c;
                C0665a c0665a = new C0665a(h0Var, (f) this.f35259b);
                this.f35258a = 1;
                if (h0Var2.collect(c0665a, this) == d11) {
                    return d11;
                }
            } else if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                vz.r.b(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    @Override // kotlinx.coroutines.flow.e0
    public e<c0> a(h0<Integer> h0Var) {
        return g.v(new a(h0Var, null));
    }

    public String toString() {
        return "SharingStarted.Lazily";
    }
}