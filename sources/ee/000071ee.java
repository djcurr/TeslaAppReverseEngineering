package h2;

import kotlin.jvm.internal.DefaultConstructorMarker;
import v1.a;

/* loaded from: classes.dex */
public final class e implements g0 {

    /* renamed from: h  reason: collision with root package name */
    private static final h00.l<e, vz.b0> f28642h;

    /* renamed from: a  reason: collision with root package name */
    private final o f28643a;

    /* renamed from: b  reason: collision with root package name */
    private final q1.h f28644b;

    /* renamed from: c  reason: collision with root package name */
    private e f28645c;

    /* renamed from: d  reason: collision with root package name */
    private q1.f f28646d;

    /* renamed from: e  reason: collision with root package name */
    private final q1.b f28647e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f28648f;

    /* renamed from: g  reason: collision with root package name */
    private final h00.a<vz.b0> f28649g;

    /* loaded from: classes.dex */
    static final class a extends kotlin.jvm.internal.u implements h00.l<e, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f28650a = new a();

        a() {
            super(1);
        }

        public final void a(e drawEntity) {
            kotlin.jvm.internal.s.g(drawEntity, "drawEntity");
            if (drawEntity.isValid()) {
                drawEntity.f28648f = true;
                drawEntity.g().A1();
            }
        }

        @Override // h00.l
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ vz.b0 mo12invoke(e eVar) {
            a(eVar);
            return vz.b0.f54756a;
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* loaded from: classes.dex */
    public static final class c implements q1.b {

        /* renamed from: a  reason: collision with root package name */
        private final x2.d f28651a;

        c() {
            this.f28651a = e.this.f().K();
        }

        @Override // q1.b
        public long c() {
            return x2.p.b(e.this.g().e());
        }

        @Override // q1.b
        public x2.d getDensity() {
            return this.f28651a;
        }

        @Override // q1.b
        public x2.q getLayoutDirection() {
            return e.this.f().getLayoutDirection();
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
            q1.f fVar = e.this.f28646d;
            if (fVar != null) {
                fVar.U(e.this.f28647e);
            }
            e.this.f28648f = false;
        }
    }

    static {
        new b(null);
        f28642h = a.f28650a;
    }

    public e(o layoutNodeWrapper, q1.h modifier) {
        kotlin.jvm.internal.s.g(layoutNodeWrapper, "layoutNodeWrapper");
        kotlin.jvm.internal.s.g(modifier, "modifier");
        this.f28643a = layoutNodeWrapper;
        this.f28644b = modifier;
        this.f28646d = n();
        this.f28647e = new c();
        this.f28648f = true;
        this.f28649g = new d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final k f() {
        return this.f28643a.n1();
    }

    private final long j() {
        return this.f28643a.e();
    }

    private final q1.f n() {
        q1.h hVar = this.f28644b;
        if (hVar instanceof q1.f) {
            return (q1.f) hVar;
        }
        return null;
    }

    public final void e(t1.u canvas) {
        e eVar;
        v1.a aVar;
        kotlin.jvm.internal.s.g(canvas, "canvas");
        long b11 = x2.p.b(j());
        if (this.f28646d != null && this.f28648f) {
            n.a(f()).getSnapshotObserver().e(this, f28642h, this.f28649g);
        }
        m U = f().U();
        o oVar = this.f28643a;
        eVar = U.f28732b;
        U.f28732b = this;
        aVar = U.f28731a;
        f2.b0 p12 = oVar.p1();
        x2.q layoutDirection = oVar.p1().getLayoutDirection();
        a.C1210a D = aVar.D();
        x2.d a11 = D.a();
        x2.q b12 = D.b();
        t1.u c11 = D.c();
        long d11 = D.d();
        a.C1210a D2 = aVar.D();
        D2.j(p12);
        D2.k(layoutDirection);
        D2.i(canvas);
        D2.l(b11);
        canvas.m();
        h().X(U);
        canvas.h();
        a.C1210a D3 = aVar.D();
        D3.j(a11);
        D3.k(b12);
        D3.i(c11);
        D3.l(d11);
        U.f28732b = eVar;
    }

    public final o g() {
        return this.f28643a;
    }

    public final q1.h h() {
        return this.f28644b;
    }

    public final e i() {
        return this.f28645c;
    }

    @Override // h2.g0
    public boolean isValid() {
        return this.f28643a.h();
    }

    public final void k() {
        this.f28646d = n();
        this.f28648f = true;
        e eVar = this.f28645c;
        if (eVar == null) {
            return;
        }
        eVar.k();
    }

    public final void l(int i11, int i12) {
        this.f28648f = true;
        e eVar = this.f28645c;
        if (eVar == null) {
            return;
        }
        eVar.l(i11, i12);
    }

    public final void m(e eVar) {
        this.f28645c = eVar;
    }
}