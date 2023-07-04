package e20;

import ch.qos.logback.core.CoreConstants;
import k20.k0;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public class c implements d, f {

    /* renamed from: a  reason: collision with root package name */
    private final w00.c f24545a;

    /* renamed from: b  reason: collision with root package name */
    private final w00.c f24546b;

    public c(w00.c classDescriptor, c cVar) {
        s.g(classDescriptor, "classDescriptor");
        this.f24545a = classDescriptor;
        this.f24546b = classDescriptor;
    }

    @Override // e20.d
    /* renamed from: b */
    public k0 getType() {
        k0 n11 = this.f24545a.n();
        s.f(n11, "classDescriptor.defaultType");
        return n11;
    }

    public boolean equals(Object obj) {
        w00.c cVar = this.f24545a;
        c cVar2 = obj instanceof c ? (c) obj : null;
        return s.c(cVar, cVar2 != null ? cVar2.f24545a : null);
    }

    public int hashCode() {
        return this.f24545a.hashCode();
    }

    @Override // e20.f
    public final w00.c q() {
        return this.f24545a;
    }

    public String toString() {
        return "Class{" + getType() + CoreConstants.CURLY_RIGHT;
    }
}