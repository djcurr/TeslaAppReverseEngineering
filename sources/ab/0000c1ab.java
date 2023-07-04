package y20;

import kotlinx.coroutines.internal.j0;
import vz.b0;

/* loaded from: classes5.dex */
final class x<T> implements kotlinx.coroutines.flow.f<T> {

    /* renamed from: a  reason: collision with root package name */
    private final zz.g f59068a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f59069b;

    /* renamed from: c  reason: collision with root package name */
    private final h00.p<T, zz.d<? super b0>, Object> f59070c;

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.internal.UndispatchedContextCollector$emitRef$1", f = "ChannelFlow.kt", l = {212}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements h00.p<T, zz.d<? super b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f59071a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f59072b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.f<T> f59073c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(kotlinx.coroutines.flow.f<? super T> fVar, zz.d<? super a> dVar) {
            super(2, dVar);
            this.f59073c = fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<b0> create(Object obj, zz.d<?> dVar) {
            a aVar = new a(this.f59073c, dVar);
            aVar.f59072b = obj;
            return aVar;
        }

        @Override // h00.p
        /* renamed from: e */
        public final Object invoke(T t11, zz.d<? super b0> dVar) {
            return ((a) create(t11, dVar)).invokeSuspend(b0.f54756a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d11;
            d11 = a00.d.d();
            int i11 = this.f59071a;
            if (i11 == 0) {
                vz.r.b(obj);
                Object obj2 = this.f59072b;
                this.f59071a = 1;
                if (this.f59073c.emit(obj2, this) == d11) {
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

    public x(kotlinx.coroutines.flow.f<? super T> fVar, zz.g gVar) {
        this.f59068a = gVar;
        this.f59069b = j0.b(gVar);
        this.f59070c = new a(fVar, null);
    }

    @Override // kotlinx.coroutines.flow.f
    public Object emit(T t11, zz.d<? super b0> dVar) {
        Object d11;
        Object c11 = e.c(this.f59068a, t11, this.f59069b, this.f59070c, dVar);
        d11 = a00.d.d();
        return c11 == d11 ? c11 : b0.f54756a;
    }
}