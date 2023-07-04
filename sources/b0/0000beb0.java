package x2;

import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.DefaultConstructorMarker;
import x2.g;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: b  reason: collision with root package name */
    public static final a f56941b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    private static final long f56942c;

    /* renamed from: a  reason: collision with root package name */
    private final long f56943a;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return i.f56942c;
        }
    }

    static {
        float f11 = 0;
        h.a(g.f(f11), g.f(f11));
        g.a aVar = g.f56937b;
        f56942c = h.a(aVar.b(), aVar.b());
    }

    private /* synthetic */ i(long j11) {
        this.f56943a = j11;
    }

    public static final /* synthetic */ i b(long j11) {
        return new i(j11);
    }

    public static long c(long j11) {
        return j11;
    }

    public static boolean d(long j11, Object obj) {
        return (obj instanceof i) && j11 == ((i) obj).j();
    }

    public static final boolean e(long j11, long j12) {
        return j11 == j12;
    }

    public static final float f(long j11) {
        if (j11 != f56942c) {
            kotlin.jvm.internal.l lVar = kotlin.jvm.internal.l.f34915a;
            return g.f(Float.intBitsToFloat((int) (j11 >> 32)));
        }
        throw new IllegalStateException("DpOffset is unspecified".toString());
    }

    public static final float g(long j11) {
        if (j11 != f56942c) {
            kotlin.jvm.internal.l lVar = kotlin.jvm.internal.l.f34915a;
            return g.f(Float.intBitsToFloat((int) (j11 & 4294967295L)));
        }
        throw new IllegalStateException("DpOffset is unspecified".toString());
    }

    public static int h(long j11) {
        return Long.hashCode(j11);
    }

    public static String i(long j11) {
        if (j11 != f56941b.a()) {
            return CoreConstants.LEFT_PARENTHESIS_CHAR + ((Object) g.k(f(j11))) + ", " + ((Object) g.k(g(j11))) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
        return "DpOffset.Unspecified";
    }

    public boolean equals(Object obj) {
        return d(this.f56943a, obj);
    }

    public int hashCode() {
        return h(this.f56943a);
    }

    public final /* synthetic */ long j() {
        return this.f56943a;
    }

    public String toString() {
        return i(this.f56943a);
    }
}