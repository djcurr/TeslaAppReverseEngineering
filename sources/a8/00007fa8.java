package kotlinx.coroutines.flow;

import v20.a2;
import v20.o0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final /* synthetic */ class j {

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__CollectKt$launchIn$1", f = "Collect.kt", l = {50}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.l implements h00.p<o0, zz.d<? super vz.b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f35282a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e<T> f35283b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(e<? extends T> eVar, zz.d<? super a> dVar) {
            super(2, dVar);
            this.f35283b = eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
            return new a(this.f35283b, dVar);
        }

        @Override // h00.p
        public final Object invoke(o0 o0Var, zz.d<? super vz.b0> dVar) {
            return ((a) create(o0Var, dVar)).invokeSuspend(vz.b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d11;
            d11 = a00.d.d();
            int i11 = this.f35282a;
            if (i11 == 0) {
                vz.r.b(obj);
                e<T> eVar = this.f35283b;
                this.f35282a = 1;
                if (g.f(eVar, this) == d11) {
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

    public static final Object a(e<?> eVar, zz.d<? super vz.b0> dVar) {
        Object d11;
        Object collect = eVar.collect(y20.p.f59053a, dVar);
        d11 = a00.d.d();
        return collect == d11 ? collect : vz.b0.f54756a;
    }

    public static final <T> Object b(e<? extends T> eVar, h00.p<? super T, ? super zz.d<? super vz.b0>, ? extends Object> pVar, zz.d<? super vz.b0> dVar) {
        e b11;
        Object d11;
        b11 = k.b(g.A(eVar, pVar), 0, null, 2, null);
        Object f11 = g.f(b11, dVar);
        d11 = a00.d.d();
        return f11 == d11 ? f11 : vz.b0.f54756a;
    }

    public static final <T> Object c(f<? super T> fVar, e<? extends T> eVar, zz.d<? super vz.b0> dVar) {
        Object d11;
        g.o(fVar);
        Object collect = eVar.collect(fVar, dVar);
        d11 = a00.d.d();
        return collect == d11 ? collect : vz.b0.f54756a;
    }

    public static final <T> a2 d(e<? extends T> eVar, o0 o0Var) {
        a2 d11;
        d11 = v20.k.d(o0Var, null, null, new a(eVar, null), 3, null);
        return d11;
    }
}