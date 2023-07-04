package w2;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: b  reason: collision with root package name */
    public static final a f55413b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    private static final int f55414c = g(1);

    /* renamed from: d  reason: collision with root package name */
    private static final int f55415d = g(2);

    /* renamed from: e  reason: collision with root package name */
    private static final int f55416e = g(3);

    /* renamed from: f  reason: collision with root package name */
    private static final int f55417f = g(4);

    /* renamed from: g  reason: collision with root package name */
    private static final int f55418g = g(5);

    /* renamed from: a  reason: collision with root package name */
    private final int f55419a;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return f.f55416e;
        }

        public final int b() {
            return f.f55417f;
        }

        public final int c() {
            return f.f55418g;
        }

        public final int d() {
            return f.f55414c;
        }

        public final int e() {
            return f.f55415d;
        }
    }

    private /* synthetic */ f(int i11) {
        this.f55419a = i11;
    }

    public static final /* synthetic */ f f(int i11) {
        return new f(i11);
    }

    public static int g(int i11) {
        return i11;
    }

    public static boolean h(int i11, Object obj) {
        return (obj instanceof f) && i11 == ((f) obj).l();
    }

    public static final boolean i(int i11, int i12) {
        return i11 == i12;
    }

    public static int j(int i11) {
        return Integer.hashCode(i11);
    }

    public static String k(int i11) {
        return i(i11, f55414c) ? "Ltr" : i(i11, f55415d) ? "Rtl" : i(i11, f55416e) ? "Content" : i(i11, f55417f) ? "ContentOrLtr" : i(i11, f55418g) ? "ContentOrRtl" : "Invalid";
    }

    public boolean equals(Object obj) {
        return h(this.f55419a, obj);
    }

    public int hashCode() {
        return j(this.f55419a);
    }

    public final /* synthetic */ int l() {
        return this.f55419a;
    }

    public String toString() {
        return k(this.f55419a);
    }
}