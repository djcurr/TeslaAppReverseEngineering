package b10;

import java.lang.annotation.Annotation;
import java.util.List;
import l10.b0;

/* loaded from: classes5.dex */
public final class y extends n implements b0 {

    /* renamed from: a  reason: collision with root package name */
    private final w f7326a;

    /* renamed from: b  reason: collision with root package name */
    private final Annotation[] f7327b;

    /* renamed from: c  reason: collision with root package name */
    private final String f7328c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f7329d;

    public y(w type, Annotation[] reflectAnnotations, String str, boolean z11) {
        kotlin.jvm.internal.s.g(type, "type");
        kotlin.jvm.internal.s.g(reflectAnnotations, "reflectAnnotations");
        this.f7326a = type;
        this.f7327b = reflectAnnotations;
        this.f7328c = str;
        this.f7329d = z11;
    }

    @Override // l10.d
    public boolean C() {
        return false;
    }

    @Override // l10.d
    /* renamed from: P */
    public c l(u10.c fqName) {
        kotlin.jvm.internal.s.g(fqName, "fqName");
        return g.a(this.f7327b, fqName);
    }

    @Override // l10.d
    /* renamed from: Q */
    public List<c> getAnnotations() {
        return g.b(this.f7327b);
    }

    @Override // l10.b0
    /* renamed from: R */
    public w getType() {
        return this.f7326a;
    }

    @Override // l10.b0
    public boolean b() {
        return this.f7329d;
    }

    @Override // l10.b0
    public u10.f getName() {
        String str = this.f7328c;
        if (str == null) {
            return null;
        }
        return u10.f.e(str);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(y.class.getName());
        sb2.append(": ");
        sb2.append(b() ? "vararg " : "");
        sb2.append(getName());
        sb2.append(": ");
        sb2.append(getType());
        return sb2.toString();
    }
}