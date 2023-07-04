package n0;

import kotlin.jvm.internal.l0;
import org.spongycastle.crypto.tls.CipherSuite;
import org.spongycastle.math.Primes;
import v20.o0;
import v20.p0;

/* loaded from: classes.dex */
public final class i0 {

    /* renamed from: a  reason: collision with root package name */
    private static final h00.q<y, s1.f, zz.d<? super vz.b0>, Object> f39819a = new a(null);

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$NoPressGesture$1", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements h00.q<y, s1.f, zz.d<? super vz.b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f39820a;

        a(zz.d<? super a> dVar) {
            super(3, dVar);
        }

        public final Object e(y yVar, long j11, zz.d<? super vz.b0> dVar) {
            return new a(dVar).invokeSuspend(vz.b0.f54756a);
        }

        @Override // h00.q
        public /* bridge */ /* synthetic */ Object invoke(y yVar, s1.f fVar, zz.d<? super vz.b0> dVar) {
            return e(yVar, fVar.t(), dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a00.d.d();
            if (this.f39820a == 0) {
                vz.r.b(obj);
                return vz.b0.f54756a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt", f = "TapGestureDetector.kt", l = {245}, m = "awaitFirstDownOnPass")
    /* loaded from: classes.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        Object f39821a;

        /* renamed from: b  reason: collision with root package name */
        Object f39822b;

        /* renamed from: c  reason: collision with root package name */
        boolean f39823c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f39824d;

        /* renamed from: e  reason: collision with root package name */
        int f39825e;

        b(zz.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f39824d = obj;
            this.f39825e |= Integer.MIN_VALUE;
            return i0.f(null, null, false, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitSecondDown$2", f = "TapGestureDetector.kt", l = {192}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.k implements h00.p<d2.c, zz.d<? super d2.u>, Object> {

        /* renamed from: b  reason: collision with root package name */
        long f39826b;

        /* renamed from: c  reason: collision with root package name */
        int f39827c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f39828d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ d2.u f39829e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(d2.u uVar, zz.d<? super c> dVar) {
            super(2, dVar);
            this.f39829e = uVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
            c cVar = new c(this.f39829e, dVar);
            cVar.f39828d = obj;
            return cVar;
        }

        @Override // h00.p
        /* renamed from: e */
        public final Object invoke(d2.c cVar, zz.d<? super d2.u> dVar) {
            return ((c) create(cVar, dVar)).invokeSuspend(vz.b0.f54756a);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0047 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0058 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0059  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0048 -> B:13:0x004e). Please submit an issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = a00.b.d()
                int r1 = r9.f39827c
                r2 = 1
                if (r1 == 0) goto L21
                if (r1 != r2) goto L19
                long r3 = r9.f39826b
                java.lang.Object r1 = r9.f39828d
                d2.c r1 = (d2.c) r1
                vz.r.b(r10)
                r4 = r3
                r3 = r1
                r1 = r0
                r0 = r9
                goto L4e
            L19:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L21:
                vz.r.b(r10)
                java.lang.Object r10 = r9.f39828d
                d2.c r10 = (d2.c) r10
                d2.u r1 = r9.f39829e
                long r3 = r1.n()
                androidx.compose.ui.platform.y1 r1 = r10.getViewConfiguration()
                long r5 = r1.b()
                long r3 = r3 + r5
                r1 = r10
                r10 = r9
            L39:
                r5 = 0
                r6 = 0
                r10.f39828d = r1
                r10.f39826b = r3
                r10.f39827c = r2
                java.lang.Object r5 = n0.i0.e(r1, r5, r10, r2, r6)
                if (r5 != r0) goto L48
                return r0
            L48:
                r8 = r0
                r0 = r10
                r10 = r5
                r4 = r3
                r3 = r1
                r1 = r8
            L4e:
                d2.u r10 = (d2.u) r10
                long r6 = r10.n()
                int r6 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
                if (r6 < 0) goto L59
                return r10
            L59:
                r10 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                goto L39
            */
            throw new UnsupportedOperationException("Method not decompiled: n0.i0.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt", f = "TapGestureDetector.kt", l = {CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA384}, m = "consumeUntilUp")
    /* loaded from: classes.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        Object f39830a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f39831b;

        /* renamed from: c  reason: collision with root package name */
        int f39832c;

        d(zz.d<? super d> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f39831b = obj;
            this.f39832c |= Integer.MIN_VALUE;
            return i0.h(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2", f = "TapGestureDetector.kt", l = {207}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class e extends kotlin.coroutines.jvm.internal.l implements h00.p<d2.c0, zz.d<? super vz.b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f39833a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f39834b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ z f39835c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ h00.q<y, s1.f, zz.d<? super vz.b0>, Object> f39836d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ h00.l<s1.f, vz.b0> f39837e;

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1", f = "TapGestureDetector.kt", l = {209}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements h00.p<o0, zz.d<? super vz.b0>, Object> {

            /* renamed from: a  reason: collision with root package name */
            int f39838a;

            /* renamed from: b  reason: collision with root package name */
            private /* synthetic */ Object f39839b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ z f39840c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ d2.c0 f39841d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ h00.q<y, s1.f, zz.d<? super vz.b0>, Object> f39842e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ h00.l<s1.f, vz.b0> f39843f;

            /* JADX INFO: Access modifiers changed from: package-private */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$1", f = "TapGestureDetector.kt", l = {Primes.SMALL_FACTOR_LIMIT, 217}, m = "invokeSuspend")
            /* renamed from: n0.i0$e$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0771a extends kotlin.coroutines.jvm.internal.k implements h00.p<d2.c, zz.d<? super vz.b0>, Object> {

                /* renamed from: b  reason: collision with root package name */
                int f39844b;

                /* renamed from: c  reason: collision with root package name */
                private /* synthetic */ Object f39845c;

                /* renamed from: d  reason: collision with root package name */
                final /* synthetic */ h00.q<y, s1.f, zz.d<? super vz.b0>, Object> f39846d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ o0 f39847e;

                /* renamed from: f  reason: collision with root package name */
                final /* synthetic */ z f39848f;

                /* renamed from: g  reason: collision with root package name */
                final /* synthetic */ h00.l<s1.f, vz.b0> f39849g;

                /* JADX INFO: Access modifiers changed from: package-private */
                @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$1$1", f = "TapGestureDetector.kt", l = {214}, m = "invokeSuspend")
                /* renamed from: n0.i0$e$a$a$a  reason: collision with other inner class name */
                /* loaded from: classes.dex */
                public static final class C0772a extends kotlin.coroutines.jvm.internal.l implements h00.p<o0, zz.d<? super vz.b0>, Object> {

                    /* renamed from: a  reason: collision with root package name */
                    int f39850a;

                    /* renamed from: b  reason: collision with root package name */
                    final /* synthetic */ h00.q<y, s1.f, zz.d<? super vz.b0>, Object> f39851b;

                    /* renamed from: c  reason: collision with root package name */
                    final /* synthetic */ z f39852c;

                    /* renamed from: d  reason: collision with root package name */
                    final /* synthetic */ d2.u f39853d;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    C0772a(h00.q<? super y, ? super s1.f, ? super zz.d<? super vz.b0>, ? extends Object> qVar, z zVar, d2.u uVar, zz.d<? super C0772a> dVar) {
                        super(2, dVar);
                        this.f39851b = qVar;
                        this.f39852c = zVar;
                        this.f39853d = uVar;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
                        return new C0772a(this.f39851b, this.f39852c, this.f39853d, dVar);
                    }

                    @Override // h00.p
                    public final Object invoke(o0 o0Var, zz.d<? super vz.b0> dVar) {
                        return ((C0772a) create(o0Var, dVar)).invokeSuspend(vz.b0.f54756a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        Object d11;
                        d11 = a00.d.d();
                        int i11 = this.f39850a;
                        if (i11 == 0) {
                            vz.r.b(obj);
                            h00.q<y, s1.f, zz.d<? super vz.b0>, Object> qVar = this.f39851b;
                            z zVar = this.f39852c;
                            s1.f d12 = s1.f.d(this.f39853d.h());
                            this.f39850a = 1;
                            if (qVar.invoke(zVar, d12, this) == d11) {
                                return d11;
                            }
                        } else if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        } else {
                            vz.r.b(obj);
                        }
                        return vz.b0.f54756a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C0771a(h00.q<? super y, ? super s1.f, ? super zz.d<? super vz.b0>, ? extends Object> qVar, o0 o0Var, z zVar, h00.l<? super s1.f, vz.b0> lVar, zz.d<? super C0771a> dVar) {
                    super(2, dVar);
                    this.f39846d = qVar;
                    this.f39847e = o0Var;
                    this.f39848f = zVar;
                    this.f39849g = lVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
                    C0771a c0771a = new C0771a(this.f39846d, this.f39847e, this.f39848f, this.f39849g, dVar);
                    c0771a.f39845c = obj;
                    return c0771a;
                }

                @Override // h00.p
                /* renamed from: e */
                public final Object invoke(d2.c cVar, zz.d<? super vz.b0> dVar) {
                    return ((C0771a) create(cVar, dVar)).invokeSuspend(vz.b0.f54756a);
                }

                /* JADX WARN: Removed duplicated region for block: B:21:0x0065  */
                /* JADX WARN: Removed duplicated region for block: B:22:0x006b  */
                @Override // kotlin.coroutines.jvm.internal.a
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r13) {
                    /*
                        r12 = this;
                        java.lang.Object r0 = a00.b.d()
                        int r1 = r12.f39844b
                        r2 = 2
                        r3 = 0
                        r4 = 1
                        if (r1 == 0) goto L23
                        if (r1 == r4) goto L1b
                        if (r1 != r2) goto L13
                        vz.r.b(r13)
                        goto L61
                    L13:
                        java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r13.<init>(r0)
                        throw r13
                    L1b:
                        java.lang.Object r1 = r12.f39845c
                        d2.c r1 = (d2.c) r1
                        vz.r.b(r13)
                        goto L37
                    L23:
                        vz.r.b(r13)
                        java.lang.Object r13 = r12.f39845c
                        r1 = r13
                        d2.c r1 = (d2.c) r1
                        r13 = 0
                        r12.f39845c = r1
                        r12.f39844b = r4
                        java.lang.Object r13 = n0.i0.e(r1, r13, r12, r4, r3)
                        if (r13 != r0) goto L37
                        return r0
                    L37:
                        d2.u r13 = (d2.u) r13
                        d2.n.f(r13)
                        h00.q<n0.y, s1.f, zz.d<? super vz.b0>, java.lang.Object> r4 = r12.f39846d
                        h00.q r5 = n0.i0.c()
                        if (r4 == r5) goto L56
                        v20.o0 r6 = r12.f39847e
                        r7 = 0
                        r8 = 0
                        n0.i0$e$a$a$a r9 = new n0.i0$e$a$a$a
                        h00.q<n0.y, s1.f, zz.d<? super vz.b0>, java.lang.Object> r4 = r12.f39846d
                        n0.z r5 = r12.f39848f
                        r9.<init>(r4, r5, r13, r3)
                        r10 = 3
                        r11 = 0
                        v20.i.d(r6, r7, r8, r9, r10, r11)
                    L56:
                        r12.f39845c = r3
                        r12.f39844b = r2
                        java.lang.Object r13 = n0.i0.l(r1, r12)
                        if (r13 != r0) goto L61
                        return r0
                    L61:
                        d2.u r13 = (d2.u) r13
                        if (r13 != 0) goto L6b
                        n0.z r13 = r12.f39848f
                        r13.a()
                        goto L83
                    L6b:
                        d2.n.f(r13)
                        n0.z r0 = r12.f39848f
                        r0.h()
                        h00.l<s1.f, vz.b0> r0 = r12.f39849g
                        if (r0 != 0) goto L78
                        goto L83
                    L78:
                        long r1 = r13.h()
                        s1.f r13 = s1.f.d(r1)
                        r0.invoke(r13)
                    L83:
                        vz.b0 r13 = vz.b0.f54756a
                        return r13
                    */
                    throw new UnsupportedOperationException("Method not decompiled: n0.i0.e.a.C0771a.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(z zVar, d2.c0 c0Var, h00.q<? super y, ? super s1.f, ? super zz.d<? super vz.b0>, ? extends Object> qVar, h00.l<? super s1.f, vz.b0> lVar, zz.d<? super a> dVar) {
                super(2, dVar);
                this.f39840c = zVar;
                this.f39841d = c0Var;
                this.f39842e = qVar;
                this.f39843f = lVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
                a aVar = new a(this.f39840c, this.f39841d, this.f39842e, this.f39843f, dVar);
                aVar.f39839b = obj;
                return aVar;
            }

            @Override // h00.p
            public final Object invoke(o0 o0Var, zz.d<? super vz.b0> dVar) {
                return ((a) create(o0Var, dVar)).invokeSuspend(vz.b0.f54756a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object d11;
                d11 = a00.d.d();
                int i11 = this.f39838a;
                if (i11 == 0) {
                    vz.r.b(obj);
                    o0 o0Var = (o0) this.f39839b;
                    this.f39840c.o();
                    d2.c0 c0Var = this.f39841d;
                    C0771a c0771a = new C0771a(this.f39842e, o0Var, this.f39840c, this.f39843f, null);
                    this.f39838a = 1;
                    if (c0Var.E(c0771a, this) == d11) {
                        return d11;
                    }
                } else if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    vz.r.b(obj);
                }
                return vz.b0.f54756a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(z zVar, h00.q<? super y, ? super s1.f, ? super zz.d<? super vz.b0>, ? extends Object> qVar, h00.l<? super s1.f, vz.b0> lVar, zz.d<? super e> dVar) {
            super(2, dVar);
            this.f39835c = zVar;
            this.f39836d = qVar;
            this.f39837e = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
            e eVar = new e(this.f39835c, this.f39836d, this.f39837e, dVar);
            eVar.f39834b = obj;
            return eVar;
        }

        @Override // h00.p
        public final Object invoke(d2.c0 c0Var, zz.d<? super vz.b0> dVar) {
            return ((e) create(c0Var, dVar)).invokeSuspend(vz.b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d11;
            d11 = a00.d.d();
            int i11 = this.f39833a;
            if (i11 == 0) {
                vz.r.b(obj);
                a aVar = new a(this.f39835c, (d2.c0) this.f39834b, this.f39836d, this.f39837e, null);
                this.f39833a = 1;
                if (p0.e(aVar, this) == d11) {
                    return d11;
                }
            } else if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                vz.r.b(obj);
            }
            return vz.b0.f54756a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2", f = "TapGestureDetector.kt", l = {93}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class f extends kotlin.coroutines.jvm.internal.l implements h00.p<o0, zz.d<? super vz.b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f39854a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f39855b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ d2.c0 f39856c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ h00.q<y, s1.f, zz.d<? super vz.b0>, Object> f39857d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ h00.l<s1.f, vz.b0> f39858e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ h00.l<s1.f, vz.b0> f39859f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ h00.l<s1.f, vz.b0> f39860g;

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1", f = "TapGestureDetector.kt", l = {94}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements h00.p<d2.c0, zz.d<? super vz.b0>, Object> {

            /* renamed from: a  reason: collision with root package name */
            int f39861a;

            /* renamed from: b  reason: collision with root package name */
            private /* synthetic */ Object f39862b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ z f39863c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ h00.q<y, s1.f, zz.d<? super vz.b0>, Object> f39864d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ o0 f39865e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ h00.l<s1.f, vz.b0> f39866f;

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ h00.l<s1.f, vz.b0> f39867g;

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ h00.l<s1.f, vz.b0> f39868h;

            /* JADX INFO: Access modifiers changed from: package-private */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$1", f = "TapGestureDetector.kt", l = {95, 107, 118, 128, 141, 159}, m = "invokeSuspend")
            /* renamed from: n0.i0$f$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0773a extends kotlin.coroutines.jvm.internal.k implements h00.p<d2.c, zz.d<? super vz.b0>, Object> {

                /* renamed from: b  reason: collision with root package name */
                Object f39869b;

                /* renamed from: c  reason: collision with root package name */
                Object f39870c;

                /* renamed from: d  reason: collision with root package name */
                Object f39871d;

                /* renamed from: e  reason: collision with root package name */
                long f39872e;

                /* renamed from: f  reason: collision with root package name */
                int f39873f;

                /* renamed from: g  reason: collision with root package name */
                private /* synthetic */ Object f39874g;

                /* renamed from: h  reason: collision with root package name */
                final /* synthetic */ z f39875h;

                /* renamed from: i  reason: collision with root package name */
                final /* synthetic */ h00.q<y, s1.f, zz.d<? super vz.b0>, Object> f39876i;

                /* renamed from: j  reason: collision with root package name */
                final /* synthetic */ o0 f39877j;

                /* renamed from: k  reason: collision with root package name */
                final /* synthetic */ h00.l<s1.f, vz.b0> f39878k;

                /* renamed from: l  reason: collision with root package name */
                final /* synthetic */ h00.l<s1.f, vz.b0> f39879l;

                /* renamed from: m  reason: collision with root package name */
                final /* synthetic */ h00.l<s1.f, vz.b0> f39880m;

                /* JADX INFO: Access modifiers changed from: package-private */
                @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$1$1", f = "TapGestureDetector.kt", l = {99}, m = "invokeSuspend")
                /* renamed from: n0.i0$f$a$a$a  reason: collision with other inner class name */
                /* loaded from: classes.dex */
                public static final class C0774a extends kotlin.coroutines.jvm.internal.l implements h00.p<o0, zz.d<? super vz.b0>, Object> {

                    /* renamed from: a  reason: collision with root package name */
                    int f39881a;

                    /* renamed from: b  reason: collision with root package name */
                    final /* synthetic */ h00.q<y, s1.f, zz.d<? super vz.b0>, Object> f39882b;

                    /* renamed from: c  reason: collision with root package name */
                    final /* synthetic */ z f39883c;

                    /* renamed from: d  reason: collision with root package name */
                    final /* synthetic */ d2.u f39884d;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    C0774a(h00.q<? super y, ? super s1.f, ? super zz.d<? super vz.b0>, ? extends Object> qVar, z zVar, d2.u uVar, zz.d<? super C0774a> dVar) {
                        super(2, dVar);
                        this.f39882b = qVar;
                        this.f39883c = zVar;
                        this.f39884d = uVar;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
                        return new C0774a(this.f39882b, this.f39883c, this.f39884d, dVar);
                    }

                    @Override // h00.p
                    public final Object invoke(o0 o0Var, zz.d<? super vz.b0> dVar) {
                        return ((C0774a) create(o0Var, dVar)).invokeSuspend(vz.b0.f54756a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        Object d11;
                        d11 = a00.d.d();
                        int i11 = this.f39881a;
                        if (i11 == 0) {
                            vz.r.b(obj);
                            h00.q<y, s1.f, zz.d<? super vz.b0>, Object> qVar = this.f39882b;
                            z zVar = this.f39883c;
                            s1.f d12 = s1.f.d(this.f39884d.h());
                            this.f39881a = 1;
                            if (qVar.invoke(zVar, d12, this) == d11) {
                                return d11;
                            }
                        } else if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        } else {
                            vz.r.b(obj);
                        }
                        return vz.b0.f54756a;
                    }
                }

                /* JADX INFO: Access modifiers changed from: package-private */
                @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$1$2", f = "TapGestureDetector.kt", l = {108}, m = "invokeSuspend")
                /* renamed from: n0.i0$f$a$a$b */
                /* loaded from: classes.dex */
                public static final class b extends kotlin.coroutines.jvm.internal.k implements h00.p<d2.c, zz.d<? super d2.u>, Object> {

                    /* renamed from: b  reason: collision with root package name */
                    int f39885b;

                    /* renamed from: c  reason: collision with root package name */
                    private /* synthetic */ Object f39886c;

                    b(zz.d<? super b> dVar) {
                        super(2, dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
                        b bVar = new b(dVar);
                        bVar.f39886c = obj;
                        return bVar;
                    }

                    @Override // h00.p
                    /* renamed from: e */
                    public final Object invoke(d2.c cVar, zz.d<? super d2.u> dVar) {
                        return ((b) create(cVar, dVar)).invokeSuspend(vz.b0.f54756a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        Object d11;
                        d11 = a00.d.d();
                        int i11 = this.f39885b;
                        if (i11 == 0) {
                            vz.r.b(obj);
                            this.f39885b = 1;
                            obj = i0.l((d2.c) this.f39886c, this);
                            if (obj == d11) {
                                return d11;
                            }
                        } else if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        } else {
                            vz.r.b(obj);
                        }
                        return obj;
                    }
                }

                /* JADX INFO: Access modifiers changed from: package-private */
                @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$1$3", f = "TapGestureDetector.kt", l = {136}, m = "invokeSuspend")
                /* renamed from: n0.i0$f$a$a$c */
                /* loaded from: classes.dex */
                public static final class c extends kotlin.coroutines.jvm.internal.l implements h00.p<o0, zz.d<? super vz.b0>, Object> {

                    /* renamed from: a  reason: collision with root package name */
                    int f39887a;

                    /* renamed from: b  reason: collision with root package name */
                    final /* synthetic */ h00.q<y, s1.f, zz.d<? super vz.b0>, Object> f39888b;

                    /* renamed from: c  reason: collision with root package name */
                    final /* synthetic */ z f39889c;

                    /* renamed from: d  reason: collision with root package name */
                    final /* synthetic */ d2.u f39890d;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    c(h00.q<? super y, ? super s1.f, ? super zz.d<? super vz.b0>, ? extends Object> qVar, z zVar, d2.u uVar, zz.d<? super c> dVar) {
                        super(2, dVar);
                        this.f39888b = qVar;
                        this.f39889c = zVar;
                        this.f39890d = uVar;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
                        return new c(this.f39888b, this.f39889c, this.f39890d, dVar);
                    }

                    @Override // h00.p
                    public final Object invoke(o0 o0Var, zz.d<? super vz.b0> dVar) {
                        return ((c) create(o0Var, dVar)).invokeSuspend(vz.b0.f54756a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        Object d11;
                        d11 = a00.d.d();
                        int i11 = this.f39887a;
                        if (i11 == 0) {
                            vz.r.b(obj);
                            h00.q<y, s1.f, zz.d<? super vz.b0>, Object> qVar = this.f39888b;
                            z zVar = this.f39889c;
                            s1.f d12 = s1.f.d(this.f39890d.h());
                            this.f39887a = 1;
                            if (qVar.invoke(zVar, d12, this) == d11) {
                                return d11;
                            }
                        } else if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        } else {
                            vz.r.b(obj);
                        }
                        return vz.b0.f54756a;
                    }
                }

                /* JADX INFO: Access modifiers changed from: package-private */
                @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$1$4", f = "TapGestureDetector.kt", l = {142}, m = "invokeSuspend")
                /* renamed from: n0.i0$f$a$a$d */
                /* loaded from: classes.dex */
                public static final class d extends kotlin.coroutines.jvm.internal.k implements h00.p<d2.c, zz.d<? super vz.b0>, Object> {

                    /* renamed from: b  reason: collision with root package name */
                    int f39891b;

                    /* renamed from: c  reason: collision with root package name */
                    private /* synthetic */ Object f39892c;

                    /* renamed from: d  reason: collision with root package name */
                    final /* synthetic */ z f39893d;

                    /* renamed from: e  reason: collision with root package name */
                    final /* synthetic */ h00.l<s1.f, vz.b0> f39894e;

                    /* renamed from: f  reason: collision with root package name */
                    final /* synthetic */ h00.l<s1.f, vz.b0> f39895f;

                    /* renamed from: g  reason: collision with root package name */
                    final /* synthetic */ l0<d2.u> f39896g;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    d(z zVar, h00.l<? super s1.f, vz.b0> lVar, h00.l<? super s1.f, vz.b0> lVar2, l0<d2.u> l0Var, zz.d<? super d> dVar) {
                        super(2, dVar);
                        this.f39893d = zVar;
                        this.f39894e = lVar;
                        this.f39895f = lVar2;
                        this.f39896g = l0Var;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
                        d dVar2 = new d(this.f39893d, this.f39894e, this.f39895f, this.f39896g, dVar);
                        dVar2.f39892c = obj;
                        return dVar2;
                    }

                    @Override // h00.p
                    /* renamed from: e */
                    public final Object invoke(d2.c cVar, zz.d<? super vz.b0> dVar) {
                        return ((d) create(cVar, dVar)).invokeSuspend(vz.b0.f54756a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        Object d11;
                        d11 = a00.d.d();
                        int i11 = this.f39891b;
                        if (i11 == 0) {
                            vz.r.b(obj);
                            this.f39891b = 1;
                            obj = i0.l((d2.c) this.f39892c, this);
                            if (obj == d11) {
                                return d11;
                            }
                        } else if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        } else {
                            vz.r.b(obj);
                        }
                        d2.u uVar = (d2.u) obj;
                        if (uVar != null) {
                            d2.n.f(uVar);
                            this.f39893d.h();
                            this.f39894e.invoke(s1.f.d(uVar.h()));
                            return vz.b0.f54756a;
                        }
                        this.f39893d.a();
                        h00.l<s1.f, vz.b0> lVar = this.f39895f;
                        if (lVar == null) {
                            return null;
                        }
                        lVar.invoke(s1.f.d(this.f39896g.f34916a.h()));
                        return vz.b0.f54756a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C0773a(z zVar, h00.q<? super y, ? super s1.f, ? super zz.d<? super vz.b0>, ? extends Object> qVar, o0 o0Var, h00.l<? super s1.f, vz.b0> lVar, h00.l<? super s1.f, vz.b0> lVar2, h00.l<? super s1.f, vz.b0> lVar3, zz.d<? super C0773a> dVar) {
                    super(2, dVar);
                    this.f39875h = zVar;
                    this.f39876i = qVar;
                    this.f39877j = o0Var;
                    this.f39878k = lVar;
                    this.f39879l = lVar2;
                    this.f39880m = lVar3;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
                    C0773a c0773a = new C0773a(this.f39875h, this.f39876i, this.f39877j, this.f39878k, this.f39879l, this.f39880m, dVar);
                    c0773a.f39874g = obj;
                    return c0773a;
                }

                @Override // h00.p
                /* renamed from: e */
                public final Object invoke(d2.c cVar, zz.d<? super vz.b0> dVar) {
                    return ((C0773a) create(cVar, dVar)).invokeSuspend(vz.b0.f54756a);
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:23:0x009e  */
                /* JADX WARN: Removed duplicated region for block: B:26:0x00b4  */
                /* JADX WARN: Removed duplicated region for block: B:27:0x00ba  */
                /* JADX WARN: Removed duplicated region for block: B:31:0x00df A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:32:0x00e0  */
                /* JADX WARN: Removed duplicated region for block: B:35:0x00e9 A[Catch: PointerEventTimeoutCancellationException -> 0x00fa, TryCatch #0 {PointerEventTimeoutCancellationException -> 0x00fa, blocks: (B:33:0x00e3, B:35:0x00e9, B:36:0x00ef), top: B:89:0x00e3 }] */
                /* JADX WARN: Removed duplicated region for block: B:36:0x00ef A[Catch: PointerEventTimeoutCancellationException -> 0x00fa, TRY_LEAVE, TryCatch #0 {PointerEventTimeoutCancellationException -> 0x00fa, blocks: (B:33:0x00e3, B:35:0x00e9, B:36:0x00ef), top: B:89:0x00e3 }] */
                /* JADX WARN: Removed duplicated region for block: B:42:0x0102  */
                /* JADX WARN: Removed duplicated region for block: B:45:0x0120 A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:49:0x012c  */
                /* JADX WARN: Removed duplicated region for block: B:61:0x0161  */
                /* JADX WARN: Removed duplicated region for block: B:65:0x0178  */
                /* JADX WARN: Removed duplicated region for block: B:75:0x01c1  */
                /* JADX WARN: Removed duplicated region for block: B:79:0x01d5  */
                /* JADX WARN: Removed duplicated region for block: B:82:0x01ef A[RETURN] */
                @Override // kotlin.coroutines.jvm.internal.a
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r21) {
                    /*
                        Method dump skipped, instructions count: 522
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: n0.i0.f.a.C0773a.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(z zVar, h00.q<? super y, ? super s1.f, ? super zz.d<? super vz.b0>, ? extends Object> qVar, o0 o0Var, h00.l<? super s1.f, vz.b0> lVar, h00.l<? super s1.f, vz.b0> lVar2, h00.l<? super s1.f, vz.b0> lVar3, zz.d<? super a> dVar) {
                super(2, dVar);
                this.f39863c = zVar;
                this.f39864d = qVar;
                this.f39865e = o0Var;
                this.f39866f = lVar;
                this.f39867g = lVar2;
                this.f39868h = lVar3;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
                a aVar = new a(this.f39863c, this.f39864d, this.f39865e, this.f39866f, this.f39867g, this.f39868h, dVar);
                aVar.f39862b = obj;
                return aVar;
            }

            @Override // h00.p
            public final Object invoke(d2.c0 c0Var, zz.d<? super vz.b0> dVar) {
                return ((a) create(c0Var, dVar)).invokeSuspend(vz.b0.f54756a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object d11;
                d11 = a00.d.d();
                int i11 = this.f39861a;
                if (i11 == 0) {
                    vz.r.b(obj);
                    C0773a c0773a = new C0773a(this.f39863c, this.f39864d, this.f39865e, this.f39866f, this.f39867g, this.f39868h, null);
                    this.f39861a = 1;
                    if (((d2.c0) this.f39862b).E(c0773a, this) == d11) {
                        return d11;
                    }
                } else if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    vz.r.b(obj);
                }
                return vz.b0.f54756a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(d2.c0 c0Var, h00.q<? super y, ? super s1.f, ? super zz.d<? super vz.b0>, ? extends Object> qVar, h00.l<? super s1.f, vz.b0> lVar, h00.l<? super s1.f, vz.b0> lVar2, h00.l<? super s1.f, vz.b0> lVar3, zz.d<? super f> dVar) {
            super(2, dVar);
            this.f39856c = c0Var;
            this.f39857d = qVar;
            this.f39858e = lVar;
            this.f39859f = lVar2;
            this.f39860g = lVar3;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
            f fVar = new f(this.f39856c, this.f39857d, this.f39858e, this.f39859f, this.f39860g, dVar);
            fVar.f39855b = obj;
            return fVar;
        }

        @Override // h00.p
        public final Object invoke(o0 o0Var, zz.d<? super vz.b0> dVar) {
            return ((f) create(o0Var, dVar)).invokeSuspend(vz.b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d11;
            d11 = a00.d.d();
            int i11 = this.f39854a;
            if (i11 == 0) {
                vz.r.b(obj);
                o0 o0Var = (o0) this.f39855b;
                z zVar = new z(this.f39856c);
                d2.c0 c0Var = this.f39856c;
                a aVar = new a(zVar, this.f39857d, o0Var, this.f39858e, this.f39859f, this.f39860g, null);
                this.f39854a = 1;
                if (q.d(c0Var, aVar, this) == d11) {
                    return d11;
                }
            } else if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                vz.r.b(obj);
            }
            return vz.b0.f54756a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt", f = "TapGestureDetector.kt", l = {263, 278}, m = "waitForUpOrCancellation")
    /* loaded from: classes.dex */
    public static final class g extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        Object f39897a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f39898b;

        /* renamed from: c  reason: collision with root package name */
        int f39899c;

        g(zz.d<? super g> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f39898b = obj;
            this.f39899c |= Integer.MIN_VALUE;
            return i0.l(null, this);
        }
    }

    public static final Object d(d2.c cVar, boolean z11, zz.d<? super d2.u> dVar) {
        return f(cVar, androidx.compose.ui.input.pointer.a.Main, z11, dVar);
    }

    public static /* synthetic */ Object e(d2.c cVar, boolean z11, zz.d dVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        return d(cVar, z11, dVar);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
        */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0077 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x004d -> B:18:0x0050). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object f(d2.c r9, androidx.compose.ui.input.pointer.a r10, boolean r11, zz.d<? super d2.u> r12) {
        /*
            boolean r0 = r12 instanceof n0.i0.b
            if (r0 == 0) goto L13
            r0 = r12
            n0.i0$b r0 = (n0.i0.b) r0
            int r1 = r0.f39825e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f39825e = r1
            goto L18
        L13:
            n0.i0$b r0 = new n0.i0$b
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f39824d
            java.lang.Object r1 = a00.b.d()
            int r2 = r0.f39825e
            r3 = 1
            if (r2 == 0) goto L3e
            if (r2 != r3) goto L36
            boolean r9 = r0.f39823c
            java.lang.Object r10 = r0.f39822b
            androidx.compose.ui.input.pointer.a r10 = (androidx.compose.ui.input.pointer.a) r10
            java.lang.Object r11 = r0.f39821a
            d2.c r11 = (d2.c) r11
            vz.r.b(r12)
            r8 = r11
            r11 = r9
            r9 = r8
            goto L50
        L36:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3e:
            vz.r.b(r12)
        L41:
            r0.f39821a = r9
            r0.f39822b = r10
            r0.f39823c = r11
            r0.f39825e = r3
            java.lang.Object r12 = r9.P(r10, r0)
            if (r12 != r1) goto L50
            return r1
        L50:
            d2.m r12 = (d2.m) r12
            java.util.List r2 = r12.b()
            int r4 = r2.size()
            r5 = 0
            r6 = r5
        L5c:
            if (r6 >= r4) goto L77
            int r7 = r6 + 1
            java.lang.Object r6 = r2.get(r6)
            d2.u r6 = (d2.u) r6
            if (r11 == 0) goto L6d
            boolean r6 = d2.n.a(r6)
            goto L71
        L6d:
            boolean r6 = d2.n.b(r6)
        L71:
            if (r6 != 0) goto L75
            r2 = r5
            goto L78
        L75:
            r6 = r7
            goto L5c
        L77:
            r2 = r3
        L78:
            if (r2 == 0) goto L41
            java.util.List r9 = r12.b()
            java.lang.Object r9 = r9.get(r5)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.i0.f(d2.c, androidx.compose.ui.input.pointer.a, boolean, zz.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object g(d2.c cVar, d2.u uVar, zz.d<? super d2.u> dVar) {
        return cVar.N(cVar.getViewConfiguration().a(), new c(uVar, null), dVar);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
        */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0052 A[LOOP:0: B:19:0x0050->B:20:0x0052, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007c A[EDGE_INSN: B:32:0x007c->B:27:0x007c ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0041 -> B:18:0x0044). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object h(d2.c r8, zz.d<? super vz.b0> r9) {
        /*
            boolean r0 = r9 instanceof n0.i0.d
            if (r0 == 0) goto L13
            r0 = r9
            n0.i0$d r0 = (n0.i0.d) r0
            int r1 = r0.f39832c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f39832c = r1
            goto L18
        L13:
            n0.i0$d r0 = new n0.i0$d
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f39831b
            java.lang.Object r1 = a00.b.d()
            int r2 = r0.f39832c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r8 = r0.f39830a
            d2.c r8 = (d2.c) r8
            vz.r.b(r9)
            goto L44
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L35:
            vz.r.b(r9)
        L38:
            r0.f39830a = r8
            r0.f39832c = r3
            r9 = 0
            java.lang.Object r9 = d2.c.a.a(r8, r9, r0, r3, r9)
            if (r9 != r1) goto L44
            return r1
        L44:
            d2.m r9 = (d2.m) r9
            java.util.List r2 = r9.b()
            int r4 = r2.size()
            r5 = 0
            r6 = r5
        L50:
            if (r6 >= r4) goto L5f
            int r7 = r6 + 1
            java.lang.Object r6 = r2.get(r6)
            d2.u r6 = (d2.u) r6
            d2.n.e(r6)
            r6 = r7
            goto L50
        L5f:
            java.util.List r9 = r9.b()
            int r2 = r9.size()
            r4 = r5
        L68:
            if (r4 >= r2) goto L7c
            int r6 = r4 + 1
            java.lang.Object r4 = r9.get(r4)
            d2.u r4 = (d2.u) r4
            boolean r4 = r4.i()
            if (r4 == 0) goto L7a
            r5 = r3
            goto L7c
        L7a:
            r4 = r6
            goto L68
        L7c:
            if (r5 != 0) goto L38
            vz.b0 r8 = vz.b0.f54756a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.i0.h(d2.c, zz.d):java.lang.Object");
    }

    public static final Object i(d2.c0 c0Var, h00.q<? super y, ? super s1.f, ? super zz.d<? super vz.b0>, ? extends Object> qVar, h00.l<? super s1.f, vz.b0> lVar, zz.d<? super vz.b0> dVar) {
        Object d11;
        Object d12 = q.d(c0Var, new e(new z(c0Var), qVar, lVar, null), dVar);
        d11 = a00.d.d();
        return d12 == d11 ? d12 : vz.b0.f54756a;
    }

    public static final Object j(d2.c0 c0Var, h00.l<? super s1.f, vz.b0> lVar, h00.l<? super s1.f, vz.b0> lVar2, h00.q<? super y, ? super s1.f, ? super zz.d<? super vz.b0>, ? extends Object> qVar, h00.l<? super s1.f, vz.b0> lVar3, zz.d<? super vz.b0> dVar) {
        Object d11;
        Object e11 = p0.e(new f(c0Var, qVar, lVar2, lVar, lVar3, null), dVar);
        d11 = a00.d.d();
        return e11 == d11 ? e11 : vz.b0.f54756a;
    }

    public static /* synthetic */ Object k(d2.c0 c0Var, h00.l lVar, h00.l lVar2, h00.q qVar, h00.l lVar3, zz.d dVar, int i11, Object obj) {
        h00.l lVar4 = (i11 & 1) != 0 ? null : lVar;
        h00.l lVar5 = (i11 & 2) != 0 ? null : lVar2;
        if ((i11 & 4) != 0) {
            qVar = f39819a;
        }
        return j(c0Var, lVar4, lVar5, qVar, (i11 & 8) != 0 ? null : lVar3, dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0052 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0072 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x00c1 -> B:48:0x00c4). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object l(d2.c r13, zz.d<? super d2.u> r14) {
        /*
            Method dump skipped, instructions count: 231
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.i0.l(d2.c, zz.d):java.lang.Object");
    }
}