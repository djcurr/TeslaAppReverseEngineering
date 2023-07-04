package z2;

import java.util.List;
import z2.h;

/* loaded from: classes.dex */
public abstract class b implements u {

    /* renamed from: a  reason: collision with root package name */
    private final List<h00.l<y, vz.b0>> f60059a;

    /* renamed from: b  reason: collision with root package name */
    private final int f60060b;

    /* loaded from: classes.dex */
    static final class a extends kotlin.jvm.internal.u implements h00.l<y, vz.b0> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h.b f60062b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ float f60063c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ float f60064d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(h.b bVar, float f11, float f12) {
            super(1);
            this.f60062b = bVar;
            this.f60063c = f11;
            this.f60064d = f12;
        }

        public final void a(y state) {
            kotlin.jvm.internal.s.g(state, "state");
            d3.a c11 = b.this.c(state);
            b bVar = b.this;
            h.b bVar2 = this.f60062b;
            ((d3.a) z2.a.f60047a.e()[bVar.f60060b][bVar2.b()].invoke(c11, bVar2.a())).t(x2.g.c(this.f60063c)).v(x2.g.c(this.f60064d));
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ vz.b0 invoke(y yVar) {
            a(yVar);
            return vz.b0.f54756a;
        }
    }

    public b(List<h00.l<y, vz.b0>> tasks, int i11) {
        kotlin.jvm.internal.s.g(tasks, "tasks");
        this.f60059a = tasks;
        this.f60060b = i11;
    }

    @Override // z2.u
    public final void a(h.b anchor, float f11, float f12) {
        kotlin.jvm.internal.s.g(anchor, "anchor");
        this.f60059a.add(new a(anchor, f11, f12));
    }

    public abstract d3.a c(y yVar);
}