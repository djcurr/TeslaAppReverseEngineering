package x2;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: b  reason: collision with root package name */
    public static final a f56961b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    private static final long f56962c = e(0);

    /* renamed from: d  reason: collision with root package name */
    private static final long f56963d = e(4294967296L);

    /* renamed from: e  reason: collision with root package name */
    private static final long f56964e = e(8589934592L);

    /* renamed from: a  reason: collision with root package name */
    private final long f56965a;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return t.f56964e;
        }

        public final long b() {
            return t.f56963d;
        }

        public final long c() {
            return t.f56962c;
        }
    }

    private /* synthetic */ t(long j11) {
        this.f56965a = j11;
    }

    public static final /* synthetic */ t d(long j11) {
        return new t(j11);
    }

    public static long e(long j11) {
        return j11;
    }

    public static boolean f(long j11, Object obj) {
        return (obj instanceof t) && j11 == ((t) obj).j();
    }

    public static final boolean g(long j11, long j12) {
        return j11 == j12;
    }

    public static int h(long j11) {
        return Long.hashCode(j11);
    }

    public static String i(long j11) {
        return g(j11, f56962c) ? "Unspecified" : g(j11, f56963d) ? "Sp" : g(j11, f56964e) ? "Em" : "Invalid";
    }

    public boolean equals(Object obj) {
        return f(this.f56965a, obj);
    }

    public int hashCode() {
        return h(this.f56965a);
    }

    public final /* synthetic */ long j() {
        return this.f56965a;
    }

    public String toString() {
        return i(this.f56965a);
    }
}