package r0;

import c1.o0;
import c1.s1;
import f2.p0;
import kotlin.jvm.internal.u;
import o1.f;
import vz.b0;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a  reason: collision with root package name */
    private final o0<r0.b> f48914a;

    /* renamed from: b  reason: collision with root package name */
    private r0.b f48915b;

    /* renamed from: c  reason: collision with root package name */
    private f2.o0 f48916c;

    /* renamed from: d  reason: collision with root package name */
    private final p0 f48917d;

    /* renamed from: e  reason: collision with root package name */
    private h00.a<? extends f> f48918e;

    /* renamed from: f  reason: collision with root package name */
    private i f48919f;

    /* loaded from: classes.dex */
    static final class a extends u implements h00.a<s> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f48920a = new a();

        a() {
            super(0);
        }

        @Override // h00.a
        /* renamed from: a */
        public final s invoke() {
            return s.f48922a;
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements p0 {
        b() {
        }

        @Override // o1.f
        public <R> R C(R r11, h00.p<? super R, ? super f.c, ? extends R> pVar) {
            return (R) p0.a.b(this, r11, pVar);
        }

        @Override // f2.p0
        public void D(f2.o0 remeasurement) {
            kotlin.jvm.internal.s.g(remeasurement, "remeasurement");
            p.this.f48916c = remeasurement;
        }

        @Override // o1.f
        public <R> R a0(R r11, h00.p<? super f.c, ? super R, ? extends R> pVar) {
            return (R) p0.a.c(this, r11, pVar);
        }

        @Override // o1.f
        public o1.f g0(o1.f fVar) {
            return p0.a.d(this, fVar);
        }

        @Override // o1.f
        public boolean p(h00.l<? super f.c, Boolean> lVar) {
            return p0.a.a(this, lVar);
        }
    }

    public p() {
        o0<r0.b> d11;
        d11 = s1.d(r0.a.f48859a, null, 2, null);
        this.f48914a = d11;
        this.f48917d = new b();
        this.f48918e = a.f48920a;
    }

    public final h00.a<f> b() {
        return this.f48918e;
    }

    public final o0<r0.b> c() {
        return this.f48914a;
    }

    public final i d() {
        return this.f48919f;
    }

    public final p0 e() {
        return this.f48917d;
    }

    public final b0 f() {
        f2.o0 o0Var = this.f48916c;
        if (o0Var == null) {
            return null;
        }
        o0Var.c();
        return b0.f54756a;
    }

    public final void g(h00.a<? extends f> aVar) {
        kotlin.jvm.internal.s.g(aVar, "<set-?>");
        this.f48918e = aVar;
    }

    public final void h(r0.b bVar) {
        kotlin.jvm.internal.s.g(bVar, "<set-?>");
        this.f48915b = bVar;
    }

    public final void i(i iVar) {
        this.f48919f = iVar;
    }
}