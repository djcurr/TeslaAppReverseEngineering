package bc;

import java.text.DecimalFormat;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    private final double f7603a;

    /* renamed from: b  reason: collision with root package name */
    private final double f7604b;

    public g(double d11, double d12) {
        this.f7603a = d11;
        this.f7604b = d12;
    }

    public static double[] a(double d11) {
        int i11 = (int) d11;
        double abs = Math.abs((d11 % 1.0d) * 60.0d);
        return new double[]{i11, (int) abs, (abs % 1.0d) * 60.0d};
    }

    public static String b(double d11) {
        double[] a11 = a(d11);
        DecimalFormat decimalFormat = new DecimalFormat("0.##");
        return String.format("%s° %s' %s\"", decimalFormat.format(a11[0]), decimalFormat.format(a11[1]), decimalFormat.format(a11[2]));
    }

    public static Double c(k kVar, k kVar2, k kVar3, boolean z11) {
        double abs = Math.abs(kVar.doubleValue()) + (kVar2.doubleValue() / 60.0d) + (kVar3.doubleValue() / 3600.0d);
        if (Double.isNaN(abs)) {
            return null;
        }
        if (z11) {
            abs *= -1.0d;
        }
        return Double.valueOf(abs);
    }

    public double d() {
        return this.f7603a;
    }

    public double e() {
        return this.f7604b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g.class != obj.getClass()) {
            return false;
        }
        g gVar = (g) obj;
        return Double.compare(gVar.f7603a, this.f7603a) == 0 && Double.compare(gVar.f7604b, this.f7604b) == 0;
    }

    public int hashCode() {
        double d11 = this.f7603a;
        long doubleToLongBits = d11 != 0.0d ? Double.doubleToLongBits(d11) : 0L;
        int i11 = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
        double d12 = this.f7604b;
        long doubleToLongBits2 = d12 != 0.0d ? Double.doubleToLongBits(d12) : 0L;
        return (i11 * 31) + ((int) ((doubleToLongBits2 >>> 32) ^ doubleToLongBits2));
    }

    public String toString() {
        return this.f7603a + ", " + this.f7604b;
    }
}