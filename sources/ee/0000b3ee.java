package t1;

import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.internal.ws.WebSocketProtocol;

/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f51365b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    private static final long f51366c = c0.c(4278190080L);

    /* renamed from: d  reason: collision with root package name */
    private static final long f51367d = c0.c(4282664004L);

    /* renamed from: e  reason: collision with root package name */
    private static final long f51368e;

    /* renamed from: f  reason: collision with root package name */
    private static final long f51369f;

    /* renamed from: g  reason: collision with root package name */
    private static final long f51370g;

    /* renamed from: h  reason: collision with root package name */
    private static final long f51371h;

    /* renamed from: i  reason: collision with root package name */
    private static final long f51372i;

    /* renamed from: a  reason: collision with root package name */
    private final long f51373a;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return a0.f51366c;
        }

        public final long b() {
            return a0.f51370g;
        }

        public final long c() {
            return a0.f51367d;
        }

        public final long d() {
            return a0.f51369f;
        }

        public final long e() {
            return a0.f51371h;
        }

        public final long f() {
            return a0.f51372i;
        }

        public final long g() {
            return a0.f51368e;
        }
    }

    static {
        c0.c(4287137928L);
        c0.c(4291611852L);
        f51368e = c0.c(4294967295L);
        f51369f = c0.c(4294901760L);
        c0.c(4278255360L);
        f51370g = c0.c(4278190335L);
        c0.c(4294967040L);
        c0.c(4278255615L);
        c0.c(4294902015L);
        f51371h = c0.b(0);
        f51372i = c0.a(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, u1.e.f52899a.u());
    }

    private /* synthetic */ a0(long j11) {
        this.f51373a = j11;
    }

    public static final /* synthetic */ a0 h(long j11) {
        return new a0(j11);
    }

    public static long i(long j11) {
        return j11;
    }

    public static final long j(long j11, u1.c colorSpace) {
        kotlin.jvm.internal.s.g(colorSpace, "colorSpace");
        if (kotlin.jvm.internal.s.c(colorSpace, q(j11))) {
            return j11;
        }
        u1.f i11 = u1.d.i(q(j11), colorSpace, 0, 2, null);
        float[] d11 = c0.d(j11);
        i11.a(d11);
        return c0.a(d11[0], d11[1], d11[2], d11[3], colorSpace);
    }

    public static final long k(long j11, float f11, float f12, float f13, float f14) {
        return c0.a(f12, f13, f14, f11, q(j11));
    }

    public static /* synthetic */ long l(long j11, float f11, float f12, float f13, float f14, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = o(j11);
        }
        float f15 = f11;
        if ((i11 & 2) != 0) {
            f12 = s(j11);
        }
        float f16 = f12;
        if ((i11 & 4) != 0) {
            f13 = r(j11);
        }
        float f17 = f13;
        if ((i11 & 8) != 0) {
            f14 = p(j11);
        }
        return k(j11, f15, f16, f17, f14);
    }

    public static boolean m(long j11, Object obj) {
        return (obj instanceof a0) && j11 == ((a0) obj).v();
    }

    public static final boolean n(long j11, long j12) {
        return j11 == j12;
    }

    public static final float o(long j11) {
        float e11;
        float f11;
        if (vz.y.b(63 & j11) == 0) {
            e11 = (float) vz.d0.e(vz.y.b(vz.y.b(j11 >>> 56) & 255));
            f11 = 255.0f;
        } else {
            e11 = (float) vz.d0.e(vz.y.b(vz.y.b(j11 >>> 6) & 1023));
            f11 = 1023.0f;
        }
        return e11 / f11;
    }

    public static final float p(long j11) {
        if (vz.y.b(63 & j11) == 0) {
            return ((float) vz.d0.e(vz.y.b(vz.y.b(j11 >>> 32) & 255))) / 255.0f;
        }
        return e0.c(e0.b((short) vz.y.b(vz.y.b(j11 >>> 16) & WebSocketProtocol.PAYLOAD_SHORT_MAX)));
    }

    public static final u1.c q(long j11) {
        return u1.e.f52899a.h()[(int) vz.y.b(j11 & 63)];
    }

    public static final float r(long j11) {
        if (vz.y.b(63 & j11) == 0) {
            return ((float) vz.d0.e(vz.y.b(vz.y.b(j11 >>> 40) & 255))) / 255.0f;
        }
        return e0.c(e0.b((short) vz.y.b(vz.y.b(j11 >>> 32) & WebSocketProtocol.PAYLOAD_SHORT_MAX)));
    }

    public static final float s(long j11) {
        if (vz.y.b(63 & j11) == 0) {
            return ((float) vz.d0.e(vz.y.b(vz.y.b(j11 >>> 48) & 255))) / 255.0f;
        }
        return e0.c(e0.b((short) vz.y.b(vz.y.b(j11 >>> 48) & WebSocketProtocol.PAYLOAD_SHORT_MAX)));
    }

    public static int t(long j11) {
        return vz.y.d(j11);
    }

    public static String u(long j11) {
        return "Color(" + s(j11) + ", " + r(j11) + ", " + p(j11) + ", " + o(j11) + ", " + q(j11).g() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public boolean equals(Object obj) {
        return m(this.f51373a, obj);
    }

    public int hashCode() {
        return t(this.f51373a);
    }

    public String toString() {
        return u(this.f51373a);
    }

    public final /* synthetic */ long v() {
        return this.f51373a;
    }
}