package l0;

import ch.qos.logback.core.CoreConstants;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a  reason: collision with root package name */
    private double f36255a;

    /* renamed from: b  reason: collision with root package name */
    private double f36256b;

    public s(double d11, double d12) {
        this.f36255a = d11;
        this.f36256b = d12;
    }

    public final double e() {
        return this.f36256b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof s) {
            s sVar = (s) obj;
            return kotlin.jvm.internal.s.c(Double.valueOf(this.f36255a), Double.valueOf(sVar.f36255a)) && kotlin.jvm.internal.s.c(Double.valueOf(this.f36256b), Double.valueOf(sVar.f36256b));
        }
        return false;
    }

    public final double f() {
        return this.f36255a;
    }

    public int hashCode() {
        return (Double.hashCode(this.f36255a) * 31) + Double.hashCode(this.f36256b);
    }

    public String toString() {
        return "ComplexDouble(_real=" + this.f36255a + ", _imaginary=" + this.f36256b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}