package q00;

import java.lang.ref.WeakReference;

/* loaded from: classes5.dex */
final class m0 {

    /* renamed from: a  reason: collision with root package name */
    private final WeakReference<ClassLoader> f47203a;

    /* renamed from: b  reason: collision with root package name */
    private final int f47204b;

    public m0(ClassLoader classLoader) {
        kotlin.jvm.internal.s.g(classLoader, "classLoader");
        this.f47203a = new WeakReference<>(classLoader);
        this.f47204b = System.identityHashCode(classLoader);
    }

    public final void a(ClassLoader classLoader) {
    }

    public boolean equals(Object obj) {
        return (obj instanceof m0) && this.f47203a.get() == ((m0) obj).f47203a.get();
    }

    public int hashCode() {
        return this.f47204b;
    }

    public String toString() {
        String classLoader;
        ClassLoader classLoader2 = this.f47203a.get();
        return (classLoader2 == null || (classLoader = classLoader2.toString()) == null) ? "<null>" : classLoader;
    }
}