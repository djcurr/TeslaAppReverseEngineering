package oh;

import java.util.List;
import java.util.Objects;

/* loaded from: classes3.dex */
final class d extends j {

    /* renamed from: a  reason: collision with root package name */
    private final List<m> f42427a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(List<m> list) {
        Objects.requireNonNull(list, "Null logRequests");
        this.f42427a = list;
    }

    @Override // oh.j
    public List<m> c() {
        return this.f42427a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j) {
            return this.f42427a.equals(((j) obj).c());
        }
        return false;
    }

    public int hashCode() {
        return this.f42427a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "BatchedLogRequest{logRequests=" + this.f42427a + "}";
    }
}