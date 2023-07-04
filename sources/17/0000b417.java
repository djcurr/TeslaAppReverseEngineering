package t1;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class i0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f51451b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    private static final int f51452c = g(0);

    /* renamed from: d  reason: collision with root package name */
    private static final int f51453d = g(1);

    /* renamed from: e  reason: collision with root package name */
    private static final int f51454e = g(2);

    /* renamed from: f  reason: collision with root package name */
    private static final int f51455f = g(3);

    /* renamed from: g  reason: collision with root package name */
    private static final int f51456g = g(4);

    /* renamed from: a  reason: collision with root package name */
    private final int f51457a;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return i0.f51453d;
        }

        public final int b() {
            return i0.f51452c;
        }

        public final int c() {
            return i0.f51455f;
        }

        public final int d() {
            return i0.f51456g;
        }

        public final int e() {
            return i0.f51454e;
        }
    }

    private /* synthetic */ i0(int i11) {
        this.f51457a = i11;
    }

    public static final /* synthetic */ i0 f(int i11) {
        return new i0(i11);
    }

    public static int g(int i11) {
        return i11;
    }

    public static boolean h(int i11, Object obj) {
        return (obj instanceof i0) && i11 == ((i0) obj).l();
    }

    public static final boolean i(int i11, int i12) {
        return i11 == i12;
    }

    public static int j(int i11) {
        return Integer.hashCode(i11);
    }

    public static String k(int i11) {
        return i(i11, f51452c) ? "Argb8888" : i(i11, f51453d) ? "Alpha8" : i(i11, f51454e) ? "Rgb565" : i(i11, f51455f) ? "F16" : i(i11, f51456g) ? "Gpu" : "Unknown";
    }

    public boolean equals(Object obj) {
        return h(this.f51457a, obj);
    }

    public int hashCode() {
        return j(this.f51457a);
    }

    public final /* synthetic */ int l() {
        return this.f51457a;
    }

    public String toString() {
        return k(this.f51457a);
    }
}