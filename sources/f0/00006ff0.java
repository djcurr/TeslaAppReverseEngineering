package g30;

import ch.qos.logback.core.CoreConstants;
import e30.f;
import e30.k;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public abstract class w0 implements e30.f {

    /* renamed from: a  reason: collision with root package name */
    private final String f27672a;

    /* renamed from: b  reason: collision with root package name */
    private final e30.f f27673b;

    /* renamed from: c  reason: collision with root package name */
    private final e30.f f27674c;

    /* renamed from: d  reason: collision with root package name */
    private final int f27675d;

    private w0(String str, e30.f fVar, e30.f fVar2) {
        this.f27672a = str;
        this.f27673b = fVar;
        this.f27674c = fVar2;
        this.f27675d = 2;
    }

    public /* synthetic */ w0(String str, e30.f fVar, e30.f fVar2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, fVar, fVar2);
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
        throw new IllegalArgumentException(name + " is not a valid map index");
    }

    @Override // e30.f
    public int d() {
        return this.f27675d;
    }

    @Override // e30.f
    public String e(int i11) {
        return String.valueOf(i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof w0) {
            w0 w0Var = (w0) obj;
            return kotlin.jvm.internal.s.c(h(), w0Var.h()) && kotlin.jvm.internal.s.c(this.f27673b, w0Var.f27673b) && kotlin.jvm.internal.s.c(this.f27674c, w0Var.f27674c);
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
            int i12 = i11 % 2;
            if (i12 != 0) {
                if (i12 == 1) {
                    return this.f27674c;
                }
                throw new IllegalStateException("Unreached".toString());
            }
            return this.f27673b;
        }
        throw new IllegalArgumentException(("Illegal index " + i11 + ", " + h() + " expects only non-negative indices").toString());
    }

    @Override // e30.f
    public List<Annotation> getAnnotations() {
        return f.a.a(this);
    }

    @Override // e30.f
    public e30.j getKind() {
        return k.c.f24592a;
    }

    @Override // e30.f
    public String h() {
        return this.f27672a;
    }

    public int hashCode() {
        return (((h().hashCode() * 31) + this.f27673b.hashCode()) * 31) + this.f27674c.hashCode();
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
        return h() + CoreConstants.LEFT_PARENTHESIS_CHAR + this.f27673b + ", " + this.f27674c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}