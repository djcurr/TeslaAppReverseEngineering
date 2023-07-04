package t1;

import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class h1 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f51446b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    private static final long f51447c = i1.a(0.5f, 0.5f);

    /* renamed from: a  reason: collision with root package name */
    private final long f51448a;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return h1.f51447c;
        }
    }

    private /* synthetic */ h1(long j11) {
        this.f51448a = j11;
    }

    public static final /* synthetic */ h1 b(long j11) {
        return new h1(j11);
    }

    public static long c(long j11) {
        return j11;
    }

    public static boolean d(long j11, Object obj) {
        return (obj instanceof h1) && j11 == ((h1) obj).j();
    }

    public static final boolean e(long j11, long j12) {
        return j11 == j12;
    }

    public static final float f(long j11) {
        kotlin.jvm.internal.l lVar = kotlin.jvm.internal.l.f34915a;
        return Float.intBitsToFloat((int) (j11 >> 32));
    }

    public static final float g(long j11) {
        kotlin.jvm.internal.l lVar = kotlin.jvm.internal.l.f34915a;
        return Float.intBitsToFloat((int) (j11 & 4294967295L));
    }

    public static int h(long j11) {
        return Long.hashCode(j11);
    }

    public static String i(long j11) {
        return "TransformOrigin(packedValue=" + j11 + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public boolean equals(Object obj) {
        return d(this.f51448a, obj);
    }

    public int hashCode() {
        return h(this.f51448a);
    }

    public final /* synthetic */ long j() {
        return this.f51448a;
    }

    public String toString() {
        return i(this.f51448a);
    }
}