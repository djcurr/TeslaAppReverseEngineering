package e10;

import w00.i0;
import w10.e;

/* loaded from: classes5.dex */
public final class n implements w10.e {
    @Override // w10.e
    public e.b a(kotlin.reflect.jvm.internal.impl.descriptors.a superDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.a subDescriptor, w00.c cVar) {
        kotlin.jvm.internal.s.g(superDescriptor, "superDescriptor");
        kotlin.jvm.internal.s.g(subDescriptor, "subDescriptor");
        if ((subDescriptor instanceof i0) && (superDescriptor instanceof i0)) {
            i0 i0Var = (i0) subDescriptor;
            i0 i0Var2 = (i0) superDescriptor;
            if (kotlin.jvm.internal.s.c(i0Var.getName(), i0Var2.getName())) {
                if (i10.c.a(i0Var) && i10.c.a(i0Var2)) {
                    return e.b.OVERRIDABLE;
                }
                if (!i10.c.a(i0Var) && !i10.c.a(i0Var2)) {
                    return e.b.UNKNOWN;
                }
                return e.b.INCOMPATIBLE;
            }
            return e.b.UNKNOWN;
        }
        return e.b.UNKNOWN;
    }

    @Override // w10.e
    public e.a b() {
        return e.a.BOTH;
    }
}