package net.time4j.history;

import java.io.DataInput;
import java.io.DataOutput;
import net.time4j.engine.z;
import net.time4j.g0;

/* loaded from: classes5.dex */
public final class g {

    /* renamed from: d  reason: collision with root package name */
    static final g f41392d = new g();

    /* renamed from: e  reason: collision with root package name */
    private static final h f41393e = h.f(j.AD, 1, 1, 1);

    /* renamed from: f  reason: collision with root package name */
    private static final h f41394f = h.f(j.BC, 38, 1, 1);

    /* renamed from: g  reason: collision with root package name */
    private static final g0 f41395g = g0.M0(2000, 1);

    /* renamed from: a  reason: collision with root package name */
    private final j f41396a;

    /* renamed from: b  reason: collision with root package name */
    private final g0 f41397b;

    /* renamed from: c  reason: collision with root package name */
    private final g0 f41398c;

    private g() {
        this.f41396a = null;
        this.f41397b = g0.r0().H();
        this.f41398c = g0.r0().G();
    }

    public static g a(g0 g0Var, g0 g0Var2) {
        return new g(j.AB_URBE_CONDITA, g0Var, g0Var2);
    }

    public static g b(g0 g0Var, g0 g0Var2) {
        return new g(j.BYZANTINE, g0Var, g0Var2);
    }

    public static g c(g0 g0Var) {
        return b(g0.r0().H(), g0Var);
    }

    public static g e(g0 g0Var, g0 g0Var2) {
        return new g(j.HISPANIC, g0Var, g0Var2);
    }

    public static g f(g0 g0Var) {
        return e(g0.r0().H(), g0Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static g g(DataInput dataInput) {
        if (dataInput.readByte() == Byte.MAX_VALUE) {
            j valueOf = j.valueOf(dataInput.readUTF());
            long readLong = dataInput.readLong();
            long readLong2 = dataInput.readLong();
            g0 g0Var = f41395g;
            z zVar = z.MODIFIED_JULIAN_DATE;
            return new g(valueOf, (g0) g0Var.y(zVar, readLong), (g0) g0Var.y(zVar, readLong2));
        }
        return f41392d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public j d(h hVar, g0 g0Var) {
        if (this.f41396a == null || g0Var.N(this.f41397b) || g0Var.M(this.f41398c)) {
            return hVar.compareTo(f41393e) < 0 ? j.BC : j.AD;
        } else if (this.f41396a == j.HISPANIC && hVar.compareTo(f41394f) < 0) {
            return j.BC;
        } else {
            return this.f41396a;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            g gVar2 = f41392d;
            return this == gVar2 ? gVar == gVar2 : this.f41396a == gVar.f41396a && this.f41397b.equals(gVar.f41397b) && this.f41398c.equals(gVar.f41398c);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h(DataOutput dataOutput) {
        if (this == f41392d) {
            dataOutput.writeByte(0);
            return;
        }
        dataOutput.writeByte(127);
        dataOutput.writeUTF(this.f41396a.name());
        g0 g0Var = this.f41397b;
        z zVar = z.MODIFIED_JULIAN_DATE;
        dataOutput.writeLong(((Long) g0Var.l(zVar)).longValue());
        dataOutput.writeLong(((Long) this.f41398c.l(zVar)).longValue());
    }

    public int hashCode() {
        return (this.f41396a.hashCode() * 17) + (this.f41397b.hashCode() * 31) + (this.f41398c.hashCode() * 37);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('[');
        if (this == f41392d) {
            sb2.append("default");
        } else {
            sb2.append("era->");
            sb2.append(this.f41396a);
            sb2.append(",start->");
            sb2.append(this.f41397b);
            sb2.append(",end->");
            sb2.append(this.f41398c);
        }
        sb2.append(']');
        return sb2.toString();
    }

    private g(j jVar, g0 g0Var, g0 g0Var2) {
        if (jVar.compareTo(j.AD) > 0) {
            if (!g0Var2.N(g0Var)) {
                this.f41396a = jVar;
                this.f41397b = g0Var;
                this.f41398c = g0Var2;
                return;
            }
            throw new IllegalArgumentException("End before start: " + g0Var + "/" + g0Var2);
        }
        throw new UnsupportedOperationException(jVar.name());
    }
}