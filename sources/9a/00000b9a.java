package b1;

import c1.d1;
import c1.o0;
import c1.s1;
import c1.v1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import t1.a0;
import vz.b0;

/* loaded from: classes.dex */
public final class a extends m implements d1 {

    /* renamed from: b  reason: collision with root package name */
    private final boolean f7175b;

    /* renamed from: c  reason: collision with root package name */
    private final float f7176c;

    /* renamed from: d  reason: collision with root package name */
    private final v1<a0> f7177d;

    /* renamed from: e  reason: collision with root package name */
    private final v1<f> f7178e;

    /* renamed from: f  reason: collision with root package name */
    private final i f7179f;

    /* renamed from: g  reason: collision with root package name */
    private final o0 f7180g;

    /* renamed from: h  reason: collision with root package name */
    private final o0 f7181h;

    /* renamed from: i  reason: collision with root package name */
    private long f7182i;

    /* renamed from: j  reason: collision with root package name */
    private int f7183j;

    /* renamed from: k  reason: collision with root package name */
    private final h00.a<b0> f7184k;

    /* renamed from: b1.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static final class C0138a extends u implements h00.a<b0> {
        C0138a() {
            super(0);
        }

        @Override // h00.a
        public /* bridge */ /* synthetic */ b0 invoke() {
            invoke2();
            return b0.f54756a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            a aVar = a.this;
            aVar.o(!aVar.l());
        }
    }

    private a(boolean z11, float f11, v1<a0> v1Var, v1<f> v1Var2, i iVar) {
        super(z11, v1Var2);
        o0 d11;
        o0 d12;
        this.f7175b = z11;
        this.f7176c = f11;
        this.f7177d = v1Var;
        this.f7178e = v1Var2;
        this.f7179f = iVar;
        d11 = s1.d(null, null, 2, null);
        this.f7180g = d11;
        d12 = s1.d(Boolean.TRUE, null, 2, null);
        this.f7181h = d12;
        this.f7182i = s1.l.f49969b.b();
        this.f7183j = -1;
        this.f7184k = new C0138a();
    }

    public /* synthetic */ a(boolean z11, float f11, v1 v1Var, v1 v1Var2, i iVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(z11, f11, v1Var, v1Var2, iVar);
    }

    private final void k() {
        this.f7179f.a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean l() {
        return ((Boolean) this.f7181h.getValue()).booleanValue();
    }

    private final l m() {
        return (l) this.f7180g.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o(boolean z11) {
        this.f7181h.setValue(Boolean.valueOf(z11));
    }

    private final void p(l lVar) {
        this.f7180g.setValue(lVar);
    }

    @Override // m0.q
    public void a(v1.c cVar) {
        int G;
        s.g(cVar, "<this>");
        this.f7182i = cVar.c();
        if (Float.isNaN(this.f7176c)) {
            G = j00.c.c(h.a(cVar, this.f7175b, cVar.c()));
        } else {
            G = cVar.G(this.f7176c);
        }
        this.f7183j = G;
        long v11 = this.f7177d.getValue().v();
        float d11 = this.f7178e.getValue().d();
        cVar.s0();
        f(cVar, this.f7176c, v11);
        t1.u b11 = cVar.j0().b();
        l();
        l m11 = m();
        if (m11 == null) {
            return;
        }
        m11.f(cVar.c(), this.f7183j, v11, d11);
        m11.draw(t1.c.c(b11));
    }

    @Override // c1.d1
    public void b() {
    }

    @Override // b1.m
    public void c(o0.p interaction, v20.o0 scope) {
        s.g(interaction, "interaction");
        s.g(scope, "scope");
        l b11 = this.f7179f.b(this);
        b11.b(interaction, this.f7175b, this.f7182i, this.f7183j, this.f7177d.getValue().v(), this.f7178e.getValue().d(), this.f7184k);
        p(b11);
    }

    @Override // c1.d1
    public void d() {
        k();
    }

    @Override // c1.d1
    public void e() {
        k();
    }

    @Override // b1.m
    public void g(o0.p interaction) {
        s.g(interaction, "interaction");
        l m11 = m();
        if (m11 == null) {
            return;
        }
        m11.e();
    }

    public final void n() {
        p(null);
    }
}