package r1;

import androidx.compose.ui.platform.x0;
import androidx.compose.ui.platform.y0;
import androidx.compose.ui.platform.z0;
import g2.b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o1.f;

/* loaded from: classes.dex */
public final class j extends z0 implements g2.b {

    /* renamed from: b  reason: collision with root package name */
    private x f48991b;

    /* renamed from: c  reason: collision with root package name */
    private h2.s f48992c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f48993d;

    /* renamed from: e  reason: collision with root package name */
    public h2.s f48994e;

    /* renamed from: f  reason: collision with root package name */
    public g2.e f48995f;

    public /* synthetic */ j(x xVar, h00.l lVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(xVar, (i11 & 2) != 0 ? x0.a() : lVar);
    }

    @Override // o1.f
    public <R> R C(R r11, h00.p<? super R, ? super f.c, ? extends R> pVar) {
        return (R) b.a.b(this, r11, pVar);
    }

    @Override // o1.f
    public <R> R a0(R r11, h00.p<? super f.c, ? super R, ? extends R> pVar) {
        return (R) b.a.c(this, r11, pVar);
    }

    public final h2.s b() {
        h2.s sVar = this.f48994e;
        if (sVar != null) {
            return sVar;
        }
        kotlin.jvm.internal.s.x("focusNode");
        return null;
    }

    public final x c() {
        return this.f48991b;
    }

    public final h2.s d() {
        return this.f48992c;
    }

    public final boolean e() {
        return this.f48993d;
    }

    public final g2.e f() {
        g2.e eVar = this.f48995f;
        if (eVar != null) {
            return eVar;
        }
        kotlin.jvm.internal.s.x("modifierLocalReadScope");
        return null;
    }

    public final void g(h2.s sVar) {
        kotlin.jvm.internal.s.g(sVar, "<set-?>");
        this.f48994e = sVar;
    }

    @Override // o1.f
    public o1.f g0(o1.f fVar) {
        return b.a.d(this, fVar);
    }

    public final void i(x xVar) {
        kotlin.jvm.internal.s.g(xVar, "<set-?>");
        this.f48991b = xVar;
    }

    public final void j(h2.s sVar) {
        this.f48992c = sVar;
    }

    public final void k(boolean z11) {
        this.f48993d = z11;
    }

    public final void l(g2.e eVar) {
        kotlin.jvm.internal.s.g(eVar, "<set-?>");
        this.f48995f = eVar;
    }

    @Override // g2.b
    public void n0(g2.e scope) {
        kotlin.jvm.internal.s.g(scope, "scope");
        l(scope);
        k(((Boolean) scope.g0(k.c())).booleanValue());
        q.c(b(), (p) scope.g0(q.b()));
    }

    @Override // o1.f
    public boolean p(h00.l<? super f.c, Boolean> lVar) {
        return b.a.a(this, lVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(x initialFocus, h00.l<? super y0, vz.b0> inspectorInfo) {
        super(inspectorInfo);
        kotlin.jvm.internal.s.g(initialFocus, "initialFocus");
        kotlin.jvm.internal.s.g(inspectorInfo, "inspectorInfo");
        this.f48991b = initialFocus;
    }
}