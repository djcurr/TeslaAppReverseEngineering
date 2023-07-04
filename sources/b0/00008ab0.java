package net.time4j.calendar.astro;

import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.TimeUnit;
import net.time4j.b0;
import net.time4j.engine.z;
import net.time4j.g0;
import net.time4j.tz.k;
import org.spongycastle.crypto.tls.CipherSuite;

/* loaded from: classes5.dex */
public final class g implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    private static final b f40861a;

    /* renamed from: b  reason: collision with root package name */
    private static final ConcurrentMap<String, b> f40862b;
    private static final long serialVersionUID = -4816619838743247977L;
    private final int altitude;
    private final String calculator;
    private final double latitude;
    private final double longitude;
    private final k observerZoneID;

    /* loaded from: classes5.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private double f40863a;

        /* renamed from: b  reason: collision with root package name */
        private double f40864b;

        /* renamed from: c  reason: collision with root package name */
        private int f40865c;

        /* renamed from: d  reason: collision with root package name */
        private String f40866d;

        /* renamed from: e  reason: collision with root package name */
        private k f40867e;

        /* synthetic */ a(f fVar) {
            this();
        }

        private static void c(int i11, int i12, double d11, int i13) {
            if (i11 < 0 || i11 > i13 || (i11 == i13 && i13 != 179 && (i12 > 0 || Double.compare(d11, 0.0d) > 0))) {
                double d12 = i11 + (i12 / 60.0d) + (d11 / 3600.0d);
                throw new IllegalArgumentException("Degrees out of range: " + i11 + " (decimal=" + d12 + ")");
            } else if (i12 >= 0 && i12 < 60) {
                if (!Double.isNaN(d11) && !Double.isInfinite(d11)) {
                    if (Double.compare(d11, 0.0d) < 0 || Double.compare(d11, 60.0d) >= 0) {
                        throw new IllegalArgumentException("Arc seconds out of range: " + d11);
                    }
                    return;
                }
                throw new IllegalArgumentException("Arc seconds must be finite.");
            } else {
                throw new IllegalArgumentException("Arc minutes out of range: " + i12);
            }
        }

        public a a(int i11) {
            double d11 = i11;
            if (Double.isInfinite(d11) || Double.isNaN(d11)) {
                throw new IllegalArgumentException("Altitude must be finite: " + i11);
            } else if (i11 >= 0 && i11 < 11000) {
                this.f40865c = i11;
                return this;
            } else {
                throw new IllegalArgumentException("Meters out of range 0 <= altitude < +11,000: " + i11);
            }
        }

        public g b() {
            if (!Double.isNaN(this.f40863a)) {
                if (!Double.isNaN(this.f40864b)) {
                    return new g(this.f40863a, this.f40864b, this.f40865c, this.f40866d, this.f40867e, null);
                }
                throw new IllegalStateException("Longitude was not yet set.");
            }
            throw new IllegalStateException("Latitude was not yet set.");
        }

        public a d(int i11, int i12, double d11) {
            c(i11, i12, d11, CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA384);
            if (Double.isNaN(this.f40864b)) {
                this.f40864b = i11 + (i12 / 60.0d) + (d11 / 3600.0d);
                return this;
            }
            throw new IllegalStateException("Longitude has already been set.");
        }

        public a e(int i11, int i12, double d11) {
            c(i11, i12, d11, 90);
            if (Double.isNaN(this.f40863a)) {
                this.f40863a = i11 + (i12 / 60.0d) + (d11 / 3600.0d);
                return this;
            }
            throw new IllegalStateException("Latitude has already been set.");
        }

        public a f(b bVar) {
            g.f40862b.putIfAbsent(bVar.name(), bVar);
            this.f40866d = bVar.name();
            return this;
        }

        private a() {
            this.f40863a = Double.NaN;
            this.f40864b = Double.NaN;
            this.f40865c = 0;
            this.f40866d = g.f40861a.name();
            this.f40867e = null;
        }
    }

    /* loaded from: classes5.dex */
    public interface b {
        double equationOfTime(double d11);

        String name();
    }

    static {
        h[] values;
        r0 = null;
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        for (b bVar : net.time4j.base.d.c().g(b.class)) {
            concurrentHashMap.put(bVar.name(), bVar);
        }
        for (h hVar : h.values()) {
            concurrentHashMap.put(hVar.name(), hVar);
        }
        f40862b = concurrentHashMap;
        if (bVar == null) {
            bVar = h.NOAA;
        }
        f40861a = bVar;
        a a11 = f().d(35, 14, 5.0d).e(31, 46, 44.0d).a(721);
        h hVar2 = h.TIME4J;
        a11.f(hVar2).b();
        f().d(39, 49, 34.06d).e(21, 25, 21.22d).a(298).f(hVar2).b();
    }

    /* synthetic */ g(double d11, double d12, int i11, String str, k kVar, f fVar) {
        this(d11, d12, i11, str, kVar);
    }

    private static void c(double d11, double d12, int i11, String str) {
        if (!Double.isNaN(d11) && !Double.isInfinite(d11)) {
            if (!Double.isNaN(d12) && !Double.isInfinite(d12)) {
                if (Double.compare(d11, 90.0d) <= 0 && Double.compare(d11, -90.0d) >= 0) {
                    if (Double.compare(d12, 180.0d) < 0 && Double.compare(d12, -180.0d) >= 0) {
                        double d13 = i11;
                        if (Double.isNaN(d13) || Double.isInfinite(d13)) {
                            throw new IllegalArgumentException("Altitude must be finite: " + i11);
                        } else if (i11 >= 0 && i11 < 11000) {
                            if (!str.isEmpty()) {
                                if (f40862b.containsKey(str)) {
                                    return;
                                }
                                throw new IllegalArgumentException("Unknown calculator: " + str);
                            }
                            throw new IllegalArgumentException("Missing calculator.");
                        } else {
                            throw new IllegalArgumentException("Meters out of range 0 <= altitude < +11,000: " + i11);
                        }
                    }
                    throw new IllegalArgumentException("Degrees out of range -180.0 <= longitude < +180.0: " + d12);
                }
                throw new IllegalArgumentException("Degrees out of range -90.0 <= latitude <= +90.0: " + d11);
            }
            throw new IllegalArgumentException("Longitude must be a finite value: " + d12);
        }
        throw new IllegalArgumentException("Latitude must be a finite value: " + d11);
    }

    private static boolean d(k kVar, k kVar2) {
        if (kVar == null) {
            return kVar2 == null;
        } else if (kVar2 == null) {
            return false;
        } else {
            return kVar.a().equals(kVar2.a());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static b0 e(net.time4j.engine.g gVar, int i11, double d11, String str) {
        double equationOfTime;
        long floor;
        b bVar = f40862b.get(str);
        double b11 = ((gVar.b() * 86400) + (i11 * 3600)) - (d11 * 240.0d);
        long floor2 = (long) Math.floor(b11);
        int i12 = (int) ((b11 - floor2) * 1.0E9d);
        m30.f fVar = m30.f.UT;
        if (!m30.d.p().t()) {
            floor2 += 63072000;
            fVar = m30.f.POSIX;
        }
        b0 k02 = b0.k0(floor2, i12, fVar);
        m30.f fVar2 = m30.f.TT;
        double equationOfTime2 = bVar.equationOfTime(c.e(k02, fVar2));
        long floor3 = (long) Math.floor(equationOfTime2);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        long j11 = (int) ((equationOfTime2 - floor3) * 1.0E9d);
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        return k02.F((long) Math.floor(bVar.equationOfTime(c.e(k02.F(floor3, timeUnit).F(j11, timeUnit2), fVar2))), timeUnit).F((int) ((equationOfTime - floor) * 1.0E9d), timeUnit2);
    }

    public static a f() {
        return new a(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static g0 g(net.time4j.engine.g gVar) {
        if (gVar instanceof g0) {
            return (g0) gVar;
        }
        return g0.V0(gVar.b(), z.UTC);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        c(this.latitude, this.longitude, this.altitude, this.calculator);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            return this.calculator.equals(gVar.calculator) && Double.compare(this.latitude, gVar.latitude) == 0 && Double.compare(this.longitude, gVar.longitude) == 0 && this.altitude == gVar.altitude && d(this.observerZoneID, gVar.observerZoneID);
        }
        return false;
    }

    public int hashCode() {
        return this.calculator.hashCode() + (net.time4j.calendar.astro.a.a(this.latitude) * 7) + (net.time4j.calendar.astro.a.a(this.longitude) * 31) + (this.altitude * 37);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("SolarTime[latitude=");
        sb2.append(this.latitude);
        sb2.append(",longitude=");
        sb2.append(this.longitude);
        if (this.altitude != 0) {
            sb2.append(",altitude=");
            sb2.append(this.altitude);
        }
        if (!this.calculator.equals(f40861a.name())) {
            sb2.append(",calculator=");
            sb2.append(this.calculator);
        }
        if (this.observerZoneID != null) {
            sb2.append(",observerZoneID=");
            sb2.append(this.observerZoneID.a());
        }
        sb2.append(']');
        return sb2.toString();
    }

    private g(double d11, double d12, int i11, String str, k kVar) {
        this.latitude = d11;
        this.longitude = d12;
        this.altitude = i11;
        this.calculator = str;
        this.observerZoneID = kVar;
    }
}