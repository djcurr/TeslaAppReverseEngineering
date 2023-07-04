package u1;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final a f52891a = new a(null);

    /* renamed from: b  reason: collision with root package name */
    private static final long f52892b;

    /* renamed from: c  reason: collision with root package name */
    private static final long f52893c;

    /* renamed from: d  reason: collision with root package name */
    private static final long f52894d;

    /* renamed from: e  reason: collision with root package name */
    private static final long f52895e;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return b.f52894d;
        }

        public final long b() {
            return b.f52892b;
        }

        public final long c() {
            return b.f52893c;
        }
    }

    static {
        long j11 = 3;
        long j12 = j11 << 32;
        f52892b = d((0 & 4294967295L) | j12);
        f52893c = d((1 & 4294967295L) | j12);
        f52894d = d(j12 | (2 & 4294967295L));
        f52895e = d((j11 & 4294967295L) | (4 << 32));
    }

    public static long d(long j11) {
        return j11;
    }

    public static final boolean e(long j11, long j12) {
        return j11 == j12;
    }

    public static final int f(long j11) {
        return (int) (j11 >> 32);
    }

    public static int g(long j11) {
        return Long.hashCode(j11);
    }

    public static String h(long j11) {
        return e(j11, f52892b) ? "Rgb" : e(j11, f52893c) ? "Xyz" : e(j11, f52894d) ? "Lab" : e(j11, f52895e) ? "Cmyk" : "Unknown";
    }
}