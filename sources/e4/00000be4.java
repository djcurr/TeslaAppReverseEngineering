package b10;

import b10.f;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public final class x extends n implements f, l10.y {

    /* renamed from: a  reason: collision with root package name */
    private final TypeVariable<?> f7325a;

    public x(TypeVariable<?> typeVariable) {
        kotlin.jvm.internal.s.g(typeVariable, "typeVariable");
        this.f7325a = typeVariable;
    }

    @Override // l10.d
    public boolean C() {
        return f.a.c(this);
    }

    @Override // l10.d
    /* renamed from: P */
    public c l(u10.c cVar) {
        return f.a.a(this, cVar);
    }

    @Override // l10.d
    /* renamed from: Q */
    public List<c> getAnnotations() {
        return f.a.b(this);
    }

    @Override // l10.y
    /* renamed from: R */
    public List<l> getUpperBounds() {
        List<l> i11;
        Type[] bounds = this.f7325a.getBounds();
        kotlin.jvm.internal.s.f(bounds, "typeVariable.bounds");
        ArrayList arrayList = new ArrayList(bounds.length);
        for (Type type : bounds) {
            arrayList.add(new l(type));
        }
        l lVar = (l) wz.u.E0(arrayList);
        if (kotlin.jvm.internal.s.c(lVar == null ? null : lVar.P(), Object.class)) {
            i11 = wz.w.i();
            return i11;
        }
        return arrayList;
    }

    public boolean equals(Object obj) {
        return (obj instanceof x) && kotlin.jvm.internal.s.c(this.f7325a, ((x) obj).f7325a);
    }

    @Override // b10.f
    public AnnotatedElement getElement() {
        TypeVariable<?> typeVariable = this.f7325a;
        if (typeVariable instanceof AnnotatedElement) {
            return (AnnotatedElement) typeVariable;
        }
        return null;
    }

    @Override // l10.t
    public u10.f getName() {
        u10.f f11 = u10.f.f(this.f7325a.getName());
        kotlin.jvm.internal.s.f(f11, "identifier(typeVariable.name)");
        return f11;
    }

    public int hashCode() {
        return this.f7325a.hashCode();
    }

    public String toString() {
        return x.class.getName() + ": " + this.f7325a;
    }
}