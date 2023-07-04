package net.time4j.tz.model;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import net.time4j.c0;
import net.time4j.g0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class f extends g {
    private static final long serialVersionUID = 3957240859230862745L;

    /* renamed from: f  reason: collision with root package name */
    private final transient byte f41576f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(c0 c0Var, int i11, int i12, i iVar, int i13) {
        super(c0Var, i12, iVar, i13);
        net.time4j.base.b.a(2000, c0Var.getValue(), i11);
        this.f41576f = (byte) i11;
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
        if (obj instanceof f) {
            f fVar = (f) obj;
            return this.f41576f == fVar.f41576f && super.l(fVar);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // net.time4j.tz.model.d
    public int g() {
        return 120;
    }

    public int hashCode() {
        return this.f41576f + (k() * 37);
    }

    @Override // net.time4j.tz.model.g
    protected g0 j(int i11) {
        return g0.N0(i11, k(), this.f41576f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int m() {
        return this.f41576f;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        sb2.append("FixedDayPattern:[month=");
        sb2.append((int) k());
        sb2.append(",day-of-month=");
        sb2.append((int) this.f41576f);
        sb2.append(",day-overflow=");
        sb2.append(c());
        sb2.append(",time-of-day=");
        sb2.append(f());
        sb2.append(",offset-indicator=");
        sb2.append(d());
        sb2.append(",dst-offset=");
        sb2.append(e());
        sb2.append(']');
        return sb2.toString();
    }
}