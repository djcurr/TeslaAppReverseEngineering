package x2;

import kotlin.jvm.internal.DefaultConstructorMarker;
import x2.t;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: b  reason: collision with root package name */
    public static final a f56957b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    private static final t[] f56958c;

    /* renamed from: d  reason: collision with root package name */
    private static final long f56959d;

    /* renamed from: a  reason: collision with root package name */
    private final long f56960a;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return r.f56959d;
        }
    }

    static {
        t.a aVar = t.f56961b;
        f56958c = new t[]{t.d(aVar.c()), t.d(aVar.b()), t.d(aVar.a())};
        f56959d = s.i(0L, Float.NaN);
    }

    private /* synthetic */ r(long j11) {
        this.f56960a = j11;
    }

    public static final /* synthetic */ r b(long j11) {
        return new r(j11);
    }

    public static long c(long j11) {
        return j11;
    }

    public static boolean d(long j11, Object obj) {
        return (obj instanceof r) && j11 == ((r) obj).k();
    }

    public static final boolean e(long j11, long j12) {
        return j11 == j12;
    }

    public static final long f(long j11) {
        return j11 & 1095216660480L;
    }

    public static final long g(long j11) {
        return f56958c[(int) (f(j11) >>> 32)].j();
    }

    public static final float h(long j11) {
        kotlin.jvm.internal.l lVar = kotlin.jvm.internal.l.f34915a;
        return Float.intBitsToFloat((int) (j11 & 4294967295L));
    }

    public static int i(long j11) {
        return Long.hashCode(j11);
    }

    public static String j(long j11) {
        long g11 = g(j11);
        t.a aVar = t.f56961b;
        if (t.g(g11, aVar.c())) {
            return "Unspecified";
        }
        if (t.g(g11, aVar.b())) {
            return h(j11) + ".sp";
        } else if (t.g(g11, aVar.a())) {
            return h(j11) + ".em";
        } else {
            return "Invalid";
        }
    }

    public boolean equals(Object obj) {
        return d(this.f56960a, obj);
    }

    public int hashCode() {
        return i(this.f56960a);
    }

    public final /* synthetic */ long k() {
        return this.f56960a;
    }

    public String toString() {
        return j(this.f56960a);
    }
}