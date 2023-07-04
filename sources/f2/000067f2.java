package ei;

/* loaded from: classes3.dex */
public final class p {

    /* renamed from: a  reason: collision with root package name */
    public final int f25165a;

    /* renamed from: b  reason: collision with root package name */
    public final float f25166b;

    public p(int i11, float f11) {
        this.f25165a = i11;
        this.f25166b = f11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p.class != obj.getClass()) {
            return false;
        }
        p pVar = (p) obj;
        return this.f25165a == pVar.f25165a && Float.compare(pVar.f25166b, this.f25166b) == 0;
    }

    public int hashCode() {
        return ((527 + this.f25165a) * 31) + Float.floatToIntBits(this.f25166b);
    }
}