package ji;

/* loaded from: classes3.dex */
public final class w {

    /* renamed from: c  reason: collision with root package name */
    public static final w f33775c = new w(0, 0);

    /* renamed from: a  reason: collision with root package name */
    public final long f33776a;

    /* renamed from: b  reason: collision with root package name */
    public final long f33777b;

    public w(long j11, long j12) {
        this.f33776a = j11;
        this.f33777b = j12;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || w.class != obj.getClass()) {
            return false;
        }
        w wVar = (w) obj;
        return this.f33776a == wVar.f33776a && this.f33777b == wVar.f33777b;
    }

    public int hashCode() {
        return (((int) this.f33776a) * 31) + ((int) this.f33777b);
    }

    public String toString() {
        long j11 = this.f33776a;
        long j12 = this.f33777b;
        StringBuilder sb2 = new StringBuilder(60);
        sb2.append("[timeUs=");
        sb2.append(j11);
        sb2.append(", position=");
        sb2.append(j12);
        sb2.append("]");
        return sb2.toString();
    }
}