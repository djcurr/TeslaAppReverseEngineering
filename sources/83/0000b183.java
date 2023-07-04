package s1;

import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: b  reason: collision with root package name */
    public static final a f49950b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    private static final long f49951c = g.a(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);

    /* renamed from: d  reason: collision with root package name */
    private static final long f49952d = g.a(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* renamed from: e  reason: collision with root package name */
    private static final long f49953e = g.a(Float.NaN, Float.NaN);

    /* renamed from: a  reason: collision with root package name */
    private final long f49954a;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return f.f49952d;
        }

        public final long b() {
            return f.f49953e;
        }

        public final long c() {
            return f.f49951c;
        }
    }

    private /* synthetic */ f(long j11) {
        this.f49954a = j11;
    }

    public static final /* synthetic */ f d(long j11) {
        return new f(j11);
    }

    public static final float e(long j11) {
        return l(j11);
    }

    public static final float f(long j11) {
        return m(j11);
    }

    public static long g(long j11) {
        return j11;
    }

    public static final long h(long j11, float f11) {
        return g.a(l(j11) / f11, m(j11) / f11);
    }

    public static boolean i(long j11, Object obj) {
        return (obj instanceof f) && j11 == ((f) obj).t();
    }

    public static final boolean j(long j11, long j12) {
        return j11 == j12;
    }

    public static final float k(long j11) {
        return (float) Math.sqrt((l(j11) * l(j11)) + (m(j11) * m(j11)));
    }

    public static final float l(long j11) {
        if (j11 != f49953e) {
            kotlin.jvm.internal.l lVar = kotlin.jvm.internal.l.f34915a;
            return Float.intBitsToFloat((int) (j11 >> 32));
        }
        throw new IllegalStateException("Offset is unspecified".toString());
    }

    public static final float m(long j11) {
        if (j11 != f49953e) {
            kotlin.jvm.internal.l lVar = kotlin.jvm.internal.l.f34915a;
            return Float.intBitsToFloat((int) (j11 & 4294967295L));
        }
        throw new IllegalStateException("Offset is unspecified".toString());
    }

    public static int n(long j11) {
        return Long.hashCode(j11);
    }

    public static final boolean o(long j11) {
        if ((Float.isNaN(l(j11)) || Float.isNaN(m(j11))) ? false : true) {
            return true;
        }
        throw new IllegalStateException("Offset argument contained a NaN value.".toString());
    }

    public static final long p(long j11, long j12) {
        return g.a(l(j11) - l(j12), m(j11) - m(j12));
    }

    public static final long q(long j11, long j12) {
        return g.a(l(j11) + l(j12), m(j11) + m(j12));
    }

    public static final long r(long j11, float f11) {
        return g.a(l(j11) * f11, m(j11) * f11);
    }

    public static String s(long j11) {
        if (g.c(j11)) {
            return "Offset(" + c.a(l(j11), 1) + ", " + c.a(m(j11), 1) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
        return "Offset.Unspecified";
    }

    public boolean equals(Object obj) {
        return i(this.f49954a, obj);
    }

    public int hashCode() {
        return n(this.f49954a);
    }

    public final /* synthetic */ long t() {
        return this.f49954a;
    }

    public String toString() {
        return s(this.f49954a);
    }
}