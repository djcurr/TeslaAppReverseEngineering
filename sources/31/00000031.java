package a10;

import java.io.InputStream;
import kotlin.jvm.internal.s;
import n10.m;

/* loaded from: classes5.dex */
public final class g implements n10.m {

    /* renamed from: a  reason: collision with root package name */
    private final ClassLoader f120a;

    /* renamed from: b  reason: collision with root package name */
    private final h20.d f121b;

    public g(ClassLoader classLoader) {
        s.g(classLoader, "classLoader");
        this.f120a = classLoader;
        this.f121b = new h20.d();
    }

    private final m.a d(String str) {
        f a11;
        Class<?> a12 = e.a(this.f120a, str);
        if (a12 == null || (a11 = f.f117c.a(a12)) == null) {
            return null;
        }
        return new m.a.b(a11, null, 2, null);
    }

    @Override // g20.t
    public InputStream a(u10.c packageFqName) {
        s.g(packageFqName, "packageFqName");
        if (packageFqName.i(t00.k.f51316k)) {
            return this.f121b.a(h20.a.f28772m.n(packageFqName));
        }
        return null;
    }

    @Override // n10.m
    public m.a b(l10.g javaClass) {
        s.g(javaClass, "javaClass");
        u10.c e11 = javaClass.e();
        String b11 = e11 == null ? null : e11.b();
        if (b11 == null) {
            return null;
        }
        return d(b11);
    }

    @Override // n10.m
    public m.a c(u10.b classId) {
        String b11;
        s.g(classId, "classId");
        b11 = h.b(classId);
        return d(b11);
    }
}