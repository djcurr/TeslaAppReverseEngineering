package x1;

import c1.e1;
import c1.o0;
import c1.s1;
import c1.y;
import c1.z;
import t1.b0;

/* loaded from: classes.dex */
public final class r extends w1.b {

    /* renamed from: l  reason: collision with root package name */
    public static final int f56864l = 8;

    /* renamed from: f  reason: collision with root package name */
    private final o0 f56865f;

    /* renamed from: g  reason: collision with root package name */
    private final l f56866g;

    /* renamed from: h  reason: collision with root package name */
    private c1.l f56867h;

    /* renamed from: i  reason: collision with root package name */
    private final o0 f56868i;

    /* renamed from: j  reason: collision with root package name */
    private float f56869j;

    /* renamed from: k  reason: collision with root package name */
    private b0 f56870k;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class a extends kotlin.jvm.internal.u implements h00.l<z, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c1.l f56871a;

        /* renamed from: x1.r$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C1299a implements y {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ c1.l f56872a;

            public C1299a(c1.l lVar) {
                this.f56872a = lVar;
            }

            @Override // c1.y
            public void dispose() {
                this.f56872a.dispose();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(c1.l lVar) {
            super(1);
            this.f56871a = lVar;
        }

        @Override // h00.l
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final y mo12invoke(z DisposableEffect) {
            kotlin.jvm.internal.s.g(DisposableEffect, "$this$DisposableEffect");
            return new C1299a(this.f56871a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends kotlin.jvm.internal.u implements h00.p<c1.i, Integer, vz.b0> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f56874b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ float f56875c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ float f56876d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ h00.r<Float, Float, c1.i, Integer, vz.b0> f56877e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f56878f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(String str, float f11, float f12, h00.r<? super Float, ? super Float, ? super c1.i, ? super Integer, vz.b0> rVar, int i11) {
            super(2);
            this.f56874b = str;
            this.f56875c = f11;
            this.f56876d = f12;
            this.f56877e = rVar;
            this.f56878f = i11;
        }

        @Override // h00.p
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ vz.b0 mo160invoke(c1.i iVar, Integer num) {
            invoke(iVar, num.intValue());
            return vz.b0.f54756a;
        }

        public final void invoke(c1.i iVar, int i11) {
            r.this.k(this.f56874b, this.f56875c, this.f56876d, this.f56877e, iVar, this.f56878f | 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class c extends kotlin.jvm.internal.u implements h00.p<c1.i, Integer, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h00.r<Float, Float, c1.i, Integer, vz.b0> f56879a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ r f56880b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(h00.r<? super Float, ? super Float, ? super c1.i, ? super Integer, vz.b0> rVar, r rVar2) {
            super(2);
            this.f56879a = rVar;
            this.f56880b = rVar2;
        }

        @Override // h00.p
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ vz.b0 mo160invoke(c1.i iVar, Integer num) {
            invoke(iVar, num.intValue());
            return vz.b0.f54756a;
        }

        public final void invoke(c1.i iVar, int i11) {
            if (((i11 & 11) ^ 2) == 0 && iVar.i()) {
                iVar.G();
            } else {
                this.f56879a.invoke(Float.valueOf(this.f56880b.f56866g.l()), Float.valueOf(this.f56880b.f56866g.k()), iVar, 0);
            }
        }
    }

    /* loaded from: classes.dex */
    static final class d extends kotlin.jvm.internal.u implements h00.a<vz.b0> {
        d() {
            super(0);
        }

        @Override // h00.a
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ vz.b0 mo11invoke() {
            invoke2();
            return vz.b0.f54756a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            r.this.q(true);
        }
    }

    public r() {
        o0 d11;
        o0 d12;
        d11 = s1.d(s1.l.c(s1.l.f49969b.b()), null, 2, null);
        this.f56865f = d11;
        l lVar = new l();
        lVar.n(new d());
        this.f56866g = lVar;
        d12 = s1.d(Boolean.TRUE, null, 2, null);
        this.f56868i = d12;
        this.f56869j = 1.0f;
    }

    private final c1.l n(c1.m mVar, h00.r<? super Float, ? super Float, ? super c1.i, ? super Integer, vz.b0> rVar) {
        c1.l lVar = this.f56867h;
        if (lVar == null || lVar.isDisposed()) {
            lVar = c1.p.a(new k(this.f56866g.j()), mVar);
        }
        this.f56867h = lVar;
        lVar.d(j1.c.c(-985537011, true, new c(rVar, this)));
        return lVar;
    }

    private final boolean p() {
        return ((Boolean) this.f56868i.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q(boolean z11) {
        this.f56868i.setValue(Boolean.valueOf(z11));
    }

    @Override // w1.b
    protected boolean a(float f11) {
        this.f56869j = f11;
        return true;
    }

    @Override // w1.b
    protected boolean b(b0 b0Var) {
        this.f56870k = b0Var;
        return true;
    }

    @Override // w1.b
    public long h() {
        return o();
    }

    @Override // w1.b
    protected void j(v1.e eVar) {
        kotlin.jvm.internal.s.g(eVar, "<this>");
        l lVar = this.f56866g;
        float f11 = this.f56869j;
        b0 b0Var = this.f56870k;
        if (b0Var == null) {
            b0Var = lVar.h();
        }
        lVar.g(eVar, f11, b0Var);
        if (p()) {
            q(false);
        }
    }

    public final void k(String name, float f11, float f12, h00.r<? super Float, ? super Float, ? super c1.i, ? super Integer, vz.b0> content, c1.i iVar, int i11) {
        kotlin.jvm.internal.s.g(name, "name");
        kotlin.jvm.internal.s.g(content, "content");
        c1.i h11 = iVar.h(625569543);
        l lVar = this.f56866g;
        lVar.o(name);
        lVar.q(f11);
        lVar.p(f12);
        c1.l n11 = n(c1.h.d(h11, 0), content);
        c1.b0.a(n11, new a(n11), h11, 8);
        e1 l11 = h11.l();
        if (l11 == null) {
            return;
        }
        l11.a(new b(name, f11, f12, content, i11));
    }

    public final long o() {
        return ((s1.l) this.f56865f.getValue()).l();
    }

    public final void r(b0 b0Var) {
        this.f56866g.m(b0Var);
    }

    public final void s(long j11) {
        this.f56865f.setValue(s1.l.c(j11));
    }
}