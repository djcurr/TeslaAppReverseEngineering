package x2;

import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: b  reason: collision with root package name */
    public static final a f56947b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    private static final long f56948c = l.a(0, 0);

    /* renamed from: a  reason: collision with root package name */
    private final long f56949a;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return k.f56948c;
        }
    }

    private /* synthetic */ k(long j11) {
        this.f56949a = j11;
    }

    public static final /* synthetic */ k b(long j11) {
        return new k(j11);
    }

    public static long c(long j11) {
        return j11;
    }

    public static final long d(long j11, int i11, int i12) {
        return l.a(i11, i12);
    }

    public static /* synthetic */ long e(long j11, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = h(j11);
        }
        if ((i13 & 2) != 0) {
            i12 = i(j11);
        }
        return d(j11, i11, i12);
    }

    public static boolean f(long j11, Object obj) {
        return (obj instanceof k) && j11 == ((k) obj).l();
    }

    public static final boolean g(long j11, long j12) {
        return j11 == j12;
    }

    public static final int h(long j11) {
        return (int) (j11 >> 32);
    }

    public static final int i(long j11) {
        return (int) (j11 & 4294967295L);
    }

    public static int j(long j11) {
        return Long.hashCode(j11);
    }

    public static String k(long j11) {
        return CoreConstants.LEFT_PARENTHESIS_CHAR + h(j11) + ", " + i(j11) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public boolean equals(Object obj) {
        return f(this.f56949a, obj);
    }

    public int hashCode() {
        return j(this.f56949a);
    }

    public final /* synthetic */ long l() {
        return this.f56949a;
    }

    public String toString() {
        return k(this.f56949a);
    }
}