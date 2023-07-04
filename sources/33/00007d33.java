package k20;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public class u extends k0 {

    /* renamed from: b  reason: collision with root package name */
    private final w0 f34327b;

    /* renamed from: c  reason: collision with root package name */
    private final d20.h f34328c;

    /* renamed from: d  reason: collision with root package name */
    private final List<y0> f34329d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f34330e;

    /* renamed from: f  reason: collision with root package name */
    private final String f34331f;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public u(w0 constructor, d20.h memberScope) {
        this(constructor, memberScope, null, false, null, 28, null);
        kotlin.jvm.internal.s.g(constructor, "constructor");
        kotlin.jvm.internal.s.g(memberScope, "memberScope");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public u(w0 constructor, d20.h memberScope, List<? extends y0> arguments, boolean z11) {
        this(constructor, memberScope, arguments, z11, null, 16, null);
        kotlin.jvm.internal.s.g(constructor, "constructor");
        kotlin.jvm.internal.s.g(memberScope, "memberScope");
        kotlin.jvm.internal.s.g(arguments, "arguments");
    }

    public /* synthetic */ u(w0 w0Var, d20.h hVar, List list, boolean z11, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(w0Var, hVar, (i11 & 4) != 0 ? wz.w.i() : list, (i11 & 8) != 0 ? false : z11, (i11 & 16) != 0 ? "???" : str);
    }

    @Override // k20.d0
    public List<y0> G0() {
        return this.f34329d;
    }

    @Override // k20.d0
    public w0 H0() {
        return this.f34327b;
    }

    @Override // k20.d0
    public boolean I0() {
        return this.f34330e;
    }

    @Override // k20.j1
    /* renamed from: O0 */
    public k0 L0(boolean z11) {
        return new u(H0(), m(), G0(), z11, null, 16, null);
    }

    @Override // k20.j1
    /* renamed from: P0 */
    public k0 N0(kotlin.reflect.jvm.internal.impl.descriptors.annotations.g newAnnotations) {
        kotlin.jvm.internal.s.g(newAnnotations, "newAnnotations");
        return this;
    }

    public String Q0() {
        return this.f34331f;
    }

    @Override // k20.j1
    /* renamed from: R0 */
    public u M0(kotlin.reflect.jvm.internal.impl.types.checker.h kotlinTypeRefiner) {
        kotlin.jvm.internal.s.g(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.a
    public kotlin.reflect.jvm.internal.impl.descriptors.annotations.g getAnnotations() {
        return kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f34943d1.b();
    }

    @Override // k20.d0
    public d20.h m() {
        return this.f34328c;
    }

    @Override // k20.k0
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(H0());
        sb2.append(G0().isEmpty() ? "" : wz.e0.k0(G0(), ", ", "<", ">", -1, "...", null));
        return sb2.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public u(w0 constructor, d20.h memberScope, List<? extends y0> arguments, boolean z11, String presentableName) {
        kotlin.jvm.internal.s.g(constructor, "constructor");
        kotlin.jvm.internal.s.g(memberScope, "memberScope");
        kotlin.jvm.internal.s.g(arguments, "arguments");
        kotlin.jvm.internal.s.g(presentableName, "presentableName");
        this.f34327b = constructor;
        this.f34328c = memberScope;
        this.f34329d = arguments;
        this.f34330e = z11;
        this.f34331f = presentableName;
    }
}