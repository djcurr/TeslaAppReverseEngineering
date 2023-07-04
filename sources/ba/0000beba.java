package x2;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: b  reason: collision with root package name */
    public static final a f56954b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    private static final long f56955c = c(0);

    /* renamed from: a  reason: collision with root package name */
    private final long f56956a;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return o.f56955c;
        }
    }

    private /* synthetic */ o(long j11) {
        this.f56956a = j11;
    }

    public static final /* synthetic */ o b(long j11) {
        return new o(j11);
    }

    public static long c(long j11) {
        return j11;
    }

    public static boolean d(long j11, Object obj) {
        return (obj instanceof o) && j11 == ((o) obj).j();
    }

    public static final boolean e(long j11, long j12) {
        return j11 == j12;
    }

    public static final int f(long j11) {
        return (int) (j11 & 4294967295L);
    }

    public static final int g(long j11) {
        return (int) (j11 >> 32);
    }

    public static int h(long j11) {
        return Long.hashCode(j11);
    }

    public static String i(long j11) {
        return g(j11) + " x " + f(j11);
    }

    public boolean equals(Object obj) {
        return d(this.f56956a, obj);
    }

    public int hashCode() {
        return h(this.f56956a);
    }

    public final /* synthetic */ long j() {
        return this.f56956a;
    }

    public String toString() {
        return i(this.f56956a);
    }
}