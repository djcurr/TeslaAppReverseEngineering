package g30;

import ch.qos.logback.core.CoreConstants;
import e30.f;
import e30.k;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public abstract class r0 implements e30.f {

    /* renamed from: a  reason: collision with root package name */
    private final e30.f f27630a;

    /* renamed from: b  reason: collision with root package name */
    private final int f27631b;

    private r0(e30.f fVar) {
        this.f27630a = fVar;
        this.f27631b = 1;
    }

    public /* synthetic */ r0(e30.f fVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(fVar);
    }

    @Override // e30.f
    public boolean b() {
        return f.a.c(this);
    }

    @Override // e30.f
    public int c(String name) {
        Integer n11;
        kotlin.jvm.internal.s.g(name, "name");
        n11 = kotlin.text.u.n(name);
        if (n11 != null) {
            return n11.intValue();
        }
        throw new IllegalArgumentException(name + " is not a valid list index");
    }

    @Override // e30.f
    public int d() {
        return this.f27631b;
    }

    @Override // e30.f
    public String e(int i11) {
        return String.valueOf(i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof r0) {
            r0 r0Var = (r0) obj;
            return kotlin.jvm.internal.s.c(this.f27630a, r0Var.f27630a) && kotlin.jvm.internal.s.c(h(), r0Var.h());
        }
        return false;
    }

    @Override // e30.f
    public List<Annotation> f(int i11) {
        List<Annotation> i12;
        if (i11 >= 0) {
            i12 = wz.w.i();
            return i12;
        }
        throw new IllegalArgumentException(("Illegal index " + i11 + ", " + h() + " expects only non-negative indices").toString());
    }

    @Override // e30.f
    public e30.f g(int i11) {
        if (i11 >= 0) {
            return this.f27630a;
        }
        throw new IllegalArgumentException(("Illegal index " + i11 + ", " + h() + " expects only non-negative indices").toString());
    }

    @Override // e30.f
    public List<Annotation> getAnnotations() {
        return f.a.a(this);
    }

    @Override // e30.f
    public e30.j getKind() {
        return k.b.f24591a;
    }

    public int hashCode() {
        return (this.f27630a.hashCode() * 31) + h().hashCode();
    }

    @Override // e30.f
    public boolean i(int i11) {
        if (i11 >= 0) {
            return false;
        }
        throw new IllegalArgumentException(("Illegal index " + i11 + ", " + h() + " expects only non-negative indices").toString());
    }

    @Override // e30.f
    public boolean isInline() {
        return f.a.b(this);
    }

    public String toString() {
        return h() + CoreConstants.LEFT_PARENTHESIS_CHAR + this.f27630a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}