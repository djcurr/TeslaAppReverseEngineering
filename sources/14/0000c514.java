package zp;

import java.io.Serializable;

/* loaded from: classes2.dex */
public final class g implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    private final String f60595a;

    static {
        new g("JOSE");
        new g("JOSE+JSON");
        new g("JWT");
    }

    public g(String str) {
        if (str != null) {
            this.f60595a = str;
            return;
        }
        throw new IllegalArgumentException("The object type must not be null");
    }

    public boolean equals(Object obj) {
        return (obj instanceof g) && this.f60595a.equalsIgnoreCase(((g) obj).f60595a);
    }

    public int hashCode() {
        return this.f60595a.toLowerCase().hashCode();
    }

    public String toString() {
        return this.f60595a;
    }
}