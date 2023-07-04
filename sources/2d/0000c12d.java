package y00;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes5.dex */
public final class i implements w00.e0 {

    /* renamed from: a  reason: collision with root package name */
    private final List<w00.b0> f58814a;

    /* renamed from: b  reason: collision with root package name */
    private final String f58815b;

    /* JADX WARN: Multi-variable type inference failed */
    public i(List<? extends w00.b0> providers, String debugName) {
        Set S0;
        kotlin.jvm.internal.s.g(providers, "providers");
        kotlin.jvm.internal.s.g(debugName, "debugName");
        this.f58814a = providers;
        this.f58815b = debugName;
        providers.size();
        S0 = wz.e0.S0(providers);
        S0.size();
    }

    @Override // w00.b0
    public List<w00.a0> a(u10.c fqName) {
        List<w00.a0> O0;
        kotlin.jvm.internal.s.g(fqName, "fqName");
        ArrayList arrayList = new ArrayList();
        for (w00.b0 b0Var : this.f58814a) {
            w00.d0.a(b0Var, fqName, arrayList);
        }
        O0 = wz.e0.O0(arrayList);
        return O0;
    }

    @Override // w00.e0
    public boolean b(u10.c fqName) {
        kotlin.jvm.internal.s.g(fqName, "fqName");
        List<w00.b0> list = this.f58814a;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        for (w00.b0 b0Var : list) {
            if (!w00.d0.b(b0Var, fqName)) {
                return false;
            }
        }
        return true;
    }

    @Override // w00.e0
    public void c(u10.c fqName, Collection<w00.a0> packageFragments) {
        kotlin.jvm.internal.s.g(fqName, "fqName");
        kotlin.jvm.internal.s.g(packageFragments, "packageFragments");
        for (w00.b0 b0Var : this.f58814a) {
            w00.d0.a(b0Var, fqName, packageFragments);
        }
    }

    @Override // w00.b0
    public Collection<u10.c> r(u10.c fqName, h00.l<? super u10.f, Boolean> nameFilter) {
        kotlin.jvm.internal.s.g(fqName, "fqName");
        kotlin.jvm.internal.s.g(nameFilter, "nameFilter");
        HashSet hashSet = new HashSet();
        for (w00.b0 b0Var : this.f58814a) {
            hashSet.addAll(b0Var.r(fqName, nameFilter));
        }
        return hashSet;
    }

    public String toString() {
        return this.f58815b;
    }
}