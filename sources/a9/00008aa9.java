package net.time4j.calendar.astro;

import net.time4j.b0;
import net.time4j.tz.p;
import org.spongycastle.crypto.tls.CipherSuite;

/* loaded from: classes5.dex */
public enum b {
    VERNAL_EQUINOX,
    SUMMER_SOLSTICE,
    AUTUMNAL_EQUINOX,
    WINTER_SOLSTICE;
    
    private static final int[] A = {485, 203, 199, CipherSuite.TLS_RSA_PSK_WITH_AES_128_CBC_SHA256, 156, 136, 77, 74, 70, 58, 52, 50, 45, 44, 29, 18, 17, 16, 14, 12, 12, 12, 9, 8};
    private static final double[] B = {324.96d, 337.23d, 342.08d, 27.85d, 73.14d, 171.52d, 222.54d, 296.72d, 243.58d, 119.81d, 297.17d, 21.02d, 247.54d, 325.15d, 60.93d, 155.12d, 288.79d, 198.04d, 199.76d, 95.39d, 287.11d, 320.81d, 227.73d, 15.45d};
    private static final double[] C = {1934.136d, 32964.467d, 20.186d, 445267.112d, 45036.886d, 22518.443d, 65928.934d, 3034.906d, 9037.513d, 33718.147d, 150.678d, 2281.226d, 29929.562d, 31555.956d, 4443.417d, 67555.328d, 4562.452d, 62894.029d, 31436.921d, 14577.848d, 31931.756d, 34777.259d, 1222.114d, 16859.074d};

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f40859a;

        static {
            int[] iArr = new int[b.values().length];
            f40859a = iArr;
            try {
                iArr[b.VERNAL_EQUINOX.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f40859a[b.SUMMER_SOLSTICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f40859a[b.AUTUMNAL_EQUINOX.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f40859a[b.WINTER_SOLSTICE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private static void checkYear(int i11) {
        if (i11 < -2000 || i11 > 3000) {
            throw new IllegalArgumentException("Year out of supported range: -2000 <= " + i11 + " <= +3000");
        }
    }

    private static double cos(double d11) {
        return Math.cos((d11 * 3.141592653589793d) / 180.0d);
    }

    private double jdEphemerisDays(int i11) {
        double jdMean = jdMean(i11);
        double d11 = (jdMean - 2451545.0d) / 36525.0d;
        double d12 = (35999.373d * d11) - 2.47d;
        return jdMean + ((periodic24(d11) * 1.0E-5d) / (((cos(d12) * 0.0334d) + 1.0d) + (cos(d12 * 2.0d) * 7.0E-4d)));
    }

    private double jdMean(int i11) {
        double d11;
        double d12;
        double d13;
        double d14;
        double d15;
        double d16;
        double d17;
        double d18;
        double d19;
        double d21;
        double d22;
        if (i11 < 1000) {
            d11 = i11 / 1000.0d;
            int i12 = a.f40859a[ordinal()];
            if (i12 != 1) {
                if (i12 == 2) {
                    d17 = 1721233.25401d;
                    d18 = 365241.72562d;
                    d19 = -0.05323d;
                    d21 = 0.00907d;
                    d22 = 2.5E-4d;
                } else if (i12 == 3) {
                    d17 = 1721325.70455d;
                    d18 = 365242.49558d;
                    d19 = -0.11677d;
                    d21 = -0.00297d;
                    d22 = 7.4E-4d;
                } else if (i12 != 4) {
                    throw new AssertionError(this);
                } else {
                    d12 = 1721414.39987d;
                    d13 = 365242.88257d;
                    d14 = -0.00769d;
                    d15 = -0.00933d;
                    d16 = 6.0E-5d;
                }
                return (((((((d22 * d11) + d21) * d11) + d19) * d11) + d18) * d11) + d17;
            }
            d12 = 1721139.29189d;
            d13 = 365242.1374d;
            d14 = 0.06134d;
            d15 = 0.00111d;
            d16 = 7.1E-4d;
            return ((((((d15 - (d16 * d11)) * d11) + d14) * d11) + d13) * d11) + d12;
        }
        d11 = (i11 - 2000) / 1000.0d;
        int i13 = a.f40859a[ordinal()];
        if (i13 == 1) {
            d12 = 2451623.80984d;
            d13 = 365242.37404d;
            d14 = 0.05169d;
            d15 = -0.00411d;
            d16 = 5.7E-4d;
        } else if (i13 != 2) {
            if (i13 == 3) {
                d17 = 2451810.21715d;
                d18 = 365242.01767d;
                d19 = -0.11575d;
                d21 = 0.00337d;
                d22 = 7.8E-4d;
            } else if (i13 != 4) {
                throw new AssertionError(this);
            } else {
                d17 = 2451900.05952d;
                d18 = 365242.74049d;
                d19 = -0.06223d;
                d21 = -0.00823d;
                d22 = 3.2E-4d;
            }
            return (((((((d22 * d11) + d21) * d11) + d19) * d11) + d18) * d11) + d17;
        } else {
            d12 = 2451716.56767d;
            d13 = 365241.62603d;
            d14 = 0.00325d;
            d15 = 0.00888d;
            d16 = 3.0E-4d;
        }
        return ((((((d15 - (d16 * d11)) * d11) + d14) * d11) + d13) * d11) + d12;
    }

    public static b of(b0 b0Var) {
        int year = b0Var.v0(p.f41597k).getYear();
        checkYear(year);
        b bVar = VERNAL_EQUINOX;
        if (b0Var.h0(bVar.inYear(year))) {
            return WINTER_SOLSTICE;
        }
        b bVar2 = SUMMER_SOLSTICE;
        if (b0Var.h0(bVar2.inYear(year))) {
            return bVar;
        }
        b bVar3 = AUTUMNAL_EQUINOX;
        if (b0Var.h0(bVar3.inYear(year))) {
            return bVar2;
        }
        b bVar4 = WINTER_SOLSTICE;
        return b0Var.h0(bVar4.inYear(year)) ? bVar3 : bVar4;
    }

    private static double periodic24(double d11) {
        double d12 = 0.0d;
        for (int i11 = 0; i11 < 24; i11++) {
            d12 += A[i11] * cos(B[i11] + (C[i11] * d11));
        }
        return d12;
    }

    public b0 inYear(int i11) {
        double deltaT;
        m30.f fVar;
        checkYear(i11);
        double jdEphemerisDays = (jdEphemerisDays(i11) - 2441317.5d) * 86400.0d;
        boolean t11 = m30.d.p().t();
        if (t11 && i11 >= 1972) {
            deltaT = jdEphemerisDays - 42.184d;
            fVar = m30.f.UTC;
        } else {
            deltaT = jdEphemerisDays - m30.f.deltaT(i11, (ordinal() + 1) * 3);
            fVar = m30.f.UT;
        }
        long floor = (long) Math.floor(deltaT);
        int i12 = (int) ((deltaT - floor) * 1.0E9d);
        if (!t11) {
            floor += 63072000;
            fVar = m30.f.POSIX;
        }
        return b0.k0(floor, i12, fVar);
    }

    public c julianDay(int i11) {
        checkYear(i11);
        return c.g(jdEphemerisDays(i11));
    }

    public b onNorthernHemisphere() {
        return this;
    }

    public b onSouthernHemisphere() {
        return values()[(ordinal() + 2) % 4];
    }
}