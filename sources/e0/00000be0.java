package b10;

import java.util.Collection;
import java.util.List;

/* loaded from: classes5.dex */
public final class u extends n implements l10.u {

    /* renamed from: a  reason: collision with root package name */
    private final u10.c f7320a;

    public u(u10.c fqName) {
        kotlin.jvm.internal.s.g(fqName, "fqName");
        this.f7320a = fqName;
    }

    @Override // l10.d
    public boolean C() {
        return false;
    }

    @Override // l10.u
    public Collection<l10.g> I(h00.l<? super u10.f, Boolean> nameFilter) {
        List i11;
        kotlin.jvm.internal.s.g(nameFilter, "nameFilter");
        i11 = wz.w.i();
        return i11;
    }

    @Override // l10.d
    /* renamed from: P */
    public List<l10.a> getAnnotations() {
        List<l10.a> i11;
        i11 = wz.w.i();
        return i11;
    }

    @Override // l10.u
    public u10.c e() {
        return this.f7320a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof u) && kotlin.jvm.internal.s.c(e(), ((u) obj).e());
    }

    public int hashCode() {
        return e().hashCode();
    }

    @Override // l10.d
    public l10.a l(u10.c fqName) {
        kotlin.jvm.internal.s.g(fqName, "fqName");
        return null;
    }

    public String toString() {
        return u.class.getName() + ": " + e();
    }

    @Override // l10.u
    public Collection<l10.u> v() {
        List i11;
        i11 = wz.w.i();
        return i11;
    }
}