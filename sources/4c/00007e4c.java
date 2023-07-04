package kotlin.jvm.internal;

/* loaded from: classes5.dex */
public final class b0 implements h {

    /* renamed from: a  reason: collision with root package name */
    private final Class<?> f34897a;

    public b0(Class<?> jClass, String moduleName) {
        s.g(jClass, "jClass");
        s.g(moduleName, "moduleName");
        this.f34897a = jClass;
    }

    @Override // kotlin.jvm.internal.h
    public Class<?> d() {
        return this.f34897a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof b0) && s.c(d(), ((b0) obj).d());
    }

    public int hashCode() {
        return d().hashCode();
    }

    public String toString() {
        return d().toString() + " (Kotlin reflection is not available)";
    }
}