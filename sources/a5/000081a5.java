package l0;

/* loaded from: classes.dex */
public final class t {
    public static final vz.p<s, s> a(double d11, double d12, double d13) {
        double d14;
        double d15;
        double d16;
        double d17;
        double d18;
        double d19;
        double d21;
        double d22;
        double d23 = -d12;
        double d24 = (d12 * d12) - ((4.0d * d11) * d13);
        s b11 = b(d24);
        d14 = b11.f36255a;
        b11.f36255a = d14 + d23;
        double d25 = d11 * 2.0d;
        d15 = b11.f36255a;
        b11.f36255a = d15 / d25;
        d16 = b11.f36256b;
        b11.f36256b = d16 / d25;
        s b12 = b(d24);
        d17 = b12.f36255a;
        double d26 = -1;
        b12.f36255a = d17 * d26;
        d18 = b12.f36256b;
        b12.f36256b = d18 * d26;
        d19 = b12.f36255a;
        b12.f36255a = d19 + d23;
        d21 = b12.f36255a;
        b12.f36255a = d21 / d25;
        d22 = b12.f36256b;
        b12.f36256b = d22 / d25;
        return vz.v.a(b11, b12);
    }

    public static final s b(double d11) {
        if (d11 < 0.0d) {
            return new s(0.0d, Math.sqrt(Math.abs(d11)));
        }
        return new s(Math.sqrt(d11), 0.0d);
    }
}