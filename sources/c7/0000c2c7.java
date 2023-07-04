package yn;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public final double f59639a;

    /* renamed from: b  reason: collision with root package name */
    public final double f59640b;

    /* renamed from: c  reason: collision with root package name */
    public final double f59641c;

    /* renamed from: d  reason: collision with root package name */
    public final double f59642d;

    /* renamed from: e  reason: collision with root package name */
    public final double f59643e;

    /* renamed from: f  reason: collision with root package name */
    public final double f59644f;

    public a(double d11, double d12, double d13, double d14) {
        this.f59639a = d11;
        this.f59640b = d13;
        this.f59641c = d12;
        this.f59642d = d14;
        this.f59643e = (d11 + d12) / 2.0d;
        this.f59644f = (d13 + d14) / 2.0d;
    }

    public boolean a(double d11, double d12) {
        return this.f59639a <= d11 && d11 <= this.f59641c && this.f59640b <= d12 && d12 <= this.f59642d;
    }

    public boolean b(a aVar) {
        return aVar.f59639a >= this.f59639a && aVar.f59641c <= this.f59641c && aVar.f59640b >= this.f59640b && aVar.f59642d <= this.f59642d;
    }

    public boolean c(b bVar) {
        return a(bVar.f59645a, bVar.f59646b);
    }

    public boolean d(double d11, double d12, double d13, double d14) {
        return d11 < this.f59641c && this.f59639a < d12 && d13 < this.f59642d && this.f59640b < d14;
    }

    public boolean e(a aVar) {
        return d(aVar.f59639a, aVar.f59641c, aVar.f59640b, aVar.f59642d);
    }
}