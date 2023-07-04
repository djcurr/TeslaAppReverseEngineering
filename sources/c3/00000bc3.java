package b10;

import b10.d;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import l10.a;

/* loaded from: classes5.dex */
public final class c extends n implements l10.a {

    /* renamed from: a  reason: collision with root package name */
    private final Annotation f7294a;

    public c(Annotation annotation) {
        kotlin.jvm.internal.s.g(annotation, "annotation");
        this.f7294a = annotation;
    }

    @Override // l10.a
    public boolean E() {
        return a.C0696a.a(this);
    }

    public final Annotation P() {
        return this.f7294a;
    }

    @Override // l10.a
    /* renamed from: Q */
    public j u() {
        return new j(g00.a.b(g00.a.a(this.f7294a)));
    }

    @Override // l10.a
    public boolean d() {
        return a.C0696a.b(this);
    }

    public boolean equals(Object obj) {
        return (obj instanceof c) && kotlin.jvm.internal.s.c(this.f7294a, ((c) obj).f7294a);
    }

    @Override // l10.a
    public Collection<l10.b> f() {
        Method[] declaredMethods = g00.a.b(g00.a.a(this.f7294a)).getDeclaredMethods();
        kotlin.jvm.internal.s.f(declaredMethods, "annotation.annotationClass.java.declaredMethods");
        ArrayList arrayList = new ArrayList(declaredMethods.length);
        for (Method method : declaredMethods) {
            d.a aVar = d.f7295b;
            Object invoke = method.invoke(P(), new Object[0]);
            kotlin.jvm.internal.s.f(invoke, "method.invoke(annotation)");
            arrayList.add(aVar.a(invoke, u10.f.f(method.getName())));
        }
        return arrayList;
    }

    public int hashCode() {
        return this.f7294a.hashCode();
    }

    @Override // l10.a
    public u10.b j() {
        return b.a(g00.a.b(g00.a.a(this.f7294a)));
    }

    public String toString() {
        return c.class.getName() + ": " + this.f7294a;
    }
}