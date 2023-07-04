package g20;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import w00.e0;
import wz.x0;

/* loaded from: classes5.dex */
public abstract class a implements e0 {

    /* renamed from: a  reason: collision with root package name */
    private final j20.n f27352a;

    /* renamed from: b  reason: collision with root package name */
    private final t f27353b;

    /* renamed from: c  reason: collision with root package name */
    private final w00.x f27354c;

    /* renamed from: d  reason: collision with root package name */
    protected j f27355d;

    /* renamed from: e  reason: collision with root package name */
    private final j20.h<u10.c, w00.a0> f27356e;

    /* renamed from: g20.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    static final class C0522a extends kotlin.jvm.internal.u implements h00.l<u10.c, w00.a0> {
        C0522a() {
            super(1);
        }

        @Override // h00.l
        /* renamed from: a */
        public final w00.a0 invoke(u10.c fqName) {
            kotlin.jvm.internal.s.g(fqName, "fqName");
            o d11 = a.this.d(fqName);
            if (d11 == null) {
                return null;
            }
            d11.H0(a.this.e());
            return d11;
        }
    }

    public a(j20.n storageManager, t finder, w00.x moduleDescriptor) {
        kotlin.jvm.internal.s.g(storageManager, "storageManager");
        kotlin.jvm.internal.s.g(finder, "finder");
        kotlin.jvm.internal.s.g(moduleDescriptor, "moduleDescriptor");
        this.f27352a = storageManager;
        this.f27353b = finder;
        this.f27354c = moduleDescriptor;
        this.f27356e = storageManager.h(new C0522a());
    }

    @Override // w00.b0
    public List<w00.a0> a(u10.c fqName) {
        List<w00.a0> m11;
        kotlin.jvm.internal.s.g(fqName, "fqName");
        m11 = wz.w.m(this.f27356e.invoke(fqName));
        return m11;
    }

    @Override // w00.e0
    public boolean b(u10.c fqName) {
        w00.y d11;
        kotlin.jvm.internal.s.g(fqName, "fqName");
        if (this.f27356e.e0(fqName)) {
            d11 = (w00.a0) this.f27356e.invoke(fqName);
        } else {
            d11 = d(fqName);
        }
        return d11 == null;
    }

    @Override // w00.e0
    public void c(u10.c fqName, Collection<w00.a0> packageFragments) {
        kotlin.jvm.internal.s.g(fqName, "fqName");
        kotlin.jvm.internal.s.g(packageFragments, "packageFragments");
        s20.a.a(packageFragments, this.f27356e.invoke(fqName));
    }

    protected abstract o d(u10.c cVar);

    protected final j e() {
        j jVar = this.f27355d;
        if (jVar != null) {
            return jVar;
        }
        kotlin.jvm.internal.s.x("components");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final t f() {
        return this.f27353b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final w00.x g() {
        return this.f27354c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final j20.n h() {
        return this.f27352a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void i(j jVar) {
        kotlin.jvm.internal.s.g(jVar, "<set-?>");
        this.f27355d = jVar;
    }

    @Override // w00.b0
    public Collection<u10.c> r(u10.c fqName, h00.l<? super u10.f, Boolean> nameFilter) {
        Set d11;
        kotlin.jvm.internal.s.g(fqName, "fqName");
        kotlin.jvm.internal.s.g(nameFilter, "nameFilter");
        d11 = x0.d();
        return d11;
    }
}