package h30;

import java.util.Set;
import wz.x0;

/* loaded from: classes5.dex */
public final class f0 {

    /* renamed from: a  reason: collision with root package name */
    private static final Set<e30.f> f28842a;

    static {
        Set<e30.f> i11;
        i11 = x0.i(d30.a.z(vz.x.f54786b).getDescriptor(), d30.a.A(vz.y.f54788b).getDescriptor(), d30.a.y(vz.w.f54784b).getDescriptor(), d30.a.B(vz.a0.f54753b).getDescriptor());
        f28842a = i11;
    }

    public static final boolean a(e30.f fVar) {
        kotlin.jvm.internal.s.g(fVar, "<this>");
        return fVar.isInline() && f28842a.contains(fVar);
    }
}