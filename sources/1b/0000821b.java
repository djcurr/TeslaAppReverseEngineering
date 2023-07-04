package l2;

import java.util.ArrayList;
import java.util.List;
import vz.b0;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a  reason: collision with root package name */
    private final x f36447a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f36448b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f36449c;

    /* renamed from: d  reason: collision with root package name */
    private p f36450d;

    /* renamed from: e  reason: collision with root package name */
    private final k f36451e;

    /* renamed from: f  reason: collision with root package name */
    private final int f36452f;

    /* renamed from: g  reason: collision with root package name */
    private final h2.k f36453g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class a extends kotlin.jvm.internal.u implements h00.l<v, b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f36454a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(h hVar) {
            super(1);
            this.f36454a = hVar;
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ b0 invoke(v vVar) {
            invoke2(vVar);
            return b0.f54756a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(v fakeSemanticsNode) {
            kotlin.jvm.internal.s.g(fakeSemanticsNode, "$this$fakeSemanticsNode");
            t.L(fakeSemanticsNode, this.f36454a.m());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends kotlin.jvm.internal.u implements h00.l<v, b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f36455a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str) {
            super(1);
            this.f36455a = str;
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ b0 invoke(v vVar) {
            invoke2(vVar);
            return b0.f54756a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(v fakeSemanticsNode) {
            kotlin.jvm.internal.s.g(fakeSemanticsNode, "$this$fakeSemanticsNode");
            t.F(fakeSemanticsNode, this.f36455a);
        }
    }

    /* loaded from: classes.dex */
    static final class c extends kotlin.jvm.internal.u implements h00.l<h2.k, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f36456a = new c();

        c() {
            super(1);
        }

        @Override // h00.l
        /* renamed from: a */
        public final Boolean invoke(h2.k it2) {
            k j22;
            kotlin.jvm.internal.s.g(it2, "it");
            x j11 = q.j(it2);
            return Boolean.valueOf((j11 == null || (j22 = j11.j2()) == null || !j22.m()) ? false : true);
        }
    }

    /* loaded from: classes.dex */
    static final class d extends kotlin.jvm.internal.u implements h00.l<h2.k, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f36457a = new d();

        d() {
            super(1);
        }

        @Override // h00.l
        /* renamed from: a */
        public final Boolean invoke(h2.k it2) {
            kotlin.jvm.internal.s.g(it2, "it");
            return Boolean.valueOf(q.j(it2) != null);
        }
    }

    public p(x outerSemanticsNodeWrapper, boolean z11) {
        kotlin.jvm.internal.s.g(outerSemanticsNodeWrapper, "outerSemanticsNodeWrapper");
        this.f36447a = outerSemanticsNodeWrapper;
        this.f36448b = z11;
        this.f36451e = outerSemanticsNodeWrapper.j2();
        this.f36452f = outerSemanticsNodeWrapper.a2().getId();
        this.f36453g = outerSemanticsNodeWrapper.n1();
    }

    private final void a(List<p> list) {
        h k11;
        k11 = q.k(this);
        if (k11 != null && this.f36451e.m() && (!list.isEmpty())) {
            list.add(b(k11, new a(k11)));
        }
        k kVar = this.f36451e;
        s sVar = s.f36459a;
        if (kVar.e(sVar.c()) && (!list.isEmpty()) && this.f36451e.m()) {
            List list2 = (List) l.a(this.f36451e, sVar.c());
            String str = list2 == null ? null : (String) wz.u.d0(list2);
            if (str != null) {
                list.add(0, b(null, new b(str)));
            }
        }
    }

    private final p b(h hVar, h00.l<? super v, b0> lVar) {
        p pVar = new p(new x(new h2.k(true).P(), new n(hVar != null ? q.l(this) : q.e(this), false, false, lVar)), false);
        pVar.f36449c = true;
        pVar.f36450d = this;
        return pVar;
    }

    private final List<p> c(List<p> list, boolean z11) {
        List y11 = y(this, z11, false, 2, null);
        int size = y11.size();
        int i11 = 0;
        while (i11 < size) {
            int i12 = i11 + 1;
            p pVar = (p) y11.get(i11);
            if (pVar.v()) {
                list.add(pVar);
            } else if (!pVar.t().k()) {
                d(pVar, list, false, 2, null);
            }
            i11 = i12;
        }
        return list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ List d(p pVar, List list, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = new ArrayList();
        }
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return pVar.c(list, z11);
    }

    private final List<p> g(boolean z11, boolean z12, boolean z13) {
        List<p> i11;
        if (!z12 && this.f36451e.k()) {
            i11 = wz.w.i();
            return i11;
        } else if (v()) {
            return d(this, null, z11, 1, null);
        } else {
            return x(z11, z13);
        }
    }

    private final boolean v() {
        return this.f36448b && this.f36451e.m();
    }

    private final void w(k kVar) {
        if (this.f36451e.k()) {
            return;
        }
        int i11 = 0;
        List y11 = y(this, false, false, 3, null);
        int size = y11.size();
        while (i11 < size) {
            int i12 = i11 + 1;
            p pVar = (p) y11.get(i11);
            if (!pVar.v()) {
                kVar.n(pVar.t());
                pVar.w(kVar);
            }
            i11 = i12;
        }
    }

    public static /* synthetic */ List y(p pVar, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        if ((i11 & 2) != 0) {
            z12 = false;
        }
        return pVar.x(z11, z12);
    }

    public final x e() {
        if (this.f36451e.m()) {
            x i11 = q.i(this.f36453g);
            return i11 == null ? this.f36447a : i11;
        }
        return this.f36447a;
    }

    public final s1.h f() {
        return !this.f36453g.u0() ? s1.h.f49955e.a() : f2.p.b(e());
    }

    public final k h() {
        if (v()) {
            k f11 = this.f36451e.f();
            w(f11);
            return f11;
        }
        return this.f36451e;
    }

    public final int i() {
        return this.f36452f;
    }

    public final f2.t j() {
        return this.f36453g;
    }

    public final h2.k k() {
        return this.f36453g;
    }

    public final boolean l() {
        return this.f36448b;
    }

    public final x m() {
        return this.f36447a;
    }

    public final p n() {
        p pVar = this.f36450d;
        if (pVar != null) {
            return pVar;
        }
        h2.k f11 = this.f36448b ? q.f(this.f36453g, c.f36456a) : null;
        if (f11 == null) {
            f11 = q.f(this.f36453g, d.f36457a);
        }
        x j11 = f11 == null ? null : q.j(f11);
        if (j11 == null) {
            return null;
        }
        return new p(j11, this.f36448b);
    }

    public final long o() {
        return !this.f36453g.u0() ? s1.f.f49950b.c() : f2.p.e(e());
    }

    public final List<p> p() {
        return g(false, false, true);
    }

    public final List<p> q() {
        return g(true, false, true);
    }

    public final long r() {
        return e().e();
    }

    public final s1.h s() {
        return e().l2();
    }

    public final k t() {
        return this.f36451e;
    }

    public final boolean u() {
        return this.f36449c;
    }

    public final List<p> x(boolean z11, boolean z12) {
        List h11;
        List<p> i11;
        if (this.f36449c) {
            i11 = wz.w.i();
            return i11;
        }
        ArrayList arrayList = new ArrayList();
        if (z11) {
            h11 = w.c(this.f36453g, null, 1, null);
        } else {
            h11 = q.h(this.f36453g, null, 1, null);
        }
        int size = h11.size();
        for (int i12 = 0; i12 < size; i12++) {
            arrayList.add(new p((x) h11.get(i12), l()));
        }
        if (z12) {
            a(arrayList);
        }
        return arrayList;
    }
}