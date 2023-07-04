package z2;

import java.util.List;

/* loaded from: classes.dex */
final class q extends c {

    /* renamed from: c  reason: collision with root package name */
    private final Object f60130c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(Object id2, int i11, List<h00.l<y, vz.b0>> tasks) {
        super(tasks, i11);
        kotlin.jvm.internal.s.g(id2, "id");
        kotlin.jvm.internal.s.g(tasks, "tasks");
        this.f60130c = id2;
    }

    @Override // z2.c
    public d3.a c(y state) {
        kotlin.jvm.internal.s.g(state, "state");
        d3.a b11 = state.b(this.f60130c);
        kotlin.jvm.internal.s.f(b11, "state.constraints(id)");
        return b11;
    }
}