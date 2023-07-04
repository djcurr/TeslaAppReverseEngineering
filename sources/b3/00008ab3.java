package net.time4j.calendar.astro;

import java.math.BigDecimal;
import java.util.concurrent.TimeUnit;
import net.time4j.b0;
import net.time4j.calendar.astro.g;
import net.time4j.engine.z;
import net.time4j.g0;
import net.time4j.h0;
import net.time4j.i0;
import net.time4j.tz.p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public abstract class h implements g.b {
    private static final /* synthetic */ h[] $VALUES;
    public static final h CC;
    private static final int[] DG_X;
    private static final double[] DG_Y;
    private static final double[] DG_Z;
    private static final double EQUATORIAL_RADIUS = 6378137.0d;
    private static final int MEAN_EARTH_RADIUS = 6372000;
    public static final h NOAA;
    private static final double POLAR_RADIUS = 6356752.3d;
    public static final h SIMPLE;
    private static final double[][] TABLE_22A;
    public static final h TIME4J;

    /* loaded from: classes5.dex */
    enum a extends h {
        a(String str, int i11) {
            super(str, i11, null);
        }

        private b0 event(net.time4j.engine.g gVar, double d11, double d12, double d13, boolean z11) {
            g0 g11 = g.g(gVar);
            double d14 = d12 / 15.0d;
            double D0 = g11.D0() + (((z11 ? 6 : 18) - d14) / 24.0d);
            double trueLongitudeOfSunInDegrees = trueLongitudeOfSunInDegrees(D0);
            double c11 = net.time4j.calendar.astro.a.c(Math.toDegrees(Math.atan(Math.tan(Math.toRadians(trueLongitudeOfSunInDegrees)) * 0.91764d)));
            double floor = (c11 + ((Math.floor(trueLongitudeOfSunInDegrees / 90.0d) * 90.0d) - (Math.floor(c11 / 90.0d) * 90.0d))) / 15.0d;
            double sin = Math.sin(Math.toRadians(trueLongitudeOfSunInDegrees)) * 0.39782d;
            double cos = Math.cos(Math.asin(sin));
            double radians = Math.toRadians(d11);
            double cos2 = (Math.cos(Math.toRadians(d13)) - (sin * Math.sin(radians))) / (cos * Math.cos(radians));
            if (Double.compare(cos2, 1.0d) > 0 || Double.compare(cos2, -1.0d) < 0) {
                return null;
            }
            double degrees = Math.toDegrees(Math.acos(cos2));
            if (z11) {
                degrees = 360.0d - degrees;
            }
            double d15 = (((degrees / 15.0d) + floor) - (D0 * 0.06571d)) - 6.622d;
            if (Double.compare(0.0d, d15) > 0) {
                d15 += 24.0d;
            } else if (Double.compare(24.0d, d15) <= 0) {
                d15 -= 24.0d;
            }
            long longValue = (((Long) g11.l(z.UTC)).longValue() * 86400) + ((int) Math.floor((d15 - d14) * 3600.0d));
            m30.f fVar = m30.f.UT;
            if (!m30.d.p().t()) {
                longValue += 63072000;
                fVar = m30.f.POSIX;
            }
            return (b0) b0.l0(Math.round(longValue / 60.0d) * 60, fVar).z(b0.f40824l, TimeUnit.MINUTES);
        }

        private double time0(double d11) {
            i0 v02 = net.time4j.calendar.astro.c.g(d11).i().v0(p.f41597k);
            return v02.T().D0() + (((Integer) v02.V().l(h0.E)).intValue() / 86400.0d);
        }

        private double trueLongitudeOfSunInDegrees(double d11) {
            double d12 = (d11 * 0.9856d) - 3.289d;
            return net.time4j.calendar.astro.a.c((Math.sin(Math.toRadians(d12)) * 1.916d) + d12 + (Math.sin(Math.toRadians(d12) * 2.0d) * 0.02d) + 282.634d);
        }

        @Override // net.time4j.calendar.astro.h
        public double declination(double d11) {
            return Math.toDegrees(Math.asin(Math.sin(Math.toRadians(trueLongitudeOfSunInDegrees(time0(d11)))) * 0.39782d));
        }

        @Override // net.time4j.calendar.astro.h, net.time4j.calendar.astro.g.b
        public double equationOfTime(double d11) {
            double time0 = time0(d11);
            return ((Math.sin(Math.toRadians((0.9856d * time0) - 3.8d)) * (-7.66d)) - (Math.sin(Math.toRadians((time0 * 1.9712d) + 17.96d)) * 9.78d)) * 60.0d;
        }

        @Override // net.time4j.calendar.astro.h
        public double getGeodeticAngle(double d11, int i11) {
            return 0.0d;
        }

        @Override // net.time4j.calendar.astro.h
        public double getZenithAngle(double d11, int i11) {
            return getGeodeticAngle(d11, i11) + 90.83333333333333d;
        }

        @Override // net.time4j.calendar.astro.h
        public double rightAscension(double d11) {
            double trueLongitudeOfSunInDegrees = trueLongitudeOfSunInDegrees(time0(d11));
            double c11 = net.time4j.calendar.astro.a.c(Math.toDegrees(Math.atan(Math.tan(Math.toRadians(trueLongitudeOfSunInDegrees)) * 0.91764d)));
            return (c11 + (Math.floor(trueLongitudeOfSunInDegrees / 90.0d) * 90.0d)) - (Math.floor(c11 / 90.0d) * 90.0d);
        }

        @Override // net.time4j.calendar.astro.h
        public b0 sunrise(net.time4j.engine.g gVar, double d11, double d12, double d13) {
            return event(gVar, d11, d12, d13, true);
        }

        @Override // net.time4j.calendar.astro.h
        public b0 sunset(net.time4j.engine.g gVar, double d11, double d12, double d13) {
            return event(gVar, d11, d12, d13, false);
        }
    }

    static {
        a aVar = new a("SIMPLE", 0);
        SIMPLE = aVar;
        h hVar = new h("NOAA", 1) { // from class: net.time4j.calendar.astro.h.b
            private double declinationRad(double d11) {
                return Math.asin(Math.sin(Math.toRadians(obliquity(d11))) * Math.sin(Math.toRadians(solarLongitude(d11))));
            }

            private double equationOfCenter(double d11) {
                double radians = Math.toRadians(meanAnomaly(d11));
                return (Math.sin(radians) * (1.914602d - (((1.4E-5d * d11) + 0.004817d) * d11))) + (Math.sin(2.0d * radians) * (0.019993d - (d11 * 1.01E-4d))) + (Math.sin(radians * 3.0d) * 2.89E-4d);
            }

            private b0 event(boolean z11, net.time4j.engine.g gVar, double d11, double d12, double d13) {
                b0 e11 = g.e(gVar, 12, d12, name());
                double e12 = net.time4j.calendar.astro.c.e(e11, m30.f.TT);
                double localHourAngle = localHourAngle(z11, e12, d11, d13);
                if (Double.isNaN(localHourAngle)) {
                    return null;
                }
                double localHourAngle2 = localHourAngle(z11, e12 + (localHourAngle / 86400.0d), d11, d13);
                if (Double.isNaN(localHourAngle2)) {
                    return null;
                }
                long floor = (long) Math.floor(localHourAngle2);
                TimeUnit timeUnit = TimeUnit.SECONDS;
                return (b0) e11.G(floor, timeUnit).G((int) ((localHourAngle2 - floor) * 1.0E9d), TimeUnit.NANOSECONDS).z(b0.f40824l, timeUnit);
            }

            private double excentricity(double d11) {
                return 0.016708634d - (((1.267E-7d * d11) + 4.2037E-5d) * d11);
            }

            private double localHourAngle(boolean z11, double d11, double d12, double d13) {
                double localHourAngle = localHourAngle(h.toJulianCenturies(d11), d12, d13);
                if (Double.isNaN(localHourAngle)) {
                    return Double.NaN;
                }
                return z11 ? -localHourAngle : localHourAngle;
            }

            private double meanAnomaly(double d11) {
                return ((35999.05029d - (1.537E-4d * d11)) * d11) + 357.52911d;
            }

            private double meanLongitude(double d11) {
                return ((((3.032E-4d * d11) + 36000.76983d) * d11) + 280.46646d) % 360.0d;
            }

            private double obliquity(double d11) {
                return (((((((0.001813d * d11) - 5.9E-4d) * d11) - 46.815d) * d11) + 21.448d) / 3600.0d) + 23.433333333333334d + (Math.cos(Math.toRadians(125.04d - (d11 * 1934.136d))) * 0.00256d);
            }

            private double solarLongitude(double d11) {
                return ((meanLongitude(d11) + equationOfCenter(d11)) - 0.00569d) - (Math.sin(Math.toRadians(125.04d - (d11 * 1934.136d))) * 0.00478d);
            }

            @Override // net.time4j.calendar.astro.h
            public double declination(double d11) {
                return Math.toDegrees(declinationRad(h.toJulianCenturies(d11)));
            }

            @Override // net.time4j.calendar.astro.h, net.time4j.calendar.astro.g.b
            public double equationOfTime(double d11) {
                double julianCenturies = h.toJulianCenturies(d11);
                double tan = Math.tan(Math.toRadians(obliquity(julianCenturies) / 2.0d));
                double d12 = tan * tan;
                double radians = Math.toRadians(meanLongitude(julianCenturies) * 2.0d);
                double excentricity = excentricity(julianCenturies);
                double radians2 = Math.toRadians(meanAnomaly(julianCenturies));
                double sin = Math.sin(radians2);
                return Math.toDegrees(((((Math.sin(radians) * d12) - ((excentricity * 2.0d) * sin)) + ((((excentricity * 4.0d) * d12) * sin) * Math.cos(radians))) - (((d12 * d12) * Math.sin(radians * 2.0d)) / 2.0d)) - ((((5.0d * excentricity) * excentricity) * Math.sin(radians2 * 2.0d)) / 4.0d)) * 240.0d;
            }

            @Override // net.time4j.calendar.astro.h
            public double getGeodeticAngle(double d11, int i11) {
                return 0.0d;
            }

            @Override // net.time4j.calendar.astro.h
            public double getZenithAngle(double d11, int i11) {
                return getGeodeticAngle(d11, i11) + 90.83333333333333d;
            }

            @Override // net.time4j.calendar.astro.h
            public double rightAscension(double d11) {
                double julianCenturies = h.toJulianCenturies(d11);
                double radians = Math.toRadians(solarLongitude(julianCenturies));
                return net.time4j.calendar.astro.a.c(Math.toDegrees(Math.atan2(Math.cos(Math.toRadians(obliquity(julianCenturies))) * Math.sin(radians), Math.cos(radians))));
            }

            @Override // net.time4j.calendar.astro.h
            public b0 sunrise(net.time4j.engine.g gVar, double d11, double d12, double d13) {
                return event(true, gVar, d11, d12, d13);
            }

            @Override // net.time4j.calendar.astro.h
            public b0 sunset(net.time4j.engine.g gVar, double d11, double d12, double d13) {
                return event(false, gVar, d11, d12, d13);
            }

            private double localHourAngle(double d11, double d12, double d13) {
                double radians = Math.toRadians(d12);
                double declinationRad = declinationRad(d11);
                double cos = (Math.cos(Math.toRadians(d13)) - (Math.sin(declinationRad) * Math.sin(radians))) / (Math.cos(declinationRad) * Math.cos(radians));
                if (Double.compare(cos, 1.0d) > 0 || Double.compare(cos, -1.0d) < 0) {
                    return Double.NaN;
                }
                return Math.toDegrees(Math.acos(cos)) * 240.0d;
            }
        };
        NOAA = hVar;
        h hVar2 = new h("CC", 2) { // from class: net.time4j.calendar.astro.h.c
            private double approxMomentOfDepression(double d11, double d12, double d13, double d14, boolean z11) {
                double d15;
                long floor = (long) Math.floor(d11);
                double sineOffset = sineOffset(d11 - d13, d12, d14);
                if (d14 >= 0.0d) {
                    d15 = z11 ? floor : 1 + floor;
                } else {
                    d15 = floor + 0.5d;
                }
                if (Math.abs(sineOffset) > 1.0d) {
                    sineOffset = sineOffset(d15 - d13, d12, d14);
                }
                if (Math.abs(sineOffset) <= 1.0d) {
                    double degrees = ((z11 ? -1 : 1) * ((((Math.toDegrees(Math.asin(sineOffset)) / 360.0d) + 0.5d) % 1.0d) - 0.25d)) + floor + 0.5d;
                    return degrees - (equationOfTime(degrees - d13) / 86400.0d);
                }
                return Double.NaN;
            }

            private double declinationRad(double d11) {
                return Math.asin(Math.sin(Math.toRadians(obliquity(d11))) * Math.sin(Math.toRadians(h.apparentSolarLongitude(d11, nutation(d11)))));
            }

            private b0 event(boolean z11, net.time4j.engine.g gVar, double d11, double d12, double d13) {
                double transform = z.JULIAN_DAY_NUMBER.transform(gVar.b(), z.UTC) + (z11 ? 0.25d : 0.75d);
                double k11 = (p.b(new BigDecimal(d12)).k() - (m30.f.deltaT(g.g(gVar)) - 43200.0d)) / 86400.0d;
                double momentOfDepression = momentOfDepression(transform, d11, k11, d13 - 90.0d, z11);
                if (Double.isNaN(momentOfDepression)) {
                    return null;
                }
                return (b0) net.time4j.calendar.astro.c.g(momentOfDepression - k11).i().z(b0.f40824l, TimeUnit.SECONDS);
            }

            private double excentricity(double d11) {
                return 0.016708617d - (((1.236E-7d * d11) + 4.2037E-5d) * d11);
            }

            private double meanAnomaly(double d11) {
                return (((((4.8E-7d * d11) - 1.559E-4d) * d11) + 35999.0503d) * d11) + 357.5291d;
            }

            private double meanLongitude(double d11) {
                return ((((3.032E-4d * d11) + 36000.76983d) * d11) + 280.46645d) % 360.0d;
            }

            private double momentOfDepression(double d11, double d12, double d13, double d14, boolean z11) {
                double approxMomentOfDepression = approxMomentOfDepression(d11, d12, d13, d14, z11);
                if (Double.isNaN(approxMomentOfDepression)) {
                    return Double.NaN;
                }
                return Math.abs(d11 - approxMomentOfDepression) * 86400.0d < 30.0d ? approxMomentOfDepression : momentOfDepression(approxMomentOfDepression, d12, d13, d14, z11);
            }

            private double nutation(double d11) {
                return (Math.sin(Math.toRadians((((0.002063d * d11) - 1934.134d) * d11) + 124.9d)) * (-0.004778d)) - (Math.sin(Math.toRadians((((5.7E-4d * d11) + 72001.5377d) * d11) + 201.11d)) * 3.667E-4d);
            }

            private double obliquity(double d11) {
                return (((((((0.001813d * d11) - 5.9E-4d) * d11) - 46.815d) * d11) + 21.448d) / 3600.0d) + 23.433333333333334d;
            }

            private double sineOffset(double d11, double d12, double d13) {
                double julianCenturies = h.toJulianCenturies(d11);
                double radians = Math.toRadians(d12);
                double declinationRad = declinationRad(julianCenturies);
                return (Math.tan(radians) * Math.tan(declinationRad)) + (Math.sin(Math.toRadians(d13)) / (Math.cos(declinationRad) * Math.cos(radians)));
            }

            @Override // net.time4j.calendar.astro.h
            public double declination(double d11) {
                return getFeature(d11, "declination");
            }

            @Override // net.time4j.calendar.astro.h, net.time4j.calendar.astro.g.b
            public double equationOfTime(double d11) {
                double julianCenturies = h.toJulianCenturies(d11);
                double tan = Math.tan(Math.toRadians(obliquity(julianCenturies) / 2.0d));
                double d12 = tan * tan;
                double radians = Math.toRadians(meanLongitude(julianCenturies) * 2.0d);
                double excentricity = excentricity(julianCenturies);
                double radians2 = Math.toRadians(meanAnomaly(julianCenturies));
                double sin = Math.sin(radians2);
                return Math.toDegrees(((((Math.sin(radians) * d12) - ((excentricity * 2.0d) * sin)) + ((((excentricity * 4.0d) * d12) * sin) * Math.cos(radians))) - (((d12 * d12) * Math.sin(radians * 2.0d)) / 2.0d)) - ((((5.0d * excentricity) * excentricity) * Math.sin(radians2 * 2.0d)) / 4.0d)) * 240.0d;
            }

            @Override // net.time4j.calendar.astro.h
            public double getFeature(double d11, String str) {
                double julianCenturies = h.toJulianCenturies(d11);
                if (str.equals("declination")) {
                    return Math.toDegrees(declinationRad(julianCenturies));
                }
                if (str.equals("right-ascension")) {
                    double radians = Math.toRadians(h.apparentSolarLongitude(julianCenturies, nutation(julianCenturies)));
                    return net.time4j.calendar.astro.a.c(Math.toDegrees(Math.atan2(Math.cos(Math.toRadians(obliquity(julianCenturies))) * Math.sin(radians), Math.cos(radians))));
                } else if (str.equals("nutation")) {
                    return nutation(julianCenturies);
                } else {
                    if (str.equals("obliquity")) {
                        return obliquity(julianCenturies);
                    }
                    if (str.equals("mean-anomaly")) {
                        return meanAnomaly(julianCenturies);
                    }
                    if (str.equals("solar-longitude")) {
                        return h.apparentSolarLongitude(julianCenturies, nutation(julianCenturies));
                    }
                    return str.equals("solar-latitude") ? 0.0d : Double.NaN;
                }
            }

            @Override // net.time4j.calendar.astro.h
            public double getGeodeticAngle(double d11, int i11) {
                if (i11 == 0) {
                    return 0.0d;
                }
                double d12 = i11;
                return Math.toDegrees(Math.acos(6372000.0d / (d12 + 6372000.0d))) + (Math.sqrt(d12) * 0.005277777777777778d);
            }

            @Override // net.time4j.calendar.astro.h
            public double getZenithAngle(double d11, int i11) {
                return getGeodeticAngle(d11, i11) + 90.83333333333333d;
            }

            @Override // net.time4j.calendar.astro.h
            public double rightAscension(double d11) {
                return getFeature(d11, "right-ascension");
            }

            @Override // net.time4j.calendar.astro.h
            public b0 sunrise(net.time4j.engine.g gVar, double d11, double d12, double d13) {
                return event(true, gVar, d11, d12, d13);
            }

            @Override // net.time4j.calendar.astro.h
            public b0 sunset(net.time4j.engine.g gVar, double d11, double d12, double d13) {
                return event(false, gVar, d11, d12, d13);
            }
        };
        CC = hVar2;
        h hVar3 = new h("TIME4J", 3) { // from class: net.time4j.calendar.astro.h.d
            private double declinationRad(double d11) {
                double[] dArr = new double[2];
                h.nutations(d11, dArr);
                return Math.asin(Math.sin(Math.toRadians(h.meanObliquity(d11) + dArr[1])) * Math.sin(Math.toRadians(h.apparentSolarLongitude(d11, dArr[0]))));
            }

            private b0 event(boolean z11, net.time4j.engine.g gVar, double d11, double d12, double d13) {
                b0 e11 = g.e(gVar, 12, d12, name());
                double e12 = net.time4j.calendar.astro.c.e(e11, m30.f.TT);
                double d14 = 0.0d;
                while (true) {
                    double localHourAngle = localHourAngle(z11, e12 + (d14 / 86400.0d), d11, d13);
                    if (Double.isNaN(localHourAngle)) {
                        return null;
                    }
                    if (Math.abs(localHourAngle - d14) < 15.0d) {
                        long floor = (long) Math.floor(localHourAngle);
                        TimeUnit timeUnit = TimeUnit.SECONDS;
                        return (b0) e11.G(floor, timeUnit).G((int) ((localHourAngle - floor) * 1.0E9d), TimeUnit.NANOSECONDS).z(b0.f40824l, timeUnit);
                    }
                    d14 = localHourAngle;
                }
            }

            private double excentricity(double d11) {
                return 0.016708634d - (((1.267E-7d * d11) + 4.2037E-5d) * d11);
            }

            private double localHourAngle(boolean z11, double d11, double d12, double d13) {
                double julianCenturies = h.toJulianCenturies(d11);
                double radians = Math.toRadians(d12);
                double declinationRad = declinationRad(julianCenturies);
                double cos = (Math.cos(Math.toRadians(d13)) - (Math.sin(declinationRad) * Math.sin(radians))) / (Math.cos(declinationRad) * Math.cos(radians));
                if (Double.compare(cos, 1.0d) > 0 || Double.compare(cos, -1.0d) < 0) {
                    return Double.NaN;
                }
                double degrees = Math.toDegrees(Math.acos(cos)) * 240.0d;
                return z11 ? -degrees : degrees;
            }

            private double meanAnomaly(double d11) {
                return ((35999.05029d - (1.537E-4d * d11)) * d11) + 357.52911d;
            }

            private double meanLongitude(double d11) {
                return ((((3.032E-4d * d11) + 36000.76983d) * d11) + 280.46646d) % 360.0d;
            }

            private double trueObliquity(double d11) {
                return h.meanObliquity(d11) + (Math.cos(Math.toRadians(125.04d - (d11 * 1934.136d))) * 0.00256d);
            }

            @Override // net.time4j.calendar.astro.h
            public double declination(double d11) {
                return getFeature(d11, "declination");
            }

            @Override // net.time4j.calendar.astro.h, net.time4j.calendar.astro.g.b
            public double equationOfTime(double d11) {
                double julianCenturies = h.toJulianCenturies(d11);
                double tan = Math.tan(Math.toRadians(trueObliquity(julianCenturies) / 2.0d));
                double d12 = tan * tan;
                double radians = Math.toRadians(meanLongitude(julianCenturies) * 2.0d);
                double excentricity = excentricity(julianCenturies);
                double radians2 = Math.toRadians(meanAnomaly(julianCenturies));
                double sin = Math.sin(radians2);
                return Math.toDegrees(((((Math.sin(radians) * d12) - ((excentricity * 2.0d) * sin)) + ((((excentricity * 4.0d) * d12) * sin) * Math.cos(radians))) - (((d12 * d12) * Math.sin(radians * 2.0d)) / 2.0d)) - ((((5.0d * excentricity) * excentricity) * Math.sin(radians2 * 2.0d)) / 4.0d)) * 240.0d;
            }

            @Override // net.time4j.calendar.astro.h
            public double getFeature(double d11, String str) {
                double julianCenturies = h.toJulianCenturies(d11);
                if (str.equals("declination")) {
                    return Math.toDegrees(declinationRad(julianCenturies));
                }
                if (str.equals("right-ascension")) {
                    double[] dArr = new double[2];
                    h.nutations(julianCenturies, dArr);
                    double radians = Math.toRadians(h.apparentSolarLongitude(julianCenturies, dArr[0]));
                    return net.time4j.calendar.astro.a.c(Math.toDegrees(Math.atan2(Math.cos(Math.toRadians(h.meanObliquity(julianCenturies) + dArr[1])) * Math.sin(radians), Math.cos(radians))));
                } else if (str.equals("nutation")) {
                    double[] dArr2 = new double[2];
                    h.nutations(julianCenturies, dArr2);
                    return dArr2[0];
                } else if (str.equals("obliquity")) {
                    double[] dArr3 = new double[2];
                    h.nutations(julianCenturies, dArr3);
                    return h.meanObliquity(julianCenturies) + dArr3[1];
                } else if (str.equals("mean-anomaly")) {
                    return meanAnomaly(julianCenturies);
                } else {
                    if (!str.equals("solar-longitude")) {
                        return str.equals("solar-latitude") ? 0.0d : Double.NaN;
                    }
                    double[] dArr4 = new double[2];
                    h.nutations(julianCenturies, dArr4);
                    return h.apparentSolarLongitude(julianCenturies, dArr4[0]);
                }
            }

            @Override // net.time4j.calendar.astro.h
            public double getGeodeticAngle(double d11, int i11) {
                if (i11 == 0) {
                    return 0.0d;
                }
                double radians = Math.toRadians(d11);
                double cos = Math.cos(radians) * h.EQUATORIAL_RADIUS;
                double sin = Math.sin(radians) * h.POLAR_RADIUS;
                double sqrt = 4.0680631590769E13d / Math.sqrt((cos * cos) + (sin * sin));
                return Math.toDegrees(Math.acos(sqrt / (i11 + sqrt)));
            }

            @Override // net.time4j.calendar.astro.h
            public double getZenithAngle(double d11, int i11) {
                if (i11 == 0) {
                    return 90.83333333333333d;
                }
                return getGeodeticAngle(d11, i11) + 90.0d + (((net.time4j.calendar.astro.a.b(i11) * 34.0d) + 16.0d) / 60.0d);
            }

            @Override // net.time4j.calendar.astro.h
            public double rightAscension(double d11) {
                return getFeature(d11, "right-ascension");
            }

            @Override // net.time4j.calendar.astro.h
            public b0 sunrise(net.time4j.engine.g gVar, double d11, double d12, double d13) {
                return event(true, gVar, d11, d12, d13);
            }

            @Override // net.time4j.calendar.astro.h
            public b0 sunset(net.time4j.engine.g gVar, double d11, double d12, double d13) {
                return event(false, gVar, d11, d12, d13);
            }
        };
        TIME4J = hVar3;
        $VALUES = new h[]{aVar, hVar, hVar2, hVar3};
        DG_X = new int[]{403406, 195207, 119433, 112392, 3891, 2819, 1721, 660, 350, 334, 314, 268, 242, 234, 158, 132, com.plaid.internal.d.SDK_ASSET_ILLUSTRATION_FORM_VALUE, 114, 99, 93, 86, 78, 72, 68, 64, 46, 38, 37, 32, 29, 28, 27, 27, 25, 24, 21, 21, 20, 18, 17, 14, 13, 13, 13, 12, 10, 10, 10, 10};
        DG_Y = new double[]{270.54861d, 340.19128d, 63.91854d, 331.2622d, 317.843d, 86.631d, 240.052d, 310.26d, 247.23d, 260.87d, 297.82d, 343.14d, 166.79d, 81.53d, 3.5d, 132.75d, 182.95d, 162.03d, 29.8d, 266.4d, 249.2d, 157.6d, 257.8d, 185.1d, 69.9d, 8.0d, 197.1d, 250.4d, 65.3d, 162.7d, 341.5d, 291.6d, 98.5d, 146.7d, 110.0d, 5.2d, 342.6d, 230.9d, 256.1d, 45.3d, 242.9d, 115.2d, 151.8d, 285.3d, 53.3d, 126.6d, 205.7d, 85.9d, 146.1d};
        DG_Z = new double[]{0.9287892d, 35999.1376958d, 35999.4089666d, 35998.7287385d, 71998.20261d, 71998.4403d, 36000.35726d, 71997.4812d, 32964.4678d, -19.441d, 445267.1117d, 45036.884d, 3.1008d, 22518.4434d, -19.9739d, 65928.9345d, 9038.0293d, 3034.7684d, 33718.148d, 3034.448d, -2280.773d, 29929.992d, 31556.493d, 149.588d, 9037.75d, 107997.405d, -4444.176d, 151.771d, 67555.316d, 31556.08d, -4561.54d, 107996.706d, 1221.655d, 62894.167d, 31437.369d, 14578.298d, -31931.757d, 34777.243d, 1221.999d, 62894.511d, -4442.039d, 107997.909d, 119.066d, 16859.071d, -4.578d, 26895.292d, -39.127d, 12297.536d, 90073.778d};
        TABLE_22A = new double[][]{new double[]{0.0d, 0.0d, 0.0d, 0.0d, 1.0d, -171996.0d, -174.2d, 92025.0d, 8.9d}, new double[]{-2.0d, 0.0d, 0.0d, 2.0d, 2.0d, -13187.0d, -1.6d, 5736.0d, -3.1d}, new double[]{0.0d, 0.0d, 0.0d, 2.0d, 2.0d, -2274.0d, -0.2d, 977.0d, -0.5d}, new double[]{0.0d, 0.0d, 0.0d, 0.0d, 2.0d, 2062.0d, 0.2d, -895.0d, 0.5d}, new double[]{0.0d, 1.0d, 0.0d, 0.0d, 0.0d, 1426.0d, -3.4d, 54.0d, -0.1d}, new double[]{0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 712.0d, 0.1d, -7.0d, 0.0d}, new double[]{-2.0d, 1.0d, 0.0d, 2.0d, 2.0d, -517.0d, 1.2d, 224.0d, -0.6d}, new double[]{0.0d, 0.0d, 0.0d, 2.0d, 1.0d, -386.0d, -0.4d, 200.0d, 0.0d}, new double[]{0.0d, 0.0d, 1.0d, 2.0d, 2.0d, -301.0d, 0.0d, 129.0d, -0.1d}, new double[]{-2.0d, -1.0d, 0.0d, 2.0d, 2.0d, 217.0d, -0.5d, -95.0d, 0.3d}, new double[]{-2.0d, 0.0d, 1.0d, 0.0d, 0.0d, -158.0d, 0.0d, 0.0d, 0.0d}, new double[]{-2.0d, 0.0d, 0.0d, 2.0d, 1.0d, 129.0d, 0.1d, -70.0d, 0.0d}, new double[]{0.0d, 0.0d, -1.0d, 2.0d, 2.0d, 123.0d, 0.0d, -53.0d, 0.0d}, new double[]{2.0d, 0.0d, 0.0d, 0.0d, 0.0d, 63.0d, 0.0d, 0.0d, 0.0d}, new double[]{0.0d, 0.0d, 1.0d, 0.0d, 1.0d, 63.0d, 0.1d, -33.0d, 0.0d}, new double[]{2.0d, 0.0d, -1.0d, 2.0d, 2.0d, -59.0d, 0.0d, 26.0d, 0.0d}, new double[]{0.0d, 0.0d, -1.0d, 0.0d, 1.0d, -58.0d, -0.1d, 32.0d, 0.0d}, new double[]{0.0d, 0.0d, 1.0d, 2.0d, 1.0d, -51.0d, 0.0d, 27.0d, 0.0d}, new double[]{-2.0d, 0.0d, 2.0d, 0.0d, 0.0d, 48.0d, 0.0d, 0.0d, 0.0d}, new double[]{0.0d, 0.0d, -2.0d, 2.0d, 1.0d, 46.0d, 0.0d, -24.0d, 0.0d}, new double[]{2.0d, 0.0d, 0.0d, 2.0d, 2.0d, -38.0d, 0.0d, 16.0d, 0.0d}, new double[]{0.0d, 0.0d, 2.0d, 2.0d, 2.0d, -31.0d, 0.0d, 13.0d, 0.0d}, new double[]{0.0d, 0.0d, 2.0d, 0.0d, 0.0d, 29.0d, 0.0d, 0.0d, 0.0d}, new double[]{-2.0d, 0.0d, 1.0d, 2.0d, 2.0d, 29.0d, 0.0d, -12.0d, 0.0d}, new double[]{0.0d, 0.0d, 0.0d, 2.0d, 0.0d, 26.0d, 0.0d, 0.0d, 0.0d}, new double[]{-2.0d, 0.0d, 0.0d, 2.0d, 0.0d, -22.0d, 0.0d, 0.0d, 0.0d}, new double[]{0.0d, 0.0d, -1.0d, 2.0d, 1.0d, 21.0d, 0.0d, -10.0d, 0.0d}, new double[]{0.0d, 2.0d, 0.0d, 0.0d, 0.0d, 17.0d, -0.1d, 0.0d, 0.0d}, new double[]{2.0d, 0.0d, -1.0d, 0.0d, 1.0d, 16.0d, 0.0d, -8.0d, 0.0d}, new double[]{-2.0d, 2.0d, 0.0d, 2.0d, 2.0d, -16.0d, 0.1d, 7.0d, 0.0d}, new double[]{0.0d, 1.0d, 0.0d, 0.0d, 1.0d, -15.0d, 0.0d, 9.0d, 0.0d}, new double[]{-2.0d, 0.0d, 1.0d, 0.0d, 1.0d, -13.0d, 0.0d, 7.0d, 0.0d}, new double[]{0.0d, -1.0d, 0.0d, 0.0d, 1.0d, -12.0d, 0.0d, 6.0d, 0.0d}, new double[]{0.0d, 0.0d, 2.0d, -2.0d, 0.0d, 11.0d, 0.0d, 0.0d, 0.0d}, new double[]{2.0d, 0.0d, -1.0d, 2.0d, 1.0d, -10.0d, 0.0d, 5.0d, 0.0d}, new double[]{2.0d, 0.0d, 1.0d, 2.0d, 2.0d, -8.0d, 0.0d, 3.0d, 0.0d}, new double[]{0.0d, 1.0d, 0.0d, 2.0d, 2.0d, 7.0d, 0.0d, -3.0d, 0.0d}, new double[]{-2.0d, 1.0d, 1.0d, 0.0d, 0.0d, -7.0d, 0.0d, 0.0d, 0.0d}, new double[]{0.0d, -1.0d, 0.0d, 2.0d, 2.0d, -7.0d, 0.0d, 3.0d, 0.0d}, new double[]{2.0d, 0.0d, 0.0d, 2.0d, 1.0d, -7.0d, 0.0d, 3.0d, 0.0d}, new double[]{2.0d, 0.0d, 1.0d, 0.0d, 0.0d, 6.0d, 0.0d, 0.0d, 0.0d}, new double[]{-2.0d, 0.0d, 2.0d, 2.0d, 2.0d, 6.0d, 0.0d, -3.0d, 0.0d}, new double[]{-2.0d, 0.0d, 1.0d, 2.0d, 1.0d, 6.0d, 0.0d, -3.0d, 0.0d}, new double[]{2.0d, 0.0d, -2.0d, 0.0d, 1.0d, -6.0d, 0.0d, 3.0d, 0.0d}, new double[]{2.0d, 0.0d, 0.0d, 0.0d, 1.0d, -6.0d, 0.0d, 3.0d, 0.0d}, new double[]{0.0d, -1.0d, 1.0d, 0.0d, 0.0d, 5.0d, 0.0d, 0.0d, 0.0d}, new double[]{-2.0d, -1.0d, 0.0d, 2.0d, 1.0d, -5.0d, 0.0d, 3.0d, 0.0d}, new double[]{-2.0d, 0.0d, 0.0d, 0.0d, 1.0d, -5.0d, 0.0d, 3.0d, 0.0d}, new double[]{0.0d, 0.0d, 2.0d, 2.0d, 1.0d, -5.0d, 0.0d, 3.0d, 0.0d}, new double[]{-2.0d, 0.0d, 2.0d, 0.0d, 1.0d, 4.0d, 0.0d, 0.0d, 0.0d}, new double[]{-2.0d, 1.0d, 0.0d, 2.0d, 1.0d, 4.0d, 0.0d, 0.0d, 0.0d}, new double[]{0.0d, 0.0d, 1.0d, -2.0d, 0.0d, 4.0d, 0.0d, 0.0d, 0.0d}, new double[]{-1.0d, 0.0d, 1.0d, 0.0d, 0.0d, -4.0d, 0.0d, 0.0d, 0.0d}, new double[]{-2.0d, 1.0d, 0.0d, 0.0d, 0.0d, -4.0d, 0.0d, 0.0d, 0.0d}, new double[]{1.0d, 0.0d, 0.0d, 0.0d, 0.0d, -4.0d, 0.0d, 0.0d, 0.0d}, new double[]{0.0d, 0.0d, 1.0d, 2.0d, 0.0d, 3.0d, 0.0d, 0.0d, 0.0d}, new double[]{0.0d, 0.0d, -2.0d, 2.0d, 2.0d, -3.0d, 0.0d, 0.0d, 0.0d}, new double[]{-1.0d, -1.0d, 1.0d, 0.0d, 0.0d, -3.0d, 0.0d, 0.0d, 0.0d}, new double[]{0.0d, 1.0d, 1.0d, 0.0d, 0.0d, -3.0d, 0.0d, 0.0d, 0.0d}, new double[]{0.0d, -1.0d, 1.0d, 2.0d, 2.0d, -3.0d, 0.0d, 0.0d, 0.0d}, new double[]{2.0d, -1.0d, -1.0d, 2.0d, 2.0d, -3.0d, 0.0d, 0.0d, 0.0d}, new double[]{0.0d, 0.0d, 3.0d, 2.0d, 2.0d, -3.0d, 0.0d, 0.0d, 0.0d}, new double[]{2.0d, -1.0d, 0.0d, 2.0d, 2.0d, -3.0d, 0.0d, 0.0d, 0.0d}};
    }

    private h(String str, int i11) {
    }

    private static double aberration(double d11) {
        return (Math.cos(Math.toRadians((d11 * 35999.01848d) + 177.63d)) * 9.74E-5d) - 0.005575d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static double apparentSolarLongitude(double d11, double d12) {
        double d13 = 0.0d;
        for (int length = DG_X.length - 1; length >= 0; length--) {
            d13 += DG_X[length] * Math.sin(Math.toRadians(DG_Y[length] + (DG_Z[length] * d11)));
        }
        double aberration = (((((36000.76953744d * d11) + 282.7771834d) + ((d13 * 5.729577951308232d) / 1000000.0d)) + aberration(d11)) + d12) / 360.0d;
        return (aberration - Math.floor(aberration)) * 360.0d;
    }

    static double meanObliquity(double d11) {
        return (((((((0.001813d * d11) - 5.9E-4d) * d11) - 46.815d) * d11) + 21.448d) / 3600.0d) + 23.433333333333334d;
    }

    static void nutations(double d11, double[] dArr) {
        double radians = Math.toRadians((((((5.277768981496142E-6d * d11) - 0.0019142d) * d11) + 445267.11148d) * d11) + 297.85036d);
        double radians2 = Math.toRadians(((((((-3.3333333333333333E-6d) * d11) - 1.603E-4d) * d11) + 35999.05034d) * d11) + 357.52772d);
        double radians3 = Math.toRadians((((((1.7777777777777779E-4d * d11) + 0.0086972d) * d11) + 477198.867398d) * d11) + 134.96298d);
        double radians4 = Math.toRadians((((((3.0555810187307116E-6d * d11) - 0.0036825d) * d11) + 483202.017538d) * d11) + 93.27191d);
        double radians5 = Math.toRadians((((((2.222222222222222E-6d * d11) + 0.0020708d) * d11) - 1934.136261d) * d11) + 125.04452d);
        double d12 = 0.0d;
        double d13 = 0.0d;
        for (int length = TABLE_22A.length - 1; length >= 0; length--) {
            double[] dArr2 = TABLE_22A[length];
            double d14 = (dArr2[0] * radians) + (dArr2[1] * radians2) + (dArr2[2] * radians3) + (dArr2[3] * radians4) + (dArr2[4] * radians5);
            d12 += Math.sin(d14) * (dArr2[5] + (dArr2[6] * d11));
            d13 += Math.cos(d14) * (dArr2[7] + (dArr2[8] * d11));
        }
        dArr[0] = (d12 * 1.0E-4d) / 3600.0d;
        dArr[1] = (d13 * 1.0E-4d) / 3600.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static double toJulianCenturies(double d11) {
        return (d11 - 2451545.0d) / 36525.0d;
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) $VALUES.clone();
    }

    public double declination(double d11) {
        throw new AbstractMethodError();
    }

    @Override // net.time4j.calendar.astro.g.b
    public abstract /* synthetic */ double equationOfTime(double d11);

    public double getFeature(double d11, String str) {
        if (str.equals("declination")) {
            return declination(d11);
        }
        if (str.equals("right-ascension")) {
            return rightAscension(d11);
        }
        return Double.NaN;
    }

    public abstract /* synthetic */ double getGeodeticAngle(double d11, int i11);

    public abstract /* synthetic */ double getZenithAngle(double d11, int i11);

    public double rightAscension(double d11) {
        throw new AbstractMethodError();
    }

    public abstract /* synthetic */ b0 sunrise(net.time4j.engine.g gVar, double d11, double d12, double d13);

    public abstract /* synthetic */ b0 sunset(net.time4j.engine.g gVar, double d11, double d12, double d13);

    /* synthetic */ h(String str, int i11, a aVar) {
        this(str, i11);
    }
}