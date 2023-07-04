package kotlinx.coroutines.flow;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final /* synthetic */ class s {

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* loaded from: classes5.dex */
    public static final class a<R> implements kotlinx.coroutines.flow.e<R> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.e[] f35400a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h00.r f35401b;

        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1$2", f = "Zip.kt", l = {333, 333}, m = "invokeSuspend")
        /* renamed from: kotlinx.coroutines.flow.s$a$a  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0672a extends kotlin.coroutines.jvm.internal.l implements h00.q<f<? super R>, Object[], zz.d<? super vz.b0>, Object> {

            /* renamed from: a  reason: collision with root package name */
            int f35402a;

            /* renamed from: b  reason: collision with root package name */
            private /* synthetic */ Object f35403b;

            /* renamed from: c  reason: collision with root package name */
            /* synthetic */ Object f35404c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ h00.r f35405d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0672a(zz.d dVar, h00.r rVar) {
                super(3, dVar);
                this.f35405d = rVar;
            }

            @Override // h00.q
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object[] objArr, zz.d<? super vz.b0> dVar) {
                return invoke((f) ((f) obj), objArr, dVar);
            }

            public final Object invoke(f<? super R> fVar, Object[] objArr, zz.d<? super vz.b0> dVar) {
                C0672a c0672a = new C0672a(dVar, this.f35405d);
                c0672a.f35403b = fVar;
                c0672a.f35404c = objArr;
                return c0672a.invokeSuspend(vz.b0.f54756a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object d11;
                f fVar;
                d11 = a00.d.d();
                int i11 = this.f35402a;
                if (i11 == 0) {
                    vz.r.b(obj);
                    fVar = (f) this.f35403b;
                    Object[] objArr = (Object[]) this.f35404c;
                    h00.r rVar = this.f35405d;
                    Object obj2 = objArr[0];
                    Object obj3 = objArr[1];
                    Object obj4 = objArr[2];
                    this.f35403b = fVar;
                    this.f35402a = 1;
                    kotlin.jvm.internal.q.c(6);
                    obj = rVar.invoke(obj2, obj3, obj4, this);
                    kotlin.jvm.internal.q.c(7);
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
                    fVar = (f) this.f35403b;
                    vz.r.b(obj);
                }
                this.f35403b = null;
                this.f35402a = 2;
                if (fVar.emit(obj, this) == d11) {
                    return d11;
                }
                return vz.b0.f54756a;
            }
        }

        public a(kotlinx.coroutines.flow.e[] eVarArr, h00.r rVar) {
            this.f35400a = eVarArr;
            this.f35401b = rVar;
        }

        @Override // kotlinx.coroutines.flow.e
        public Object collect(f fVar, zz.d dVar) {
            Object d11;
            Object a11 = y20.i.a(fVar, this.f35400a, s.a(), new C0672a(null, this.f35401b), dVar);
            d11 = a00.d.d();
            return a11 == d11 ? a11 : vz.b0.f54756a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* loaded from: classes5.dex */
    public static final class b<R> implements kotlinx.coroutines.flow.e<R> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.e[] f35406a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h00.s f35407b;

        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$2$2", f = "Zip.kt", l = {333, 333}, m = "invokeSuspend")
        /* loaded from: classes5.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements h00.q<f<? super R>, Object[], zz.d<? super vz.b0>, Object> {

            /* renamed from: a  reason: collision with root package name */
            int f35408a;

            /* renamed from: b  reason: collision with root package name */
            private /* synthetic */ Object f35409b;

            /* renamed from: c  reason: collision with root package name */
            /* synthetic */ Object f35410c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ h00.s f35411d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(zz.d dVar, h00.s sVar) {
                super(3, dVar);
                this.f35411d = sVar;
            }

            @Override // h00.q
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object[] objArr, zz.d<? super vz.b0> dVar) {
                return invoke((f) ((f) obj), objArr, dVar);
            }

            public final Object invoke(f<? super R> fVar, Object[] objArr, zz.d<? super vz.b0> dVar) {
                a aVar = new a(dVar, this.f35411d);
                aVar.f35409b = fVar;
                aVar.f35410c = objArr;
                return aVar.invokeSuspend(vz.b0.f54756a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object d11;
                f fVar;
                d11 = a00.d.d();
                int i11 = this.f35408a;
                if (i11 == 0) {
                    vz.r.b(obj);
                    fVar = (f) this.f35409b;
                    Object[] objArr = (Object[]) this.f35410c;
                    h00.s sVar = this.f35411d;
                    Object obj2 = objArr[0];
                    Object obj3 = objArr[1];
                    Object obj4 = objArr[2];
                    Object obj5 = objArr[3];
                    this.f35409b = fVar;
                    this.f35408a = 1;
                    kotlin.jvm.internal.q.c(6);
                    obj = sVar.invoke(obj2, obj3, obj4, obj5, this);
                    kotlin.jvm.internal.q.c(7);
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
                    fVar = (f) this.f35409b;
                    vz.r.b(obj);
                }
                this.f35409b = null;
                this.f35408a = 2;
                if (fVar.emit(obj, this) == d11) {
                    return d11;
                }
                return vz.b0.f54756a;
            }
        }

        public b(kotlinx.coroutines.flow.e[] eVarArr, h00.s sVar) {
            this.f35406a = eVarArr;
            this.f35407b = sVar;
        }

        @Override // kotlinx.coroutines.flow.e
        public Object collect(f fVar, zz.d dVar) {
            Object d11;
            Object a11 = y20.i.a(fVar, this.f35406a, s.a(), new a(null, this.f35407b), dVar);
            d11 = a00.d.d();
            return a11 == d11 ? a11 : vz.b0.f54756a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* loaded from: classes5.dex */
    public static final class c<R> implements kotlinx.coroutines.flow.e<R> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.e f35412a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.e f35413b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h00.q f35414c;

        public c(kotlinx.coroutines.flow.e eVar, kotlinx.coroutines.flow.e eVar2, h00.q qVar) {
            this.f35412a = eVar;
            this.f35413b = eVar2;
            this.f35414c = qVar;
        }

        @Override // kotlinx.coroutines.flow.e
        public Object collect(f<? super R> fVar, zz.d<? super vz.b0> dVar) {
            Object d11;
            Object a11 = y20.i.a(fVar, new kotlinx.coroutines.flow.e[]{this.f35412a, this.f35413b}, s.a(), new d(this.f35414c, null), dVar);
            d11 = a00.d.d();
            return a11 == d11 ? a11 : vz.b0.f54756a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$1$1", f = "Zip.kt", l = {33, 33}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    static final class d<R> extends kotlin.coroutines.jvm.internal.l implements h00.q<f<? super R>, Object[], zz.d<? super vz.b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f35415a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f35416b;

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ Object f35417c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ h00.q<T1, T2, zz.d<? super R>, Object> f35418d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(h00.q<? super T1, ? super T2, ? super zz.d<? super R>, ? extends Object> qVar, zz.d<? super d> dVar) {
            super(3, dVar);
            this.f35418d = qVar;
        }

        @Override // h00.q
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object[] objArr, zz.d<? super vz.b0> dVar) {
            return invoke((f) ((f) obj), objArr, dVar);
        }

        public final Object invoke(f<? super R> fVar, Object[] objArr, zz.d<? super vz.b0> dVar) {
            d dVar2 = new d(this.f35418d, dVar);
            dVar2.f35416b = fVar;
            dVar2.f35417c = objArr;
            return dVar2.invokeSuspend(vz.b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d11;
            f fVar;
            d11 = a00.d.d();
            int i11 = this.f35415a;
            if (i11 == 0) {
                vz.r.b(obj);
                fVar = (f) this.f35416b;
                Object[] objArr = (Object[]) this.f35417c;
                h00.q<T1, T2, zz.d<? super R>, Object> qVar = this.f35418d;
                Object obj2 = objArr[0];
                Object obj3 = objArr[1];
                this.f35416b = fVar;
                this.f35415a = 1;
                obj = qVar.invoke(obj2, obj3, this);
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
                fVar = (f) this.f35416b;
                vz.r.b(obj);
            }
            this.f35416b = null;
            this.f35415a = 2;
            if (fVar.emit(obj, this) == d11) {
                return d11;
            }
            return vz.b0.f54756a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class e extends kotlin.jvm.internal.u implements h00.a {

        /* renamed from: a  reason: collision with root package name */
        public static final e f35419a = new e();

        e() {
            super(0);
        }

        @Override // h00.a
        /* renamed from: a */
        public final Void invoke() {
            return null;
        }
    }

    public static final /* synthetic */ h00.a a() {
        return f();
    }

    public static final <T1, T2, R> kotlinx.coroutines.flow.e<R> b(kotlinx.coroutines.flow.e<? extends T1> eVar, kotlinx.coroutines.flow.e<? extends T2> eVar2, h00.q<? super T1, ? super T2, ? super zz.d<? super R>, ? extends Object> qVar) {
        return g.w(eVar, eVar2, qVar);
    }

    public static final <T1, T2, T3, R> kotlinx.coroutines.flow.e<R> c(kotlinx.coroutines.flow.e<? extends T1> eVar, kotlinx.coroutines.flow.e<? extends T2> eVar2, kotlinx.coroutines.flow.e<? extends T3> eVar3, h00.r<? super T1, ? super T2, ? super T3, ? super zz.d<? super R>, ? extends Object> rVar) {
        return new a(new kotlinx.coroutines.flow.e[]{eVar, eVar2, eVar3}, rVar);
    }

    public static final <T1, T2, T3, T4, R> kotlinx.coroutines.flow.e<R> d(kotlinx.coroutines.flow.e<? extends T1> eVar, kotlinx.coroutines.flow.e<? extends T2> eVar2, kotlinx.coroutines.flow.e<? extends T3> eVar3, kotlinx.coroutines.flow.e<? extends T4> eVar4, h00.s<? super T1, ? super T2, ? super T3, ? super T4, ? super zz.d<? super R>, ? extends Object> sVar) {
        return new b(new kotlinx.coroutines.flow.e[]{eVar, eVar2, eVar3, eVar4}, sVar);
    }

    public static final <T1, T2, R> kotlinx.coroutines.flow.e<R> e(kotlinx.coroutines.flow.e<? extends T1> eVar, kotlinx.coroutines.flow.e<? extends T2> eVar2, h00.q<? super T1, ? super T2, ? super zz.d<? super R>, ? extends Object> qVar) {
        return new c(eVar, eVar2, qVar);
    }

    private static final <T> h00.a<T[]> f() {
        return e.f35419a;
    }
}