package yh;

import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class b extends k {

    /* renamed from: a  reason: collision with root package name */
    private final long f59508a;

    /* renamed from: b  reason: collision with root package name */
    private final ph.o f59509b;

    /* renamed from: c  reason: collision with root package name */
    private final ph.i f59510c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(long j11, ph.o oVar, ph.i iVar) {
        this.f59508a = j11;
        Objects.requireNonNull(oVar, "Null transportContext");
        this.f59509b = oVar;
        Objects.requireNonNull(iVar, "Null event");
        this.f59510c = iVar;
    }

    @Override // yh.k
    public ph.i b() {
        return this.f59510c;
    }

    @Override // yh.k
    public long c() {
        return this.f59508a;
    }

    @Override // yh.k
    public ph.o d() {
        return this.f59509b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof k) {
            k kVar = (k) obj;
            return this.f59508a == kVar.c() && this.f59509b.equals(kVar.d()) && this.f59510c.equals(kVar.b());
        }
        return false;
    }

    public int hashCode() {
        long j11 = this.f59508a;
        return ((((((int) (j11 ^ (j11 >>> 32))) ^ 1000003) * 1000003) ^ this.f59509b.hashCode()) * 1000003) ^ this.f59510c.hashCode();
    }

    public String toString() {
        return "PersistedEvent{id=" + this.f59508a + ", transportContext=" + this.f59509b + ", event=" + this.f59510c + "}";
    }
}