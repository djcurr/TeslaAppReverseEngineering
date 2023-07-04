package v7;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class k<V> {

    /* renamed from: a  reason: collision with root package name */
    private final V f54306a;

    /* renamed from: b  reason: collision with root package name */
    private final Throwable f54307b;

    public k(V v11) {
        this.f54306a = v11;
        this.f54307b = null;
    }

    public Throwable a() {
        return this.f54307b;
    }

    public V b() {
        return this.f54306a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof k) {
            k kVar = (k) obj;
            if (b() == null || !b().equals(kVar.b())) {
                if (a() == null || kVar.a() == null) {
                    return false;
                }
                return a().toString().equals(a().toString());
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{b(), a()});
    }

    public k(Throwable th2) {
        this.f54307b = th2;
        this.f54306a = null;
    }
}