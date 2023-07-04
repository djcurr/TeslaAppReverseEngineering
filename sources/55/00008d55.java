package o0;

import kotlin.jvm.internal.s;
import kotlinx.coroutines.flow.a0;
import kotlinx.coroutines.flow.t;
import vz.b0;

/* loaded from: classes.dex */
final class n implements m {

    /* renamed from: a  reason: collision with root package name */
    private final t<j> f42026a = a0.b(0, 16, kotlinx.coroutines.channels.a.DROP_OLDEST, 1, null);

    @Override // o0.m
    public boolean a(j interaction) {
        s.g(interaction, "interaction");
        return b().b(interaction);
    }

    @Override // o0.m
    public Object c(j jVar, zz.d<? super b0> dVar) {
        Object d11;
        Object emit = b().emit(jVar, dVar);
        d11 = a00.d.d();
        return emit == d11 ? emit : b0.f54756a;
    }

    @Override // o0.k
    /* renamed from: d */
    public t<j> b() {
        return this.f42026a;
    }
}