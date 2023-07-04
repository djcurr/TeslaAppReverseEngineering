package x1;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import vz.b0;

/* loaded from: classes.dex */
public final class l extends j {

    /* renamed from: b  reason: collision with root package name */
    private final x1.b f56781b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f56782c;

    /* renamed from: d  reason: collision with root package name */
    private final x1.a f56783d;

    /* renamed from: e  reason: collision with root package name */
    private h00.a<b0> f56784e;

    /* renamed from: f  reason: collision with root package name */
    private t1.b0 f56785f;

    /* renamed from: g  reason: collision with root package name */
    private float f56786g;

    /* renamed from: h  reason: collision with root package name */
    private float f56787h;

    /* renamed from: i  reason: collision with root package name */
    private long f56788i;

    /* renamed from: j  reason: collision with root package name */
    private final h00.l<v1.e, b0> f56789j;

    /* loaded from: classes.dex */
    static final class a extends kotlin.jvm.internal.u implements h00.l<v1.e, b0> {
        a() {
            super(1);
        }

        public final void a(v1.e eVar) {
            kotlin.jvm.internal.s.g(eVar, "$this$null");
            l.this.j().a(eVar);
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ b0 invoke(v1.e eVar) {
            a(eVar);
            return b0.f54756a;
        }
    }

    /* loaded from: classes.dex */
    static final class b extends kotlin.jvm.internal.u implements h00.a<b0> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f56791a = new b();

        b() {
            super(0);
        }

        @Override // h00.a
        public /* bridge */ /* synthetic */ b0 invoke() {
            invoke2();
            return b0.f54756a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    /* loaded from: classes.dex */
    static final class c extends kotlin.jvm.internal.u implements h00.a<b0> {
        c() {
            super(0);
        }

        @Override // h00.a
        public /* bridge */ /* synthetic */ b0 invoke() {
            invoke2();
            return b0.f54756a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            l.this.f();
        }
    }

    public l() {
        super(null);
        x1.b bVar = new x1.b();
        bVar.m(BitmapDescriptorFactory.HUE_RED);
        bVar.n(BitmapDescriptorFactory.HUE_RED);
        bVar.d(new c());
        this.f56781b = bVar;
        this.f56782c = true;
        this.f56783d = new x1.a();
        this.f56784e = b.f56791a;
        this.f56788i = s1.l.f49969b.a();
        this.f56789j = new a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f() {
        this.f56782c = true;
        this.f56784e.invoke();
    }

    @Override // x1.j
    public void a(v1.e eVar) {
        kotlin.jvm.internal.s.g(eVar, "<this>");
        g(eVar, 1.0f, null);
    }

    public final void g(v1.e eVar, float f11, t1.b0 b0Var) {
        kotlin.jvm.internal.s.g(eVar, "<this>");
        if (b0Var == null) {
            b0Var = this.f56785f;
        }
        if (this.f56782c || !s1.l.f(this.f56788i, eVar.c())) {
            this.f56781b.p(s1.l.i(eVar.c()) / this.f56786g);
            this.f56781b.q(s1.l.g(eVar.c()) / this.f56787h);
            this.f56783d.b(x2.p.a((int) Math.ceil(s1.l.i(eVar.c())), (int) Math.ceil(s1.l.g(eVar.c()))), eVar, eVar.getLayoutDirection(), this.f56789j);
            this.f56782c = false;
            this.f56788i = eVar.c();
        }
        this.f56783d.c(eVar, f11, b0Var);
    }

    public final t1.b0 h() {
        return this.f56785f;
    }

    public final String i() {
        return this.f56781b.e();
    }

    public final x1.b j() {
        return this.f56781b;
    }

    public final float k() {
        return this.f56787h;
    }

    public final float l() {
        return this.f56786g;
    }

    public final void m(t1.b0 b0Var) {
        this.f56785f = b0Var;
    }

    public final void n(h00.a<b0> aVar) {
        kotlin.jvm.internal.s.g(aVar, "<set-?>");
        this.f56784e = aVar;
    }

    public final void o(String value) {
        kotlin.jvm.internal.s.g(value, "value");
        this.f56781b.l(value);
    }

    public final void p(float f11) {
        if (this.f56787h == f11) {
            return;
        }
        this.f56787h = f11;
        f();
    }

    public final void q(float f11) {
        if (this.f56786g == f11) {
            return;
        }
        this.f56786g = f11;
        f();
    }

    public String toString() {
        String str = "Params: \tname: " + i() + "\n\tviewportWidth: " + l() + "\n\tviewportHeight: " + k() + "\n";
        kotlin.jvm.internal.s.f(str, "StringBuilder().apply(builderAction).toString()");
        return str;
    }
}