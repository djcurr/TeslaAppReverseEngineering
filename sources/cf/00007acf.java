package j$.time.zone;

import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneOffset;
import java.io.Serializable;

/* loaded from: classes7.dex */
public final class a implements Comparable, Serializable {

    /* renamed from: a  reason: collision with root package name */
    private final LocalDateTime f32974a;

    /* renamed from: b  reason: collision with root package name */
    private final ZoneOffset f32975b;

    /* renamed from: c  reason: collision with root package name */
    private final ZoneOffset f32976c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(long j11, ZoneOffset zoneOffset, ZoneOffset zoneOffset2) {
        this.f32974a = LocalDateTime.m(j11, 0, zoneOffset);
        this.f32975b = zoneOffset;
        this.f32976c = zoneOffset2;
    }

    public Instant c() {
        LocalDateTime localDateTime = this.f32974a;
        return Instant.ofEpochSecond(localDateTime.j(this.f32975b), localDateTime.p().k());
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        return c().compareTo(((a) obj).c());
    }

    public ZoneOffset d() {
        return this.f32976c;
    }

    public ZoneOffset e() {
        return this.f32975b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            return this.f32974a.equals(aVar.f32974a) && this.f32975b.equals(aVar.f32975b) && this.f32976c.equals(aVar.f32976c);
        }
        return false;
    }

    public long f() {
        return this.f32974a.j(this.f32975b);
    }

    public int hashCode() {
        return (this.f32974a.hashCode() ^ this.f32975b.hashCode()) ^ Integer.rotateLeft(this.f32976c.hashCode(), 16);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Transition[");
        sb2.append(this.f32976c.n() > this.f32975b.n() ? "Gap" : "Overlap");
        sb2.append(" at ");
        sb2.append(this.f32974a);
        sb2.append(this.f32975b);
        sb2.append(" to ");
        sb2.append(this.f32976c);
        sb2.append(']');
        return sb2.toString();
    }
}