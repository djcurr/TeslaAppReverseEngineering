package b20;

import d20.h;
import h10.g;
import kotlin.jvm.internal.s;
import l10.d0;
import wz.u;

/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final g f7355a;

    /* renamed from: b  reason: collision with root package name */
    private final f10.g f7356b;

    public c(g packageFragmentProvider, f10.g javaResolverCache) {
        s.g(packageFragmentProvider, "packageFragmentProvider");
        s.g(javaResolverCache, "javaResolverCache");
        this.f7355a = packageFragmentProvider;
        this.f7356b = javaResolverCache;
    }

    public final g a() {
        return this.f7355a;
    }

    public final w00.c b(l10.g javaClass) {
        s.g(javaClass, "javaClass");
        u10.c e11 = javaClass.e();
        if (e11 != null && javaClass.K() == d0.SOURCE) {
            return this.f7356b.c(e11);
        }
        l10.g m11 = javaClass.m();
        if (m11 != null) {
            w00.c b11 = b(m11);
            h S = b11 == null ? null : b11.S();
            w00.e e12 = S == null ? null : S.e(javaClass.getName(), d10.d.FROM_JAVA_LOADER);
            if (e12 instanceof w00.c) {
                return (w00.c) e12;
            }
            return null;
        } else if (e11 == null) {
            return null;
        } else {
            g gVar = this.f7355a;
            u10.c e13 = e11.e();
            s.f(e13, "fqName.parent()");
            i10.h hVar = (i10.h) u.d0(gVar.a(e13));
            if (hVar == null) {
                return null;
            }
            return hVar.H0(javaClass);
        }
    }
}