package y20;

import vz.b0;
import zz.e;

/* loaded from: classes5.dex */
public abstract class f<S, T> extends d<T> {

    /* renamed from: d  reason: collision with root package name */
    protected final kotlinx.coroutines.flow.e<S> f59006d;

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.internal.ChannelFlowOperator$collectWithContextUndispatched$2", f = "ChannelFlow.kt", l = {152}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.l implements h00.p<kotlinx.coroutines.flow.f<? super T>, zz.d<? super b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f59007a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f59008b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ f<S, T> f59009c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(f<S, T> fVar, zz.d<? super a> dVar) {
            super(2, dVar);
            this.f59009c = fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<b0> create(Object obj, zz.d<?> dVar) {
            a aVar = new a(this.f59009c, dVar);
            aVar.f59008b = obj;
            return aVar;
        }

        @Override // h00.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, zz.d<? super b0> dVar) {
            return invoke((kotlinx.coroutines.flow.f) ((kotlinx.coroutines.flow.f) obj), dVar);
        }

        public final Object invoke(kotlinx.coroutines.flow.f<? super T> fVar, zz.d<? super b0> dVar) {
            return ((a) create(fVar, dVar)).invokeSuspend(b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d11;
            d11 = a00.d.d();
            int i11 = this.f59007a;
            if (i11 == 0) {
                vz.r.b(obj);
                f<S, T> fVar = this.f59009c;
                this.f59007a = 1;
                if (fVar.p((kotlinx.coroutines.flow.f) this.f59008b, this) == d11) {
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

    /* JADX WARN: Multi-variable type inference failed */
    public f(kotlinx.coroutines.flow.e<? extends S> eVar, zz.g gVar, int i11, kotlinx.coroutines.channels.a aVar) {
        super(gVar, i11, aVar);
        this.f59006d = eVar;
    }

    static /* synthetic */ Object m(f fVar, kotlinx.coroutines.flow.f fVar2, zz.d dVar) {
        Object d11;
        Object d12;
        Object d13;
        if (fVar.f58997b == -3) {
            zz.g context = dVar.getContext();
            zz.g plus = context.plus(fVar.f58996a);
            if (kotlin.jvm.internal.s.c(plus, context)) {
                Object p11 = fVar.p(fVar2, dVar);
                d13 = a00.d.d();
                return p11 == d13 ? p11 : b0.f54756a;
            }
            e.b bVar = zz.e.f61277h3;
            if (kotlin.jvm.internal.s.c(plus.get(bVar), context.get(bVar))) {
                Object o11 = fVar.o(fVar2, plus, dVar);
                d12 = a00.d.d();
                return o11 == d12 ? o11 : b0.f54756a;
            }
        }
        Object collect = super.collect(fVar2, dVar);
        d11 = a00.d.d();
        return collect == d11 ? collect : b0.f54756a;
    }

    static /* synthetic */ Object n(f fVar, x20.r rVar, zz.d dVar) {
        Object d11;
        Object p11 = fVar.p(new u(rVar), dVar);
        d11 = a00.d.d();
        return p11 == d11 ? p11 : b0.f54756a;
    }

    private final Object o(kotlinx.coroutines.flow.f<? super T> fVar, zz.g gVar, zz.d<? super b0> dVar) {
        Object d11;
        Object d12 = e.d(gVar, e.a(fVar, dVar.getContext()), null, new a(this, null), dVar, 4, null);
        d11 = a00.d.d();
        return d12 == d11 ? d12 : b0.f54756a;
    }

    @Override // y20.d, kotlinx.coroutines.flow.e
    public Object collect(kotlinx.coroutines.flow.f<? super T> fVar, zz.d<? super b0> dVar) {
        return m(this, fVar, dVar);
    }

    @Override // y20.d
    protected Object g(x20.r<? super T> rVar, zz.d<? super b0> dVar) {
        return n(this, rVar, dVar);
    }

    protected abstract Object p(kotlinx.coroutines.flow.f<? super T> fVar, zz.d<? super b0> dVar);

    @Override // y20.d
    public String toString() {
        return this.f59006d + " -> " + super.toString();
    }
}