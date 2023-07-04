package c3;

/* loaded from: classes.dex */
public class i extends c {

    /* renamed from: d  reason: collision with root package name */
    double f8836d;

    /* renamed from: e  reason: collision with root package name */
    double f8837e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i(String str) {
        this.f8793a = str;
        int indexOf = str.indexOf(40);
        int indexOf2 = str.indexOf(44, indexOf);
        this.f8836d = Double.parseDouble(str.substring(indexOf + 1, indexOf2).trim());
        int i11 = indexOf2 + 1;
        this.f8837e = Double.parseDouble(str.substring(i11, str.indexOf(44, i11)).trim());
    }

    private double d(double d11) {
        double d12 = this.f8837e;
        if (d11 < d12) {
            double d13 = this.f8836d;
            return ((d13 * d12) * d12) / ((((d12 - d11) * d13) + d11) * ((d13 * (d12 - d11)) + d11));
        }
        double d14 = this.f8836d;
        return (((d12 - 1.0d) * d14) * (d12 - 1.0d)) / (((((-d14) * (d12 - d11)) - d11) + 1.0d) * ((((-d14) * (d12 - d11)) - d11) + 1.0d));
    }

    private double e(double d11) {
        double d12 = this.f8837e;
        if (d11 < d12) {
            return (d12 * d11) / (d11 + (this.f8836d * (d12 - d11)));
        }
        return ((1.0d - d12) * (d11 - 1.0d)) / ((1.0d - d11) - (this.f8836d * (d12 - d11)));
    }

    @Override // c3.c
    public double a(double d11) {
        return e(d11);
    }

    @Override // c3.c
    public double b(double d11) {
        return d(d11);
    }
}