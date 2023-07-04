package w00;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes5.dex */
public final class c0 implements e0 {

    /* renamed from: a  reason: collision with root package name */
    private final Collection<a0> f55287a;

    /* loaded from: classes5.dex */
    static final class a extends kotlin.jvm.internal.u implements h00.l<a0, u10.c> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f55288a = new a();

        a() {
            super(1);
        }

        @Override // h00.l
        /* renamed from: a */
        public final u10.c invoke(a0 it2) {
            kotlin.jvm.internal.s.g(it2, "it");
            return it2.e();
        }
    }

    /* loaded from: classes5.dex */
    static final class b extends kotlin.jvm.internal.u implements h00.l<u10.c, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u10.c f55289a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(u10.c cVar) {
            super(1);
            this.f55289a = cVar;
        }

        @Override // h00.l
        /* renamed from: a */
        public final Boolean invoke(u10.c it2) {
            kotlin.jvm.internal.s.g(it2, "it");
            return Boolean.valueOf(!it2.d() && kotlin.jvm.internal.s.c(it2.e(), this.f55289a));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c0(Collection<? extends a0> packageFragments) {
        kotlin.jvm.internal.s.g(packageFragments, "packageFragments");
        this.f55287a = packageFragments;
    }

    @Override // w00.b0
    public List<a0> a(u10.c fqName) {
        kotlin.jvm.internal.s.g(fqName, "fqName");
        Collection<a0> collection = this.f55287a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : collection) {
            if (kotlin.jvm.internal.s.c(((a0) obj).e(), fqName)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // w00.e0
    public boolean b(u10.c fqName) {
        kotlin.jvm.internal.s.g(fqName, "fqName");
        Collection<a0> collection = this.f55287a;
        if ((collection instanceof Collection) && collection.isEmpty()) {
            return true;
        }
        for (a0 a0Var : collection) {
            if (kotlin.jvm.internal.s.c(a0Var.e(), fqName)) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // w00.e0
    public void c(u10.c fqName, Collection<a0> packageFragments) {
        kotlin.jvm.internal.s.g(fqName, "fqName");
        kotlin.jvm.internal.s.g(packageFragments, "packageFragments");
        for (Object obj : this.f55287a) {
            if (kotlin.jvm.internal.s.c(((a0) obj).e(), fqName)) {
                packageFragments.add(obj);
            }
        }
    }

    @Override // w00.b0
    public Collection<u10.c> r(u10.c fqName, h00.l<? super u10.f, Boolean> nameFilter) {
        u20.h S;
        u20.h B;
        u20.h q11;
        List I;
        kotlin.jvm.internal.s.g(fqName, "fqName");
        kotlin.jvm.internal.s.g(nameFilter, "nameFilter");
        S = wz.e0.S(this.f55287a);
        B = u20.p.B(S, a.f55288a);
        q11 = u20.p.q(B, new b(fqName));
        I = u20.p.I(q11);
        return I;
    }
}