package androidx.appcompat.app;

/* loaded from: classes.dex */
class n {

    /* renamed from: d  reason: collision with root package name */
    private static n f1264d;

    /* renamed from: a  reason: collision with root package name */
    public long f1265a;

    /* renamed from: b  reason: collision with root package name */
    public long f1266b;

    /* renamed from: c  reason: collision with root package name */
    public int f1267c;

    n() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static n b() {
        if (f1264d == null) {
            f1264d = new n();
        }
        return f1264d;
    }

    public void a(long j11, double d11, double d12) {
        float f11;
        float f12;
        double d13;
        double d14 = (0.01720197f * (((float) (j11 - 946728000000L)) / 8.64E7f)) + 6.24006f;
        double sin = (Math.sin(d14) * 0.03341960161924362d) + d14 + (Math.sin(2.0f * f12) * 3.4906598739326E-4d) + (Math.sin(f12 * 3.0f) * 5.236000106378924E-6d) + 1.796593063d + 3.141592653589793d;
        double round = ((float) Math.round((f11 - 9.0E-4f) - d13)) + 9.0E-4f + ((-d12) / 360.0d) + (Math.sin(d14) * 0.0053d) + (Math.sin(2.0d * sin) * (-0.0069d));
        double asin = Math.asin(Math.sin(sin) * Math.sin(0.4092797040939331d));
        double d15 = 0.01745329238474369d * d11;
        double sin2 = (Math.sin(-0.10471975803375244d) - (Math.sin(d15) * Math.sin(asin))) / (Math.cos(d15) * Math.cos(asin));
        if (sin2 >= 1.0d) {
            this.f1267c = 1;
            this.f1265a = -1L;
            this.f1266b = -1L;
        } else if (sin2 <= -1.0d) {
            this.f1267c = 0;
            this.f1265a = -1L;
            this.f1266b = -1L;
        } else {
            double acos = (float) (Math.acos(sin2) / 6.283185307179586d);
            this.f1265a = Math.round((round + acos) * 8.64E7d) + 946728000000L;
            long round2 = Math.round((round - acos) * 8.64E7d) + 946728000000L;
            this.f1266b = round2;
            if (round2 < j11 && this.f1265a > j11) {
                this.f1267c = 0;
            } else {
                this.f1267c = 1;
            }
        }
    }
}