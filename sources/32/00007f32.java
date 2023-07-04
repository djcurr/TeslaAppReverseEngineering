package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.List;
import k20.j1;
import k20.k0;
import k20.y0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import w00.s0;

/* loaded from: classes5.dex */
public final class j extends k0 implements m20.d {

    /* renamed from: b  reason: collision with root package name */
    private final m20.b f35153b;

    /* renamed from: c  reason: collision with root package name */
    private final k f35154c;

    /* renamed from: d  reason: collision with root package name */
    private final j1 f35155d;

    /* renamed from: e  reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.descriptors.annotations.g f35156e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f35157f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f35158g;

    public /* synthetic */ j(m20.b bVar, k kVar, j1 j1Var, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, boolean z11, boolean z12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar, kVar, j1Var, (i11 & 8) != 0 ? kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f34943d1.b() : gVar, (i11 & 16) != 0 ? false : z11, (i11 & 32) != 0 ? false : z12);
    }

    @Override // k20.d0
    public List<y0> G0() {
        List<y0> i11;
        i11 = wz.w.i();
        return i11;
    }

    @Override // k20.d0
    public boolean I0() {
        return this.f35157f;
    }

    public final m20.b Q0() {
        return this.f35153b;
    }

    @Override // k20.d0
    /* renamed from: R0 */
    public k H0() {
        return this.f35154c;
    }

    public final j1 S0() {
        return this.f35155d;
    }

    public final boolean T0() {
        return this.f35158g;
    }

    @Override // k20.k0
    /* renamed from: U0 */
    public j O0(boolean z11) {
        return new j(this.f35153b, H0(), this.f35155d, getAnnotations(), z11, false, 32, null);
    }

    @Override // k20.j1
    /* renamed from: V0 */
    public j M0(h kotlinTypeRefiner) {
        kotlin.jvm.internal.s.g(kotlinTypeRefiner, "kotlinTypeRefiner");
        m20.b bVar = this.f35153b;
        k m11 = H0().m(kotlinTypeRefiner);
        j1 j1Var = this.f35155d;
        return new j(bVar, m11, j1Var == null ? null : kotlinTypeRefiner.g(j1Var).K0(), getAnnotations(), I0(), false, 32, null);
    }

    @Override // k20.k0
    /* renamed from: W0 */
    public j P0(kotlin.reflect.jvm.internal.impl.descriptors.annotations.g newAnnotations) {
        kotlin.jvm.internal.s.g(newAnnotations, "newAnnotations");
        return new j(this.f35153b, H0(), this.f35155d, newAnnotations, I0(), false, 32, null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.a
    public kotlin.reflect.jvm.internal.impl.descriptors.annotations.g getAnnotations() {
        return this.f35156e;
    }

    @Override // k20.d0
    public d20.h m() {
        d20.h i11 = k20.v.i("No member resolution should be done on captured type!", true);
        kotlin.jvm.internal.s.f(i11, "createErrorScope(\"No mem…on captured type!\", true)");
        return i11;
    }

    public j(m20.b captureStatus, k constructor, j1 j1Var, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g annotations, boolean z11, boolean z12) {
        kotlin.jvm.internal.s.g(captureStatus, "captureStatus");
        kotlin.jvm.internal.s.g(constructor, "constructor");
        kotlin.jvm.internal.s.g(annotations, "annotations");
        this.f35153b = captureStatus;
        this.f35154c = constructor;
        this.f35155d = j1Var;
        this.f35156e = annotations;
        this.f35157f = z11;
        this.f35158g = z12;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public j(m20.b captureStatus, j1 j1Var, y0 projection, s0 typeParameter) {
        this(captureStatus, new k(projection, null, null, typeParameter, 6, null), j1Var, null, false, false, 56, null);
        kotlin.jvm.internal.s.g(captureStatus, "captureStatus");
        kotlin.jvm.internal.s.g(projection, "projection");
        kotlin.jvm.internal.s.g(typeParameter, "typeParameter");
    }
}