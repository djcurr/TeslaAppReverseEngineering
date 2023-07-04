package net.time4j.calendar.astro;

import java.io.Serializable;

/* loaded from: classes5.dex */
public class e implements Serializable {
    private static final long serialVersionUID = 5736859564589473324L;
    private final double azimuth;
    private final double declination;
    private final double distance;
    private final double elevation;
    private final double rightAscension;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static double a(double d11) {
        return e(((((((1.4347408140719379E-5d - (6.797172376291463E-8d * d11)) * d11) + 0.0087414d) * d11) + 477198.8675055d) * d11) + 134.9633964d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static double b(double d11) {
        return e((((((4.083299305839118E-8d * d11) - 1.536E-4d) * d11) + 35999.0502909d) * d11) + 357.5291092d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static double c(double d11) {
        return e(((((((1.8319447192361523E-6d - (8.844469995135542E-9d * d11)) * d11) - 0.0018819d) * d11) + 445267.1114034d) * d11) + 297.8501921d);
    }

    private static int d(double d11) {
        long doubleToLongBits = Double.doubleToLongBits(d11);
        return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
    }

    private static double e(double d11) {
        return d11 - (Math.floor(d11 / 360.0d) * 360.0d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            return this.rightAscension == eVar.rightAscension && this.declination == eVar.declination && this.azimuth == eVar.azimuth && this.elevation == eVar.elevation && this.distance == eVar.distance;
        }
        return false;
    }

    public int hashCode() {
        return d(this.rightAscension) + (d(this.declination) * 31) + (d(this.distance) * 37);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(100);
        sb2.append("moon-position[ra=");
        sb2.append(this.rightAscension);
        sb2.append(",decl=");
        sb2.append(this.declination);
        sb2.append(",azimuth=");
        sb2.append(this.azimuth);
        sb2.append(",elevation=");
        sb2.append(this.elevation);
        sb2.append(",distance=");
        sb2.append(this.distance);
        sb2.append(']');
        return sb2.toString();
    }
}