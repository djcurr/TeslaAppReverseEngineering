package k5;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    public String f34384a;

    /* renamed from: b  reason: collision with root package name */
    public Long f34385b;

    public d(String str, boolean z11) {
        this(str, z11 ? 1L : 0L);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (this.f34384a.equals(dVar.f34384a)) {
                Long l11 = this.f34385b;
                Long l12 = dVar.f34385b;
                return l11 != null ? l11.equals(l12) : l12 == null;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.f34384a.hashCode() * 31;
        Long l11 = this.f34385b;
        return hashCode + (l11 != null ? l11.hashCode() : 0);
    }

    public d(String str, long j11) {
        this.f34384a = str;
        this.f34385b = Long.valueOf(j11);
    }
}