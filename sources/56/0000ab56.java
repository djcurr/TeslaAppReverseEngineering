package pp;

import ch.qos.logback.core.CoreConstants;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public class g {

    /* renamed from: j  reason: collision with root package name */
    public static final g f46818j = new g(1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* renamed from: k  reason: collision with root package name */
    public static final g f46819k = new g(0.0d, 1.0d, -1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* renamed from: l  reason: collision with root package name */
    public static final g f46820l = new g(-1.0d, 0.0d, 0.0d, -1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* renamed from: m  reason: collision with root package name */
    public static final g f46821m = new g(0.0d, -1.0d, 1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* renamed from: a  reason: collision with root package name */
    double f46822a;

    /* renamed from: b  reason: collision with root package name */
    double f46823b;

    /* renamed from: c  reason: collision with root package name */
    double f46824c;

    /* renamed from: d  reason: collision with root package name */
    double f46825d;

    /* renamed from: e  reason: collision with root package name */
    double f46826e;

    /* renamed from: f  reason: collision with root package name */
    double f46827f;

    /* renamed from: g  reason: collision with root package name */
    double f46828g;

    /* renamed from: h  reason: collision with root package name */
    double f46829h;

    /* renamed from: i  reason: collision with root package name */
    double f46830i;

    public g(double d11, double d12, double d13, double d14, double d15, double d16, double d17, double d18, double d19) {
        this.f46822a = d15;
        this.f46823b = d16;
        this.f46824c = d17;
        this.f46825d = d11;
        this.f46826e = d12;
        this.f46827f = d13;
        this.f46828g = d14;
        this.f46829h = d18;
        this.f46830i = d19;
    }

    public static g a(ByteBuffer byteBuffer) {
        return b(hb.d.d(byteBuffer), hb.d.d(byteBuffer), hb.d.c(byteBuffer), hb.d.d(byteBuffer), hb.d.d(byteBuffer), hb.d.c(byteBuffer), hb.d.d(byteBuffer), hb.d.d(byteBuffer), hb.d.c(byteBuffer));
    }

    public static g b(double d11, double d12, double d13, double d14, double d15, double d16, double d17, double d18, double d19) {
        return new g(d11, d12, d14, d15, d13, d16, d19, d17, d18);
    }

    public void c(ByteBuffer byteBuffer) {
        hb.e.b(byteBuffer, this.f46825d);
        hb.e.b(byteBuffer, this.f46826e);
        hb.e.a(byteBuffer, this.f46822a);
        hb.e.b(byteBuffer, this.f46827f);
        hb.e.b(byteBuffer, this.f46828g);
        hb.e.a(byteBuffer, this.f46823b);
        hb.e.b(byteBuffer, this.f46829h);
        hb.e.b(byteBuffer, this.f46830i);
        hb.e.a(byteBuffer, this.f46824c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g.class != obj.getClass()) {
            return false;
        }
        g gVar = (g) obj;
        return Double.compare(gVar.f46825d, this.f46825d) == 0 && Double.compare(gVar.f46826e, this.f46826e) == 0 && Double.compare(gVar.f46827f, this.f46827f) == 0 && Double.compare(gVar.f46828g, this.f46828g) == 0 && Double.compare(gVar.f46829h, this.f46829h) == 0 && Double.compare(gVar.f46830i, this.f46830i) == 0 && Double.compare(gVar.f46822a, this.f46822a) == 0 && Double.compare(gVar.f46823b, this.f46823b) == 0 && Double.compare(gVar.f46824c, this.f46824c) == 0;
    }

    public int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f46822a);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f46823b);
        long doubleToLongBits3 = Double.doubleToLongBits(this.f46824c);
        long doubleToLongBits4 = Double.doubleToLongBits(this.f46825d);
        long doubleToLongBits5 = Double.doubleToLongBits(this.f46826e);
        long doubleToLongBits6 = Double.doubleToLongBits(this.f46827f);
        long doubleToLongBits7 = Double.doubleToLongBits(this.f46828g);
        long doubleToLongBits8 = Double.doubleToLongBits(this.f46829h);
        long doubleToLongBits9 = Double.doubleToLongBits(this.f46830i);
        return (((((((((((((((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + ((int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32)))) * 31) + ((int) (doubleToLongBits4 ^ (doubleToLongBits4 >>> 32)))) * 31) + ((int) (doubleToLongBits5 ^ (doubleToLongBits5 >>> 32)))) * 31) + ((int) (doubleToLongBits6 ^ (doubleToLongBits6 >>> 32)))) * 31) + ((int) (doubleToLongBits7 ^ (doubleToLongBits7 >>> 32)))) * 31) + ((int) (doubleToLongBits8 ^ (doubleToLongBits8 >>> 32)))) * 31) + ((int) ((doubleToLongBits9 >>> 32) ^ doubleToLongBits9));
    }

    public String toString() {
        if (equals(f46818j)) {
            return "Rotate 0°";
        }
        if (equals(f46819k)) {
            return "Rotate 90°";
        }
        if (equals(f46820l)) {
            return "Rotate 180°";
        }
        if (equals(f46821m)) {
            return "Rotate 270°";
        }
        return "Matrix{u=" + this.f46822a + ", v=" + this.f46823b + ", w=" + this.f46824c + ", a=" + this.f46825d + ", b=" + this.f46826e + ", c=" + this.f46827f + ", d=" + this.f46828g + ", tx=" + this.f46829h + ", ty=" + this.f46830i + CoreConstants.CURLY_RIGHT;
    }
}