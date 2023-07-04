package y10;

import ch.qos.logback.core.CoreConstants;
import k20.k0;

/* loaded from: classes5.dex */
public final class v extends g<String> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(String value) {
        super(value);
        kotlin.jvm.internal.s.g(value, "value");
    }

    @Override // y10.g
    /* renamed from: c */
    public k0 a(w00.x module) {
        kotlin.jvm.internal.s.g(module, "module");
        k0 W = module.l().W();
        kotlin.jvm.internal.s.f(W, "module.builtIns.stringType");
        return W;
    }

    @Override // y10.g
    public String toString() {
        return CoreConstants.DOUBLE_QUOTE_CHAR + b() + CoreConstants.DOUBLE_QUOTE_CHAR;
    }
}