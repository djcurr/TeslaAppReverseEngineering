package g20;

import w00.d0;

/* loaded from: classes5.dex */
public final class n implements g {

    /* renamed from: a  reason: collision with root package name */
    private final w00.b0 f27428a;

    public n(w00.b0 packageFragmentProvider) {
        kotlin.jvm.internal.s.g(packageFragmentProvider, "packageFragmentProvider");
        this.f27428a = packageFragmentProvider;
    }

    @Override // g20.g
    public f a(u10.b classId) {
        f a11;
        kotlin.jvm.internal.s.g(classId, "classId");
        w00.b0 b0Var = this.f27428a;
        u10.c h11 = classId.h();
        kotlin.jvm.internal.s.f(h11, "classId.packageFqName");
        for (w00.a0 a0Var : d0.c(b0Var, h11)) {
            if ((a0Var instanceof o) && (a11 = ((o) a0Var).F0().a(classId)) != null) {
                return a11;
            }
        }
        return null;
    }
}