package un;

/* loaded from: classes2.dex */
class a {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static double a(double d11) {
        return Math.asin(Math.sqrt(d11)) * 2.0d;
    }

    static double b(double d11) {
        double sin = Math.sin(d11 * 0.5d);
        return sin * sin;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static double c(double d11, double d12, double d13) {
        return b(d11 - d12) + (b(d13) * Math.cos(d11) * Math.cos(d12));
    }
}