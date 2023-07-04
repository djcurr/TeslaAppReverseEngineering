package x2;

import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: b  reason: collision with root package name */
    public static final a f56966b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    private static final long f56967c = v.a(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);

    /* renamed from: a  reason: collision with root package name */
    private final long f56968a;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return u.f56967c;
        }
    }

    private /* synthetic */ u(long j11) {
        this.f56968a = j11;
    }

    public static final /* synthetic */ u b(long j11) {
        return new u(j11);
    }

    public static long c(long j11) {
        return j11;
    }

    public static final long d(long j11, float f11, float f12) {
        return v.a(f11, f12);
    }

    public static /* synthetic */ long e(long j11, float f11, float f12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = h(j11);
        }
        if ((i11 & 2) != 0) {
            f12 = i(j11);
        }
        return d(j11, f11, f12);
    }

    public static boolean f(long j11, Object obj) {
        return (obj instanceof u) && j11 == ((u) obj).n();
    }

    public static final boolean g(long j11, long j12) {
        return j11 == j12;
    }

    public static final float h(long j11) {
        kotlin.jvm.internal.l lVar = kotlin.jvm.internal.l.f34915a;
        return Float.intBitsToFloat((int) (j11 >> 32));
    }

    public static final float i(long j11) {
        kotlin.jvm.internal.l lVar = kotlin.jvm.internal.l.f34915a;
        return Float.intBitsToFloat((int) (j11 & 4294967295L));
    }

    public static int j(long j11) {
        return Long.hashCode(j11);
    }

    public static final long k(long j11, long j12) {
        return v.a(h(j11) - h(j12), i(j11) - i(j12));
    }

    public static final long l(long j11, long j12) {
        return v.a(h(j11) + h(j12), i(j11) + i(j12));
    }

    public static String m(long j11) {
        return CoreConstants.LEFT_PARENTHESIS_CHAR + h(j11) + ", " + i(j11) + ") px/sec";
    }

    public boolean equals(Object obj) {
        return f(this.f56968a, obj);
    }

    public int hashCode() {
        return j(this.f56968a);
    }

    public final /* synthetic */ long n() {
        return this.f56968a;
    }

    public String toString() {
        return m(this.f56968a);
    }
}