package net.time4j.tz.model;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import net.time4j.c0;
import net.time4j.g0;
import net.time4j.x0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class c extends g {
    private static final long serialVersionUID = -7354650946442523175L;

    /* renamed from: f  reason: collision with root package name */
    private final transient byte f41569f;

    /* renamed from: g  reason: collision with root package name */
    private final transient byte f41570g;

    /* renamed from: h  reason: collision with root package name */
    private final transient boolean f41571h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(c0 c0Var, int i11, x0 x0Var, int i12, i iVar, int i13, boolean z11) {
        super(c0Var, i12, iVar, i13);
        net.time4j.base.b.a(2000, c0Var.getValue(), i11);
        this.f41569f = (byte) i11;
        this.f41570g = (byte) x0Var.getValue();
        this.f41571h = z11;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Serialization proxy required.");
    }

    private Object writeReplace() {
        return new SPX(this, g());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            return this.f41569f == cVar.f41569f && this.f41570g == cVar.f41570g && this.f41571h == cVar.f41571h && super.l(cVar);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // net.time4j.tz.model.d
    public int g() {
        return 121;
    }

    public int hashCode() {
        return this.f41569f + ((this.f41570g + (k() * 37)) * 17) + (this.f41571h ? 1 : 0);
    }

    @Override // net.time4j.tz.model.g
    protected g0 j(int i11) {
        byte k11 = k();
        int c11 = net.time4j.base.b.c(i11, k11, this.f41569f);
        g0 N0 = g0.N0(i11, k11, this.f41569f);
        byte b11 = this.f41570g;
        if (c11 == b11) {
            return N0;
        }
        int i12 = c11 - b11;
        int i13 = -1;
        if (this.f41571h) {
            i12 = -i12;
            i13 = 1;
        }
        if (i12 < 0) {
            i12 += 7;
        }
        return (g0) N0.G(i12 * i13, net.time4j.f.DAYS);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int m() {
        return this.f41569f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public byte n() {
        return this.f41570g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean o() {
        return this.f41571h;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        sb2.append("DayOfWeekInMonthPattern:[month=");
        sb2.append((int) k());
        sb2.append(",dayOfMonth=");
        sb2.append((int) this.f41569f);
        sb2.append(",dayOfWeek=");
        sb2.append(x0.valueOf(this.f41570g));
        sb2.append(",day-overflow=");
        sb2.append(c());
        sb2.append(",time-of-day=");
        sb2.append(f());
        sb2.append(",offset-indicator=");
        sb2.append(d());
        sb2.append(",dst-offset=");
        sb2.append(e());
        sb2.append(",after=");
        sb2.append(this.f41571h);
        sb2.append(']');
        return sb2.toString();
    }
}