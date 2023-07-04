package net.time4j.calendar.astro;

import java.util.concurrent.TimeUnit;
import net.time4j.b0;
import net.time4j.i0;
import org.spongycastle.crypto.tls.CipherSuite;

/* loaded from: classes5.dex */
public enum d {
    NEW_MOON(0),
    FIRST_QUARTER(90),
    FULL_MOON(CipherSuite.TLS_DHE_PSK_WITH_NULL_SHA256),
    LAST_QUARTER(270);
    
    private static final double MEAN_SYNODIC_MONTH = 29.530588861d;
    private final transient int phase;
    private static final int[] FACTORS = {100, 1000, 10000, 100000};
    private static final b0 ZERO_REF = i0.Y(2000, 1, 6, 18, 13, 42).O();
    private static final int[] W_NEW_FULL = {0, 1, 0, 0, 1, 1, 2, 0, 0, 1, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    private static final int[] W_QUARTER = {0, 1, 1, 0, 0, 1, 2, 0, 0, 0, 1, 1, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    private static final int[] X_NEW_FULL = {0, 1, 0, 0, -1, 1, 2, 0, 0, 1, 0, 1, 1, -1, 2, 0, 3, 1, 0, 1, -1, -1, 1, 0};
    private static final int[] X_QUARTER = {0, 1, 1, 0, 0, -1, 2, 0, 0, 0, -1, 1, 1, 2, 1, -1, 0, 1, -2, 1, 3, 0, -1, 1};
    private static final int[] Y_NEW_FULL = {1, 0, 2, 0, 1, 1, 0, 1, 1, 2, 3, 0, 0, 2, 1, 2, 0, 1, 2, 1, 1, 1, 3, 4};
    private static final int[] Y_QUARTER = {1, 0, 1, 2, 0, 1, 0, 1, 1, 3, 2, 0, 0, 1, 2, 1, 2, 1, 1, 1, 0, 2, 1, 3};
    private static final int[] Z_NEW_FULL = {0, 0, 0, 2, 0, 0, 0, -2, 2, 0, 0, 2, -2, 0, 0, -2, 0, -2, 2, 2, 2, -2, 0, 0};
    private static final int[] Z_QUARTER = {0, 0, 0, 0, 2, 0, 0, -2, 2, 0, 0, 2, -2, 0, 0, -2, 2, 2, 0, -2, 0, -2, 2, 0};
    private static final double[] V_NEW = {-0.4072d, 0.17241d, 0.01608d, 0.01039d, 0.00739d, -0.00514d, 0.00208d, -0.00111d, -5.7E-4d, 5.6E-4d, -4.2E-4d, 4.2E-4d, 3.8E-4d, -2.4E-4d, -7.0E-5d, 4.0E-5d, 4.0E-5d, 3.0E-5d, 3.0E-5d, -3.0E-5d, 3.0E-5d, -2.0E-5d, -2.0E-5d, 2.0E-5d};
    private static final double[] V_FULL = {-0.40614d, 0.17302d, 0.01614d, 0.01043d, 0.00734d, -0.00515d, 0.00209d, -0.00111d, -5.7E-4d, 5.6E-4d, -4.2E-4d, 4.2E-4d, 3.8E-4d, -2.4E-4d, -7.0E-5d, 4.0E-5d, 4.0E-5d, 3.0E-5d, 3.0E-5d, -3.0E-5d, 3.0E-5d, -2.0E-5d, -2.0E-5d, 2.0E-5d};
    private static final double[] V_QUARTER = {-0.62801d, 0.17172d, -0.01183d, 0.00862d, 0.00804d, 0.00454d, 0.00204d, -0.0018d, -7.0E-4d, -4.0E-4d, -3.4E-4d, 3.2E-4d, 3.2E-4d, -2.8E-4d, 2.7E-4d, -5.0E-5d, 4.0E-5d, -4.0E-5d, 4.0E-5d, 3.0E-5d, 3.0E-5d, 2.0E-5d, 2.0E-5d, -2.0E-5d};

    d(int i11) {
        this.phase = i11;
    }

    private static double corrQuarter(double d11, double d12, double d13, double d14) {
        return (((0.00306d - ((d11 * 3.8E-4d) * cos(d12))) + (cos(d13) * 2.6E-4d)) - (cos(d13 - d12) * 2.0E-5d)) + (cos(d13 + d12) * 2.0E-5d) + (cos(d14 * 2.0d) * 2.0E-5d);
    }

    private static double cos(double d11) {
        return Math.cos((d11 * 3.141592653589793d) / 180.0d);
    }

    private int getEstimatedLunations(b0 b0Var) {
        return net.time4j.base.c.g(Math.round((ZERO_REF.H(b0Var, TimeUnit.DAYS) / MEAN_SYNODIC_MONTH) - (this.phase / 360.0d)));
    }

    public static double getIllumination(b0 b0Var) {
        return getIllumination(b0Var, 0);
    }

    public static int maxLunation() {
        return 12379;
    }

    public static int minLunation() {
        return -49473;
    }

    private double periodic24(double d11, double d12, double d13, double d14) {
        d dVar = NEW_MOON;
        double[] dArr = this == dVar ? V_NEW : this == FULL_MOON ? V_FULL : V_QUARTER;
        int[] iArr = (this == dVar || this == FULL_MOON) ? W_NEW_FULL : W_QUARTER;
        int[] iArr2 = (this == dVar || this == FULL_MOON) ? X_NEW_FULL : X_QUARTER;
        int[] iArr3 = (this == dVar || this == FULL_MOON) ? Y_NEW_FULL : Y_QUARTER;
        int[] iArr4 = (this == dVar || this == FULL_MOON) ? Z_NEW_FULL : Z_QUARTER;
        double d15 = 0.0d;
        for (int i11 = 23; i11 >= 0; i11--) {
            double d16 = dArr[i11];
            if (iArr[i11] != 1) {
                if (iArr[i11] == 2) {
                    d16 *= d11;
                } else {
                    d15 += d16 * sin((iArr2[i11] * d12) + (iArr3[i11] * d13) + (iArr4[i11] * d14));
                }
            }
            d16 *= d11;
            d15 += d16 * sin((iArr2[i11] * d12) + (iArr3[i11] * d13) + (iArr4[i11] * d14));
        }
        return d15;
    }

    private static double sin(double d11) {
        return Math.sin((d11 * 3.141592653589793d) / 180.0d);
    }

    public b0 after(b0 b0Var) {
        int estimatedLunations = getEstimatedLunations(b0Var);
        b0 atLunation = atLunation(estimatedLunations);
        int i11 = estimatedLunations;
        while (!atLunation.g0(b0Var)) {
            i11++;
            atLunation = atLunation(i11);
        }
        if (i11 <= estimatedLunations) {
            while (true) {
                i11--;
                b0 atLunation2 = atLunation(i11);
                if (!atLunation2.g0(b0Var)) {
                    break;
                }
                atLunation = atLunation2;
            }
        }
        return atLunation;
    }

    public b0 atLunation(int i11) {
        double d11 = i11 + (this.phase / 360.0d);
        double d12 = d11 / 1236.85d;
        double d13 = d12 * d12;
        double d14 = 1.0d - (((7.4E-6d * d12) + 0.002516d) * d12);
        double d15 = ((29.1053567d * d11) + 2.5534d) - (((1.1E-7d * d12) + 1.4E-6d) * d13);
        double d16 = (385.81693528d * d11) + 201.5643d + ((((1.238E-5d - (5.8E-8d * d12)) * d12) + 0.0107582d) * d13);
        double d17 = (390.67050284d * d11) + 160.7108d + (((((1.1E-8d * d12) - 2.27E-6d) * d12) - 0.0016118d) * d13);
        double sin = ((((MEAN_SYNODIC_MONTH * d11) + 2451550.09766d) + (((((7.3E-10d * d12) - 1.5E-7d) * d12) + 1.5437E-4d) * d13)) - (Math.sin(Math.toRadians((124.7746d - (1.56375588d * d11)) + (((2.15E-6d * d12) + 0.0020672d) * d13))) * 1.7E-4d)) + periodic24(d14, d15, d16, d17);
        if (this == FIRST_QUARTER) {
            sin += corrQuarter(d14, d15, d16, d17);
        } else if (this == LAST_QUARTER) {
            sin -= corrQuarter(d14, d15, d16, d17);
        }
        double[] dArr = {((0.107408d * d11) + 299.77d) - (d13 * 0.009173d), 3.25E-4d, (0.016321d * d11) + 251.88d, 1.65E-4d, (26.651886d * d11) + 251.83d, 1.64E-4d, (36.412478d * d11) + 349.42d, 1.26E-4d, (18.206239d * d11) + 84.66d, 1.1E-4d, (53.303771d * d11) + 141.74d, 6.2E-5d, (2.453732d * d11) + 207.14d, 6.0E-5d, (7.30686d * d11) + 154.84d, 5.6E-5d, (27.261239d * d11) + 34.52d, 4.7E-5d, (0.121824d * d11) + 207.19d, 4.2E-5d, (1.844379d * d11) + 291.34d, 4.0E-5d, (24.198154d * d11) + 161.72d, 3.7E-5d, (25.513099d * d11) + 239.56d, 3.5E-5d, (d11 * 3.592518d) + 331.55d, 2.3E-5d};
        for (int i12 = 0; i12 < 28; i12 += 2) {
            sin += dArr[i12 + 1] * Math.sin(Math.toRadians(dArr[i12]));
        }
        return (b0) c.g(sin).i().z(b0.f40824l, TimeUnit.SECONDS);
    }

    public b0 atOrAfter(b0 b0Var) {
        int estimatedLunations = getEstimatedLunations(b0Var);
        b0 atLunation = atLunation(estimatedLunations);
        int i11 = estimatedLunations;
        while (atLunation.h0(b0Var)) {
            i11++;
            atLunation = atLunation(i11);
        }
        if (i11 <= estimatedLunations) {
            while (true) {
                i11--;
                b0 atLunation2 = atLunation(i11);
                if (atLunation2.h0(b0Var)) {
                    break;
                }
                atLunation = atLunation2;
            }
        }
        return atLunation;
    }

    public b0 before(b0 b0Var) {
        int estimatedLunations = getEstimatedLunations(b0Var);
        b0 atLunation = atLunation(estimatedLunations);
        int i11 = estimatedLunations;
        while (!atLunation.h0(b0Var)) {
            i11--;
            atLunation = atLunation(i11);
        }
        if (i11 >= estimatedLunations) {
            while (atLunation.G(29L, TimeUnit.DAYS).h0(b0Var)) {
                i11++;
                b0 atLunation2 = atLunation(i11);
                if (!atLunation2.h0(b0Var)) {
                    break;
                }
                atLunation = atLunation2;
            }
        }
        return atLunation;
    }

    public static double getIllumination(b0 b0Var, int i11) {
        double b11 = c.h(b0Var).b();
        double c11 = e.c(b11);
        double b12 = e.b(b11);
        double a11 = e.a(b11);
        double d11 = c11 * 2.0d;
        double d12 = FACTORS[i11];
        double cos = ((cos(((((((180.0d - c11) - (sin(a11) * 6.289d)) + (sin(b12) * 2.1d)) - (sin(d11 - a11) * 1.274d)) - (sin(d11) * 0.658d)) - (sin(a11 * 2.0d) * 0.214d)) - (sin(c11) * 0.11d)) + 1.0d) / 2.0d) * d12;
        if (d12 - cos <= 0.5d) {
            return 1.0d;
        }
        return Math.floor(cos) / d12;
    }
}