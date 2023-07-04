package h10;

import h10.l;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import vz.n;
import w00.a0;
import w00.e0;
import wz.w;

/* loaded from: classes5.dex */
public final class g implements e0 {

    /* renamed from: a  reason: collision with root package name */
    private final h f28578a;

    /* renamed from: b  reason: collision with root package name */
    private final j20.a<u10.c, i10.h> f28579b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class a extends u implements h00.a<i10.h> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ l10.u f28581b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(l10.u uVar) {
            super(0);
            this.f28581b = uVar;
        }

        @Override // h00.a
        /* renamed from: a */
        public final i10.h invoke() {
            return new i10.h(g.this.f28578a, this.f28581b);
        }
    }

    public g(c components) {
        vz.k c11;
        s.g(components, "components");
        l.a aVar = l.a.f28594a;
        c11 = n.c(null);
        h hVar = new h(components, aVar, c11);
        this.f28578a = hVar;
        this.f28579b = hVar.e().c();
    }

    private final i10.h e(u10.c cVar) {
        l10.u b11 = this.f28578a.a().d().b(cVar);
        if (b11 == null) {
            return null;
        }
        return this.f28579b.a(cVar, new a(b11));
    }

    @Override // w00.b0
    public List<i10.h> a(u10.c fqName) {
        List<i10.h> m11;
        s.g(fqName, "fqName");
        m11 = w.m(e(fqName));
        return m11;
    }

    @Override // w00.e0
    public boolean b(u10.c fqName) {
        s.g(fqName, "fqName");
        return this.f28578a.a().d().b(fqName) == null;
    }

    @Override // w00.e0
    public void c(u10.c fqName, Collection<a0> packageFragments) {
        s.g(fqName, "fqName");
        s.g(packageFragments, "packageFragments");
        s20.a.a(packageFragments, e(fqName));
    }

    @Override // w00.b0
    /* renamed from: f */
    public List<u10.c> r(u10.c fqName, h00.l<? super u10.f, Boolean> nameFilter) {
        List<u10.c> i11;
        s.g(fqName, "fqName");
        s.g(nameFilter, "nameFilter");
        i10.h e11 = e(fqName);
        List<u10.c> K0 = e11 == null ? null : e11.K0();
        if (K0 != null) {
            return K0;
        }
        i11 = w.i();
        return i11;
    }

    public String toString() {
        return s.p("LazyJavaPackageFragmentProvider of module ", this.f28578a.a().m());
    }
}