package qm;

import java.util.List;
import java.util.Objects;

/* loaded from: classes3.dex */
final class a extends m {

    /* renamed from: a  reason: collision with root package name */
    private final String f48359a;

    /* renamed from: b  reason: collision with root package name */
    private final List<String> f48360b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(String str, List<String> list) {
        Objects.requireNonNull(str, "Null userAgent");
        this.f48359a = str;
        Objects.requireNonNull(list, "Null usedDates");
        this.f48360b = list;
    }

    @Override // qm.m
    public List<String> b() {
        return this.f48360b;
    }

    @Override // qm.m
    public String c() {
        return this.f48359a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof m) {
            m mVar = (m) obj;
            return this.f48359a.equals(mVar.c()) && this.f48360b.equals(mVar.b());
        }
        return false;
    }

    public int hashCode() {
        return ((this.f48359a.hashCode() ^ 1000003) * 1000003) ^ this.f48360b.hashCode();
    }

    public String toString() {
        return "HeartBeatResult{userAgent=" + this.f48359a + ", usedDates=" + this.f48360b + "}";
    }
}