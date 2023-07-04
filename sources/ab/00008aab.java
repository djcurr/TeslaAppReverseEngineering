package net.time4j.calendar.astro;

import ch.qos.logback.core.CoreConstants;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.io.StreamCorruptedException;
import net.time4j.b0;
import net.time4j.engine.z;
import net.time4j.g0;

/* loaded from: classes5.dex */
public final class c implements Serializable {
    private static final long serialVersionUID = 486345450973062467L;
    private final m30.f scale;
    private final double value;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f40860a;

        static {
            int[] iArr = new int[m30.f.values().length];
            f40860a = iArr;
            try {
                iArr[m30.f.UT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f40860a[m30.f.TT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f40860a[m30.f.POSIX.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private c(double d11, m30.f fVar) {
        a(d11, fVar);
        this.value = d11;
        this.scale = fVar;
    }

    private static void a(double d11, m30.f fVar) {
        if (!Double.isNaN(d11) && !Double.isInfinite(d11)) {
            int i11 = a.f40860a[fVar.ordinal()];
            if (i11 != 1 && i11 != 2 && i11 != 3) {
                throw new IllegalArgumentException("Unsupported time scale: " + fVar);
            } else if (Double.compare(990575.0d, d11) > 0 || Double.compare(d11, 2817152.0d) > 0) {
                throw new IllegalArgumentException("Out of range: " + d11);
            } else {
                return;
            }
        }
        throw new IllegalArgumentException("Value is not finite: " + d11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static double e(b0 b0Var, m30.f fVar) {
        return ((b0Var.d(fVar) + f(fVar)) + (b0Var.k(fVar) / 1.0E9d)) / 86400.0d;
    }

    private static long f(m30.f fVar) {
        int i11 = a.f40860a[fVar.ordinal()];
        if (i11 == 1 || i11 == 2) {
            return 210929832000L;
        }
        if (i11 == 3) {
            return 210866760000L;
        }
        throw new UnsupportedOperationException(fVar.name());
    }

    public static c g(double d11) {
        return new c(d11, m30.f.TT);
    }

    public static c h(b0 b0Var) {
        m30.f fVar = m30.f.TT;
        return new c(e(b0Var, fVar), fVar);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        try {
            objectInputStream.defaultReadObject();
            a(this.value, this.scale);
        } catch (ClassNotFoundException unused) {
            throw new StreamCorruptedException();
        } catch (IllegalArgumentException unused2) {
            throw new StreamCorruptedException();
        }
    }

    public double b() {
        return (this.value - 2451545.0d) / 36525.0d;
    }

    public double c() {
        return this.value - 2400000.5d;
    }

    public double d() {
        return this.value;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            return this.value == cVar.value && this.scale == cVar.scale;
        }
        return false;
    }

    public int hashCode() {
        return net.time4j.calendar.astro.a.a(this.value) ^ this.scale.hashCode();
    }

    public b0 i() {
        m30.f fVar;
        double d11 = this.value * 86400.0d;
        m30.f fVar2 = this.scale;
        if (!m30.d.p().t() && fVar2 != (fVar = m30.f.POSIX)) {
            if (fVar2 == m30.f.TT) {
                g0 V0 = g0.V0((long) Math.floor(c()), z.MODIFIED_JULIAN_DATE);
                d11 -= m30.f.deltaT(V0.getYear(), V0.getMonth());
            }
            d11 += 6.3072E7d;
            fVar2 = fVar;
        }
        return b0.k0(net.time4j.base.c.m((long) d11, f(fVar2)), (int) ((d11 - Math.floor(d11)) * 1.0E9d), fVar2);
    }

    public String toString() {
        return "JD(" + this.scale.name() + CoreConstants.RIGHT_PARENTHESIS_CHAR + this.value;
    }
}