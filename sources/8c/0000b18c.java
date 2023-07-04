package s1;

import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: b  reason: collision with root package name */
    public static final a f49969b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    private static final long f49970c = m.a(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);

    /* renamed from: d  reason: collision with root package name */
    private static final long f49971d = m.a(Float.NaN, Float.NaN);

    /* renamed from: a  reason: collision with root package name */
    private final long f49972a;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return l.f49971d;
        }

        public final long b() {
            return l.f49970c;
        }
    }

    private /* synthetic */ l(long j11) {
        this.f49972a = j11;
    }

    public static final /* synthetic */ l c(long j11) {
        return new l(j11);
    }

    public static long d(long j11) {
        return j11;
    }

    public static boolean e(long j11, Object obj) {
        return (obj instanceof l) && j11 == ((l) obj).l();
    }

    public static final boolean f(long j11, long j12) {
        return j11 == j12;
    }

    public static final float g(long j11) {
        if (j11 != f49971d) {
            kotlin.jvm.internal.l lVar = kotlin.jvm.internal.l.f34915a;
            return Float.intBitsToFloat((int) (j11 & 4294967295L));
        }
        throw new IllegalStateException("Size is unspecified".toString());
    }

    public static final float h(long j11) {
        return Math.min(Math.abs(i(j11)), Math.abs(g(j11)));
    }

    public static final float i(long j11) {
        if (j11 != f49971d) {
            kotlin.jvm.internal.l lVar = kotlin.jvm.internal.l.f34915a;
            return Float.intBitsToFloat((int) (j11 >> 32));
        }
        throw new IllegalStateException("Size is unspecified".toString());
    }

    public static int j(long j11) {
        return Long.hashCode(j11);
    }

    public static String k(long j11) {
        if (j11 != f49969b.a()) {
            return "Size(" + c.a(i(j11), 1) + ", " + c.a(g(j11), 1) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
        return "Size.Unspecified";
    }

    public boolean equals(Object obj) {
        return e(this.f49972a, obj);
    }

    public int hashCode() {
        return j(this.f49972a);
    }

    public final /* synthetic */ long l() {
        return this.f49972a;
    }

    public String toString() {
        return k(this.f49972a);
    }
}