package wz;

import ch.qos.logback.core.CoreConstants;

/* loaded from: classes5.dex */
public final class k0<T> {

    /* renamed from: a  reason: collision with root package name */
    private final int f56490a;

    /* renamed from: b  reason: collision with root package name */
    private final T f56491b;

    public k0(int i11, T t11) {
        this.f56490a = i11;
        this.f56491b = t11;
    }

    public final int a() {
        return this.f56490a;
    }

    public final T b() {
        return this.f56491b;
    }

    public final int c() {
        return this.f56490a;
    }

    public final T d() {
        return this.f56491b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof k0) {
            k0 k0Var = (k0) obj;
            return this.f56490a == k0Var.f56490a && kotlin.jvm.internal.s.c(this.f56491b, k0Var.f56491b);
        }
        return false;
    }

    public int hashCode() {
        int i11 = this.f56490a * 31;
        T t11 = this.f56491b;
        return i11 + (t11 == null ? 0 : t11.hashCode());
    }

    public String toString() {
        return "IndexedValue(index=" + this.f56490a + ", value=" + this.f56491b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}