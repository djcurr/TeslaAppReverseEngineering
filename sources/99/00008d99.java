package o20;

import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class a<T> {

    /* renamed from: a  reason: collision with root package name */
    private final T f42183a;

    /* renamed from: b  reason: collision with root package name */
    private final T f42184b;

    public a(T t11, T t12) {
        this.f42183a = t11;
        this.f42184b = t12;
    }

    public final T a() {
        return this.f42183a;
    }

    public final T b() {
        return this.f42184b;
    }

    public final T c() {
        return this.f42183a;
    }

    public final T d() {
        return this.f42184b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            return s.c(this.f42183a, aVar.f42183a) && s.c(this.f42184b, aVar.f42184b);
        }
        return false;
    }

    public int hashCode() {
        T t11 = this.f42183a;
        int hashCode = (t11 == null ? 0 : t11.hashCode()) * 31;
        T t12 = this.f42184b;
        return hashCode + (t12 != null ? t12.hashCode() : 0);
    }

    public String toString() {
        return "ApproximationBounds(lower=" + this.f42183a + ", upper=" + this.f42184b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}