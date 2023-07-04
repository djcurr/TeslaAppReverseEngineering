package z2;

import c1.i;
import c1.o0;
import f2.b0;
import f2.m0;
import f2.z;
import g3.b;
import java.util.List;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    private static final boolean f60097a = false;

    /* loaded from: classes.dex */
    public static final class a {
        a() {
        }
    }

    /* loaded from: classes.dex */
    static final class b implements f2.z {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ x f60098a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ o f60099b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f60100c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ o0<Boolean> f60101d;

        /* loaded from: classes.dex */
        static final class a extends kotlin.jvm.internal.u implements h00.l<m0.a, vz.b0> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ x f60102a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ List<f2.y> f60103b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(x xVar, List<? extends f2.y> list) {
                super(1);
                this.f60102a = xVar;
                this.f60103b = list;
            }

            @Override // h00.l
            public /* bridge */ /* synthetic */ vz.b0 invoke(m0.a aVar) {
                invoke2(aVar);
                return vz.b0.f54756a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(m0.a layout) {
                kotlin.jvm.internal.s.g(layout, "$this$layout");
                this.f60102a.k(layout, this.f60103b);
            }
        }

        b(x xVar, o oVar, int i11, o0<Boolean> o0Var) {
            this.f60098a = xVar;
            this.f60099b = oVar;
            this.f60100c = i11;
            this.f60101d = o0Var;
        }

        @Override // f2.z
        public int a(f2.k kVar, List<? extends f2.j> list, int i11) {
            return z.a.d(this, kVar, list, i11);
        }

        @Override // f2.z
        public final f2.a0 b(f2.b0 MeasurePolicy, List<? extends f2.y> measurables, long j11) {
            kotlin.jvm.internal.s.g(MeasurePolicy, "$this$MeasurePolicy");
            kotlin.jvm.internal.s.g(measurables, "measurables");
            long l11 = this.f60098a.l(j11, MeasurePolicy.getLayoutDirection(), this.f60099b, measurables, this.f60100c, MeasurePolicy);
            this.f60101d.getValue();
            return b0.a.b(MeasurePolicy, x2.o.g(l11), x2.o.f(l11), null, new a(this.f60098a, measurables), 4, null);
        }

        @Override // f2.z
        public int c(f2.k kVar, List<? extends f2.j> list, int i11) {
            return z.a.b(this, kVar, list, i11);
        }

        @Override // f2.z
        public int d(f2.k kVar, List<? extends f2.j> list, int i11) {
            return z.a.a(this, kVar, list, i11);
        }

        @Override // f2.z
        public int e(f2.k kVar, List<? extends f2.j> list, int i11) {
            return z.a.c(this, kVar, list, i11);
        }
    }

    /* loaded from: classes.dex */
    static final class c extends kotlin.jvm.internal.u implements h00.a<vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o0<Boolean> f60104a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ o f60105b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(o0<Boolean> o0Var, o oVar) {
            super(0);
            this.f60104a = o0Var;
            this.f60105b = oVar;
        }

        @Override // h00.a
        public /* bridge */ /* synthetic */ vz.b0 invoke() {
            invoke2();
            return vz.b0.f54756a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            o0<Boolean> o0Var = this.f60104a;
            o0Var.setValue(Boolean.valueOf(!o0Var.getValue().booleanValue()));
            this.f60105b.i(true);
        }
    }

    public static final void d(y state, List<? extends f2.y> measurables) {
        kotlin.jvm.internal.s.g(state, "state");
        kotlin.jvm.internal.s.g(measurables, "measurables");
        int size = measurables.size() - 1;
        if (size < 0) {
            return;
        }
        int i11 = 0;
        while (true) {
            int i12 = i11 + 1;
            f2.y yVar = measurables.get(i11);
            Object a11 = f2.r.a(yVar);
            if (a11 == null && (a11 = l.a(yVar)) == null) {
                a11 = e();
            }
            state.f(a11, yVar);
            Object b11 = l.b(yVar);
            if (b11 != null && (b11 instanceof String) && (a11 instanceof String)) {
                state.j((String) a11, (String) b11);
            }
            if (i12 > size) {
                return;
            }
            i11 = i12;
        }
    }

    public static final Object e() {
        return new a();
    }

    public static final vz.p<f2.z, h00.a<vz.b0>> f(int i11, k scope, o0<Boolean> remeasureRequesterState, x measurer, c1.i iVar, int i12) {
        kotlin.jvm.internal.s.g(scope, "scope");
        kotlin.jvm.internal.s.g(remeasureRequesterState, "remeasureRequesterState");
        kotlin.jvm.internal.s.g(measurer, "measurer");
        iVar.x(-441911751);
        iVar.x(-3687241);
        Object y11 = iVar.y();
        i.a aVar = c1.i.f8486a;
        if (y11 == aVar.a()) {
            y11 = new o(scope);
            iVar.p(y11);
        }
        iVar.N();
        o oVar = (o) y11;
        Integer valueOf = Integer.valueOf(i11);
        iVar.x(-3686930);
        boolean O = iVar.O(valueOf);
        Object y12 = iVar.y();
        if (O || y12 == aVar.a()) {
            y12 = vz.v.a(new b(measurer, oVar, i11, remeasureRequesterState), new c(remeasureRequesterState, oVar));
            iVar.p(y12);
        }
        iVar.N();
        vz.p<f2.z, h00.a<vz.b0>> pVar = (vz.p) y12;
        iVar.N();
        return pVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String g(f3.e eVar) {
        return ((Object) eVar.r()) + " width " + eVar.W() + " minWidth " + eVar.H() + " maxWidth " + eVar.F() + " height " + eVar.v() + " minHeight " + eVar.G() + " maxHeight " + eVar.E() + " HDB " + eVar.y() + " VDB " + eVar.T() + " MCW " + eVar.f25742u + " MCH " + eVar.f25744v + " percentW " + eVar.f25749z + " percentH " + eVar.C;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String h(b.a aVar) {
        return "measure strategy is ";
    }
}