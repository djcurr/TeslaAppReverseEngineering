package n10;

import java.util.Collection;
import k20.d0;
import n10.w;
import wz.e0;

/* loaded from: classes5.dex */
public final class x implements w<j> {

    /* renamed from: a  reason: collision with root package name */
    public static final x f40230a = new x();

    private x() {
    }

    @Override // n10.w
    public String a(w00.c classDescriptor) {
        kotlin.jvm.internal.s.g(classDescriptor, "classDescriptor");
        return null;
    }

    @Override // n10.w
    public boolean b() {
        return w.a.c(this);
    }

    @Override // n10.w
    public d0 c(d0 d0Var) {
        return w.a.b(this, d0Var);
    }

    @Override // n10.w
    public void d(d0 kotlinType, w00.c descriptor) {
        kotlin.jvm.internal.s.g(kotlinType, "kotlinType");
        kotlin.jvm.internal.s.g(descriptor, "descriptor");
    }

    @Override // n10.w
    public String e(w00.c cVar) {
        return w.a.a(this, cVar);
    }

    @Override // n10.w
    public d0 f(Collection<? extends d0> types) {
        String l02;
        kotlin.jvm.internal.s.g(types, "types");
        l02 = e0.l0(types, null, null, null, 0, null, null, 63, null);
        throw new AssertionError(kotlin.jvm.internal.s.p("There should be no intersection type in existing descriptors, but found: ", l02));
    }

    @Override // n10.w
    /* renamed from: h */
    public j g(w00.c classDescriptor) {
        kotlin.jvm.internal.s.g(classDescriptor, "classDescriptor");
        return null;
    }
}