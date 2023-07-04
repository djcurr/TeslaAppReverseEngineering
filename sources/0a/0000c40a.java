package z2;

import java.util.List;
import z2.h;

/* loaded from: classes.dex */
public abstract class c implements a0 {

    /* renamed from: a  reason: collision with root package name */
    private final List<h00.l<y, vz.b0>> f60067a;

    /* renamed from: b  reason: collision with root package name */
    private final int f60068b;

    /* loaded from: classes.dex */
    static final class a extends kotlin.jvm.internal.u implements h00.l<y, vz.b0> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h.c f60070b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ float f60071c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ float f60072d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(h.c cVar, float f11, float f12) {
            super(1);
            this.f60070b = cVar;
            this.f60071c = f11;
            this.f60072d = f12;
        }

        public final void a(y state) {
            kotlin.jvm.internal.s.g(state, "state");
            x2.q m11 = state.m();
            z2.a aVar = z2.a.f60047a;
            int g11 = aVar.g(c.this.f60068b, m11);
            int g12 = aVar.g(this.f60070b.b(), m11);
            ((d3.a) aVar.f()[g11][g12].invoke(c.this.c(state), this.f60070b.a(), state.m())).t(x2.g.c(this.f60071c)).v(x2.g.c(this.f60072d));
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ vz.b0 invoke(y yVar) {
            a(yVar);
            return vz.b0.f54756a;
        }
    }

    public c(List<h00.l<y, vz.b0>> tasks, int i11) {
        kotlin.jvm.internal.s.g(tasks, "tasks");
        this.f60067a = tasks;
        this.f60068b = i11;
    }

    @Override // z2.a0
    public final void a(h.c anchor, float f11, float f12) {
        kotlin.jvm.internal.s.g(anchor, "anchor");
        this.f60067a.add(new a(anchor, f11, f12));
    }

    public abstract d3.a c(y yVar);
}