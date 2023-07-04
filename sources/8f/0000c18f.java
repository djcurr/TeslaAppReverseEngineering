package y20;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.l0;
import v20.a2;
import v20.o0;
import v20.p0;
import v20.r0;
import vz.b0;

/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: T
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:83)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:61)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:55)
    */
/* loaded from: classes5.dex */
public final class h<T, R> extends f<T, R> {

    /* renamed from: e  reason: collision with root package name */
    private final h00.q<kotlinx.coroutines.flow.f<? super R>, T, zz.d<? super b0>, Object> f59010e;

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3", f = "Merge.kt", l = {27}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements h00.p<o0, zz.d<? super b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f59011a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f59012b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h<T, R> f59013c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.f<R> f59014d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: y20.h$a$a  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C1340a<T> implements kotlinx.coroutines.flow.f {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ l0<a2> f59015a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ o0 f59016b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ h<T, R> f59017c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.flow.f<R> f59018d;

            /* JADX INFO: Access modifiers changed from: package-private */
            @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$2", f = "Merge.kt", l = {34}, m = "invokeSuspend")
            /* renamed from: y20.h$a$a$a  reason: collision with other inner class name */
            /* loaded from: classes5.dex */
            public static final class C1341a extends kotlin.coroutines.jvm.internal.l implements h00.p<o0, zz.d<? super b0>, Object> {

                /* renamed from: a  reason: collision with root package name */
                int f59019a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ h<T, R> f59020b;

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ kotlinx.coroutines.flow.f<R> f59021c;

                /* renamed from: d  reason: collision with root package name */
                final /* synthetic */ T f59022d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C1341a(h<T, R> hVar, kotlinx.coroutines.flow.f<? super R> fVar, T t11, zz.d<? super C1341a> dVar) {
                    super(2, dVar);
                    this.f59020b = hVar;
                    this.f59021c = fVar;
                    this.f59022d = t11;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final zz.d<b0> create(Object obj, zz.d<?> dVar) {
                    return new C1341a(this.f59020b, this.f59021c, this.f59022d, dVar);
                }

                @Override // h00.p
                public /* bridge */ /* synthetic */ Object invoke(o0 o0Var, zz.d<? super b0> dVar) {
                    return invoke2(o0Var, dVar);
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final Object invoke2(o0 o0Var, zz.d<? super b0> dVar) {
                    return ((C1341a) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object d11;
                    d11 = a00.d.d();
                    int i11 = this.f59019a;
                    if (i11 == 0) {
                        vz.r.b(obj);
                        h00.q qVar = ((h) this.f59020b).f59010e;
                        kotlinx.coroutines.flow.f<R> fVar = this.f59021c;
                        T t11 = this.f59022d;
                        this.f59019a = 1;
                        if (qVar.invoke(fVar, t11, this) == d11) {
                            return d11;
                        }
                    } else if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        vz.r.b(obj);
                    }
                    return b0.f54756a;
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1", f = "Merge.kt", l = {30}, m = "emit")
            /* renamed from: y20.h$a$a$b */
            /* loaded from: classes5.dex */
            public static final class b extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: a  reason: collision with root package name */
                Object f59023a;

                /* renamed from: b  reason: collision with root package name */
                Object f59024b;

                /* renamed from: c  reason: collision with root package name */
                Object f59025c;

                /* renamed from: d  reason: collision with root package name */
                /* synthetic */ Object f59026d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ C1340a<T> f59027e;

                /* renamed from: f  reason: collision with root package name */
                int f59028f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                b(C1340a<? super T> c1340a, zz.d<? super b> dVar) {
                    super(dVar);
                    this.f59027e = c1340a;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f59026d = obj;
                    this.f59028f |= Integer.MIN_VALUE;
                    return this.f59027e.emit(null, this);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            C1340a(l0<a2> l0Var, o0 o0Var, h<T, R> hVar, kotlinx.coroutines.flow.f<? super R> fVar) {
                this.f59015a = l0Var;
                this.f59016b = o0Var;
                this.f59017c = hVar;
                this.f59018d = fVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
            @Override // kotlinx.coroutines.flow.f
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object emit(T r8, zz.d<? super vz.b0> r9) {
                /*
                    r7 = this;
                    boolean r0 = r9 instanceof y20.h.a.C1340a.b
                    if (r0 == 0) goto L13
                    r0 = r9
                    y20.h$a$a$b r0 = (y20.h.a.C1340a.b) r0
                    int r1 = r0.f59028f
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f59028f = r1
                    goto L18
                L13:
                    y20.h$a$a$b r0 = new y20.h$a$a$b
                    r0.<init>(r7, r9)
                L18:
                    java.lang.Object r9 = r0.f59026d
                    java.lang.Object r1 = a00.b.d()
                    int r2 = r0.f59028f
                    r3 = 1
                    if (r2 == 0) goto L3b
                    if (r2 != r3) goto L33
                    java.lang.Object r8 = r0.f59025c
                    v20.a2 r8 = (v20.a2) r8
                    java.lang.Object r8 = r0.f59024b
                    java.lang.Object r0 = r0.f59023a
                    y20.h$a$a r0 = (y20.h.a.C1340a) r0
                    vz.r.b(r9)
                    goto L5f
                L33:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r9)
                    throw r8
                L3b:
                    vz.r.b(r9)
                    kotlin.jvm.internal.l0<v20.a2> r9 = r7.f59015a
                    T r9 = r9.f34916a
                    v20.a2 r9 = (v20.a2) r9
                    if (r9 != 0) goto L48
                L46:
                    r0 = r7
                    goto L5f
                L48:
                    kotlinx.coroutines.flow.internal.ChildCancelledException r2 = new kotlinx.coroutines.flow.internal.ChildCancelledException
                    r2.<init>()
                    r9.j(r2)
                    r0.f59023a = r7
                    r0.f59024b = r8
                    r0.f59025c = r9
                    r0.f59028f = r3
                    java.lang.Object r9 = r9.D(r0)
                    if (r9 != r1) goto L46
                    return r1
                L5f:
                    kotlin.jvm.internal.l0<v20.a2> r9 = r0.f59015a
                    v20.o0 r1 = r0.f59016b
                    r2 = 0
                    kotlinx.coroutines.a r3 = kotlinx.coroutines.a.UNDISPATCHED
                    y20.h$a$a$a r4 = new y20.h$a$a$a
                    y20.h<T, R> r5 = r0.f59017c
                    kotlinx.coroutines.flow.f<R> r0 = r0.f59018d
                    r6 = 0
                    r4.<init>(r5, r0, r8, r6)
                    r5 = 1
                    v20.a2 r8 = v20.i.d(r1, r2, r3, r4, r5, r6)
                    r9.f34916a = r8
                    vz.b0 r8 = vz.b0.f54756a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: y20.h.a.C1340a.emit(java.lang.Object, zz.d):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(h<T, R> hVar, kotlinx.coroutines.flow.f<? super R> fVar, zz.d<? super a> dVar) {
            super(2, dVar);
            this.f59013c = hVar;
            this.f59014d = fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<b0> create(Object obj, zz.d<?> dVar) {
            a aVar = new a(this.f59013c, this.f59014d, dVar);
            aVar.f59012b = obj;
            return aVar;
        }

        @Override // h00.p
        public /* bridge */ /* synthetic */ Object invoke(o0 o0Var, zz.d<? super b0> dVar) {
            return invoke2(o0Var, dVar);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Object invoke2(o0 o0Var, zz.d<? super b0> dVar) {
            return ((a) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d11;
            d11 = a00.d.d();
            int i11 = this.f59011a;
            if (i11 == 0) {
                vz.r.b(obj);
                l0 l0Var = new l0();
                h<T, R> hVar = this.f59013c;
                kotlinx.coroutines.flow.e<S> eVar = hVar.f59006d;
                C1340a c1340a = new C1340a(l0Var, (o0) this.f59012b, hVar, this.f59014d);
                this.f59011a = 1;
                if (eVar.collect(c1340a, this) == d11) {
                    return d11;
                }
            } else if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                vz.r.b(obj);
            }
            return b0.f54756a;
        }
    }

    public /* synthetic */ h(h00.q qVar, kotlinx.coroutines.flow.e eVar, zz.g gVar, int i11, kotlinx.coroutines.channels.a aVar, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(qVar, eVar, (i12 & 4) != 0 ? zz.h.f61280a : gVar, (i12 & 8) != 0 ? -2 : i11, (i12 & 16) != 0 ? kotlinx.coroutines.channels.a.SUSPEND : aVar);
    }

    @Override // y20.d
    protected d<R> h(zz.g gVar, int i11, kotlinx.coroutines.channels.a aVar) {
        return new h(this.f59010e, this.f59006d, gVar, i11, aVar);
    }

    @Override // y20.f
    protected Object p(kotlinx.coroutines.flow.f<? super R> fVar, zz.d<? super b0> dVar) {
        Object d11;
        if (!r0.a() || (fVar instanceof u)) {
            Object e11 = p0.e(new a(this, fVar, null), dVar);
            d11 = a00.d.d();
            return e11 == d11 ? e11 : b0.f54756a;
        }
        throw new AssertionError();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public h(h00.q<? super kotlinx.coroutines.flow.f<? super R>, ? super T, ? super zz.d<? super b0>, ? extends Object> qVar, kotlinx.coroutines.flow.e<? extends T> eVar, zz.g gVar, int i11, kotlinx.coroutines.channels.a aVar) {
        super(eVar, gVar, i11, aVar);
        this.f59010e = qVar;
    }
}