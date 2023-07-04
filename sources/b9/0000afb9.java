package r1;

import androidx.compose.ui.platform.x0;
import androidx.compose.ui.platform.y0;
import g2.d;
import o1.f;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    private static final g2.f<Boolean> f48996a = g2.c.a(a.f48998a);

    /* renamed from: b  reason: collision with root package name */
    private static final o1.f f48997b = o1.f.f42062f1.g0(new b()).g0(new c());

    /* loaded from: classes.dex */
    static final class a extends kotlin.jvm.internal.u implements h00.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f48998a = new a();

        a() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // h00.a
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements g2.d<p> {
        b() {
        }

        @Override // o1.f
        public <R> R C(R r11, h00.p<? super R, ? super f.c, ? extends R> pVar) {
            return (R) d.a.b(this, r11, pVar);
        }

        @Override // g2.d
        /* renamed from: a */
        public p getValue() {
            return r1.a.f48969a;
        }

        @Override // o1.f
        public <R> R a0(R r11, h00.p<? super f.c, ? super R, ? extends R> pVar) {
            return (R) d.a.c(this, r11, pVar);
        }

        @Override // o1.f
        public o1.f g0(o1.f fVar) {
            return d.a.d(this, fVar);
        }

        @Override // g2.d
        public g2.f<p> getKey() {
            return q.b();
        }

        @Override // o1.f
        public boolean p(h00.l<? super f.c, Boolean> lVar) {
            return d.a.a(this, lVar);
        }
    }

    /* loaded from: classes.dex */
    public static final class c implements g2.d<Boolean> {
        c() {
        }

        @Override // o1.f
        public <R> R C(R r11, h00.p<? super R, ? super f.c, ? extends R> pVar) {
            return (R) d.a.b(this, r11, pVar);
        }

        @Override // g2.d
        /* renamed from: a */
        public Boolean getValue() {
            return Boolean.FALSE;
        }

        @Override // o1.f
        public <R> R a0(R r11, h00.p<? super f.c, ? super R, ? extends R> pVar) {
            return (R) d.a.c(this, r11, pVar);
        }

        @Override // o1.f
        public o1.f g0(o1.f fVar) {
            return d.a.d(this, fVar);
        }

        @Override // g2.d
        public g2.f<Boolean> getKey() {
            return k.c();
        }

        @Override // o1.f
        public boolean p(h00.l<? super f.c, Boolean> lVar) {
            return d.a.a(this, lVar);
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends kotlin.jvm.internal.u implements h00.l<y0, vz.b0> {
        public d() {
            super(1);
        }

        public final void a(y0 y0Var) {
            kotlin.jvm.internal.s.g(y0Var, "$this$null");
            y0Var.b("focusTarget");
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ vz.b0 invoke(y0 y0Var) {
            a(y0Var);
            return vz.b0.f54756a;
        }
    }

    /* loaded from: classes.dex */
    static final class e extends kotlin.jvm.internal.u implements h00.q<o1.f, c1.i, Integer, o1.f> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f48999a = new e();

        e() {
            super(3);
        }

        public final o1.f a(o1.f composed, c1.i iVar, int i11) {
            kotlin.jvm.internal.s.g(composed, "$this$composed");
            iVar.x(1906540397);
            iVar.x(-3687241);
            Object y11 = iVar.y();
            if (y11 == c1.i.f8486a.a()) {
                y11 = new j(x.Inactive, null, 2, null);
                iVar.p(y11);
            }
            iVar.N();
            o1.f b11 = k.b(composed, (j) y11);
            iVar.N();
            return b11;
        }

        @Override // h00.q
        public /* bridge */ /* synthetic */ o1.f invoke(o1.f fVar, c1.i iVar, Integer num) {
            return a(fVar, iVar, num.intValue());
        }
    }

    public static final o1.f a(o1.f fVar) {
        kotlin.jvm.internal.s.g(fVar, "<this>");
        return o1.e.a(fVar, x0.c() ? new d() : x0.a(), e.f48999a);
    }

    public static final o1.f b(o1.f fVar, j focusModifier) {
        kotlin.jvm.internal.s.g(fVar, "<this>");
        kotlin.jvm.internal.s.g(focusModifier, "focusModifier");
        return fVar.g0(focusModifier).g0(f48997b);
    }

    public static final g2.f<Boolean> c() {
        return f48996a;
    }
}