package s0;

import c1.v1;
import ch.qos.logback.core.CoreConstants;
import v20.o0;
import vz.b0;

/* loaded from: classes.dex */
public final class w {

    /* loaded from: classes.dex */
    static final class a extends kotlin.jvm.internal.u implements h00.l<l2.v, b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f49915a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f49916b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ v1<k> f49917c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ q0.h f49918d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ o0 f49919e;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: s0.w$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C1094a extends kotlin.jvm.internal.u implements h00.l<Object, Integer> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ v1<k> f49920a;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: s0.w$a$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public /* synthetic */ class C1095a extends kotlin.jvm.internal.p implements h00.l<Integer, Object> {
                C1095a(Object obj) {
                    super(1, obj, k.class, "getKey", "getKey(I)Ljava/lang/Object;", 0);
                }

                public final Object d(int i11) {
                    return ((k) this.receiver).d(i11);
                }

                @Override // h00.l
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo12invoke(Integer num) {
                    return d(num.intValue());
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C1094a(v1<? extends k> v1Var) {
                super(1);
                this.f49920a = v1Var;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // h00.l
            /* renamed from: invoke */
            public final Integer mo12invoke(Object needle) {
                kotlin.jvm.internal.s.g(needle, "needle");
                C1095a c1095a = new C1095a(this.f49920a.getValue());
                int c11 = this.f49920a.getValue().c();
                int i11 = 0;
                while (i11 < c11) {
                    int i12 = i11 + 1;
                    if (kotlin.jvm.internal.s.c(c1095a.mo12invoke(Integer.valueOf(i11)), needle)) {
                        return Integer.valueOf(i11);
                    }
                    i11 = i12;
                }
                return -1;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public static final class b extends kotlin.jvm.internal.u implements h00.p<Float, Float, Boolean> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ boolean f49921a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ o0 f49922b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ q0.h f49923c;

            /* JADX INFO: Access modifiers changed from: package-private */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.lazy.list.LazySemanticsKt$lazyListSemantics$1$2$1", f = "LazySemantics.kt", l = {83}, m = "invokeSuspend")
            /* renamed from: s0.w$a$b$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C1096a extends kotlin.coroutines.jvm.internal.l implements h00.p<o0, zz.d<? super b0>, Object> {

                /* renamed from: a  reason: collision with root package name */
                int f49924a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ q0.h f49925b;

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ float f49926c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C1096a(q0.h hVar, float f11, zz.d<? super C1096a> dVar) {
                    super(2, dVar);
                    this.f49925b = hVar;
                    this.f49926c = f11;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final zz.d<b0> create(Object obj, zz.d<?> dVar) {
                    return new C1096a(this.f49925b, this.f49926c, dVar);
                }

                @Override // h00.p
                public final Object mo160invoke(o0 o0Var, zz.d<? super b0> dVar) {
                    return ((C1096a) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object d11;
                    d11 = a00.d.d();
                    int i11 = this.f49924a;
                    if (i11 == 0) {
                        vz.r.b(obj);
                        q0.h hVar = this.f49925b;
                        float f11 = this.f49926c;
                        this.f49924a = 1;
                        if (n0.b0.b(hVar, f11, null, this, 2, null) == d11) {
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

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(boolean z11, o0 o0Var, q0.h hVar) {
                super(2);
                this.f49921a = z11;
                this.f49922b = o0Var;
                this.f49923c = hVar;
            }

            public final Boolean a(float f11, float f12) {
                if (this.f49921a) {
                    f11 = f12;
                }
                v20.k.d(this.f49922b, null, null, new C1096a(this.f49923c, f11, null), 3, null);
                return Boolean.TRUE;
            }

            @Override // h00.p
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Boolean mo160invoke(Float f11, Float f12) {
                return a(f11.floatValue(), f12.floatValue());
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public static final class c extends kotlin.jvm.internal.u implements h00.l<Integer, Boolean> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ q0.h f49927a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ o0 f49928b;

            /* JADX INFO: Access modifiers changed from: package-private */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.lazy.list.LazySemanticsKt$lazyListSemantics$1$3$2", f = "LazySemantics.kt", l = {95}, m = "invokeSuspend")
            /* renamed from: s0.w$a$c$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C1097a extends kotlin.coroutines.jvm.internal.l implements h00.p<o0, zz.d<? super b0>, Object> {

                /* renamed from: a  reason: collision with root package name */
                int f49929a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ q0.h f49930b;

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ int f49931c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C1097a(q0.h hVar, int i11, zz.d<? super C1097a> dVar) {
                    super(2, dVar);
                    this.f49930b = hVar;
                    this.f49931c = i11;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final zz.d<b0> create(Object obj, zz.d<?> dVar) {
                    return new C1097a(this.f49930b, this.f49931c, dVar);
                }

                @Override // h00.p
                public final Object mo160invoke(o0 o0Var, zz.d<? super b0> dVar) {
                    return ((C1097a) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object d11;
                    d11 = a00.d.d();
                    int i11 = this.f49929a;
                    if (i11 == 0) {
                        vz.r.b(obj);
                        q0.h hVar = this.f49930b;
                        int i12 = this.f49931c;
                        this.f49929a = 1;
                        if (q0.h.s(hVar, i12, 0, this, 2, null) == d11) {
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

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(q0.h hVar, o0 o0Var) {
                super(1);
                this.f49927a = hVar;
                this.f49928b = o0Var;
            }

            public final Boolean a(int i11) {
                boolean z11 = i11 >= 0 && i11 < this.f49927a.l().d();
                q0.h hVar = this.f49927a;
                if (z11) {
                    v20.k.d(this.f49928b, null, null, new C1097a(hVar, i11, null), 3, null);
                    return Boolean.TRUE;
                }
                throw new IllegalArgumentException(("Can't scroll to index " + i11 + ", it is out of bounds [0, " + hVar.l().d() + CoreConstants.RIGHT_PARENTHESIS_CHAR).toString());
            }

            @Override // h00.l
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Boolean mo12invoke(Integer num) {
                return a(num.intValue());
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public static final class d extends kotlin.jvm.internal.u implements h00.a<Float> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ q0.h f49932a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(q0.h hVar) {
                super(0);
                this.f49932a = hVar;
            }

            @Override // h00.a
            /* renamed from: a */
            public final Float mo11invoke() {
                return Float.valueOf(this.f49932a.g() + (this.f49932a.i() / 100000.0f));
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public static final class e extends kotlin.jvm.internal.u implements h00.a<Float> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ q0.h f49933a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ v1<k> f49934b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            e(q0.h hVar, v1<? extends k> v1Var) {
                super(0);
                this.f49933a = hVar;
                this.f49934b = v1Var;
            }

            @Override // h00.a
            /* renamed from: a */
            public final Float mo11invoke() {
                float g11;
                float i11;
                if (this.f49933a.f()) {
                    g11 = this.f49934b.getValue().c();
                    i11 = 1.0f;
                } else {
                    g11 = this.f49933a.g();
                    i11 = this.f49933a.i() / 100000.0f;
                }
                return Float.valueOf(g11 + i11);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(boolean z11, boolean z12, v1<? extends k> v1Var, q0.h hVar, o0 o0Var) {
            super(1);
            this.f49915a = z11;
            this.f49916b = z12;
            this.f49917c = v1Var;
            this.f49918d = hVar;
            this.f49919e = o0Var;
        }

        @Override // h00.l
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ b0 mo12invoke(l2.v vVar) {
            invoke2(vVar);
            return b0.f54756a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(l2.v semantics) {
            kotlin.jvm.internal.s.g(semantics, "$this$semantics");
            l2.t.r(semantics, new C1094a(this.f49917c));
            l2.i iVar = new l2.i(new d(this.f49918d), new e(this.f49918d, this.f49917c), this.f49915a);
            if (this.f49916b) {
                l2.t.W(semantics, iVar);
            } else {
                l2.t.I(semantics, iVar);
            }
            l2.t.B(semantics, null, new b(this.f49916b, this.f49919e, this.f49918d), 1, null);
            l2.t.D(semantics, null, new c(this.f49918d, this.f49919e), 1, null);
            boolean z11 = this.f49916b;
            l2.t.E(semantics, new l2.b(z11 ? -1 : 1, z11 ? 1 : -1));
        }
    }

    public static final o1.f a(o1.f fVar, v1<? extends k> stateOfItemsProvider, q0.h state, o0 coroutineScope, boolean z11, boolean z12) {
        kotlin.jvm.internal.s.g(fVar, "<this>");
        kotlin.jvm.internal.s.g(stateOfItemsProvider, "stateOfItemsProvider");
        kotlin.jvm.internal.s.g(state, "state");
        kotlin.jvm.internal.s.g(coroutineScope, "coroutineScope");
        return l2.o.b(fVar, false, new a(z12, z11, stateOfItemsProvider, state, coroutineScope), 1, null);
    }
}