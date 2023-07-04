package y10;

import k20.d0;

/* loaded from: classes5.dex */
public abstract class g<T> {

    /* renamed from: a  reason: collision with root package name */
    private final T f58968a;

    public g(T t11) {
        this.f58968a = t11;
    }

    public abstract d0 a(w00.x xVar);

    public T b() {
        return this.f58968a;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            T b11 = b();
            g gVar = obj instanceof g ? (g) obj : null;
            if (!kotlin.jvm.internal.s.c(b11, gVar != null ? gVar.b() : null)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        T b11 = b();
        if (b11 == null) {
            return 0;
        }
        return b11.hashCode();
    }

    public String toString() {
        return String.valueOf(b());
    }
}