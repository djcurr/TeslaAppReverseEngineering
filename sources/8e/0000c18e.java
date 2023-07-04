package y20;

import kotlin.jvm.internal.DefaultConstructorMarker;
import vz.b0;

/* loaded from: classes5.dex */
public final class g<T> extends f<T, T> {
    public /* synthetic */ g(kotlinx.coroutines.flow.e eVar, zz.g gVar, int i11, kotlinx.coroutines.channels.a aVar, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(eVar, (i12 & 2) != 0 ? zz.h.f61280a : gVar, (i12 & 4) != 0 ? -3 : i11, (i12 & 8) != 0 ? kotlinx.coroutines.channels.a.SUSPEND : aVar);
    }

    @Override // y20.d
    protected d<T> h(zz.g gVar, int i11, kotlinx.coroutines.channels.a aVar) {
        return new g(this.f59006d, gVar, i11, aVar);
    }

    @Override // y20.d
    public kotlinx.coroutines.flow.e<T> i() {
        return (kotlinx.coroutines.flow.e<T>) this.f59006d;
    }

    @Override // y20.f
    protected Object p(kotlinx.coroutines.flow.f<? super T> fVar, zz.d<? super b0> dVar) {
        Object d11;
        Object collect = this.f59006d.collect(fVar, dVar);
        d11 = a00.d.d();
        return collect == d11 ? collect : b0.f54756a;
    }

    public g(kotlinx.coroutines.flow.e<? extends T> eVar, zz.g gVar, int i11, kotlinx.coroutines.channels.a aVar) {
        super(eVar, gVar, i11, aVar);
    }
}