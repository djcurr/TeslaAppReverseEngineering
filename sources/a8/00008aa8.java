package net.time4j.calendar.astro;

/* loaded from: classes5.dex */
class a {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(double d11) {
        long doubleToLongBits = Double.doubleToLongBits(d11);
        return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static double b(int i11) {
        return Math.pow(1.0d - ((i11 * 0.0065d) / 288.15d), 4.255d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static double c(double d11) {
        while (Double.compare(0.0d, d11) > 0) {
            d11 += 360.0d;
        }
        while (Double.compare(d11, 360.0d) >= 0) {
            d11 -= 360.0d;
        }
        return d11;
    }
}