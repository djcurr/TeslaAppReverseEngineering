package kotlinx.coroutines.flow;

import v20.a2;
import v20.d2;
import v20.o0;

/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: T
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:83)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:61)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:55)
    */
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final /* synthetic */ class q {

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1", f = "Share.kt", l = {214, 218, 219, 225}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.l implements h00.p<o0, zz.d<? super vz.b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f35366a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e0 f35367b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ e<T> f35368c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ t<T> f35369d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ T f35370e;

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1", f = "Share.kt", l = {}, m = "invokeSuspend")
        /* renamed from: kotlinx.coroutines.flow.q$a$a  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0667a extends kotlin.coroutines.jvm.internal.l implements h00.p<Integer, zz.d<? super Boolean>, Object> {

            /* renamed from: a  reason: collision with root package name */
            int f35371a;

            /* renamed from: b  reason: collision with root package name */
            /* synthetic */ int f35372b;

            C0667a(zz.d<? super C0667a> dVar) {
                super(2, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
                C0667a c0667a = new C0667a(dVar);
                c0667a.f35372b = ((Number) obj).intValue();
                return c0667a;
            }

            public final Object e(int i11, zz.d<? super Boolean> dVar) {
                return ((C0667a) create(Integer.valueOf(i11), dVar)).invokeSuspend(vz.b0.f54756a);
            }

            @Override // h00.p
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo160invoke(Integer num, zz.d<? super Boolean> dVar) {
                return e(num.intValue(), dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                a00.d.d();
                if (this.f35371a == 0) {
                    vz.r.b(obj);
                    return kotlin.coroutines.jvm.internal.b.a(this.f35372b > 0);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2", f = "Share.kt", l = {227}, m = "invokeSuspend")
        /* loaded from: classes5.dex */
        public static final class b extends kotlin.coroutines.jvm.internal.l implements h00.p<c0, zz.d<? super vz.b0>, Object> {

            /* renamed from: a  reason: collision with root package name */
            int f35373a;

            /* renamed from: b  reason: collision with root package name */
            /* synthetic */ Object f35374b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ e<T> f35375c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ t<T> f35376d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ T f35377e;

            /* renamed from: kotlinx.coroutines.flow.q$a$b$a  reason: collision with other inner class name */
            /* loaded from: classes5.dex */
            public /* synthetic */ class C0668a {

                /* renamed from: a  reason: collision with root package name */
                public static final /* synthetic */ int[] f35378a;

                static {
                    int[] iArr = new int[c0.values().length];
                    iArr[c0.START.ordinal()] = 1;
                    iArr[c0.STOP.ordinal()] = 2;
                    iArr[c0.STOP_AND_RESET_REPLAY_CACHE.ordinal()] = 3;
                    f35378a = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            b(e<? extends T> eVar, t<T> tVar, T t11, zz.d<? super b> dVar) {
                super(2, dVar);
                this.f35375c = eVar;
                this.f35376d = tVar;
                this.f35377e = t11;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
                b bVar = new b(this.f35375c, this.f35376d, this.f35377e, dVar);
                bVar.f35374b = obj;
                return bVar;
            }

            public final Object e(c0 c0Var, zz.d<? super vz.b0> dVar) {
                return ((b) create(c0Var, dVar)).invokeSuspend(vz.b0.f54756a);
            }

            @Override // h00.p
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo160invoke(c0 c0Var, zz.d<? super vz.b0> dVar) {
                return e(c0Var, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object d11;
                d11 = a00.d.d();
                int i11 = this.f35373a;
                if (i11 == 0) {
                    vz.r.b(obj);
                    int i12 = C0668a.f35378a[((c0) this.f35374b).ordinal()];
                    if (i12 == 1) {
                        e<T> eVar = this.f35375c;
                        f fVar = this.f35376d;
                        this.f35373a = 1;
                        if (eVar.collect(fVar, this) == d11) {
                            return d11;
                        }
                    } else if (i12 == 3) {
                        T t11 = this.f35377e;
                        if (t11 == a0.f35234a) {
                            this.f35376d.d();
                        } else {
                            this.f35376d.b(t11);
                        }
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
        a(e0 e0Var, e<? extends T> eVar, t<T> tVar, T t11, zz.d<? super a> dVar) {
            super(2, dVar);
            this.f35367b = e0Var;
            this.f35368c = eVar;
            this.f35369d = tVar;
            this.f35370e = t11;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
            return new a(this.f35367b, this.f35368c, this.f35369d, this.f35370e, dVar);
        }

        @Override // h00.p
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo160invoke(o0 o0Var, zz.d<? super vz.b0> dVar) {
            return invoke2(o0Var, dVar);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Object invoke2(o0 o0Var, zz.d<? super vz.b0> dVar) {
            return ((a) create(o0Var, dVar)).invokeSuspend(vz.b0.f54756a);
        }

        /* JADX WARN: Removed duplicated region for block: B:25:0x0068 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = a00.b.d()
                int r1 = r7.f35366a
                r2 = 4
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L25
                if (r1 == r5) goto L21
                if (r1 == r4) goto L1d
                if (r1 == r3) goto L21
                if (r1 != r2) goto L15
                goto L21
            L15:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1d:
                vz.r.b(r8)
                goto L5c
            L21:
                vz.r.b(r8)
                goto L8d
            L25:
                vz.r.b(r8)
                kotlinx.coroutines.flow.e0 r8 = r7.f35367b
                kotlinx.coroutines.flow.e0$a r1 = kotlinx.coroutines.flow.e0.f35254a
                kotlinx.coroutines.flow.e0 r6 = r1.a()
                if (r8 != r6) goto L3f
                kotlinx.coroutines.flow.e<T> r8 = r7.f35368c
                kotlinx.coroutines.flow.t<T> r1 = r7.f35369d
                r7.f35366a = r5
                java.lang.Object r8 = r8.collect(r1, r7)
                if (r8 != r0) goto L8d
                return r0
            L3f:
                kotlinx.coroutines.flow.e0 r8 = r7.f35367b
                kotlinx.coroutines.flow.e0 r1 = r1.b()
                r5 = 0
                if (r8 != r1) goto L69
                kotlinx.coroutines.flow.t<T> r8 = r7.f35369d
                kotlinx.coroutines.flow.h0 r8 = r8.c()
                kotlinx.coroutines.flow.q$a$a r1 = new kotlinx.coroutines.flow.q$a$a
                r1.<init>(r5)
                r7.f35366a = r4
                java.lang.Object r8 = kotlinx.coroutines.flow.g.q(r8, r1, r7)
                if (r8 != r0) goto L5c
                return r0
            L5c:
                kotlinx.coroutines.flow.e<T> r8 = r7.f35368c
                kotlinx.coroutines.flow.t<T> r1 = r7.f35369d
                r7.f35366a = r3
                java.lang.Object r8 = r8.collect(r1, r7)
                if (r8 != r0) goto L8d
                return r0
            L69:
                kotlinx.coroutines.flow.e0 r8 = r7.f35367b
                kotlinx.coroutines.flow.t<T> r1 = r7.f35369d
                kotlinx.coroutines.flow.h0 r1 = r1.c()
                kotlinx.coroutines.flow.e r8 = r8.a(r1)
                kotlinx.coroutines.flow.e r8 = kotlinx.coroutines.flow.g.k(r8)
                kotlinx.coroutines.flow.q$a$b r1 = new kotlinx.coroutines.flow.q$a$b
                kotlinx.coroutines.flow.e<T> r3 = r7.f35368c
                kotlinx.coroutines.flow.t<T> r4 = r7.f35369d
                T r6 = r7.f35370e
                r1.<init>(r3, r4, r6, r5)
                r7.f35366a = r2
                java.lang.Object r8 = kotlinx.coroutines.flow.g.g(r8, r1, r7)
                if (r8 != r0) goto L8d
                return r0
            L8d:
                vz.b0 r8 = vz.b0.f54756a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.q.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharingDeferred$1", f = "Share.kt", l = {340}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.l implements h00.p<o0, zz.d<? super vz.b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f35379a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f35380b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ e<T> f35381c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ v20.x<h0<T>> f35382d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class a<T> implements f {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ kotlin.jvm.internal.l0<u<T>> f35383a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ o0 f35384b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ v20.x<h0<T>> f35385c;

            a(kotlin.jvm.internal.l0<u<T>> l0Var, o0 o0Var, v20.x<h0<T>> xVar) {
                this.f35383a = l0Var;
                this.f35384b = o0Var;
                this.f35385c = xVar;
            }

            /* JADX WARN: Type inference failed for: r4v2, types: [kotlinx.coroutines.flow.u, T, kotlinx.coroutines.flow.h0] */
            @Override // kotlinx.coroutines.flow.f
            public final Object emit(T t11, zz.d<? super vz.b0> dVar) {
                vz.b0 b0Var;
                u<T> uVar = this.f35383a.f34916a;
                if (uVar == null) {
                    b0Var = null;
                } else {
                    uVar.setValue(t11);
                    b0Var = vz.b0.f54756a;
                }
                if (b0Var == null) {
                    o0 o0Var = this.f35384b;
                    kotlin.jvm.internal.l0<u<T>> l0Var = this.f35383a;
                    v20.x<h0<T>> xVar = this.f35385c;
                    ?? r42 = (T) j0.a(t11);
                    xVar.complete(new w(r42, d2.n(o0Var.J())));
                    l0Var.f34916a = r42;
                }
                return vz.b0.f54756a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(e<? extends T> eVar, v20.x<h0<T>> xVar, zz.d<? super b> dVar) {
            super(2, dVar);
            this.f35381c = eVar;
            this.f35382d = xVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
            b bVar = new b(this.f35381c, this.f35382d, dVar);
            bVar.f35380b = obj;
            return bVar;
        }

        @Override // h00.p
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo160invoke(o0 o0Var, zz.d<? super vz.b0> dVar) {
            return invoke2(o0Var, dVar);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Object invoke2(o0 o0Var, zz.d<? super vz.b0> dVar) {
            return ((b) create(o0Var, dVar)).invokeSuspend(vz.b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d11;
            d11 = a00.d.d();
            int i11 = this.f35379a;
            try {
                if (i11 == 0) {
                    vz.r.b(obj);
                    o0 o0Var = (o0) this.f35380b;
                    kotlin.jvm.internal.l0 l0Var = new kotlin.jvm.internal.l0();
                    e<T> eVar = this.f35381c;
                    a aVar = new a(l0Var, o0Var, this.f35382d);
                    this.f35379a = 1;
                    if (eVar.collect(aVar, this) == d11) {
                        return d11;
                    }
                } else if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    vz.r.b(obj);
                }
                return vz.b0.f54756a;
            } catch (Throwable th2) {
                this.f35382d.g(th2);
                throw th2;
            }
        }
    }

    public static final <T> y<T> a(t<T> tVar) {
        return new v(tVar, null);
    }

    public static final <T> h0<T> b(u<T> uVar) {
        return new w(uVar, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0047, code lost:
        if (r9 == 0) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final <T> kotlinx.coroutines.flow.d0<T> c(kotlinx.coroutines.flow.e<? extends T> r8, int r9) {
        /*
            boolean r0 = v20.r0.a()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L16
            if (r9 < 0) goto Lc
            r0 = r1
            goto Ld
        Lc:
            r0 = r2
        Ld:
            if (r0 == 0) goto L10
            goto L16
        L10:
            java.lang.AssertionError r8 = new java.lang.AssertionError
            r8.<init>()
            throw r8
        L16:
            x20.e$a r0 = x20.e.f57005f3
            int r0 = r0.a()
            int r0 = m00.j.d(r9, r0)
            int r0 = r0 - r9
            boolean r3 = r8 instanceof y20.d
            if (r3 == 0) goto L53
            r3 = r8
            y20.d r3 = (y20.d) r3
            kotlinx.coroutines.flow.e r4 = r3.i()
            if (r4 == 0) goto L53
            kotlinx.coroutines.flow.d0 r8 = new kotlinx.coroutines.flow.d0
            int r5 = r3.f58997b
            r6 = -3
            if (r5 == r6) goto L3c
            r6 = -2
            if (r5 == r6) goto L3c
            if (r5 == 0) goto L3c
            r1 = r5
            goto L4b
        L3c:
            kotlinx.coroutines.channels.a r6 = r3.f58998c
            kotlinx.coroutines.channels.a r7 = kotlinx.coroutines.channels.a.SUSPEND
            if (r6 != r7) goto L47
            if (r5 != 0) goto L45
            goto L4a
        L45:
            r1 = r0
            goto L4b
        L47:
            if (r9 != 0) goto L4a
            goto L4b
        L4a:
            r1 = r2
        L4b:
            kotlinx.coroutines.channels.a r9 = r3.f58998c
            zz.g r0 = r3.f58996a
            r8.<init>(r4, r1, r9, r0)
            return r8
        L53:
            kotlinx.coroutines.flow.d0 r9 = new kotlinx.coroutines.flow.d0
            kotlinx.coroutines.channels.a r1 = kotlinx.coroutines.channels.a.SUSPEND
            zz.h r2 = zz.h.f61280a
            r9.<init>(r8, r0, r1, r2)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.q.c(kotlinx.coroutines.flow.e, int):kotlinx.coroutines.flow.d0");
    }

    private static final <T> a2 d(o0 o0Var, zz.g gVar, e<? extends T> eVar, t<T> tVar, e0 e0Var, T t11) {
        return v20.i.c(o0Var, gVar, kotlin.jvm.internal.s.c(e0Var, e0.f35254a.a()) ? kotlinx.coroutines.a.DEFAULT : kotlinx.coroutines.a.UNDISPATCHED, new a(e0Var, eVar, tVar, t11, null));
    }

    private static final <T> void e(o0 o0Var, zz.g gVar, e<? extends T> eVar, v20.x<h0<T>> xVar) {
        v20.k.d(o0Var, gVar, null, new b(eVar, xVar, null), 2, null);
    }

    public static final <T> Object f(e<? extends T> eVar, o0 o0Var, zz.d<? super h0<? extends T>> dVar) {
        d0 c11 = c(eVar, 1);
        v20.x b11 = v20.z.b(null, 1, null);
        e(o0Var, c11.f35253b, c11.f35252a, b11);
        return b11.u0(dVar);
    }

    public static final <T> h0<T> g(e<? extends T> eVar, o0 o0Var, e0 e0Var, T t11) {
        d0 c11 = c(eVar, 1);
        u a11 = j0.a(t11);
        return new w(a11, d(o0Var, c11.f35253b, c11.f35252a, a11, e0Var, t11));
    }
}