package u00;

import j20.n;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.s;
import kotlin.text.v;
import kotlin.text.w;
import t00.f;
import u00.c;
import w00.a0;
import w00.x;
import wz.u;
import wz.x0;

/* loaded from: classes5.dex */
public final class a implements x00.b {

    /* renamed from: a  reason: collision with root package name */
    private final n f52871a;

    /* renamed from: b  reason: collision with root package name */
    private final x f52872b;

    public a(n storageManager, x module) {
        s.g(storageManager, "storageManager");
        s.g(module, "module");
        this.f52871a = storageManager;
        this.f52872b = module;
    }

    @Override // x00.b
    public Collection<w00.c> a(u10.c packageFqName) {
        Set d11;
        s.g(packageFqName, "packageFqName");
        d11 = x0.d();
        return d11;
    }

    @Override // x00.b
    public w00.c b(u10.b classId) {
        boolean M;
        s.g(classId, "classId");
        if (classId.k() || classId.l()) {
            return null;
        }
        String b11 = classId.i().b();
        s.f(b11, "classId.relativeClassName.asString()");
        M = w.M(b11, "Function", false, 2, null);
        if (M) {
            u10.c h11 = classId.h();
            s.f(h11, "classId.packageFqName");
            c.a.C1189a c11 = c.Companion.c(b11, h11);
            if (c11 == null) {
                return null;
            }
            c a11 = c11.a();
            int b12 = c11.b();
            List<a0> e02 = this.f52872b.R(h11).e0();
            ArrayList arrayList = new ArrayList();
            for (Object obj : e02) {
                if (obj instanceof t00.b) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : arrayList) {
                if (obj2 instanceof f) {
                    arrayList2.add(obj2);
                }
            }
            a0 a0Var = (f) u.d0(arrayList2);
            if (a0Var == null) {
                a0Var = (t00.b) u.b0(arrayList);
            }
            return new b(this.f52871a, a0Var, a11, b12);
        }
        return null;
    }

    @Override // x00.b
    public boolean c(u10.c packageFqName, u10.f name) {
        boolean H;
        boolean H2;
        boolean H3;
        boolean H4;
        s.g(packageFqName, "packageFqName");
        s.g(name, "name");
        String b11 = name.b();
        s.f(b11, "name.asString()");
        H = v.H(b11, "Function", false, 2, null);
        if (!H) {
            H2 = v.H(b11, "KFunction", false, 2, null);
            if (!H2) {
                H3 = v.H(b11, "SuspendFunction", false, 2, null);
                if (!H3) {
                    H4 = v.H(b11, "KSuspendFunction", false, 2, null);
                    if (!H4) {
                        return false;
                    }
                }
            }
        }
        return c.Companion.c(b11, packageFqName) != null;
    }
}