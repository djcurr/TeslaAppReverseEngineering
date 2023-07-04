package s1;

import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final C1098a f49944a = new C1098a(null);

    /* renamed from: b  reason: collision with root package name */
    private static final long f49945b = b.b(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 2, null);

    /* renamed from: s1.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C1098a {
        private C1098a() {
        }

        public /* synthetic */ C1098a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return a.f49945b;
        }
    }

    public static long b(long j11) {
        return j11;
    }

    public static final boolean c(long j11, long j12) {
        return j11 == j12;
    }

    public static final float d(long j11) {
        kotlin.jvm.internal.l lVar = kotlin.jvm.internal.l.f34915a;
        return Float.intBitsToFloat((int) (j11 >> 32));
    }

    public static final float e(long j11) {
        kotlin.jvm.internal.l lVar = kotlin.jvm.internal.l.f34915a;
        return Float.intBitsToFloat((int) (j11 & 4294967295L));
    }

    public static int f(long j11) {
        return Long.hashCode(j11);
    }

    public static String g(long j11) {
        if (d(j11) == e(j11)) {
            return "CornerRadius.circular(" + c.a(d(j11), 1) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
        return "CornerRadius.elliptical(" + c.a(d(j11), 1) + ", " + c.a(e(j11), 1) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}