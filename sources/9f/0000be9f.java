package x10;

import ch.qos.logback.classic.spi.CallerData;
import ch.qos.logback.core.CoreConstants;
import java.util.List;
import k20.k0;
import k20.v;
import k20.y0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.g;
import kotlin.reflect.jvm.internal.impl.types.checker.h;
import wz.w;

/* loaded from: classes5.dex */
public final class a extends k0 implements m20.d {

    /* renamed from: b  reason: collision with root package name */
    private final y0 f56922b;

    /* renamed from: c  reason: collision with root package name */
    private final b f56923c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f56924d;

    /* renamed from: e  reason: collision with root package name */
    private final g f56925e;

    public /* synthetic */ a(y0 y0Var, b bVar, boolean z11, g gVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(y0Var, (i11 & 2) != 0 ? new c(y0Var) : bVar, (i11 & 4) != 0 ? false : z11, (i11 & 8) != 0 ? g.f34943d1.b() : gVar);
    }

    @Override // k20.d0
    public List<y0> G0() {
        List<y0> i11;
        i11 = w.i();
        return i11;
    }

    @Override // k20.d0
    public boolean I0() {
        return this.f56924d;
    }

    @Override // k20.d0
    /* renamed from: Q0 */
    public b H0() {
        return this.f56923c;
    }

    @Override // k20.k0
    /* renamed from: R0 */
    public a O0(boolean z11) {
        return z11 == I0() ? this : new a(this.f56922b, H0(), z11, getAnnotations());
    }

    @Override // k20.j1
    /* renamed from: S0 */
    public a M0(h kotlinTypeRefiner) {
        s.g(kotlinTypeRefiner, "kotlinTypeRefiner");
        y0 m11 = this.f56922b.m(kotlinTypeRefiner);
        s.f(m11, "typeProjection.refine(kotlinTypeRefiner)");
        return new a(m11, H0(), I0(), getAnnotations());
    }

    @Override // k20.k0
    /* renamed from: T0 */
    public a P0(g newAnnotations) {
        s.g(newAnnotations, "newAnnotations");
        return new a(this.f56922b, H0(), I0(), newAnnotations);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.a
    public g getAnnotations() {
        return this.f56925e;
    }

    @Override // k20.d0
    public d20.h m() {
        d20.h i11 = v.i("No member resolution should be done on captured type, it used only during constraint system resolution", true);
        s.f(i11, "createErrorScope(\n      …solution\", true\n        )");
        return i11;
    }

    @Override // k20.k0
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Captured(");
        sb2.append(this.f56922b);
        sb2.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        sb2.append(I0() ? CallerData.NA : "");
        return sb2.toString();
    }

    public a(y0 typeProjection, b constructor, boolean z11, g annotations) {
        s.g(typeProjection, "typeProjection");
        s.g(constructor, "constructor");
        s.g(annotations, "annotations");
        this.f56922b = typeProjection;
        this.f56923c = constructor;
        this.f56924d = z11;
        this.f56925e = annotations;
    }
}