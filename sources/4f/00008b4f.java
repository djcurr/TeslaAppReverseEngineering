package net.time4j.format.expert;

import java.util.Objects;

/* loaded from: classes5.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    private final net.time4j.engine.p<?> f41135a;

    /* renamed from: b  reason: collision with root package name */
    private final int f41136b;

    /* renamed from: c  reason: collision with root package name */
    private final int f41137c;

    public g(net.time4j.engine.p<?> pVar, int i11, int i12) {
        Objects.requireNonNull(pVar, "Missing chronological element.");
        if (i11 < 0) {
            throw new IllegalArgumentException("Negative start index: " + i11 + " (" + pVar.name() + ")");
        } else if (i12 > i11) {
            this.f41135a = pVar;
            this.f41136b = i11;
            this.f41137c = i12;
        } else {
            throw new IllegalArgumentException("End index " + i12 + " must be greater than start index " + i11 + " (" + pVar.name() + ")");
        }
    }

    public net.time4j.engine.p<?> a() {
        return this.f41135a;
    }

    public int b() {
        return this.f41137c;
    }

    public int c() {
        return this.f41136b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            return this.f41135a.equals(gVar.f41135a) && this.f41136b == gVar.f41136b && this.f41137c == gVar.f41137c;
        }
        return false;
    }

    public int hashCode() {
        return this.f41135a.hashCode() + ((this.f41136b | (this.f41137c << 16)) * 37);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(80);
        sb2.append(g.class.getName());
        sb2.append("[element=");
        sb2.append(this.f41135a.name());
        sb2.append(",start-index=");
        sb2.append(this.f41136b);
        sb2.append(",end-index=");
        sb2.append(this.f41137c);
        sb2.append(']');
        return sb2.toString();
    }
}