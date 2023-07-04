package kotlinx.coroutines.flow;

import v20.r0;

/* loaded from: classes5.dex */
public final class j0 {

    /* renamed from: a  reason: collision with root package name */
    private static final kotlinx.coroutines.internal.f0 f35284a = new kotlinx.coroutines.internal.f0("NONE");

    /* renamed from: b  reason: collision with root package name */
    private static final kotlinx.coroutines.internal.f0 f35285b = new kotlinx.coroutines.internal.f0("PENDING");

    public static final <T> u<T> a(T t11) {
        if (t11 == null) {
            t11 = (T) y20.q.f59054a;
        }
        return new i0(t11);
    }

    public static final <T> e<T> d(h0<? extends T> h0Var, zz.g gVar, int i11, kotlinx.coroutines.channels.a aVar) {
        boolean z11 = true;
        if (r0.a()) {
            if (!(i11 != -1)) {
                throw new AssertionError();
            }
        }
        if (i11 < 0 || i11 >= 2) {
            z11 = false;
        }
        return ((z11 || i11 == -2) && aVar == kotlinx.coroutines.channels.a.DROP_OLDEST) ? h0Var : a0.e(h0Var, gVar, i11, aVar);
    }
}