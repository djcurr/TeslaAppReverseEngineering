package am;

import am.a0;

/* loaded from: classes3.dex */
final class i extends a0.e.a.b {

    /* renamed from: a  reason: collision with root package name */
    private final String f775a;

    @Override // am.a0.e.a.b
    public String a() {
        return this.f775a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a0.e.a.b) {
            return this.f775a.equals(((a0.e.a.b) obj).a());
        }
        return false;
    }

    public int hashCode() {
        return this.f775a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Organization{clsId=" + this.f775a + "}";
    }
}