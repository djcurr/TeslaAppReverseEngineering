package a0;

import android.location.Location;
import androidx.camera.core.n0;
import ezvcard.property.Gender;
import java.io.File;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import org.spongycastle.crypto.tls.CipherSuite;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: c  reason: collision with root package name */
    private static final String f50c = "c";

    /* renamed from: d  reason: collision with root package name */
    private static final ThreadLocal<SimpleDateFormat> f51d = new a();

    /* renamed from: e  reason: collision with root package name */
    private static final ThreadLocal<SimpleDateFormat> f52e = new b();

    /* renamed from: f  reason: collision with root package name */
    private static final ThreadLocal<SimpleDateFormat> f53f = new C0003c();

    /* renamed from: a  reason: collision with root package name */
    private final androidx.exifinterface.media.a f54a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f55b = false;

    /* loaded from: classes.dex */
    class a extends ThreadLocal<SimpleDateFormat> {
        a() {
        }

        @Override // java.lang.ThreadLocal
        /* renamed from: a */
        public SimpleDateFormat initialValue() {
            return new SimpleDateFormat("yyyy:MM:dd", Locale.US);
        }
    }

    /* loaded from: classes.dex */
    class b extends ThreadLocal<SimpleDateFormat> {
        b() {
        }

        @Override // java.lang.ThreadLocal
        /* renamed from: a */
        public SimpleDateFormat initialValue() {
            return new SimpleDateFormat("HH:mm:ss", Locale.US);
        }
    }

    /* renamed from: a0.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class C0003c extends ThreadLocal<SimpleDateFormat> {
        C0003c() {
        }

        @Override // java.lang.ThreadLocal
        /* renamed from: a */
        public SimpleDateFormat initialValue() {
            return new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", Locale.US);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class d {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public static final class a {

            /* renamed from: a  reason: collision with root package name */
            final double f56a;

            a(double d11) {
                this.f56a = d11;
            }

            double a() {
                return this.f56a / 2.23694d;
            }
        }

        static a a(double d11) {
            return new a(d11 * 0.621371d);
        }

        static a b(double d11) {
            return new a(d11 * 1.15078d);
        }

        static a c(double d11) {
            return new a(d11);
        }
    }

    private c(androidx.exifinterface.media.a aVar) {
        this.f54a = aVar;
    }

    private void a() {
        long currentTimeMillis = System.currentTimeMillis();
        String g11 = g(currentTimeMillis);
        this.f54a.d0("DateTime", g11);
        try {
            this.f54a.d0("SubSecTime", Long.toString(currentTimeMillis - e(g11).getTime()));
        } catch (ParseException unused) {
        }
    }

    private static Date d(String str) {
        return f51d.get().parse(str);
    }

    private static Date e(String str) {
        return f53f.get().parse(str);
    }

    private static Date f(String str) {
        return f52e.get().parse(str);
    }

    private static String g(long j11) {
        return f53f.get().format(new Date(j11));
    }

    public static c h(File file) {
        return i(file.toString());
    }

    public static c i(String str) {
        return new c(new androidx.exifinterface.media.a(str));
    }

    public static c j(InputStream inputStream) {
        return new c(new androidx.exifinterface.media.a(inputStream));
    }

    private long v(String str) {
        if (str == null) {
            return -1L;
        }
        try {
            return e(str).getTime();
        } catch (ParseException unused) {
            return -1L;
        }
    }

    private long w(String str, String str2) {
        if (str == null && str2 == null) {
            return -1L;
        }
        if (str2 == null) {
            try {
                return d(str).getTime();
            } catch (ParseException unused) {
                return -1L;
            }
        } else if (str == null) {
            try {
                return f(str2).getTime();
            } catch (ParseException unused2) {
                return -1L;
            }
        } else {
            return v(str + " " + str2);
        }
    }

    public void b(Location location) {
        this.f54a.e0(location);
    }

    public void c() {
        long currentTimeMillis = System.currentTimeMillis();
        String g11 = g(currentTimeMillis);
        this.f54a.d0("DateTimeOriginal", g11);
        this.f54a.d0("DateTimeDigitized", g11);
        try {
            String l11 = Long.toString(currentTimeMillis - e(g11).getTime());
            this.f54a.d0("SubSecTimeOriginal", l11);
            this.f54a.d0("SubSecTimeDigitized", l11);
        } catch (ParseException unused) {
        }
        this.f55b = false;
    }

    public void k() {
        int i11;
        switch (p()) {
            case 2:
                i11 = 1;
                break;
            case 3:
                i11 = 4;
                break;
            case 4:
                i11 = 3;
                break;
            case 5:
                i11 = 6;
                break;
            case 6:
                i11 = 5;
                break;
            case 7:
                i11 = 8;
                break;
            case 8:
                i11 = 7;
                break;
            default:
                i11 = 2;
                break;
        }
        this.f54a.d0("Orientation", String.valueOf(i11));
    }

    public void l() {
        int i11;
        switch (p()) {
            case 2:
                i11 = 3;
                break;
            case 3:
                i11 = 2;
                break;
            case 4:
                i11 = 1;
                break;
            case 5:
                i11 = 8;
                break;
            case 6:
                i11 = 7;
                break;
            case 7:
                i11 = 6;
                break;
            case 8:
                i11 = 5;
                break;
            default:
                i11 = 4;
                break;
        }
        this.f54a.d0("Orientation", String.valueOf(i11));
    }

    public String m() {
        return this.f54a.g("ImageDescription");
    }

    public int n() {
        return this.f54a.i("ImageLength", 0);
    }

    public Location o() {
        double a11;
        String g11 = this.f54a.g("GPSProcessingMethod");
        double[] m11 = this.f54a.m();
        double f11 = this.f54a.f(0.0d);
        double h11 = this.f54a.h("GPSSpeed", 0.0d);
        String g12 = this.f54a.g("GPSSpeedRef");
        if (g12 == null) {
            g12 = "K";
        }
        long w11 = w(this.f54a.g("GPSDateStamp"), this.f54a.g("GPSTimeStamp"));
        if (m11 == null) {
            return null;
        }
        if (g11 == null) {
            g11 = f50c;
        }
        Location location = new Location(g11);
        location.setLatitude(m11[0]);
        location.setLongitude(m11[1]);
        if (f11 != 0.0d) {
            location.setAltitude(f11);
        }
        if (h11 != 0.0d) {
            char c11 = 65535;
            int hashCode = g12.hashCode();
            if (hashCode != 75) {
                if (hashCode != 77) {
                    if (hashCode == 78 && g12.equals(Gender.NONE)) {
                        c11 = 1;
                    }
                } else if (g12.equals(Gender.MALE)) {
                    c11 = 0;
                }
            } else if (g12.equals("K")) {
                c11 = 2;
            }
            if (c11 == 0) {
                a11 = d.c(h11).a();
            } else if (c11 != 1) {
                a11 = d.a(h11).a();
            } else {
                a11 = d.b(h11).a();
            }
            location.setSpeed((float) a11);
        }
        if (w11 != -1) {
            location.setTime(w11);
        }
        return location;
    }

    public int p() {
        return this.f54a.i("Orientation", 0);
    }

    public int q() {
        switch (p()) {
            case 3:
            case 4:
                return CipherSuite.TLS_DHE_PSK_WITH_NULL_SHA256;
            case 5:
                return 270;
            case 6:
            case 7:
                return 90;
            case 8:
                return 270;
            default:
                return 0;
        }
    }

    public long r() {
        long v11 = v(this.f54a.g("DateTimeOriginal"));
        if (v11 == -1) {
            return -1L;
        }
        String g11 = this.f54a.g("SubSecTimeOriginal");
        if (g11 != null) {
            try {
                long parseLong = Long.parseLong(g11);
                while (parseLong > 1000) {
                    parseLong /= 10;
                }
                return v11 + parseLong;
            } catch (NumberFormatException unused) {
                return v11;
            }
        }
        return v11;
    }

    public int s() {
        return this.f54a.i("ImageWidth", 0);
    }

    public boolean t() {
        return p() == 2;
    }

    public String toString() {
        return String.format(Locale.ENGLISH, "Exif{width=%s, height=%s, rotation=%d, isFlippedVertically=%s, isFlippedHorizontally=%s, location=%s, timestamp=%s, description=%s}", Integer.valueOf(s()), Integer.valueOf(n()), Integer.valueOf(q()), Boolean.valueOf(u()), Boolean.valueOf(t()), o(), Long.valueOf(r()), m());
    }

    public boolean u() {
        int p11 = p();
        return p11 == 4 || p11 == 5 || p11 == 7;
    }

    public void x(int i11) {
        if (i11 % 90 != 0) {
            n0.m(f50c, String.format(Locale.US, "Can only rotate in right angles (eg. 0, 90, 180, 270). %d is unsupported.", Integer.valueOf(i11)));
            this.f54a.d0("Orientation", String.valueOf(0));
            return;
        }
        int i12 = i11 % 360;
        int p11 = p();
        while (i12 < 0) {
            i12 += 90;
            switch (p11) {
                case 2:
                    p11 = 5;
                    break;
                case 3:
                case 8:
                    p11 = 6;
                    break;
                case 4:
                    p11 = 7;
                    break;
                case 5:
                    p11 = 4;
                    break;
                case 6:
                    p11 = 1;
                    break;
                case 7:
                    p11 = 2;
                    break;
                default:
                    p11 = 8;
                    break;
            }
        }
        while (i12 > 0) {
            i12 -= 90;
            switch (p11) {
                case 2:
                    p11 = 7;
                    break;
                case 3:
                    p11 = 8;
                    break;
                case 4:
                    p11 = 5;
                    break;
                case 5:
                    p11 = 2;
                    break;
                case 6:
                    p11 = 3;
                    break;
                case 7:
                    p11 = 4;
                    break;
                case 8:
                    p11 = 1;
                    break;
                default:
                    p11 = 6;
                    break;
            }
        }
        this.f54a.d0("Orientation", String.valueOf(p11));
    }

    public void y() {
        if (!this.f55b) {
            a();
        }
        this.f54a.Y();
    }

    public void z(int i11) {
        this.f54a.d0("Orientation", String.valueOf(i11));
    }
}