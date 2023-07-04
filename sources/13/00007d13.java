package k20;

import java.util.List;

/* loaded from: classes5.dex */
public final class i1 extends u {

    /* renamed from: g  reason: collision with root package name */
    private final String f34291g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(String presentableName, w0 constructor, d20.h memberScope, List<? extends y0> arguments, boolean z11) {
        super(constructor, memberScope, arguments, z11, null, 16, null);
        kotlin.jvm.internal.s.g(presentableName, "presentableName");
        kotlin.jvm.internal.s.g(constructor, "constructor");
        kotlin.jvm.internal.s.g(memberScope, "memberScope");
        kotlin.jvm.internal.s.g(arguments, "arguments");
        this.f34291g = presentableName;
    }

    @Override // k20.u, k20.j1
    /* renamed from: O0 */
    public k0 L0(boolean z11) {
        return new i1(Q0(), H0(), m(), G0(), z11);
    }

    @Override // k20.u
    public String Q0() {
        return this.f34291g;
    }

    @Override // k20.u
    /* renamed from: S0 */
    public i1 R0(kotlin.reflect.jvm.internal.impl.types.checker.h kotlinTypeRefiner) {
        kotlin.jvm.internal.s.g(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
    }
}