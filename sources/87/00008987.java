package n2;

import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: b  reason: collision with root package name */
    public static final a f40417b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    private static final long f40418c = z.a(0);

    /* renamed from: a  reason: collision with root package name */
    private final long f40419a;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return y.f40418c;
        }
    }

    private /* synthetic */ y(long j11) {
        this.f40419a = j11;
    }

    public static final /* synthetic */ y b(long j11) {
        return new y(j11);
    }

    public static long c(long j11) {
        return j11;
    }

    public static final boolean d(long j11, long j12) {
        return l(j11) <= l(j12) && k(j12) <= k(j11);
    }

    public static final boolean e(long j11, int i11) {
        return i11 < k(j11) && l(j11) <= i11;
    }

    public static boolean f(long j11, Object obj) {
        return (obj instanceof y) && j11 == ((y) obj).r();
    }

    public static final boolean g(long j11, long j12) {
        return j11 == j12;
    }

    public static final boolean h(long j11) {
        return n(j11) == i(j11);
    }

    public static final int i(long j11) {
        return (int) (j11 & 4294967295L);
    }

    public static final int j(long j11) {
        return k(j11) - l(j11);
    }

    public static final int k(long j11) {
        return n(j11) > i(j11) ? n(j11) : i(j11);
    }

    public static final int l(long j11) {
        return n(j11) > i(j11) ? i(j11) : n(j11);
    }

    public static final boolean m(long j11) {
        return n(j11) > i(j11);
    }

    public static final int n(long j11) {
        return (int) (j11 >> 32);
    }

    public static int o(long j11) {
        return Long.hashCode(j11);
    }

    public static final boolean p(long j11, long j12) {
        return l(j11) < k(j12) && l(j12) < k(j11);
    }

    public static String q(long j11) {
        return "TextRange(" + n(j11) + ", " + i(j11) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public boolean equals(Object obj) {
        return f(this.f40419a, obj);
    }

    public int hashCode() {
        return o(this.f40419a);
    }

    public final /* synthetic */ long r() {
        return this.f40419a;
    }

    public String toString() {
        return q(this.f40419a);
    }
}