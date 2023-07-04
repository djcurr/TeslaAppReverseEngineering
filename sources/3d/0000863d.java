package m30;

/* loaded from: classes5.dex */
public enum f {
    POSIX,
    UTC,
    TAI,
    GPS,
    TT,
    UT;

    public static double deltaT(int i11, int i12) {
        if (i12 >= 1 && i12 <= 12) {
            return deltaT(i11, i11 + ((i12 - 0.5d) / 12.0d));
        }
        throw new IllegalArgumentException("Month out of range: " + i12);
    }

    public static double deltaT(net.time4j.base.a aVar) {
        int year = aVar.getYear();
        int i11 = net.time4j.base.b.e(year) ? 366 : 365;
        int i12 = 0;
        int month = aVar.getMonth();
        int i13 = 1;
        for (int i14 = 1; i14 < month; i14++) {
            i12 += net.time4j.base.b.d(year, i14);
        }
        int n11 = i12 + aVar.n();
        if (n11 <= i11) {
            if (year == -2001 && n11 == 365) {
                year = -2000;
            } else {
                i13 = n11;
            }
            return deltaT(year, year + ((i13 - 1.0d) / i11));
        }
        throw new IllegalArgumentException(aVar.toString());
    }

    private static double deltaT(int i11, double d11) {
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
        double d23;
        double d24;
        double d25;
        double d26;
        double d27;
        double d28;
        double d29;
        double d31;
        double d32;
        double d33;
        double d34;
        double d35;
        double d36;
        double d37;
        double d38;
        double d39;
        double d41;
        double d42;
        double d43;
        double d44;
        double d45;
        if (i11 < -2000 || i11 > 3000) {
            throw new IllegalArgumentException("Year out of range: " + i11);
        }
        if (i11 <= 2050) {
            if (i11 < 2018) {
                if (i11 < 2005) {
                    if (i11 >= 1986) {
                        d33 = d11 - 2000.0d;
                        d34 = 63.86d;
                        d35 = 0.3345d;
                        d36 = -0.060374d;
                        d37 = 0.0017275d;
                        d38 = 6.51814E-4d;
                        d39 = 2.373599E-5d * d33;
                    } else if (i11 >= 1961) {
                        d26 = d11 - 1975.0d;
                        d27 = 45.45d;
                        d28 = 1.067d;
                        d45 = 0.0d - (d26 / 718.0d);
                        return (((d45 * d26) + d28) * d26) + d27;
                    } else if (i11 < 1941) {
                        if (i11 >= 1920) {
                            d21 = d11 - 1920.0d;
                            d22 = 21.2d;
                            d23 = 0.84493d;
                            d24 = -0.0761d;
                            d25 = 0.0020936d * d21;
                        } else if (i11 >= 1900) {
                            d21 = d11 - 1900.0d;
                            d22 = -2.79d;
                            d23 = 1.494119d;
                            d24 = -0.0598939d;
                            d25 = (0.0061966d - (1.97E-4d * d21)) * d21;
                        } else if (i11 >= 1860) {
                            d33 = d11 - 1860.0d;
                            d34 = 7.62d;
                            d35 = 0.5737d;
                            d36 = -0.251754d;
                            d37 = 0.01680668d;
                            d38 = -4.473624E-4d;
                            d39 = d33 / 233174.0d;
                        } else if (i11 >= 1800) {
                            double d46 = d11 - 1800.0d;
                            return (((((((((((((8.75E-10d * d46) - 1.699E-7d) * d46) + 1.21272E-5d) * d46) - 3.7436E-4d) * d46) + 0.0041116d) * d46) + 0.0068612d) * d46) - 0.332447d) * d46) + 13.72d;
                        } else if (i11 >= 1700) {
                            d26 = d11 - 1700.0d;
                            d27 = 8.83d;
                            d28 = 0.1603d;
                            d29 = -0.0059285d;
                            d31 = 1.3336E-4d;
                            d32 = d26 / 1174000.0d;
                        } else if (i11 < 1600) {
                            if (i11 >= 500) {
                                d12 = (d11 - 1000.0d) / 100.0d;
                                d13 = 1574.2d;
                                d14 = -556.01d;
                                d15 = 71.23472d;
                                d16 = 0.319781d;
                                d17 = -0.8503463d;
                                d18 = -0.005050998d;
                                d19 = 0.0083572073d;
                            } else if (i11 >= -500) {
                                d12 = d11 / 100.0d;
                                d13 = 10583.6d;
                                d14 = -1014.41d;
                                d15 = 33.78311d;
                                d16 = -5.952053d;
                                d17 = -0.1798452d;
                                d18 = 0.022174192d;
                                d19 = 0.0090316521d;
                            }
                            return (((((((((((d19 * d12) + d18) * d12) + d17) * d12) + d16) * d12) + d15) * d12) + d14) * d12) + d13;
                        } else {
                            d21 = d11 - 1600.0d;
                            d22 = 120.0d;
                            d23 = -0.9808d;
                            d24 = -0.01532d;
                            d25 = d21 / 7129.0d;
                        }
                        return ((((d25 + d24) * d21) + d23) * d21) + d22;
                    } else {
                        d41 = d11 - 1950.0d;
                        d42 = 29.07d;
                        d43 = 0.407d;
                        d44 = ((d41 / 2547.0d) + 0.0d) * d41;
                    }
                    return ((((((((d39 + d38) * d33) + d37) * d33) + d36) * d33) + d35) * d33) + d34;
                }
                d26 = d11 - 2000.0d;
                d27 = 63.5934d;
                d28 = 0.171417d;
                d29 = 0.014201d;
                d31 = -0.00112745d;
                d32 = 4.2060317E-5d * d26;
                d45 = ((d32 + d31) * d26) + d29;
                return (((d45 * d26) + d28) * d26) + d27;
            }
            d41 = d11 - 2000.0d;
            d42 = 64.16d;
            d43 = 0.0533d;
            d44 = 0.012125d * d41;
            return ((d44 + d43) * d41) + d42;
        }
        double d47 = (d11 - 1820.0d) / 100.0d;
        return ((32.0d * d47) * d47) - 20.0d;
    }
}