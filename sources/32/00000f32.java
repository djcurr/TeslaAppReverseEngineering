package c1;

import java.util.Set;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final /* synthetic */ class q1 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [R] */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$collectAsState$1", f = "SnapshotFlow.kt", l = {CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA384, 66}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a<R> extends kotlin.coroutines.jvm.internal.l implements h00.p<u0<R>, zz.d<? super vz.b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f8654a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f8655b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ zz.g f8656c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.e<T> f8657d;

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$collectAsState$1$2", f = "SnapshotFlow.kt", l = {CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA384}, m = "invokeSuspend")
        /* renamed from: c1.q1$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0165a extends kotlin.coroutines.jvm.internal.l implements h00.p<v20.o0, zz.d<? super vz.b0>, Object> {

            /* renamed from: a  reason: collision with root package name */
            int f8658a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.flow.e<T> f8659b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ u0<R> f8660c;

            /* JADX INFO: Add missing generic type declarations: [T] */
            /* renamed from: c1.q1$a$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0166a<T> implements kotlinx.coroutines.flow.f<T> {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ u0 f8661a;

                public C0166a(u0 u0Var) {
                    this.f8661a = u0Var;
                }

                @Override // kotlinx.coroutines.flow.f
                public Object emit(T t11, zz.d<? super vz.b0> dVar) {
                    this.f8661a.setValue(t11);
                    return vz.b0.f54756a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0165a(kotlinx.coroutines.flow.e<? extends T> eVar, u0<R> u0Var, zz.d<? super C0165a> dVar) {
                super(2, dVar);
                this.f8659b = eVar;
                this.f8660c = u0Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
                return new C0165a(this.f8659b, this.f8660c, dVar);
            }

            @Override // h00.p
            public final Object invoke(v20.o0 o0Var, zz.d<? super vz.b0> dVar) {
                return ((C0165a) create(o0Var, dVar)).invokeSuspend(vz.b0.f54756a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object d11;
                d11 = a00.d.d();
                int i11 = this.f8658a;
                if (i11 == 0) {
                    vz.r.b(obj);
                    kotlinx.coroutines.flow.e<T> eVar = this.f8659b;
                    C0166a c0166a = new C0166a(this.f8660c);
                    this.f8658a = 1;
                    if (eVar.collect(c0166a, this) == d11) {
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

        /* JADX INFO: Add missing generic type declarations: [T] */
        /* loaded from: classes.dex */
        public static final class b<T> implements kotlinx.coroutines.flow.f<T> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ u0 f8662a;

            public b(u0 u0Var) {
                this.f8662a = u0Var;
            }

            @Override // kotlinx.coroutines.flow.f
            public Object emit(T t11, zz.d<? super vz.b0> dVar) {
                this.f8662a.setValue(t11);
                return vz.b0.f54756a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(zz.g gVar, kotlinx.coroutines.flow.e<? extends T> eVar, zz.d<? super a> dVar) {
            super(2, dVar);
            this.f8656c = gVar;
            this.f8657d = eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
            a aVar = new a(this.f8656c, this.f8657d, dVar);
            aVar.f8655b = obj;
            return aVar;
        }

        public final Object invoke(u0<R> u0Var, zz.d<? super vz.b0> dVar) {
            return ((a) create(u0Var, dVar)).invokeSuspend(vz.b0.f54756a);
        }

        @Override // h00.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, zz.d<? super vz.b0> dVar) {
            return invoke((u0) ((u0) obj), dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d11;
            d11 = a00.d.d();
            int i11 = this.f8654a;
            if (i11 == 0) {
                vz.r.b(obj);
                u0 u0Var = (u0) this.f8655b;
                if (kotlin.jvm.internal.s.c(this.f8656c, zz.h.f61280a)) {
                    kotlinx.coroutines.flow.e<T> eVar = this.f8657d;
                    b bVar = new b(u0Var);
                    this.f8654a = 1;
                    if (eVar.collect(bVar, this) == d11) {
                        return d11;
                    }
                } else {
                    zz.g gVar = this.f8656c;
                    C0165a c0165a = new C0165a(this.f8657d, u0Var, null);
                    this.f8654a = 2;
                    if (v20.i.g(gVar, c0165a, this) == d11) {
                        return d11;
                    }
                }
            } else if (i11 != 1 && i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                vz.r.b(obj);
            }
            return vz.b0.f54756a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1", f = "SnapshotFlow.kt", l = {134, 138, 160}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class b<T> extends kotlin.coroutines.jvm.internal.l implements h00.p<kotlinx.coroutines.flow.f<? super T>, zz.d<? super vz.b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        Object f8663a;

        /* renamed from: b  reason: collision with root package name */
        Object f8664b;

        /* renamed from: c  reason: collision with root package name */
        Object f8665c;

        /* renamed from: d  reason: collision with root package name */
        Object f8666d;

        /* renamed from: e  reason: collision with root package name */
        Object f8667e;

        /* renamed from: f  reason: collision with root package name */
        int f8668f;

        /* renamed from: g  reason: collision with root package name */
        int f8669g;

        /* renamed from: h  reason: collision with root package name */
        private /* synthetic */ Object f8670h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ h00.a<T> f8671i;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public static final class a extends kotlin.jvm.internal.u implements h00.l<Object, vz.b0> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Set<Object> f8672a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Set<Object> set) {
                super(1);
                this.f8672a = set;
            }

            @Override // h00.l
            public /* bridge */ /* synthetic */ vz.b0 invoke(Object obj) {
                invoke2(obj);
                return vz.b0.f54756a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Object it2) {
                kotlin.jvm.internal.s.g(it2, "it");
                this.f8672a.add(it2);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: c1.q1$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0167b extends kotlin.jvm.internal.u implements h00.p<Set<? extends Object>, m1.h, vz.b0> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ x20.e<Set<Object>> f8673a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0167b(x20.e<Set<Object>> eVar) {
                super(2);
                this.f8673a = eVar;
            }

            public final void a(Set<? extends Object> changed, m1.h noName_1) {
                kotlin.jvm.internal.s.g(changed, "changed");
                kotlin.jvm.internal.s.g(noName_1, "$noName_1");
                this.f8673a.d(changed);
            }

            @Override // h00.p
            public /* bridge */ /* synthetic */ vz.b0 invoke(Set<? extends Object> set, m1.h hVar) {
                a(set, hVar);
                return vz.b0.f54756a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(h00.a<? extends T> aVar, zz.d<? super b> dVar) {
            super(2, dVar);
            this.f8671i = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
            b bVar = new b(this.f8671i, dVar);
            bVar.f8670h = obj;
            return bVar;
        }

        @Override // h00.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, zz.d<? super vz.b0> dVar) {
            return invoke((kotlinx.coroutines.flow.f) ((kotlinx.coroutines.flow.f) obj), dVar);
        }

        public final Object invoke(kotlinx.coroutines.flow.f<? super T> fVar, zz.d<? super vz.b0> dVar) {
            return ((b) create(fVar, dVar)).invokeSuspend(vz.b0.f54756a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00db A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00dc  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x0100 A[Catch: all -> 0x0053, TRY_LEAVE, TryCatch #4 {all -> 0x0053, blocks: (B:34:0x00e4, B:36:0x00e8, B:41:0x00f2, B:44:0x0100, B:48:0x0116, B:50:0x011f, B:11:0x004b, B:45:0x010b, B:47:0x0113, B:46:0x010f), top: B:75:0x004b }] */
        /* JADX WARN: Type inference failed for: r2v23, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r2v27, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r7v10 */
        /* JADX WARN: Type inference failed for: r7v15, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x014c -> B:30:0x00c5). Please submit an issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r17) {
            /*
                Method dump skipped, instructions count: 350
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: c1.q1.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final <T extends R, R> v1<R> b(kotlinx.coroutines.flow.e<? extends T> eVar, R r11, zz.g gVar, i iVar, int i11, int i12) {
        kotlin.jvm.internal.s.g(eVar, "<this>");
        iVar.x(2062127072);
        if ((i12 & 2) != 0) {
            gVar = zz.h.f61280a;
        }
        zz.g gVar2 = gVar;
        int i13 = i11 >> 3;
        v1<R> k11 = n1.k(r11, eVar, gVar2, new a(gVar2, eVar, null), iVar, (i13 & 8) | 576 | (i13 & 14));
        iVar.N();
        return k11;
    }

    public static final <T> v1<T> c(kotlinx.coroutines.flow.h0<? extends T> h0Var, zz.g gVar, i iVar, int i11, int i12) {
        kotlin.jvm.internal.s.g(h0Var, "<this>");
        iVar.x(2062126548);
        if ((i12 & 1) != 0) {
            gVar = zz.h.f61280a;
        }
        v1<T> a11 = n1.a(h0Var, h0Var.getValue(), gVar, iVar, 520, 0);
        iVar.N();
        return a11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> boolean d(Set<? extends T> set, Set<? extends T> set2) {
        if (set.size() < set2.size()) {
            if (!set.isEmpty()) {
                for (T t11 : set) {
                    if (set2.contains(t11)) {
                        return true;
                    }
                }
            }
        } else if (!set2.isEmpty()) {
            for (T t12 : set2) {
                if (set.contains(t12)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final <T> kotlinx.coroutines.flow.e<T> e(h00.a<? extends T> block) {
        kotlin.jvm.internal.s.g(block, "block");
        return kotlinx.coroutines.flow.g.v(new b(block, null));
    }
}