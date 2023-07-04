package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import u20.p;
import wz.e0;

/* loaded from: classes5.dex */
public final class k implements g {

    /* renamed from: a  reason: collision with root package name */
    private final List<g> f34952a;

    /* loaded from: classes5.dex */
    static final class a extends u implements h00.l<g, c> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u10.c f34953a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(u10.c cVar) {
            super(1);
            this.f34953a = cVar;
        }

        @Override // h00.l
        /* renamed from: a */
        public final c invoke(g it2) {
            s.g(it2, "it");
            return it2.l(this.f34953a);
        }
    }

    /* loaded from: classes5.dex */
    static final class b extends u implements h00.l<g, u20.h<? extends c>> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f34954a = new b();

        b() {
            super(1);
        }

        @Override // h00.l
        /* renamed from: a */
        public final u20.h<c> invoke(g it2) {
            u20.h<c> S;
            s.g(it2, "it");
            S = e0.S(it2);
            return S;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public k(List<? extends g> delegates) {
        s.g(delegates, "delegates");
        this.f34952a = delegates;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.g
    public boolean b1(u10.c fqName) {
        u20.h<g> S;
        s.g(fqName, "fqName");
        S = e0.S(this.f34952a);
        for (g gVar : S) {
            if (gVar.b1(fqName)) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.g
    public boolean isEmpty() {
        List<g> list = this.f34952a;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        for (g gVar : list) {
            if (!gVar.isEmpty()) {
                return false;
            }
        }
        return true;
    }

    @Override // java.lang.Iterable
    public Iterator<c> iterator() {
        u20.h S;
        u20.h v11;
        S = e0.S(this.f34952a);
        v11 = p.v(S, b.f34954a);
        return v11.iterator();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.g
    public c l(u10.c fqName) {
        u20.h S;
        u20.h C;
        s.g(fqName, "fqName");
        S = e0.S(this.f34952a);
        C = p.C(S, new a(fqName));
        return (c) u20.k.u(C);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public k(kotlin.reflect.jvm.internal.impl.descriptors.annotations.g... r2) {
        /*
            r1 = this;
            java.lang.String r0 = "delegates"
            kotlin.jvm.internal.s.g(r2, r0)
            java.util.List r2 = wz.l.s0(r2)
            r1.<init>(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.descriptors.annotations.k.<init>(kotlin.reflect.jvm.internal.impl.descriptors.annotations.g[]):void");
    }
}