package t20;

import java.io.Serializable;

/* loaded from: classes5.dex */
final class e<K, V> implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    public final K f51583a;

    /* renamed from: b  reason: collision with root package name */
    public final V f51584b;

    public e(K k11, V v11) {
        this.f51583a = k11;
        this.f51584b = v11;
    }

    public boolean equals(Object obj) {
        if (obj instanceof e) {
            e eVar = (e) obj;
            K k11 = this.f51583a;
            if (k11 == null) {
                if (eVar.f51583a != null) {
                    return false;
                }
            } else if (!k11.equals(eVar.f51583a)) {
                return false;
            }
            V v11 = this.f51584b;
            V v12 = eVar.f51584b;
            if (v11 == null) {
                if (v12 != null) {
                    return false;
                }
            } else if (!v11.equals(v12)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        K k11 = this.f51583a;
        int hashCode = k11 == null ? 0 : k11.hashCode();
        V v11 = this.f51584b;
        return hashCode ^ (v11 != null ? v11.hashCode() : 0);
    }

    public String toString() {
        return this.f51583a + "=" + this.f51584b;
    }
}