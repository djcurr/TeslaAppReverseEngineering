package e30;

import ch.qos.logback.core.CoreConstants;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
final class c implements f {

    /* renamed from: a  reason: collision with root package name */
    private final f f24553a;

    /* renamed from: b  reason: collision with root package name */
    public final n00.d<?> f24554b;

    /* renamed from: c  reason: collision with root package name */
    private final String f24555c;

    public c(f original, n00.d<?> kClass) {
        s.g(original, "original");
        s.g(kClass, "kClass");
        this.f24553a = original;
        this.f24554b = kClass;
        this.f24555c = original.h() + '<' + kClass.o() + '>';
    }

    @Override // e30.f
    public boolean b() {
        return this.f24553a.b();
    }

    @Override // e30.f
    public int c(String name) {
        s.g(name, "name");
        return this.f24553a.c(name);
    }

    @Override // e30.f
    public int d() {
        return this.f24553a.d();
    }

    @Override // e30.f
    public String e(int i11) {
        return this.f24553a.e(i11);
    }

    public boolean equals(Object obj) {
        c cVar = obj instanceof c ? (c) obj : null;
        return cVar != null && s.c(this.f24553a, cVar.f24553a) && s.c(cVar.f24554b, this.f24554b);
    }

    @Override // e30.f
    public List<Annotation> f(int i11) {
        return this.f24553a.f(i11);
    }

    @Override // e30.f
    public f g(int i11) {
        return this.f24553a.g(i11);
    }

    @Override // e30.f
    public List<Annotation> getAnnotations() {
        return this.f24553a.getAnnotations();
    }

    @Override // e30.f
    public j getKind() {
        return this.f24553a.getKind();
    }

    @Override // e30.f
    public String h() {
        return this.f24555c;
    }

    public int hashCode() {
        return (this.f24554b.hashCode() * 31) + h().hashCode();
    }

    @Override // e30.f
    public boolean i(int i11) {
        return this.f24553a.i(i11);
    }

    @Override // e30.f
    public boolean isInline() {
        return this.f24553a.isInline();
    }

    public String toString() {
        return "ContextDescriptor(kClass: " + this.f24554b + ", original: " + this.f24553a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}